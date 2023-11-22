from selenium import webdriver
from selenium.webdriver.common.by import By

# 1. start the session
driver = webdriver.Chrome("./chromedriver")

# 2. take action on browser
driver.get("https://www.selenium.dev/selenium/web/web-form.html")

# 3. request browser infromation
title = driver.title

# 4. Establish waiting strategy
driver.implicitly_wait(0.5)

# 5. Find an element
text_box = driver.find_element(by=By.NAME, value="my-text")
submit_buttom = driver.find_element(by=By.CSS_SELECTOR, value="button")

# 6. Take action on element
text_box.send_keys("selenium")
submit_buttom.click()

# 7. Request element information
message = driver.find_element(by=By.ID, value="message")
text = message.text

# 8. End the session
driver.quit()