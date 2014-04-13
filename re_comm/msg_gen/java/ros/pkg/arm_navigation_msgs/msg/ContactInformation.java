/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/stacks/arm_navigation/arm_navigation_msgs/msg/ContactInformation.msg */

package ros.pkg.arm_navigation_msgs.msg;

import java.nio.ByteBuffer;

public class ContactInformation extends ros.communication.Message {
  static public final long ROBOT_LINK = 0;
  static public final long OBJECT = 1;
  static public final long ATTACHED_BODY = 2;

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public ros.pkg.geometry_msgs.msg.Point position = new ros.pkg.geometry_msgs.msg.Point();
  public ros.pkg.geometry_msgs.msg.Vector3 normal = new ros.pkg.geometry_msgs.msg.Vector3();
  public double depth;
  public java.lang.String contact_body_1 = new java.lang.String();
  public java.lang.String attached_body_1 = new java.lang.String();
  public long body_type_1;
  public java.lang.String contact_body_2 = new java.lang.String();
  public java.lang.String attached_body_2 = new java.lang.String();
  public long body_type_2;

  public ContactInformation() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/ContactInformation"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "85f341c0166ad4e68b4421391bbd2e15"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# Standard ROS header contains information \n" +
"# about the frame in which this \n" +
"# contact is specified\n" +
"Header header\n" +
"\n" +
"# Position of the contact point\n" +
"geometry_msgs/Point position\n" +
"\n" +
"# Normal corresponding to the contact point\n" +
"geometry_msgs/Vector3 normal \n" +
"\n" +
"# Depth of contact point\n" +
"float64 depth\n" +
"\n" +
"# Name of the first body that is in contact\n" +
"# This could be a link or a namespace that represents a body\n" +
"string contact_body_1\n" +
"string attached_body_1\n" +
"uint32 body_type_1\n" +
"\n" +
"# Name of the second body that is in contact\n" +
"# This could be a link or a namespace that represents a body\n" +
"string contact_body_2\n" +
"string attached_body_2\n" +
"uint32 body_type_2\n" +
"\n" +
"uint32 ROBOT_LINK=0\n" +
"uint32 OBJECT=1\n" +
"uint32 ATTACHED_BODY=2\n" +
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
"MSG: geometry_msgs/Point\n" +
"# This contains the position of a point in free space\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Vector3\n" +
"# This represents a vector in free space. \n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public ContactInformation clone() {
    ContactInformation c = new ContactInformation();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += position.serializationLength();
    __l += normal.serializationLength();
    __l += 8; // depth
    __l += 4 + contact_body_1.length();
    __l += 4 + attached_body_1.length();
    __l += 4; // body_type_1
    __l += 4 + contact_body_2.length();
    __l += 4 + attached_body_2.length();
    __l += 4; // body_type_2
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    position.serialize(bb, seq);
    normal.serialize(bb, seq);
    bb.putDouble(depth);
    Serialization.writeString(bb, contact_body_1);
    Serialization.writeString(bb, attached_body_1);
    bb.putInt((int)body_type_1);
    Serialization.writeString(bb, contact_body_2);
    Serialization.writeString(bb, attached_body_2);
    bb.putInt((int)body_type_2);
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    position.deserialize(bb);
    normal.deserialize(bb);
    depth = bb.getDouble();
    contact_body_1 = Serialization.readString(bb);
    attached_body_1 = Serialization.readString(bb);
    body_type_1 = (long)(bb.getInt() & 0xffffffff);
    contact_body_2 = Serialization.readString(bb);
    attached_body_2 = Serialization.readString(bb);
    body_type_2 = (long)(bb.getInt() & 0xffffffff);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof ContactInformation))
      return false;
    ContactInformation other = (ContactInformation) o;
    return
      header.equals(other.header) &&
      position.equals(other.position) &&
      normal.equals(other.normal) &&
      depth == other.depth &&
      contact_body_1.equals(other.contact_body_1) &&
      attached_body_1.equals(other.attached_body_1) &&
      body_type_1 == other.body_type_1 &&
      contact_body_2.equals(other.contact_body_2) &&
      attached_body_2.equals(other.attached_body_2) &&
      body_type_2 == other.body_type_2 &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.position == null ? 0 : this.position.hashCode());
    result = prime * result + (this.normal == null ? 0 : this.normal.hashCode());
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.depth)) ^ (tmp >>> 32));
    result = prime * result + (this.contact_body_1 == null ? 0 : this.contact_body_1.hashCode());
    result = prime * result + (this.attached_body_1 == null ? 0 : this.attached_body_1.hashCode());
    result = prime * result + (int)(this.body_type_1 ^ (this.body_type_1 >>> 32));
    result = prime * result + (this.contact_body_2 == null ? 0 : this.contact_body_2.hashCode());
    result = prime * result + (this.attached_body_2 == null ? 0 : this.attached_body_2.hashCode());
    result = prime * result + (int)(this.body_type_2 ^ (this.body_type_2 >>> 32));
    return result;
  }
} // class ContactInformation
