#
# Removes any upstream branch
#
git remote rm upstream
#
# Adding upstream branch for lecturer/teacher main repository.
# works if and only if a correct maintainer opens the repository
# (github organizations, team-members)  
#
git remote add upstream https://github.com/jorgensta/gitpod-test.git