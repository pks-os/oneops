/*******************************************************************************
 *
 *   Copyright 2015 Walmart, Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *******************************************************************************/
package com.oneops.cms.util;

/**
 * Represents internal error
 */
public interface CmsError {

  /**
   * Fist digit of code is type of error:
   *
   * 1 - CmsException 2 - DJException 3 - MDException 4 - OpsException 5 - CmsSecurityException
   */
  int CMS_EXCEPTION = 1;
  int DJ_EXCEPTION = 2;
  int MD_EXCEPTION = 3;
  int OPS_EXCEPTION = 4;
  int VALIDATION_EXCEPTION = 5;
  int TRANSISTOR_EXCEPTION = 6;
  int RUNTIME_EXCEPTION = 9;

  /* CMS errors */
  int CMS_CANT_FIGURE_OUT_TEMPLATE_FOR_MANIFEST_ERROR = 1001;
  int CMS_CI_OF_NS_CLASS_NAME_ALREADY_EXIST_ERROR = 1002;
  int CMS_BAD_WO_CLASS_ERROR = 1003;
  int CMS_CANT_FIND_BINDING_FOR_CI_ID_ERROR = 1004;
  int CMS_CANT_FIND_REALIZEDAS_FOR_BOMC_ERROR = 1005;
  int CMS_NO_CI_WITH_GIVEN_ID_ERROR = 1006;
  int CMS_NO_RELATION_WITH_GIVEN_ID_ERROR = 1007;
  int CMS_CANT_FIND_REQUIRES_FOR_CI_ERROR = 1008;
  int CMS_DUPCI_NAME_ERROR = 1008;

  int DJ_OPEN_RELEASE_FOR_NAMESPACE_ERROR = 2001;
  int DJ_CANT_RESOLVE_RELEASE_STATE_ERROR = 2002;
  int DJ_CANT_RESOLVE_CI_STATE_ERROR = 2003;
  int DJ_CANT_RESOLVE_NAMESPACE_ERROR = 2004;
  int DJ_MUST_SPECIFY_USER_ID_ERROR = 2005;
  int DJ_RFC_RELEASE_NOT_OPEN_ERROR = 2006;
  int DJ_NO_CI_WITH_GIVEN_ID_ERROR = 2007;
  int DJ_VALIDATION_ERROR = 2008;
  int DJ_RFC_DOESNT_EXIST_ERROR = 2009;
  int DJ_NO_RELATION_WITH_GIVEN_ID_ERROR = 2010;
  int DJ_MORE_THEN_ONE_RFC_IN_RELEASE_ERROR = 2011;
  int DJ_RELATION_RFC_DOESNT_EXIST_ERROR = 2012;
  int DJ_STATE_ALREADY_DEPLOYMENT_ERROR = 2013;
  int DJ_DEPLOYMENT_NOT_ACTIVE_ERROR = 2014;
  int DJ_DEPLOYMENT_NOT_FAILED_ERROR = 2015;
  int DJ_DEPLOYMENT_NOT_ACTIVE_FAILED_ERROR = 2016;
  int DJ_NOT_SUPPORTED_STATE_ERROR = 2017;
  int DJ_INCONSITENCY_WITH_DEPLOYMENT_RECORD_ERROR = 2018;
  int DJ_SYSTEM_ERROR = 2019;
  int DJ_CI_RFC_WITH_THIS_NAME_ALREADY_EXIST_ERROR = 2019;
  int DJ_CI_ID_IS_NEED_ERROR = 2020;
  int DJ_MUST_SPECIFY_CI_ID_OR_NSPATH_ERROR = 2021;
  int DJ_NO_DEPLOYMENT_WITH_GIVEN_ID_ERROR = 2022;
  int DJ_NO_RELEASE_WITH_GIVEN_ID_ERROR = 2023;
  int DJ_NO_RFC_WITH_GIVEN_ID_ERROR = 2024;
  int DJ_OPEN_RELEASE_WRONG_TYPE_ERROR = 2025;
  int DJ_BAD_CI_NAME_ERROR = 2026;
  int DJ_EXPR_EVAL_ERROR = 2027;
  int DJ_INVALID_COMPONENT_ERROR = 2028;
  int DJ_BAD_TEMPLATE_NAME_ERROR = 2029;


  int MD_SUPERCLASS_NOT_FOUND_ERROR = 3001;
  int MD_METADATA_NOT_FOUND_ERROR = 3002;
  int MD_VALIDATION_ERROR = 3003;
  int MD_CONFLICT_DATA_TYPE_ERROR = 3004;
  int MD_NO_DELETE_HAS_CI_ERROR = 3005;
  int MD_RELATION_NOT_FOUND_ERROR = 3006;
  int MD_ATTRIBUTE_CONFLICT_ERROR = 3007;
  int MD_CLASS_NOT_FOUND_IN_FROM_ERROR = 3008;
  int MD_CLASS_NOT_FOUND_IN_TO_ERROR = 3009;
  int MD_TARGET_IS_MISSING_ERROR = 3010;
  int MD_NO_CLASS_WITH_GIVEN_ID_ERROR = 3011;
  int MD_NO_CLASS_WITH_GIVEN_NAME_ERROR = 3012;
  int MD_NO_RELATION_WITH_GIVEN_NAME_ERROR = 3013;

  int OPS_THERE_IS_NO_PROCEDURE_DEFINITION_ERROR = 4001;
  int OPS_ONE_ACTION_MUST_BE_ERROR = 4002;
  int OPS_ALREADY_HAVE_ACTIVE_PROCEDURE_ERROR = 4003;
  int OPS_ALREADY_HAVE_OPENED_RELEASE_ERROR = 4004;
  int OPS_PROCEDURE_NOT_FOUND_ERROR = 4005;
  int OPS_MUST_SPECIFY_CI_ID_OR_NSPATH_ERROR = 4006;
  int OPS_ALREADY_HAVE_ACTIVE_DEPLOYMENT_ERROR = 4007;
  int OPS_ALREADY_HAVE_ACTIVE_ACTION_ERROR = 4008;
  int OPS_ACTION_IS_NOT_IN_PROGRESS = 4009;

  int VALIDATION_COMMON_ERROR = 5001;
  int VALIDATION_COULDNT_FIND_CI_FOR_UPDATE_ERROR = 5002;
  int VALIDATION_PROCEDURE_ID_OR_DEFINITION_SHOULD_BE_ERROR = 5003;

  int TRANSISTOR_ACTIVE_DEPLOYMENT_EXISTS = 6001;
  int TRANSISTOR_CM_ATTRIBUTE_HAS_BAD_GLOBAL_VAR_REF = 6002;
  int TRANSISTOR_CANNOT_TRAVERSE = 6003;
  int TRANSISTOR_BAD_NS_PATH = 6004;
  int TRANSISTOR_BAD_SCOPE = 6005;
  int TRANSISTOR_CANNOT_GET_ASSEMBLY = 6006;
  int TRANSISTOR_CANNOT_AVAILABILITY_MODE = 6007;
  int TRANSISTOR_CANNOT_CORRESPONDING_OBJECT = 6008;
  int TRANSISTOR_BAD_CLASS_NAME = 6009;
  int TRANSISTOR_CANNOT_ORG_BY_SCOPE = 6010;
  int TRANSISTOR_CANNOT_FIND_ASSEMBLY = 6011;
  int TRANSISTOR_CANNOT_FIND_ENVIRONMENT = 6012;
  int TRANSISTOR_ENVIRONMENT_IN_LOCKED_STATE = 6013;
  int TRANSISTOR_OPEN_MANIFEST_RELEASE = 6014;
  int TRANSISTOR_OPEN_BOM_RELEASE = 6014;
  int TRANSISTOR_BOM_INSTANCES_EXIST = 6015;
  int TRANSISTOR_BOM_GENERATION_FAILED = 6016;
  int TRANSISTOR_ALL_INSTANCES_SECONDARY = 6017;
  int TRANSISTOR_MISSING_ENTRY_POINT = 6018;
  int TRANSISTOR_MISSING_CLOUD_SERVICES = 6019;
  int TRANSISTOR_CM_ATTRIBUTE_HAS_CYCLIC_REF = 6020;
  int TRANSISTOR_CANNOT_DEPLOY_PACK_TO_CLOUD = 6021;
  int QUOTA_ERROR = 6021;


  int getErrorCode();
}
