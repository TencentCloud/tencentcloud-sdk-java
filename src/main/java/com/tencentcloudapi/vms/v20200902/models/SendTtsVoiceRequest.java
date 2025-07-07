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
package com.tencentcloudapi.vms.v20200902.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendTtsVoiceRequest extends AbstractModel {

    /**
    * 模板 ID，在控制台审核通过的模板 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 被叫手机号码，采用 e.164 标准，格式为+[国家或地区码][用户号码]。
例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
    */
    @SerializedName("CalledNumber")
    @Expose
    private String CalledNumber;

    /**
    * 在[语音控制台](https://console.cloud.tencent.com/vms)添加应用后生成的实际SdkAppid，示例如1400006666。
    */
    @SerializedName("VoiceSdkAppid")
    @Expose
    private String VoiceSdkAppid;

    /**
    * 模板参数，若模板没有参数，请提供为空数组。
注：语音消息的内容长度不超过350字。
    */
    @SerializedName("TemplateParamSet")
    @Expose
    private String [] TemplateParamSet;

    /**
    * 播放次数，可选，最多3次，默认2次。
    */
    @SerializedName("PlayTimes")
    @Expose
    private Long PlayTimes;

    /**
    * 用户的 session 内容，腾讯 server 回包中会原样返回。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get 模板 ID，在控制台审核通过的模板 ID。 
     * @return TemplateId 模板 ID，在控制台审核通过的模板 ID。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板 ID，在控制台审核通过的模板 ID。
     * @param TemplateId 模板 ID，在控制台审核通过的模板 ID。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 被叫手机号码，采用 e.164 标准，格式为+[国家或地区码][用户号码]。
例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。 
     * @return CalledNumber 被叫手机号码，采用 e.164 标准，格式为+[国家或地区码][用户号码]。
例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
     */
    public String getCalledNumber() {
        return this.CalledNumber;
    }

    /**
     * Set 被叫手机号码，采用 e.164 标准，格式为+[国家或地区码][用户号码]。
例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
     * @param CalledNumber 被叫手机号码，采用 e.164 标准，格式为+[国家或地区码][用户号码]。
例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号。
     */
    public void setCalledNumber(String CalledNumber) {
        this.CalledNumber = CalledNumber;
    }

    /**
     * Get 在[语音控制台](https://console.cloud.tencent.com/vms)添加应用后生成的实际SdkAppid，示例如1400006666。 
     * @return VoiceSdkAppid 在[语音控制台](https://console.cloud.tencent.com/vms)添加应用后生成的实际SdkAppid，示例如1400006666。
     */
    public String getVoiceSdkAppid() {
        return this.VoiceSdkAppid;
    }

    /**
     * Set 在[语音控制台](https://console.cloud.tencent.com/vms)添加应用后生成的实际SdkAppid，示例如1400006666。
     * @param VoiceSdkAppid 在[语音控制台](https://console.cloud.tencent.com/vms)添加应用后生成的实际SdkAppid，示例如1400006666。
     */
    public void setVoiceSdkAppid(String VoiceSdkAppid) {
        this.VoiceSdkAppid = VoiceSdkAppid;
    }

    /**
     * Get 模板参数，若模板没有参数，请提供为空数组。
注：语音消息的内容长度不超过350字。 
     * @return TemplateParamSet 模板参数，若模板没有参数，请提供为空数组。
注：语音消息的内容长度不超过350字。
     */
    public String [] getTemplateParamSet() {
        return this.TemplateParamSet;
    }

    /**
     * Set 模板参数，若模板没有参数，请提供为空数组。
注：语音消息的内容长度不超过350字。
     * @param TemplateParamSet 模板参数，若模板没有参数，请提供为空数组。
注：语音消息的内容长度不超过350字。
     */
    public void setTemplateParamSet(String [] TemplateParamSet) {
        this.TemplateParamSet = TemplateParamSet;
    }

    /**
     * Get 播放次数，可选，最多3次，默认2次。 
     * @return PlayTimes 播放次数，可选，最多3次，默认2次。
     */
    public Long getPlayTimes() {
        return this.PlayTimes;
    }

    /**
     * Set 播放次数，可选，最多3次，默认2次。
     * @param PlayTimes 播放次数，可选，最多3次，默认2次。
     */
    public void setPlayTimes(Long PlayTimes) {
        this.PlayTimes = PlayTimes;
    }

    /**
     * Get 用户的 session 内容，腾讯 server 回包中会原样返回。 
     * @return SessionContext 用户的 session 内容，腾讯 server 回包中会原样返回。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 用户的 session 内容，腾讯 server 回包中会原样返回。
     * @param SessionContext 用户的 session 内容，腾讯 server 回包中会原样返回。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public SendTtsVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendTtsVoiceRequest(SendTtsVoiceRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.CalledNumber != null) {
            this.CalledNumber = new String(source.CalledNumber);
        }
        if (source.VoiceSdkAppid != null) {
            this.VoiceSdkAppid = new String(source.VoiceSdkAppid);
        }
        if (source.TemplateParamSet != null) {
            this.TemplateParamSet = new String[source.TemplateParamSet.length];
            for (int i = 0; i < source.TemplateParamSet.length; i++) {
                this.TemplateParamSet[i] = new String(source.TemplateParamSet[i]);
            }
        }
        if (source.PlayTimes != null) {
            this.PlayTimes = new Long(source.PlayTimes);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "CalledNumber", this.CalledNumber);
        this.setParamSimple(map, prefix + "VoiceSdkAppid", this.VoiceSdkAppid);
        this.setParamArraySimple(map, prefix + "TemplateParamSet.", this.TemplateParamSet);
        this.setParamSimple(map, prefix + "PlayTimes", this.PlayTimes);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

