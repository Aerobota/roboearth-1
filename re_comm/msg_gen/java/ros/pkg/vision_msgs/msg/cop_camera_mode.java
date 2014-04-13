/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/stacks/ias_common/vision_msgs/msg/cop_camera_mode.msg */

package ros.pkg.vision_msgs.msg;

import java.nio.ByteBuffer;

public class cop_camera_mode extends ros.communication.Message {
  static public final java.lang.String VERY_DARK_ENVIRONMENT = "VeryDarkEnvironment";
  static public final java.lang.String DARK_ENVIRONMENT = "DarkEnvironment";
  static public final java.lang.String AVERAGE_ENVIRONMENT = "AverageEnvironment";
  static public final java.lang.String BRIGHT_ENVIRONMENT = "BrightEnvironment";

  public java.lang.String mode = new java.lang.String();

  public cop_camera_mode() {
  }

  public static java.lang.String __s_getDataType() { return "vision_msgs/cop_camera_mode"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "238c3e19ca5f691ca2ef2dd46e1bb593"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string VERY_DARK_ENVIRONMENT=VeryDarkEnvironment\n" +
"string DARK_ENVIRONMENT=DarkEnvironment\n" +
"string AVERAGE_ENVIRONMENT=AverageEnvironment\n" +
"string BRIGHT_ENVIRONMENT=BrightEnvironment\n" +
"\n" +
"string mode  # switches camera to different environment modes\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public cop_camera_mode clone() {
    cop_camera_mode c = new cop_camera_mode();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4 + mode.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, mode);
  }

  public void deserialize(ByteBuffer bb) {
    mode = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof cop_camera_mode))
      return false;
    cop_camera_mode other = (cop_camera_mode) o;
    return
      mode.equals(other.mode) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.mode == null ? 0 : this.mode.hashCode());
    return result;
  }
} // class cop_camera_mode

