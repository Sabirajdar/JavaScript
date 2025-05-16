const isRevere=(str)=>{
	let reverse="";
	for(let char=str.length-1;char>=0;char--)
	{
		reverse=reverse+str[char];
	}
	console.log(reverse);
};
isRevere("shraddha");