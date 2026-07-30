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

public class AiCutoutConfig extends AbstractModel {

    /**
    * <p>能力配置开关，可选值：  ON：开启； OFF：关闭。 默认值：ON。</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>抠图目标类型指定：&quot;foreground&quot;（默认）/ &quot;pattern&quot;</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>图案抠图配置。仅在Type为pattern时生效。</p>
    */
    @SerializedName("PatternConfig")
    @Expose
    private PatternConfig PatternConfig;

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
     * Get <p>抠图目标类型指定：&quot;foreground&quot;（默认）/ &quot;pattern&quot;</p> 
     * @return Type <p>抠图目标类型指定：&quot;foreground&quot;（默认）/ &quot;pattern&quot;</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>抠图目标类型指定：&quot;foreground&quot;（默认）/ &quot;pattern&quot;</p>
     * @param Type <p>抠图目标类型指定：&quot;foreground&quot;（默认）/ &quot;pattern&quot;</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>图案抠图配置。仅在Type为pattern时生效。</p> 
     * @return PatternConfig <p>图案抠图配置。仅在Type为pattern时生效。</p>
     */
    public PatternConfig getPatternConfig() {
        return this.PatternConfig;
    }

    /**
     * Set <p>图案抠图配置。仅在Type为pattern时生效。</p>
     * @param PatternConfig <p>图案抠图配置。仅在Type为pattern时生效。</p>
     */
    public void setPatternConfig(PatternConfig PatternConfig) {
        this.PatternConfig = PatternConfig;
    }

    public AiCutoutConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiCutoutConfig(AiCutoutConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PatternConfig != null) {
            this.PatternConfig = new PatternConfig(source.PatternConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "PatternConfig.", this.PatternConfig);

    }
}

