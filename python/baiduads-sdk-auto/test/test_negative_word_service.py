"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from negativeword.api.negative_word_service import NegativeWordService  # noqa: E501


class TestNegativeWordService(unittest.TestCase):
    """NegativeWordService unit test stubs"""

    def setUp(self):
        self.api = NegativeWordService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_duplicate_negative_words(self):
        """Test case for get_duplicate_negative_words

        """
        pass

    def test_update_adgroup_negative_words(self):
        """Test case for update_adgroup_negative_words

        """
        pass

    def test_update_adgroup_negative_words_sync(self):
        """Test case for update_adgroup_negative_words_sync

        """
        pass

    def test_update_campaign_negative_words_sync(self):
        """Test case for update_campaign_negative_words_sync

        """
        pass


if __name__ == '__main__':
    unittest.main()
