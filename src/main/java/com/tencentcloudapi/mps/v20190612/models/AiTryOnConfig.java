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

public class AiTryOnConfig extends AbstractModel {

    /**
    * <p>换装模型，取值：</p><ul><li>WAND-tryon-1.0-lite</li><li>WAND-tryon-1.0-flash</li><li>WAND-tryon-1.0-pro</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>换装指令。</p><p>为空时使用内置指令。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>输出图片分辨率，取值：</p><ul><li>1K</li><li>2K</li><li>4K</li></ul><p>默认值：1K</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get <p>换装模型，取值：</p><ul><li>WAND-tryon-1.0-lite</li><li>WAND-tryon-1.0-flash</li><li>WAND-tryon-1.0-pro</li></ul> 
     * @return Model <p>换装模型，取值：</p><ul><li>WAND-tryon-1.0-lite</li><li>WAND-tryon-1.0-flash</li><li>WAND-tryon-1.0-pro</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>换装模型，取值：</p><ul><li>WAND-tryon-1.0-lite</li><li>WAND-tryon-1.0-flash</li><li>WAND-tryon-1.0-pro</li></ul>
     * @param Model <p>换装模型，取值：</p><ul><li>WAND-tryon-1.0-lite</li><li>WAND-tryon-1.0-flash</li><li>WAND-tryon-1.0-pro</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>换装指令。</p><p>为空时使用内置指令。</p> 
     * @return Prompt <p>换装指令。</p><p>为空时使用内置指令。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>换装指令。</p><p>为空时使用内置指令。</p>
     * @param Prompt <p>换装指令。</p><p>为空时使用内置指令。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>输出图片分辨率，取值：</p><ul><li>1K</li><li>2K</li><li>4K</li></ul><p>默认值：1K</p> 
     * @return Resolution <p>输出图片分辨率，取值：</p><ul><li>1K</li><li>2K</li><li>4K</li></ul><p>默认值：1K</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>输出图片分辨率，取值：</p><ul><li>1K</li><li>2K</li><li>4K</li></ul><p>默认值：1K</p>
     * @param Resolution <p>输出图片分辨率，取值：</p><ul><li>1K</li><li>2K</li><li>4K</li></ul><p>默认值：1K</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
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
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

