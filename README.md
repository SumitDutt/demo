01 git --version
02 git config --global user.name "SumitDutt"
03 git config --global user.email "sumitdutt85@gmail.com"
04 git config -global color.ui auto (for colouring review)
05 git --list
06 git clone https://github.com/SumitDutt/demo.git or git cloe -b master https://github.com/SumitDutt/demo.git
07 git pull origin branch_name
08 git status
09 git add file_name
10 git add . (add all file)
11 git commit -m "message"
12 git push origin master(branch name) 
13 git push -u origin branch_name (Here -u use to remeber origin branch_name)
14 git int
15 git remote add origin https://github.com/SumitDutt/demo.git 
16 git remote -v
17 gt branch (disply branch name)
18 git branch branch_name (Create new banch)
19 git branch -M  master (Rename Branch name )
20 git checkout branch_Name (got to anothe branch)
21 git checkout -b branch_name (create new branch)
22 git branch -d branch_name (delete branch_name)
23 git diff branch_name
24 git diff --staged
25 git merge branch_name
26 git reset file_name (reset after add file)
27 git reset 
28 git reset HEAD~1 (reset after one commit)
29 git reset commit_id (reset only for remote but not in local machine)
30 git reset --hard commit_id (reset for local and remote both)
31 git log
32 git log --stat -M
33 git rm file_name
34 git mv existing-path new-path
35 git pull = git fetch +git merge
36  git rebase
37  git stash
38  git stash file_name
39  git stash pop
35 git stash drop



