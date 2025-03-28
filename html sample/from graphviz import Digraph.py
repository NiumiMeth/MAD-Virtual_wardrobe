from graphviz import Digraph

def generate_financial_app_flowchart():
    dot = Digraph(format='png')
    dot.attr(rankdir='TB')
    
    # Nodes
    dot.node('User', 'User')
    dot.node('Auth', 'Authentication System')
    dot.node('Expense', 'Expense Tracking')
    dot.node('Budget', 'Budgeting & Savings')
    dot.node('Invest', 'Investment Guidance')
    dot.node('Education', 'Financial Education')
    dot.node('Reports', 'Notifications & Reports')
    dot.node('Database', 'Database & AI Processing')
    
    # Edges
    dot.edge('User', 'Auth', 'Login/Register')
    dot.edge('Auth', 'Expense', 'Sync Transactions')
    dot.edge('Auth', 'Budget', 'Set Budgets')
    dot.edge('Auth', 'Invest', 'Get Advice')
    dot.edge('Auth', 'Education', 'Learn Finance')
    dot.edge('Auth', 'Reports', 'View Reports')
    dot.edge('Expense', 'Database', 'Store Data')
    dot.edge('Budget', 'Database', 'Save Goals')
    dot.edge('Invest', 'Database', 'Analyze Investments')
    dot.edge('Education', 'Database', 'Fetch Content')
    dot.edge('Reports', 'Database', 'Generate Insights')
    
    return dot

# Generate and render the flowchart
dot = generate_financial_app_flowchart()
dot.render('financial_app_flowchart')
