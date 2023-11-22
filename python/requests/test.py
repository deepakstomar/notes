import requests
import dotenv

# url = 'https://duckduckg.com/html/'
url = 'https://api.github.com/event'

# payload = {'q':'python'}

r = requests.get(url)
print(r.status_code)
print(r.json())
# with open('requst_html.html', 'wb') as f:
#     f.write(r.content)
