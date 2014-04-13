/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/stacks/arm_navigation/arm_navigation_msgs/msg/MultiDOFJointTrajectory.msg */

package ros.pkg.arm_navigation_msgs.msg;

import java.nio.ByteBuffer;

public class MultiDOFJointTrajectory extends ros.communication.Message {

  public ros.communication.Duration stamp = new ros.communication.Duration();
  public java.util.ArrayList<java.lang.String> joint_names = new java.util.ArrayList<java.lang.String>();
  public java.util.ArrayList<java.lang.String> frame_ids = new java.util.ArrayList<java.lang.String>();
  public java.util.ArrayList<java.lang.String> child_frame_ids = new java.util.ArrayList<java.lang.String>();
  public java.util.ArrayList<ros.pkg.arm_navigation_msgs.msg.MultiDOFJointTrajectoryPoint> points = new java.util.ArrayList<ros.pkg.arm_navigation_msgs.msg.MultiDOFJointTrajectoryPoint>();

  public MultiDOFJointTrajectory() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/MultiDOFJointTrajectory"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "524f128fb0a65e2838b0e3e3f75207d0"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "#A representation of a multi-dof joint trajectory\n" +
"duration stamp\n" +
"string[] joint_names\n" +
"string[] frame_ids\n" +
"string[] child_frame_ids\n" +
"MultiDOFJointTrajectoryPoint[] points\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/MultiDOFJointTrajectoryPoint\n" +
"geometry_msgs/Pose[] poses\n" +
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

  public MultiDOFJointTrajectory clone() {
    MultiDOFJointTrajectory c = new MultiDOFJointTrajectory();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 8; // stamp
    __l += 4;
    for(java.lang.String val : joint_names) {
      __l += 4 + val.length();
    }
    __l += 4;
    for(java.lang.String val : frame_ids) {
      __l += 4 + val.length();
    }
    __l += 4;
    for(java.lang.String val : child_frame_ids) {
      __l += 4 + val.length();
    }
    __l += 4;
    for(ros.pkg.arm_navigation_msgs.msg.MultiDOFJointTrajectoryPoint val : points) {
      __l += val.serializationLength();
    }
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeDuration(bb, stamp);
    bb.putInt(joint_names.size());
    for(java.lang.String val : joint_names) {
      Serialization.writeString(bb, val);
    }
    bb.putInt(frame_ids.size());
    for(java.lang.String val : frame_ids) {
      Serialization.writeString(bb, val);
    }
    bb.putInt(child_frame_ids.size());
    for(java.lang.String val : child_frame_ids) {
      Serialization.writeString(bb, val);
    }
    bb.putInt(points.size());
    for(ros.pkg.arm_navigation_msgs.msg.MultiDOFJointTrajectoryPoint val : points) {
      val.serialize(bb, seq);
    }
  }

  public void deserialize(ByteBuffer bb) {
    stamp = Serialization.readDuration(bb);

    int __joint_names_len = bb.getInt();
    joint_names = new java.util.ArrayList<java.lang.String>(__joint_names_len);
    for(int __i=0; __i<__joint_names_len; __i++) {
      joint_names.add(Serialization.readString(bb));
    }

    int __frame_ids_len = bb.getInt();
    frame_ids = new java.util.ArrayList<java.lang.String>(__frame_ids_len);
    for(int __i=0; __i<__frame_ids_len; __i++) {
      frame_ids.add(Serialization.readString(bb));
    }

    int __child_frame_ids_len = bb.getInt();
    child_frame_ids = new java.util.ArrayList<java.lang.String>(__child_frame_ids_len);
    for(int __i=0; __i<__child_frame_ids_len; __i++) {
      child_frame_ids.add(Serialization.readString(bb));
    }

    int __points_len = bb.getInt();
    points = new java.util.ArrayList<ros.pkg.arm_navigation_msgs.msg.MultiDOFJointTrajectoryPoint>(__points_len);
    for(int __i=0; __i<__points_len; __i++) {
      ros.pkg.arm_navigation_msgs.msg.MultiDOFJointTrajectoryPoint __tmp = new ros.pkg.arm_navigation_msgs.msg.MultiDOFJointTrajectoryPoint();
      __tmp.deserialize(bb);
      points.add(__tmp);;
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof MultiDOFJointTrajectory))
      return false;
    MultiDOFJointTrajectory other = (MultiDOFJointTrajectory) o;
    return
      stamp.equals(other.stamp) &&
      joint_names.equals(other.joint_names) &&
      frame_ids.equals(other.frame_ids) &&
      child_frame_ids.equals(other.child_frame_ids) &&
      points.equals(other.points) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.stamp == null ? 0 : this.stamp.hashCode());
    result = prime * result + (this.joint_names == null ? 0 : this.joint_names.hashCode());
    result = prime * result + (this.frame_ids == null ? 0 : this.frame_ids.hashCode());
    result = prime * result + (this.child_frame_ids == null ? 0 : this.child_frame_ids.hashCode());
    result = prime * result + (this.points == null ? 0 : this.points.hashCode());
    return result;
  }
} // class MultiDOFJointTrajectory

