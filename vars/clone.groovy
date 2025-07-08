def call(String url, String branch){
    echo "This is cloning the code from github"
    git url: "${url}", branch: "${branch}"
    echo "Code cloning Successfull"
}
