/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/stacks/arm_navigation/arm_navigation_msgs/msg/MoveArmActionFeedback.msg */

package ros.pkg.arm_navigation_msgs.msg;

import java.nio.ByteBuffer;

public class MoveArmActionFeedback extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public ros.pkg.actionlib_msgs.msg.GoalStatus status = new ros.pkg.actionlib_msgs.msg.GoalStatus();
  public ros.pkg.arm_navigation_msgs.msg.MoveArmFeedback feedback = new ros.pkg.arm_navigation_msgs.msg.MoveArmFeedback();

  public MoveArmActionFeedback() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/MoveArmActionFeedback"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "50284463bfe759fbf589fc263537baad"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n" +
"\n" +
"Header header\n" +
"actionlib_msgs/GoalStatus status\n" +
"MoveArmFeedback feedback\n" +
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
"MSG: actionlib_msgs/GoalStatus\n" +
"GoalID goal_id\n" +
"uint8 status\n" +
"uint8 PENDING         = 0   # The goal has yet to be processed by the action server\n" +
"uint8 ACTIVE          = 1   # The goal is currently being processed by the action server\n" +
"uint8 PREEMPTED       = 2   # The goal received a cancel request after it started executing\n" +
"                            #   and has since completed its execution (Terminal State)\n" +
"uint8 SUCCEEDED       = 3   # The goal was achieved successfully by the action server (Terminal State)\n" +
"uint8 ABORTED         = 4   # The goal was aborted during execution by the action server due\n" +
"                            #    to some failure (Terminal State)\n" +
"uint8 REJECTED        = 5   # The goal was rejected by the action server without being processed,\n" +
"                            #    because the goal was unattainable or invalid (Terminal State)\n" +
"uint8 PREEMPTING      = 6   # The goal received a cancel request after it started executing\n" +
"                            #    and has not yet completed execution\n" +
"uint8 RECALLING       = 7   # The goal received a cancel request before it started executing,\n" +
"                            #    but the action server has not yet confirmed that the goal is canceled\n" +
"uint8 RECALLED        = 8   # The goal received a cancel request before it started executing\n" +
"                            #    and was successfully cancelled (Terminal State)\n" +
"uint8 LOST            = 9   # An action client can determine that a goal is LOST. This should not be\n" +
"                            #    sent over the wire by an action server\n" +
"\n" +
"#Allow for the user to associate a string with GoalStatus for debugging\n" +
"string text\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: actionlib_msgs/GoalID\n" +
"# The stamp should store the time at which this goal was requested.\n" +
"# It is used by an action server when it tries to preempt all\n" +
"# goals that were requested before a certain time\n" +
"time stamp\n" +
"\n" +
"# The id provides a way to associate feedback and\n" +
"# result message with specific goal requests. The id\n" +
"# specified must be unique.\n" +
"string id\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/MoveArmFeedback\n" +
"# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n" +
"# The internal state that the move arm action currently is in\n" +
"string state\n" +
"\n" +
"# Time to completion - this is a combination of requested planning time and trajectory completion time\n" +
"duration time_to_completion\n" +
"\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public MoveArmActionFeedback clone() {
    MoveArmActionFeedback c = new MoveArmActionFeedback();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += status.serializationLength();
    __l += feedback.serializationLength();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    status.serialize(bb, seq);
    feedback.serialize(bb, seq);
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    status.deserialize(bb);
    feedback.deserialize(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof MoveArmActionFeedback))
      return false;
    MoveArmActionFeedback other = (MoveArmActionFeedback) o;
    return
      header.equals(other.header) &&
      status.equals(other.status) &&
      feedback.equals(other.feedback) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.status == null ? 0 : this.status.hashCode());
    result = prime * result + (this.feedback == null ? 0 : this.feedback.hashCode());
    return result;
  }
} // class MoveArmActionFeedback

