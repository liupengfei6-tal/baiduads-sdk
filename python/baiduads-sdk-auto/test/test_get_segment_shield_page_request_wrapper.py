"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.segmentshield.model.segment_shield_query_request import SegmentShieldQueryRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['SegmentShieldQueryRequest'] = SegmentShieldQueryRequest
from baiduads.segmentshield.model.get_segment_shield_page_request_wrapper import GetSegmentShieldPageRequestWrapper


class TestGetSegmentShieldPageRequestWrapper(unittest.TestCase):
    """GetSegmentShieldPageRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetSegmentShieldPageRequestWrapper(self):
        """Test GetSegmentShieldPageRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetSegmentShieldPageRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
