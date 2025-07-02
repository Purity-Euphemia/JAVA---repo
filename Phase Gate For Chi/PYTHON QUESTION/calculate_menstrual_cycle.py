def calculate_menstrual_cycle(last_period_day, cycle_length):
	
	next_period = last_period_day + cycle_length
	ovulation = next_period - 14
	fertile_day_start = ovulation -2
	fertile_day_end = ovulation + 2
	safe_day_before = fertile_day_start - 3
	safe_day_after = fertile_day_end + 3

	print("Menstral Cycle Calculation:")
	print("Next Period Day:", next_period)
	print("Ovulation Day:", ovulation)
	print("Fertile Window: from Day:", fertile_day_start, "to", fertile_day_end)
	print("Safe Days: from Day:", safe_day_before, "to", safe_day_after)






print("WELCOME TO THE MENSURATION CYCLE TRACKER APP!")
last_period = int(input("Enter the day your last period started (e.g 1-31): "))
cycle_length = int(input("Enter your cycle length in day (e.g 28): "))
calculate_menstrual_cycle(last_period, cycle_length)