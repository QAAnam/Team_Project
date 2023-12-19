# Team_Project
Selenium
# check git version
git --version
# confir username and email
git config --vsername user.name "Anam Kumar"
git config --vsername user.email "anam.kumar@gmail.com"
# edit user name and email
git config --vsername user.name --edit
# make any folder
mkdir foldername
# direct cmd in location
cd folder path
# initialize git
git init
# check items in folder
ls
ls -a

# check status of files
git status

# adding index 
git add FILENAME 
git add -a

# commit
git commit -m MASSAGE

# git log
git log
# switch branch 
git checkout BRANCHNAME
# create Branch
git branch BRANCHNAME
#create an switch branch
git checkout -b BRanchNAme

#Merge another brach in active
git merge ANotherBranch

# git ignore to ignore files and ass that file name in git ignore
touch .gitignore

# remote actions
git remote -v
git remote add origin <REMOTE_URL>

#push master branch
git branch -M master
git push -u origin

#cloning git clone url
git clone URL


