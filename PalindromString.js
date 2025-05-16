const isPalindrom=(str)=>{
	let reverse="";
	for(let char=str.length-1;char>=0;char--)
	{
		reverse=reverse+str[char];		
	}
	/*
	if(str==reverse)
	{
		true;
	}else
	{
		false;
	}
	*/
	return str==reverse?true:false;
};
console.log(isPalindrom("level"));