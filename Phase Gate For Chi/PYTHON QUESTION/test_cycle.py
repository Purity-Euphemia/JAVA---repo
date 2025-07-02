import cycle
from unittest import TestCase


class TestCycle(TestCase):

    def test_that_calculate_menstrual_cycle_function_exists(self):
        cycle.calculate_menstrual_cycle(5, 28)

    def test_that_function_returns_correct_values(self):
        actual = cycle.calculate_menstrual_cycle(5, 28)
        expected = (33, 19, 17, 21, 14, 24)
        self.assertEqual(actual, expected)

        actual = cycle.calculate_menstrual_cycle(10, 30)
        expected = (40, 26, 24, 28, 21, 31)
        self.assertEqual(actual, expected)

    def test_that_function_rejects_invalid_last_period_day(self):
        self.assertRaises(ValueError, cycle.calculate_menstrual_cycle, -1, 28)
        self.assertRaises(ValueError, cycle.calculate_menstrual_cycle, 32, 28)

   
