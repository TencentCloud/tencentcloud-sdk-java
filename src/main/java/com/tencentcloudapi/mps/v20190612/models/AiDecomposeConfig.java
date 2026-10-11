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

public class AiDecomposeConfig extends AbstractModel {

    /**
    * <p>能力配置开关。</p><p>枚举值：</p><ul><li>ON： 开启图层分离功能。</li><li>OFF： 关闭图层分离功能。</li></ul><p>默认值：ON</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>预期拆层数量。</p><p>取值范围：[2, 17]</p>
    */
    @SerializedName("Layers")
    @Expose
    private Long Layers;

    /**
    * <p>提示词。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>模型名称。</p><p>枚举值：</p><ul><li>decompose-1.0-flash： 1.0版本 flash模型</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get <p>能力配置开关。</p><p>枚举值：</p><ul><li>ON： 开启图层分离功能。</li><li>OFF： 关闭图层分离功能。</li></ul><p>默认值：ON</p> 
     * @return Switch <p>能力配置开关。</p><p>枚举值：</p><ul><li>ON： 开启图层分离功能。</li><li>OFF： 关闭图层分离功能。</li></ul><p>默认值：ON</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>能力配置开关。</p><p>枚举值：</p><ul><li>ON： 开启图层分离功能。</li><li>OFF： 关闭图层分离功能。</li></ul><p>默认值：ON</p>
     * @param Switch <p>能力配置开关。</p><p>枚举值：</p><ul><li>ON： 开启图层分离功能。</li><li>OFF： 关闭图层分离功能。</li></ul><p>默认值：ON</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>预期拆层数量。</p><p>取值范围：[2, 17]</p> 
     * @return Layers <p>预期拆层数量。</p><p>取值范围：[2, 17]</p>
     */
    public Long getLayers() {
        return this.Layers;
    }

    /**
     * Set <p>预期拆层数量。</p><p>取值范围：[2, 17]</p>
     * @param Layers <p>预期拆层数量。</p><p>取值范围：[2, 17]</p>
     */
    public void setLayers(Long Layers) {
        this.Layers = Layers;
    }

    /**
     * Get <p>提示词。</p> 
     * @return Prompt <p>提示词。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>提示词。</p>
     * @param Prompt <p>提示词。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>模型名称。</p><p>枚举值：</p><ul><li>decompose-1.0-flash： 1.0版本 flash模型</li></ul> 
     * @return Model <p>模型名称。</p><p>枚举值：</p><ul><li>decompose-1.0-flash： 1.0版本 flash模型</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名称。</p><p>枚举值：</p><ul><li>decompose-1.0-flash： 1.0版本 flash模型</li></ul>
     * @param Model <p>模型名称。</p><p>枚举值：</p><ul><li>decompose-1.0-flash： 1.0版本 flash模型</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public AiDecomposeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiDecomposeConfig(AiDecomposeConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Layers != null) {
            this.Layers = new Long(source.Layers);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Layers", this.Layers);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}

