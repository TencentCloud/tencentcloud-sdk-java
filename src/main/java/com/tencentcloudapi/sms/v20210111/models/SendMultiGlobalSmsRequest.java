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

public class SendMultiGlobalSmsRequest extends AbstractModel {

    /**
    * <p>短信 SdkAppId，在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId。</p>
    */
    @SerializedName("SmsSdkAppId")
    @Expose
    private String SmsSdkAppId;

    /**
    * <p>批量发送信息列表，单次请求最多支持200个号码且要求全为国际/港澳台号码。每个元素包含一个手机号码及其对应的模板、模板参数等信息。</p>
    */
    @SerializedName("MultiSmsInfoSet")
    @Expose
    private MultiSmsInfo [] MultiSmsInfoSet;

    /**
     * Get <p>短信 SdkAppId，在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId。</p> 
     * @return SmsSdkAppId <p>短信 SdkAppId，在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId。</p>
     */
    public String getSmsSdkAppId() {
        return this.SmsSdkAppId;
    }

    /**
     * Set <p>短信 SdkAppId，在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId。</p>
     * @param SmsSdkAppId <p>短信 SdkAppId，在 <a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>  添加应用后生成的实际 SdkAppId。</p>
     */
    public void setSmsSdkAppId(String SmsSdkAppId) {
        this.SmsSdkAppId = SmsSdkAppId;
    }

    /**
     * Get <p>批量发送信息列表，单次请求最多支持200个号码且要求全为国际/港澳台号码。每个元素包含一个手机号码及其对应的模板、模板参数等信息。</p> 
     * @return MultiSmsInfoSet <p>批量发送信息列表，单次请求最多支持200个号码且要求全为国际/港澳台号码。每个元素包含一个手机号码及其对应的模板、模板参数等信息。</p>
     */
    public MultiSmsInfo [] getMultiSmsInfoSet() {
        return this.MultiSmsInfoSet;
    }

    /**
     * Set <p>批量发送信息列表，单次请求最多支持200个号码且要求全为国际/港澳台号码。每个元素包含一个手机号码及其对应的模板、模板参数等信息。</p>
     * @param MultiSmsInfoSet <p>批量发送信息列表，单次请求最多支持200个号码且要求全为国际/港澳台号码。每个元素包含一个手机号码及其对应的模板、模板参数等信息。</p>
     */
    public void setMultiSmsInfoSet(MultiSmsInfo [] MultiSmsInfoSet) {
        this.MultiSmsInfoSet = MultiSmsInfoSet;
    }

    public SendMultiGlobalSmsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendMultiGlobalSmsRequest(SendMultiGlobalSmsRequest source) {
        if (source.SmsSdkAppId != null) {
            this.SmsSdkAppId = new String(source.SmsSdkAppId);
        }
        if (source.MultiSmsInfoSet != null) {
            this.MultiSmsInfoSet = new MultiSmsInfo[source.MultiSmsInfoSet.length];
            for (int i = 0; i < source.MultiSmsInfoSet.length; i++) {
                this.MultiSmsInfoSet[i] = new MultiSmsInfo(source.MultiSmsInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SmsSdkAppId", this.SmsSdkAppId);
        this.setParamArrayObj(map, prefix + "MultiSmsInfoSet.", this.MultiSmsInfoSet);

    }
}

