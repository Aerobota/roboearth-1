#include <Eigen/Core>
#include <Eigen/LU>
#include <Eigen/QR>
#include <Eigen/Cholesky>
#include <Eigen/Geometry>
#include <Eigen/Jacobi>
#include <Eigen/Eigenvalues>
#include <iostream>

using namespace Eigen;
using namespace std;

int main(int, char**)
{
  cout.precision(3);
  Matrix3f A(3,3);
A << 1,2,3,  4,5,6,  7,8,10;
PartialPivLU<Matrix3f> luOfA(A); // compute LU decomposition of A
Vector3f b;
b << 3,3,4;
Vector3f x;
x = luOfA.solve(b);
cout << "The solution with right-hand side (3,3,4) is:" << endl;
cout << x << endl;
b << 1,1,1;
x = luOfA.solve(b);
cout << "The solution with right-hand side (1,1,1) is:" << endl;
cout << x << endl;

  return 0;
}
