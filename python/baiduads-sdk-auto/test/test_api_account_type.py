"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.account.model.api_offline_time_type import ApiOfflineTimeType
from baiduads.account.model.region_price_factor import RegionPriceFactor
globals()['ApiOfflineTimeType'] = ApiOfflineTimeType
globals()['RegionPriceFactor'] = RegionPriceFactor
from baiduads.account.model.api_account_type import ApiAccountType


class TestApiAccountType(unittest.TestCase):
    """ApiAccountType unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testApiAccountType(self):
        """Test ApiAccountType"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ApiAccountType()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()