/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dsgc.v20190723;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dsgc.v20190723.models.*;

public class DsgcClient extends AbstractClient{
    private static String endpoint = "dsgc.tencentcloudapi.com";
    private static String service = "dsgc";
    private static String version = "2019-07-23";
    
    public DsgcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DsgcClient(Credential credential, String region, ClientProfile profile) {
        super(DsgcClient.endpoint, DsgcClient.version, credential, region, profile);
    }

    /**
     *授权用户云资源
     * @param req AuthorizeDSPAMetaResourcesRequest
     * @return AuthorizeDSPAMetaResourcesResponse
     * @throws TencentCloudSDKException
     */
    public AuthorizeDSPAMetaResourcesResponse AuthorizeDSPAMetaResources(AuthorizeDSPAMetaResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AuthorizeDSPAMetaResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AuthorizeDSPAMetaResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AuthorizeDSPAMetaResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定或解绑COS桶
     * @param req BindDSPAResourceCosBucketsRequest
     * @return BindDSPAResourceCosBucketsResponse
     * @throws TencentCloudSDKException
     */
    public BindDSPAResourceCosBucketsResponse BindDSPAResourceCosBuckets(BindDSPAResourceCosBucketsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindDSPAResourceCosBucketsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BindDSPAResourceCosBucketsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindDSPAResourceCosBuckets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定或解绑数据库实例DB
     * @param req BindDSPAResourceDatabasesRequest
     * @return BindDSPAResourceDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public BindDSPAResourceDatabasesResponse BindDSPAResourceDatabases(BindDSPAResourceDatabasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindDSPAResourceDatabasesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BindDSPAResourceDatabasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindDSPAResourceDatabases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *复制合规组模版
     * @param req CopyDSPATemplateRequest
     * @return CopyDSPATemplateResponse
     * @throws TencentCloudSDKException
     */
    public CopyDSPATemplateResponse CopyDSPATemplate(CopyDSPATemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyDSPATemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CopyDSPATemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CopyDSPATemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建资产梳理报表导出重试任务
     * @param req CreateAssetSortingReportRetryTaskRequest
     * @return CreateAssetSortingReportRetryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetSortingReportRetryTaskResponse CreateAssetSortingReportRetryTask(CreateAssetSortingReportRetryTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetSortingReportRetryTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAssetSortingReportRetryTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAssetSortingReportRetryTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建资产梳理报告任务
     * @param req CreateAssetSortingReportTaskRequest
     * @return CreateAssetSortingReportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetSortingReportTaskResponse CreateAssetSortingReportTask(CreateAssetSortingReportTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssetSortingReportTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAssetSortingReportTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAssetSortingReportTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建识别规则
     * @param req CreateClassificationRuleRequest
     * @return CreateClassificationRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateClassificationRuleResponse CreateClassificationRule(CreateClassificationRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClassificationRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClassificationRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClassificationRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险项页面---创建风险等级
     * @param req CreateDSPAAssessmentRiskLevelRequest
     * @return CreateDSPAAssessmentRiskLevelResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPAAssessmentRiskLevelResponse CreateDSPAAssessmentRiskLevel(CreateDSPAAssessmentRiskLevelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPAAssessmentRiskLevelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPAAssessmentRiskLevelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPAAssessmentRiskLevel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险评估模版---创建风险评估模版
     * @param req CreateDSPAAssessmentRiskTemplateRequest
     * @return CreateDSPAAssessmentRiskTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPAAssessmentRiskTemplateResponse CreateDSPAAssessmentRiskTemplate(CreateDSPAAssessmentRiskTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPAAssessmentRiskTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPAAssessmentRiskTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPAAssessmentRiskTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建DSPA风险评估任务
     * @param req CreateDSPAAssessmentTaskRequest
     * @return CreateDSPAAssessmentTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPAAssessmentTaskResponse CreateDSPAAssessmentTask(CreateDSPAAssessmentTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPAAssessmentTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPAAssessmentTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPAAssessmentTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增COS分类分级扫描任务，单个用户最多允许创建100个任务。
     * @param req CreateDSPACOSDiscoveryTaskRequest
     * @return CreateDSPACOSDiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPACOSDiscoveryTaskResponse CreateDSPACOSDiscoveryTask(CreateDSPACOSDiscoveryTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPACOSDiscoveryTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPACOSDiscoveryTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPACOSDiscoveryTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增分类，单个用户最多允许创建100个数据分类。
     * @param req CreateDSPACategoryRequest
     * @return CreateDSPACategoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPACategoryResponse CreateDSPACategory(CreateDSPACategoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPACategoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPACategoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPACategory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建分类关联关系
     * @param req CreateDSPACategoryRelationRequest
     * @return CreateDSPACategoryRelationResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPACategoryRelationResponse CreateDSPACategoryRelation(CreateDSPACategoryRelationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPACategoryRelationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPACategoryRelationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPACategoryRelation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增分类分级模板，单个用户最多允许创建100个合规组。
     * @param req CreateDSPAComplianceGroupRequest
     * @return CreateDSPAComplianceGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPAComplianceGroupResponse CreateDSPAComplianceGroup(CreateDSPAComplianceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPAComplianceGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPAComplianceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPAComplianceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建合规组分类规则关联关系
     * @param req CreateDSPAComplianceRulesRequest
     * @return CreateDSPAComplianceRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPAComplianceRulesResponse CreateDSPAComplianceRules(CreateDSPAComplianceRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPAComplianceRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPAComplianceRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPAComplianceRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加COS元数据
     * @param req CreateDSPACosMetaResourcesRequest
     * @return CreateDSPACosMetaResourcesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPACosMetaResourcesResponse CreateDSPACosMetaResources(CreateDSPACosMetaResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPACosMetaResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPACosMetaResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPACosMetaResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加用户云上数据库类型资源
     * @param req CreateDSPADbMetaResourcesRequest
     * @return CreateDSPADbMetaResourcesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPADbMetaResourcesResponse CreateDSPADbMetaResources(CreateDSPADbMetaResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPADbMetaResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPADbMetaResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPADbMetaResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增分类分级规则，单个用户最多允许创建200个规则。

     * @param req CreateDSPADiscoveryRuleRequest
     * @return CreateDSPADiscoveryRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPADiscoveryRuleResponse CreateDSPADiscoveryRule(CreateDSPADiscoveryRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPADiscoveryRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPADiscoveryRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPADiscoveryRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增分类分级任务，单个用户最多允许创建100个任务。
     * @param req CreateDSPADiscoveryTaskRequest
     * @return CreateDSPADiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPADiscoveryTaskResponse CreateDSPADiscoveryTask(CreateDSPADiscoveryTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPADiscoveryTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPADiscoveryTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPADiscoveryTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增分级，单个Casb实例最多允许创建100个数据分级
     * @param req CreateDSPALevelGroupRequest
     * @return CreateDSPALevelGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPALevelGroupResponse CreateDSPALevelGroup(CreateDSPALevelGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPALevelGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPALevelGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPALevelGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加用户云上资源列表
     * @param req CreateDSPAMetaResourcesRequest
     * @return CreateDSPAMetaResourcesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPAMetaResourcesResponse CreateDSPAMetaResources(CreateDSPAMetaResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPAMetaResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPAMetaResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPAMetaResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建用户自建云资源
     * @param req CreateDSPASelfBuildMetaResourceRequest
     * @return CreateDSPASelfBuildMetaResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDSPASelfBuildMetaResourceResponse CreateDSPASelfBuildMetaResource(CreateDSPASelfBuildMetaResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDSPASelfBuildMetaResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDSPASelfBuildMetaResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDSPASelfBuildMetaResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建规则别名
     * @param req CreateIdentifyRuleAnotherNameRequest
     * @return CreateIdentifyRuleAnotherNameResponse
     * @throws TencentCloudSDKException
     */
    public CreateIdentifyRuleAnotherNameResponse CreateIdentifyRuleAnotherName(CreateIdentifyRuleAnotherNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIdentifyRuleAnotherNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIdentifyRuleAnotherNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIdentifyRuleAnotherName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建新分类
     * @param req CreateNewClassificationRequest
     * @return CreateNewClassificationResponse
     * @throws TencentCloudSDKException
     */
    public CreateNewClassificationResponse CreateNewClassification(CreateNewClassificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNewClassificationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNewClassificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNewClassification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建或复制分级分类模板
     * @param req CreateOrCopyStandardRequest
     * @return CreateOrCopyStandardResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrCopyStandardResponse CreateOrCopyStandard(CreateOrCopyStandardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrCopyStandardResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrCopyStandardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrCopyStandard");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险等级的定义页面-创建风险等级的时候生成的一个默认的矩阵
     * @param req DecribeSuggestRiskLevelMatrixRequest
     * @return DecribeSuggestRiskLevelMatrixResponse
     * @throws TencentCloudSDKException
     */
    public DecribeSuggestRiskLevelMatrixResponse DecribeSuggestRiskLevelMatrix(DecribeSuggestRiskLevelMatrixRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DecribeSuggestRiskLevelMatrixResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DecribeSuggestRiskLevelMatrixResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DecribeSuggestRiskLevelMatrix");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteCOSMetaData）用于删除COS元数据信息。
     * @param req DeleteCosMetaResourceRequest
     * @return DeleteCosMetaResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCosMetaResourceResponse DeleteCosMetaResource(DeleteCosMetaResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCosMetaResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCosMetaResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCosMetaResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除DSPA风险评估任务
     * @param req DeleteDSPAAssessmentTaskRequest
     * @return DeleteDSPAAssessmentTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDSPAAssessmentTaskResponse DeleteDSPAAssessmentTask(DeleteDSPAAssessmentTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDSPAAssessmentTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDSPAAssessmentTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDSPAAssessmentTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除COS分类分级任务，该接口只有在任务状态为以下几个状态值时才支持正确删除：
0 待扫描，
2 扫描终止， 
3 扫描成功，
4 扫描失败
     * @param req DeleteDSPACOSDiscoveryTaskRequest
     * @return DeleteDSPACOSDiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDSPACOSDiscoveryTaskResponse DeleteDSPACOSDiscoveryTask(DeleteDSPACOSDiscoveryTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDSPACOSDiscoveryTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDSPACOSDiscoveryTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDSPACOSDiscoveryTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除COS分类分级任务结果
     * @param req DeleteDSPACOSDiscoveryTaskResultRequest
     * @return DeleteDSPACOSDiscoveryTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDSPACOSDiscoveryTaskResultResponse DeleteDSPACOSDiscoveryTaskResult(DeleteDSPACOSDiscoveryTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDSPACOSDiscoveryTaskResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDSPACOSDiscoveryTaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDSPACOSDiscoveryTaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除分类分级识别任务，该接口只有在任务状态为以下几个状态值时才支持正确删除：
0 待扫描，
2 扫描终止， 
3 扫描成功，
4 扫描失败
     * @param req DeleteDSPADiscoveryTaskRequest
     * @return DeleteDSPADiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDSPADiscoveryTaskResponse DeleteDSPADiscoveryTask(DeleteDSPADiscoveryTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDSPADiscoveryTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDSPADiscoveryTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDSPADiscoveryTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除分类分级识别任务结果
     * @param req DeleteDSPADiscoveryTaskResultRequest
     * @return DeleteDSPADiscoveryTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDSPADiscoveryTaskResultResponse DeleteDSPADiscoveryTaskResult(DeleteDSPADiscoveryTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDSPADiscoveryTaskResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDSPADiscoveryTaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDSPADiscoveryTaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户云资源
     * @param req DeleteDSPAMetaResourceRequest
     * @return DeleteDSPAMetaResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDSPAMetaResourceResponse DeleteDSPAMetaResource(DeleteDSPAMetaResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDSPAMetaResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDSPAMetaResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDSPAMetaResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询敏感数据导出结果URL
     * @param req DescribeAssetDetailDataExportResultRequest
     * @return DescribeAssetDetailDataExportResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDetailDataExportResultResponse DescribeAssetDetailDataExportResult(DescribeAssetDetailDataExportResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetDetailDataExportResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetDetailDataExportResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetDetailDataExportResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据资产报告页面-查询数据资产概览接口（包括数据库资产详情和存储资产详情）
     * @param req DescribeAssetOverviewRequest
     * @return DescribeAssetOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetOverviewResponse DescribeAssetOverview(DescribeAssetOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询DB绑定的列表
     * @param req DescribeBindDBListRequest
     * @return DescribeBindDBListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindDBListResponse DescribeBindDBList(DescribeBindDBListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBindDBListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBindDBListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBindDBList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据资产报告-查询cos的资产分布详情接口
     * @param req DescribeCOSAssetSensitiveDistributionRequest
     * @return DescribeCOSAssetSensitiveDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCOSAssetSensitiveDistributionResponse DescribeCOSAssetSensitiveDistribution(DescribeCOSAssetSensitiveDistributionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCOSAssetSensitiveDistributionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCOSAssetSensitiveDistributionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCOSAssetSensitiveDistribution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询分类信息

     * @param req DescribeClassificationInfoRequest
     * @return DescribeClassificationInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassificationInfoResponse DescribeClassificationInfo(DescribeClassificationInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassificationInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassificationInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClassificationInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询标准下所有分类的识别规则数量(不算子分类下的识别规则)
     * @param req DescribeClassificationRuleCountRequest
     * @return DescribeClassificationRuleCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassificationRuleCountResponse DescribeClassificationRuleCount(DescribeClassificationRuleCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassificationRuleCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassificationRuleCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClassificationRuleCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询高风险资产的top10
     * @param req DescribeDSPAAssessmentHighRiskTop10OverviewRequest
     * @return DescribeDSPAAssessmentHighRiskTop10OverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentHighRiskTop10OverviewResponse DescribeDSPAAssessmentHighRiskTop10Overview(DescribeDSPAAssessmentHighRiskTop10OverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentHighRiskTop10OverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentHighRiskTop10OverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentHighRiskTop10Overview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询最新风险项详情数据
     * @param req DescribeDSPAAssessmentLatestRiskDetailInfoRequest
     * @return DescribeDSPAAssessmentLatestRiskDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentLatestRiskDetailInfoResponse DescribeDSPAAssessmentLatestRiskDetailInfo(DescribeDSPAAssessmentLatestRiskDetailInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentLatestRiskDetailInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentLatestRiskDetailInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentLatestRiskDetailInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询最新的风险详情列表数据
     * @param req DescribeDSPAAssessmentLatestRiskListRequest
     * @return DescribeDSPAAssessmentLatestRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentLatestRiskListResponse DescribeDSPAAssessmentLatestRiskList(DescribeDSPAAssessmentLatestRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentLatestRiskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentLatestRiskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentLatestRiskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险概览-查询新发现风险统计数
     * @param req DescribeDSPAAssessmentNewDiscoveredRiskOverviewRequest
     * @return DescribeDSPAAssessmentNewDiscoveredRiskOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentNewDiscoveredRiskOverviewResponse DescribeDSPAAssessmentNewDiscoveredRiskOverview(DescribeDSPAAssessmentNewDiscoveredRiskOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentNewDiscoveredRiskOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentNewDiscoveredRiskOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentNewDiscoveredRiskOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险概览-查询待处理风险统计数
     * @param req DescribeDSPAAssessmentPendingRiskOverviewRequest
     * @return DescribeDSPAAssessmentPendingRiskOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentPendingRiskOverviewResponse DescribeDSPAAssessmentPendingRiskOverview(DescribeDSPAAssessmentPendingRiskOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentPendingRiskOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentPendingRiskOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentPendingRiskOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险概览-查询处理中风险统计数
     * @param req DescribeDSPAAssessmentProcessingRiskOverviewRequest
     * @return DescribeDSPAAssessmentProcessingRiskOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentProcessingRiskOverviewResponse DescribeDSPAAssessmentProcessingRiskOverview(DescribeDSPAAssessmentProcessingRiskOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentProcessingRiskOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentProcessingRiskOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentProcessingRiskOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险概览页风险数量和受影响资产数概览统计
     * @param req DescribeDSPAAssessmentRiskAmountOverviewRequest
     * @return DescribeDSPAAssessmentRiskAmountOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskAmountOverviewResponse DescribeDSPAAssessmentRiskAmountOverview(DescribeDSPAAssessmentRiskAmountOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskAmountOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskAmountOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskAmountOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *受影响资产TOP5统计
     * @param req DescribeDSPAAssessmentRiskDatasourceTop5Request
     * @return DescribeDSPAAssessmentRiskDatasourceTop5Response
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskDatasourceTop5Response DescribeDSPAAssessmentRiskDatasourceTop5(DescribeDSPAAssessmentRiskDatasourceTop5Request req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskDatasourceTop5Response> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskDatasourceTop5Response>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskDatasourceTop5");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *遗留待处理&昨日完成风险处置概览统计
     * @param req DescribeDSPAAssessmentRiskDealedOverviewRequest
     * @return DescribeDSPAAssessmentRiskDealedOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskDealedOverviewResponse DescribeDSPAAssessmentRiskDealedOverview(DescribeDSPAAssessmentRiskDealedOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskDealedOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskDealedOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskDealedOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险项处理趋势统计
     * @param req DescribeDSPAAssessmentRiskDealedTrendRequest
     * @return DescribeDSPAAssessmentRiskDealedTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskDealedTrendResponse DescribeDSPAAssessmentRiskDealedTrend(DescribeDSPAAssessmentRiskDealedTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskDealedTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskDealedTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskDealedTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询风险分布数据，包含风险类型分布，风险详情分布，风险资产的分布
     * @param req DescribeDSPAAssessmentRiskDistributionOverviewRequest
     * @return DescribeDSPAAssessmentRiskDistributionOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskDistributionOverviewResponse DescribeDSPAAssessmentRiskDistributionOverview(DescribeDSPAAssessmentRiskDistributionOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskDistributionOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskDistributionOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskDistributionOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险分类TOP5统计
     * @param req DescribeDSPAAssessmentRiskItemTop5Request
     * @return DescribeDSPAAssessmentRiskItemTop5Response
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskItemTop5Response DescribeDSPAAssessmentRiskItemTop5(DescribeDSPAAssessmentRiskItemTop5Request req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskItemTop5Response> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskItemTop5Response>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskItemTop5");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险项页面----查询风险等级的详情数据
     * @param req DescribeDSPAAssessmentRiskLevelDetailRequest
     * @return DescribeDSPAAssessmentRiskLevelDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskLevelDetailResponse DescribeDSPAAssessmentRiskLevelDetail(DescribeDSPAAssessmentRiskLevelDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskLevelDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskLevelDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskLevelDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险项页面----查询风险等级的列表
     * @param req DescribeDSPAAssessmentRiskLevelListRequest
     * @return DescribeDSPAAssessmentRiskLevelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskLevelListResponse DescribeDSPAAssessmentRiskLevelList(DescribeDSPAAssessmentRiskLevelListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskLevelListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskLevelListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskLevelList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险级别趋势统计
     * @param req DescribeDSPAAssessmentRiskLevelTrendRequest
     * @return DescribeDSPAAssessmentRiskLevelTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskLevelTrendResponse DescribeDSPAAssessmentRiskLevelTrend(DescribeDSPAAssessmentRiskLevelTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskLevelTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskLevelTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskLevelTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险数量概览统计
     * @param req DescribeDSPAAssessmentRiskOverviewRequest
     * @return DescribeDSPAAssessmentRiskOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskOverviewResponse DescribeDSPAAssessmentRiskOverview(DescribeDSPAAssessmentRiskOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改最新评估风险项状态
     * @param req DescribeDSPAAssessmentRiskProcessHistoryRequest
     * @return DescribeDSPAAssessmentRiskProcessHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskProcessHistoryResponse DescribeDSPAAssessmentRiskProcessHistory(DescribeDSPAAssessmentRiskProcessHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskProcessHistoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskProcessHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskProcessHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险评估概览页，查询风险面的分布
     * @param req DescribeDSPAAssessmentRiskSideDistributedRequest
     * @return DescribeDSPAAssessmentRiskSideDistributedResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskSideDistributedResponse DescribeDSPAAssessmentRiskSideDistributed(DescribeDSPAAssessmentRiskSideDistributedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskSideDistributedResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskSideDistributedResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskSideDistributed");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险评估概览页，查询风险面的分布
     * @param req DescribeDSPAAssessmentRiskSideListRequest
     * @return DescribeDSPAAssessmentRiskSideListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskSideListResponse DescribeDSPAAssessmentRiskSideList(DescribeDSPAAssessmentRiskSideListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskSideListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskSideListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskSideList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险项页面--查看评估模版详情
     * @param req DescribeDSPAAssessmentRiskTemplateDetailRequest
     * @return DescribeDSPAAssessmentRiskTemplateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskTemplateDetailResponse DescribeDSPAAssessmentRiskTemplateDetail(DescribeDSPAAssessmentRiskTemplateDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskTemplateDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskTemplateDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskTemplateDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险模版页面--查询风险模版中的脆弱项配置
     * @param req DescribeDSPAAssessmentRiskTemplateVulnerableListRequest
     * @return DescribeDSPAAssessmentRiskTemplateVulnerableListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRiskTemplateVulnerableListResponse DescribeDSPAAssessmentRiskTemplateVulnerableList(DescribeDSPAAssessmentRiskTemplateVulnerableListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRiskTemplateVulnerableListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRiskTemplateVulnerableListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRiskTemplateVulnerableList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DSPA评估风险项列表
     * @param req DescribeDSPAAssessmentRisksRequest
     * @return DescribeDSPAAssessmentRisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentRisksResponse DescribeDSPAAssessmentRisks(DescribeDSPAAssessmentRisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentRisksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentRisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentRisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DSPA评估任务列表
     * @param req DescribeDSPAAssessmentTasksRequest
     * @return DescribeDSPAAssessmentTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentTasksResponse DescribeDSPAAssessmentTasks(DescribeDSPAAssessmentTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DSPA评估模版关联的评估控制项列表
     * @param req DescribeDSPAAssessmentTemplateControlItemsRequest
     * @return DescribeDSPAAssessmentTemplateControlItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentTemplateControlItemsResponse DescribeDSPAAssessmentTemplateControlItems(DescribeDSPAAssessmentTemplateControlItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentTemplateControlItemsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentTemplateControlItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentTemplateControlItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DSPA评估模板列表
     * @param req DescribeDSPAAssessmentTemplatesRequest
     * @return DescribeDSPAAssessmentTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAAssessmentTemplatesResponse DescribeDSPAAssessmentTemplates(DescribeDSPAAssessmentTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAAssessmentTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAAssessmentTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAAssessmentTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取COS敏感数据资产桶列表
     * @param req DescribeDSPACOSDataAssetBucketsRequest
     * @return DescribeDSPACOSDataAssetBucketsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDataAssetBucketsResponse DescribeDSPACOSDataAssetBuckets(DescribeDSPACOSDataAssetBucketsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACOSDataAssetBucketsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACOSDataAssetBucketsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACOSDataAssetBuckets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取COS单个模板下的敏感数据资产
     * @param req DescribeDSPACOSDataAssetByComplianceIdRequest
     * @return DescribeDSPACOSDataAssetByComplianceIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDataAssetByComplianceIdResponse DescribeDSPACOSDataAssetByComplianceId(DescribeDSPACOSDataAssetByComplianceIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACOSDataAssetByComplianceIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACOSDataAssetByComplianceIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACOSDataAssetByComplianceId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取COS分类分级数据资产详情
     * @param req DescribeDSPACOSDataAssetDetailRequest
     * @return DescribeDSPACOSDataAssetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDataAssetDetailResponse DescribeDSPACOSDataAssetDetail(DescribeDSPACOSDataAssetDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACOSDataAssetDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACOSDataAssetDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACOSDataAssetDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取COS分类分级任务详情
     * @param req DescribeDSPACOSDiscoveryTaskDetailRequest
     * @return DescribeDSPACOSDiscoveryTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDiscoveryTaskDetailResponse DescribeDSPACOSDiscoveryTaskDetail(DescribeDSPACOSDiscoveryTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACOSDiscoveryTaskDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACOSDiscoveryTaskDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACOSDiscoveryTaskDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取COS分类分级任务结果详情文件列表
     * @param req DescribeDSPACOSDiscoveryTaskFilesRequest
     * @return DescribeDSPACOSDiscoveryTaskFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDiscoveryTaskFilesResponse DescribeDSPACOSDiscoveryTaskFiles(DescribeDSPACOSDiscoveryTaskFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACOSDiscoveryTaskFilesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACOSDiscoveryTaskFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACOSDiscoveryTaskFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取COS分类分级任务结果，该接口只有在任务状态为以下状态时才支持结果正常查询：
3 扫描成功，
4 扫描失败
     * @param req DescribeDSPACOSDiscoveryTaskResultRequest
     * @return DescribeDSPACOSDiscoveryTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDiscoveryTaskResultResponse DescribeDSPACOSDiscoveryTaskResult(DescribeDSPACOSDiscoveryTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACOSDiscoveryTaskResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACOSDiscoveryTaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACOSDiscoveryTaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取COS分类分级任务列表
     * @param req DescribeDSPACOSDiscoveryTasksRequest
     * @return DescribeDSPACOSDiscoveryTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSDiscoveryTasksResponse DescribeDSPACOSDiscoveryTasks(DescribeDSPACOSDiscoveryTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACOSDiscoveryTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACOSDiscoveryTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACOSDiscoveryTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取COS分类分级任务结果详情，该接口只有在任务状态为时才支持结果正确查询：
3 扫描成功
     * @param req DescribeDSPACOSTaskResultDetailRequest
     * @return DescribeDSPACOSTaskResultDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACOSTaskResultDetailResponse DescribeDSPACOSTaskResultDetail(DescribeDSPACOSTaskResultDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACOSTaskResultDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACOSTaskResultDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACOSTaskResultDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取敏感数据分类列表
     * @param req DescribeDSPACategoriesRequest
     * @return DescribeDSPACategoriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACategoriesResponse DescribeDSPACategories(DescribeDSPACategoriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACategoriesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACategoriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACategories");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分类规则统计信息
     * @param req DescribeDSPACategoryRuleStatisticRequest
     * @return DescribeDSPACategoryRuleStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACategoryRuleStatisticResponse DescribeDSPACategoryRuleStatistic(DescribeDSPACategoryRuleStatisticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACategoryRuleStatisticResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACategoryRuleStatisticResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACategoryRuleStatistic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取合规组分类规则信息
     * @param req DescribeDSPACategoryRulesRequest
     * @return DescribeDSPACategoryRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACategoryRulesResponse DescribeDSPACategoryRules(DescribeDSPACategoryRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACategoryRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACategoryRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACategoryRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分类树信息
     * @param req DescribeDSPACategoryTreeRequest
     * @return DescribeDSPACategoryTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACategoryTreeResponse DescribeDSPACategoryTree(DescribeDSPACategoryTreeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACategoryTreeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACategoryTreeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACategoryTree");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分类规则树信息
     * @param req DescribeDSPACategoryTreeWithRulesRequest
     * @return DescribeDSPACategoryTreeWithRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPACategoryTreeWithRulesResponse DescribeDSPACategoryTreeWithRules(DescribeDSPACategoryTreeWithRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPACategoryTreeWithRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPACategoryTreeWithRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPACategoryTreeWithRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取模板详情信息
     * @param req DescribeDSPAComplianceGroupDetailRequest
     * @return DescribeDSPAComplianceGroupDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAComplianceGroupDetailResponse DescribeDSPAComplianceGroupDetail(DescribeDSPAComplianceGroupDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAComplianceGroupDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAComplianceGroupDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAComplianceGroupDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分类分级模板列表
     * @param req DescribeDSPAComplianceGroupsRequest
     * @return DescribeDSPAComplianceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAComplianceGroupsResponse DescribeDSPAComplianceGroups(DescribeDSPAComplianceGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAComplianceGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAComplianceGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAComplianceGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取模板更新提示信息
     * @param req DescribeDSPAComplianceUpdateNotificationRequest
     * @return DescribeDSPAComplianceUpdateNotificationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAComplianceUpdateNotificationResponse DescribeDSPAComplianceUpdateNotification(DescribeDSPAComplianceUpdateNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAComplianceUpdateNotificationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAComplianceUpdateNotificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAComplianceUpdateNotification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取数据源的数据库信息
     * @param req DescribeDSPADataSourceDbInfoRequest
     * @return DescribeDSPADataSourceDbInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADataSourceDbInfoResponse DescribeDSPADataSourceDbInfo(DescribeDSPADataSourceDbInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPADataSourceDbInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPADataSourceDbInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPADataSourceDbInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分类分级规则列表
     * @param req DescribeDSPADiscoveryRulesRequest
     * @return DescribeDSPADiscoveryRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryRulesResponse DescribeDSPADiscoveryRules(DescribeDSPADiscoveryRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPADiscoveryRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPADiscoveryRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPADiscoveryRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询该用户是否已开通分类分级服务
     * @param req DescribeDSPADiscoveryServiceStatusRequest
     * @return DescribeDSPADiscoveryServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryServiceStatusResponse DescribeDSPADiscoveryServiceStatus(DescribeDSPADiscoveryServiceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPADiscoveryServiceStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPADiscoveryServiceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPADiscoveryServiceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分类分级任务详情
     * @param req DescribeDSPADiscoveryTaskDetailRequest
     * @return DescribeDSPADiscoveryTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryTaskDetailResponse DescribeDSPADiscoveryTaskDetail(DescribeDSPADiscoveryTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPADiscoveryTaskDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPADiscoveryTaskDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPADiscoveryTaskDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分类分级任务结果，该接口只有在任务状态为以下状态时才支持结果正常查询：
3 扫描成功，
4 扫描失败
     * @param req DescribeDSPADiscoveryTaskResultRequest
     * @return DescribeDSPADiscoveryTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryTaskResultResponse DescribeDSPADiscoveryTaskResult(DescribeDSPADiscoveryTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPADiscoveryTaskResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPADiscoveryTaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPADiscoveryTaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分类分级任务结果详情，该接口只有在任务状态为时才支持结果正确查询：
3 扫描成功
     * @param req DescribeDSPADiscoveryTaskResultDetailRequest
     * @return DescribeDSPADiscoveryTaskResultDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryTaskResultDetailResponse DescribeDSPADiscoveryTaskResultDetail(DescribeDSPADiscoveryTaskResultDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPADiscoveryTaskResultDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPADiscoveryTaskResultDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPADiscoveryTaskResultDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分级分级扫描的表集合
     * @param req DescribeDSPADiscoveryTaskTablesRequest
     * @return DescribeDSPADiscoveryTaskTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPADiscoveryTaskTablesResponse DescribeDSPADiscoveryTaskTables(DescribeDSPADiscoveryTaskTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPADiscoveryTaskTablesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPADiscoveryTaskTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPADiscoveryTaskTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据合规组id，去查询ES的概览页统计数据
     * @param req DescribeDSPAESDataAssetByComplianceIdRequest
     * @return DescribeDSPAESDataAssetByComplianceIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAESDataAssetByComplianceIdResponse DescribeDSPAESDataAssetByComplianceId(DescribeDSPAESDataAssetByComplianceIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAESDataAssetByComplianceIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAESDataAssetByComplianceIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAESDataAssetByComplianceId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据合规组id，去查询ES的概览页下的统计列表数据
     * @param req DescribeDSPAESDataAssetDetailRequest
     * @return DescribeDSPAESDataAssetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAESDataAssetDetailResponse DescribeDSPAESDataAssetDetail(DescribeDSPAESDataAssetDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAESDataAssetDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAESDataAssetDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAESDataAssetDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取ES扫描结果数据样本
     * @param req DescribeDSPAESDataSampleRequest
     * @return DescribeDSPAESDataSampleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAESDataSampleResponse DescribeDSPAESDataSample(DescribeDSPAESDataSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAESDataSampleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAESDataSampleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAESDataSample");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取ES的分类分级任务结果详情，该接口只有在任务状态为时才支持结果正确查询：
3 扫描成功
     * @param req DescribeDSPAESDiscoveryTaskResultDetailRequest
     * @return DescribeDSPAESDiscoveryTaskResultDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPAESDiscoveryTaskResultDetailResponse DescribeDSPAESDiscoveryTaskResultDetail(DescribeDSPAESDiscoveryTaskResultDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPAESDiscoveryTaskResultDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPAESDiscoveryTaskResultDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPAESDiscoveryTaskResultDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分级详情
     * @param req DescribeDSPALevelDetailRequest
     * @return DescribeDSPALevelDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPALevelDetailResponse DescribeDSPALevelDetail(DescribeDSPALevelDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPALevelDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPALevelDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPALevelDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取分级列表，限制100个 不分页返回
     * @param req DescribeDSPALevelGroupsRequest
     * @return DescribeDSPALevelGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPALevelGroupsResponse DescribeDSPALevelGroups(DescribeDSPALevelGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPALevelGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPALevelGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPALevelGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单个合规组下的RDB关系数据库分类分级数据资产
     * @param req DescribeDSPARDBDataAssetByComplianceIdRequest
     * @return DescribeDSPARDBDataAssetByComplianceIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPARDBDataAssetByComplianceIdResponse DescribeDSPARDBDataAssetByComplianceId(DescribeDSPARDBDataAssetByComplianceIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPARDBDataAssetByComplianceIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPARDBDataAssetByComplianceIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPARDBDataAssetByComplianceId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取RDB关系数据库分类分级资产详情
     * @param req DescribeDSPARDBDataAssetDetailRequest
     * @return DescribeDSPARDBDataAssetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPARDBDataAssetDetailResponse DescribeDSPARDBDataAssetDetail(DescribeDSPARDBDataAssetDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPARDBDataAssetDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPARDBDataAssetDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPARDBDataAssetDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取DSPA支持的Meta元数据类型，返回包括：元数据类型，支持的元数据地域信息
     * @param req DescribeDSPASupportedMetasRequest
     * @return DescribeDSPASupportedMetasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPASupportedMetasResponse DescribeDSPASupportedMetas(DescribeDSPASupportedMetasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPASupportedMetasResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPASupportedMetasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPASupportedMetas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取扫描结果数据样本
     * @param req DescribeDSPATaskResultDataSampleRequest
     * @return DescribeDSPATaskResultDataSampleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDSPATaskResultDataSampleResponse DescribeDSPATaskResultDataSample(DescribeDSPATaskResultDataSampleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDSPATaskResultDataSampleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDSPATaskResultDataSampleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDSPATaskResultDataSample");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据资产报告-查询es的敏感资产报告，包含（数据库资产，设敏级别数据库top10，资产详情）
     * @param req DescribeESAssetSensitiveDistributionRequest
     * @return DescribeESAssetSensitiveDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeESAssetSensitiveDistributionResponse DescribeESAssetSensitiveDistribution(DescribeESAssetSensitiveDistributionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeESAssetSensitiveDistributionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeESAssetSensitiveDistributionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeESAssetSensitiveDistribution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取导出任务结果
     * @param req DescribeExportTaskResultRequest
     * @return DescribeExportTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportTaskResultResponse DescribeExportTaskResult(DescribeExportTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExportTaskResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExportTaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExportTaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询标准下所有叶子节点分类
     * @param req DescribeLeafClassificationRequest
     * @return DescribeLeafClassificationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLeafClassificationResponse DescribeLeafClassification(DescribeLeafClassificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLeafClassificationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLeafClassificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLeafClassification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据资产报告-查询mongo 的敏感资产报告，包含（数据库资产，设敏级别数据库top10，资产详情）
     * @param req DescribeMongoAssetSensitiveDistributionRequest
     * @return DescribeMongoAssetSensitiveDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMongoAssetSensitiveDistributionResponse DescribeMongoAssetSensitiveDistribution(DescribeMongoAssetSensitiveDistributionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMongoAssetSensitiveDistributionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMongoAssetSensitiveDistributionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMongoAssetSensitiveDistribution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据资产报告-查询rbd 的敏感资产报告，包含（数据库资产，设敏级别数据库top10，资产详情）
     * @param req DescribeRDBAssetSensitiveDistributionRequest
     * @return DescribeRDBAssetSensitiveDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRDBAssetSensitiveDistributionResponse DescribeRDBAssetSensitiveDistribution(DescribeRDBAssetSensitiveDistributionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRDBAssetSensitiveDistributionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRDBAssetSensitiveDistributionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRDBAssetSensitiveDistribution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取报表下载链接
     * @param req DescribeReportTaskDownloadUrlRequest
     * @return DescribeReportTaskDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReportTaskDownloadUrlResponse DescribeReportTaskDownloadUrl(DescribeReportTaskDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReportTaskDownloadUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReportTaskDownloadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReportTaskDownloadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产报表任务列表
     * @param req DescribeReportTasksRequest
     * @return DescribeReportTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReportTasksResponse DescribeReportTasks(DescribeReportTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReportTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReportTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReportTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询分类规则详情

     * @param req DescribeRuleDetailRequest
     * @return DescribeRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleDetailResponse DescribeRuleDetail(DescribeRuleDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询分类下规则列表

     * @param req DescribeRuleListRequest
     * @return DescribeRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleListResponse DescribeRuleList(DescribeRuleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据资产报告-查询cos的敏感数据分布（分级分布 分类分布 敏感规则分布详情列表）
     * @param req DescribeSensitiveCOSDataDistributionRequest
     * @return DescribeSensitiveCOSDataDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSensitiveCOSDataDistributionResponse DescribeSensitiveCOSDataDistribution(DescribeSensitiveCOSDataDistributionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSensitiveCOSDataDistributionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSensitiveCOSDataDistributionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSensitiveCOSDataDistribution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *数据资产报告-查询rdb的敏感数据分布-敏感规则字段分布-敏感分布详情
     * @param req DescribeSensitiveRDBDataDistributionRequest
     * @return DescribeSensitiveRDBDataDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSensitiveRDBDataDistributionResponse DescribeSensitiveRDBDataDistribution(DescribeSensitiveRDBDataDistributionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSensitiveRDBDataDistributionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSensitiveRDBDataDistributionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSensitiveRDBDataDistribution");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取消用户云资源授权
     * @param req DisableDSPAMetaResourceAuthRequest
     * @return DisableDSPAMetaResourceAuthResponse
     * @throws TencentCloudSDKException
     */
    public DisableDSPAMetaResourceAuthResponse DisableDSPAMetaResourceAuth(DisableDSPAMetaResourceAuthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableDSPAMetaResourceAuthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DisableDSPAMetaResourceAuthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableDSPAMetaResourceAuth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *打开或者关闭分类分级规则
注：此API同时对该规则下的RDB跟COS规则操作。


     * @param req EnableDSPADiscoveryRuleRequest
     * @return EnableDSPADiscoveryRuleResponse
     * @throws TencentCloudSDKException
     */
    public EnableDSPADiscoveryRuleResponse EnableDSPADiscoveryRule(EnableDSPADiscoveryRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableDSPADiscoveryRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EnableDSPADiscoveryRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableDSPADiscoveryRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用版本体验
     * @param req EnableTrialVersionRequest
     * @return EnableTrialVersionResponse
     * @throws TencentCloudSDKException
     */
    public EnableTrialVersionResponse EnableTrialVersion(EnableTrialVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableTrialVersionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EnableTrialVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableTrialVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建敏感数据导出任务
     * @param req ExportAssetDetailDataRequest
     * @return ExportAssetDetailDataResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetDetailDataResponse ExportAssetDetailData(ExportAssetDetailDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportAssetDetailDataResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ExportAssetDetailDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExportAssetDetailData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取授权资源的连接状态
     * @param req GetResourceConnectionStatusRequest
     * @return GetResourceConnectionStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetResourceConnectionStatusResponse GetResourceConnectionStatus(GetResourceConnectionStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetResourceConnectionStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetResourceConnectionStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetResourceConnectionStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取体验版本信息
     * @param req GetTrialVersionRequest
     * @return GetTrialVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetTrialVersionResponse GetTrialVersion(GetTrialVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTrialVersionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetTrialVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTrialVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户购买配额信息
     * @param req GetUserQuotaInfoRequest
     * @return GetUserQuotaInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetUserQuotaInfoResponse GetUserQuotaInfo(GetUserQuotaInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUserQuotaInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetUserQuotaInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUserQuotaInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取DSPA集群列表
     * @param req ListDSPAClustersRequest
     * @return ListDSPAClustersResponse
     * @throws TencentCloudSDKException
     */
    public ListDSPAClustersResponse ListDSPAClusters(ListDSPAClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListDSPAClustersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListDSPAClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListDSPAClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取COS元数据信息，返回COS元数据信息列表。
     * @param req ListDSPACosMetaResourcesRequest
     * @return ListDSPACosMetaResourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListDSPACosMetaResourcesResponse ListDSPACosMetaResources(ListDSPACosMetaResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListDSPACosMetaResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListDSPACosMetaResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListDSPACosMetaResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取用户云资源
     * @param req ListDSPAMetaResourcesRequest
     * @return ListDSPAMetaResourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListDSPAMetaResourcesResponse ListDSPAMetaResources(ListDSPAMetaResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListDSPAMetaResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListDSPAMetaResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListDSPAMetaResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑识别规则
     * @param req ModifyClassificationRuleRequest
     * @return ModifyClassificationRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClassificationRuleResponse ModifyClassificationRule(ModifyClassificationRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClassificationRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClassificationRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClassificationRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改识别规则状态
     * @param req ModifyClassificationRuleStateRequest
     * @return ModifyClassificationRuleStateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClassificationRuleStateResponse ModifyClassificationRuleState(ModifyClassificationRuleStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClassificationRuleStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClassificationRuleStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClassificationRuleState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改DSPA评估风险项，支持修改Status
     * @param req ModifyDSPAAssessmentRiskRequest
     * @return ModifyDSPAAssessmentRiskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAAssessmentRiskResponse ModifyDSPAAssessmentRisk(ModifyDSPAAssessmentRiskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPAAssessmentRiskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPAAssessmentRiskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPAAssessmentRisk");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改最新评估风险项状态
     * @param req ModifyDSPAAssessmentRiskLatestRequest
     * @return ModifyDSPAAssessmentRiskLatestResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAAssessmentRiskLatestResponse ModifyDSPAAssessmentRiskLatest(ModifyDSPAAssessmentRiskLatestRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPAAssessmentRiskLatestResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPAAssessmentRiskLatestResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPAAssessmentRiskLatest");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险项页面----修改风险等级的详情数据
     * @param req ModifyDSPAAssessmentRiskLevelRequest
     * @return ModifyDSPAAssessmentRiskLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAAssessmentRiskLevelResponse ModifyDSPAAssessmentRiskLevel(ModifyDSPAAssessmentRiskLevelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPAAssessmentRiskLevelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPAAssessmentRiskLevelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPAAssessmentRiskLevel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *风险模版---修改风险模版
     * @param req ModifyDSPAAssessmentRiskTemplateRequest
     * @return ModifyDSPAAssessmentRiskTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAAssessmentRiskTemplateResponse ModifyDSPAAssessmentRiskTemplate(ModifyDSPAAssessmentRiskTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPAAssessmentRiskTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPAAssessmentRiskTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPAAssessmentRiskTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改COS分类分级任务，该接口只有在任务状态为以下状态时才支持正确修改：
0 待扫描，
2 扫描终止， 
3 扫描成功，
4 扫描失败

     * @param req ModifyDSPACOSDiscoveryTaskRequest
     * @return ModifyDSPACOSDiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPACOSDiscoveryTaskResponse ModifyDSPACOSDiscoveryTask(ModifyDSPACOSDiscoveryTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPACOSDiscoveryTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPACOSDiscoveryTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPACOSDiscoveryTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调整COS任务扫描结果
     * @param req ModifyDSPACOSTaskResultRequest
     * @return ModifyDSPACOSTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPACOSTaskResultResponse ModifyDSPACOSTaskResult(ModifyDSPACOSTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPACOSTaskResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPACOSTaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPACOSTaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改分类，内置分类不支持修改。
     * @param req ModifyDSPACategoryRequest
     * @return ModifyDSPACategoryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPACategoryResponse ModifyDSPACategory(ModifyDSPACategoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPACategoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPACategoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPACategory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改分类分级关系
     * @param req ModifyDSPACategoryRelationRequest
     * @return ModifyDSPACategoryRelationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPACategoryRelationResponse ModifyDSPACategoryRelation(ModifyDSPACategoryRelationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPACategoryRelationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPACategoryRelationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPACategoryRelation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改DSPA集群信息
     * @param req ModifyDSPAClusterInfoRequest
     * @return ModifyDSPAClusterInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAClusterInfoResponse ModifyDSPAClusterInfo(ModifyDSPAClusterInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPAClusterInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPAClusterInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPAClusterInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改分类分级模板，内置模板不支持修改。
     * @param req ModifyDSPAComplianceGroupRequest
     * @return ModifyDSPAComplianceGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAComplianceGroupResponse ModifyDSPAComplianceGroup(ModifyDSPAComplianceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPAComplianceGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPAComplianceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPAComplianceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改分类分级规则，单个用户最多允许创建200个规则。
注：此API同时适用RDB跟COS类型数据。
     * @param req ModifyDSPADiscoveryRuleRequest
     * @return ModifyDSPADiscoveryRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPADiscoveryRuleResponse ModifyDSPADiscoveryRule(ModifyDSPADiscoveryRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPADiscoveryRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPADiscoveryRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPADiscoveryRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改分类分级任务，该接口只有在任务状态为以下状态时才支持正确修改：
0 待扫描，
2 扫描终止， 
3 扫描成功，
4 扫描失败

     * @param req ModifyDSPADiscoveryTaskRequest
     * @return ModifyDSPADiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPADiscoveryTaskResponse ModifyDSPADiscoveryTask(ModifyDSPADiscoveryTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPADiscoveryTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPADiscoveryTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPADiscoveryTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调整ES任务扫描结果
     * @param req ModifyDSPAESTaskResultRequest
     * @return ModifyDSPAESTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPAESTaskResultResponse ModifyDSPAESTaskResult(ModifyDSPAESTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPAESTaskResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPAESTaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPAESTaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *调整任务扫描结果
     * @param req ModifyDSPATaskResultRequest
     * @return ModifyDSPATaskResultResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDSPATaskResultResponse ModifyDSPATaskResult(ModifyDSPATaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDSPATaskResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDSPATaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDSPATaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改敏感级别信息
     * @param req ModifyLevelInfoRequest
     * @return ModifyLevelInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLevelInfoResponse ModifyLevelInfo(ModifyLevelInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLevelInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLevelInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLevelInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改级别名称
     * @param req ModifyLevelNameRequest
     * @return ModifyLevelNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLevelNameResponse ModifyLevelName(ModifyLevelNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLevelNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLevelNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLevelName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启级别或关闭级别
     * @param req ModifyLevelStateRequest
     * @return ModifyLevelStateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLevelStateResponse ModifyLevelState(ModifyLevelStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLevelStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLevelStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLevelState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *一个分类合并到另一个分类中（分类拖拽功能）
     * @param req ModifyMergeClassificationRequest
     * @return ModifyMergeClassificationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMergeClassificationResponse ModifyMergeClassification(ModifyMergeClassificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMergeClassificationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMergeClassificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMergeClassification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改分类信息
     * @param req ModifyNewClassificationRequest
     * @return ModifyNewClassificationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNewClassificationResponse ModifyNewClassification(ModifyNewClassificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNewClassificationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNewClassificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNewClassification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改分级分类模板信息
     * @param req ModifyStandardInfoRequest
     * @return ModifyStandardInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStandardInfoResponse ModifyStandardInfo(ModifyStandardInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyStandardInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyStandardInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyStandardInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询DSPA实例的db列表
     * @param req QueryDSPAMetaResourceDbListRequest
     * @return QueryDSPAMetaResourceDbListResponse
     * @throws TencentCloudSDKException
     */
    public QueryDSPAMetaResourceDbListResponse QueryDSPAMetaResourceDbList(QueryDSPAMetaResourceDbListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryDSPAMetaResourceDbListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryDSPAMetaResourceDbListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryDSPAMetaResourceDbList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资源绑定DB状态
     * @param req QueryResourceDbBindStatusRequest
     * @return QueryResourceDbBindStatusResponse
     * @throws TencentCloudSDKException
     */
    public QueryResourceDbBindStatusResponse QueryResourceDbBindStatus(QueryResourceDbBindStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryResourceDbBindStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<QueryResourceDbBindStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryResourceDbBindStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新启动DSPA风险评估任务
     * @param req RestartDSPAAssessmentTaskRequest
     * @return RestartDSPAAssessmentTaskResponse
     * @throws TencentCloudSDKException
     */
    public RestartDSPAAssessmentTaskResponse RestartDSPAAssessmentTask(RestartDSPAAssessmentTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartDSPAAssessmentTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RestartDSPAAssessmentTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartDSPAAssessmentTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *立即启动分类分级任务，该接口只有在任务状态为以下状态时才支持正确执行立即扫描：
0 待扫描，
2 扫描终止，
3 扫描成功，
4 扫描失败
     * @param req StartDSPADiscoveryTaskRequest
     * @return StartDSPADiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public StartDSPADiscoveryTaskResponse StartDSPADiscoveryTask(StartDSPADiscoveryTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartDSPADiscoveryTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartDSPADiscoveryTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartDSPADiscoveryTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止分类分级任务，该接口只有在任务状态为以下状态时才支持正确执行停止扫描：
1 扫描中
     * @param req StopDSPADiscoveryTaskRequest
     * @return StopDSPADiscoveryTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopDSPADiscoveryTaskResponse StopDSPADiscoveryTask(StopDSPADiscoveryTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopDSPADiscoveryTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopDSPADiscoveryTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopDSPADiscoveryTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新自建资源基础信息，包括：端口、账户名、密码。
请注意：
如果资源自身的VPC、VIP信息发生变化，后台会自动更新。
如果监听的端口发生变化，请显式输入端口。
如果账户名密码任意一个发生变化，请务必同时显式输入账户名密码。
     * @param req UpdateDSPASelfBuildResourceRequest
     * @return UpdateDSPASelfBuildResourceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDSPASelfBuildResourceResponse UpdateDSPASelfBuildResource(UpdateDSPASelfBuildResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDSPASelfBuildResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDSPASelfBuildResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDSPASelfBuildResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *验证COS分类分级规则
     * @param req VerifyDSPACOSRuleRequest
     * @return VerifyDSPACOSRuleResponse
     * @throws TencentCloudSDKException
     */
    public VerifyDSPACOSRuleResponse VerifyDSPACOSRule(VerifyDSPACOSRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyDSPACOSRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyDSPACOSRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyDSPACOSRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *验证分类分级规则
     * @param req VerifyDSPADiscoveryRuleRequest
     * @return VerifyDSPADiscoveryRuleResponse
     * @throws TencentCloudSDKException
     */
    public VerifyDSPADiscoveryRuleResponse VerifyDSPADiscoveryRule(VerifyDSPADiscoveryRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyDSPADiscoveryRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyDSPADiscoveryRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyDSPADiscoveryRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
