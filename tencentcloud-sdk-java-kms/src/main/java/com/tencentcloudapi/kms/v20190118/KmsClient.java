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
package com.tencentcloudapi.kms.v20190118;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.kms.v20190118.models.*;

public class KmsClient extends AbstractClient{
    private static String endpoint = "kms.tencentcloudapi.com";
    private static String version = "2019-01-18";

    public KmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public KmsClient(Credential credential, String region, ClientProfile profile) {
        super(KmsClient.endpoint, KmsClient.version, credential, region, profile);
    }

    /**
     *使用指定的RSA非对称密钥的私钥进行数据解密，密文必须是使用对应公钥加密的。处于Enabled 状态的非对称密钥才能进行解密操作。
     * @param req AsymmetricRsaDecryptRequest
     * @return AsymmetricRsaDecryptResponse
     * @throws TencentCloudSDKException
     */
    public AsymmetricRsaDecryptResponse AsymmetricRsaDecrypt(AsymmetricRsaDecryptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AsymmetricRsaDecryptResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AsymmetricRsaDecryptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AsymmetricRsaDecrypt"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用指定的SM2非对称密钥的私钥进行数据解密，密文必须是使用对应公钥加密的。处于Enabled 状态的非对称密钥才能进行解密操作。传入的密文的长度不能超过256字节。
     * @param req AsymmetricSm2DecryptRequest
     * @return AsymmetricSm2DecryptResponse
     * @throws TencentCloudSDKException
     */
    public AsymmetricSm2DecryptResponse AsymmetricSm2Decrypt(AsymmetricSm2DecryptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AsymmetricSm2DecryptResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AsymmetricSm2DecryptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AsymmetricSm2Decrypt"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取消CMK的计划删除操作
     * @param req CancelKeyDeletionRequest
     * @return CancelKeyDeletionResponse
     * @throws TencentCloudSDKException
     */
    public CancelKeyDeletionResponse CancelKeyDeletion(CancelKeyDeletionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelKeyDeletionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CancelKeyDeletionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CancelKeyDeletion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户管理数据密钥的主密钥CMK（Custom Master Key）。
     * @param req CreateKeyRequest
     * @return CreateKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateKeyResponse CreateKey(CreateKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建白盒密钥。 密钥个数的上限为 50。
     * @param req CreateWhiteBoxKeyRequest
     * @return CreateWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateWhiteBoxKeyResponse CreateWhiteBoxKey(CreateWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWhiteBoxKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWhiteBoxKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateWhiteBoxKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于解密密文，得到明文数据。
     * @param req DecryptRequest
     * @return DecryptResponse
     * @throws TencentCloudSDKException
     */
    public DecryptResponse Decrypt(DecryptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DecryptResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DecryptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "Decrypt"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除导入的密钥材料，仅对EXTERNAL类型的CMK有效，该接口将CMK设置为PendingImport 状态，并不会删除CMK，在重新进行密钥导入后可继续使用。彻底删除CMK请使用 ScheduleKeyDeletion 接口。
     * @param req DeleteImportedKeyMaterialRequest
     * @return DeleteImportedKeyMaterialResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImportedKeyMaterialResponse DeleteImportedKeyMaterial(DeleteImportedKeyMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImportedKeyMaterialResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImportedKeyMaterialResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteImportedKeyMaterial"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除白盒密钥, 注意：必须先禁用后，才可以删除。
     * @param req DeleteWhiteBoxKeyRequest
     * @return DeleteWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWhiteBoxKeyResponse DeleteWhiteBoxKey(DeleteWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWhiteBoxKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWhiteBoxKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteWhiteBoxKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取指定KeyId的主密钥属性详情信息。
     * @param req DescribeKeyRequest
     * @return DescribeKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeyResponse DescribeKey(DescribeKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于批量获取主密钥属性信息。
     * @param req DescribeKeysRequest
     * @return DescribeKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeysResponse DescribeKeys(DescribeKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取白盒解密密钥
     * @param req DescribeWhiteBoxDecryptKeyRequest
     * @return DescribeWhiteBoxDecryptKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxDecryptKeyResponse DescribeWhiteBoxDecryptKey(DescribeWhiteBoxDecryptKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteBoxDecryptKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxDecryptKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWhiteBoxDecryptKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *展示白盒密钥的信息
     * @param req DescribeWhiteBoxKeyRequest
     * @return DescribeWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxKeyResponse DescribeWhiteBoxKey(DescribeWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteBoxKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWhiteBoxKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取白盒密钥列表
     * @param req DescribeWhiteBoxKeyDetailsRequest
     * @return DescribeWhiteBoxKeyDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxKeyDetailsResponse DescribeWhiteBoxKeyDetails(DescribeWhiteBoxKeyDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteBoxKeyDetailsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxKeyDetailsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWhiteBoxKeyDetails"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取白盒密钥服务状态
     * @param req DescribeWhiteBoxServiceStatusRequest
     * @return DescribeWhiteBoxServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxServiceStatusResponse DescribeWhiteBoxServiceStatus(DescribeWhiteBoxServiceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteBoxServiceStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxServiceStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWhiteBoxServiceStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于禁用一个主密钥，处于禁用状态的Key无法用于加密、解密操作。
     * @param req DisableKeyRequest
     * @return DisableKeyResponse
     * @throws TencentCloudSDKException
     */
    public DisableKeyResponse DisableKey(DisableKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对指定的CMK禁止密钥轮换功能。
     * @param req DisableKeyRotationRequest
     * @return DisableKeyRotationResponse
     * @throws TencentCloudSDKException
     */
    public DisableKeyRotationResponse DisableKeyRotation(DisableKeyRotationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableKeyRotationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableKeyRotationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableKeyRotation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于批量禁止CMK的使用。
     * @param req DisableKeysRequest
     * @return DisableKeysResponse
     * @throws TencentCloudSDKException
     */
    public DisableKeysResponse DisableKeys(DisableKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *禁用白盒密钥
     * @param req DisableWhiteBoxKeyRequest
     * @return DisableWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public DisableWhiteBoxKeyResponse DisableWhiteBoxKey(DisableWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableWhiteBoxKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableWhiteBoxKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableWhiteBoxKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量禁用白盒密钥
     * @param req DisableWhiteBoxKeysRequest
     * @return DisableWhiteBoxKeysResponse
     * @throws TencentCloudSDKException
     */
    public DisableWhiteBoxKeysResponse DisableWhiteBoxKeys(DisableWhiteBoxKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableWhiteBoxKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableWhiteBoxKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableWhiteBoxKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于启用一个指定的CMK。
     * @param req EnableKeyRequest
     * @return EnableKeyResponse
     * @throws TencentCloudSDKException
     */
    public EnableKeyResponse EnableKey(EnableKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对指定的CMK开启密钥轮换功能。
     * @param req EnableKeyRotationRequest
     * @return EnableKeyRotationResponse
     * @throws TencentCloudSDKException
     */
    public EnableKeyRotationResponse EnableKeyRotation(EnableKeyRotationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableKeyRotationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableKeyRotationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableKeyRotation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于批量启用CMK。
     * @param req EnableKeysRequest
     * @return EnableKeysResponse
     * @throws TencentCloudSDKException
     */
    public EnableKeysResponse EnableKeys(EnableKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用白盒密钥
     * @param req EnableWhiteBoxKeyRequest
     * @return EnableWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public EnableWhiteBoxKeyResponse EnableWhiteBoxKey(EnableWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableWhiteBoxKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableWhiteBoxKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableWhiteBoxKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量启用白盒密钥
     * @param req EnableWhiteBoxKeysRequest
     * @return EnableWhiteBoxKeysResponse
     * @throws TencentCloudSDKException
     */
    public EnableWhiteBoxKeysResponse EnableWhiteBoxKeys(EnableWhiteBoxKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableWhiteBoxKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableWhiteBoxKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableWhiteBoxKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于加密最多为4KB任意数据，可用于加密数据库密码，RSA Key，或其它较小的敏感信息。对于应用的数据加密，使用GenerateDataKey生成的DataKey进行本地数据的加解密操作
     * @param req EncryptRequest
     * @return EncryptResponse
     * @throws TencentCloudSDKException
     */
    public EncryptResponse Encrypt(EncryptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EncryptResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EncryptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "Encrypt"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用白盒密钥进行加密
     * @param req EncryptByWhiteBoxRequest
     * @return EncryptByWhiteBoxResponse
     * @throws TencentCloudSDKException
     */
    public EncryptByWhiteBoxResponse EncryptByWhiteBox(EncryptByWhiteBoxRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EncryptByWhiteBoxResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EncryptByWhiteBoxResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EncryptByWhiteBox"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口生成一个数据密钥，您可以用这个密钥进行本地数据的加密。
     * @param req GenerateDataKeyRequest
     * @return GenerateDataKeyResponse
     * @throws TencentCloudSDKException
     */
    public GenerateDataKeyResponse GenerateDataKey(GenerateDataKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateDataKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateDataKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GenerateDataKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *随机数生成接口。
     * @param req GenerateRandomRequest
     * @return GenerateRandomResponse
     * @throws TencentCloudSDKException
     */
    public GenerateRandomResponse GenerateRandom(GenerateRandomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateRandomResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateRandomResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GenerateRandom"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定的CMK是否开启了密钥轮换功能。
     * @param req GetKeyRotationStatusRequest
     * @return GetKeyRotationStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetKeyRotationStatusResponse GetKeyRotationStatus(GetKeyRotationStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetKeyRotationStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetKeyRotationStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetKeyRotationStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取导入主密钥（CMK）材料的参数，返回的Token作为执行ImportKeyMaterial的参数之一，返回的PublicKey用于对自主导入密钥材料进行加密。返回的Token和PublicKey 24小时后失效，失效后如需重新导入，需要再次调用该接口获取新的Token和PublicKey。
     * @param req GetParametersForImportRequest
     * @return GetParametersForImportResponse
     * @throws TencentCloudSDKException
     */
    public GetParametersForImportResponse GetParametersForImport(GetParametersForImportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetParametersForImportResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetParametersForImportResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetParametersForImport"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用户获取 KeyUsage为ASYMMETRIC_DECRYPT_RSA_2048 和 ASYMMETRIC_DECRYPT_SM2 的非对称密钥的公钥信息，使用该公钥用户可在本地进行数据加密，使用该公钥加密的数据只能通过KMS使用对应的私钥进行解密。只有处于Enabled状态的非对称密钥才可能获取公钥。
     * @param req GetPublicKeyRequest
     * @return GetPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetPublicKeyResponse GetPublicKey(GetPublicKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPublicKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPublicKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPublicKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询该用户是否已开通KMS服务
     * @param req GetServiceStatusRequest
     * @return GetServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetServiceStatusResponse GetServiceStatus(GetServiceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetServiceStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetServiceStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetServiceStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于导入密钥材料。只有类型为EXTERNAL 的CMK 才可以导入，导入的密钥材料使用 GetParametersForImport 获取的密钥进行加密。可以为指定的 CMK 重新导入密钥材料，并重新指定过期时间，但必须导入相同的密钥材料。CMK 密钥材料导入后不可以更换密钥材料。导入的密钥材料过期或者被删除后，指定的CMK将无法使用，需要再次导入相同的密钥材料才能正常使用。CMK是独立的，同样的密钥材料可导入不同的 CMK 中，但使用其中一个 CMK 加密的数据无法使用另一个 CMK解密。
只有Enabled 和 PendingImport状态的CMK可以导入密钥材料。
     * @param req ImportKeyMaterialRequest
     * @return ImportKeyMaterialResponse
     * @throws TencentCloudSDKException
     */
    public ImportKeyMaterialResponse ImportKeyMaterial(ImportKeyMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportKeyMaterialResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ImportKeyMaterialResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ImportKeyMaterial"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出当前Region支持的加密方式
     * @param req ListAlgorithmsRequest
     * @return ListAlgorithmsResponse
     * @throws TencentCloudSDKException
     */
    public ListAlgorithmsResponse ListAlgorithms(ListAlgorithmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAlgorithmsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListAlgorithmsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListAlgorithms"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据指定Offset和Limit获取主密钥列表详情。
     * @param req ListKeyDetailRequest
     * @return ListKeyDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListKeyDetailResponse ListKeyDetail(ListKeyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListKeyDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListKeyDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListKeyDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出账号下面状态为Enabled， Disabled 和 PendingImport 的CMK KeyId 列表
     * @param req ListKeysRequest
     * @return ListKeysResponse
     * @throws TencentCloudSDKException
     */
    public ListKeysResponse ListKeys(ListKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用指定CMK对密文重新加密。
     * @param req ReEncryptRequest
     * @return ReEncryptResponse
     * @throws TencentCloudSDKException
     */
    public ReEncryptResponse ReEncrypt(ReEncryptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReEncryptResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReEncryptResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReEncrypt"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *CMK计划删除接口，用于指定CMK删除的时间，可选时间区间为[7,30]天
     * @param req ScheduleKeyDeletionRequest
     * @return ScheduleKeyDeletionResponse
     * @throws TencentCloudSDKException
     */
    public ScheduleKeyDeletionResponse ScheduleKeyDeletion(ScheduleKeyDeletionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScheduleKeyDeletionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ScheduleKeyDeletionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ScheduleKeyDeletion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改CMK的别名。对于处于PendingDelete状态的CMK禁止修改。
     * @param req UpdateAliasRequest
     * @return UpdateAliasResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAliasResponse UpdateAlias(UpdateAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAliasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于对指定的cmk修改描述信息。对于处于PendingDelete状态的CMK禁止修改。
     * @param req UpdateKeyDescriptionRequest
     * @return UpdateKeyDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateKeyDescriptionResponse UpdateKeyDescription(UpdateKeyDescriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateKeyDescriptionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateKeyDescriptionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateKeyDescription"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
