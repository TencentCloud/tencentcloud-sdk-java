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
package com.tencentcloudapi.ic.v20190307;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ic.v20190307.models.*;

public class IcClient extends AbstractClient{
    private static String endpoint = "ic.tencentcloudapi.com";
    private static String service = "ic";
    private static String version = "2019-03-07";

    public IcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IcClient(Credential credential, String region, ClientProfile profile) {
        super(IcClient.endpoint, IcClient.version, credential, region, profile);
    }

    /**
     *根据应用id查询物联卡应用详情
     * @param req DescribeAppRequest
     * @return DescribeAppResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppResponse DescribeApp(DescribeAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApp", DescribeAppResponse.class);
    }

    /**
     *查询卡片详细信息
     * @param req DescribeCardRequest
     * @return DescribeCardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCardResponse DescribeCard(DescribeCardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCard", DescribeCardResponse.class);
    }

    /**
     *查询卡片列表信息
     * @param req DescribeCardsRequest
     * @return DescribeCardsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCardsResponse DescribeCards(DescribeCardsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCards", DescribeCardsResponse.class);
    }

    /**
     *查询短信列表
     * @param req DescribeSmsRequest
     * @return DescribeSmsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmsResponse DescribeSms(DescribeSmsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSms", DescribeSmsResponse.class);
    }

    /**
     *编辑卡片备注
     * @param req ModifyUserCardRemarkRequest
     * @return ModifyUserCardRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserCardRemarkResponse ModifyUserCardRemark(ModifyUserCardRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserCardRemark", ModifyUserCardRemarkResponse.class);
    }

    /**
     *购买套外流量包
     * @param req PayForExtendDataRequest
     * @return PayForExtendDataResponse
     * @throws TencentCloudSDKException
     */
    public PayForExtendDataResponse PayForExtendData(PayForExtendDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PayForExtendData", PayForExtendDataResponse.class);
    }

    /**
     *批量为卡片续费，此接口建议调用至少间隔10s,如果出现返回deal lock failed相关的错误，请过10s再重试。
续费的必要条件：
1、单次续费的卡片不可以超过 100张。
2、接口只支持在控制台购买的卡片进行续费
3、销户和未激活的卡片不支持续费。
4、每张物联网卡，续费总周期不能超过24个月
     * @param req RenewCardsRequest
     * @return RenewCardsResponse
     * @throws TencentCloudSDKException
     */
    public RenewCardsResponse RenewCards(RenewCardsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewCards", RenewCardsResponse.class);
    }

    /**
     *群发短信
     * @param req SendMultiSmsRequest
     * @return SendMultiSmsResponse
     * @throws TencentCloudSDKException
     */
    public SendMultiSmsResponse SendMultiSms(SendMultiSmsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendMultiSms", SendMultiSmsResponse.class);
    }

    /**
     *发送短信息接口
     * @param req SendSmsRequest
     * @return SendSmsResponse
     * @throws TencentCloudSDKException
     */
    public SendSmsResponse SendSms(SendSmsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendSms", SendSmsResponse.class);
    }

}
