"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.materialpersonmod.model.delete_person_response_wrapper_body import DeletePersonResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['DeletePersonResponseWrapperBody'] = DeletePersonResponseWrapperBody
from baiduads.materialpersonmod.model.delete_person_response_wrapper import DeletePersonResponseWrapper


class TestDeletePersonResponseWrapper(unittest.TestCase):
    """DeletePersonResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeletePersonResponseWrapper(self):
        """Test DeletePersonResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeletePersonResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()