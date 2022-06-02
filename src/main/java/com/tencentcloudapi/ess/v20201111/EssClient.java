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
package com.tencentcloudapi.ess.v20201111;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ess.v20201111.models.*;

public class EssClient extends AbstractClient{
    private static String endpoint = "ess.tencentcloudapi.com";
    private static String service = "ess";
    private static String version = "2020-11-11";

    public EssClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EssClient(Credential credential, String region, ClientProfile profile) {
        super(EssClient.endpoint, EssClient.version, credential, region, profile);
    }

    /**
     *用于撤销流程
     * @param req CancelFlowRequest
     * @return CancelFlowResponse
     * @throws TencentCloudSDKException
     */
    public CancelFlowResponse CancelFlow(CancelFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建电子文档
     * @param req CreateDocumentRequest
     * @return CreateDocumentResponse
     * @throws TencentCloudSDKException
     */
    public CreateDocumentResponse CreateDocument(CreateDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDocumentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建签署流程
     * @param req CreateFlowRequest
     * @return CreateFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowResponse CreateFlow(CreateFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateFlowByFiles）用来通过上传后的pdf资源编号来创建流程。
     * @param req CreateFlowByFilesRequest
     * @return CreateFlowByFilesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowByFilesResponse CreateFlowByFiles(CreateFlowByFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowByFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowByFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowByFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取小程序跳转链接

跳转到小程序的实现，参考官方文档（分为<a href="https://developers.weixin.qq.com/miniprogram/dev/api/navigate/wx.navigateToMiniProgram.html">全屏</a>、<a href="https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/openEmbeddedMiniProgram.html">半屏</a>两种方式）


如您需要自主配置小程序跳转链接，请参考: <a href="https://tcloud-doc.isd.com/document/product/1323/74774">跳转小程序链接配置说明</a>
     * @param req CreateSchemeUrlRequest
     * @return CreateSchemeUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateSchemeUrlResponse CreateSchemeUrl(CreateSchemeUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSchemeUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSchemeUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSchemeUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询文件下载URL
     * @param req DescribeFileUrlsRequest
     * @return DescribeFileUrlsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileUrlsResponse DescribeFileUrls(DescribeFileUrlsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileUrlsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileUrlsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileUrls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询流程摘要
     * @param req DescribeFlowBriefsRequest
     * @return DescribeFlowBriefsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowBriefsResponse DescribeFlowBriefs(DescribeFlowBriefsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowBriefsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowBriefsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowBriefs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *二期接口-查询模板
     * @param req DescribeFlowTemplatesRequest
     * @return DescribeFlowTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowTemplatesResponse DescribeFlowTemplates(DescribeFlowTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过AuthCode查询用户是否实名
     * @param req DescribeThirdPartyAuthCodeRequest
     * @return DescribeThirdPartyAuthCodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeThirdPartyAuthCodeResponse DescribeThirdPartyAuthCode(DescribeThirdPartyAuthCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeThirdPartyAuthCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeThirdPartyAuthCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeThirdPartyAuthCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于发起流程
     * @param req StartFlowRequest
     * @return StartFlowResponse
     * @throws TencentCloudSDKException
     */
    public StartFlowResponse StartFlow(StartFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（UploadFiles）用于文件上传。
调用时需要设置Domain 为 file.ess.tencent.cn，设置Version为2020-12-22
     * @param req UploadFilesRequest
     * @return UploadFilesResponse
     * @throws TencentCloudSDKException
     */
    public UploadFilesResponse UploadFiles(UploadFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
