/* Auto-generated by genmsg_cpp for file /opt/ros/groovy/stacks/ias_common/vision_srvs/srv/cop_add_collision.srv */

package ros.pkg.vision_srvs.srv;

import java.nio.ByteBuffer;


public class cop_add_collision extends ros.communication.Service<cop_add_collision.Request, cop_add_collision.Response> {

  public static java.lang.String __s_getDataType() { return "vision_srvs/cop_add_collision"; }
  public static java.lang.String __s_getMD5Sum() { return "119055ba7d9102720f55afbcc4f26f14"; }

  public java.lang.String getDataType() { return cop_add_collision.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return cop_add_collision.__s_getMD5Sum(); }

  public cop_add_collision.Request createRequest() {
    return new cop_add_collision.Request();
  }

  public cop_add_collision.Response createResponse() {
    return new cop_add_collision.Response();
  }

static public class Request extends ros.communication.Message {

  public long object_id;

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "vision_srvs/cop_add_collisionRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "039cdc2e4e021929b349f87d86d0ea70"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "119055ba7d9102720f55afbcc4f26f14"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "\n" +
"\n" +
"uint64 object_id\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Request clone() {
    Request c = new Request();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 8; // object_id
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putLong(object_id);
  }

  public void deserialize(ByteBuffer bb) {
    object_id = bb.getLong();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      object_id == other.object_id &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (int)(this.object_id ^ (this.object_id >>> 32));
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {

  public java.lang.String collisionname = new java.lang.String();
  public ros.pkg.arm_navigation_msgs.msg.CollisionObject added_object = new ros.pkg.arm_navigation_msgs.msg.CollisionObject();

  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "vision_srvs/cop_add_collisionResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "66d3c9bb4e74eca84445fb8e469ca2cb"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "119055ba7d9102720f55afbcc4f26f14"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string   collisionname\n" +
"arm_navigation_msgs/CollisionObject added_object\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/CollisionObject\n" +
"# a header, used for interpreting the poses\n" +
"Header header\n" +
"\n" +
"# the id of the object\n" +
"string id\n" +
"\n" +
"# The padding used for filtering points near the object.\n" +
"# This does not affect collision checking for the object.  \n" +
"# Set to negative to get zero padding.\n" +
"float32 padding\n" +
"\n" +
"#This contains what is to be done with the object\n" +
"CollisionObjectOperation operation\n" +
"\n" +
"#the shapes associated with the object\n" +
"arm_navigation_msgs/Shape[] shapes\n" +
"\n" +
"#the poses associated with the shapes - will be transformed using the header\n" +
"geometry_msgs/Pose[] poses\n" +
"\n" +
"================================================================================\n" +
"MSG: std_msgs/Header\n" +
"# Standard metadata for higher-level stamped data types.\n" +
"# This is generally used to communicate timestamped data \n" +
"# in a particular coordinate frame.\n" +
"# \n" +
"# sequence ID: consecutively increasing ID \n" +
"uint32 seq\n" +
"#Two-integer timestamp that is expressed as:\n" +
"# * stamp.secs: seconds (stamp_secs) since epoch\n" +
"# * stamp.nsecs: nanoseconds since stamp_secs\n" +
"# time-handling sugar is provided by the client library\n" +
"time stamp\n" +
"#Frame this data is associated with\n" +
"# 0: no frame\n" +
"# 1: global frame\n" +
"string frame_id\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/CollisionObjectOperation\n" +
"#Puts the object into the environment\n" +
"#or updates the object if already added\n" +
"byte ADD=0\n" +
"\n" +
"#Removes the object from the environment entirely\n" +
"byte REMOVE=1\n" +
"\n" +
"#Only valid within the context of a CollisionAttachedObject message\n" +
"#Will be ignored if sent with an CollisionObject message\n" +
"#Takes an attached object, detaches from the attached link\n" +
"#But adds back in as regular object\n" +
"byte DETACH_AND_ADD_AS_OBJECT=2\n" +
"\n" +
"#Only valid within the context of a CollisionAttachedObject message\n" +
"#Will be ignored if sent with an CollisionObject message\n" +
"#Takes current object in the environment and removes it as\n" +
"#a regular object\n" +
"byte ATTACH_AND_REMOVE_AS_OBJECT=3\n" +
"\n" +
"# Byte code for operation\n" +
"byte operation\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/Shape\n" +
"byte SPHERE=0\n" +
"byte BOX=1\n" +
"byte CYLINDER=2\n" +
"byte MESH=3\n" +
"\n" +
"byte type\n" +
"\n" +
"\n" +
"#### define sphere, box, cylinder ####\n" +
"# the origin of each shape is considered at the shape's center\n" +
"\n" +
"# for sphere\n" +
"# radius := dimensions[0]\n" +
"\n" +
"# for cylinder\n" +
"# radius := dimensions[0]\n" +
"# length := dimensions[1]\n" +
"# the length is along the Z axis\n" +
"\n" +
"# for box\n" +
"# size_x := dimensions[0]\n" +
"# size_y := dimensions[1]\n" +
"# size_z := dimensions[2]\n" +
"float64[] dimensions\n" +
"\n" +
"\n" +
"#### define mesh ####\n" +
"\n" +
"# list of triangles; triangle k is defined by tre vertices located\n" +
"# at indices triangles[3k], triangles[3k+1], triangles[3k+2]\n" +
"int32[] triangles\n" +
"geometry_msgs/Point[] vertices\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Point\n" +
"# This contains the position of a point in free space\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Pose\n" +
"# A representation of pose in free space, composed of postion and orientation. \n" +
"Point position\n" +
"Quaternion orientation\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Quaternion\n" +
"# This represents an orientation in free space in quaternion form.\n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"float64 w\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Response clone() {
    Response c = new Response();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4 + collisionname.length();
    __l += added_object.serializationLength();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, collisionname);
    added_object.serialize(bb, seq);
  }

  public void deserialize(ByteBuffer bb) {
    collisionname = Serialization.readString(bb);
    added_object.deserialize(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
    return
      collisionname.equals(other.collisionname) &&
      added_object.equals(other.added_object) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.collisionname == null ? 0 : this.collisionname.hashCode());
    result = prime * result + (this.added_object == null ? 0 : this.added_object.hashCode());
    return result;
  }
} // class Response

} //class

