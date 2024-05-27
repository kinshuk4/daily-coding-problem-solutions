import os

folder = 'problem-1701-1800'
# Step 1: Read the file content
with open(f'{folder}/README.md', 'r') as file:
    content = file.read()

# Step 2: Split the content by the 2nd level heading (##)
sections = content.split('##')

# Step 3: Reverse the order of the split content
sections = list(reversed(sections))

# Step 4: Join the reversed content back together
reversed_content = '##'.join(sections)

# Step 5: Write the reversed content back to the file
with open(f'{folder}/{folder}.md', 'w') as file:
    file.write(reversed_content)