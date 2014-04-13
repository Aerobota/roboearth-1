/* Auto-generated by genmsg_cpp for file /opt/ros/groovy/share/roscpp/srv/SetLoggerLevel.srv */

package ros.pkg.roscpp.srv;

import java.nio.ByteBuffer;


public class SetLoggerLevel extends ros.communication.Service<SetLoggerLevel.Request, SetLoggerLevel.Response> {

  public static java.lang.String __s_getDataType() { return "roscpp/SetLoggerLevel"; }
  public static java.lang.String __s_getMD5Sum() { return "51da076440d78ca1684d36c868df61ea"; }

  public java.lang.String getDataType() { return SetLoggerLevel.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return SetLoggerLevel.__s_getMD5Sum(); }

  public SetLoggerLevel.Request createRequest() {
    return new SetLoggerLevel.Request();
  }

  public SetLoggerLevel.Response createResponse() {
    return new SetLoggerLevel.Response();
  }

static public class Request extends ros.communication.Message {

  public java.lang.String logger = new java.lang.String();
  public java.lang.String level = new java.lang.String();

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "roscpp/SetLoggerLevelRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "51da076440d78ca1684d36c868df61ea"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "51da076440d78ca1684d36c868df61ea"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string logger\n" +
"string level\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Request clone() {
    Request c = new Request();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4 + logger.length();
    __l += 4 + level.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, logger);
    Serialization.writeString(bb, level);
  }

  public void deserialize(ByteBuffer bb) {
    logger = Serialization.readString(bb);
    level = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      logger.equals(other.logger) &&
      level.equals(other.level) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.logger == null ? 0 : this.logger.hashCode());
    result = prime * result + (this.level == null ? 0 : this.level.hashCode());
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {


  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "roscpp/SetLoggerLevelResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "d41d8cd98f00b204e9800998ecf8427e"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "51da076440d78ca1684d36c868df61ea"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Response clone() {
    Response c = new Response();
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
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
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
} // class Response

} //class

