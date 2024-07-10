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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetNotifyUrlRequest extends AbstractModel {

    /**
    * 告警通知回调url
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 告警通知回调key
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * 流量包的告警阈值
    */
    @SerializedName("AlarmValue")
    @Expose
    private Long AlarmValue;

    /**
     * Get 告警通知回调url 
     * @return NotifyUrl 告警通知回调url
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 告警通知回调url
     * @param NotifyUrl 告警通知回调url
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 告警通知回调key 
     * @return CallbackKey 告警通知回调key
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set 告警通知回调key
     * @param CallbackKey 告警通知回调key
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    /**
     * Get 流量包的告警阈值 
     * @return AlarmValue 流量包的告警阈值
     */
    public Long getAlarmValue() {
        return this.AlarmValue;
    }

    /**
     * Set 流量包的告警阈值
     * @param AlarmValue 流量包的告警阈值
     */
    public void setAlarmValue(Long AlarmValue) {
        this.AlarmValue = AlarmValue;
    }

    public SetNotifyUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetNotifyUrlRequest(SetNotifyUrlRequest source) {
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.CallbackKey != null) {
            this.CallbackKey = new String(source.CallbackKey);
        }
        if (source.AlarmValue != null) {
            this.AlarmValue = new Long(source.AlarmValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "AlarmValue", this.AlarmValue);

    }
}

