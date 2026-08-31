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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendRecord extends AbstractModel {

    /**
    * <p>下发的手机号码，依据 E.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613601238015， 其中前面有一个+号 ，86为国家码，13601238015为手机号。</p>
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * <p>发送流水号，与短信发送接口返回的发送流水号一致。</p>
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * <p>发送状态。</p><p>枚举值：</p><ul><li>1： 提交失败</li><li>2： 提交成功，送达成功</li><li>3： 提交成功，发送中</li><li>4： 提交成功，送达失败</li></ul>
    */
    @SerializedName("SendStatus")
    @Expose
    private Long SendStatus;

    /**
    * <p>请求状态码，可参考 <a href="https://cloud.tencent.com/document/api/382/59177#.E7.9F.AD.E4.BF.A1-API-3.0-.E5.8F.91.E9.80.81.E9.94.99.E8.AF.AF.E7.A0.81">短信 API 3.0 发送错误码</a>。</p>
    */
    @SerializedName("RequestCode")
    @Expose
    private String RequestCode;

    /**
    * <p>回执状态码，仅发送状态为 2（提交成功，送达成功）和 4（提交成功，送达失败）时有值，其余状态为空字符串，可参考 <a href="https://cloud.tencent.com/document/product/382/59177#.E5.9B.9E.E6.89.A7.E7.8A.B6.E6.80.81.E9.94.99.E8.AF.AF.E7.A0.81">回执状态错误码</a>。</p>
    */
    @SerializedName("StatusCode")
    @Expose
    private String StatusCode;

    /**
    * <p>国家码或地区码，例如 CN、US 等，对于未识别出国家码或者地区码，默认返回 DEF，具体支持列表请参考 <a href="https://cloud.tencent.com/document/product/382/18051#402a55da-83ac-4e79-a604-b9de0c507756">国际/港澳台短信价格总览</a>。</p>
    */
    @SerializedName("IsoCode")
    @Expose
    private String IsoCode;

    /**
    * <p>短信下发内容，为保证信息安全，短信中的部分入参信息会脱敏存储，对应发送记录查询结果中包含的打码内容，用户实际接收到的短信内容为正常完整内容。有疑问可咨询 <a href="https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81">腾讯云小助手</a> 。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>发送时间，UNIX 时间戳（秒）。</p><p>单位：秒</p>
    */
    @SerializedName("SendTime")
    @Expose
    private Long SendTime;

    /**
    * <p>用户实际收到短信的时间，UNIX 时间戳（秒），仅发送状态为2（提交成功，送达成功）时有值 ，其余状态默认为 0 。</p><p>单位：秒</p>
    */
    @SerializedName("UserReceiveTime")
    @Expose
    private Long UserReceiveTime;

    /**
     * Get <p>下发的手机号码，依据 E.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613601238015， 其中前面有一个+号 ，86为国家码，13601238015为手机号。</p> 
     * @return PhoneNumber <p>下发的手机号码，依据 E.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613601238015， 其中前面有一个+号 ，86为国家码，13601238015为手机号。</p>
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set <p>下发的手机号码，依据 E.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613601238015， 其中前面有一个+号 ，86为国家码，13601238015为手机号。</p>
     * @param PhoneNumber <p>下发的手机号码，依据 E.164 标准为：+[国家（或地区）码][手机号] ，示例如：+8613601238015， 其中前面有一个+号 ，86为国家码，13601238015为手机号。</p>
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get <p>发送流水号，与短信发送接口返回的发送流水号一致。</p> 
     * @return SerialNo <p>发送流水号，与短信发送接口返回的发送流水号一致。</p>
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set <p>发送流水号，与短信发送接口返回的发送流水号一致。</p>
     * @param SerialNo <p>发送流水号，与短信发送接口返回的发送流水号一致。</p>
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get <p>发送状态。</p><p>枚举值：</p><ul><li>1： 提交失败</li><li>2： 提交成功，送达成功</li><li>3： 提交成功，发送中</li><li>4： 提交成功，送达失败</li></ul> 
     * @return SendStatus <p>发送状态。</p><p>枚举值：</p><ul><li>1： 提交失败</li><li>2： 提交成功，送达成功</li><li>3： 提交成功，发送中</li><li>4： 提交成功，送达失败</li></ul>
     */
    public Long getSendStatus() {
        return this.SendStatus;
    }

    /**
     * Set <p>发送状态。</p><p>枚举值：</p><ul><li>1： 提交失败</li><li>2： 提交成功，送达成功</li><li>3： 提交成功，发送中</li><li>4： 提交成功，送达失败</li></ul>
     * @param SendStatus <p>发送状态。</p><p>枚举值：</p><ul><li>1： 提交失败</li><li>2： 提交成功，送达成功</li><li>3： 提交成功，发送中</li><li>4： 提交成功，送达失败</li></ul>
     */
    public void setSendStatus(Long SendStatus) {
        this.SendStatus = SendStatus;
    }

    /**
     * Get <p>请求状态码，可参考 <a href="https://cloud.tencent.com/document/api/382/59177#.E7.9F.AD.E4.BF.A1-API-3.0-.E5.8F.91.E9.80.81.E9.94.99.E8.AF.AF.E7.A0.81">短信 API 3.0 发送错误码</a>。</p> 
     * @return RequestCode <p>请求状态码，可参考 <a href="https://cloud.tencent.com/document/api/382/59177#.E7.9F.AD.E4.BF.A1-API-3.0-.E5.8F.91.E9.80.81.E9.94.99.E8.AF.AF.E7.A0.81">短信 API 3.0 发送错误码</a>。</p>
     */
    public String getRequestCode() {
        return this.RequestCode;
    }

    /**
     * Set <p>请求状态码，可参考 <a href="https://cloud.tencent.com/document/api/382/59177#.E7.9F.AD.E4.BF.A1-API-3.0-.E5.8F.91.E9.80.81.E9.94.99.E8.AF.AF.E7.A0.81">短信 API 3.0 发送错误码</a>。</p>
     * @param RequestCode <p>请求状态码，可参考 <a href="https://cloud.tencent.com/document/api/382/59177#.E7.9F.AD.E4.BF.A1-API-3.0-.E5.8F.91.E9.80.81.E9.94.99.E8.AF.AF.E7.A0.81">短信 API 3.0 发送错误码</a>。</p>
     */
    public void setRequestCode(String RequestCode) {
        this.RequestCode = RequestCode;
    }

    /**
     * Get <p>回执状态码，仅发送状态为 2（提交成功，送达成功）和 4（提交成功，送达失败）时有值，其余状态为空字符串，可参考 <a href="https://cloud.tencent.com/document/product/382/59177#.E5.9B.9E.E6.89.A7.E7.8A.B6.E6.80.81.E9.94.99.E8.AF.AF.E7.A0.81">回执状态错误码</a>。</p> 
     * @return StatusCode <p>回执状态码，仅发送状态为 2（提交成功，送达成功）和 4（提交成功，送达失败）时有值，其余状态为空字符串，可参考 <a href="https://cloud.tencent.com/document/product/382/59177#.E5.9B.9E.E6.89.A7.E7.8A.B6.E6.80.81.E9.94.99.E8.AF.AF.E7.A0.81">回执状态错误码</a>。</p>
     */
    public String getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set <p>回执状态码，仅发送状态为 2（提交成功，送达成功）和 4（提交成功，送达失败）时有值，其余状态为空字符串，可参考 <a href="https://cloud.tencent.com/document/product/382/59177#.E5.9B.9E.E6.89.A7.E7.8A.B6.E6.80.81.E9.94.99.E8.AF.AF.E7.A0.81">回执状态错误码</a>。</p>
     * @param StatusCode <p>回执状态码，仅发送状态为 2（提交成功，送达成功）和 4（提交成功，送达失败）时有值，其余状态为空字符串，可参考 <a href="https://cloud.tencent.com/document/product/382/59177#.E5.9B.9E.E6.89.A7.E7.8A.B6.E6.80.81.E9.94.99.E8.AF.AF.E7.A0.81">回执状态错误码</a>。</p>
     */
    public void setStatusCode(String StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get <p>国家码或地区码，例如 CN、US 等，对于未识别出国家码或者地区码，默认返回 DEF，具体支持列表请参考 <a href="https://cloud.tencent.com/document/product/382/18051#402a55da-83ac-4e79-a604-b9de0c507756">国际/港澳台短信价格总览</a>。</p> 
     * @return IsoCode <p>国家码或地区码，例如 CN、US 等，对于未识别出国家码或者地区码，默认返回 DEF，具体支持列表请参考 <a href="https://cloud.tencent.com/document/product/382/18051#402a55da-83ac-4e79-a604-b9de0c507756">国际/港澳台短信价格总览</a>。</p>
     */
    public String getIsoCode() {
        return this.IsoCode;
    }

    /**
     * Set <p>国家码或地区码，例如 CN、US 等，对于未识别出国家码或者地区码，默认返回 DEF，具体支持列表请参考 <a href="https://cloud.tencent.com/document/product/382/18051#402a55da-83ac-4e79-a604-b9de0c507756">国际/港澳台短信价格总览</a>。</p>
     * @param IsoCode <p>国家码或地区码，例如 CN、US 等，对于未识别出国家码或者地区码，默认返回 DEF，具体支持列表请参考 <a href="https://cloud.tencent.com/document/product/382/18051#402a55da-83ac-4e79-a604-b9de0c507756">国际/港澳台短信价格总览</a>。</p>
     */
    public void setIsoCode(String IsoCode) {
        this.IsoCode = IsoCode;
    }

    /**
     * Get <p>短信下发内容，为保证信息安全，短信中的部分入参信息会脱敏存储，对应发送记录查询结果中包含的打码内容，用户实际接收到的短信内容为正常完整内容。有疑问可咨询 <a href="https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81">腾讯云小助手</a> 。</p> 
     * @return Content <p>短信下发内容，为保证信息安全，短信中的部分入参信息会脱敏存储，对应发送记录查询结果中包含的打码内容，用户实际接收到的短信内容为正常完整内容。有疑问可咨询 <a href="https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81">腾讯云小助手</a> 。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>短信下发内容，为保证信息安全，短信中的部分入参信息会脱敏存储，对应发送记录查询结果中包含的打码内容，用户实际接收到的短信内容为正常完整内容。有疑问可咨询 <a href="https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81">腾讯云小助手</a> 。</p>
     * @param Content <p>短信下发内容，为保证信息安全，短信中的部分入参信息会脱敏存储，对应发送记录查询结果中包含的打码内容，用户实际接收到的短信内容为正常完整内容。有疑问可咨询 <a href="https://cloud.tencent.com/document/product/382/3773#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81">腾讯云小助手</a> 。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>发送时间，UNIX 时间戳（秒）。</p><p>单位：秒</p> 
     * @return SendTime <p>发送时间，UNIX 时间戳（秒）。</p><p>单位：秒</p>
     */
    public Long getSendTime() {
        return this.SendTime;
    }

    /**
     * Set <p>发送时间，UNIX 时间戳（秒）。</p><p>单位：秒</p>
     * @param SendTime <p>发送时间，UNIX 时间戳（秒）。</p><p>单位：秒</p>
     */
    public void setSendTime(Long SendTime) {
        this.SendTime = SendTime;
    }

    /**
     * Get <p>用户实际收到短信的时间，UNIX 时间戳（秒），仅发送状态为2（提交成功，送达成功）时有值 ，其余状态默认为 0 。</p><p>单位：秒</p> 
     * @return UserReceiveTime <p>用户实际收到短信的时间，UNIX 时间戳（秒），仅发送状态为2（提交成功，送达成功）时有值 ，其余状态默认为 0 。</p><p>单位：秒</p>
     */
    public Long getUserReceiveTime() {
        return this.UserReceiveTime;
    }

    /**
     * Set <p>用户实际收到短信的时间，UNIX 时间戳（秒），仅发送状态为2（提交成功，送达成功）时有值 ，其余状态默认为 0 。</p><p>单位：秒</p>
     * @param UserReceiveTime <p>用户实际收到短信的时间，UNIX 时间戳（秒），仅发送状态为2（提交成功，送达成功）时有值 ，其余状态默认为 0 。</p><p>单位：秒</p>
     */
    public void setUserReceiveTime(Long UserReceiveTime) {
        this.UserReceiveTime = UserReceiveTime;
    }

    public SendRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendRecord(SendRecord source) {
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.SendStatus != null) {
            this.SendStatus = new Long(source.SendStatus);
        }
        if (source.RequestCode != null) {
            this.RequestCode = new String(source.RequestCode);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new String(source.StatusCode);
        }
        if (source.IsoCode != null) {
            this.IsoCode = new String(source.IsoCode);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.SendTime != null) {
            this.SendTime = new Long(source.SendTime);
        }
        if (source.UserReceiveTime != null) {
            this.UserReceiveTime = new Long(source.UserReceiveTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "SendStatus", this.SendStatus);
        this.setParamSimple(map, prefix + "RequestCode", this.RequestCode);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "IsoCode", this.IsoCode);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "SendTime", this.SendTime);
        this.setParamSimple(map, prefix + "UserReceiveTime", this.UserReceiveTime);

    }
}

