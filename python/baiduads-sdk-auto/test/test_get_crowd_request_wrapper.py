"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.crowd.model.crowd_query_request import CrowdQueryRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['CrowdQueryRequest'] = CrowdQueryRequest
from baiduads.crowd.model.get_crowd_request_wrapper import GetCrowdRequestWrapper


class TestGetCrowdRequestWrapper(unittest.TestCase):
    """GetCrowdRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetCrowdRequestWrapper(self):
        """Test GetCrowdRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetCrowdRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()