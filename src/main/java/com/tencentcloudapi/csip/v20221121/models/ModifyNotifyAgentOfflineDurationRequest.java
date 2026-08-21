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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNotifyAgentOfflineDurationRequest extends AbstractModel {

    /**
    * <p>离线时长，分钟级20-50m，步长10；小时级1-24h，步长1</p>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
     * Get <p>离线时长，分钟级20-50m，步长10；小时级1-24h，步长1</p> 
     * @return Duration <p>离线时长，分钟级20-50m，步长10；小时级1-24h，步长1</p>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>离线时长，分钟级20-50m，步长10；小时级1-24h，步长1</p>
     * @param Duration <p>离线时长，分钟级20-50m，步长10；小时级1-24h，步长1</p>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public ModifyNotifyAgentOfflineDurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNotifyAgentOfflineDurationRequest(ModifyNotifyAgentOfflineDurationRequest source) {
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

