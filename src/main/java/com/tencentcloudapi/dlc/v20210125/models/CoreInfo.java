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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoreInfo extends AbstractModel {

    /**
    * 时间戳(毫秒)数组
    */
    @SerializedName("Timestamp")
    @Expose
    private Long [] Timestamp;

    /**
    * core 用量
    */
    @SerializedName("CoreUsage")
    @Expose
    private Long [] CoreUsage;

    /**
     * Get 时间戳(毫秒)数组 
     * @return Timestamp 时间戳(毫秒)数组
     */
    public Long [] getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳(毫秒)数组
     * @param Timestamp 时间戳(毫秒)数组
     */
    public void setTimestamp(Long [] Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get core 用量 
     * @return CoreUsage core 用量
     */
    public Long [] getCoreUsage() {
        return this.CoreUsage;
    }

    /**
     * Set core 用量
     * @param CoreUsage core 用量
     */
    public void setCoreUsage(Long [] CoreUsage) {
        this.CoreUsage = CoreUsage;
    }

    public CoreInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoreInfo(CoreInfo source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long[source.Timestamp.length];
            for (int i = 0; i < source.Timestamp.length; i++) {
                this.Timestamp[i] = new Long(source.Timestamp[i]);
            }
        }
        if (source.CoreUsage != null) {
            this.CoreUsage = new Long[source.CoreUsage.length];
            for (int i = 0; i < source.CoreUsage.length; i++) {
                this.CoreUsage[i] = new Long(source.CoreUsage[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Timestamp.", this.Timestamp);
        this.setParamArraySimple(map, prefix + "CoreUsage.", this.CoreUsage);

    }
}

