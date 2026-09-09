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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyScenePhotoRequest extends AbstractModel {

    /**
    * <p>场景类型参数，如果场景无法细分请选用该大类的第一个子类，目前支持以下类型：<br><strong>经营场所照</strong><br>0101 门头照<br>0102 店内照<br>0103 流动经营照    </p><p><strong>车牌业务照</strong><br>0201 车牌</p>
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–2000 字符</p>
    */
    @SerializedName("ReasoningPrompt")
    @Expose
    private String ReasoningPrompt;

    /**
    * <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p>
    */
    @SerializedName("ReasoningConfig")
    @Expose
    private ReasoningConfig ReasoningConfig;

    /**
     * Get <p>场景类型参数，如果场景无法细分请选用该大类的第一个子类，目前支持以下类型：<br><strong>经营场所照</strong><br>0101 门头照<br>0102 店内照<br>0103 流动经营照    </p><p><strong>车牌业务照</strong><br>0201 车牌</p> 
     * @return Scene <p>场景类型参数，如果场景无法细分请选用该大类的第一个子类，目前支持以下类型：<br><strong>经营场所照</strong><br>0101 门头照<br>0102 店内照<br>0103 流动经营照    </p><p><strong>车牌业务照</strong><br>0201 车牌</p>
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set <p>场景类型参数，如果场景无法细分请选用该大类的第一个子类，目前支持以下类型：<br><strong>经营场所照</strong><br>0101 门头照<br>0102 店内照<br>0103 流动经营照    </p><p><strong>车牌业务照</strong><br>0201 车牌</p>
     * @param Scene <p>场景类型参数，如果场景无法细分请选用该大类的第一个子类，目前支持以下类型：<br><strong>经营场所照</strong><br>0101 门头照<br>0102 店内照<br>0103 流动经营照    </p><p><strong>车牌业务照</strong><br>0201 车牌</p>
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p> 
     * @return ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
     * @param ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p> 
     * @return ImageBase64 <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
     * @param ImageBase64 <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–2000 字符</p> 
     * @return ReasoningPrompt <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–2000 字符</p>
     */
    public String getReasoningPrompt() {
        return this.ReasoningPrompt;
    }

    /**
     * Set <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–2000 字符</p>
     * @param ReasoningPrompt <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–2000 字符</p>
     */
    public void setReasoningPrompt(String ReasoningPrompt) {
        this.ReasoningPrompt = ReasoningPrompt;
    }

    /**
     * Get <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p> 
     * @return ReasoningConfig <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p>
     */
    public ReasoningConfig getReasoningConfig() {
        return this.ReasoningConfig;
    }

    /**
     * Set <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p>
     * @param ReasoningConfig <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p>
     */
    public void setReasoningConfig(ReasoningConfig ReasoningConfig) {
        this.ReasoningConfig = ReasoningConfig;
    }

    public VerifyScenePhotoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyScenePhotoRequest(VerifyScenePhotoRequest source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ReasoningPrompt != null) {
            this.ReasoningPrompt = new String(source.ReasoningPrompt);
        }
        if (source.ReasoningConfig != null) {
            this.ReasoningConfig = new ReasoningConfig(source.ReasoningConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ReasoningPrompt", this.ReasoningPrompt);
        this.setParamObj(map, prefix + "ReasoningConfig.", this.ReasoningConfig);

    }
}

