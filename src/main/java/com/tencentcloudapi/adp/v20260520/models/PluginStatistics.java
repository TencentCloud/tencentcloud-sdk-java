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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PluginStatistics extends AbstractModel {

    /**
    * 插件调用量
    */
    @SerializedName("CallCount")
    @Expose
    private Long CallCount;

    /**
    * 工具数量
    */
    @SerializedName("ToolCount")
    @Expose
    private Long ToolCount;

    /**
     * Get 插件调用量 
     * @return CallCount 插件调用量
     */
    public Long getCallCount() {
        return this.CallCount;
    }

    /**
     * Set 插件调用量
     * @param CallCount 插件调用量
     */
    public void setCallCount(Long CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get 工具数量 
     * @return ToolCount 工具数量
     */
    public Long getToolCount() {
        return this.ToolCount;
    }

    /**
     * Set 工具数量
     * @param ToolCount 工具数量
     */
    public void setToolCount(Long ToolCount) {
        this.ToolCount = ToolCount;
    }

    public PluginStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginStatistics(PluginStatistics source) {
        if (source.CallCount != null) {
            this.CallCount = new Long(source.CallCount);
        }
        if (source.ToolCount != null) {
            this.ToolCount = new Long(source.ToolCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "ToolCount", this.ToolCount);

    }
}

