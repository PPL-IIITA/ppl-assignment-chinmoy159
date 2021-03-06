<h3>ppl-assignment-chinmoy159</h3>
<h4>IPPL430C Assignment</h4>
<h5>by --<br>Chinmoy Das<br>IIT2015028</h5>

This is the PPL Assignment, by Prof. Rahul Kala.<br>
This repository contains the questions 1 - 10 of the assignment, along with the <i>randomly</i> generated data for input.<br>
<h5>Programming done in JAVA</h5>

<h4>Operating System Used</h4>
<pre>Windows 10 Pro (x64)</pre>
<h4>Version of JAVA used</h4>
<pre>JAVA 8 (jdk 1.8 Update 92) 64 bit</pre>
<h4>Developer Tools used</h4>
<pre>Notepad++, javadoc, BlueJ</pre>

<h4>Documentation</h4>
All the documentation files are present in the folder <i>doc</i>.<br>
Open the file <pre>package-summary.html</pre>This is the index file of the documentation of all the files in the assignment.
<hr />
<i>I'm providing a simple shell script file to ease the task of compilation and generation of random code.<br><pre>tested on Zorin OS 12 Core (Ubuntu Based) (x64)</pre>Use the command<pre>sh compiler_java.sh</pre> on the terminal.<br>After this you just need to change the directory using <pre>cd bytecodes/</pre>and type<pre>java q$_assign</pre> to execute whichever question you want to.<hr />
<h4>Procedure (using command line on Linux Terminal), in case you do not wish to use the shell script !</h4>
<ol style = "list-style-type:circle">
<li>Keep all the Java source files <i> as well as </i> the input files in the same directory.</li>
<li>first of all we need to generate the random input for the programs</li>
<li>take all the files from the <i>Input</i> folder and put them where the java programs are kept.</li>
<li>run the command<pre>javac *.java</pre> to compile all the files.</li>
<li>If you wish to generate random input once again, type in <pre>java rand_data_boys</pre><pre>java rand_data_girls</pre><pre>java rand_gift_data</pre></li>
<li>now, run the program of whichever question you need to see the result.</li>
<li>run the command <pre>java q$_assign</pre>where, $ = question number.</li>
<li>all the inputs and output files are given in the folder <i>Input</i> & <i>Output</i> respectively.</li>
<li>All the outputs generated will be in the same folder</li>
</ol>

I've used <i>simple text files</i> to read the input from, as well as storing the output to.<br>
Output of<ol style = "list-style-type:circle">
<li><i>Question 1</i> is stored in <i>Couples.txt</i></li>
<li><i>Question 2</i> is stored in <i>Gift_log.txt</i></li>
<li><i>Question 4</i> is stored in <i>Broken_up.txt</i> and <i>New_couples.txt</i></li>
<li><i>Question 5</i> is stored in <i>Couples_Q5.txt</i></li>
<li><i>Question 6</i> is stored in <i>Q6_Breakups.txt</i></li>
<li><i>Question 7</i> is stored in <i>Q7_analysis.txt</i></li>
<li><i>Question 10</i> is stored in <i>Q10_Random_Ans.txt</i></li></ol>
<hr />
<h4>Edits (after first submission)</h4>
<ol style = "list-style-type:circle">
<li>Question 2 has been modified to <i>NOT</i> to take any kind of inputs from the terminal</li>
<li>Codes for Question 4, Question 5, Question 6, Question 7 have been added to the repository.</li>
<li>Question 10, which demands the creation of a data structure, has been added to the repository.</li>
<li>Also, added all the auxilary classes needed for my programs.</li>
</ol>
<h4>Output</h4>
Pre-generated output files are present in the folder <i>Output</i>
<h4>Input</h4>
Randomly generated input files are given in folder <i>Input</i> as text files.
