#include <iostream>
using namespace std;

int main()
{
    int d[10],dr[10],c,c1,c2,c3;
    cout<<"Enter data\n";
    cin>>d[0]>>d[1]>>d[2]>>d[4];
    d[6] = d[0]^d[2]^d[4];
    d[5] = d[0]^d[1]^d[4];
    d[3] = d[0]^d[1]^d[2];
    cout<<"Transmitted data : ";
    for(int i=0;i<7;i++) cout<<d[i]<<" ";
    cout<<endl;

    cout<<"Enter Received data\n";
    for(int i=0;i<7;i++) cin>>dr[i];
    c1 = dr[6]^dr[4]^dr[2]^dr[0];
    c2 = dr[5]^dr[4]^dr[1]^dr[0];
    c3 = dr[3]^dr[2]^dr[1]^dr[0];
    c = c3*4 + c2*2 + c1;

    if(c==0) cout<<"No Error\n";
    else 
    {
        cout<<"Error at positon : "<<7-c+1<<endl;
        if(dr[7-c]==0) dr[7-c]=1;
        else dr[7-c]=0;
        cout<<"Correct Data : ";
        for(int i=0;i<7;i++) cout<<dr[i]<<" ";
        cout<<endl;
    }
    return 0;
}