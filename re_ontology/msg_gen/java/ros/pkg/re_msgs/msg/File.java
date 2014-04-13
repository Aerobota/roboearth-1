/* Auto-generated by genmsg_java.py for file /home/vitalij/ros/stacks/roboearth/re_msgs/msg/File.msg */

package ros.pkg.re_msgs.msg;

import java.nio.ByteBuffer;

public class File extends ros.communication.Message {

  public java.lang.String name = new java.lang.String();
  public byte[] data = new byte[0];

  public File() {
  }

  public static java.lang.String __s_getDataType() { return "re_msgs/File"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "893fbfd6413e9fa51a46d64705c3b6c3"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This file representation is used to pass binary data to the RoboEarthDB.\n" +
"# As the endianess isn't stored, only files with a byte order mark (BOM) or\n" +
"# an implicitly specified endianess should be transferred.\n" +
"string name   # file name\n" +
"int8[] data   # binary data \n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public File clone() {
    File c = new File();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4 + name.length();
    __l += 4 + data.length * 1; // data
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, name);
    bb.putInt(data.length);
    for(byte val : data) {
      bb.put(val);
    }
  }

  public void deserialize(ByteBuffer bb) {
    name = Serialization.readString(bb);

    int __data_len = bb.getInt();
    data = new byte[__data_len];
    for(int __i=0; __i<__data_len; __i++) {
      data[__i] = bb.get();
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof File))
      return false;
    File other = (File) o;
    return
      name.equals(other.name) &&
      java.util.Arrays.equals(data, other.data) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.name == null ? 0 : this.name.hashCode());
    result = prime * result + java.util.Arrays.hashCode(this.data);
    return result;
  }
} // class File

