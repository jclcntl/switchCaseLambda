def pew = "hello"

switch (pew) {             
    case "hello":  
        printf "pewpew"
        break;
    case "hello2":  
        printf "pewpewpew"
        break;             
     default: 
        monthString = "Invalid month";
        break;         
}

def pewpewClosure = {
    printf "pewpew"
}

def pewpew2Closure = {
    printf "pewpew2"
}

def pew2 = ["hello":pewpewClosure, "hello2": pewpew2Closure]
        
pew2[pew].call()​
