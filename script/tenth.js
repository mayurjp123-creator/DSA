	
let person=function(nm,ag)
   {     this.name=nm;
	 this.age=ag;
       this.dojob=function()   {
                        document.write("do-=== job hello<br/>");
                       }
}
let obj=new person("Raj",25);
obj.dojob()
document.write("<hr/>")
for(let prop in obj)
{ if(typeof obj[prop]=='function')
    obj[prop]();
document.write(prop+" "+obj[prop]);
document.write("<hr/>")
}
