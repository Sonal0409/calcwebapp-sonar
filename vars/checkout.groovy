def call(String branch_name, String repo_url) {

git branch: '${branch_name}', url: '${repo_url}'

}
