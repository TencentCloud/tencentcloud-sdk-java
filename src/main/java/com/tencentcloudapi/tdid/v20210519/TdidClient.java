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
package com.tencentcloudapi.tdid.v20210519;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tdid.v20210519.models.*;

public class TdidClient extends AbstractClient{
    private static String endpoint = "tdid.tencentcloudapi.com";
    private static String service = "tdid";
    private static String version = "2021-05-19";
    
    public TdidClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TdidClient(Credential credential, String region, ClientProfile profile) {
        super(TdidClient.endpoint, TdidClient.version, credential, region, profile);
    }

    /**
     *检查用户套餐购买状态
     * @param req CheckNewPurchaseRequest
     * @return CheckNewPurchaseResponse
     * @throws TencentCloudSDKException
     */
    public CheckNewPurchaseResponse CheckNewPurchase(CheckNewPurchaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckNewPurchase", CheckNewPurchaseResponse.class);
    }

    /**
     *自动生成公私钥对托管在DID平台，并注册DID标识
     * @param req CreateTDidByHostRequest
     * @return CreateTDidByHostResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidByHostResponse CreateTDidByHost(CreateTDidByHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTDidByHost", CreateTDidByHostResponse.class);
    }

    /**
     *使用导入的公钥文件注册DID标识
     * @param req CreateTDidByPubKeyRequest
     * @return CreateTDidByPubKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidByPubKeyResponse CreateTDidByPubKey(CreateTDidByPubKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTDidByPubKey", CreateTDidByPubKeyResponse.class);
    }

    /**
     *更新DID标识的禁用状态
     * @param req DeactivateTDidRequest
     * @return DeactivateTDidResponse
     * @throws TencentCloudSDKException
     */
    public DeactivateTDidResponse DeactivateTDid(DeactivateTDidRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeactivateTDid", DeactivateTDidResponse.class);
    }

    /**
     *获取凭证链上状态信息
     * @param req GetCredentialStateRequest
     * @return GetCredentialStateResponse
     * @throws TencentCloudSDKException
     */
    public GetCredentialStateResponse GetCredentialState(GetCredentialStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCredentialState", GetCredentialStateResponse.class);
    }

    /**
     *获取DID标识的文档
     * @param req GetTDidDocumentRequest
     * @return GetTDidDocumentResponse
     * @throws TencentCloudSDKException
     */
    public GetTDidDocumentResponse GetTDidDocument(GetTDidDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTDidDocument", GetTDidDocumentResponse.class);
    }

    /**
     *颁发可验证凭证
     * @param req IssueCredentialRequest
     * @return IssueCredentialResponse
     * @throws TencentCloudSDKException
     */
    public IssueCredentialResponse IssueCredential(IssueCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IssueCredential", IssueCredentialResponse.class);
    }

    /**
     *更新凭证的链上状态
     * @param req UpdateCredentialStateRequest
     * @return UpdateCredentialStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCredentialStateResponse UpdateCredentialState(UpdateCredentialStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCredentialState", UpdateCredentialStateResponse.class);
    }

    /**
     *验证已签名的可验证凭证
     * @param req VerifyCredentialsRequest
     * @return VerifyCredentialsResponse
     * @throws TencentCloudSDKException
     */
    public VerifyCredentialsResponse VerifyCredentials(VerifyCredentialsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyCredentials", VerifyCredentialsResponse.class);
    }

}
