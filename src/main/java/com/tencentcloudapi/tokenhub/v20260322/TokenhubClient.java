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
     *创建 API 密钥。

创建一个新的 API 密钥，创建成功后返回 API 密钥 ID。需指定平台类型、绑定方式和初始状态。
     * @param req CreateApiKeyRequest
     * @return CreateApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiKeyResponse CreateApiKey(CreateApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApiKey", CreateApiKeyResponse.class);
    }

    /**
     *创建推理服务。

创建一个在线推理服务，创建成功后返回推理服务 ID。
     * @param req CreateEndpointRequest
     * @return CreateEndpointResponse
     * @throws TencentCloudSDKException
     */
    public CreateEndpointResponse CreateEndpoint(CreateEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEndpoint", CreateEndpointResponse.class);
    }

    /**
     *创建术语库。

在当前应用下创建一个新的翻译术语库，用于自定义源语言到目标语言的术语映射。创建成功后返回术语库 ID，可通过该 ID 进一步管理术语条目。
     * @param req CreateGlossaryRequest
     * @return CreateGlossaryResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlossaryResponse CreateGlossary(CreateGlossaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlossary", CreateGlossaryResponse.class);
    }

    /**
     *批量创建术语条目。

在指定术语库下批量创建术语条目。单次最多创建 100 条。
     * @param req CreateGlossaryEntriesRequest
     * @return CreateGlossaryEntriesResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlossaryEntriesResponse CreateGlossaryEntries(CreateGlossaryEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlossaryEntries", CreateGlossaryEntriesResponse.class);
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
     *删除指定的 API 密钥，同时清理关联的模型绑定关系。
     * @param req DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApiKeyResponse DeleteApiKey(DeleteApiKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApiKey", DeleteApiKeyResponse.class);
    }

    /**
     *删除推理服务。

删除指定的推理服务端点，操作不可逆。调用接口后，若通过 DescribeEndpoint 接口查询不到对应的端点，则表示删除成功。
     * @param req DeleteEndpointRequest
     * @return DeleteEndpointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEndpointResponse DeleteEndpoint(DeleteEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEndpoint", DeleteEndpointResponse.class);
    }

    /**
     *删除术语库。

删除指定的术语库及其下所有术语条目。删除操作幂等，对不存在的术语库返回成功。调用接口后，若通过 DescribeGlossaries 接口查询不到对应术语库，则表示删除成功。
     * @param req DeleteGlossaryRequest
     * @return DeleteGlossaryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlossaryResponse DeleteGlossary(DeleteGlossaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlossary", DeleteGlossaryResponse.class);
    }

    /**
     *批量删除术语条目。

在指定术语库下批量删除术语条目。单次最多删除 200 条。若术语库不存在或不属于当前应用，返回 ResourceNotFound 错误。
     * @param req DeleteGlossaryEntriesRequest
     * @return DeleteGlossaryEntriesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlossaryEntriesResponse DeleteGlossaryEntries(DeleteGlossaryEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlossaryEntries", DeleteGlossaryEntriesResponse.class);
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
     *查询推理服务详情。

根据推理服务 ID 查询推理服务的详细信息，包括计费信息、免费额度、API 调用地址等。
     * @param req DescribeEndpointRequest
     * @return DescribeEndpointResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEndpointResponse DescribeEndpoint(DescribeEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEndpoint", DescribeEndpointResponse.class);
    }

    /**
     *查询术语库列表。

查询当前应用下的术语库列表。支持分页、过滤和排序。
     * @param req DescribeGlossariesRequest
     * @return DescribeGlossariesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlossariesResponse DescribeGlossaries(DescribeGlossariesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlossaries", DescribeGlossariesResponse.class);
    }

    /**
     *查询术语条目列表。

查询指定术语库下的术语条目。支持分页。
     * @param req DescribeGlossaryEntriesRequest
     * @return DescribeGlossaryEntriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlossaryEntriesResponse DescribeGlossaryEntries(DescribeGlossaryEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlossaryEntries", DescribeGlossaryEntriesResponse.class);
    }

    /**
     *查询模型接入点列表。

以模型为基准展示所有在线文本类型模型的接入点概览，支持按状态、计费方式、创建来源等条件筛选，使用 Offset/Limit 分页。
     * @param req DescribeModelEndpointListRequest
     * @return DescribeModelEndpointListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelEndpointListResponse DescribeModelEndpointList(DescribeModelEndpointListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelEndpointList", DescribeModelEndpointListResponse.class);
    }

    /**
     *查询模型列表。

支持按模型 ID、模型名称、模型能力等条件筛选，支持分页和排序。
     * @param req DescribeModelListRequest
     * @return DescribeModelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelListResponse DescribeModelList(DescribeModelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelList", DescribeModelListResponse.class);
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

从 CLS 日志服务查询套餐下的调用明细，按 team_id 过滤，支持游标分页。
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

指标族（MetricType）
- `tokens`（默认）：Token 用量统计。支持 Dimension = apikey / endpoint / model。
  返回指标：TotalToken（总）/ InputTotalToken（输入）/ OutputTotalToken（输出）/ CacheTotalToken（读缓存）。
- `search`：【待上线】联网搜索用量统计。支持 Dimension = apikey / endpoint / model。
  返回指标：SearchRequestCount（搜索请求数）/ SearchCount（搜索引擎调用次数）。

响应内容
- MetricType 字段用于切换指标族，响应回显 MetricType 与 MetricKeys。
- TotalStats：时间窗内全部对象的整段聚合值。
- PageStats：当前翻页内对象的整段聚合值。
- TopList：按MetricKeys[0]降序的对象列表，含整段聚合值与逐时间点曲线。
     * @param req DescribeUsageRankListRequest
     * @return DescribeUsageRankListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageRankListResponse DescribeUsageRankList(DescribeUsageRankListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsageRankList", DescribeUsageRankListResponse.class);
    }

    /**
     *更新 API 密钥信息。

更新 API 密钥的备注信息、 IP 白名单和 Token 限额（修改限额推荐使用QuotaDesired参数）。所有可选参数不传表示不修改。
     * @param req ModifyApiKeyInfoRequest
     * @return ModifyApiKeyInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiKeyInfoResponse ModifyApiKeyInfo(ModifyApiKeyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApiKeyInfo", ModifyApiKeyInfoResponse.class);
    }

    /**
     *更新 API 密钥的启用或禁用状态。
     * @param req ModifyApiKeyStatusRequest
     * @return ModifyApiKeyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiKeyStatusResponse ModifyApiKeyStatus(ModifyApiKeyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApiKeyStatus", ModifyApiKeyStatusResponse.class);
    }

    /**
     *修改推理服务。

修改推理服务的属性，支持修改服务名称、QPM/TPM 限流上限、TPM 包续费设置、智能路由开关和手动重试 TPM 购买。

注意事项：
- 不支持通过本接口切换计费类型（ChargeType），计费类型仅可在创建推理服务（CreateEndpoint）时指定。
- 不支持通过本接口修改 TPM 预付费保障包的 quota（TpmInputLimit/TpmOutputLimit/TimeSpan），这些值仅可在创建推理服务时指定。
- 当 RetryTPMPurchase 为 true 时，系统会异步重试 TPM 包购买，调用后需轮询推理服务状态确认结果。
     * @param req ModifyEndpointRequest
     * @return ModifyEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEndpointResponse ModifyEndpoint(ModifyEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEndpoint", ModifyEndpointResponse.class);
    }

    /**
     *批量修改术语条目。

在指定术语库下批量修改术语条目。单次最多修改 200 条。
     * @param req ModifyGlossaryEntriesRequest
     * @return ModifyGlossaryEntriesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlossaryEntriesResponse ModifyGlossaryEntries(ModifyGlossaryEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlossaryEntries", ModifyGlossaryEntriesResponse.class);
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
