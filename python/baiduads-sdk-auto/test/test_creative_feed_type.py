"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.creativefeed.model.audit_time_model import AuditTimeModel
from baiduads.creativefeed.model.pa_idea_template import PaIdeaTemplate
globals()['AuditTimeModel'] = AuditTimeModel
globals()['PaIdeaTemplate'] = PaIdeaTemplate
from baiduads.creativefeed.model.creative_feed_type import CreativeFeedType


class TestCreativeFeedType(unittest.TestCase):
    """CreativeFeedType unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCreativeFeedType(self):
        """Test CreativeFeedType"""
        # FIXME: construct object with mandatory attributes with example values
        # model = CreativeFeedType()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
