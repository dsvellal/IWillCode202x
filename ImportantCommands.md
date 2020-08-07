# Git Commands

* To clone a repository

```
git clone https://github.com/dsvellal/IWillCode202x.git
```

* To pull from a repository

```
git pull --rebase
```

* To add files, before commiting them to the repository

```
git add <files_separated_by_space>

or

git add .
```

* To put a comment before commiting

```
git commit -m "my comment"
```

* To push from local repository to remote repository, into the branch "master"

```
git push origin master
```

* To check the status of the local branch
```
git status
```

* To delete stale branches from local/remote repositories
```
git remote prune origin
```

* To check all branches available in local and remote
```
git branch -a
```

* To create a local branch of the repository
```
git checkout -b <branch_name>
eg: git checkout -b wip_dsvellal
```

* To delete a local branch of the repository
```
git branch -D <branch_name>
eg: git branch -D wip_kiransm74
```

* To delete a remote branch in the repository
```
git push origin --delete <branch_name>

eg: git push origin --delete wip_kiransm74
```

* To create a temporary space to store all the added changes (after git add .), use "stash" command like this
```
git stash
Note: Perform this command after doing a git add .
```

* To apply the changes that are stashed on to a working repository, use git stash pop, like this
```
git stash pop
```
Generally git stash, and git stash pop are done when, I have made changes in my local branch, but i have to switch branches, and not lose my change. To do so, the following steps have to be followed:
1. On branch1, do 
- git add .
- git sash
2. Switch branches to branch2
- git checkout branch2
3. Rebase branch2
- git pull --rebase
4. Apply changes from branch1 to branch2
- git stash pop
5. Commit changes
- git commit -m "Changes from branch1"
6. Push
- git pull --rebase
- git push origin branch2
