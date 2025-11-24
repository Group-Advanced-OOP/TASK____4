provider "local" {}

resource "local_file" "example" {
  content  = "Hello Terraform"
  filename = "sample.txt"
}
