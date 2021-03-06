/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/share/geometry_msgs/msg/Polygon.msg */

package ros.pkg.geometry_msgs.msg;

import java.nio.ByteBuffer;

public class Polygon extends ros.communication.Message {

  public java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point32> points = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point32>();

  public Polygon() {
  }

  public static java.lang.String __s_getDataType() { return "geometry_msgs/Polygon"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "cd60a26494a087f577976f0329fa120e"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "#A specification of a polygon where the first and last points are assumed to be connected\n" +
"Point32[] points\n" +
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
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Polygon clone() {
    Polygon c = new Polygon();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4;
    for(ros.pkg.geometry_msgs.msg.Point32 val : points) {
      __l += val.serializationLength();
    }
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putInt(points.size());
    for(ros.pkg.geometry_msgs.msg.Point32 val : points) {
      val.serialize(bb, seq);
    }
  }

  public void deserialize(ByteBuffer bb) {

    int __points_len = bb.getInt();
    points = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point32>(__points_len);
    for(int __i=0; __i<__points_len; __i++) {
      ros.pkg.geometry_msgs.msg.Point32 __tmp = new ros.pkg.geometry_msgs.msg.Point32();
      __tmp.deserialize(bb);
      points.add(__tmp);;
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Polygon))
      return false;
    Polygon other = (Polygon) o;
    return
      points.equals(other.points) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.points == null ? 0 : this.points.hashCode());
    return result;
  }
} // class Polygon

