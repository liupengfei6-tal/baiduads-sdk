"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.videoediter.model.smart_audio_response_wrapper_body import SmartAudioResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['SmartAudioResponseWrapperBody'] = SmartAudioResponseWrapperBody
from baiduads.videoediter.model.smart_audio_response_wrapper import SmartAudioResponseWrapper


class TestSmartAudioResponseWrapper(unittest.TestCase):
    """SmartAudioResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testSmartAudioResponseWrapper(self):
        """Test SmartAudioResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = SmartAudioResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()