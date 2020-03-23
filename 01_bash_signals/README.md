This example show how one can send signals in bash to a process and how a simple bash script can handle these signals.
Signals are a easy way to interact with a application from outside. Signals cant be "parameterized", so you cant send any data with the signal.

##open terminal 1
chmod +x ./its_a_trap.sh
./its_a_trap.sh &

##open terminal 2
kill -2 $PID (use PID shown in terminal 1)
kill -15 $PID (use PID shown in terminal 1)


