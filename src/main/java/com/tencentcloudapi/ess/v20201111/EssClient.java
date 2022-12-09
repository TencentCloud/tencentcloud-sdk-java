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
     *用于撤销签署流程
适用场景：如果某个合同流程当前至少还有一方没有签署，则可通过该接口取消该合同流程。常用于合同发错、内容填错，需要及时撤销的场景。
注：如果合同流程中的参与方均已签署完毕，则无法通过该接口撤销合同。
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
     *此接口（CancelMultiFlowSignQRCode）用于取消一码多扫二维码。该接口对传入的二维码ID，若还在有效期内，可以提前失效。
     * @param req CancelMultiFlowSignQRCodeRequest
     * @return CancelMultiFlowSignQRCodeResponse
     * @throws TencentCloudSDKException
     */
    public CancelMultiFlowSignQRCodeResponse CancelMultiFlowSignQRCode(CancelMultiFlowSignQRCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelMultiFlowSignQRCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelMultiFlowSignQRCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelMultiFlowSignQRCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *电子签企业版：指定需要批量撤回的签署流程Id，获取批量撤销链接
客户指定需要撤回的签署流程Id，最多100个，超过100不处理；接口调用成功返回批量撤回合同的链接，通过链接跳转到电子签小程序完成批量撤回
     * @param req CreateBatchCancelFlowUrlRequest
     * @return CreateBatchCancelFlowUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateBatchCancelFlowUrlResponse CreateBatchCancelFlowUrl(CreateBatchCancelFlowUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBatchCancelFlowUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBatchCancelFlowUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBatchCancelFlowUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建文件转换任务
     * @param req CreateConvertTaskApiRequest
     * @return CreateConvertTaskApiResponse
     * @throws TencentCloudSDKException
     */
    public CreateConvertTaskApiResponse CreateConvertTaskApi(CreateConvertTaskApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConvertTaskApiResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConvertTaskApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateConvertTaskApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建签署流程电子文档
适用场景：见创建签署流程接口。
注：该接口需要给对应的流程指定一个模板id，并且填充该模板中需要补充的信息。是“发起流程”接口的前置接口。
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
适用场景：在标准制式的合同场景中，可通过提前预制好模板文件，每次调用模板文件的id，补充合同内容信息及签署信息生成电子合同。
注：该接口是通过模板生成合同流程的前置接口，先创建一个不包含签署文件的流程。配合“创建电子文档”接口和“发起流程”接口使用。
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
     *补充签署流程本企业签署人信息
适用场景：在通过模板或者文件发起合同时，若未指定本企业签署人信息，则流程发起后，可以调用此接口补充签署人。
同一签署人可以补充多个员工作为候选签署人,最终签署人取决于谁先领取合同完成签署。

注：目前暂时只支持补充来源于企业微信的员工作为候选签署人
     * @param req CreateFlowApproversRequest
     * @return CreateFlowApproversResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowApproversResponse CreateFlowApprovers(CreateFlowApproversRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowApproversResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowApproversResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowApprovers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateFlowByFiles）用来通过上传后的pdf资源编号来创建待签署的合同流程。
适用场景1：适用非制式的合同文件签署。一般开发者自己有完整的签署文件，可以通过该接口传入完整的PDF文件及流程信息生成待签署的合同流程。
适用场景2：可通过该接口传入制式合同文件，同时在指定位置添加签署控件。可以起到接口创建临时模板的效果。如果是标准的制式文件，建议使用模板功能生成模板ID进行合同流程的生成。
注意事项：该接口需要依赖“多文件上传”接口生成pdf资源编号（FileIds）进行使用。
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
     *创建出证报告，返回报告 ID。
     * @param req CreateFlowEvidenceReportRequest
     * @return CreateFlowEvidenceReportResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowEvidenceReportResponse CreateFlowEvidenceReport(CreateFlowEvidenceReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowEvidenceReportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowEvidenceReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowEvidenceReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交企业签署流程审批结果
适用场景: 
在通过接口(CreateFlow 或者CreateFlowByFiles)创建签署流程时，若指定了参数 NeedSignReview 为true，且发起方企业作为签署方参与了流程签署，则可以调用此接口提交企业内部签署审批结果。
若签署流程状态正常，且本企业存在签署方未签署，同一签署流程可以多次提交签署审批结果，签署时的最后一个“审批结果”有效。

     * @param req CreateFlowSignReviewRequest
     * @return CreateFlowSignReviewResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowSignReviewResponse CreateFlowSignReview(CreateFlowSignReviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowSignReviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowSignReviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowSignReview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建员工
     * @param req CreateIntegrationEmployeesRequest
     * @return CreateIntegrationEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntegrationEmployeesResponse CreateIntegrationEmployees(CreateIntegrationEmployeesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIntegrationEmployeesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIntegrationEmployeesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIntegrationEmployees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateMultiFlowSignQRCode）用于创建一码多扫流程签署二维码。
适用场景：无需填写签署人信息，可通过模板id生成签署二维码，签署人可通过扫描二维码补充签署信息进行实名签署。常用于提前不知道签署人的身份信息场景，例如：劳务工招工、大批量员工入职等场景。
适用的模板仅限于B2C（1、无序签署，2、顺序签署时B静默签署，3、顺序签署时B非首位签署）、单C的模板，且模板中发起方没有填写控件。
     * @param req CreateMultiFlowSignQRCodeRequest
     * @return CreateMultiFlowSignQRCodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultiFlowSignQRCodeResponse CreateMultiFlowSignQRCode(CreateMultiFlowSignQRCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMultiFlowSignQRCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMultiFlowSignQRCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMultiFlowSignQRCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建快速发起流程
适用场景：用户通过API 合同文件及签署信息，并可通过我们返回的URL在页面完成签署控件等信息的编辑与确认，快速发起合同.
注：该接口文件的resourceId 是通过上传文件之后获取的。
     * @param req CreatePrepareFlowRequest
     * @return CreatePrepareFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrepareFlowResponse CreatePrepareFlow(CreatePrepareFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrepareFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrepareFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrepareFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取小程序跳转链接

适用场景：如果需要签署人在自己的APP、小程序、H5应用中签署，可以通过此接口获取跳转腾讯电子签小程序的签署跳转链接。

注：如果签署人是在PC端扫码签署，可以通过生成跳转链接自主转换成二维码，让签署人在PC端扫码签署。


跳转到小程序的实现，参考官方文档（分为<a href="https://developers.weixin.qq.com/miniprogram/dev/api/navigate/wx.navigateToMiniProgram.html">全屏</a>、<a href="https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/openEmbeddedMiniProgram.html">半屏</a>两种方式）


如您需要自主配置小程序跳转链接，请参考: <a href="https://cloud.tencent.com/document/product/1323/74774">跳转小程序链接配置说明</a>
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
     *移除员工
     * @param req DeleteIntegrationEmployeesRequest
     * @return DeleteIntegrationEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntegrationEmployeesResponse DeleteIntegrationEmployees(DeleteIntegrationEmployeesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIntegrationEmployeesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIntegrationEmployeesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIntegrationEmployees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询文件下载URL
适用场景：通过传参合同流程编号，下载对应的合同PDF文件流到本地。
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
适用场景：可用于主动查询某个合同流程的签署状态信息。可以配合回调通知使用。
日调用量默认10W
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
     *查询出证报告，返回报告 URL。
     * @param req DescribeFlowEvidenceReportRequest
     * @return DescribeFlowEvidenceReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowEvidenceReportResponse DescribeFlowEvidenceReport(DescribeFlowEvidenceReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowEvidenceReportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowEvidenceReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowEvidenceReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询合同详情
适用场景：可用于主动查询某个合同详情信息。
     * @param req DescribeFlowInfoRequest
     * @return DescribeFlowInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowInfoResponse DescribeFlowInfo(DescribeFlowInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *当模板较多或模板中的控件较多时，可以通过查询模板接口更方便的获取模板列表，以及每个模板内的控件信息。该接口常用来配合“创建电子文档”接口作为前置的接口使用。
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
     *查询员工信息，每次返回的数据量最大为20
     * @param req DescribeIntegrationEmployeesRequest
     * @return DescribeIntegrationEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationEmployeesResponse DescribeIntegrationEmployees(DescribeIntegrationEmployeesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationEmployeesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationEmployeesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationEmployees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询企业印章的列表，需要操作者具有查询印章权限
客户指定需要获取的印章数量和偏移量，数量最多100，超过100按100处理；入参InfoType控制印章是否携带授权人信息，为1则携带，为0则返回的授权人信息为空数组。接口调用成功返回印章的信息列表还有企业印章的总数。
     * @param req DescribeOrganizationSealsRequest
     * @return DescribeOrganizationSealsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationSealsResponse DescribeOrganizationSeals(DescribeOrganizationSealsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationSealsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationSealsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationSeals");
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
     *查询转换任务状态
     * @param req GetTaskResultApiRequest
     * @return GetTaskResultApiResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskResultApiResponse GetTaskResultApi(GetTaskResultApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTaskResultApiResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetTaskResultApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTaskResultApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于发起流程
适用场景：见创建签署流程接口。
注：该接口是“创建电子文档”接口的后置接口，用于激活包含完整合同信息（模板及内容信息）的流程。激活后的流程就是一份待签署的电子合同。
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
适用场景：用于生成pdf资源编号（FileIds）来配合“用PDF创建流程”接口使用，使用场景可详见“用PDF创建流程”接口说明。
调用时需要设置Domain/接口请求域名为 file.ess.tencent.cn，并设置参数Version/版本号为2020-12-22
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

    /**
     *验证合同文件
     * @param req VerifyPdfRequest
     * @return VerifyPdfResponse
     * @throws TencentCloudSDKException
     */
    public VerifyPdfResponse VerifyPdf(VerifyPdfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyPdfResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyPdfResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyPdf");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
