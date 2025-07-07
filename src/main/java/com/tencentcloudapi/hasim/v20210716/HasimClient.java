/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *创建云兔切换策略
     * @param req CreateTacticRequest
     * @return CreateTacticResponse
     * @throws TencentCloudSDKException
     */
    public CreateTacticResponse CreateTactic(CreateTacticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTactic", CreateTacticResponse.class);
    }

    /**
     *创建标签
     * @param req CreateTagRequest
     * @return CreateTagResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagResponse CreateTag(CreateTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTag", CreateTagResponse.class);
    }

    /**
     *删除自动化规则
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
    }

    /**
     *删除策略
     * @param req DeleteTacticRequest
     * @return DeleteTacticResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTacticResponse DeleteTactic(DeleteTacticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTactic", DeleteTacticResponse.class);
    }

    /**
     *删除标签
     * @param req DeleteTagRequest
     * @return DeleteTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagResponse DeleteTag(DeleteTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTag", DeleteTagResponse.class);
    }

    /**
     *查询云兔连接详细信息
     * @param req DescribeLinkRequest
     * @return DescribeLinkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLinkResponse DescribeLink(DescribeLinkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLink", DescribeLinkResponse.class);
    }

    /**
     *查询云兔连接列表
     * @param req DescribeLinksRequest
     * @return DescribeLinksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLinksResponse DescribeLinks(DescribeLinksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLinks", DescribeLinksResponse.class);
    }

    /**
     *查询订单列表
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrders", DescribeOrdersResponse.class);
    }

    /**
     *查询自动化规则
     * @param req DescribeRuleRequest
     * @return DescribeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleResponse DescribeRule(DescribeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRule", DescribeRuleResponse.class);
    }

    /**
     *查询自动化规则列表
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *查询云兔切换策略信息
     * @param req DescribeTacticRequest
     * @return DescribeTacticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTacticResponse DescribeTactic(DescribeTacticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTactic", DescribeTacticResponse.class);
    }

    /**
     *查询云兔切换策略列表
     * @param req DescribeTacticsRequest
     * @return DescribeTacticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTacticsResponse DescribeTactics(DescribeTacticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTactics", DescribeTacticsResponse.class);
    }

    /**
     *查询标签列表
     * @param req DescribeTagsRequest
     * @return DescribeTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsResponse DescribeTags(DescribeTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTags", DescribeTagsResponse.class);
    }

    /**
     *编辑云兔高级日志状态
     * @param req ModifyLinkAdvancedLogRequest
     * @return ModifyLinkAdvancedLogResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLinkAdvancedLogResponse ModifyLinkAdvancedLog(ModifyLinkAdvancedLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLinkAdvancedLog", ModifyLinkAdvancedLogResponse.class);
    }

    /**
     *编辑云兔策略
     * @param req ModifyLinkTacticRequest
     * @return ModifyLinkTacticResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLinkTacticResponse ModifyLinkTactic(ModifyLinkTacticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLinkTactic", ModifyLinkTacticResponse.class);
    }

    /**
     *修改云兔运营商
     * @param req ModifyLinkTeleRequest
     * @return ModifyLinkTeleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLinkTeleResponse ModifyLinkTele(ModifyLinkTeleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLinkTele", ModifyLinkTeleResponse.class);
    }

    /**
     *编辑自动化规则
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRule", ModifyRuleResponse.class);
    }

    /**
     *编辑自动化规则状态
     * @param req ModifyRuleStatusRequest
     * @return ModifyRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleStatusResponse ModifyRuleStatus(ModifyRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRuleStatus", ModifyRuleStatusResponse.class);
    }

    /**
     *修改云兔切换策略
     * @param req ModifyTacticRequest
     * @return ModifyTacticResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTacticResponse ModifyTactic(ModifyTacticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTactic", ModifyTacticResponse.class);
    }

    /**
     *编辑标签
     * @param req ModifyTagRequest
     * @return ModifyTagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTagResponse ModifyTag(ModifyTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTag", ModifyTagResponse.class);
    }

    /**
     *刷新云兔连接信息同步
     * @param req RenewLinkInfoRequest
     * @return RenewLinkInfoResponse
     * @throws TencentCloudSDKException
     */
    public RenewLinkInfoResponse RenewLinkInfo(RenewLinkInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewLinkInfo", RenewLinkInfoResponse.class);
    }

}
