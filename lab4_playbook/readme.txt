ansible-playbook playbook.yaml -i hosts -u oleg -t nginx
ansible-playbook playbook.yaml -i hosts -u oleg -t configs --ask-vault-pass
