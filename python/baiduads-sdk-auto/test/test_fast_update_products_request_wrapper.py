"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.bmcproduct.model.batch_fast_update_product_request import BatchFastUpdateProductRequest
from baiduads.common.model.api_request_header import ApiRequestHeader
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['BatchFastUpdateProductRequest'] = BatchFastUpdateProductRequest
from baiduads.bmcproduct.model.fast_update_products_request_wrapper import FastUpdateProductsRequestWrapper


class TestFastUpdateProductsRequestWrapper(unittest.TestCase):
    """FastUpdateProductsRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testFastUpdateProductsRequestWrapper(self):
        """Test FastUpdateProductsRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = FastUpdateProductsRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
