"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from platorderbusinessquery.api.plat_order_business_query_service import PlatOrderBusinessQueryService  # noqa: E501


class TestPlatOrderBusinessQueryService(unittest.TestCase):
    """PlatOrderBusinessQueryService unit test stubs"""

    def setUp(self):
        self.api = PlatOrderBusinessQueryService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_express_name_list(self):
        """Test case for get_express_name_list

        """
        pass

    def test_get_order_detail(self):
        """Test case for get_order_detail

        """
        pass

    def test_get_part_consign_order_list(self):
        """Test case for get_part_consign_order_list

        """
        pass


if __name__ == '__main__':
    unittest.main()
