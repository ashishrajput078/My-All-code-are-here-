import java.io.*;
import java.util.*;
public class palindrome {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String A=sc.next();
int n = A.length();
int count =0;
for (int i=0; i<n/2;i++){
if (A.charAt(i) !=A.charAt(n-1-i)) {
count = 1;}}
if(count==0) {
System.out.print("Yes");}
else {
System.out.print("No");}}}