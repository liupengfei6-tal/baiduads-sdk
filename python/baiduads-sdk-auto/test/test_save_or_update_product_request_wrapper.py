"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.platproduct.model.plat_product_save_request import PlatProductSaveRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['PlatProductSaveRequest'] = PlatProductSaveRequest
from baiduads.platproduct.model.save_or_update_product_request_wrapper import SaveOrUpdateProductRequestWrapper


class TestSaveOrUpdateProductRequestWrapper(unittest.TestCase):
    """SaveOrUpdateProductRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testSaveOrUpdateProductRequestWrapper(self):
        """Test SaveOrUpdateProductRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = SaveOrUpdateProductRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()