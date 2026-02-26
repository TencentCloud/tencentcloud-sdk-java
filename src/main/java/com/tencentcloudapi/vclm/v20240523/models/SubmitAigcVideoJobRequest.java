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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitAigcVideoJobRequest extends AbstractModel {

    /**
    * <p>模型名称。</p><p>枚举值：</p><p>● Vidu；</p><p>● Kling：可灵；</p><p>● SA；</p><p>● VO；</p><p>● HY：混元；</p><p>● YT：优图；</p><p>示例值：Vidu</p>
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * <p>模型版本。</p><p>按照【厂商-版本号】</p><p>枚举值：</p><p>● 当ModelName为Vidu时，可选值[q2, q2-pro, q2-turbo]</p><p>● 当ModelName为Kling时，可选值[v1.6, v2.0, v2.1, v2.5 , v2.6]</p><p>● 当ModelName为SA时，可选值[SA2]</p><p>● 当ModelName为VO时，可选值[V3, V3.1, V3-Fast, V3.1-Fast]</p><p>● 当ModelName为HY时，默认选择：v1.5</p><p>● 当ModelName为YT时，默认值选择：v2.0</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>模型参数Json-Format字符串</p>
    */
    @SerializedName("ModelParam")
    @Expose
    private String ModelParam;

    /**
    * <p>正向文本提示词。不能超过2000个字符</p><p>示例值：一只小猫在草地奔跑</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>为生成结果图添加显式水印标识的开关，默认为1。<br>1：添加。<br>0：不添加。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。<br>示例值：1</p>
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * <p>标识内容设置。<br>默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
     * Get <p>模型名称。</p><p>枚举值：</p><p>● Vidu；</p><p>● Kling：可灵；</p><p>● SA；</p><p>● VO；</p><p>● HY：混元；</p><p>● YT：优图；</p><p>示例值：Vidu</p> 
     * @return Vendor <p>模型名称。</p><p>枚举值：</p><p>● Vidu；</p><p>● Kling：可灵；</p><p>● SA；</p><p>● VO；</p><p>● HY：混元；</p><p>● YT：优图；</p><p>示例值：Vidu</p>
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set <p>模型名称。</p><p>枚举值：</p><p>● Vidu；</p><p>● Kling：可灵；</p><p>● SA；</p><p>● VO；</p><p>● HY：混元；</p><p>● YT：优图；</p><p>示例值：Vidu</p>
     * @param Vendor <p>模型名称。</p><p>枚举值：</p><p>● Vidu；</p><p>● Kling：可灵；</p><p>● SA；</p><p>● VO；</p><p>● HY：混元；</p><p>● YT：优图；</p><p>示例值：Vidu</p>
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get <p>模型版本。</p><p>按照【厂商-版本号】</p><p>枚举值：</p><p>● 当ModelName为Vidu时，可选值[q2, q2-pro, q2-turbo]</p><p>● 当ModelName为Kling时，可选值[v1.6, v2.0, v2.1, v2.5 , v2.6]</p><p>● 当ModelName为SA时，可选值[SA2]</p><p>● 当ModelName为VO时，可选值[V3, V3.1, V3-Fast, V3.1-Fast]</p><p>● 当ModelName为HY时，默认选择：v1.5</p><p>● 当ModelName为YT时，默认值选择：v2.0</p> 
     * @return Model <p>模型版本。</p><p>按照【厂商-版本号】</p><p>枚举值：</p><p>● 当ModelName为Vidu时，可选值[q2, q2-pro, q2-turbo]</p><p>● 当ModelName为Kling时，可选值[v1.6, v2.0, v2.1, v2.5 , v2.6]</p><p>● 当ModelName为SA时，可选值[SA2]</p><p>● 当ModelName为VO时，可选值[V3, V3.1, V3-Fast, V3.1-Fast]</p><p>● 当ModelName为HY时，默认选择：v1.5</p><p>● 当ModelName为YT时，默认值选择：v2.0</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型版本。</p><p>按照【厂商-版本号】</p><p>枚举值：</p><p>● 当ModelName为Vidu时，可选值[q2, q2-pro, q2-turbo]</p><p>● 当ModelName为Kling时，可选值[v1.6, v2.0, v2.1, v2.5 , v2.6]</p><p>● 当ModelName为SA时，可选值[SA2]</p><p>● 当ModelName为VO时，可选值[V3, V3.1, V3-Fast, V3.1-Fast]</p><p>● 当ModelName为HY时，默认选择：v1.5</p><p>● 当ModelName为YT时，默认值选择：v2.0</p>
     * @param Model <p>模型版本。</p><p>按照【厂商-版本号】</p><p>枚举值：</p><p>● 当ModelName为Vidu时，可选值[q2, q2-pro, q2-turbo]</p><p>● 当ModelName为Kling时，可选值[v1.6, v2.0, v2.1, v2.5 , v2.6]</p><p>● 当ModelName为SA时，可选值[SA2]</p><p>● 当ModelName为VO时，可选值[V3, V3.1, V3-Fast, V3.1-Fast]</p><p>● 当ModelName为HY时，默认选择：v1.5</p><p>● 当ModelName为YT时，默认值选择：v2.0</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>模型参数Json-Format字符串</p> 
     * @return ModelParam <p>模型参数Json-Format字符串</p>
     */
    public String getModelParam() {
        return this.ModelParam;
    }

    /**
     * Set <p>模型参数Json-Format字符串</p>
     * @param ModelParam <p>模型参数Json-Format字符串</p>
     */
    public void setModelParam(String ModelParam) {
        this.ModelParam = ModelParam;
    }

    /**
     * Get <p>正向文本提示词。不能超过2000个字符</p><p>示例值：一只小猫在草地奔跑</p> 
     * @return Prompt <p>正向文本提示词。不能超过2000个字符</p><p>示例值：一只小猫在草地奔跑</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>正向文本提示词。不能超过2000个字符</p><p>示例值：一只小猫在草地奔跑</p>
     * @param Prompt <p>正向文本提示词。不能超过2000个字符</p><p>示例值：一只小猫在草地奔跑</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>为生成结果图添加显式水印标识的开关，默认为1。<br>1：添加。<br>0：不添加。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。<br>示例值：1</p> 
     * @return LogoAdd <p>为生成结果图添加显式水印标识的开关，默认为1。<br>1：添加。<br>0：不添加。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。<br>示例值：1</p>
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set <p>为生成结果图添加显式水印标识的开关，默认为1。<br>1：添加。<br>0：不添加。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。<br>示例值：1</p>
     * @param LogoAdd <p>为生成结果图添加显式水印标识的开关，默认为1。<br>1：添加。<br>0：不添加。<br>其他数值：默认按1处理。<br>建议您使用显著标识来提示结果图使用了 AI 绘画技术，是 AI 生成的图片。<br>示例值：1</p>
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get <p>标识内容设置。<br>默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p> 
     * @return LogoParam <p>标识内容设置。<br>默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set <p>标识内容设置。<br>默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
     * @param LogoParam <p>标识内容设置。<br>默认在生成结果图右下角添加“图片由 AI 生成”字样，您可根据自身需要替换为其他的标识图片。</p>
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    public SubmitAigcVideoJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitAigcVideoJobRequest(SubmitAigcVideoJobRequest source) {
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.ModelParam != null) {
            this.ModelParam = new String(source.ModelParam);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "ModelParam", this.ModelParam);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

