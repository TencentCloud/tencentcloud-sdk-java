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

public class ModifyCustomizationRequest extends AbstractModel{

    /**
    * 要修改的模型ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 要修改的模型名称，长度需在1-20个字符之间
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 要修改的模型类型，为8k或者16k
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * 要修改的模型语料的下载地址，目前仅支持腾讯云cos
    */
    @SerializedName("TextUrl")
    @Expose
    private String TextUrl;

    /**
     * Get 要修改的模型ID 
     * @return ModelId 要修改的模型ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 要修改的模型ID
     * @param ModelId 要修改的模型ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 要修改的模型名称，长度需在1-20个字符之间 
     * @return ModelName 要修改的模型名称，长度需在1-20个字符之间
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 要修改的模型名称，长度需在1-20个字符之间
     * @param ModelName 要修改的模型名称，长度需在1-20个字符之间
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 要修改的模型类型，为8k或者16k 
     * @return ModelType 要修改的模型类型，为8k或者16k
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set 要修改的模型类型，为8k或者16k
     * @param ModelType 要修改的模型类型，为8k或者16k
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get 要修改的模型语料的下载地址，目前仅支持腾讯云cos 
     * @return TextUrl 要修改的模型语料的下载地址，目前仅支持腾讯云cos
     */
    public String getTextUrl() {
        return this.TextUrl;
    }

    /**
     * Set 要修改的模型语料的下载地址，目前仅支持腾讯云cos
     * @param TextUrl 要修改的模型语料的下载地址，目前仅支持腾讯云cos
     */
    public void setTextUrl(String TextUrl) {
        this.TextUrl = TextUrl;
    }

    public ModifyCustomizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomizationRequest(ModifyCustomizationRequest source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.TextUrl != null) {
            this.TextUrl = new String(source.TextUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "TextUrl", this.TextUrl);

    }
}

