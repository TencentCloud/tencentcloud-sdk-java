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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSAIAnalysisConfigureInfo extends AbstractModel {

    /**
    * <p>智能分类任务开关，可选值： <li>ON：开启智能分类任务；</li> <li>OFF：关闭智能分类任务。</li></p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get <p>智能分类任务开关，可选值： <li>ON：开启智能分类任务；</li> <li>OFF：关闭智能分类任务。</li></p> 
     * @return Switch <p>智能分类任务开关，可选值： <li>ON：开启智能分类任务；</li> <li>OFF：关闭智能分类任务。</li></p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>智能分类任务开关，可选值： <li>ON：开启智能分类任务；</li> <li>OFF：关闭智能分类任务。</li></p>
     * @param Switch <p>智能分类任务开关，可选值： <li>ON：开启智能分类任务；</li> <li>OFF：关闭智能分类任务。</li></p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public MPSAIAnalysisConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSAIAnalysisConfigureInfo(MPSAIAnalysisConfigureInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

