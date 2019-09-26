#include<iostream>

using namespace std;

int main(){
	int n, i, dc;//n=number to check, i=for looping, dc=divisor count
	
	//prompt the user to enter the number
	cout << "Enter a number:";
	//input the number and save it to n
	cin >> n;
	
	//count no of divisors starting from 2 until (number-1)
	for(i=2; i<n; i++){
		if(n%i == 0)
			dc++;
	}//for
	
	//since we are not checking for 1 or the same number divisibility, dc should be zero for prime number
	if(dc==0)
		cout<<"Number "<<n<<" is prime.";
	else
		cout<<"Number "<<n<<" is NOT prime.";
	
	return 0;
	
}//main