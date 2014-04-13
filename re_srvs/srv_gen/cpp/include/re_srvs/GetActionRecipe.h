/* Auto-generated by genmsg_cpp for file /home/vitalij/ros/stacks/roboearth/re_srvs/srv/GetActionRecipe.srv */
#ifndef RE_SRVS_SERVICE_GETACTIONRECIPE_H
#define RE_SRVS_SERVICE_GETACTIONRECIPE_H
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
struct GetActionRecipeRequest_ {
  typedef GetActionRecipeRequest_<ContainerAllocator> Type;

  GetActionRecipeRequest_()
  : recipeUID()
  {
  }

  GetActionRecipeRequest_(const ContainerAllocator& _alloc)
  : recipeUID(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _recipeUID_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  recipeUID;


  typedef boost::shared_ptr< ::re_srvs::GetActionRecipeRequest_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::GetActionRecipeRequest_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct GetActionRecipeRequest
typedef  ::re_srvs::GetActionRecipeRequest_<std::allocator<void> > GetActionRecipeRequest;

typedef boost::shared_ptr< ::re_srvs::GetActionRecipeRequest> GetActionRecipeRequestPtr;
typedef boost::shared_ptr< ::re_srvs::GetActionRecipeRequest const> GetActionRecipeRequestConstPtr;



template <class ContainerAllocator>
struct GetActionRecipeResponse_ {
  typedef GetActionRecipeResponse_<ContainerAllocator> Type;

  GetActionRecipeResponse_()
  : success(false)
  , recipe()
  {
  }

  GetActionRecipeResponse_(const ContainerAllocator& _alloc)
  : success(false)
  , recipe(_alloc)
  {
  }

  typedef uint8_t _success_type;
  uint8_t success;

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _recipe_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  recipe;


  typedef boost::shared_ptr< ::re_srvs::GetActionRecipeResponse_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::GetActionRecipeResponse_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct GetActionRecipeResponse
typedef  ::re_srvs::GetActionRecipeResponse_<std::allocator<void> > GetActionRecipeResponse;

typedef boost::shared_ptr< ::re_srvs::GetActionRecipeResponse> GetActionRecipeResponsePtr;
typedef boost::shared_ptr< ::re_srvs::GetActionRecipeResponse const> GetActionRecipeResponseConstPtr;


struct GetActionRecipe
{

typedef GetActionRecipeRequest Request;
typedef GetActionRecipeResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;
}; // struct GetActionRecipe
} // namespace re_srvs

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::GetActionRecipeRequest_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::GetActionRecipeRequest_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::GetActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "c185b0a0dadfb80bdf015dc029f28975";
  }

  static const char* value(const  ::re_srvs::GetActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0xc185b0a0dadfb80bULL;
  static const uint64_t static_value2 = 0xdf015dc029f28975ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::GetActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/GetActionRecipeRequest";
  }

  static const char* value(const  ::re_srvs::GetActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::GetActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "string recipeUID\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::GetActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros


namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::GetActionRecipeResponse_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::GetActionRecipeResponse_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::GetActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "b0ad757bc68e9a07334378c3648051a5";
  }

  static const char* value(const  ::re_srvs::GetActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0xb0ad757bc68e9a07ULL;
  static const uint64_t static_value2 = 0x334378c3648051a5ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::GetActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/GetActionRecipeResponse";
  }

  static const char* value(const  ::re_srvs::GetActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::GetActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "bool success\n\
string recipe\n\
\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::GetActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::GetActionRecipeRequest_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.recipeUID);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct GetActionRecipeRequest_
} // namespace serialization
} // namespace ros


namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::GetActionRecipeResponse_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.success);
    stream.next(m.recipe);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct GetActionRecipeResponse_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace service_traits
{
template<>
struct MD5Sum<re_srvs::GetActionRecipe> {
  static const char* value() 
  {
    return "aa14c50affb322948b40216eb0e708a8";
  }

  static const char* value(const re_srvs::GetActionRecipe&) { return value(); } 
};

template<>
struct DataType<re_srvs::GetActionRecipe> {
  static const char* value() 
  {
    return "re_srvs/GetActionRecipe";
  }

  static const char* value(const re_srvs::GetActionRecipe&) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::GetActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "aa14c50affb322948b40216eb0e708a8";
  }

  static const char* value(const re_srvs::GetActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::GetActionRecipeRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/GetActionRecipe";
  }

  static const char* value(const re_srvs::GetActionRecipeRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::GetActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "aa14c50affb322948b40216eb0e708a8";
  }

  static const char* value(const re_srvs::GetActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::GetActionRecipeResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/GetActionRecipe";
  }

  static const char* value(const re_srvs::GetActionRecipeResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace service_traits
} // namespace ros

#endif // RE_SRVS_SERVICE_GETACTIONRECIPE_H

