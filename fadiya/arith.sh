function add()
{
  sum=$(($1+ $2))
  echo "sum = $sum"
  
 
}
echo "enter any two numbers"
read num1
read num2
add $num1 $num2

  
