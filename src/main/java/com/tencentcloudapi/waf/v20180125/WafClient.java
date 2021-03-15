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
package com.tencentcloudapi.waf.v20180125;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.waf.v20180125.models.*;

public class WafClient extends AbstractClient{
    private static String endpoint = "waf.tencentcloudapi.com";
    private static String service = "waf";
    private static String version = "2018-01-25";

    public WafClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WafClient(Credential credential, String region, ClientProfile profile) {
        super(WafClient.endpoint, WafClient.version, credential, region, profile);
    }

    /**
     *增加自定义策略
     * @param req AddCustomRuleRequest
     * @return AddCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddCustomRuleResponse AddCustomRule(AddCustomRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCustomRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddCustomRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddCustomRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建攻击日志下载任务
     * @param req CreateAttackDownloadTaskRequest
     * @return CreateAttackDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAttackDownloadTaskResponse CreateAttackDownloadTask(CreateAttackDownloadTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAttackDownloadTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAttackDownloadTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAttackDownloadTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除攻击日志下载任务记录
     * @param req DeleteAttackDownloadRecordRequest
     * @return DeleteAttackDownloadRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAttackDownloadRecordResponse DeleteAttackDownloadRecord(DeleteAttackDownloadRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAttackDownloadRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAttackDownloadRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAttackDownloadRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除访问日志下载记录
     * @param req DeleteDownloadRecordRequest
     * @return DeleteDownloadRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDownloadRecordResponse DeleteDownloadRecord(DeleteDownloadRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDownloadRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDownloadRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDownloadRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除CC攻击的session设置
     * @param req DeleteSessionRequest
     * @return DeleteSessionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSessionResponse DeleteSession(DeleteSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSessionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取防护配置中的自定义策略列表
     * @param req DescribeCustomRulesRequest
     * @return DescribeCustomRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRulesResponse DescribeCustomRules(DescribeCustomRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在负载均衡型WAF的添加、编辑域名配置的时候，需要展示负载均衡型WAF（clb-waf)支持的地域列表，通过DescribeUserClbWafRegions既可以获得当前对客户已经开放的地域列表
     * @param req DescribeUserClbWafRegionsRequest
     * @return DescribeUserClbWafRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserClbWafRegionsResponse DescribeUserClbWafRegions(DescribeUserClbWafRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserClbWafRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserClbWafRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserClbWafRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启或禁用自定义策略
     * @param req ModifyCustomRuleStatusRequest
     * @return ModifyCustomRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomRuleStatusResponse ModifyCustomRuleStatus(ModifyCustomRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomRuleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
