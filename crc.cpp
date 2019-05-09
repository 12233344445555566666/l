#include<iostream>
#include<string.h>
#include<stdio.h>
#include<stdlib.h>
using namespace std;

int crc(char *dw,char *rem,char *div,int flag){
strcpy(rem,dw);
if(flag){
for(int i=1;i<strlen(div);i++)
strcat(rem,"0");
}
for(int i=0;i<strlen(dw);i++){
  if(rem[i]=='1'){
    for(int j=0;j<strlen(div);j++){
      if(rem[i+j]==div[j])
      rem[i+j] = '0';
      else
      rem[i+j] = '1';
    }
  }
}

for (int i = 0; i < strlen(rem); i++)
  if (rem[i] == '1')
    return 0;
return 1;
}

int main(){
  char dw[50], rem[50], div[] = "10001000000100001";
  char dw1[50];
  cout<<"Enter data word :\n";
  cin>>dw;
  crc(dw,rem,div,1);
  cout << "The transmitted message is: " << dw << rem + strlen(dw) << endl;
  cout << "Enter the recevied message in binary" << endl;
  cin >> dw1;
  if (crc(dw1, rem, div, 0))
    cout << "No error in data" << endl;
  else
    cout << "Error in data transmission has occurred" << endl;

  return 0;
}