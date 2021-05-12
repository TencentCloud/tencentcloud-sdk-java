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
package com.tencentcloudapi.vms.v20200902.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendCodeVoiceRequest extends AbstractModel{

    /**
    * 验证码，仅支持填写数字，实际播报语音时，会自动在数字前补充语音文本"您的验证码是"。
    */
    @SerializedName("CodeMessage")
    @Expose
    private String CodeMessage;

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
     * Get 验证码，仅支持填写数字，实际播报语音时，会自动在数字前补充语音文本"您的验证码是"。 
     * @return CodeMessage 验证码，仅支持填写数字，实际播报语音时，会自动在数字前补充语音文本"您的验证码是"。
     */
    public String getCodeMessage() {
        return this.CodeMessage;
    }

    /**
     * Set 验证码，仅支持填写数字，实际播报语音时，会自动在数字前补充语音文本"您的验证码是"。
     * @param CodeMessage 验证码，仅支持填写数字，实际播报语音时，会自动在数字前补充语音文本"您的验证码是"。
     */
    public void setCodeMessage(String CodeMessage) {
        this.CodeMessage = CodeMessage;
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

    public SendCodeVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendCodeVoiceRequest(SendCodeVoiceRequest source) {
        if (source.CodeMessage != null) {
            this.CodeMessage = new String(source.CodeMessage);
        }
        if (source.CalledNumber != null) {
            this.CalledNumber = new String(source.CalledNumber);
        }
        if (source.VoiceSdkAppid != null) {
            this.VoiceSdkAppid = new String(source.VoiceSdkAppid);
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
        this.setParamSimple(map, prefix + "CodeMessage", this.CodeMessage);
        this.setParamSimple(map, prefix + "CalledNumber", this.CalledNumber);
        this.setParamSimple(map, prefix + "VoiceSdkAppid", this.VoiceSdkAppid);
        this.setParamSimple(map, prefix + "PlayTimes", this.PlayTimes);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

