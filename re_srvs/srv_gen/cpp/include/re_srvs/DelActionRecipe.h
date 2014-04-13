/* Auto-generated by genmsg_cpp for file /home/vitalij/ros/stacks/roboearth/re_srvs/srv/DelActionRecipe.srv */
#ifndef RE_SRVS_SERVICE_DELACTIONRECIPE_H
#define RE_SRVS_SERVICE_DELACTIONRECIPE_H
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
struct DelActionRecipeRequest_ {
  typedef DelActionRecipeRequest_<ContainerAllocator> Type;

  DelActionRecipeRequest_()
  : recipeUID()
  , apiKey()
  {
  }

  DelActionRecipeRequest_(const ContainerAllocator& _alloc)
  : recipeUID(_alloc)
  , apiKey(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _recipeUID_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  recipeUID;

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _apiKey_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  apiKey;


  typedef boost::shared_ptr< ::re_srvs::DelActionRecipeRequest_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::DelActionRecipeRequest_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct DelActionRecipeRequest
typedef  ::re_srvs::DelActionRecipeRequest_<std::allocator<void> > DelActionRecipeRequest;

typedef boost::shared_ptr< ::re_srvs::DelActionRecipeRequest> DelActionRecipeRequestPtr;
typedef boost::shared_ptr< ::re_srvs::DelActionRecipeRequest const> DelActionRecipeRequestConstPtr;



template <class ContainerAllocator>
struct DelActionRecipeResponse_ {
  typedef DelActionRecipeResponse_<ContainerAllocator> Type;

  DelActionRecipeResponse_()
  : success(false)
  {
  }

  DelActionRecipeResponse_(const ContainerAllocator& _alloc)
  : success(false)
  {
  }

  typedef uint8_t _success_type;
  uint8_t success;


  typedef boost::shared_ptr< ::re_srvs::DelActionRecipeResponse_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::DelActionRecipeResponse_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct DelActionRecipeResponse
typedef  ::re_srvs::DelActionRecipeResponse_<std::allocator<void> > DelActionRecipeResponse;

typedef boost::shared_ptr< ::re_srvs::DelActionRecipeResponse> DelActionRecipeResponsePtr;
typedef boost::shared_ptr< ::re_srvs::DelActionRecipeResponse const> DelActionRecipeResponseConstPtr;


struct DelActionRecipe
{

typedef DelActionRecipeRequest Request;
typedef DelActionRecipeResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;
}; // struct DelActionRecipe
} // namespace re_srvs

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::DelActionRecipeRequest_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::DelActionRecipeRequest_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::DelActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "316b185cf52a12d43931fdc8ff5191ca";
  }

  static const char* value(const  ::re_srvs::DelActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x316b185cf52a12d4ULL;
  static const uint64_t static_value2 = 0x3931fdc8ff5191caULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::DelActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/DelActionRecipeRequest";
  }

  static const char* value(const  ::re_srvs::DelActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::DelActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "string recipeUID\n\
string apiKey\n\
\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::DelActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros


namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::DelActionRecipeResponse_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::DelActionRecipeResponse_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::DelActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "358e233cde0c8a8bcfea4ce193f8fc15";
  }

  static const char* value(const  ::re_srvs::DelActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x358e233cde0c8a8bULL;
  static const uint64_t static_value2 = 0xcfea4ce193f8fc15ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::DelActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/DelActionRecipeResponse";
  }

  static const char* value(const  ::re_srvs::DelActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::DelActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "bool success\n\
\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::DelActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator> struct IsFixedSize< ::re_srvs::DelActionRecipeResponse_<ContainerAllocator> > : public TrueType {};
} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::DelActionRecipeRequest_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.recipeUID);
    stream.next(m.apiKey);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct DelActionRecipeRequest_
} // namespace serialization
} // namespace ros


namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::DelActionRecipeResponse_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.success);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct DelActionRecipeResponse_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace service_traits
{
template<>
struct MD5Sum<re_srvs::DelActionRecipe> {
  static const char* value() 
  {
    return "0e76089db06866f69154779bbe023e21";
  }

  static const char* value(const re_srvs::DelActionRecipe&) { return value(); } 
};

template<>
struct DataType<re_srvs::DelActionRecipe> {
  static const char* value() 
  {
    return "re_srvs/DelActionRecipe";
  }

  static const char* value(const re_srvs::DelActionRecipe&) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::DelActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "0e76089db06866f69154779bbe023e21";
  }

  static const char* value(const re_srvs::DelActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::DelActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/DelActionRecipe";
  }

  static const char* value(const re_srvs::DelActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::DelActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "0e76089db06866f69154779bbe023e21";
  }

  static const char* value(const re_srvs::DelActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::DelActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/DelActionRecipe";
  }

  static const char* value(const re_srvs::DelActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace service_traits
} // namespace ros

#endif // RE_SRVS_SERVICE_DELACTIONRECIPE_H

