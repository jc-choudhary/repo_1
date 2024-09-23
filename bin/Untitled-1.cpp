#include<iostream>
using namespace std;
class add
{
    public:
    add()
    {
        int a=10, b=12;
        int c=a+b;
        std::cout<<"Addition of two numbers is:"<<c;
    }
};
class A: public add
{
};

int main()
{
A obj ;
return 0;
}