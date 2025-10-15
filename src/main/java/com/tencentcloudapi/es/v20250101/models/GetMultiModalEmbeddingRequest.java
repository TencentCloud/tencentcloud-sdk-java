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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetMultiModalEmbeddingRequest extends AbstractModel {

    /**
    * 模型名称，支持WeCLIPv2-Base和WeCLIPv2-Large
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 需进行向量化的文本集，一次输入限10条，单条文本长度限72
    */
    @SerializedName("Texts")
    @Expose
    private String [] Texts;

    /**
    * 输入图片，base64编码格式，一次输入限制8个，单张图片限制1M
    */
    @SerializedName("ImageData")
    @Expose
    private String [] ImageData;

    /**
    * 输入图片url，一次输入限8个，推荐cos地址，速度更快
    */
    @SerializedName("ImageUrl")
    @Expose
    private String [] ImageUrl;

    /**
     * Get 模型名称，支持WeCLIPv2-Base和WeCLIPv2-Large 
     * @return ModelName 模型名称，支持WeCLIPv2-Base和WeCLIPv2-Large
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称，支持WeCLIPv2-Base和WeCLIPv2-Large
     * @param ModelName 模型名称，支持WeCLIPv2-Base和WeCLIPv2-Large
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 需进行向量化的文本集，一次输入限10条，单条文本长度限72 
     * @return Texts 需进行向量化的文本集，一次输入限10条，单条文本长度限72
     */
    public String [] getTexts() {
        return this.Texts;
    }

    /**
     * Set 需进行向量化的文本集，一次输入限10条，单条文本长度限72
     * @param Texts 需进行向量化的文本集，一次输入限10条，单条文本长度限72
     */
    public void setTexts(String [] Texts) {
        this.Texts = Texts;
    }

    /**
     * Get 输入图片，base64编码格式，一次输入限制8个，单张图片限制1M 
     * @return ImageData 输入图片，base64编码格式，一次输入限制8个，单张图片限制1M
     */
    public String [] getImageData() {
        return this.ImageData;
    }

    /**
     * Set 输入图片，base64编码格式，一次输入限制8个，单张图片限制1M
     * @param ImageData 输入图片，base64编码格式，一次输入限制8个，单张图片限制1M
     */
    public void setImageData(String [] ImageData) {
        this.ImageData = ImageData;
    }

    /**
     * Get 输入图片url，一次输入限8个，推荐cos地址，速度更快 
     * @return ImageUrl 输入图片url，一次输入限8个，推荐cos地址，速度更快
     */
    public String [] getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 输入图片url，一次输入限8个，推荐cos地址，速度更快
     * @param ImageUrl 输入图片url，一次输入限8个，推荐cos地址，速度更快
     */
    public void setImageUrl(String [] ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public GetMultiModalEmbeddingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetMultiModalEmbeddingRequest(GetMultiModalEmbeddingRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Texts != null) {
            this.Texts = new String[source.Texts.length];
            for (int i = 0; i < source.Texts.length; i++) {
                this.Texts[i] = new String(source.Texts[i]);
            }
        }
        if (source.ImageData != null) {
            this.ImageData = new String[source.ImageData.length];
            for (int i = 0; i < source.ImageData.length; i++) {
                this.ImageData[i] = new String(source.ImageData[i]);
            }
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String[source.ImageUrl.length];
            for (int i = 0; i < source.ImageUrl.length; i++) {
                this.ImageUrl[i] = new String(source.ImageUrl[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamArraySimple(map, prefix + "Texts.", this.Texts);
        this.setParamArraySimple(map, prefix + "ImageData.", this.ImageData);
        this.setParamArraySimple(map, prefix + "ImageUrl.", this.ImageUrl);

    }
}

