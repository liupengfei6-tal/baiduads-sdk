"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.materialcenterbindquery.model.get_material_bind_response_wrapper_body import GetMaterialBindResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['GetMaterialBindResponseWrapperBody'] = GetMaterialBindResponseWrapperBody
from baiduads.materialcenterbindquery.model.get_material_bind_response_wrapper import GetMaterialBindResponseWrapper


class TestGetMaterialBindResponseWrapper(unittest.TestCase):
    """GetMaterialBindResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetMaterialBindResponseWrapper(self):
        """Test GetMaterialBindResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetMaterialBindResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()