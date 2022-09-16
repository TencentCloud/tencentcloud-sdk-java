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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TraceWatermarkInput extends AbstractModel{

    /**
    * 溯源水印任务开关，此字段必填，可选值：
<li>ON：开启溯源水印；</li>
<li>OFF：关闭溯源水印。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 该字段已废弃，请勿使用。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
     * Get 溯源水印任务开关，此字段必填，可选值：
<li>ON：开启溯源水印；</li>
<li>OFF：关闭溯源水印。</li> 
     * @return Switch 溯源水印任务开关，此字段必填，可选值：
<li>ON：开启溯源水印；</li>
<li>OFF：关闭溯源水印。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 溯源水印任务开关，此字段必填，可选值：
<li>ON：开启溯源水印；</li>
<li>OFF：关闭溯源水印。</li>
     * @param Switch 溯源水印任务开关，此字段必填，可选值：
<li>ON：开启溯源水印；</li>
<li>OFF：关闭溯源水印。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 该字段已废弃，请勿使用。 
     * @return Definition 该字段已废弃，请勿使用。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 该字段已废弃，请勿使用。
     * @param Definition 该字段已废弃，请勿使用。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    public TraceWatermarkInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TraceWatermarkInput(TraceWatermarkInput source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Definition", this.Definition);

    }
}

