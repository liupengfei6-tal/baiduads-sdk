"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.indexapi.model.refresh_access_token_response_wrapper_body import RefreshAccessTokenResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['RefreshAccessTokenResponseWrapperBody'] = RefreshAccessTokenResponseWrapperBody
from baiduads.indexapi.model.refresh_access_token_response_wrapper import RefreshAccessTokenResponseWrapper


class TestRefreshAccessTokenResponseWrapper(unittest.TestCase):
    """RefreshAccessTokenResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testRefreshAccessTokenResponseWrapper(self):
        """Test RefreshAccessTokenResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = RefreshAccessTokenResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
