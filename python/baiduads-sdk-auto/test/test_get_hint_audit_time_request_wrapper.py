"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.ocpc.model.hint_audit_time_request import HintAuditTimeRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['HintAuditTimeRequest'] = HintAuditTimeRequest
from baiduads.ocpc.model.get_hint_audit_time_request_wrapper import GetHintAuditTimeRequestWrapper


class TestGetHintAuditTimeRequestWrapper(unittest.TestCase):
    """GetHintAuditTimeRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetHintAuditTimeRequestWrapper(self):
        """Test GetHintAuditTimeRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetHintAuditTimeRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()