/* Auto-generated by genmsg_cpp for file /home/vitalij/ros/stacks/roboearth/re_srvs/srv/GetEnvironmentBinaryFile.srv */

package ros.pkg.re_srvs.srv;

import java.nio.ByteBuffer;


public class GetEnvironmentBinaryFile extends ros.communication.Service<GetEnvironmentBinaryFile.Request, GetEnvironmentBinaryFile.Response> {

  public static java.lang.String __s_getDataType() { return "re_srvs/GetEnvironmentBinaryFile"; }
  public static java.lang.String __s_getMD5Sum() { return "5ee8ef47af201972a853e50a0a644f44"; }

  public java.lang.String getDataType() { return GetEnvironmentBinaryFile.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return GetEnvironmentBinaryFile.__s_getMD5Sum(); }

  public GetEnvironmentBinaryFile.Request createRequest() {
    return new GetEnvironmentBinaryFile.Request();
  }

  public GetEnvironmentBinaryFile.Response createResponse() {
    return new GetEnvironmentBinaryFile.Response();
  }

static public class Request extends ros.communication.Message {

  public java.lang.String envUID = new java.lang.String();
  public java.lang.String filename = new java.lang.String();

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/GetEnvironmentBinaryFileRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "438fc866c4a0866b4f0dcf9d4e62dc23"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "5ee8ef47af201972a853e50a0a644f44"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string envUID\n" +
"string filename\n" +
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
    __l += 4 + envUID.length();
    __l += 4 + filename.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, envUID);
    Serialization.writeString(bb, filename);
  }

  public void deserialize(ByteBuffer bb) {
    envUID = Serialization.readString(bb);
    filename = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      envUID.equals(other.envUID) &&
      filename.equals(other.filename) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.envUID == null ? 0 : this.envUID.hashCode());
    result = prime * result + (this.filename == null ? 0 : this.filename.hashCode());
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {

  public boolean success;
  public ros.pkg.re_msgs.msg.File file = new ros.pkg.re_msgs.msg.File();

  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/GetEnvironmentBinaryFileResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "561f98c4157d288cbbbd58ca0ab1e87a"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "5ee8ef47af201972a853e50a0a644f44"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "bool success\n" +
"re_msgs/File file\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: re_msgs/File\n" +
"# This file representation is used to pass binary data to the RoboEarthDB.\n" +
"# As the endianess isn't stored, only files with a byte order mark (BOM) or\n" +
"# an implicitly specified endianess should be transferred.\n" +
"string name   # file name\n" +
"int8[] data   # binary data \n" +
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
    __l += file.serializationLength();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.put((byte)(success ? 1 : 0));
    file.serialize(bb, seq);
  }

  public void deserialize(ByteBuffer bb) {
    success = bb.get() != 0 ? true : false;
    file.deserialize(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
    return
      success == other.success &&
      file.equals(other.file) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.success ? 1231 : 1237);
    result = prime * result + (this.file == null ? 0 : this.file.hashCode());
    return result;
  }
} // class Response

} //class
