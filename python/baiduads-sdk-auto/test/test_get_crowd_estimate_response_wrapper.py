"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.crowdfunction.model.get_crowd_estimate_response_wrapper_body import GetCrowdEstimateResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['GetCrowdEstimateResponseWrapperBody'] = GetCrowdEstimateResponseWrapperBody
from baiduads.crowdfunction.model.get_crowd_estimate_response_wrapper import GetCrowdEstimateResponseWrapper


class TestGetCrowdEstimateResponseWrapper(unittest.TestCase):
    """GetCrowdEstimateResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetCrowdEstimateResponseWrapper(self):
        """Test GetCrowdEstimateResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetCrowdEstimateResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()