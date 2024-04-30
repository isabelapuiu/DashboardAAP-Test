from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

# Replace 'path_to_chromedriver' with the actual path to your chromedriver executable
driver = webdriver.Chrome()

# Navigate to the login page
driver.get("https://dashboard.parentsapp.co/login")

# Find the username and password fields and input your credentials
username_input = driver.find_element("id","login_email")
password_input = driver.find_element("id","login_password")

username_input.send_keys("ionel@gmail.com")
password_input.send_keys("ionel_password")

# Find and click the login button
login_button = driver.find_element("xpath","//button[@type='submit']")
login_button.click()


time.sleep(20)



# Close the browser window
driver.quit()
