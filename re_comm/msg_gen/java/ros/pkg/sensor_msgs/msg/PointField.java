/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/share/sensor_msgs/msg/PointField.msg */

package ros.pkg.sensor_msgs.msg;

import java.nio.ByteBuffer;

public class PointField extends ros.communication.Message {
  static public final short INT8 = 1;
  static public final short UINT8 = 2;
  static public final short INT16 = 3;
  static public final short UINT16 = 4;
  static public final short INT32 = 5;
  static public final short UINT32 = 6;
  static public final short FLOAT32 = 7;
  static public final short FLOAT64 = 8;

  public java.lang.String name = new java.lang.String();
  public long offset;
  public short datatype;
  public long count;

  public PointField() {
  }

  public static java.lang.String __s_getDataType() { return "sensor_msgs/PointField"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "268eacb2962780ceac86cbd17e328150"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This message holds the description of one point entry in the\n" +
"# PointCloud2 message format.\n" +
"uint8 INT8    = 1\n" +
"uint8 UINT8   = 2\n" +
"uint8 INT16   = 3\n" +
"uint8 UINT16  = 4\n" +
"uint8 INT32   = 5\n" +
"uint8 UINT32  = 6\n" +
"uint8 FLOAT32 = 7\n" +
"uint8 FLOAT64 = 8\n" +
"\n" +
"string name      # Name of field\n" +
"uint32 offset    # Offset from start of point struct\n" +
"uint8  datatype  # Datatype enumeration, see above\n" +
"uint32 count     # How many elements in the field\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public PointField clone() {
    PointField c = new PointField();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4 + name.length();
    __l += 4; // offset
    __l += 1; // datatype
    __l += 4; // count
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, name);
    bb.putInt((int)offset);
    bb.put((byte)datatype);
    bb.putInt((int)count);
  }

  public void deserialize(ByteBuffer bb) {
    name = Serialization.readString(bb);
    offset = (long)(bb.getInt() & 0xffffffff);
    datatype = (short)(bb.get() & 0xff);
    count = (long)(bb.getInt() & 0xffffffff);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof PointField))
      return false;
    PointField other = (PointField) o;
    return
      name.equals(other.name) &&
      offset == other.offset &&
      datatype == other.datatype &&
      count == other.count &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.name == null ? 0 : this.name.hashCode());
    result = prime * result + (int)(this.offset ^ (this.offset >>> 32));
    result = prime * result + this.datatype;
    result = prime * result + (int)(this.count ^ (this.count >>> 32));
    return result;
  }
} // class PointField

