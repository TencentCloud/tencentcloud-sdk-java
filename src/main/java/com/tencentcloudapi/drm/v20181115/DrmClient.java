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
package com.tencentcloudapi.drm.v20181115;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.drm.v20181115.models.*;

public class DrmClient extends AbstractClient{
    private static String endpoint = "drm.tencentcloudapi.com";
    private static String service = "drm";
    private static String version = "2018-11-15";

    public DrmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DrmClient(Credential credential, String region, ClientProfile profile) {
        super(DrmClient.endpoint, DrmClient.version, credential, region, profile);
    }

    /**
     *本接口用来设置fairplay方案所需的私钥、私钥密钥、ask等信息。
如需使用fairplay方案，请务必先设置私钥。
     * @param req AddFairPlayPemRequest
     * @return AddFairPlayPemResponse
     * @throws TencentCloudSDKException
     */
    public AddFairPlayPemResponse AddFairPlayPem(AddFairPlayPemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddFairPlayPem", AddFairPlayPemResponse.class);
    }

    /**
     *该接口用来设置加密的密钥。注意，同一个content id，只能设置一次！
     * @param req CreateEncryptKeysRequest
     * @return CreateEncryptKeysResponse
     * @throws TencentCloudSDKException
     */
    public CreateEncryptKeysResponse CreateEncryptKeys(CreateEncryptKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEncryptKeys", CreateEncryptKeysResponse.class);
    }

    /**
     *本接口用来生成DRM方案对应的播放许可证，开发者需提供DRM方案类型、内容类型参数，后台将生成许可证后返回许可证数据
开发者需要转发终端设备发出的许可证请求信息。
     * @param req CreateLicenseRequest
     * @return CreateLicenseResponse
     * @throws TencentCloudSDKException
     */
    public CreateLicenseResponse CreateLicense(CreateLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLicense", CreateLicenseResponse.class);
    }

    /**
     *本接口用来删除fairplay方案的私钥、ask等信息
注：高风险操作，删除后，您将无法使用腾讯云DRM提供的fairplay服务。
由于缓存，删除操作需要约半小时生效
     * @param req DeleteFairPlayPemRequest
     * @return DeleteFairPlayPemResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFairPlayPemResponse DeleteFairPlayPem(DeleteFairPlayPemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFairPlayPem", DeleteFairPlayPemResponse.class);
    }

    /**
     *本接口用来查询指定DRM类型、ContentType的所有加密密钥

     * @param req DescribeAllKeysRequest
     * @return DescribeAllKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllKeysResponse DescribeAllKeys(DescribeAllKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAllKeys", DescribeAllKeysResponse.class);
    }

    /**
     *开发者需要指定使用的DRM类型取值 NORMALAES、和需要加密的Track类型取值 SD,ContentType取值 LiveVideo
     * @param req DescribeDRMLicenseRequest
     * @return DescribeDRMLicenseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDRMLicenseResponse DescribeDRMLicense(DescribeDRMLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDRMLicense", DescribeDRMLicenseResponse.class);
    }

    /**
     *该接口用来查询设置的FairPlay私钥校验信息。可用该接口校验设置的私钥与本身的私钥是否一致。
     * @param req DescribeFairPlayPemRequest
     * @return DescribeFairPlayPemResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFairPlayPemResponse DescribeFairPlayPem(DescribeFairPlayPemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFairPlayPem", DescribeFairPlayPemResponse.class);
    }

    /**
     *开发者需要指定使用的DRM类型、和需要加密的Track类型，后台返回加密使用的密钥
如果加密使用的ContentID没有关联的密钥信息，后台会自动生成新的密钥返回

     * @param req DescribeKeysRequest
     * @return DescribeKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeysResponse DescribeKeys(DescribeKeysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKeys", DescribeKeysResponse.class);
    }

    /**
     *开发者需要指定使用的DRM类型取值 NORMALAES、和需要加密的Track类型取值 SD,ContentType取值 LiveVideo
     * @param req GenerateTDRMKeyRequest
     * @return GenerateTDRMKeyResponse
     * @throws TencentCloudSDKException
     */
    public GenerateTDRMKeyResponse GenerateTDRMKey(GenerateTDRMKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateTDRMKey", GenerateTDRMKeyResponse.class);
    }

    /**
     *本接口用来设置fairplay方案所需的私钥、私钥密钥、ask等信息。
如需使用fairplay方案，请务必先设置私钥。
     * @param req ModifyFairPlayPemRequest
     * @return ModifyFairPlayPemResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFairPlayPemResponse ModifyFairPlayPem(ModifyFairPlayPemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFairPlayPem", ModifyFairPlayPemResponse.class);
    }

    /**
     *开发者调用该接口，启动一次内容文件的DRM加密工作流。
注意：该接口已下线。
     * @param req StartEncryptionRequest
     * @return StartEncryptionResponse
     * @throws TencentCloudSDKException
     */
    public StartEncryptionResponse StartEncryption(StartEncryptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartEncryption", StartEncryptionResponse.class);
    }

}
