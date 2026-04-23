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

public class MultiSmsInfo extends AbstractModel {

    /**
    * <p>下发手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为国际/港澳台手机号。 例如：+60198890000， 其中前面有一个+号 ，60为国家码，198890000为手机号。</p>
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * <p>模板 ID，必须填写已审核通过的模板 ID。模板 ID 可前往 <a href="https://console.cloud.tencent.com/smsv2/isms-template">国际/港澳台短信</a> 的正文模板管理查看，仅支持使用国际/港澳台短信模板。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>模板参数，若无模板参数，则设置为空。<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>模板参数的个数需要与 TemplateId 对应模板的变量个数保持一致。</p></div>    </div></blockquote></p>
    */
    @SerializedName("TemplateParamSet")
    @Expose
    private String [] TemplateParamSet;

    /**
    * <p>国际/港澳台短信 Sender ID。可参考 <a href="https://cloud.tencent.com/document/product/382/102831">Sender ID 说明</a>。注：国际/港澳台短信已申请独立 SenderId 需要填写该字段，默认使用公共 SenderId，无需填写该字段。</p>
    */
    @SerializedName("SenderId")
    @Expose
    private String SenderId;

    /**
    * <p>用户的 session 内容，可以携带用户侧 ID 等上下文信息，server 会原样返回。注意长度需小于512字节。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get <p>下发手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为国际/港澳台手机号。 例如：+60198890000， 其中前面有一个+号 ，60为国家码，198890000为手机号。</p> 
     * @return PhoneNumber <p>下发手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为国际/港澳台手机号。 例如：+60198890000， 其中前面有一个+号 ，60为国家码，198890000为手机号。</p>
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set <p>下发手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为国际/港澳台手机号。 例如：+60198890000， 其中前面有一个+号 ，60为国家码，198890000为手机号。</p>
     * @param PhoneNumber <p>下发手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号且要求全为国际/港澳台手机号。 例如：+60198890000， 其中前面有一个+号 ，60为国家码，198890000为手机号。</p>
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get <p>模板 ID，必须填写已审核通过的模板 ID。模板 ID 可前往 <a href="https://console.cloud.tencent.com/smsv2/isms-template">国际/港澳台短信</a> 的正文模板管理查看，仅支持使用国际/港澳台短信模板。</p> 
     * @return TemplateId <p>模板 ID，必须填写已审核通过的模板 ID。模板 ID 可前往 <a href="https://console.cloud.tencent.com/smsv2/isms-template">国际/港澳台短信</a> 的正文模板管理查看，仅支持使用国际/港澳台短信模板。</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板 ID，必须填写已审核通过的模板 ID。模板 ID 可前往 <a href="https://console.cloud.tencent.com/smsv2/isms-template">国际/港澳台短信</a> 的正文模板管理查看，仅支持使用国际/港澳台短信模板。</p>
     * @param TemplateId <p>模板 ID，必须填写已审核通过的模板 ID。模板 ID 可前往 <a href="https://console.cloud.tencent.com/smsv2/isms-template">国际/港澳台短信</a> 的正文模板管理查看，仅支持使用国际/港澳台短信模板。</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>模板参数，若无模板参数，则设置为空。<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>模板参数的个数需要与 TemplateId 对应模板的变量个数保持一致。</p></div>    </div></blockquote></p> 
     * @return TemplateParamSet <p>模板参数，若无模板参数，则设置为空。<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>模板参数的个数需要与 TemplateId 对应模板的变量个数保持一致。</p></div>    </div></blockquote></p>
     */
    public String [] getTemplateParamSet() {
        return this.TemplateParamSet;
    }

    /**
     * Set <p>模板参数，若无模板参数，则设置为空。<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>模板参数的个数需要与 TemplateId 对应模板的变量个数保持一致。</p></div>    </div></blockquote></p>
     * @param TemplateParamSet <p>模板参数，若无模板参数，则设置为空。<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">注意</div>        <div class="rno-document-tip-desc"><p>模板参数的个数需要与 TemplateId 对应模板的变量个数保持一致。</p></div>    </div></blockquote></p>
     */
    public void setTemplateParamSet(String [] TemplateParamSet) {
        this.TemplateParamSet = TemplateParamSet;
    }

    /**
     * Get <p>国际/港澳台短信 Sender ID。可参考 <a href="https://cloud.tencent.com/document/product/382/102831">Sender ID 说明</a>。注：国际/港澳台短信已申请独立 SenderId 需要填写该字段，默认使用公共 SenderId，无需填写该字段。</p> 
     * @return SenderId <p>国际/港澳台短信 Sender ID。可参考 <a href="https://cloud.tencent.com/document/product/382/102831">Sender ID 说明</a>。注：国际/港澳台短信已申请独立 SenderId 需要填写该字段，默认使用公共 SenderId，无需填写该字段。</p>
     */
    public String getSenderId() {
        return this.SenderId;
    }

    /**
     * Set <p>国际/港澳台短信 Sender ID。可参考 <a href="https://cloud.tencent.com/document/product/382/102831">Sender ID 说明</a>。注：国际/港澳台短信已申请独立 SenderId 需要填写该字段，默认使用公共 SenderId，无需填写该字段。</p>
     * @param SenderId <p>国际/港澳台短信 Sender ID。可参考 <a href="https://cloud.tencent.com/document/product/382/102831">Sender ID 说明</a>。注：国际/港澳台短信已申请独立 SenderId 需要填写该字段，默认使用公共 SenderId，无需填写该字段。</p>
     */
    public void setSenderId(String SenderId) {
        this.SenderId = SenderId;
    }

    /**
     * Get <p>用户的 session 内容，可以携带用户侧 ID 等上下文信息，server 会原样返回。注意长度需小于512字节。</p> 
     * @return SessionContext <p>用户的 session 内容，可以携带用户侧 ID 等上下文信息，server 会原样返回。注意长度需小于512字节。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>用户的 session 内容，可以携带用户侧 ID 等上下文信息，server 会原样返回。注意长度需小于512字节。</p>
     * @param SessionContext <p>用户的 session 内容，可以携带用户侧 ID 等上下文信息，server 会原样返回。注意长度需小于512字节。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public MultiSmsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiSmsInfo(MultiSmsInfo source) {
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateParamSet != null) {
            this.TemplateParamSet = new String[source.TemplateParamSet.length];
            for (int i = 0; i < source.TemplateParamSet.length; i++) {
                this.TemplateParamSet[i] = new String(source.TemplateParamSet[i]);
            }
        }
        if (source.SenderId != null) {
            this.SenderId = new String(source.SenderId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArraySimple(map, prefix + "TemplateParamSet.", this.TemplateParamSet);
        this.setParamSimple(map, prefix + "SenderId", this.SenderId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

