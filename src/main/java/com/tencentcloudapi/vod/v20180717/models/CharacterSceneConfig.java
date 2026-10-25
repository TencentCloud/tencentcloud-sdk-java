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

public class CharacterSceneConfig extends AbstractModel {

    /**
    * <p>模型。</p><p>枚举值：</p><ul><li>character_scene_standard： 标准。</li><li>character_scene_mini： 轻量。</li><li>character_scene_fast： 快速。</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>提示词模式。</p><p>枚举值：</p><ul><li>Standard： 标准模式，自行填写提示词。</li><li>Dynamic： 动态模式，由大模型根据参考素材产生提示词。</li></ul><p>默认值：Standard</p>
    */
    @SerializedName("PromptMode")
    @Expose
    private String PromptMode;

    /**
     * Get <p>模型。</p><p>枚举值：</p><ul><li>character_scene_standard： 标准。</li><li>character_scene_mini： 轻量。</li><li>character_scene_fast： 快速。</li></ul> 
     * @return Model <p>模型。</p><p>枚举值：</p><ul><li>character_scene_standard： 标准。</li><li>character_scene_mini： 轻量。</li><li>character_scene_fast： 快速。</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型。</p><p>枚举值：</p><ul><li>character_scene_standard： 标准。</li><li>character_scene_mini： 轻量。</li><li>character_scene_fast： 快速。</li></ul>
     * @param Model <p>模型。</p><p>枚举值：</p><ul><li>character_scene_standard： 标准。</li><li>character_scene_mini： 轻量。</li><li>character_scene_fast： 快速。</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>提示词模式。</p><p>枚举值：</p><ul><li>Standard： 标准模式，自行填写提示词。</li><li>Dynamic： 动态模式，由大模型根据参考素材产生提示词。</li></ul><p>默认值：Standard</p> 
     * @return PromptMode <p>提示词模式。</p><p>枚举值：</p><ul><li>Standard： 标准模式，自行填写提示词。</li><li>Dynamic： 动态模式，由大模型根据参考素材产生提示词。</li></ul><p>默认值：Standard</p>
     */
    public String getPromptMode() {
        return this.PromptMode;
    }

    /**
     * Set <p>提示词模式。</p><p>枚举值：</p><ul><li>Standard： 标准模式，自行填写提示词。</li><li>Dynamic： 动态模式，由大模型根据参考素材产生提示词。</li></ul><p>默认值：Standard</p>
     * @param PromptMode <p>提示词模式。</p><p>枚举值：</p><ul><li>Standard： 标准模式，自行填写提示词。</li><li>Dynamic： 动态模式，由大模型根据参考素材产生提示词。</li></ul><p>默认值：Standard</p>
     */
    public void setPromptMode(String PromptMode) {
        this.PromptMode = PromptMode;
    }

    public CharacterSceneConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CharacterSceneConfig(CharacterSceneConfig source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.PromptMode != null) {
            this.PromptMode = new String(source.PromptMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "PromptMode", this.PromptMode);

    }
}

