"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from crowdshopping.api.crowd_shopping_service import CrowdShoppingService  # noqa: E501


class TestCrowdShoppingService(unittest.TestCase):
    """CrowdShoppingService unit test stubs"""

    def setUp(self):
        self.api = CrowdShoppingService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_eshop_trade_crowds(self):
        """Test case for get_eshop_trade_crowds

        """
        pass


if __name__ == '__main__':
    unittest.main()