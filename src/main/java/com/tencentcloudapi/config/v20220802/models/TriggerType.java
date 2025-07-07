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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerType extends AbstractModel {

    /**
    * 触发类型
    */
    @SerializedName("MessageType")
    @Expose
    private String MessageType;

    /**
    * 触发时间周期
    */
    @SerializedName("MaximumExecutionFrequency")
    @Expose
    private String MaximumExecutionFrequency;

    /**
     * Get 触发类型 
     * @return MessageType 触发类型
     */
    public String getMessageType() {
        return this.MessageType;
    }

    /**
     * Set 触发类型
     * @param MessageType 触发类型
     */
    public void setMessageType(String MessageType) {
        this.MessageType = MessageType;
    }

    /**
     * Get 触发时间周期 
     * @return MaximumExecutionFrequency 触发时间周期
     */
    public String getMaximumExecutionFrequency() {
        return this.MaximumExecutionFrequency;
    }

    /**
     * Set 触发时间周期
     * @param MaximumExecutionFrequency 触发时间周期
     */
    public void setMaximumExecutionFrequency(String MaximumExecutionFrequency) {
        this.MaximumExecutionFrequency = MaximumExecutionFrequency;
    }

    public TriggerType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerType(TriggerType source) {
        if (source.MessageType != null) {
            this.MessageType = new String(source.MessageType);
        }
        if (source.MaximumExecutionFrequency != null) {
            this.MaximumExecutionFrequency = new String(source.MaximumExecutionFrequency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);
        this.setParamSimple(map, prefix + "MaximumExecutionFrequency", this.MaximumExecutionFrequency);

    }
}

