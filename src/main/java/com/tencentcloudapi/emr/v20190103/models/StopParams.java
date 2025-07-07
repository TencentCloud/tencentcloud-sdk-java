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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopParams extends AbstractModel {

    /**
    * 安全模式：safe
默认模式：default
    */
    @SerializedName("StopPolicy")
    @Expose
    private String StopPolicy;

    /**
    * 线程数
    */
    @SerializedName("ThreadCount")
    @Expose
    private Long ThreadCount;

    /**
     * Get 安全模式：safe
默认模式：default 
     * @return StopPolicy 安全模式：safe
默认模式：default
     */
    public String getStopPolicy() {
        return this.StopPolicy;
    }

    /**
     * Set 安全模式：safe
默认模式：default
     * @param StopPolicy 安全模式：safe
默认模式：default
     */
    public void setStopPolicy(String StopPolicy) {
        this.StopPolicy = StopPolicy;
    }

    /**
     * Get 线程数 
     * @return ThreadCount 线程数
     */
    public Long getThreadCount() {
        return this.ThreadCount;
    }

    /**
     * Set 线程数
     * @param ThreadCount 线程数
     */
    public void setThreadCount(Long ThreadCount) {
        this.ThreadCount = ThreadCount;
    }

    public StopParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopParams(StopParams source) {
        if (source.StopPolicy != null) {
            this.StopPolicy = new String(source.StopPolicy);
        }
        if (source.ThreadCount != null) {
            this.ThreadCount = new Long(source.ThreadCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StopPolicy", this.StopPolicy);
        this.setParamSimple(map, prefix + "ThreadCount", this.ThreadCount);

    }
}

