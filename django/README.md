# Django

> I hear and I forget
>
> I see and I remember
>
> I do and I understand

## What is Django?

- It is web framework
- Web framework - is a software that supports the development of dynamic websites, applications and services.
- It provide set of tools and functionality that solves many common problems associated with web development
	- Security Features
	- Database access
	- Sessions
	- Template processing
	- URL routing
	- Internationalisation
	- Localisation

## Why need Django?

- imagine a mailbox (**port**)
- which monitor incoming letters (**requests**)
- this is done by **web server**
- **web server** reads the letter
- and then sends a **response** with web-page.
- But when you want to send something
- you need to have some content
- and **Django** is something that helps you create the content.
- 

## Architecture

Django follow **MVT** achitecture

- Model
  - in Django is a special kind of object
  - it is saved in the `Database`
  - **Database** is collections of data.
  - default Django database adapter - SQLite
- View
- Template

## Project Set-Up

1. Create project

``` django
django-admin startproject <project-name>
```

2. Create new app

```python
python manage.py startapp <app-name>
```

## Starting web server

1. Run Server

```python
python manage.py runserver

# If want to change server port
python manage.py runserver 8000

# If want to change server IP
python manage.py runserver 0.0.0.0:8000
```

## Migration

1. make migration - tell Django we have made some changes in model

```django
python manage.py makemigrations <app-name>
```

2. save to database

```django
python manage.py migrate <app-name>
```

## Create Super User

1. create **super user**

```django
python manage.py createsuperuser
Username: deepak
Email address: deepak@example.com
Password:	#password will not display
Password (again):	#password will not display
```

## Project Flow

- Create project
  - change **settings.py** as per requirement
- Create app
  - Add in `settings.py -> INSTALLED_APP`
- create model
  - create migrations file
  - save to database

## URLs

### What is URL?

- URL is web address.

### How do URLs work in Django?

`path('admin/', admin.site.urls),` 

- This line means that for every URL that starts with `admin/`
- Django will a corresponding view.
- This way we lot of admin URLs
- so isn't packed into single file
- It is more readable and cleaner

## Views

- View is a place where we put the **"logic"** of application.
- It will request infomation from the model
- and pass it to **template**
- Views are python functions

## Template



## Query-Set

- A **QuerySet** is a list of objects of a given **model**.
- It allow you to read the data from the database,
- filter it
- and order it
