"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.platorderbusiness.model.reject_order_req import RejectOrderReq
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['RejectOrderReq'] = RejectOrderReq
from baiduads.platorderbusiness.model.reject_order_request_wrapper import RejectOrderRequestWrapper


class TestRejectOrderRequestWrapper(unittest.TestCase):
    """RejectOrderRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testRejectOrderRequestWrapper(self):
        """Test RejectOrderRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = RejectOrderRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()