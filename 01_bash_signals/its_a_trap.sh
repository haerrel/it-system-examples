trap 'echo Received signal 2' 2
trap 'handler_sig_15' 15
handler_sig_15() {
    ((i++)) # just incrementing the variable here
}


i=0
while :
do
   echo -e "PID=$$\tvalue=$i" # print out PID and i-variable
   sleep 5
done
