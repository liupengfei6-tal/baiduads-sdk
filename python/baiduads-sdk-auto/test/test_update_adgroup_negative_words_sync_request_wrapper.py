"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.negativeword.model.negative_word_mod_request import NegativeWordModRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['NegativeWordModRequest'] = NegativeWordModRequest
from baiduads.negativeword.model.update_adgroup_negative_words_sync_request_wrapper import UpdateAdgroupNegativeWordsSyncRequestWrapper


class TestUpdateAdgroupNegativeWordsSyncRequestWrapper(unittest.TestCase):
    """UpdateAdgroupNegativeWordsSyncRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateAdgroupNegativeWordsSyncRequestWrapper(self):
        """Test UpdateAdgroupNegativeWordsSyncRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateAdgroupNegativeWordsSyncRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
