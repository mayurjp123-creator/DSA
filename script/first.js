//factorial of number
var fact= (n) =>{
    let fact=1;
    for (let i=1;i<=n;i++){
        fact=fact*i;
    }
    return fact;
    
};

var sumofdigit= (sum)=>{
    let add=0;
    while(sum!=0){
        let r=sum%10;
        add=add+r;
        sum=Math.floor(sum/10);
        
    }
    return add;
}