"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.materialarticle.model.article_ext_dto import ArticleExtDto
from baiduads.materialarticle.model.article_image import ArticleImage
globals()['ArticleExtDto'] = ArticleExtDto
globals()['ArticleImage'] = ArticleImage
from baiduads.materialarticle.model.tesla_article_add_request import TeslaArticleAddRequest


class TestTeslaArticleAddRequest(unittest.TestCase):
    """TeslaArticleAddRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testTeslaArticleAddRequest(self):
        """Test TeslaArticleAddRequest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = TeslaArticleAddRequest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
