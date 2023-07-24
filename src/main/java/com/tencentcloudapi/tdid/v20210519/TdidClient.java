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
     *该接口不再使用

检查区块链信息
     * @param req CheckChainRequest
     * @return CheckChainResponse
     * @throws TencentCloudSDKException
     */
    public CheckChainResponse CheckChain(CheckChainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckChainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckChainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckChain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再使用

创建凭证
     * @param req CreateCredentialRequest
     * @return CreateCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateCredentialResponse CreateCredential(CreateCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCredentialResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCredential");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再使用

创建选择性批露凭证
     * @param req CreateSelectiveCredentialRequest
     * @return CreateSelectiveCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateSelectiveCredentialResponse CreateSelectiveCredential(CreateSelectiveCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSelectiveCredentialResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSelectiveCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSelectiveCredential");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再使用

创建机构DID
     * @param req CreateTDidRequest
     * @return CreateTDidResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidResponse CreateTDid(CreateTDidRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTDidResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTDidResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTDid");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再使用

新建DID根据私钥生成Tdid
     * @param req CreateTDidByPrivateKeyRequest
     * @return CreateTDidByPrivateKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidByPrivateKeyResponse CreateTDidByPrivateKey(CreateTDidByPrivateKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTDidByPrivateKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTDidByPrivateKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTDidByPrivateKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再使用

 新建DID根据公钥生成Tdid
     * @param req CreateTDidByPublicKeyRequest
     * @return CreateTDidByPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTDidByPublicKeyResponse CreateTDidByPublicKey(CreateTDidByPublicKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTDidByPublicKeyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTDidByPublicKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTDidByPublicKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再使用

获取权威机构信息
     * @param req GetAuthorityIssuerRequest
     * @return GetAuthorityIssuerResponse
     * @throws TencentCloudSDKException
     */
    public GetAuthorityIssuerResponse GetAuthorityIssuer(GetAuthorityIssuerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAuthorityIssuerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetAuthorityIssuerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAuthorityIssuer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再使用

凭证模版详情
     * @param req GetCptInfoRequest
     * @return GetCptInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetCptInfoResponse GetCptInfo(GetCptInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCptInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetCptInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCptInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再使用

获取凭证链上状态信息
     * @param req GetCredentialStatusRequest
     * @return GetCredentialStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetCredentialStatusResponse GetCredentialStatus(GetCredentialStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCredentialStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetCredentialStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCredentialStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再使用

查看DID文档

     * @param req GetDidDocumentRequest
     * @return GetDidDocumentResponse
     * @throws TencentCloudSDKException
     */
    public GetDidDocumentResponse GetDidDocument(GetDidDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDidDocumentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetDidDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDidDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再使用

凭证模版新建
     * @param req RegisterCptRequest
     * @return RegisterCptResponse
     * @throws TencentCloudSDKException
     */
    public RegisterCptResponse RegisterCpt(RegisterCptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterCptResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterCptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterCpt");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再使用

设置凭证链上状态
     * @param req SetCredentialStatusRequest
     * @return SetCredentialStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetCredentialStatusResponse SetCredentialStatus(SetCredentialStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetCredentialStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetCredentialStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetCredentialStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口不再使用

验证凭证
     * @param req VerifyCredentialRequest
     * @return VerifyCredentialResponse
     * @throws TencentCloudSDKException
     */
    public VerifyCredentialResponse VerifyCredential(VerifyCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyCredentialResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyCredential");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
