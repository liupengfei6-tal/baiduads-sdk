"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.shield.model.shield_policy_mod_request import ShieldPolicyModRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['ShieldPolicyModRequest'] = ShieldPolicyModRequest
from baiduads.shield.model.update_shield_policy_request_wrapper import UpdateShieldPolicyRequestWrapper


class TestUpdateShieldPolicyRequestWrapper(unittest.TestCase):
    """UpdateShieldPolicyRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateShieldPolicyRequestWrapper(self):
        """Test UpdateShieldPolicyRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateShieldPolicyRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
