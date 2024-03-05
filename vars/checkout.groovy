def call(String branchname, String repourl) {

git branch: "${branchname}", url: "${repourl}"

}
