import java.util.Arrays;
import java.util.Scanner;
class Recursivebinary 
{
static int RecursiveSearch(int arr[],int first,int last,int search)
{
int mid=(first+last)/2;
if(first<=last)
{
if(arr[mid]==search)
return mid;
else if(arr[mid]<search)
return RecursiveSearch(arr,mid+1,last,search);
else
return RecursiveSearch(arr,first,mid-1,search);
}
return -1;
}
public static void main(String args[])
{
int n,i,result,search;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements in array:");
n=sc.nextInt();
int arr[]= new int[n];
System.out.println("Enter the elements in array:");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
System.out.println("Array is");
for(i=0;i<n;i++)
{
System.out.println(arr[i]);
}
System.out.println("Enter the element to be searched:");
search=sc.nextInt();
int first=0,last=arr.length-1;
result=RecursiveSearch(arr,first,last,search);
if(result<0)
{
System.out.println("Element not found");
}
else
{
System.out.println("Element found");
}}
}
