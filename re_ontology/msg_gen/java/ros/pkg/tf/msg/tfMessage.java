/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/share/tf/msg/tfMessage.msg */

package ros.pkg.tf.msg;

import java.nio.ByteBuffer;

public class tfMessage extends ros.communication.Message {

  public java.util.ArrayList<ros.pkg.geometry_msgs.msg.TransformStamped> transforms = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.TransformStamped>();

  public tfMessage() {
  }

  public static java.lang.String __s_getDataType() { return "tf/tfMessage"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "94810edda583a504dfda3829e70d7eec"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "geometry_msgs/TransformStamped[] transforms\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/TransformStamped\n" +
"# This expresses a transform from coordinate frame header.frame_id\n" +
"# to the coordinate frame child_frame_id\n" +
"#\n" +
"# This message is mostly used by the \n" +
"# <a href=\"http://www.ros.org/wiki/tf\">tf</a> package. \n" +
"# See its documentation for more information.\n" +
"\n" +
"Header header\n" +
"string child_frame_id # the frame id of the child frame\n" +
"Transform transform\n" +
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
"MSG: geometry_msgs/Transform\n" +
"# This represents the transform between two coordinate frames in free space.\n" +
"\n" +
"Vector3 translation\n" +
"Quaternion rotation\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Vector3\n" +
"# This represents a vector in free space. \n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
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

  public tfMessage clone() {
    tfMessage c = new tfMessage();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4;
    for(ros.pkg.geometry_msgs.msg.TransformStamped val : transforms) {
      __l += val.serializationLength();
    }
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putInt(transforms.size());
    for(ros.pkg.geometry_msgs.msg.TransformStamped val : transforms) {
      val.serialize(bb, seq);
    }
  }

  public void deserialize(ByteBuffer bb) {

    int __transforms_len = bb.getInt();
    transforms = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.TransformStamped>(__transforms_len);
    for(int __i=0; __i<__transforms_len; __i++) {
      ros.pkg.geometry_msgs.msg.TransformStamped __tmp = new ros.pkg.geometry_msgs.msg.TransformStamped();
      __tmp.deserialize(bb);
      transforms.add(__tmp);;
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof tfMessage))
      return false;
    tfMessage other = (tfMessage) o;
    return
      transforms.equals(other.transforms) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.transforms == null ? 0 : this.transforms.hashCode());
    return result;
  }
} // class tfMessage

