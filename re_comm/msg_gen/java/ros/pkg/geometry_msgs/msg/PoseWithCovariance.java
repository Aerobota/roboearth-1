/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/share/geometry_msgs/msg/PoseWithCovariance.msg */

package ros.pkg.geometry_msgs.msg;

import java.nio.ByteBuffer;

public class PoseWithCovariance extends ros.communication.Message {

  public ros.pkg.geometry_msgs.msg.Pose pose = new ros.pkg.geometry_msgs.msg.Pose();
  public double[] covariance = new double[36];

  public PoseWithCovariance() {
  }

  public static java.lang.String __s_getDataType() { return "geometry_msgs/PoseWithCovariance"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "c23e848cf1b7533a8d7c259073a97e6f"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This represents a pose in free space with uncertainty.\n" +
"\n" +
"Pose pose\n" +
"\n" +
"# Row-major representation of the 6x6 covariance matrix\n" +
"# The orientation parameters use a fixed-axis representation.\n" +
"# In order, the parameters are:\n" +
"# (x, y, z, rotation about X axis, rotation about Y axis, rotation about Z axis)\n" +
"float64[36] covariance\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Pose\n" +
"# A representation of pose in free space, composed of postion and orientation. \n" +
"Point position\n" +
"Quaternion orientation\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Point\n" +
"# This contains the position of a point in free space\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
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

  public PoseWithCovariance clone() {
    PoseWithCovariance c = new PoseWithCovariance();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += pose.serializationLength();
    __l += 288; // covariance
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    pose.serialize(bb, seq);

    for(double val : covariance) {
      bb.putDouble(val);
    }
  }

  public void deserialize(ByteBuffer bb) {
    pose.deserialize(bb);

    int __covariance_len = covariance.length;;
    covariance = new double[__covariance_len];
    for(int __i=0; __i<__covariance_len; __i++) {
      covariance[__i] = bb.getDouble();
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof PoseWithCovariance))
      return false;
    PoseWithCovariance other = (PoseWithCovariance) o;
    return
      pose.equals(other.pose) &&
      java.util.Arrays.equals(covariance, other.covariance) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.pose == null ? 0 : this.pose.hashCode());
    result = prime * result + java.util.Arrays.hashCode(this.covariance);
    return result;
  }
} // class PoseWithCovariance

