/* Auto-generated by genmsg_java.py for file /home/vitalij/ros/stacks/roboearth/re_msgs/msg/DetectedObject.msg */

package ros.pkg.re_msgs.msg;

import java.nio.ByteBuffer;

public class DetectedObject extends ros.communication.Message {

  public java.util.ArrayList<ros.pkg.re_msgs.msg.Pixel> points2d = new java.util.ArrayList<ros.pkg.re_msgs.msg.Pixel>();
  public java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point> points3d = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point>();
  public ros.pkg.geometry_msgs.msg.Pose pose = new ros.pkg.geometry_msgs.msg.Pose();
  public java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point> points3d_model = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point>();
  public int[] octave = new int[0];

  public DetectedObject() {
  }

  public static java.lang.String __s_getDataType() { return "re_msgs/DetectedObject"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "db086185ac6f68f8b4560ea38a8ec39b"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# Information of object detected in an image by re_vision\n" +
"#\n" +
"\n" +
"# detected points in the image\n" +
"Pixel[] points2d\n" +
"# detected 3d points in the camera reference\n" +
"geometry_msgs/Point[] points3d\n" +
"# pose of the object in the camera reference\n" +
"geometry_msgs/Pose pose\n" +
"# detected 3d points in the model reference\n" +
"geometry_msgs/Point[] points3d_model\n" +
"# detected 3d points octave\n" +
"int32[] octave\n" +
"\n" +
"================================================================================\n" +
"MSG: re_msgs/Pixel\n" +
"# top-left corner: (0,0)\n" +
"\n" +
"int32 x\n" +
"int32 y\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Point\n" +
"# This contains the position of a point in free space\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Pose\n" +
"# A representation of pose in free space, composed of postion and orientation. \n" +
"Point position\n" +
"Quaternion orientation\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Quaternion\n" +
"# This represents an orientation in free space in quaternion form.\n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"float64 w\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public DetectedObject clone() {
    DetectedObject c = new DetectedObject();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4;
    for(ros.pkg.re_msgs.msg.Pixel val : points2d) {
      __l += val.serializationLength();
    }
    __l += 4;
    for(ros.pkg.geometry_msgs.msg.Point val : points3d) {
      __l += val.serializationLength();
    }
    __l += pose.serializationLength();
    __l += 4;
    for(ros.pkg.geometry_msgs.msg.Point val : points3d_model) {
      __l += val.serializationLength();
    }
    __l += 4 + octave.length * 4; // octave
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putInt(points2d.size());
    for(ros.pkg.re_msgs.msg.Pixel val : points2d) {
      val.serialize(bb, seq);
    }
    bb.putInt(points3d.size());
    for(ros.pkg.geometry_msgs.msg.Point val : points3d) {
      val.serialize(bb, seq);
    }
    pose.serialize(bb, seq);
    bb.putInt(points3d_model.size());
    for(ros.pkg.geometry_msgs.msg.Point val : points3d_model) {
      val.serialize(bb, seq);
    }
    bb.putInt(octave.length);
    for(int val : octave) {
      bb.putInt(val);
    }
  }

  public void deserialize(ByteBuffer bb) {

    int __points2d_len = bb.getInt();
    points2d = new java.util.ArrayList<ros.pkg.re_msgs.msg.Pixel>(__points2d_len);
    for(int __i=0; __i<__points2d_len; __i++) {
      ros.pkg.re_msgs.msg.Pixel __tmp = new ros.pkg.re_msgs.msg.Pixel();
      __tmp.deserialize(bb);
      points2d.add(__tmp);;
    }

    int __points3d_len = bb.getInt();
    points3d = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point>(__points3d_len);
    for(int __i=0; __i<__points3d_len; __i++) {
      ros.pkg.geometry_msgs.msg.Point __tmp = new ros.pkg.geometry_msgs.msg.Point();
      __tmp.deserialize(bb);
      points3d.add(__tmp);;
    }
    pose.deserialize(bb);

    int __points3d_model_len = bb.getInt();
    points3d_model = new java.util.ArrayList<ros.pkg.geometry_msgs.msg.Point>(__points3d_model_len);
    for(int __i=0; __i<__points3d_model_len; __i++) {
      ros.pkg.geometry_msgs.msg.Point __tmp = new ros.pkg.geometry_msgs.msg.Point();
      __tmp.deserialize(bb);
      points3d_model.add(__tmp);;
    }

    int __octave_len = bb.getInt();
    octave = new int[__octave_len];
    for(int __i=0; __i<__octave_len; __i++) {
      octave[__i] = bb.getInt();
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof DetectedObject))
      return false;
    DetectedObject other = (DetectedObject) o;
    return
      points2d.equals(other.points2d) &&
      points3d.equals(other.points3d) &&
      pose.equals(other.pose) &&
      points3d_model.equals(other.points3d_model) &&
      java.util.Arrays.equals(octave, other.octave) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.points2d == null ? 0 : this.points2d.hashCode());
    result = prime * result + (this.points3d == null ? 0 : this.points3d.hashCode());
    result = prime * result + (this.pose == null ? 0 : this.pose.hashCode());
    result = prime * result + (this.points3d_model == null ? 0 : this.points3d_model.hashCode());
    result = prime * result + java.util.Arrays.hashCode(this.octave);
    return result;
  }
} // class DetectedObject
