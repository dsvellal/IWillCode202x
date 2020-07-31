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
---

* To delete a remote branch in the repository
```
git push origin --delete <branch_name>
eg: git push origin --delete wip_kiransm74
---
