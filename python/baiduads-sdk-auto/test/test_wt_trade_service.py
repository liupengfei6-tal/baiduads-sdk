"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from wttrade.api.wt_trade_service import WtTradeService  # noqa: E501


class TestWtTradeService(unittest.TestCase):
    """WtTradeService unit test stubs"""

    def setUp(self):
        self.api = WtTradeService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_trade_list(self):
        """Test case for get_trade_list

        """
        pass


if __name__ == '__main__':
    unittest.main()
