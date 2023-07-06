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
package com.tencentcloudapi.hasim.v20210716;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.hasim.v20210716.models.*;

public class HasimClient extends AbstractClient{
    private static String endpoint = "hasim.tencentcloudapi.com";
    private static String service = "hasim";
    private static String version = "2021-07-16";
    
    public HasimClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public HasimClient(Credential credential, String region, ClientProfile profile) {
        super(HasimClient.endpoint, HasimClient.version, credential, region, profile);
    }

    /**
     *创建自动化规则
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *创建云兔切换策略
     * @param req CreateTacticRequest
     * @return CreateTacticResponse
     * @throws TencentCloudSDKException
     */
    public CreateTacticResponse CreateTactic(CreateTacticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTacticResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTacticResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTactic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建标签
     * @param req CreateTagRequest
     * @return CreateTagResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagResponse CreateTag(CreateTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除自动化规则
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *删除策略
     * @param req DeleteTacticRequest
     * @return DeleteTacticResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTacticResponse DeleteTactic(DeleteTacticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTacticResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTacticResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTactic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除标签
     * @param req DeleteTagRequest
     * @return DeleteTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagResponse DeleteTag(DeleteTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云兔连接详细信息
     * @param req DescribeLinkRequest
     * @return DescribeLinkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLinkResponse DescribeLink(DescribeLinkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLinkResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLinkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLink");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云兔连接列表
     * @param req DescribeLinksRequest
     * @return DescribeLinksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLinksResponse DescribeLinks(DescribeLinksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLinksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLinksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLinks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询订单列表
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrdersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrdersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrders");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询自动化规则
     * @param req DescribeRuleRequest
     * @return DescribeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleResponse DescribeRule(DescribeRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *查询自动化规则列表
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *查询云兔切换策略信息
     * @param req DescribeTacticRequest
     * @return DescribeTacticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTacticResponse DescribeTactic(DescribeTacticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTacticResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTacticResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTactic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云兔切换策略列表
     * @param req DescribeTacticsRequest
     * @return DescribeTacticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTacticsResponse DescribeTactics(DescribeTacticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTacticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTacticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTactics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询标签列表
     * @param req DescribeTagsRequest
     * @return DescribeTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsResponse DescribeTags(DescribeTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑云兔高级日志状态
     * @param req ModifyLinkAdvancedLogRequest
     * @return ModifyLinkAdvancedLogResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLinkAdvancedLogResponse ModifyLinkAdvancedLog(ModifyLinkAdvancedLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLinkAdvancedLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLinkAdvancedLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLinkAdvancedLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑云兔策略
     * @param req ModifyLinkTacticRequest
     * @return ModifyLinkTacticResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLinkTacticResponse ModifyLinkTactic(ModifyLinkTacticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLinkTacticResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLinkTacticResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLinkTactic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改云兔运营商
     * @param req ModifyLinkTeleRequest
     * @return ModifyLinkTeleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLinkTeleResponse ModifyLinkTele(ModifyLinkTeleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLinkTeleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLinkTeleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLinkTele");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑自动化规则
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *编辑自动化规则状态
     * @param req ModifyRuleStatusRequest
     * @return ModifyRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleStatusResponse ModifyRuleStatus(ModifyRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRuleStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改云兔切换策略
     * @param req ModifyTacticRequest
     * @return ModifyTacticResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTacticResponse ModifyTactic(ModifyTacticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTacticResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTacticResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTactic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑标签
     * @param req ModifyTagRequest
     * @return ModifyTagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTagResponse ModifyTag(ModifyTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *刷新云兔连接信息同步
     * @param req RenewLinkInfoRequest
     * @return RenewLinkInfoResponse
     * @throws TencentCloudSDKException
     */
    public RenewLinkInfoResponse RenewLinkInfo(RenewLinkInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewLinkInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RenewLinkInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewLinkInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
