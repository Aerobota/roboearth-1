/* Auto-generated by genmsg_cpp for file /home/vitalij/ros/stacks/roboearth/re_srvs/srv/SetActionRecipe.srv */
#ifndef RE_SRVS_SERVICE_SETACTIONRECIPE_H
#define RE_SRVS_SERVICE_SETACTIONRECIPE_H
#include <string>
#include <vector>
#include <map>
#include <ostream>
#include "ros/serialization.h"
#include "ros/builtin_message_traits.h"
#include "ros/message_operations.h"
#include "ros/time.h"

#include "ros/macros.h"

#include "ros/assert.h"

#include "ros/service_traits.h"




namespace re_srvs
{
template <class ContainerAllocator>
struct SetActionRecipeRequest_ {
  typedef SetActionRecipeRequest_<ContainerAllocator> Type;

  SetActionRecipeRequest_()
  : cls()
  , id()
  , description()
  , recipe()
  , apiKey()
  {
  }

  SetActionRecipeRequest_(const ContainerAllocator& _alloc)
  : cls(_alloc)
  , id(_alloc)
  , description(_alloc)
  , recipe(_alloc)
  , apiKey(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _cls_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  cls;

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _id_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  id;

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _description_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  description;

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _recipe_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  recipe;

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _apiKey_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  apiKey;


  typedef boost::shared_ptr< ::re_srvs::SetActionRecipeRequest_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::SetActionRecipeRequest_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct SetActionRecipeRequest
typedef  ::re_srvs::SetActionRecipeRequest_<std::allocator<void> > SetActionRecipeRequest;

typedef boost::shared_ptr< ::re_srvs::SetActionRecipeRequest> SetActionRecipeRequestPtr;
typedef boost::shared_ptr< ::re_srvs::SetActionRecipeRequest const> SetActionRecipeRequestConstPtr;



template <class ContainerAllocator>
struct SetActionRecipeResponse_ {
  typedef SetActionRecipeResponse_<ContainerAllocator> Type;

  SetActionRecipeResponse_()
  : success(false)
  {
  }

  SetActionRecipeResponse_(const ContainerAllocator& _alloc)
  : success(false)
  {
  }

  typedef uint8_t _success_type;
  uint8_t success;


  typedef boost::shared_ptr< ::re_srvs::SetActionRecipeResponse_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::SetActionRecipeResponse_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct SetActionRecipeResponse
typedef  ::re_srvs::SetActionRecipeResponse_<std::allocator<void> > SetActionRecipeResponse;

typedef boost::shared_ptr< ::re_srvs::SetActionRecipeResponse> SetActionRecipeResponsePtr;
typedef boost::shared_ptr< ::re_srvs::SetActionRecipeResponse const> SetActionRecipeResponseConstPtr;


struct SetActionRecipe
{

typedef SetActionRecipeRequest Request;
typedef SetActionRecipeResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;
}; // struct SetActionRecipe
} // namespace re_srvs

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::SetActionRecipeRequest_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::SetActionRecipeRequest_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::SetActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "9bef47262d31dfac5059d4b1d74a6089";
  }

  static const char* value(const  ::re_srvs::SetActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x9bef47262d31dfacULL;
  static const uint64_t static_value2 = 0x5059d4b1d74a6089ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::SetActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/SetActionRecipeRequest";
  }

  static const char* value(const  ::re_srvs::SetActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::SetActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "\n\
string cls\n\
string id\n\
string description\n\
string recipe\n\
string apiKey\n\
\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::SetActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros


namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::SetActionRecipeResponse_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::SetActionRecipeResponse_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::SetActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "358e233cde0c8a8bcfea4ce193f8fc15";
  }

  static const char* value(const  ::re_srvs::SetActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x358e233cde0c8a8bULL;
  static const uint64_t static_value2 = 0xcfea4ce193f8fc15ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::SetActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/SetActionRecipeResponse";
  }

  static const char* value(const  ::re_srvs::SetActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::SetActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "bool success\n\
\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::SetActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator> struct IsFixedSize< ::re_srvs::SetActionRecipeResponse_<ContainerAllocator> > : public TrueType {};
} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::SetActionRecipeRequest_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.cls);
    stream.next(m.id);
    stream.next(m.description);
    stream.next(m.recipe);
    stream.next(m.apiKey);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct SetActionRecipeRequest_
} // namespace serialization
} // namespace ros


namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::SetActionRecipeResponse_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.success);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct SetActionRecipeResponse_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace service_traits
{
template<>
struct MD5Sum<re_srvs::SetActionRecipe> {
  static const char* value() 
  {
    return "f36f93785e5f7f843ef366910639a201";
  }

  static const char* value(const re_srvs::SetActionRecipe&) { return value(); } 
};

template<>
struct DataType<re_srvs::SetActionRecipe> {
  static const char* value() 
  {
    return "re_srvs/SetActionRecipe";
  }

  static const char* value(const re_srvs::SetActionRecipe&) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::SetActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "f36f93785e5f7f843ef366910639a201";
  }

  static const char* value(const re_srvs::SetActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::SetActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/SetActionRecipe";
  }

  static const char* value(const re_srvs::SetActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::SetActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "f36f93785e5f7f843ef366910639a201";
  }

  static const char* value(const re_srvs::SetActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::SetActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/SetActionRecipe";
  }

  static const char* value(const re_srvs::SetActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace service_traits
} // namespace ros

#endif // RE_SRVS_SERVICE_SETACTIONRECIPE_H

