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
package com.tencentcloudapi.ssm.v20190923;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ssm.v20190923.models.*;

public class SsmClient extends AbstractClient{
    private static String endpoint = "ssm.tencentcloudapi.com";
    private static String service = "ssm";
    private static String version = "2019-09-23";
    
    public SsmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SsmClient(Credential credential, String region, ClientProfile profile) {
        super(SsmClient.endpoint, SsmClient.version, credential, region, profile);
    }

    /**
     *创建云产品凭据
     * @param req CreateProductSecretRequest
     * @return CreateProductSecretResponse
     * @throws TencentCloudSDKException
     */
    public CreateProductSecretResponse CreateProductSecret(CreateProductSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProductSecret", CreateProductSecretResponse.class);
    }

    /**
     *创建用于托管SSH密钥对的凭据
     * @param req CreateSSHKeyPairSecretRequest
     * @return CreateSSHKeyPairSecretResponse
     * @throws TencentCloudSDKException
     */
    public CreateSSHKeyPairSecretResponse CreateSSHKeyPairSecret(CreateSSHKeyPairSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSSHKeyPairSecret", CreateSSHKeyPairSecretResponse.class);
    }

    /**
     *创建新的凭据信息，通过KMS进行加密保护。每个Region最多可创建存储1000个凭据信息。
     * @param req CreateSecretRequest
     * @return CreateSecretResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecretResponse CreateSecret(CreateSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecret", CreateSecretResponse.class);
    }

    /**
     *删除指定的凭据信息，可以通过RecoveryWindowInDays参数设置立即删除或者计划删除。对于计划删除的凭据，在删除日期到达之前状态为 PendingDelete，并可以通过RestoreSecret 进行恢复，超出指定删除日期之后会被彻底删除。您必须先通过 DisableSecret 停用凭据后才可以进行（计划）删除操作。
     * @param req DeleteSecretRequest
     * @return DeleteSecretResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecretResponse DeleteSecret(DeleteSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecret", DeleteSecretResponse.class);
    }

    /**
     *该接口用于直接删除指定凭据下的单个版本凭据，删除操作立即生效，对所有状态下的凭据版本都可以删除。
本接口仅适用于用户自定义凭据，本接口不能对云产品凭据进行操作。
     * @param req DeleteSecretVersionRequest
     * @return DeleteSecretVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecretVersionResponse DeleteSecretVersion(DeleteSecretVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecretVersion", DeleteSecretVersionResponse.class);
    }

    /**
     *查询异步任务的执行结果
     * @param req DescribeAsyncRequestInfoRequest
     * @return DescribeAsyncRequestInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRequestInfoResponse DescribeAsyncRequestInfo(DescribeAsyncRequestInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAsyncRequestInfo", DescribeAsyncRequestInfoResponse.class);
    }

    /**
     *查询凭据轮转策略详情。
本接口只适用于云产品凭据。
     * @param req DescribeRotationDetailRequest
     * @return DescribeRotationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRotationDetailResponse DescribeRotationDetail(DescribeRotationDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRotationDetail", DescribeRotationDetailResponse.class);
    }

    /**
     *查询凭据轮转历史版本。
本接口仅适用于云产品凭据。
     * @param req DescribeRotationHistoryRequest
     * @return DescribeRotationHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRotationHistoryResponse DescribeRotationHistory(DescribeRotationHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRotationHistory", DescribeRotationHistoryResponse.class);
    }

    /**
     *获取凭据的详细属性信息。
     * @param req DescribeSecretRequest
     * @return DescribeSecretResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecretResponse DescribeSecret(DescribeSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecret", DescribeSecretResponse.class);
    }

    /**
     *查询支持的云产品列表
     * @param req DescribeSupportedProductsRequest
     * @return DescribeSupportedProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupportedProductsResponse DescribeSupportedProducts(DescribeSupportedProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSupportedProducts", DescribeSupportedProductsResponse.class);
    }

    /**
     *停用指定的凭据，停用后状态为 Disabled，无法通过接口获取该凭据的明文。
     * @param req DisableSecretRequest
     * @return DisableSecretResponse
     * @throws TencentCloudSDKException
     */
    public DisableSecretResponse DisableSecret(DisableSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableSecret", DisableSecretResponse.class);
    }

    /**
     *该接口用于开启凭据，状态为Enabled。可以通过 GetSecretValue 接口获取凭据明文。处于PendingDelete状态的凭据不能直接开启，需要通过RestoreSecret 恢复后再开启使用。
     * @param req EnableSecretRequest
     * @return EnableSecretResponse
     * @throws TencentCloudSDKException
     */
    public EnableSecretResponse EnableSecret(EnableSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableSecret", EnableSecretResponse.class);
    }

    /**
     *获取控制台展示region列表
     * @param req GetRegionsRequest
     * @return GetRegionsResponse
     * @throws TencentCloudSDKException
     */
    public GetRegionsResponse GetRegions(GetRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRegions", GetRegionsResponse.class);
    }

    /**
     *获取SSH密钥对凭据明文信息。
     * @param req GetSSHKeyPairValueRequest
     * @return GetSSHKeyPairValueResponse
     * @throws TencentCloudSDKException
     */
    public GetSSHKeyPairValueResponse GetSSHKeyPairValue(GetSSHKeyPairValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSSHKeyPairValue", GetSSHKeyPairValueResponse.class);
    }

    /**
     *对于用户自定义凭据，通过指定凭据名称和版本来获取凭据的明文信息；
对于云产品凭据如Mysql凭据，通过指定凭据名称和历史版本号来获取历史轮转凭据的明文信息，如果要获取当前正在使用的凭据版本的明文，需要将版本号指定为：SSM_Current。
     * @param req GetSecretValueRequest
     * @return GetSecretValueResponse
     * @throws TencentCloudSDKException
     */
    public GetSecretValueResponse GetSecretValue(GetSecretValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSecretValue", GetSecretValueResponse.class);
    }

    /**
     *该接口用户获取用户SecretsManager服务开通状态。
     * @param req GetServiceStatusRequest
     * @return GetServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetServiceStatusResponse GetServiceStatus(GetServiceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetServiceStatus", GetServiceStatusResponse.class);
    }

    /**
     *该接口用于获取指定凭据下的版本列表信息
     * @param req ListSecretVersionIdsRequest
     * @return ListSecretVersionIdsResponse
     * @throws TencentCloudSDKException
     */
    public ListSecretVersionIdsResponse ListSecretVersionIds(ListSecretVersionIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSecretVersionIds", ListSecretVersionIdsResponse.class);
    }

    /**
     *该接口用于获取所有凭据的详细列表，可以指定过滤字段、排序方式等。
     * @param req ListSecretsRequest
     * @return ListSecretsResponse
     * @throws TencentCloudSDKException
     */
    public ListSecretsResponse ListSecrets(ListSecretsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSecrets", ListSecretsResponse.class);
    }

    /**
     *该接口在指定名称的凭据下增加新版本的凭据内容，一个凭据下最多可以支持10个版本。只能对处于Enabled 和 Disabled 状态的凭据添加新的版本。
本接口仅适用于用户自定义凭据，对云产品凭据不能操作。
     * @param req PutSecretValueRequest
     * @return PutSecretValueResponse
     * @throws TencentCloudSDKException
     */
    public PutSecretValueResponse PutSecretValue(PutSecretValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutSecretValue", PutSecretValueResponse.class);
    }

    /**
     *该接口用于恢复计划删除（PendingDelete状态）中的凭据，取消计划删除。取消计划删除的凭据将处于Disabled 状态，如需恢复使用，通过EnableSecret 接口开启凭据。
     * @param req RestoreSecretRequest
     * @return RestoreSecretResponse
     * @throws TencentCloudSDKException
     */
    public RestoreSecretResponse RestoreSecret(RestoreSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreSecret", RestoreSecretResponse.class);
    }

    /**
     *轮转云产品凭据或云API密钥对凭据。
该接口仅适用于处于Enabled状态的云产品凭据或处于Enable状态的云API密钥对凭据，对于其他状态的云产品凭据或云API密钥对凭据或用户自定义凭据不适用。
     * @param req RotateProductSecretRequest
     * @return RotateProductSecretResponse
     * @throws TencentCloudSDKException
     */
    public RotateProductSecretResponse RotateProductSecret(RotateProductSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RotateProductSecret", RotateProductSecretResponse.class);
    }

    /**
     *该接口用于修改指定凭据的描述信息，仅能修改Enabled 和 Disabled 状态的凭据。
     * @param req UpdateDescriptionRequest
     * @return UpdateDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDescriptionResponse UpdateDescription(UpdateDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDescription", UpdateDescriptionResponse.class);
    }

    /**
     *设置云产品凭据轮转策略，可以设置：
是否开启轮转
轮转周期
轮转开始时间
     * @param req UpdateRotationStatusRequest
     * @return UpdateRotationStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRotationStatusResponse UpdateRotationStatus(UpdateRotationStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRotationStatus", UpdateRotationStatusResponse.class);
    }

    /**
     *该接口用于更新指定凭据名称和版本号的内容，调用该接口会对新的凭据内容加密后覆盖旧的内容。仅允许更新Enabled 和 Disabled 状态的凭据。
本接口仅适用于用户自定义凭据，不能对云产品凭据操作。
     * @param req UpdateSecretRequest
     * @return UpdateSecretResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSecretResponse UpdateSecret(UpdateSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSecret", UpdateSecretResponse.class);
    }

}
