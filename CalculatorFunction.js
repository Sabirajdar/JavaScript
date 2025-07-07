function calculator(num1,num2,operator)
{
	let resutl;
	switch(operator)
	{
	case "+":
		resutl=num1+num2;
		return resutl;
	case "-":
	resutl=num1-num2;
	return resutl;
	
	case "*":
		resutl=num1*num2;
		return resutl;
	case "/":
		if(num2==0)
		{
			console.log("Invalid number");
		}else
		{
			resutl=num1/num2;
			return resutl;
		}
		default:return "no operator found";
	}
}
console.log(calculator(5,3,"+"));
console.log(calculator(5,3,"-"));
console.log(calculator(5,3,"*"));
console.log(calculator(5,15,"/"));