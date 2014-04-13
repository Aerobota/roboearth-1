/* Auto-generated by genmsg_java.py for file /opt/ros/groovy/stacks/arm_navigation/arm_navigation_msgs/msg/Shape.msg */

package ros.pkg.arm_navigation_msgs.msg;

import java.nio.ByteBuffer;

public class Shape extends ros.communication.Message {
  static public final short SPHERE = 0;
  static public final short BOX = 1;
  static public final short CYLINDER = 2;
  static public final short MESH = 3;

  public short type;
  public double[] dimensions = new double[0];
  public int[] triangles = new int[0];
  public java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point> vertices = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point>();

  public Shape() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/Shape"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "59935940044147de75e7523b5d37c4d7"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "byte SPHERE=0\n" +
"byte BOX=1\n" +
"byte CYLINDER=2\n" +
"byte MESH=3\n" +
"\n" +
"byte type\n" +
"\n" +
"\n" +
"#### define sphere, box, cylinder ####\n" +
"# the origin of each shape is considered at the shape's center\n" +
"\n" +
"# for sphere\n" +
"# radius := dimensions[0]\n" +
"\n" +
"# for cylinder\n" +
"# radius := dimensions[0]\n" +
"# length := dimensions[1]\n" +
"# the length is along the Z axis\n" +
"\n" +
"# for box\n" +
"# size_x := dimensions[0]\n" +
"# size_y := dimensions[1]\n" +
"# size_z := dimensions[2]\n" +
"float64[] dimensions\n" +
"\n" +
"\n" +
"#### define mesh ####\n" +
"\n" +
"# list of triangles; triangle k is defined by tre vertices located\n" +
"# at indices triangles[3k], triangles[3k+1], triangles[3k+2]\n" +
"int32[] triangles\n" +
"geometry_msgs/Point[] vertices\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Point\n" +
"# This contains the position of a point in free space\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Shape clone() {
    Shape c = new Shape();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 1; // type
    __l += 4 + dimensions.length * 8; // dimensions
    __l += 4 + triangles.length * 4; // triangles
    __l += 4;
    for(ros.pkg.geometry_msgs.msg.Point val : vertices) {
      __l += val.serializationLength();
    }
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.put((byte)type);
    bb.putInt(dimensions.length);
    for(double val : dimensions) {
      bb.putDouble(val);
    }
    bb.putInt(triangles.length);
    for(int val : triangles) {
      bb.putInt(val);
    }
    bb.putInt(vertices.size());
    for(ros.pkg.geometry_msgs.msg.Point val : vertices) {
      val.serialize(bb, seq);
    }
  }

  public void deserialize(ByteBuffer bb) {
    type = (short)(bb.get() & 0xff);

    int __dimensions_len = bb.getInt();
    dimensions = new double[__dimensions_len];
    for(int __i=0; __i<__dimensions_len; __i++) {
      dimensions[__i] = bb.getDouble();
    }

    int __triangles_len = bb.getInt();
    triangles = new int[__triangles_len];
    for(int __i=0; __i<__triangles_len; __i++) {
      triangles[__i] = bb.getInt();
    }

    int __vertices_len = bb.getInt();
    vertices = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point>(__vertices_len);
    for(int __i=0; __i<__vertices_len; __i++) {
      ros.pkg.geometry_msgs.msg.Point __tmp = new ros.pkg.geometry_msgs.msg.Point();
      __tmp.deserialize(bb);
      vertices.add(__tmp);;
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Shape))
      return false;
    Shape other = (Shape) o;
    return
      type == other.type &&
      java.util.Arrays.equals(dimensions, other.dimensions) &&
      java.util.Arrays.equals(triangles, other.triangles) &&
      vertices.equals(other.vertices) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + this.type;
    result = prime * result + java.util.Arrays.hashCode(this.dimensions);
    result = prime * result + java.util.Arrays.hashCode(this.triangles);
    result = prime * result + (this.vertices == null ? 0 : this.vertices.hashCode());
    return result;
  }
} // class Shape

