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
        req.setSkipSign(false);
        return this.internalRequest(req, "ArchiveKey", ArchiveKeyResponse.class);
    }

    /**
     *使用指定的RSA非对称密钥的私钥进行数据解密，密文必须是使用对应公钥加密的。处于Enabled 状态的非对称密钥才能进行解密操作。
     * @param req AsymmetricRsaDecryptRequest
     * @return AsymmetricRsaDecryptResponse
     * @throws TencentCloudSDKException
     */
    public AsymmetricRsaDecryptResponse AsymmetricRsaDecrypt(AsymmetricRsaDecryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AsymmetricRsaDecrypt", AsymmetricRsaDecryptResponse.class);
    }

    /**
     *使用指定的SM2非对称密钥的私钥进行数据解密，密文必须是使用对应公钥加密的。处于Enabled 状态的非对称密钥才能进行解密操作。传入的密文的长度不能超过256字节。
     * @param req AsymmetricSm2DecryptRequest
     * @return AsymmetricSm2DecryptResponse
     * @throws TencentCloudSDKException
     */
    public AsymmetricSm2DecryptResponse AsymmetricSm2Decrypt(AsymmetricSm2DecryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AsymmetricSm2Decrypt", AsymmetricSm2DecryptResponse.class);
    }

    /**
     *记录当前key被哪个云产品的那个资源所使用。如果当前key设置了自动过期，则取消该设置，确保当前key不会自动失效。如果当前关联关系已经创建，也返回成功。
     * @param req BindCloudResourceRequest
     * @return BindCloudResourceResponse
     * @throws TencentCloudSDKException
     */
    public BindCloudResourceResponse BindCloudResource(BindCloudResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindCloudResource", BindCloudResourceResponse.class);
    }

    /**
     *取消计划删除数据密钥
     * @param req CancelDataKeyDeletionRequest
     * @return CancelDataKeyDeletionResponse
     * @throws TencentCloudSDKException
     */
    public CancelDataKeyDeletionResponse CancelDataKeyDeletion(CancelDataKeyDeletionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelDataKeyDeletion", CancelDataKeyDeletionResponse.class);
    }

    /**
     *取消密钥归档，取消后密钥的状态变为Enabled。
     * @param req CancelKeyArchiveRequest
     * @return CancelKeyArchiveResponse
     * @throws TencentCloudSDKException
     */
    public CancelKeyArchiveResponse CancelKeyArchive(CancelKeyArchiveRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelKeyArchive", CancelKeyArchiveResponse.class);
    }

    /**
     *取消CMK的计划删除操作
     * @param req CancelKeyDeletionRequest
     * @return CancelKeyDeletionResponse
     * @throws TencentCloudSDKException
     */
    public CancelKeyDeletionResponse CancelKeyDeletion(CancelKeyDeletionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelKeyDeletion", CancelKeyDeletionResponse.class);
    }

    /**
     *创建用户管理数据密钥的主密钥CMK（Custom Master Key）。
     * @param req CreateKeyRequest
     * @return CreateKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateKeyResponse CreateKey(CreateKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKey", CreateKeyResponse.class);
    }

    /**
     *创建白盒密钥。 密钥个数的上限为 50。
     * @param req CreateWhiteBoxKeyRequest
     * @return CreateWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateWhiteBoxKeyResponse CreateWhiteBoxKey(CreateWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWhiteBoxKey", CreateWhiteBoxKeyResponse.class);
    }

    /**
     *本接口用于解密密文，得到明文数据。
     * @param req DecryptRequest
     * @return DecryptResponse
     * @throws TencentCloudSDKException
     */
    public DecryptResponse Decrypt(DecryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Decrypt", DecryptResponse.class);
    }

    /**
     *用于删除导入的密钥材料，仅对EXTERNAL类型的CMK有效，该接口将CMK设置为PendingImport 状态，并不会删除CMK，在重新进行密钥导入后可继续使用。彻底删除CMK请使用 ScheduleKeyDeletion 接口。
     * @param req DeleteImportedKeyMaterialRequest
     * @return DeleteImportedKeyMaterialResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImportedKeyMaterialResponse DeleteImportedKeyMaterial(DeleteImportedKeyMaterialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImportedKeyMaterial", DeleteImportedKeyMaterialResponse.class);
    }

    /**
     *删除白盒密钥, 注意：必须先禁用后，才可以删除。
     * @param req DeleteWhiteBoxKeyRequest
     * @return DeleteWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWhiteBoxKeyResponse DeleteWhiteBoxKey(DeleteWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWhiteBoxKey", DeleteWhiteBoxKeyResponse.class);
    }

    /**
     *获取数据密钥的详情
     * @param req DescribeDataKeyRequest
     * @return DescribeDataKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataKeyResponse DescribeDataKey(DescribeDataKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataKey", DescribeDataKeyResponse.class);
    }

    /**
     *返回数据密钥属性信息列表
     * @param req DescribeDataKeysRequest
     * @return DescribeDataKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataKeysResponse DescribeDataKeys(DescribeDataKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataKeys", DescribeDataKeysResponse.class);
    }

    /**
     *用于获取指定KeyId的主密钥属性详情信息。
     * @param req DescribeKeyRequest
     * @return DescribeKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeyResponse DescribeKey(DescribeKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKey", DescribeKeyResponse.class);
    }

    /**
     *该接口用于批量获取主密钥属性信息。
     * @param req DescribeKeysRequest
     * @return DescribeKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeysResponse DescribeKeys(DescribeKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKeys", DescribeKeysResponse.class);
    }

    /**
     *获取白盒解密密钥
     * @param req DescribeWhiteBoxDecryptKeyRequest
     * @return DescribeWhiteBoxDecryptKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxDecryptKeyResponse DescribeWhiteBoxDecryptKey(DescribeWhiteBoxDecryptKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteBoxDecryptKey", DescribeWhiteBoxDecryptKeyResponse.class);
    }

    /**
     *获取指定密钥的设备指纹列表
     * @param req DescribeWhiteBoxDeviceFingerprintsRequest
     * @return DescribeWhiteBoxDeviceFingerprintsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxDeviceFingerprintsResponse DescribeWhiteBoxDeviceFingerprints(DescribeWhiteBoxDeviceFingerprintsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteBoxDeviceFingerprints", DescribeWhiteBoxDeviceFingerprintsResponse.class);
    }

    /**
     *展示白盒密钥的信息
     * @param req DescribeWhiteBoxKeyRequest
     * @return DescribeWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxKeyResponse DescribeWhiteBoxKey(DescribeWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteBoxKey", DescribeWhiteBoxKeyResponse.class);
    }

    /**
     *获取白盒密钥列表
     * @param req DescribeWhiteBoxKeyDetailsRequest
     * @return DescribeWhiteBoxKeyDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxKeyDetailsResponse DescribeWhiteBoxKeyDetails(DescribeWhiteBoxKeyDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteBoxKeyDetails", DescribeWhiteBoxKeyDetailsResponse.class);
    }

    /**
     *获取白盒密钥服务状态
     * @param req DescribeWhiteBoxServiceStatusRequest
     * @return DescribeWhiteBoxServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhiteBoxServiceStatusResponse DescribeWhiteBoxServiceStatus(DescribeWhiteBoxServiceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhiteBoxServiceStatus", DescribeWhiteBoxServiceStatusResponse.class);
    }

    /**
     *禁用数据密钥
     * @param req DisableDataKeyRequest
     * @return DisableDataKeyResponse
     * @throws TencentCloudSDKException
     */
    public DisableDataKeyResponse DisableDataKey(DisableDataKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableDataKey", DisableDataKeyResponse.class);
    }

    /**
     *批量禁用数据密钥
     * @param req DisableDataKeysRequest
     * @return DisableDataKeysResponse
     * @throws TencentCloudSDKException
     */
    public DisableDataKeysResponse DisableDataKeys(DisableDataKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableDataKeys", DisableDataKeysResponse.class);
    }

    /**
     *本接口用于禁用一个主密钥，处于禁用状态的Key无法用于加密、解密操作。
     * @param req DisableKeyRequest
     * @return DisableKeyResponse
     * @throws TencentCloudSDKException
     */
    public DisableKeyResponse DisableKey(DisableKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableKey", DisableKeyResponse.class);
    }

    /**
     *对指定的CMK禁止密钥轮换功能。
     * @param req DisableKeyRotationRequest
     * @return DisableKeyRotationResponse
     * @throws TencentCloudSDKException
     */
    public DisableKeyRotationResponse DisableKeyRotation(DisableKeyRotationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableKeyRotation", DisableKeyRotationResponse.class);
    }

    /**
     *该接口用于批量禁止CMK的使用。
     * @param req DisableKeysRequest
     * @return DisableKeysResponse
     * @throws TencentCloudSDKException
     */
    public DisableKeysResponse DisableKeys(DisableKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableKeys", DisableKeysResponse.class);
    }

    /**
     *禁用白盒密钥
     * @param req DisableWhiteBoxKeyRequest
     * @return DisableWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public DisableWhiteBoxKeyResponse DisableWhiteBoxKey(DisableWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableWhiteBoxKey", DisableWhiteBoxKeyResponse.class);
    }

    /**
     *批量禁用白盒密钥
     * @param req DisableWhiteBoxKeysRequest
     * @return DisableWhiteBoxKeysResponse
     * @throws TencentCloudSDKException
     */
    public DisableWhiteBoxKeysResponse DisableWhiteBoxKeys(DisableWhiteBoxKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableWhiteBoxKeys", DisableWhiteBoxKeysResponse.class);
    }

    /**
     *启用数据密钥
     * @param req EnableDataKeyRequest
     * @return EnableDataKeyResponse
     * @throws TencentCloudSDKException
     */
    public EnableDataKeyResponse EnableDataKey(EnableDataKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableDataKey", EnableDataKeyResponse.class);
    }

    /**
     *批量启用数据密钥
     * @param req EnableDataKeysRequest
     * @return EnableDataKeysResponse
     * @throws TencentCloudSDKException
     */
    public EnableDataKeysResponse EnableDataKeys(EnableDataKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableDataKeys", EnableDataKeysResponse.class);
    }

    /**
     *用于启用一个指定的CMK。
     * @param req EnableKeyRequest
     * @return EnableKeyResponse
     * @throws TencentCloudSDKException
     */
    public EnableKeyResponse EnableKey(EnableKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableKey", EnableKeyResponse.class);
    }

    /**
     *对指定的CMK开启密钥轮换功能。
     * @param req EnableKeyRotationRequest
     * @return EnableKeyRotationResponse
     * @throws TencentCloudSDKException
     */
    public EnableKeyRotationResponse EnableKeyRotation(EnableKeyRotationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableKeyRotation", EnableKeyRotationResponse.class);
    }

    /**
     *该接口用于批量启用CMK。
     * @param req EnableKeysRequest
     * @return EnableKeysResponse
     * @throws TencentCloudSDKException
     */
    public EnableKeysResponse EnableKeys(EnableKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableKeys", EnableKeysResponse.class);
    }

    /**
     *启用白盒密钥
     * @param req EnableWhiteBoxKeyRequest
     * @return EnableWhiteBoxKeyResponse
     * @throws TencentCloudSDKException
     */
    public EnableWhiteBoxKeyResponse EnableWhiteBoxKey(EnableWhiteBoxKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableWhiteBoxKey", EnableWhiteBoxKeyResponse.class);
    }

    /**
     *批量启用白盒密钥
     * @param req EnableWhiteBoxKeysRequest
     * @return EnableWhiteBoxKeysResponse
     * @throws TencentCloudSDKException
     */
    public EnableWhiteBoxKeysResponse EnableWhiteBoxKeys(EnableWhiteBoxKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableWhiteBoxKeys", EnableWhiteBoxKeysResponse.class);
    }

    /**
     *本接口用于加密最多为4KB任意数据，可用于加密数据库密码，RSA Key，或其它较小的敏感信息。对于应用的数据加密，使用GenerateDataKey生成的DataKey进行本地数据的加解密操作
     * @param req EncryptRequest
     * @return EncryptResponse
     * @throws TencentCloudSDKException
     */
    public EncryptResponse Encrypt(EncryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Encrypt", EncryptResponse.class);
    }

    /**
     *使用白盒密钥进行加密
     * @param req EncryptByWhiteBoxRequest
     * @return EncryptByWhiteBoxResponse
     * @throws TencentCloudSDKException
     */
    public EncryptByWhiteBoxResponse EncryptByWhiteBox(EncryptByWhiteBoxRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EncryptByWhiteBox", EncryptByWhiteBoxResponse.class);
    }

    /**
     *本接口生成一个数据密钥，您可以用这个密钥进行本地数据的加密。
     * @param req GenerateDataKeyRequest
     * @return GenerateDataKeyResponse
     * @throws TencentCloudSDKException
     */
    public GenerateDataKeyResponse GenerateDataKey(GenerateDataKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateDataKey", GenerateDataKeyResponse.class);
    }

    /**
     *随机数生成接口。
     * @param req GenerateRandomRequest
     * @return GenerateRandomResponse
     * @throws TencentCloudSDKException
     */
    public GenerateRandomResponse GenerateRandom(GenerateRandomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateRandom", GenerateRandomResponse.class);
    }

    /**
     *下载数据密钥密文
     * @param req GetDataKeyCiphertextBlobRequest
     * @return GetDataKeyCiphertextBlobResponse
     * @throws TencentCloudSDKException
     */
    public GetDataKeyCiphertextBlobResponse GetDataKeyCiphertextBlob(GetDataKeyCiphertextBlobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDataKeyCiphertextBlob", GetDataKeyCiphertextBlobResponse.class);
    }

    /**
     *获取数据密钥明文
     * @param req GetDataKeyPlaintextRequest
     * @return GetDataKeyPlaintextResponse
     * @throws TencentCloudSDKException
     */
    public GetDataKeyPlaintextResponse GetDataKeyPlaintext(GetDataKeyPlaintextRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDataKeyPlaintext", GetDataKeyPlaintextResponse.class);
    }

    /**
     *查询指定的CMK是否开启了密钥轮换功能。
     * @param req GetKeyRotationStatusRequest
     * @return GetKeyRotationStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetKeyRotationStatusResponse GetKeyRotationStatus(GetKeyRotationStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetKeyRotationStatus", GetKeyRotationStatusResponse.class);
    }

    /**
     *获取导入主密钥（CMK）材料的参数，返回的Token作为执行ImportKeyMaterial的参数之一，返回的PublicKey用于对自主导入密钥材料进行加密。返回的Token和PublicKey 24小时后失效，失效后如需重新导入，需要再次调用该接口获取新的Token和PublicKey。
     * @param req GetParametersForImportRequest
     * @return GetParametersForImportResponse
     * @throws TencentCloudSDKException
     */
    public GetParametersForImportResponse GetParametersForImport(GetParametersForImportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetParametersForImport", GetParametersForImportResponse.class);
    }

    /**
     *该接口用于获取非对称密钥的公钥信息，可用于本地数据加密或验签。只有处于Enabled状态的非对称密钥才可能获取公钥。
     * @param req GetPublicKeyRequest
     * @return GetPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetPublicKeyResponse GetPublicKey(GetPublicKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPublicKey", GetPublicKeyResponse.class);
    }

    /**
     *获取可以提供KMS服务的地域列表
     * @param req GetRegionsRequest
     * @return GetRegionsResponse
     * @throws TencentCloudSDKException
     */
    public GetRegionsResponse GetRegions(GetRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRegions", GetRegionsResponse.class);
    }

    /**
     *用于查询该用户是否已开通KMS服务
     * @param req GetServiceStatusRequest
     * @return GetServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetServiceStatusResponse GetServiceStatus(GetServiceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetServiceStatus", GetServiceStatusResponse.class);
    }

    /**
     *数据密钥导入接口，并托管到KMS
     * @param req ImportDataKeyRequest
     * @return ImportDataKeyResponse
     * @throws TencentCloudSDKException
     */
    public ImportDataKeyResponse ImportDataKey(ImportDataKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportDataKey", ImportDataKeyResponse.class);
    }

    /**
     *用于导入密钥材料。只有类型为EXTERNAL 的CMK 才可以导入，导入的密钥材料使用 GetParametersForImport 获取的密钥进行加密。可以为指定的 CMK 重新导入密钥材料，并重新指定过期时间，但必须导入相同的密钥材料。CMK 密钥材料导入后不可以更换密钥材料。导入的密钥材料过期或者被删除后，指定的CMK将无法使用，需要再次导入相同的密钥材料才能正常使用。CMK是独立的，同样的密钥材料可导入不同的 CMK 中，但使用其中一个 CMK 加密的数据无法使用另一个 CMK解密。
只有Enabled 和 PendingImport状态的CMK可以导入密钥材料。
     * @param req ImportKeyMaterialRequest
     * @return ImportKeyMaterialResponse
     * @throws TencentCloudSDKException
     */
    public ImportKeyMaterialResponse ImportKeyMaterial(ImportKeyMaterialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportKeyMaterial", ImportKeyMaterialResponse.class);
    }

    /**
     *列出当前Region支持的加密方式
     * @param req ListAlgorithmsRequest
     * @return ListAlgorithmsResponse
     * @throws TencentCloudSDKException
     */
    public ListAlgorithmsResponse ListAlgorithms(ListAlgorithmsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAlgorithms", ListAlgorithmsResponse.class);
    }

    /**
     *根据指定Offset和Limit获取数据密钥列表详情。
     * @param req ListDataKeyDetailRequest
     * @return ListDataKeyDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListDataKeyDetailResponse ListDataKeyDetail(ListDataKeyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDataKeyDetail", ListDataKeyDetailResponse.class);
    }

    /**
     *用于查询数据密钥的列表
     * @param req ListDataKeysRequest
     * @return ListDataKeysResponse
     * @throws TencentCloudSDKException
     */
    public ListDataKeysResponse ListDataKeys(ListDataKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDataKeys", ListDataKeysResponse.class);
    }

    /**
     *根据指定Offset和Limit获取主密钥列表详情。
     * @param req ListKeyDetailRequest
     * @return ListKeyDetailResponse
     * @throws TencentCloudSDKException
     */
    public ListKeyDetailResponse ListKeyDetail(ListKeyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListKeyDetail", ListKeyDetailResponse.class);
    }

    /**
     *列出账号下面状态为Enabled， Disabled 和 PendingImport 的CMK KeyId 列表
     * @param req ListKeysRequest
     * @return ListKeysResponse
     * @throws TencentCloudSDKException
     */
    public ListKeysResponse ListKeys(ListKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListKeys", ListKeysResponse.class);
    }

    /**
     *覆盖指定密钥的设备指纹信息
     * @param req OverwriteWhiteBoxDeviceFingerprintsRequest
     * @return OverwriteWhiteBoxDeviceFingerprintsResponse
     * @throws TencentCloudSDKException
     */
    public OverwriteWhiteBoxDeviceFingerprintsResponse OverwriteWhiteBoxDeviceFingerprints(OverwriteWhiteBoxDeviceFingerprintsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OverwriteWhiteBoxDeviceFingerprints", OverwriteWhiteBoxDeviceFingerprintsResponse.class);
    }

    /**
     *本接口使用后量子密码算法密钥，解密密文，并得到明文数据。
     * @param req PostQuantumCryptoDecryptRequest
     * @return PostQuantumCryptoDecryptResponse
     * @throws TencentCloudSDKException
     */
    public PostQuantumCryptoDecryptResponse PostQuantumCryptoDecrypt(PostQuantumCryptoDecryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PostQuantumCryptoDecrypt", PostQuantumCryptoDecryptResponse.class);
    }

    /**
     *本接口使用后量子密码算法密钥，可加密最多为4KB任意数据，可用于加密数据库密码，RSA Key，或其它较小的敏感信息。对于应用的数据加密，使用GenerateDataKey生成的DataKey进行本地数据的加解密操作。
     * @param req PostQuantumCryptoEncryptRequest
     * @return PostQuantumCryptoEncryptResponse
     * @throws TencentCloudSDKException
     */
    public PostQuantumCryptoEncryptResponse PostQuantumCryptoEncrypt(PostQuantumCryptoEncryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PostQuantumCryptoEncrypt", PostQuantumCryptoEncryptResponse.class);
    }

    /**
     *使用后量子密码算法签名验签密钥进行签名。
     * @param req PostQuantumCryptoSignRequest
     * @return PostQuantumCryptoSignResponse
     * @throws TencentCloudSDKException
     */
    public PostQuantumCryptoSignResponse PostQuantumCryptoSign(PostQuantumCryptoSignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PostQuantumCryptoSign", PostQuantumCryptoSignResponse.class);
    }

    /**
     *使用后量子密码算法密钥对签名进行验证。
     * @param req PostQuantumCryptoVerifyRequest
     * @return PostQuantumCryptoVerifyResponse
     * @throws TencentCloudSDKException
     */
    public PostQuantumCryptoVerifyResponse PostQuantumCryptoVerify(PostQuantumCryptoVerifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PostQuantumCryptoVerify", PostQuantumCryptoVerifyResponse.class);
    }

    /**
     *使用指定CMK对密文重新加密。
     * @param req ReEncryptRequest
     * @return ReEncryptResponse
     * @throws TencentCloudSDKException
     */
    public ReEncryptResponse ReEncrypt(ReEncryptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReEncrypt", ReEncryptResponse.class);
    }

    /**
     *计划删除数据密钥
     * @param req ScheduleDataKeyDeletionRequest
     * @return ScheduleDataKeyDeletionResponse
     * @throws TencentCloudSDKException
     */
    public ScheduleDataKeyDeletionResponse ScheduleDataKeyDeletion(ScheduleDataKeyDeletionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScheduleDataKeyDeletion", ScheduleDataKeyDeletionResponse.class);
    }

    /**
     *CMK计划删除接口，用于指定CMK删除的时间，可选时间区间为[7,30]天
     * @param req ScheduleKeyDeletionRequest
     * @return ScheduleKeyDeletionResponse
     * @throws TencentCloudSDKException
     */
    public ScheduleKeyDeletionResponse ScheduleKeyDeletion(ScheduleKeyDeletionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScheduleKeyDeletion", ScheduleKeyDeletionResponse.class);
    }

    /**
     *非对称密钥签名。
注意：只有 KeyUsage 为 ASYMMETRIC_SIGN_VERIFY_SM2、ASYMMETRIC_SIGN_VERIFY_ECC 或其他支持的 ASYMMETRIC_SIGN_VERIFY_${ALGORITHM} 的密钥才可以使用签名功能。
     * @param req SignByAsymmetricKeyRequest
     * @return SignByAsymmetricKeyResponse
     * @throws TencentCloudSDKException
     */
    public SignByAsymmetricKeyResponse SignByAsymmetricKey(SignByAsymmetricKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SignByAsymmetricKey", SignByAsymmetricKeyResponse.class);
    }

    /**
     *删除指定（key, 资源，云产品）的记录，以表明：指定的云产品的资源已不再使用当前的key。
     * @param req UnbindCloudResourceRequest
     * @return UnbindCloudResourceResponse
     * @throws TencentCloudSDKException
     */
    public UnbindCloudResourceResponse UnbindCloudResource(UnbindCloudResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindCloudResource", UnbindCloudResourceResponse.class);
    }

    /**
     *用于修改CMK的别名。对于处于PendingDelete状态的CMK禁止修改。
     * @param req UpdateAliasRequest
     * @return UpdateAliasResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAliasResponse UpdateAlias(UpdateAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlias", UpdateAliasResponse.class);
    }

    /**
     *修改数据密钥描述
     * @param req UpdateDataKeyDescriptionRequest
     * @return UpdateDataKeyDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDataKeyDescriptionResponse UpdateDataKeyDescription(UpdateDataKeyDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDataKeyDescription", UpdateDataKeyDescriptionResponse.class);
    }

    /**
     *修改数据密钥名称
     * @param req UpdateDataKeyNameRequest
     * @return UpdateDataKeyNameResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDataKeyNameResponse UpdateDataKeyName(UpdateDataKeyNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDataKeyName", UpdateDataKeyNameResponse.class);
    }

    /**
     *该接口用于对指定的cmk修改描述信息。对于处于PendingDelete状态的CMK禁止修改。
     * @param req UpdateKeyDescriptionRequest
     * @return UpdateKeyDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateKeyDescriptionResponse UpdateKeyDescription(UpdateKeyDescriptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateKeyDescription", UpdateKeyDescriptionResponse.class);
    }

    /**
     *使用非对称密钥验签
     * @param req VerifyByAsymmetricKeyRequest
     * @return VerifyByAsymmetricKeyResponse
     * @throws TencentCloudSDKException
     */
    public VerifyByAsymmetricKeyResponse VerifyByAsymmetricKey(VerifyByAsymmetricKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyByAsymmetricKey", VerifyByAsymmetricKeyResponse.class);
    }

}
