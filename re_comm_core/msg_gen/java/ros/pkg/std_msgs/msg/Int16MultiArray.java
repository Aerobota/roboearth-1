/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/share/std_msgs/msg/Int16MultiArray.msg */

package ros.pkg.std_msgs.msg;

import java.nio.ByteBuffer;

public class Int16MultiArray extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.MultiArrayLayout layout = new ros.pkg.std_msgs.msg.MultiArrayLayout();
  public short[] data = new short[0];

  public Int16MultiArray() {
  }

  public static java.lang.String __s_getDataType() { return "std_msgs/Int16MultiArray"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "d9338d7f523fcb692fae9d0a0e9f067c"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# Please look at the MultiArrayLayout message definition for\n" +
"# documentation on all multiarrays.\n" +
"\n" +
"MultiArrayLayout  layout        # specification of data layout\n" +
"int16[]           data          # array of data\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: std_msgs/MultiArrayLayout\n" +
"# The multiarray declares a generic multi-dimensional array of a\n" +
"# particular data type.  Dimensions are ordered from outer most\n" +
"# to inner most.\n" +
"\n" +
"MultiArrayDimension[] dim # Array of dimension properties\n" +
"uint32 data_offset        # padding bytes at front of data\n" +
"\n" +
"# Accessors should ALWAYS be written in terms of dimension stride\n" +
"# and specified outer-most dimension first.\n" +
"# \n" +
"# multiarray(i,j,k) = data[data_offset + dim_stride[1]*i + dim_stride[2]*j + k]\n" +
"#\n" +
"# A standard, 3-channel 640x480 image with interleaved color channels\n" +
"# would be specified as:\n" +
"#\n" +
"# dim[0].label  = \"height\"\n" +
"# dim[0].size   = 480\n" +
"# dim[0].stride = 3*640*480 = 921600  (note dim[0] stride is just size of image)\n" +
"# dim[1].label  = \"width\"\n" +
"# dim[1].size   = 640\n" +
"# dim[1].stride = 3*640 = 1920\n" +
"# dim[2].label  = \"channel\"\n" +
"# dim[2].size   = 3\n" +
"# dim[2].stride = 3\n" +
"#\n" +
"# multiarray(i,j,k) refers to the ith row, jth column, and kth channel.\n" +
"================================================================================\n" +
"MSG: std_msgs/MultiArrayDimension\n" +
"string label   # label of given dimension\n" +
"uint32 size    # size of given dimension (in type units)\n" +
"uint32 stride  # stride of given dimension\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Int16MultiArray clone() {
    Int16MultiArray c = new Int16MultiArray();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += layout.serializationLength();
    __l += 4 + data.length * 2; // data
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    layout.serialize(bb, seq);
    bb.putInt(data.length);
    for(short val : data) {
      bb.putShort(val);
    }
  }

  public void deserialize(ByteBuffer bb) {
    layout.deserialize(bb);

    int __data_len = bb.getInt();
    data = new short[__data_len];
    for(int __i=0; __i<__data_len; __i++) {
      data[__i] = bb.getShort();
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Int16MultiArray))
      return false;
    Int16MultiArray other = (Int16MultiArray) o;
    return
      layout.equals(other.layout) &&
      java.util.Arrays.equals(data, other.data) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.layout == null ? 0 : this.layout.hashCode());
    result = prime * result + java.util.Arrays.hashCode(this.data);
    return result;
  }
} // class Int16MultiArray

