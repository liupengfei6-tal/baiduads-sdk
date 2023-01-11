"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from baiduads.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from baiduads.exceptions import ApiAttributeError


def lazy_import():
    from baiduads.materialproduct.model.detail_category_dto import DetailCategoryDto
    from baiduads.materialproduct.model.params_dto import ParamsDto
    from baiduads.materialproduct.model.price_dto import PriceDto
    from baiduads.materialproduct.model.product_estate_bash_info_dto import ProductEstateBashInfoDto
    from baiduads.materialproduct.model.product_estate_houses_details_dto import ProductEstateHousesDetailsDto
    from baiduads.materialproduct.model.product_estate_images_dto import ProductEstateImagesDto
    from baiduads.materialproduct.model.product_estate_unit_type_info_dto import ProductEstateUnitTypeInfoDto
    from baiduads.materialproduct.model.word_count_dto import WordCountDto
    globals()['DetailCategoryDto'] = DetailCategoryDto
    globals()['ParamsDto'] = ParamsDto
    globals()['PriceDto'] = PriceDto
    globals()['ProductEstateBashInfoDto'] = ProductEstateBashInfoDto
    globals()['ProductEstateHousesDetailsDto'] = ProductEstateHousesDetailsDto
    globals()['ProductEstateImagesDto'] = ProductEstateImagesDto
    globals()['ProductEstateUnitTypeInfoDto'] = ProductEstateUnitTypeInfoDto
    globals()['WordCountDto'] = WordCountDto


class ProductExtDto(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        lazy_import()
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        lazy_import()
        return {
            'tags': ([str],),  # noqa: E501
            'params': ([ParamsDto],),  # noqa: E501
            'price': (PriceDto,),  # noqa: E501
            'subject': ([int],),  # noqa: E501
            'author': (str,),  # noqa: E501
            'serial_status': (int,),  # noqa: E501
            'word_count': (WordCountDto,),  # noqa: E501
            'year': (int,),  # noqa: E501
            'ios_address': (str,),  # noqa: E501
            'android_address': (str,),  # noqa: E501
            'suitable_crowd': (str,),  # noqa: E501
            'suitable_basic': (int,),  # noqa: E501
            'student_count': (int,),  # noqa: E501
            'course_highlights': ([str],),  # noqa: E501
            'trial_object': ([str],),  # noqa: E501
            'learn_goals': (str,),  # noqa: E501
            'teach_form': ([int],),  # noqa: E501
            'teach_features': ([int],),  # noqa: E501
            'feature_desc': (str,),  # noqa: E501
            'class_name': (str,),  # noqa: E501
            'class_date': (str,),  # noqa: E501
            'class_date_interval': ([str],),  # noqa: E501
            'class_time': (str,),  # noqa: E501
            'class_number': (int,),  # noqa: E501
            'bash_info': (ProductEstateBashInfoDto,),  # noqa: E501
            'unit_type_info': ([ProductEstateUnitTypeInfoDto],),  # noqa: E501
            'area_info': (str,),  # noqa: E501
            'houses_details': (ProductEstateHousesDetailsDto,),  # noqa: E501
            'other_images': (ProductEstateImagesDto,),  # noqa: E501
            'related_company': (str,),  # noqa: E501
            'estate_dynamic': (str,),  # noqa: E501
            'join_in_project': (str,),  # noqa: E501
            'franchisee_info': (str,),  # noqa: E501
            'qualification_info': (str,),  # noqa: E501
            'detail_category': ([DetailCategoryDto],),  # noqa: E501
            'class_type': (int,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'tags': 'tags',  # noqa: E501
        'params': 'params',  # noqa: E501
        'price': 'price',  # noqa: E501
        'subject': 'subject',  # noqa: E501
        'author': 'author',  # noqa: E501
        'serial_status': 'serialStatus',  # noqa: E501
        'word_count': 'wordCount',  # noqa: E501
        'year': 'year',  # noqa: E501
        'ios_address': 'iosAddress',  # noqa: E501
        'android_address': 'androidAddress',  # noqa: E501
        'suitable_crowd': 'suitableCrowd',  # noqa: E501
        'suitable_basic': 'suitableBasic',  # noqa: E501
        'student_count': 'studentCount',  # noqa: E501
        'course_highlights': 'courseHighlights',  # noqa: E501
        'trial_object': 'trialObject',  # noqa: E501
        'learn_goals': 'learnGoals',  # noqa: E501
        'teach_form': 'teachForm',  # noqa: E501
        'teach_features': 'teachFeatures',  # noqa: E501
        'feature_desc': 'featureDesc',  # noqa: E501
        'class_name': 'className',  # noqa: E501
        'class_date': 'classDate',  # noqa: E501
        'class_date_interval': 'classDateInterval',  # noqa: E501
        'class_time': 'classTime',  # noqa: E501
        'class_number': 'classNumber',  # noqa: E501
        'bash_info': 'bashInfo',  # noqa: E501
        'unit_type_info': 'unitTypeInfo',  # noqa: E501
        'area_info': 'areaInfo',  # noqa: E501
        'houses_details': 'housesDetails',  # noqa: E501
        'other_images': 'otherImages',  # noqa: E501
        'related_company': 'relatedCompany',  # noqa: E501
        'estate_dynamic': 'estateDynamic',  # noqa: E501
        'join_in_project': 'joinInProject',  # noqa: E501
        'franchisee_info': 'franchiseeInfo',  # noqa: E501
        'qualification_info': 'qualificationInfo',  # noqa: E501
        'detail_category': 'detailCategory',  # noqa: E501
        'class_type': 'classType',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """ProductExtDto - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            tags ([str]): [optional]  # noqa: E501
            params ([ParamsDto]): [optional]  # noqa: E501
            price (PriceDto): [optional]  # noqa: E501
            subject ([int]): [optional]  # noqa: E501
            author (str): [optional]  # noqa: E501
            serial_status (int): [optional]  # noqa: E501
            word_count (WordCountDto): [optional]  # noqa: E501
            year (int): [optional]  # noqa: E501
            ios_address (str): [optional]  # noqa: E501
            android_address (str): [optional]  # noqa: E501
            suitable_crowd (str): [optional]  # noqa: E501
            suitable_basic (int): [optional]  # noqa: E501
            student_count (int): [optional]  # noqa: E501
            course_highlights ([str]): [optional]  # noqa: E501
            trial_object ([str]): [optional]  # noqa: E501
            learn_goals (str): [optional]  # noqa: E501
            teach_form ([int]): [optional]  # noqa: E501
            teach_features ([int]): [optional]  # noqa: E501
            feature_desc (str): [optional]  # noqa: E501
            class_name (str): [optional]  # noqa: E501
            class_date (str): [optional]  # noqa: E501
            class_date_interval ([str]): [optional]  # noqa: E501
            class_time (str): [optional]  # noqa: E501
            class_number (int): [optional]  # noqa: E501
            bash_info (ProductEstateBashInfoDto): [optional]  # noqa: E501
            unit_type_info ([ProductEstateUnitTypeInfoDto]): [optional]  # noqa: E501
            area_info (str): [optional]  # noqa: E501
            houses_details (ProductEstateHousesDetailsDto): [optional]  # noqa: E501
            other_images (ProductEstateImagesDto): [optional]  # noqa: E501
            related_company (str): [optional]  # noqa: E501
            estate_dynamic (str): [optional]  # noqa: E501
            join_in_project (str): [optional]  # noqa: E501
            franchisee_info (str): [optional]  # noqa: E501
            qualification_info (str): [optional]  # noqa: E501
            detail_category ([DetailCategoryDto]): [optional]  # noqa: E501
            class_type (int): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, *args, **kwargs):  # noqa: E501
        """ProductExtDto - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            tags ([str]): [optional]  # noqa: E501
            params ([ParamsDto]): [optional]  # noqa: E501
            price (PriceDto): [optional]  # noqa: E501
            subject ([int]): [optional]  # noqa: E501
            author (str): [optional]  # noqa: E501
            serial_status (int): [optional]  # noqa: E501
            word_count (WordCountDto): [optional]  # noqa: E501
            year (int): [optional]  # noqa: E501
            ios_address (str): [optional]  # noqa: E501
            android_address (str): [optional]  # noqa: E501
            suitable_crowd (str): [optional]  # noqa: E501
            suitable_basic (int): [optional]  # noqa: E501
            student_count (int): [optional]  # noqa: E501
            course_highlights ([str]): [optional]  # noqa: E501
            trial_object ([str]): [optional]  # noqa: E501
            learn_goals (str): [optional]  # noqa: E501
            teach_form ([int]): [optional]  # noqa: E501
            teach_features ([int]): [optional]  # noqa: E501
            feature_desc (str): [optional]  # noqa: E501
            class_name (str): [optional]  # noqa: E501
            class_date (str): [optional]  # noqa: E501
            class_date_interval ([str]): [optional]  # noqa: E501
            class_time (str): [optional]  # noqa: E501
            class_number (int): [optional]  # noqa: E501
            bash_info (ProductEstateBashInfoDto): [optional]  # noqa: E501
            unit_type_info ([ProductEstateUnitTypeInfoDto]): [optional]  # noqa: E501
            area_info (str): [optional]  # noqa: E501
            houses_details (ProductEstateHousesDetailsDto): [optional]  # noqa: E501
            other_images (ProductEstateImagesDto): [optional]  # noqa: E501
            related_company (str): [optional]  # noqa: E501
            estate_dynamic (str): [optional]  # noqa: E501
            join_in_project (str): [optional]  # noqa: E501
            franchisee_info (str): [optional]  # noqa: E501
            qualification_info (str): [optional]  # noqa: E501
            detail_category ([DetailCategoryDto]): [optional]  # noqa: E501
            class_type (int): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")
