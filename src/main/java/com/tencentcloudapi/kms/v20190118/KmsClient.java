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
    private static String service = "kms";
    private static String version = "2019-01-18";

    public KmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public KmsClient(Credential credential, String region, ClientProfile profile) {
        super(KmsClient.endpoint, KmsClient.version, credential, region, profile);
    }

    /**
     *对密钥进行归档，被归档的密钥只能用于解密，不能加密
     * @param req ArchiveKeyRequest
     * @return ArchiveKeyResponse
     * @throws TencentCloudSDKException
     */
    public ArchiveKeyResponse ArchiveKey(ArchiveKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ArchiveKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ArchiveKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ArchiveKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用指定的RSA非对称密钥的私钥进行数据解密，密文必须是使用对应公钥加密的。处于Enabled 状态的非对称密钥才能进行解密操作。
     * @param req AsymmetricRsaDecryptRequest
     * @return AsymmetricRsaDecryptResponse
     * @throws TencentCloudSDKException
     */
    public AsymmetricRsaDecryptResponse AsymmetricRsaDecrypt(AsymmetricRsaDecryptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AsymmetricRsaDecryptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AsymmetricRsaDecryptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AsymmetricRsaDecrypt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AsymmetricSm2DecryptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AsymmetricSm2Decrypt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *记录当前key被哪个云产品的那个资源所使用。如果当前key设置了自动过期，则取消该设置，确保当前key不会自动失效。如果当前关联关系已经创建，也返回成功。
     * @param req BindCloudResourceRequest
     * @return BindCloudResourceResponse
     * @throws TencentCloudSDKException
     */
    public BindCloudResourceResponse BindCloudResource(BindCloudResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindCloudResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindCloudResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindCloudResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取消密钥归档，取消后密钥的状态变为Enabled。
     * @param req CancelKeyArchiveRequest
     * @return CancelKeyArchiveResponse
     * @throws TencentCloudSDKException
     */
    public CancelKeyArchiveResponse CancelKeyArchive(CancelKeyArchiveRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelKeyArchiveResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelKeyArchiveResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelKeyArchive");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelKeyDeletionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelKeyDeletion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWhiteBoxKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWhiteBoxKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DecryptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "Decrypt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImportedKeyMaterialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImportedKeyMaterial");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWhiteBoxKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWhiteBoxKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxDecryptKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteBoxDecryptKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定密钥的设备指纹列表
     * @param req DescribeWhiteBoxDeviceFingerprintsRequest
     * @return DescribeWhiteBoxDeviceFingerprintsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxDeviceFingerprintsResponse DescribeWhiteBoxDeviceFingerprints(DescribeWhiteBoxDeviceFingerprintsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhiteBoxDeviceFingerprintsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxDeviceFingerprintsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteBoxDeviceFingerprints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteBoxKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxKeyDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteBoxKeyDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhiteBoxServiceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhiteBoxServiceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableKeyRotationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableKeyRotation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableWhiteBoxKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableWhiteBoxKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableWhiteBoxKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableWhiteBoxKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableKeyRotationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableKeyRotation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableWhiteBoxKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableWhiteBoxKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableWhiteBoxKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableWhiteBoxKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EncryptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "Encrypt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EncryptByWhiteBoxResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EncryptByWhiteBox");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateDataKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateDataKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateRandomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateRandom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetKeyRotationStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetKeyRotationStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetParametersForImportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetParametersForImport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于获取非对称密钥的公钥信息，可用于本地数据加密或验签。只有处于Enabled状态的非对称密钥才可能获取公钥。
     * @param req GetPublicKeyRequest
     * @return GetPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetPublicKeyResponse GetPublicKey(GetPublicKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPublicKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetPublicKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetPublicKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取可以提供KMS服务的地域列表
     * @param req GetRegionsRequest
     * @return GetRegionsResponse
     * @throws TencentCloudSDKException
     */
    public GetRegionsResponse GetRegions(GetRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetServiceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetServiceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImportKeyMaterialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImportKeyMaterial");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAlgorithmsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAlgorithms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListKeyDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListKeyDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListKeysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListKeys");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *覆盖指定密钥的设备指纹信息
     * @param req OverwriteWhiteBoxDeviceFingerprintsRequest
     * @return OverwriteWhiteBoxDeviceFingerprintsResponse
     * @throws TencentCloudSDKException
     */
    public OverwriteWhiteBoxDeviceFingerprintsResponse OverwriteWhiteBoxDeviceFingerprints(OverwriteWhiteBoxDeviceFingerprintsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OverwriteWhiteBoxDeviceFingerprintsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OverwriteWhiteBoxDeviceFingerprintsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OverwriteWhiteBoxDeviceFingerprints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReEncryptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReEncrypt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ScheduleKeyDeletionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScheduleKeyDeletion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *非对称密钥签名。
注意：只有 KeyUsage 为 ASYMMETRIC_SIGN_VERIFY_SM2、ASYMMETRIC_SIGN_VERIFY_ECC 或其他支持的 ASYMMETRIC_SIGN_VERIFY_${ALGORITHM} 的密钥才可以使用签名功能。
     * @param req SignByAsymmetricKeyRequest
     * @return SignByAsymmetricKeyResponse
     * @throws TencentCloudSDKException
     */
    public SignByAsymmetricKeyResponse SignByAsymmetricKey(SignByAsymmetricKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SignByAsymmetricKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SignByAsymmetricKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SignByAsymmetricKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除指定（key, 资源，云产品）的记录，以表明：指定的云产品的资源已不再使用当前的key。
     * @param req UnbindCloudResourceRequest
     * @return UnbindCloudResourceResponse
     * @throws TencentCloudSDKException
     */
    public UnbindCloudResourceResponse UnbindCloudResource(UnbindCloudResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindCloudResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindCloudResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindCloudResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateKeyDescriptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateKeyDescription");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用非对称密钥验签
     * @param req VerifyByAsymmetricKeyRequest
     * @return VerifyByAsymmetricKeyResponse
     * @throws TencentCloudSDKException
     */
    public VerifyByAsymmetricKeyResponse VerifyByAsymmetricKey(VerifyByAsymmetricKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyByAsymmetricKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyByAsymmetricKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyByAsymmetricKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
