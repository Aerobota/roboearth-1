/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/share/std_msgs/msg/Empty.msg */

package ros.pkg.std_msgs.msg;

import java.nio.ByteBuffer;

public class Empty extends ros.communication.Message {


  public Empty() {
  }

  public static java.lang.String __s_getDataType() { return "std_msgs/Empty"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "d41d8cd98f00b204e9800998ecf8427e"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Empty clone() {
    Empty c = new Empty();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
  }

  public void deserialize(ByteBuffer bb) {
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Empty))
      return false;
    Empty other = (Empty) o;
    return
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    return result;
  }
} // class Empty

