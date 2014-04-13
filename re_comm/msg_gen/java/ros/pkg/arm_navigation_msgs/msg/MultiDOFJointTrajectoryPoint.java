/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/stacks/arm_navigation/arm_navigation_msgs/msg/MultiDOFJointTrajectoryPoint.msg */

package ros.pkg.arm_navigation_msgs.msg;

import java.nio.ByteBuffer;

public class MultiDOFJointTrajectoryPoint extends ros.communication.Message {

  public java.util.ArrayList<ros.pkg.geometry_msgs.msg.Pose> poses = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.Pose>();
  public ros.communication.Duration time_from_start = new ros.communication.Duration();

  public MultiDOFJointTrajectoryPoint() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/MultiDOFJointTrajectoryPoint"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "9be3ee3b5fa289b5394ab4ca9e54fa4e"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "geometry_msgs/Pose[] poses\n" +
"duration time_from_start\n" +
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

  public MultiDOFJointTrajectoryPoint clone() {
    MultiDOFJointTrajectoryPoint c = new MultiDOFJointTrajectoryPoint();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4;
    for(ros.pkg.geometry_msgs.msg.Pose val : poses) {
      __l += val.serializationLength();
    }
    __l += 8; // time_from_start
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putInt(poses.size());
    for(ros.pkg.geometry_msgs.msg.Pose val : poses) {
      val.serialize(bb, seq);
    }
    Serialization.writeDuration(bb, time_from_start);
  }

  public void deserialize(ByteBuffer bb) {

    int __poses_len = bb.getInt();
    poses = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.Pose>(__poses_len);
    for(int __i=0; __i<__poses_len; __i++) {
      ros.pkg.geometry_msgs.msg.Pose __tmp = new ros.pkg.geometry_msgs.msg.Pose();
      __tmp.deserialize(bb);
      poses.add(__tmp);;
    }
    time_from_start = Serialization.readDuration(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof MultiDOFJointTrajectoryPoint))
      return false;
    MultiDOFJointTrajectoryPoint other = (MultiDOFJointTrajectoryPoint) o;
    return
      poses.equals(other.poses) &&
      time_from_start.equals(other.time_from_start) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.poses == null ? 0 : this.poses.hashCode());
    result = prime * result + (this.time_from_start == null ? 0 : this.time_from_start.hashCode());
    return result;
  }
} // class MultiDOFJointTrajectoryPoint

