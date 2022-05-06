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
package com.tencentcloudapi.essbasic.v20210526;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.essbasic.v20210526.models.*;

public class EssbasicClient extends AbstractClient{
    private static String endpoint = "essbasic.tencentcloudapi.com";
    private static String service = "essbasic";
    private static String version = "2021-05-26";

    public EssbasicClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EssbasicClient(Credential credential, String region, ClientProfile profile) {
        super(EssbasicClient.endpoint, EssbasicClient.version, credential, region, profile);
    }

    /**
     *接口（ChannelCreateFlowByFiles）用于渠道版通过文件创建流程。此接口不可直接使用，需要运营申请
     * @param req ChannelCreateFlowByFilesRequest
     * @return ChannelCreateFlowByFilesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowByFilesResponse ChannelCreateFlowByFiles(ChannelCreateFlowByFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateFlowByFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateFlowByFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateFlowByFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateConsoleLoginUrl）用于创建电子签控制台登录链接。若企业未激活，调用同步企业信息、同步经办人信息

     * @param req CreateConsoleLoginUrlRequest
     * @return CreateConsoleLoginUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsoleLoginUrlResponse CreateConsoleLoginUrl(CreateConsoleLoginUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConsoleLoginUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConsoleLoginUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateConsoleLoginUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口（CreateFlowsByTemplates）用于使用多个模板批量创建流程。当前可批量发起合同（流程）数量最大为20个。
     * @param req CreateFlowsByTemplatesRequest
     * @return CreateFlowsByTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowsByTemplatesResponse CreateFlowsByTemplates(CreateFlowsByTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowsByTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowsByTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowsByTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *渠道通过图片为子客代创建印章，图片最大5m；此接口不可直接使用，需要运营申请
     * @param req CreateSealByImageRequest
     * @return CreateSealByImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateSealByImageResponse CreateSealByImage(CreateSealByImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSealByImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSealByImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSealByImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建参与者签署短链
     * @param req CreateSignUrlsRequest
     * @return CreateSignUrlsResponse
     * @throws TencentCloudSDKException
     */
    public CreateSignUrlsResponse CreateSignUrls(CreateSignUrlsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSignUrlsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSignUrlsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSignUrls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeFlowDetailInfo）用于查询合同(流程)的详细信息。
     * @param req DescribeFlowDetailInfoRequest
     * @return DescribeFlowDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowDetailInfoResponse DescribeFlowDetailInfo(DescribeFlowDetailInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowDetailInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowDetailInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowDetailInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据流程信息批量获取资源下载链接，可直接下载
限制：只能下载合作企业授权过的、单方签署的流程文件（若合作企业与渠道是同一企业，可以下载所有流程文件）
     * @param req DescribeResourceUrlsByFlowsRequest
     * @return DescribeResourceUrlsByFlowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceUrlsByFlowsResponse DescribeResourceUrlsByFlows(DescribeResourceUrlsByFlowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceUrlsByFlowsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceUrlsByFlowsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceUrlsByFlows");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口（DescribeTemplates）查询该企业在电子签渠道版中配置的有效模板列表
     * @param req DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplatesResponse DescribeTemplates(DescribeTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeUsage）用于获取渠道所有合作企业流量消耗情况。
 注: 此接口每日限频2次，若要扩大限制次数,请提前与客服经理或邮件至e-contract@tencent.com进行联系。
     * @param req DescribeUsageRequest
     * @return DescribeUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageResponse DescribeUsage(DescribeUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（GetDownloadFlowUrl）用于创建电子签批量下载地址，让合作企业进入控制台直接下载，支持客户合同（流程）按照自定义文件夹形式 分类下载。
当前接口限制最多合同（流程）50个.

     * @param req GetDownloadFlowUrlRequest
     * @return GetDownloadFlowUrlResponse
     * @throws TencentCloudSDKException
     */
    public GetDownloadFlowUrlResponse GetDownloadFlowUrl(GetDownloadFlowUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDownloadFlowUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDownloadFlowUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDownloadFlowUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（OperateChannelTemplate）用于渠道侧将模板库中的模板对合作企业进行查询和设置, 其中包括可见性的修改以及对合作企业的设置.
1、同步标识=select时：
返回渠道侧模板库当前模板的属性.
2、同步标识=update或者delete时：
对渠道子客进行模板库中模板授权,修改操作
     * @param req OperateChannelTemplateRequest
     * @return OperateChannelTemplateResponse
     * @throws TencentCloudSDKException
     */
    public OperateChannelTemplateResponse OperateChannelTemplate(OperateChannelTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OperateChannelTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OperateChannelTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OperateChannelTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口 (PrepareFlows) 用于创建待发起文件
用户通过该接口进入流程发起的确认页面，进行发起信息二次确认， 如果确认则进行正常发起。
目前该接口只支持B2C，不建议使用。
     * @param req PrepareFlowsRequest
     * @return PrepareFlowsResponse
     * @throws TencentCloudSDKException
     */
    public PrepareFlowsResponse PrepareFlows(PrepareFlowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PrepareFlowsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PrepareFlowsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PrepareFlows");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（SyncProxyOrganization）用于同步渠道侧企业信息
     * @param req SyncProxyOrganizationRequest
     * @return SyncProxyOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public SyncProxyOrganizationResponse SyncProxyOrganization(SyncProxyOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncProxyOrganizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SyncProxyOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncProxyOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（SyncProxyOrganizationOperators）用于同步渠道合作企业经办人列表
     * @param req SyncProxyOrganizationOperatorsRequest
     * @return SyncProxyOrganizationOperatorsResponse
     * @throws TencentCloudSDKException
     */
    public SyncProxyOrganizationOperatorsResponse SyncProxyOrganizationOperators(SyncProxyOrganizationOperatorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncProxyOrganizationOperatorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SyncProxyOrganizationOperatorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncProxyOrganizationOperators");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（UploadFiles）用于文件上传。
调用时需要设置Domain 为 file.ess.tencent.cn
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
