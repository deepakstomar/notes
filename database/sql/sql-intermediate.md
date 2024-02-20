# SQL Intermediate

## Aggregate Functions

Aggregate functions use to perform operation across an entire column data.

- SUM
- MIN
- MAX
- AVG
- COUNT

### COUNT Function

It is use to count number of rows in a table.

```sql
#Example

SELECT COUNT(column_name)
FROM table_name;

# or

SELECT COUNT(*)
FROM table_name;
```

### SUM Function

It is use to calculate the sum of numeric values in a column.

```sql
# Example

SELECT SUM(column_name)
FROM table_name;
```

### AVG

It is use to compute the average value of numeric data in a column.

```sql
# Example

SELECT AVG(column_name)
FROM table_name;
```

### MIN

This function identifies the smallest value in a column.

```sql
# Example

SELECT MIN(column_name)
FROM table_name;
```

### MAX

This function identifies the largest value in a column.

```sql
# Example

SELECT MAX(column_name)
FROM table_name;
```

## Real-World Scenarios

**1. Calculating Total Sales for Financial Analysis**

- **Scenario:** A business wants to analyze its total sales over a specific period
- **Use Case:** The `SUM()` function can used to calculate the revenue generated from sales during the chosen time frame.

**2. Average Rating for Product Review**

- **Scenario:** An e-commerce platform wants to showcase the average rating of products based on customer reviews.
- **Use Case:** The `AVG()` function can calculate the average rating of products, helping customers make informed purchasing decisions.

**3. Identifying Most Active Users**

- **Scenario:** A social networking site wants to recognize its most active users based on the number of posts they've made.
- **Use** Case: The COUNT() function can tally the number of posts for each user, highlighting the most prolific contributors.

**4. Finding Lowest and Highest Prices**

- **Scenario:** A travel website wants to display the cheapest and most expensive flight options for users.
- **Use** Case: The MIN() and MAX() functions can identify the lowest and highest prices for flights, allowing users to quickly compare options.

**5. Tracking Student Performance in Education**

- **Scenario:** An educational institution wants to track student performance by calculating average scores and identifying top performers.
- **Use** Case: The AVG() function can compute the average scores of students, while the MAX() function can help find the highest scorers.
