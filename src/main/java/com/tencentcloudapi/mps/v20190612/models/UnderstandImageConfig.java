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

public class UnderstandImageConfig extends AbstractModel {

    /**
    * <p>图片理解模型</p><p>枚举值：</p><ul><li>WAND-understand-1.0-lite： 轻量理解模型</li><li>WAND-understand-1.0-flash： 质量-速度平衡理解模型</li><li>WAND-understand-1.0-pro： 高质量理解模型</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>图片理解指令</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
     * Get <p>图片理解模型</p><p>枚举值：</p><ul><li>WAND-understand-1.0-lite： 轻量理解模型</li><li>WAND-understand-1.0-flash： 质量-速度平衡理解模型</li><li>WAND-understand-1.0-pro： 高质量理解模型</li></ul> 
     * @return Model <p>图片理解模型</p><p>枚举值：</p><ul><li>WAND-understand-1.0-lite： 轻量理解模型</li><li>WAND-understand-1.0-flash： 质量-速度平衡理解模型</li><li>WAND-understand-1.0-pro： 高质量理解模型</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>图片理解模型</p><p>枚举值：</p><ul><li>WAND-understand-1.0-lite： 轻量理解模型</li><li>WAND-understand-1.0-flash： 质量-速度平衡理解模型</li><li>WAND-understand-1.0-pro： 高质量理解模型</li></ul>
     * @param Model <p>图片理解模型</p><p>枚举值：</p><ul><li>WAND-understand-1.0-lite： 轻量理解模型</li><li>WAND-understand-1.0-flash： 质量-速度平衡理解模型</li><li>WAND-understand-1.0-pro： 高质量理解模型</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>图片理解指令</p> 
     * @return Prompt <p>图片理解指令</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>图片理解指令</p>
     * @param Prompt <p>图片理解指令</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    public UnderstandImageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnderstandImageConfig(UnderstandImageConfig source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
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
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);

    }
}

