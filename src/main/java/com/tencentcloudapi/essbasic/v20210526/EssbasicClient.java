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
     *指定需要批量撤销的签署流程Id，批量撤销合同
客户指定需要撤销的签署流程Id，最多100个，超过100不处理；

可以撤回：未全部签署完成
 不可以撤回：已全部签署完成、已拒签、已过期、已撤回、拒绝填写、已解除等合同状态。

**满足撤销条件的合同会发起异步撤销流程，不满足撤销条件的合同返回失败原因。**

**合同撤销成功后，会通过合同状态为 CANCEL 的回调消息通知调用方 [具体可参考回调消息](https://qian.tencent.com/developers/scenes/partner/callback_data_types#-%E5%90%88%E5%90%8C%E7%8A%B6%E6%80%81%E9%80%9A%E7%9F%A5---flowstatuschange)**

**注意:
能撤回合同的只能是合同的发起人或者发起企业的超管、法人**
     * @param req ChannelBatchCancelFlowsRequest
     * @return ChannelBatchCancelFlowsResponse
     * @throws TencentCloudSDKException
     */
    public ChannelBatchCancelFlowsResponse ChannelBatchCancelFlows(ChannelBatchCancelFlowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelBatchCancelFlowsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelBatchCancelFlowsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelBatchCancelFlows");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *撤销签署流程接口，可以撤回：未全部签署完成；不可以撤回（终态）：已全部签署完成、已拒签、已过期、已撤回。
注意:
能撤回合同的只能是合同的发起人或者发起企业的超管、法人
     * @param req ChannelCancelFlowRequest
     * @return ChannelCancelFlowResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCancelFlowResponse ChannelCancelFlow(ChannelCancelFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCancelFlowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCancelFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCancelFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（ChannelCancelMultiFlowSignQRCode）用于取消一码多扫二维码。该接口对传入的二维码ID，若还在有效期内，可以提前失效。
     * @param req ChannelCancelMultiFlowSignQRCodeRequest
     * @return ChannelCancelMultiFlowSignQRCodeResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCancelMultiFlowSignQRCodeResponse ChannelCancelMultiFlowSignQRCode(ChannelCancelMultiFlowSignQRCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCancelMultiFlowSignQRCodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCancelMultiFlowSignQRCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCancelMultiFlowSignQRCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（ChannelCancelUserAutoSignEnableUrl）用来撤销发送给个人用户的自动签开通链接，撤销后对应的个人用户开通链接失效。若个人用户已经完成开通，将无法撤销。（处方单场景专用，使用此接口请与客户经理确认）
     * @param req ChannelCancelUserAutoSignEnableUrlRequest
     * @return ChannelCancelUserAutoSignEnableUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCancelUserAutoSignEnableUrlResponse ChannelCancelUserAutoSignEnableUrl(ChannelCancelUserAutoSignEnableUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCancelUserAutoSignEnableUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCancelUserAutoSignEnableUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCancelUserAutoSignEnableUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *指定需要批量撤销的签署流程Id，获取批量撤销链接 - 不建议使用此接口，可使用ChannelBatchCancelFlows
客户指定需要撤销的签署流程Id，最多100个，超过100不处理；
接口调用成功返回批量撤销合同的链接，通过链接跳转到电子签小程序完成批量撤销;

可以撤回：未全部签署完成
 不可以撤回：已全部签署完成、已拒签、已过期、已撤回、拒绝填写、已解除等合同状态。

注意:
能撤回合同的只能是合同的发起人或者发起企业的超管、法人
     * @param req ChannelCreateBatchCancelFlowUrlRequest
     * @return ChannelCreateBatchCancelFlowUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateBatchCancelFlowUrlResponse ChannelCreateBatchCancelFlowUrl(ChannelCreateBatchCancelFlowUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateBatchCancelFlowUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateBatchCancelFlowUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateBatchCancelFlowUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（ChannelCreateBoundFlows）用于子客领取合同，经办人需要有相应的角色，合同不能重复领取。
     * @param req ChannelCreateBoundFlowsRequest
     * @return ChannelCreateBoundFlowsResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateBoundFlowsResponse ChannelCreateBoundFlows(ChannelCreateBoundFlowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateBoundFlowsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateBoundFlowsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateBoundFlows");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传了word、excel、图片文件后，通过该接口发起文件转换任务，将word、excel、图片文件转换为pdf文件。
     * @param req ChannelCreateConvertTaskApiRequest
     * @return ChannelCreateConvertTaskApiResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateConvertTaskApiResponse ChannelCreateConvertTaskApi(ChannelCreateConvertTaskApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateConvertTaskApiResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateConvertTaskApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateConvertTaskApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ChannelCreateEmbedWebUrl）用于创建常规模块嵌入web的链接
本接口支持创建：创建印章，创建模板，修改模板，预览模板，预览合同流程的web链接
进入web连接后与当前控制台操作保持一致
     * @param req ChannelCreateEmbedWebUrlRequest
     * @return ChannelCreateEmbedWebUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateEmbedWebUrlResponse ChannelCreateEmbedWebUrl(ChannelCreateEmbedWebUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateEmbedWebUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateEmbedWebUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateEmbedWebUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口（ChannelCreateFlowByFiles）用于通过文件创建签署流程。此接口静默签能力不可直接使用，请联系客户经理申请使用
     * @param req ChannelCreateFlowByFilesRequest
     * @return ChannelCreateFlowByFilesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowByFilesResponse ChannelCreateFlowByFiles(ChannelCreateFlowByFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateFlowByFilesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *接口（ChannelCreateFlowGroupByFiles）用于通过多文件创建合同组签署流程。
     * @param req ChannelCreateFlowGroupByFilesRequest
     * @return ChannelCreateFlowGroupByFilesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowGroupByFilesResponse ChannelCreateFlowGroupByFiles(ChannelCreateFlowGroupByFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateFlowGroupByFilesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateFlowGroupByFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateFlowGroupByFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口（ChannelCreateFlowGroupByTemplates）用于通过多模板创建合同组签署流程。
     * @param req ChannelCreateFlowGroupByTemplatesRequest
     * @return ChannelCreateFlowGroupByTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowGroupByTemplatesResponse ChannelCreateFlowGroupByTemplates(ChannelCreateFlowGroupByTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateFlowGroupByTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateFlowGroupByTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateFlowGroupByTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *指定需要批量催办的签署流程Id，批量催办合同，最多100个；接口失败后返回错误信息
注意:
该接口不可直接调用，请联系客户经理申请使用
仅能催办当前状态为“待签署”的签署人，且只能催办一次
     * @param req ChannelCreateFlowRemindsRequest
     * @return ChannelCreateFlowRemindsResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowRemindsResponse ChannelCreateFlowReminds(ChannelCreateFlowRemindsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateFlowRemindsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateFlowRemindsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateFlowReminds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交企业流程审批结果
目前存在两种审核操作，签署审核，发起审核
签署审核：通过接口（CreateFlowsByTemplates或ChannelCreateFlowByFiles或ChannelCreatePrepareFlow）发起签署流程后，若指定了参数 NeedSignReview 为true,则可以调用此接口，指定operate=SignReview，提交企业内部签署审批结果；若签署流程状态正常，且本企业存在签署方未签署，同一签署流程可以多次提交签署审批结果，签署时的最后一个“审批结果”有效

发起审核：通过接口ChannelCreatePrepareFlow指定发起后需要审核，则可以通过调用此接口，指定operate=CreateReview，提交企业内部审批结果，可多次提交，当通过后，后续提交结果无效
     * @param req ChannelCreateFlowSignReviewRequest
     * @return ChannelCreateFlowSignReviewResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowSignReviewResponse ChannelCreateFlowSignReview(ChannelCreateFlowSignReviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateFlowSignReviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateFlowSignReviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateFlowSignReview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建个人签署H5签署链接，请联系客户经理申请使用<br/>
该接口用于发起合同后，生成C端签署人的签署链接<br/>
注意：该接口目前签署人类型仅支持个人签署方（PERSON）<br/>
注意：该接口可生成签署链接的C端签署人必须仅有手写签名和时间类型的签署控件<br/>
注意：该接口返回的签署链接是用于APP集成的场景，支持APP打开或浏览器直接打开，不支持微信小程序嵌入。微信小程序请使用小程序跳转或半屏弹窗的方式<br/>
     * @param req ChannelCreateFlowSignUrlRequest
     * @return ChannelCreateFlowSignUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowSignUrlResponse ChannelCreateFlowSignUrl(ChannelCreateFlowSignUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateFlowSignUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateFlowSignUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateFlowSignUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（ChannelCreateMultiFlowSignQRCode）用于创建一码多扫流程签署二维码。 适用场景：无需填写签署人信息，可通过模板id生成签署二维码，签署人可通过扫描二维码补充签署信息进行实名签署。常用于提前不知道签署人的身份信息场景，例如：劳务工招工、大批量员工入职等场景。

**本接口适用于发起方没有填写控件的 B2C或者单C模板**

**若是B2C模板,还要满足以下任意一个条件**

- 模板中配置的签署顺序是无序
- B端企业的签署方式是静默签署
- B端企业是非首位签署
     * @param req ChannelCreateMultiFlowSignQRCodeRequest
     * @return ChannelCreateMultiFlowSignQRCodeResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateMultiFlowSignQRCodeResponse ChannelCreateMultiFlowSignQRCode(ChannelCreateMultiFlowSignQRCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateMultiFlowSignQRCodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateMultiFlowSignQRCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateMultiFlowSignQRCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成渠道子客编辑企业信息二维码
     * @param req ChannelCreateOrganizationModifyQrCodeRequest
     * @return ChannelCreateOrganizationModifyQrCodeResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateOrganizationModifyQrCodeResponse ChannelCreateOrganizationModifyQrCode(ChannelCreateOrganizationModifyQrCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateOrganizationModifyQrCodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateOrganizationModifyQrCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateOrganizationModifyQrCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建预发起合同
通过此接口指定：合同，签署人，填写控件信息，生成预创建合同链接，点击后跳转到web页面完成合同创建并发起
可指定合同信息不可更改，签署人信息不可更改
合同发起后，填写及签署流程与现有操作流程一致
注意：目前仅支持模板发起
     * @param req ChannelCreatePrepareFlowRequest
     * @return ChannelCreatePrepareFlowResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreatePrepareFlowResponse ChannelCreatePrepareFlow(ChannelCreatePrepareFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreatePrepareFlowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreatePrepareFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreatePrepareFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ChannelCreatePreparedPersonalEsign）用于创建导入个人印章（处方单场景专用，使用此接口请与客户经理确认）。
     * @param req ChannelCreatePreparedPersonalEsignRequest
     * @return ChannelCreatePreparedPersonalEsignResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreatePreparedPersonalEsignResponse ChannelCreatePreparedPersonalEsign(ChannelCreatePreparedPersonalEsignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreatePreparedPersonalEsignResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreatePreparedPersonalEsignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreatePreparedPersonalEsign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发起解除协议，主要应用场景为：基于一份已经签署的合同，进行解除操作。
合同发起人必须在电子签已经进行实名。
     * @param req ChannelCreateReleaseFlowRequest
     * @return ChannelCreateReleaseFlowResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateReleaseFlowResponse ChannelCreateReleaseFlow(ChannelCreateReleaseFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateReleaseFlowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateReleaseFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateReleaseFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将指定印章授权给第三方平台子客企业下的某些员工
     * @param req ChannelCreateSealPolicyRequest
     * @return ChannelCreateSealPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateSealPolicyResponse ChannelCreateSealPolicy(ChannelCreateSealPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateSealPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateSealPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateSealPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业方可以通过此接口获取个人用户开启自动签的跳转链接
     * @param req ChannelCreateUserAutoSignEnableUrlRequest
     * @return ChannelCreateUserAutoSignEnableUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateUserAutoSignEnableUrlResponse ChannelCreateUserAutoSignEnableUrl(ChannelCreateUserAutoSignEnableUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateUserAutoSignEnableUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateUserAutoSignEnableUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateUserAutoSignEnableUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口，绑定员工角色，支持以电子签userId、客户系统userId两种方式调用。
     * @param req ChannelCreateUserRolesRequest
     * @return ChannelCreateUserRolesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateUserRolesResponse ChannelCreateUserRoles(ChannelCreateUserRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateUserRolesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateUserRolesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateUserRoles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成页面主题配置
     * @param req ChannelCreateWebThemeConfigRequest
     * @return ChannelCreateWebThemeConfigResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateWebThemeConfigResponse ChannelCreateWebThemeConfig(ChannelCreateWebThemeConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelCreateWebThemeConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelCreateWebThemeConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelCreateWebThemeConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口，删除员工绑定的角色，支持以电子签userId、客户系统userId两种方式调用。
     * @param req ChannelDeleteRoleUsersRequest
     * @return ChannelDeleteRoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDeleteRoleUsersResponse ChannelDeleteRoleUsers(ChannelDeleteRoleUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelDeleteRoleUsersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelDeleteRoleUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelDeleteRoleUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除指定印章下多个授权信息
     * @param req ChannelDeleteSealPoliciesRequest
     * @return ChannelDeleteSealPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDeleteSealPoliciesResponse ChannelDeleteSealPolicies(ChannelDeleteSealPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelDeleteSealPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelDeleteSealPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelDeleteSealPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询企业员工列表
     * @param req ChannelDescribeEmployeesRequest
     * @return ChannelDescribeEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDescribeEmployeesResponse ChannelDescribeEmployees(ChannelDescribeEmployeesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelDescribeEmployeesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelDescribeEmployeesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelDescribeEmployees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询流程填写控件内容，可以根据流程Id查询该流程相关联的填写控件信息和填写内容。 注意：使用此接口前，需要在【企业应用管理】-【应用集成】-【第三方应用管理】中开通【下载应用内全量合同文件及内容数据】功能。
     * @param req ChannelDescribeFlowComponentsRequest
     * @return ChannelDescribeFlowComponentsResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDescribeFlowComponentsResponse ChannelDescribeFlowComponents(ChannelDescribeFlowComponentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelDescribeFlowComponentsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelDescribeFlowComponentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelDescribeFlowComponents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询子客企业电子印章，需要操作者具有管理印章权限
客户指定需要获取的印章数量和偏移量，数量最多100，超过100按100处理；入参InfoType控制印章是否携带授权人信息，为1则携带，为0则返回的授权人信息为空数组。接口调用成功返回印章的信息列表还有企业印章的总数，只返回启用的印章。
     * @param req ChannelDescribeOrganizationSealsRequest
     * @return ChannelDescribeOrganizationSealsResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDescribeOrganizationSealsResponse ChannelDescribeOrganizationSeals(ChannelDescribeOrganizationSealsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelDescribeOrganizationSealsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelDescribeOrganizationSealsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelDescribeOrganizationSeals");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询角色列表，支持根据类型和状态过滤角色列表
     * @param req ChannelDescribeRolesRequest
     * @return ChannelDescribeRolesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDescribeRolesResponse ChannelDescribeRoles(ChannelDescribeRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelDescribeRolesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelDescribeRolesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelDescribeRoles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业方可以通过此接口查询个人用户自动签开启状态
     * @param req ChannelDescribeUserAutoSignStatusRequest
     * @return ChannelDescribeUserAutoSignStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDescribeUserAutoSignStatusResponse ChannelDescribeUserAutoSignStatus(ChannelDescribeUserAutoSignStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelDescribeUserAutoSignStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelDescribeUserAutoSignStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelDescribeUserAutoSignStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业方可以通过此接口关闭个人的自动签功能
     * @param req ChannelDisableUserAutoSignRequest
     * @return ChannelDisableUserAutoSignResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDisableUserAutoSignResponse ChannelDisableUserAutoSign(ChannelDisableUserAutoSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelDisableUserAutoSignResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelDisableUserAutoSignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelDisableUserAutoSign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询转换任务的状态。转换任务Id通过发起转换任务接口（ChannelCreateConvertTaskApi）获取。
注意：大文件转换所需的时间可能会比较长。
     * @param req ChannelGetTaskResultApiRequest
     * @return ChannelGetTaskResultApiResponse
     * @throws TencentCloudSDKException
     */
    public ChannelGetTaskResultApiResponse ChannelGetTaskResultApi(ChannelGetTaskResultApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelGetTaskResultApiResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelGetTaskResultApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelGetTaskResultApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ChannelUpdateSealStatus）用于第三方应用平台为子客企业更新印章状态
     * @param req ChannelUpdateSealStatusRequest
     * @return ChannelUpdateSealStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChannelUpdateSealStatusResponse ChannelUpdateSealStatus(ChannelUpdateSealStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelUpdateSealStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelUpdateSealStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelUpdateSealStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对流程的合同文件进行数字签名验证，判断文件是否被篡改。
     * @param req ChannelVerifyPdfRequest
     * @return ChannelVerifyPdfResponse
     * @throws TencentCloudSDKException
     */
    public ChannelVerifyPdfResponse ChannelVerifyPdf(ChannelVerifyPdfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChannelVerifyPdfResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChannelVerifyPdfResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChannelVerifyPdf");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建出证报告，返回报告 ID。需要配合出证套餐才能调用。
出证需要一定时间，建议调用创建出证24小时之后再通过DescribeChannelFlowEvidenceReport进行查询。
     * @param req CreateChannelFlowEvidenceReportRequest
     * @return CreateChannelFlowEvidenceReportResponse
     * @throws TencentCloudSDKException
     */
    public CreateChannelFlowEvidenceReportResponse CreateChannelFlowEvidenceReport(CreateChannelFlowEvidenceReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateChannelFlowEvidenceReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateChannelFlowEvidenceReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateChannelFlowEvidenceReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateConsoleLoginUrl）用于创建第三方平台子客企业控制台Web/移动登录链接。登录链接是子客控制台的唯一入口。
若子客企业未激活，会进入企业激活流程，首次参与激活流程的经办人会成为超管。（若企业激活过程中填写信息有误，需要重置激活流程，可以换一个经办人OpenId获取新的链接进入。）
若子客企业已激活，使用了新的经办人OpenId进入，则会进入经办人的实名流程。
若子客企业、经办人均已完成认证，则会直接进入子客Web控制台。
     * @param req CreateConsoleLoginUrlRequest
     * @return CreateConsoleLoginUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsoleLoginUrlResponse CreateConsoleLoginUrl(CreateConsoleLoginUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConsoleLoginUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *接口（CreateFlowsByTemplates）用于使用模板批量创建签署流程。当前可批量发起合同（签署流程）数量为1-20个。
如若在模板中配置了动态表格, 上传的附件必须为A4大小
合同发起人必须在电子签已经进行实名。
     * @param req CreateFlowsByTemplatesRequest
     * @return CreateFlowsByTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowsByTemplatesResponse CreateFlowsByTemplates(CreateFlowsByTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowsByTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *通过图片为子客企业代创建印章，图片最大5MB
     * @param req CreateSealByImageRequest
     * @return CreateSealByImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateSealByImageResponse CreateSealByImage(CreateSealByImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSealByImageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *创建跳转小程序查看或签署的链接。

跳转小程序的几种方式：主要是设置不同的EndPoint
1. 通过链接Url直接跳转到小程序，不需要返回
设置EndPoint为WEIXINAPP，得到链接打开即可。（与短信提醒用户签署形式一样）。

2. 通过链接Url打开H5引导页-->点击跳转到小程序-->签署完退出小程序-->回到H5引导页-->跳转到指定JumpUrl
设置EndPoint为CHANNEL，指定JumpUrl，得到链接打开即可。

3. 客户App直接跳转到小程序-->小程序签署完成-->返回App
跳转到小程序的实现，参考官方文档
https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/launchApp.html
其中小程序的原始Id，请联系<对接技术人员>获取，或者查看小程序信息自助获取。
使用CreateSignUrls，设置EndPoint为APP，得到path。

4. 客户小程序直接跳到电子签小程序-->签署完成退出电子签小程序-->回到客户小程序
跳转到小程序的实现，参考官方文档（分为全屏、半屏两种方式）
全屏方式：
（https://developers.weixin.qq.com/miniprogram/dev/api/navigate/wx.navigateToMiniProgram.html）
半屏方式：
（https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/openEmbeddedMiniProgram.html）
其中小程序的原始Id，请联系<对接技术人员>获取，或者查看小程序信息自助获取。
使用CreateSignUrls，设置EndPoint为APP，得到path。
     * @param req CreateSignUrlsRequest
     * @return CreateSignUrlsResponse
     * @throws TencentCloudSDKException
     */
    public CreateSignUrlsResponse CreateSignUrls(CreateSignUrlsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSignUrlsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *查询出证报告，返回报告 URL。
     * @param req DescribeChannelFlowEvidenceReportRequest
     * @return DescribeChannelFlowEvidenceReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelFlowEvidenceReportResponse DescribeChannelFlowEvidenceReport(DescribeChannelFlowEvidenceReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChannelFlowEvidenceReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChannelFlowEvidenceReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChannelFlowEvidenceReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询企业扩展服务授权信息，企业经办人需要是企业超管或者法人
     * @param req DescribeExtendedServiceAuthInfoRequest
     * @return DescribeExtendedServiceAuthInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtendedServiceAuthInfoResponse DescribeExtendedServiceAuthInfo(DescribeExtendedServiceAuthInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExtendedServiceAuthInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExtendedServiceAuthInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExtendedServiceAuthInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeFlowDetailInfo）用于查询合同(签署流程)的详细信息。
     * @param req DescribeFlowDetailInfoRequest
     * @return DescribeFlowDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowDetailInfoResponse DescribeFlowDetailInfo(DescribeFlowDetailInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowDetailInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *根据签署流程信息批量获取资源下载链接，可以下载签署中、签署完的合同，需合作企业先进行授权。
此接口直接返回下载的资源的url，与接口GetDownloadFlowUrl跳转到控制台的下载方式不同。
     * @param req DescribeResourceUrlsByFlowsRequest
     * @return DescribeResourceUrlsByFlowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceUrlsByFlowsResponse DescribeResourceUrlsByFlows(DescribeResourceUrlsByFlowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceUrlsByFlowsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *通过此接口（DescribeTemplates）查询该第三方平台子客企业在电子签拥有的有效模板，不包括第三方平台模板。

> **适用场景** 
>
>  该接口常用来配合“使用模板创建签署流程”接口作为前置的接口使用。 
>  一个模板通常会包含以下结构信息
>- 模板基本信息
>- 发起方参与信息Promoter、签署参与方 Recipients，后者会在模板发起合同时用于指定参与方
>- 填写控件 Components
>- 签署控件 SignComponents
>- 生成模板的文件基础信息 FileInfos
     * @param req DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplatesResponse DescribeTemplates(DescribeTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *此接口（DescribeUsage）用于获取第三方平台所有合作企业流量消耗情况。
 注: 此接口每日限频50次，若要扩大限制次数,请提前与客服经理或邮件至e-contract@tencent.com进行联系。
     * @param req DescribeUsageRequest
     * @return DescribeUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageResponse DescribeUsage(DescribeUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
返回的链接只能使用一次
     * @param req GetDownloadFlowUrlRequest
     * @return GetDownloadFlowUrlResponse
     * @throws TencentCloudSDKException
     */
    public GetDownloadFlowUrlResponse GetDownloadFlowUrl(GetDownloadFlowUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDownloadFlowUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *修改（操作）企业扩展服务 ，企业经办人需要是企业超管或者法人
     * @param req ModifyExtendedServiceRequest
     * @return ModifyExtendedServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExtendedServiceResponse ModifyExtendedService(ModifyExtendedServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyExtendedServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyExtendedServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyExtendedService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（OperateChannelTemplate）用于针对第三方应用平台模板库中的模板对子客企业可见性的查询和设置。

> **使用场景**
>
>  1：查询 OperateType=SELECT
> - 查询第三方应用平台模板库的可见性以及授权的子客列表。
>
>  2：修改部分子客授权 OperateType=UPDATE
> - 对子客企业进行模板库中模板可见性的进行修改操作。
>- 当模板未发布时，可以修改可见性AuthTag（part/all），当模板发布后，不可做此修改
> - 若模板已发布且可见性AuthTag是part，可以通过ProxyOrganizationOpenIds增加子客的授权范围。如果是自动领取的模板，增加授权范围后会自动下发。
>
>  3：取消部分子客授权 OperateType=DELETE
> - 对子客企业进行模板库中模板可见性的进行删除操作。
> - 主要对于手动领取的模板，去除授权后子客在模板库中看不到，就无法再领取了。但是已经领取过成为自有模板的不会同步删除。
> - 对于自动领取的模板，由于已经下发，更改授权不会影响。
> - 如果要同步删除子客自有模板库中的模板，请使用OperateType=UPDATE+Available参数处理。
     * @param req OperateChannelTemplateRequest
     * @return OperateChannelTemplateResponse
     * @throws TencentCloudSDKException
     */
    public OperateChannelTemplateResponse OperateChannelTemplate(OperateChannelTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OperateChannelTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
用户通过该接口进入签署流程发起的确认页面，进行发起信息二次确认， 如果确认则进行正常发起。
目前该接口只支持B2C，不建议使用，将会废弃。
     * @param req PrepareFlowsRequest
     * @return PrepareFlowsResponse
     * @throws TencentCloudSDKException
     */
    public PrepareFlowsResponse PrepareFlows(PrepareFlowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PrepareFlowsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *此接口（SyncProxyOrganization）用于同步第三方平台子客企业信息，主要是子客企业的营业执照，便于子客企业开通过程中不用手动上传。若有需要调用此接口，需要在创建控制链接CreateConsoleLoginUrl之后即刻进行调用。
     * @param req SyncProxyOrganizationRequest
     * @return SyncProxyOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public SyncProxyOrganizationResponse SyncProxyOrganization(SyncProxyOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncProxyOrganizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *此接口（SyncProxyOrganizationOperators）用于同步 第三方平台子客企业经办人列表，主要是同步经办人的离职状态。子客Web控制台的组织架构管理，是依赖于第三方应用平台的，无法针对员工做新增/更新/离职等操作。 
若经办人信息有误，或者需要修改，也可以先将之前的经办人做离职操作，然后重新使用控制台链接CreateConsoleLoginUrl让经办人重新实名。
     * @param req SyncProxyOrganizationOperatorsRequest
     * @return SyncProxyOrganizationOperatorsResponse
     * @throws TencentCloudSDKException
     */
    public SyncProxyOrganizationOperatorsResponse SyncProxyOrganizationOperators(SyncProxyOrganizationOperatorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncProxyOrganizationOperatorsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
其中上传的文件，图片类型(png/jpg/jpeg)大小限制为5M，其他大小限制为60M。
调用时需要设置Domain, 正式环境为 file.ess.tencent.cn。
代码示例：
HttpProfile httpProfile = new HttpProfile();
httpProfile.setEndpoint("file.test.ess.tencent.cn");
     * @param req UploadFilesRequest
     * @return UploadFilesResponse
     * @throws TencentCloudSDKException
     */
    public UploadFilesResponse UploadFiles(UploadFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadFilesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
