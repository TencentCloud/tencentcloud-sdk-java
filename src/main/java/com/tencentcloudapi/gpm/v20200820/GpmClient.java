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
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

取消匹配。
     * @param req CancelMatchingRequest
     * @return CancelMatchingResponse
     * @throws TencentCloudSDKException
     */
    public CancelMatchingResponse CancelMatching(CancelMatchingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelMatching", CancelMatchingResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

创建匹配
     * @param req CreateMatchRequest
     * @return CreateMatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateMatchResponse CreateMatch(CreateMatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMatch", CreateMatchResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

创建规则
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

删除匹配
     * @param req DeleteMatchRequest
     * @return DeleteMatchResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMatchResponse DeleteMatch(DeleteMatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMatch", DeleteMatchResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

删除规则
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

统计数据
     * @param req DescribeDataRequest
     * @return DescribeDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataResponse DescribeData(DescribeDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeData", DescribeDataResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

查询匹配详情
     * @param req DescribeMatchRequest
     * @return DescribeMatchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMatchResponse DescribeMatch(DescribeMatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMatch", DescribeMatchResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

分页查询匹配Code
     * @param req DescribeMatchCodesRequest
     * @return DescribeMatchCodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMatchCodesResponse DescribeMatchCodes(DescribeMatchCodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMatchCodes", DescribeMatchCodesResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

分页查询匹配列表
     * @param req DescribeMatchesRequest
     * @return DescribeMatchesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMatchesResponse DescribeMatches(DescribeMatchesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMatches", DescribeMatchesResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

查询匹配进度。
     * @param req DescribeMatchingProgressRequest
     * @return DescribeMatchingProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMatchingProgressResponse DescribeMatchingProgress(DescribeMatchingProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMatchingProgress", DescribeMatchingProgressResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

查询规则详情
     * @param req DescribeRuleRequest
     * @return DescribeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleResponse DescribeRule(DescribeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRule", DescribeRuleResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

分页查询规则集列表
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRules", DescribeRulesResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

查询匹配Token，Token用于push消息验证。
     * @param req DescribeTokenRequest
     * @return DescribeTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenResponse DescribeToken(DescribeTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeToken", DescribeTokenResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

修改匹配
     * @param req ModifyMatchRequest
     * @return ModifyMatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMatchResponse ModifyMatch(ModifyMatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMatch", ModifyMatchResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

修改规则（描述、标签）
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRule", ModifyRuleResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

修改匹配Token。
     * @param req ModifyTokenRequest
     * @return ModifyTokenResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTokenResponse ModifyToken(ModifyTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyToken", ModifyTokenResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

支持传入一个玩家或多个玩家发起匹配，在同一个请求内的玩家将被分到同一个对局。
     * @param req StartMatchingRequest
     * @return StartMatchingResponse
     * @throws TencentCloudSDKException
     */
    public StartMatchingResponse StartMatching(StartMatchingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartMatching", StartMatchingResponse.class);
    }

    /**
     *此接口无法使用，游戏玩家匹配GPM已于6.1正式下架，感谢您的支持

通过调用StartMatchingBackfill，用户可以传入一个回填的匹配请求，GPM为回填请求搜索符合条件的ticket并形成一个新的match。
     * @param req StartMatchingBackfillRequest
     * @return StartMatchingBackfillResponse
     * @throws TencentCloudSDKException
     */
    public StartMatchingBackfillResponse StartMatchingBackfill(StartMatchingBackfillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartMatchingBackfill", StartMatchingBackfillResponse.class);
    }

}
