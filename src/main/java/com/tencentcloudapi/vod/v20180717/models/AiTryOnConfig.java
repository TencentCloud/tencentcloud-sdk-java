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

public class AiTryOnConfig extends AbstractModel {

    /**
    * <p>换装模型。</p><p>枚举值：</p><ul><li>WAND-tryon-1.0-lite： 轻量档，速度优先。</li><li>WAND-tryon-1.0-flash： 均衡档，兼顾效果与时延。</li><li>WAND-tryon-1.0-pro： 高质量档，效果优先。</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>输入需要更换的衣物图片列表。支持1-4张图片。</p>
    */
    @SerializedName("ClothesFileInfos")
    @Expose
    private SceneAigcImageTaskInputFileInfo [] ClothesFileInfos;

    /**
    * <p>换装指令Prompt。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
     * Get <p>换装模型。</p><p>枚举值：</p><ul><li>WAND-tryon-1.0-lite： 轻量档，速度优先。</li><li>WAND-tryon-1.0-flash： 均衡档，兼顾效果与时延。</li><li>WAND-tryon-1.0-pro： 高质量档，效果优先。</li></ul> 
     * @return Model <p>换装模型。</p><p>枚举值：</p><ul><li>WAND-tryon-1.0-lite： 轻量档，速度优先。</li><li>WAND-tryon-1.0-flash： 均衡档，兼顾效果与时延。</li><li>WAND-tryon-1.0-pro： 高质量档，效果优先。</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>换装模型。</p><p>枚举值：</p><ul><li>WAND-tryon-1.0-lite： 轻量档，速度优先。</li><li>WAND-tryon-1.0-flash： 均衡档，兼顾效果与时延。</li><li>WAND-tryon-1.0-pro： 高质量档，效果优先。</li></ul>
     * @param Model <p>换装模型。</p><p>枚举值：</p><ul><li>WAND-tryon-1.0-lite： 轻量档，速度优先。</li><li>WAND-tryon-1.0-flash： 均衡档，兼顾效果与时延。</li><li>WAND-tryon-1.0-pro： 高质量档，效果优先。</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>输入需要更换的衣物图片列表。支持1-4张图片。</p> 
     * @return ClothesFileInfos <p>输入需要更换的衣物图片列表。支持1-4张图片。</p>
     */
    public SceneAigcImageTaskInputFileInfo [] getClothesFileInfos() {
        return this.ClothesFileInfos;
    }

    /**
     * Set <p>输入需要更换的衣物图片列表。支持1-4张图片。</p>
     * @param ClothesFileInfos <p>输入需要更换的衣物图片列表。支持1-4张图片。</p>
     */
    public void setClothesFileInfos(SceneAigcImageTaskInputFileInfo [] ClothesFileInfos) {
        this.ClothesFileInfos = ClothesFileInfos;
    }

    /**
     * Get <p>换装指令Prompt。</p> 
     * @return Prompt <p>换装指令Prompt。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>换装指令Prompt。</p>
     * @param Prompt <p>换装指令Prompt。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    public AiTryOnConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiTryOnConfig(AiTryOnConfig source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.ClothesFileInfos != null) {
            this.ClothesFileInfos = new SceneAigcImageTaskInputFileInfo[source.ClothesFileInfos.length];
            for (int i = 0; i < source.ClothesFileInfos.length; i++) {
                this.ClothesFileInfos[i] = new SceneAigcImageTaskInputFileInfo(source.ClothesFileInfos[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "ClothesFileInfos.", this.ClothesFileInfos);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);

    }
}

