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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiStoryboardConfig extends AbstractModel {

    /**
    * <p>能力配置开关，可选值：  ON：开启； OFF：关闭。 默认值：ON。</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>指定提取的分镜图的序号，从0开始计数，不填写则返回所有分镜图。</p>
    */
    @SerializedName("ProcessIndex")
    @Expose
    private Long ProcessIndex;

    /**
     * Get <p>能力配置开关，可选值：  ON：开启； OFF：关闭。 默认值：ON。</p> 
     * @return Switch <p>能力配置开关，可选值：  ON：开启； OFF：关闭。 默认值：ON。</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>能力配置开关，可选值：  ON：开启； OFF：关闭。 默认值：ON。</p>
     * @param Switch <p>能力配置开关，可选值：  ON：开启； OFF：关闭。 默认值：ON。</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>指定提取的分镜图的序号，从0开始计数，不填写则返回所有分镜图。</p> 
     * @return ProcessIndex <p>指定提取的分镜图的序号，从0开始计数，不填写则返回所有分镜图。</p>
     */
    public Long getProcessIndex() {
        return this.ProcessIndex;
    }

    /**
     * Set <p>指定提取的分镜图的序号，从0开始计数，不填写则返回所有分镜图。</p>
     * @param ProcessIndex <p>指定提取的分镜图的序号，从0开始计数，不填写则返回所有分镜图。</p>
     */
    public void setProcessIndex(Long ProcessIndex) {
        this.ProcessIndex = ProcessIndex;
    }

    public AiStoryboardConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiStoryboardConfig(AiStoryboardConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ProcessIndex != null) {
            this.ProcessIndex = new Long(source.ProcessIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "ProcessIndex", this.ProcessIndex);

    }
}

