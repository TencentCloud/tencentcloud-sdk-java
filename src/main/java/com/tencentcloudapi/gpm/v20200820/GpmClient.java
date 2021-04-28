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
package com.tencentcloudapi.gpm.v20200820;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.gpm.v20200820.models.*;

public class GpmClient extends AbstractClient{
    private static String endpoint = "gpm.tencentcloudapi.com";
    private static String service = "gpm";
    private static String version = "2020-08-20";

    public GpmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GpmClient(Credential credential, String region, ClientProfile profile) {
        super(GpmClient.endpoint, GpmClient.version, credential, region, profile);
    }

    /**
     *取消匹配。
     * @param req CancelMatchingRequest
     * @return CancelMatchingResponse
     * @throws TencentCloudSDKException
     */
    public CancelMatchingResponse CancelMatching(CancelMatchingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelMatchingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelMatchingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelMatching");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建匹配
     * @param req CreateMatchRequest
     * @return CreateMatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateMatchResponse CreateMatch(CreateMatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建规则
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除匹配
     * @param req DeleteMatchRequest
     * @return DeleteMatchResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMatchResponse DeleteMatch(DeleteMatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除规则
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *统计数据
     * @param req DescribeDataRequest
     * @return DescribeDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataResponse DescribeData(DescribeDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询匹配详情
     * @param req DescribeMatchRequest
     * @return DescribeMatchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMatchResponse DescribeMatch(DescribeMatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页查询匹配Code
     * @param req DescribeMatchCodesRequest
     * @return DescribeMatchCodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMatchCodesResponse DescribeMatchCodes(DescribeMatchCodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMatchCodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMatchCodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMatchCodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页查询匹配列表
     * @param req DescribeMatchesRequest
     * @return DescribeMatchesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMatchesResponse DescribeMatches(DescribeMatchesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMatchesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMatchesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMatches");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询匹配进度。
     * @param req DescribeMatchingProgressRequest
     * @return DescribeMatchingProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMatchingProgressResponse DescribeMatchingProgress(DescribeMatchingProgressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMatchingProgressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMatchingProgressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMatchingProgress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则详情
     * @param req DescribeRuleRequest
     * @return DescribeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleResponse DescribeRule(DescribeRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页查询规则集列表
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询匹配Token，Token用于push消息验证。
     * @param req DescribeTokenRequest
     * @return DescribeTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenResponse DescribeToken(DescribeTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改匹配
     * @param req ModifyMatchRequest
     * @return ModifyMatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMatchResponse ModifyMatch(ModifyMatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改规则（描述、标签）
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改匹配Token。
     * @param req ModifyTokenRequest
     * @return ModifyTokenResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTokenResponse ModifyToken(ModifyTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持传入一个玩家或多个玩家发起匹配，在同一个请求内的玩家将被分到同一个对局。
     * @param req StartMatchingRequest
     * @return StartMatchingResponse
     * @throws TencentCloudSDKException
     */
    public StartMatchingResponse StartMatching(StartMatchingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartMatchingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartMatchingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartMatching");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过调用StartMatchingBackfill，用户可以传入一个回填的匹配请求，GPM为回填请求搜索符合条件的ticket并形成一个新的match。
     * @param req StartMatchingBackfillRequest
     * @return StartMatchingBackfillResponse
     * @throws TencentCloudSDKException
     */
    public StartMatchingBackfillResponse StartMatchingBackfill(StartMatchingBackfillRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartMatchingBackfillResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartMatchingBackfillResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartMatchingBackfill");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
