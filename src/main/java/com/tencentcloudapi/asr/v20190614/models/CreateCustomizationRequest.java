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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomizationRequest extends AbstractModel{

    /**
    * 自学习模型名称，需在1-20字符之间
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 文本文件的下载地址，服务会从该地址下载文件，目前仅支持腾讯云cos
    */
    @SerializedName("TextUrl")
    @Expose
    private String TextUrl;

    /**
    * 自学习模型类型，填写8k或者16k
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * 标签信息
    */
    @SerializedName("TagInfos")
    @Expose
    private String [] TagInfos;

    /**
     * Get 自学习模型名称，需在1-20字符之间 
     * @return ModelName 自学习模型名称，需在1-20字符之间
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 自学习模型名称，需在1-20字符之间
     * @param ModelName 自学习模型名称，需在1-20字符之间
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 文本文件的下载地址，服务会从该地址下载文件，目前仅支持腾讯云cos 
     * @return TextUrl 文本文件的下载地址，服务会从该地址下载文件，目前仅支持腾讯云cos
     */
    public String getTextUrl() {
        return this.TextUrl;
    }

    /**
     * Set 文本文件的下载地址，服务会从该地址下载文件，目前仅支持腾讯云cos
     * @param TextUrl 文本文件的下载地址，服务会从该地址下载文件，目前仅支持腾讯云cos
     */
    public void setTextUrl(String TextUrl) {
        this.TextUrl = TextUrl;
    }

    /**
     * Get 自学习模型类型，填写8k或者16k 
     * @return ModelType 自学习模型类型，填写8k或者16k
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set 自学习模型类型，填写8k或者16k
     * @param ModelType 自学习模型类型，填写8k或者16k
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get 标签信息 
     * @return TagInfos 标签信息
     */
    public String [] getTagInfos() {
        return this.TagInfos;
    }

    /**
     * Set 标签信息
     * @param TagInfos 标签信息
     */
    public void setTagInfos(String [] TagInfos) {
        this.TagInfos = TagInfos;
    }

    public CreateCustomizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomizationRequest(CreateCustomizationRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.TextUrl != null) {
            this.TextUrl = new String(source.TextUrl);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.TagInfos != null) {
            this.TagInfos = new String[source.TagInfos.length];
            for (int i = 0; i < source.TagInfos.length; i++) {
                this.TagInfos[i] = new String(source.TagInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "TextUrl", this.TextUrl);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamArraySimple(map, prefix + "TagInfos.", this.TagInfos);

    }
}

