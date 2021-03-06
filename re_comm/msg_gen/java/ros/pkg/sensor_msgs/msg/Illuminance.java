/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/share/sensor_msgs/msg/Illuminance.msg */

package ros.pkg.sensor_msgs.msg;

import java.nio.ByteBuffer;

public class Illuminance extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public double illuminance;
  public double variance;

  public Illuminance() {
  }

  public static java.lang.String __s_getDataType() { return "sensor_msgs/Illuminance"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "8cf5febb0952fca9d650c3d11a81a188"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return " # Single photometric illuminance measurement.  Light should be assumed to be\n" +
" # measured along the sensor's x-axis (the area of detection is the y-z plane).\n" +
" # The illuminance should have a 0 or positive value and be received with\n" +
" # the sensor's +X axis pointing toward the light source.\n" +
"\n" +
" # Photometric illuminance is the measure of the human eye's sensitivity of the\n" +
" # intensity of light encountering or passing through a surface.\n" +
"\n" +
" # All other Photometric and Radiometric measurements should\n" +
" # not use this message.\n" +
" # This message cannot represent:\n" +
" # Luminous intensity (candela/light source output)\n" +
" # Luminance (nits/light output per area)\n" +
" # Irradiance (watt/area), etc.\n" +
"\n" +
" Header header           # timestamp is the time the illuminance was measured\n" +
"                         # frame_id is the location and direction of the reading\n" +
"\n" +
" float64 illuminance     # Measurement of the Photometric Illuminance in Lux.\n" +
"\n" +
" float64 variance        # 0 is interpreted as variance unknown\n" +
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
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Illuminance clone() {
    Illuminance c = new Illuminance();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += 8; // illuminance
    __l += 8; // variance
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    bb.putDouble(illuminance);
    bb.putDouble(variance);
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    illuminance = bb.getDouble();
    variance = bb.getDouble();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Illuminance))
      return false;
    Illuminance other = (Illuminance) o;
    return
      header.equals(other.header) &&
      illuminance == other.illuminance &&
      variance == other.variance &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.illuminance)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.variance)) ^ (tmp >>> 32));
    return result;
  }
} // class Illuminance

