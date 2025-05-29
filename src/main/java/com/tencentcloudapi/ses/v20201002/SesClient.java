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
package com.tencentcloudapi.ses.v20201002;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ses.v20201002.models.*;

public class SesClient extends AbstractClient{
    private static String endpoint = "ses.tencentcloudapi.com";
    private static String service = "ses";
    private static String version = "2020-10-02";
    
    public SesClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SesClient(Credential credential, String region, ClientProfile profile) {
        super(SesClient.endpoint, SesClient.version, credential, region, profile);
    }

    /**
     *您可以通过此API批量发送TEXT或者HTML邮件，适用于营销类、通知类邮件。默认仅支持使用模板发送邮件。批量发送之前，需先创建收件人列表，和收件人地址，并通过收件人列表id来进行发送。批量发送任务支持定时发送和周期重复发送，定时发送需传TimedParam，周期重复发送需传CycleParam
     * @param req BatchSendEmailRequest
     * @return BatchSendEmailResponse
     * @throws TencentCloudSDKException
     */
    public BatchSendEmailResponse BatchSendEmail(BatchSendEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchSendEmail", BatchSendEmailResponse.class);
    }

    /**
     *创建地址级退订配置
     * @param req CreateAddressUnsubscribeConfigRequest
     * @return CreateAddressUnsubscribeConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressUnsubscribeConfigResponse CreateAddressUnsubscribeConfig(CreateAddressUnsubscribeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAddressUnsubscribeConfig", CreateAddressUnsubscribeConfigResponse.class);
    }

    /**
     *添加自定义黑名单
     * @param req CreateCustomBlacklistRequest
     * @return CreateCustomBlacklistResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomBlacklistResponse CreateCustomBlacklist(CreateCustomBlacklistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomBlacklist", CreateCustomBlacklistResponse.class);
    }

    /**
     *在验证了发信域名之后，您需要一个发信地址来发送邮件。例如发信域名是mail.qcloud.com，那么发信地址可以为 service@mail.qcloud.com。如果您想要收件人在收件箱列表中显示您的别名，例如"腾讯云邮件通知"。那么发信地址为： 别名 空格 尖括号 邮箱地址。请注意中间需要有空格
     * @param req CreateEmailAddressRequest
     * @return CreateEmailAddressResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmailAddressResponse CreateEmailAddress(CreateEmailAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEmailAddress", CreateEmailAddressResponse.class);
    }

    /**
     *在使用身份发送电子邮件之前，您需要有一个电子邮件域名，该域名可以是您的网站或者移动应用的域名。您首先必须进行验证，证明自己是该域名的所有者，并且授权给腾讯云SES发送许可，才可以从该域名发送电子邮件。
     * @param req CreateEmailIdentityRequest
     * @return CreateEmailIdentityResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmailIdentityResponse CreateEmailIdentity(CreateEmailIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEmailIdentity", CreateEmailIdentityResponse.class);
    }

    /**
     *创建模板，该模板可以是TXT或者HTML，请注意如果HTML不要包含外部文件的CSS。模板中的变量使用 {{变量名}} 表示。
注意：模板需要审核通过才可以使用。
     * @param req CreateEmailTemplateRequest
     * @return CreateEmailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmailTemplateResponse CreateEmailTemplate(CreateEmailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEmailTemplate", CreateEmailTemplateResponse.class);
    }

    /**
     *创建收件人列表，收件人列表是发送批量邮件的目标邮件地址列表。创建列表后，需要上传收件人邮箱地址。之后创建发送任务，关联列表，便可以实现批量发送邮件的功能
     * @param req CreateReceiverRequest
     * @return CreateReceiverResponse
     * @throws TencentCloudSDKException
     */
    public CreateReceiverResponse CreateReceiver(CreateReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReceiver", CreateReceiverResponse.class);
    }

    /**
     *在创建完收件人列表后，向这个收件人列表中批量增加收件人邮箱地址，一次最大支持2万，异步完成处理。数据量比较大的时候，上传可能需要一点时间，可以通过查询收件人列表了解上传状态和上传数量。本接口与接口CreateReceiverDetailWithData的功能特性基本一致，只是不支持上传发信时的模板参数。用户首先调用创建收件人列表接口-CreateReceiver后，然后调用本接口传入收件人地址，最后使用批量发送邮件接口-BatchSendEmail，即可完成批量发信。本接口也支持追加收件人地址，也不支持去重，需要用户自己保证收件人地址不重复。本接口一次请求的收件人地址数量限制为2W条，但收件人列表中收件人地址的总量不能超过一定的数量，目前是限制5万条。
     * @param req CreateReceiverDetailRequest
     * @return CreateReceiverDetailResponse
     * @throws TencentCloudSDKException
     */
    public CreateReceiverDetailResponse CreateReceiverDetail(CreateReceiverDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReceiverDetail", CreateReceiverDetailResponse.class);
    }

    /**
     *添加收件人地址附带模板参数，使用本接口在添加收件人地址的同时传入模板参数，使每一个收件人地址在发信的时候使用的模板变量取值不同。用户首先调用创建收件人列表接口-CreateReceiver后，然后调用本接口传入收件人地址和发信时的模板参数，最后使用批量发送邮件接口-BatchSendEmail，即可完成批量发信。需要注意的是在使用本接口后BatchSendEmail接口中的Template参数不需再传。用户也可以在控制台上邮件发送-收件人列表菜单中，通过导入文件的方式，导入收件人地址和模板变量和参数值。本接口一次请求的收件人地址数量限制为2W条，本接口同时也可以用来向已经上传完成的收件人列表追加收件人地址，但收件人列表中收件人地址的总量不能超过一定的数量，目前是限制5万条。本接口不支持去除重复的收件人地址，用户需要自己保证上传和追加地址不重复，不与之前上传的地址重复。
     * @param req CreateReceiverDetailWithDataRequest
     * @return CreateReceiverDetailWithDataResponse
     * @throws TencentCloudSDKException
     */
    public CreateReceiverDetailWithDataResponse CreateReceiverDetailWithData(CreateReceiverDetailWithDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReceiverDetailWithData", CreateReceiverDetailWithDataResponse.class);
    }

    /**
     *删除地址级退订配置
     * @param req DeleteAddressUnsubscribeConfigRequest
     * @return DeleteAddressUnsubscribeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressUnsubscribeConfigResponse DeleteAddressUnsubscribeConfig(DeleteAddressUnsubscribeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAddressUnsubscribeConfig", DeleteAddressUnsubscribeConfigResponse.class);
    }

    /**
     *邮箱被拉黑之后，用户如果确认收件邮箱有效或者已经处于激活状态，可以从腾讯云地址库中删除该黑名单之后继续投递。
     * @param req DeleteBlackListRequest
     * @return DeleteBlackListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBlackListResponse DeleteBlackList(DeleteBlackListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBlackList", DeleteBlackListResponse.class);
    }

    /**
     *删除自定义黑名单邮箱地址
     * @param req DeleteCustomBlackListRequest
     * @return DeleteCustomBlackListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomBlackListResponse DeleteCustomBlackList(DeleteCustomBlackListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomBlackList", DeleteCustomBlackListResponse.class);
    }

    /**
     *删除发信人地址
     * @param req DeleteEmailAddressRequest
     * @return DeleteEmailAddressResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEmailAddressResponse DeleteEmailAddress(DeleteEmailAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEmailAddress", DeleteEmailAddressResponse.class);
    }

    /**
     *删除发信域名，删除后，将不可再使用该域名进行发信
     * @param req DeleteEmailIdentityRequest
     * @return DeleteEmailIdentityResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEmailIdentityResponse DeleteEmailIdentity(DeleteEmailIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEmailIdentity", DeleteEmailIdentityResponse.class);
    }

    /**
     *删除发信模板
     * @param req DeleteEmailTemplateRequest
     * @return DeleteEmailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEmailTemplateResponse DeleteEmailTemplate(DeleteEmailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEmailTemplate", DeleteEmailTemplateResponse.class);
    }

    /**
     *根据收件id删除收件人列表,同时删除列表中的所有收件邮箱
     * @param req DeleteReceiverRequest
     * @return DeleteReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReceiverResponse DeleteReceiver(DeleteReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReceiver", DeleteReceiverResponse.class);
    }

    /**
     *获取某个发信域名的配置详情
     * @param req GetEmailIdentityRequest
     * @return GetEmailIdentityResponse
     * @throws TencentCloudSDKException
     */
    public GetEmailIdentityResponse GetEmailIdentity(GetEmailIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetEmailIdentity", GetEmailIdentityResponse.class);
    }

    /**
     *根据模板ID获取模板详情
     * @param req GetEmailTemplateRequest
     * @return GetEmailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public GetEmailTemplateResponse GetEmailTemplate(GetEmailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetEmailTemplate", GetEmailTemplateResponse.class);
    }

    /**
     *获取邮件发送状态。仅支持查询30天之内的数据
     * @param req GetSendEmailStatusRequest
     * @return GetSendEmailStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetSendEmailStatusResponse GetSendEmailStatus(GetSendEmailStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSendEmailStatus", GetSendEmailStatusResponse.class);
    }

    /**
     *获取近期发送的统计情况，包含发送量、送达率、打开率、退信率等一系列数据。
     * @param req GetStatisticsReportRequest
     * @return GetStatisticsReportResponse
     * @throws TencentCloudSDKException
     */
    public GetStatisticsReportResponse GetStatisticsReport(GetStatisticsReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetStatisticsReport", GetStatisticsReportResponse.class);
    }

    /**
     *获取地址级退订配置列表
     * @param req ListAddressUnsubscribeConfigRequest
     * @return ListAddressUnsubscribeConfigResponse
     * @throws TencentCloudSDKException
     */
    public ListAddressUnsubscribeConfigResponse ListAddressUnsubscribeConfig(ListAddressUnsubscribeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAddressUnsubscribeConfig", ListAddressUnsubscribeConfigResponse.class);
    }

    /**
     *腾讯云发送的邮件一旦被收件方判断为硬退(Hard Bounce)，腾讯云会拉黑该地址，并不允许所有用户向该地址发送邮件。成为邮箱黑名单。如果业务方确认是误判，可以从黑名单中删除。
     * @param req ListBlackEmailAddressRequest
     * @return ListBlackEmailAddressResponse
     * @throws TencentCloudSDKException
     */
    public ListBlackEmailAddressResponse ListBlackEmailAddress(ListBlackEmailAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListBlackEmailAddress", ListBlackEmailAddressResponse.class);
    }

    /**
     *获取自定义黑名单列表
     * @param req ListCustomBlacklistRequest
     * @return ListCustomBlacklistResponse
     * @throws TencentCloudSDKException
     */
    public ListCustomBlacklistResponse ListCustomBlacklist(ListCustomBlacklistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCustomBlacklist", ListCustomBlacklistResponse.class);
    }

    /**
     *获取发信地址列表
     * @param req ListEmailAddressRequest
     * @return ListEmailAddressResponse
     * @throws TencentCloudSDKException
     */
    public ListEmailAddressResponse ListEmailAddress(ListEmailAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListEmailAddress", ListEmailAddressResponse.class);
    }

    /**
     *获取当前发信域名列表，包含已验证通过与未验证的域名
     * @param req ListEmailIdentitiesRequest
     * @return ListEmailIdentitiesResponse
     * @throws TencentCloudSDKException
     */
    public ListEmailIdentitiesResponse ListEmailIdentities(ListEmailIdentitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListEmailIdentities", ListEmailIdentitiesResponse.class);
    }

    /**
     *获取当前邮件模板列表
     * @param req ListEmailTemplatesRequest
     * @return ListEmailTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ListEmailTemplatesResponse ListEmailTemplates(ListEmailTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListEmailTemplates", ListEmailTemplatesResponse.class);
    }

    /**
     *根据收件人列表id查询收件人列表中的所有收件人邮箱地址，分页查询，可以根据收件邮箱地址来过滤查询
     * @param req ListReceiverDetailsRequest
     * @return ListReceiverDetailsResponse
     * @throws TencentCloudSDKException
     */
    public ListReceiverDetailsResponse ListReceiverDetails(ListReceiverDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListReceiverDetails", ListReceiverDetailsResponse.class);
    }

    /**
     *根据条件查询收件人列表，支持分页，模糊查询，状态查询
     * @param req ListReceiversRequest
     * @return ListReceiversResponse
     * @throws TencentCloudSDKException
     */
    public ListReceiversResponse ListReceivers(ListReceiversRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListReceivers", ListReceiversResponse.class);
    }

    /**
     *分页查询批量发送邮件任务，包含即时发送任务，定时发送任务，周期重复发送任务，查询发送情况，包括请求数量，已发数量，缓存数量，任务状态等信息
     * @param req ListSendTasksRequest
     * @return ListSendTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListSendTasksResponse ListSendTasks(ListSendTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSendTasks", ListSendTasksResponse.class);
    }

    /**
     *您可以通过此API发送HTML或者TEXT邮件，适用于触发类邮件（验证码、交易类）。默认仅支持使用模板发送邮件。
     * @param req SendEmailRequest
     * @return SendEmailResponse
     * @throws TencentCloudSDKException
     */
    public SendEmailResponse SendEmail(SendEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendEmail", SendEmailResponse.class);
    }

    /**
     *用于更新地址级退订配置
     * @param req UpdateAddressUnsubscribeConfigRequest
     * @return UpdateAddressUnsubscribeConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAddressUnsubscribeConfigResponse UpdateAddressUnsubscribeConfig(UpdateAddressUnsubscribeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAddressUnsubscribeConfig", UpdateAddressUnsubscribeConfigResponse.class);
    }

    /**
     *更新自定义黑名单
     * @param req UpdateCustomBlackListRequest
     * @return UpdateCustomBlackListResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCustomBlackListResponse UpdateCustomBlackList(UpdateCustomBlackListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCustomBlackList", UpdateCustomBlackListResponse.class);
    }

    /**
     *您已经成功配置好了您的DNS，接下来请求腾讯云验证您的DNS配置是否正确
     * @param req UpdateEmailIdentityRequest
     * @return UpdateEmailIdentityResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEmailIdentityResponse UpdateEmailIdentity(UpdateEmailIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEmailIdentity", UpdateEmailIdentityResponse.class);
    }

    /**
     *设置邮箱的smtp密码。若要通过smtp发送邮件，必须为邮箱设置smtp密码。初始时，邮箱没有设置smtp密码，不能使用smtp的方式发送邮件。设置smtp密码后，可以修改密码。
     * @param req UpdateEmailSmtpPassWordRequest
     * @return UpdateEmailSmtpPassWordResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEmailSmtpPassWordResponse UpdateEmailSmtpPassWord(UpdateEmailSmtpPassWordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEmailSmtpPassWord", UpdateEmailSmtpPassWordResponse.class);
    }

    /**
     *更新邮件模板，更新后需再次审核
     * @param req UpdateEmailTemplateRequest
     * @return UpdateEmailTemplateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEmailTemplateResponse UpdateEmailTemplate(UpdateEmailTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEmailTemplate", UpdateEmailTemplateResponse.class);
    }

}
