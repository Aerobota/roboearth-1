/* Auto-generated by genmsg_cpp for file /home/vitalij/ros/stacks/roboearth/re_srvs/srv/RoboEarthRetrieveCopModel.srv */

package ros.pkg.re_srvs.srv;

import java.nio.ByteBuffer;


public class RoboEarthRetrieveCopModel extends ros.communication.Service<RoboEarthRetrieveCopModel.Request, RoboEarthRetrieveCopModel.Response> {

  public static java.lang.String __s_getDataType() { return "re_srvs/RoboEarthRetrieveCopModel"; }
  public static java.lang.String __s_getMD5Sum() { return "87d2f809d62d013732ccd3863f969fb1"; }

  public java.lang.String getDataType() { return RoboEarthRetrieveCopModel.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return RoboEarthRetrieveCopModel.__s_getMD5Sum(); }

  public RoboEarthRetrieveCopModel.Request createRequest() {
    return new RoboEarthRetrieveCopModel.Request();
  }

  public RoboEarthRetrieveCopModel.Response createResponse() {
    return new RoboEarthRetrieveCopModel.Response();
  }

static public class Request extends ros.communication.Message {

  public java.lang.String object_name = new java.lang.String();

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/RoboEarthRetrieveCopModelRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "2f12226348d323c2e5b2031b3da53f1b"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "87d2f809d62d013732ccd3863f969fb1"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "\n" +
"\n" +
"string object_name\n" +
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
    __l += 4 + object_name.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, object_name);
  }

  public void deserialize(ByteBuffer bb) {
    object_name = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      object_name.equals(other.object_name) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.object_name == null ? 0 : this.object_name.hashCode());
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {

  public short success;
  public java.lang.String owldata = new java.lang.String();

  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/RoboEarthRetrieveCopModelResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "8f273897a5c0449873ad43c65d111f6c"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "87d2f809d62d013732ccd3863f969fb1"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "byte success\n" +
"string owldata\n" +
"\n" +
"\n" +
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
    __l += 1; // success
    __l += 4 + owldata.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.put((byte)success);
    Serialization.writeString(bb, owldata);
  }

  public void deserialize(ByteBuffer bb) {
    success = (short)(bb.get() & 0xff);
    owldata = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
    return
      success == other.success &&
      owldata.equals(other.owldata) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + this.success;
    result = prime * result + (this.owldata == null ? 0 : this.owldata.hashCode());
    return result;
  }
} // class Response

} //class

