"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from platbusinessorderrefund.api.plat_business_order_refund_service import PlatBusinessOrderRefundService  # noqa: E501


class TestPlatBusinessOrderRefundService(unittest.TestCase):
    """PlatBusinessOrderRefundService unit test stubs"""

    def setUp(self):
        self.api = PlatBusinessOrderRefundService()  # noqa: E501

    def tearDown(self):
        pass

    def test_agree_order_refund(self):
        """Test case for agree_order_refund

        """
        pass

    def test_agree_order_return(self):
        """Test case for agree_order_return

        """
        pass

    def test_query_order_refund_info(self):
        """Test case for query_order_refund_info

        """
        pass

    def test_query_order_refund_list(self):
        """Test case for query_order_refund_list

        """
        pass

    def test_reject_order_refund(self):
        """Test case for reject_order_refund

        """
        pass


if __name__ == '__main__':
    unittest.main()
