def calculate_menstrual_cycle(last_period_day, cycle_length):
    if last_period_day < 1 or last_period_day > 31:
        raise ValueError("last_period_day must be between 1 and 31")
    

    next_period = last_period_day + cycle_length
    ovulation = next_period - 14
    fertile_start = ovulation - 2
    fertile_end = ovulation + 2
    safe_start = fertile_start - 3
    safe_end = fertile_end + 3

    return next_period, ovulation, fertile_start, fertile_end, safe_start, safe_end