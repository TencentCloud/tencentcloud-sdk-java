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
package com.tencentcloudapi.tokenhub.v20260322;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tokenhub.v20260322.models.*;

public class TokenhubClient extends AbstractClient{
    private static String endpoint = "tokenhub.tencentcloudapi.com";
    private static String service = "tokenhub";
    private static String version = "2026-03-22";

    public TokenhubClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TokenhubClient(Credential credential, String region, ClientProfile profile) {
        super(TokenhubClient.endpoint, TokenhubClient.version, credential, region, profile);
    }

    /**
     *批量创建 TokenPlan APIKey。

传入名称前缀和数量，自动按 {ApiKeyName}-{序号} 格式生成名称（如 aaa-1, aaa-2）。允许同名。支持部分成功，最多 100 条。
     * @param req CreateTokenPlanApiKeysRequest
     * @return CreateTokenPlanApiKeysResponse
     * @throws TencentCloudSDKException
     */
    public CreateTokenPlanApiKeysResponse CreateTokenPlanApiKeys(CreateTokenPlanApiKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTokenPlanApiKeys", CreateTokenPlanApiKeysResponse.class);
    }

    /**
     *购买套餐。

发起 TokenPlan 套餐下单并完成支付，成功后返回大订单 ID 及关联的子订单、资源信息。
     * @param req CreateTokenPlanTeamOrderAndBuyRequest
     * @return CreateTokenPlanTeamOrderAndBuyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTokenPlanTeamOrderAndBuyResponse CreateTokenPlanTeamOrderAndBuy(CreateTokenPlanTeamOrderAndBuyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTokenPlanTeamOrderAndBuy", CreateTokenPlanTeamOrderAndBuyResponse.class);
    }

    /**
     *删除 TokenPlan APIKey。

同时删除额度中心子额度包并通知网关清除缓存。
     * @param req DeleteTokenPlanApiKeyRequest
     * @return DeleteTokenPlanApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTokenPlanApiKeyResponse DeleteTokenPlanApiKey(DeleteTokenPlanApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTokenPlanApiKey", DeleteTokenPlanApiKeyResponse.class);
    }

    /**
     *根据 API 密钥 ID 或密钥值查询 API 密钥详情，返回明文密钥。ApiKeyId 和 ApiKey 至少需传入其一，优先使用 ApiKeyId。
     * @param req DescribeApiKeyRequest
     * @return DescribeApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiKeyResponse DescribeApiKey(DescribeApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiKey", DescribeApiKeyResponse.class);
    }

    /**
     *查询 API 密钥列表。

查询当前用户的 API 密钥列表，密钥值脱敏展示。支持分页、过滤和排序。
     * @param req DescribeApiKeyListRequest
     * @return DescribeApiKeyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiKeyListResponse DescribeApiKeyList(DescribeApiKeyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiKeyList", DescribeApiKeyListResponse.class);
    }

    /**
     *查询 TokenPlan 套餐详情。

返回套餐基本信息及额度中心主额度包余量。
     * @param req DescribeTokenPlanRequest
     * @return DescribeTokenPlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenPlanResponse DescribeTokenPlan(DescribeTokenPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenPlan", DescribeTokenPlanResponse.class);
    }

    /**
     *查询 TokenPlan APIKey 详情。

返回 APIKey 完整信息（含明文密钥）及子额度包余量。
     * @param req DescribeTokenPlanApiKeyRequest
     * @return DescribeTokenPlanApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenPlanApiKeyResponse DescribeTokenPlanApiKey(DescribeTokenPlanApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenPlanApiKey", DescribeTokenPlanApiKeyResponse.class);
    }

    /**
     *查询 TokenPlan APIKey 列表。

返回指定套餐下的 APIKey 列表，密钥已脱敏。主账号可查看全部，子账号仅可查看自己创建的。
     * @param req DescribeTokenPlanApiKeyListRequest
     * @return DescribeTokenPlanApiKeyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenPlanApiKeyListResponse DescribeTokenPlanApiKeyList(DescribeTokenPlanApiKeyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenPlanApiKeyList", DescribeTokenPlanApiKeyListResponse.class);
    }

    /**
     *查询 TokenPlan APIKey 密钥（明文）。

返回指定 APIKey 的明文密钥值，请妥善保管。
     * @param req DescribeTokenPlanApiKeySecretRequest
     * @return DescribeTokenPlanApiKeySecretResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenPlanApiKeySecretResponse DescribeTokenPlanApiKeySecret(DescribeTokenPlanApiKeySecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenPlanApiKeySecret", DescribeTokenPlanApiKeySecretResponse.class);
    }

    /**
     *查询 TokenPlan APIKey 调用明细。

从 CLS 日志服务查询套餐下的调用明细，按 pkg_id 过滤，支持游标分页。
     * @param req DescribeTokenPlanApiKeyUsageDetailRequest
     * @return DescribeTokenPlanApiKeyUsageDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenPlanApiKeyUsageDetailResponse DescribeTokenPlanApiKeyUsageDetail(DescribeTokenPlanApiKeyUsageDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenPlanApiKeyUsageDetail", DescribeTokenPlanApiKeyUsageDetailResponse.class);
    }

    /**
     *查询 TokenPlan 套餐列表。

支持分页、过滤和排序。主账号可查看全部，子账号仅可查看自己创建的。返回结果包含每个套餐关联的额度中心主额度包详情。
     * @param req DescribeTokenPlanListRequest
     * @return DescribeTokenPlanListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenPlanListResponse DescribeTokenPlanList(DescribeTokenPlanListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTokenPlanList", DescribeTokenPlanListResponse.class);
    }

    /**
     *查询用量排行列表。

按 apikey、endpoint、model 三个维度统计指定时间窗内的用量排行，返回顶部数据卡所需的 PageStats/TotalStats、左侧 Top 列表（含每对象整段累计值）、右侧色块趋势图所需的逐点曲线。前端通过 Offset 翻页、ShowAll 切换 CSV 全量导出模式。

MetricType 字段用于切换指标族，本期支持 tokens；接口预留以支持后续指标族扩展。响应回显 MetricType 与 MetricKeys（实际参与渲染的 metric key 列表，顺序固定 [Total, Input, Output]），前端按此渲染顶部数据卡与趋势图，无需硬编码 key 名。
     * @param req DescribeUsageRankListRequest
     * @return DescribeUsageRankListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageRankListResponse DescribeUsageRankList(DescribeUsageRankListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsageRankList", DescribeUsageRankListResponse.class);
    }

    /**
     *修改 TokenPlan APIKey 配置（网关关注字段）。

修改后自动通知网关更新缓存并同步额度中心。
     * @param req ModifyTokenPlanApiKeyRequest
     * @return ModifyTokenPlanApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTokenPlanApiKeyResponse ModifyTokenPlanApiKey(ModifyTokenPlanApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTokenPlanApiKey", ModifyTokenPlanApiKeyResponse.class);
    }

    /**
     *重置 TokenPlan APIKey 密钥。

重新生成密钥值，密钥版本号递增，旧密钥立即失效。APIKey ID 不变。重置后需通过 DescribeTokenPlanApiKeySecret 查询新密钥。
     * @param req ModifyTokenPlanApiKeySecretRequest
     * @return ModifyTokenPlanApiKeySecretResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTokenPlanApiKeySecretResponse ModifyTokenPlanApiKeySecret(ModifyTokenPlanApiKeySecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTokenPlanApiKeySecret", ModifyTokenPlanApiKeySecretResponse.class);
    }

    /**
     *续费套餐。

对已有的 TokenPlan 套餐发起续费下单并完成支付，成功后返回大订单 ID 及关联的子订单、资源信息。
     * @param req RenewTokenPlanTeamOrderRequest
     * @return RenewTokenPlanTeamOrderResponse
     * @throws TencentCloudSDKException
     */
    public RenewTokenPlanTeamOrderResponse RenewTokenPlanTeamOrder(RenewTokenPlanTeamOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewTokenPlanTeamOrder", RenewTokenPlanTeamOrderResponse.class);
    }

    /**
     *升配套餐。

对已有的 TokenPlan 套餐发起升配下单并完成支付，扩容积分或 Token 额度，成功后返回大订单 ID 及关联的子订单、资源信息。新额度必须大于当前额度。
     * @param req UpgradeTokenPlanTeamOrderRequest
     * @return UpgradeTokenPlanTeamOrderResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeTokenPlanTeamOrderResponse UpgradeTokenPlanTeamOrder(UpgradeTokenPlanTeamOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeTokenPlanTeamOrder", UpgradeTokenPlanTeamOrderResponse.class);
    }

}
