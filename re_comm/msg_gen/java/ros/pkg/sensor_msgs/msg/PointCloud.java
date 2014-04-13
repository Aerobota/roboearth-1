/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/share/sensor_msgs/msg/PointCloud.msg */

package ros.pkg.sensor_msgs.msg;

import java.nio.ByteBuffer;

public class PointCloud extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point32> points = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point32>();
  public java.util.ArrayList<ros.pkg.sensor_msgs.msg.ChannelFloat32> channels = new java.util.ArrayList<ros.pkg.sensor_msgs.msg.ChannelFloat32>();

  public PointCloud() {
  }

  public static java.lang.String __s_getDataType() { return "sensor_msgs/PointCloud"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "d8e9c3f5afbdd8a130fd1d2763945fca"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This message holds a collection of 3d points, plus optional additional\n" +
"# information about each point.\n" +
"\n" +
"# Time of sensor data acquisition, coordinate frame ID.\n" +
"Header header\n" +
"\n" +
"# Array of 3d points. Each Point32 should be interpreted as a 3d point\n" +
"# in the frame given in the header.\n" +
"geometry_msgs/Point32[] points\n" +
"\n" +
"# Each channel should have the same number of elements as points array,\n" +
"# and the data in each channel should correspond 1:1 with each point.\n" +
"# Channel names in common practice are listed in ChannelFloat32.msg.\n" +
"ChannelFloat32[] channels\n" +
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
"MSG: geometry_msgs/Point32\n" +
"# This contains the position of a point in free space(with 32 bits of precision).\n" +
"# It is recommeded to use Point wherever possible instead of Point32.  \n" +
"# \n" +
"# This recommendation is to promote interoperability.  \n" +
"#\n" +
"# This message is designed to take up less space when sending\n" +
"# lots of points at once, as in the case of a PointCloud.  \n" +
"\n" +
"float32 x\n" +
"float32 y\n" +
"float32 z\n" +
"================================================================================\n" +
"MSG: sensor_msgs/ChannelFloat32\n" +
"# This message is used by the PointCloud message to hold optional data\n" +
"# associated with each point in the cloud. The length of the values\n" +
"# array should be the same as the length of the points array in the\n" +
"# PointCloud, and each value should be associated with the corresponding\n" +
"# point.\n" +
"\n" +
"# Channel names in existing practice include:\n" +
"#   \"u\", \"v\" - row and column (respectively) in the left stereo image.\n" +
"#              This is opposite to usual conventions but remains for\n" +
"#              historical reasons. The newer PointCloud2 message has no\n" +
"#              such problem.\n" +
"#   \"rgb\" - For point clouds produced by color stereo cameras. uint8\n" +
"#           (R,G,B) values packed into the least significant 24 bits,\n" +
"#           in order.\n" +
"#   \"intensity\" - laser or pixel intensity.\n" +
"#   \"distance\"\n" +
"\n" +
"# The channel name should give semantics of the channel (e.g.\n" +
"# \"intensity\" instead of \"value\").\n" +
"string name\n" +
"\n" +
"# The values array should be 1-1 with the elements of the associated\n" +
"# PointCloud.\n" +
"float32[] values\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public PointCloud clone() {
    PointCloud c = new PointCloud();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += 4;
    for(ros.pkg.geometry_msgs.msg.Point32 val : points) {
      __l += val.serializationLength();
    }
    __l += 4;
    for(ros.pkg.sensor_msgs.msg.ChannelFloat32 val : channels) {
      __l += val.serializationLength();
    }
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    bb.putInt(points.size());
    for(ros.pkg.geometry_msgs.msg.Point32 val : points) {
      val.serialize(bb, seq);
    }
    bb.putInt(channels.size());
    for(ros.pkg.sensor_msgs.msg.ChannelFloat32 val : channels) {
      val.serialize(bb, seq);
    }
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);

    int __points_len = bb.getInt();
    points = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point32>(__points_len);
    for(int __i=0; __i<__points_len; __i++) {
      ros.pkg.geometry_msgs.msg.Point32 __tmp = new ros.pkg.geometry_msgs.msg.Point32();
      __tmp.deserialize(bb);
      points.add(__tmp);;
    }

    int __channels_len = bb.getInt();
    channels = new java.util.ArrayList<ros.pkg.sensor_msgs.msg.ChannelFloat32>(__channels_len);
    for(int __i=0; __i<__channels_len; __i++) {
      ros.pkg.sensor_msgs.msg.ChannelFloat32 __tmp = new ros.pkg.sensor_msgs.msg.ChannelFloat32();
      __tmp.deserialize(bb);
      channels.add(__tmp);;
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof PointCloud))
      return false;
    PointCloud other = (PointCloud) o;
    return
      header.equals(other.header) &&
      points.equals(other.points) &&
      channels.equals(other.channels) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.points == null ? 0 : this.points.hashCode());
    result = prime * result + (this.channels == null ? 0 : this.channels.hashCode());
    return result;
  }
} // class PointCloud
