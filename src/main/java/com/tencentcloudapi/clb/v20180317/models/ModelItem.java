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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelItem extends AbstractModel {

    /**
    * <p>模型唯一标识, 用于实际访问</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>该模型当前支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>默认值：text</p>
    */
    @SerializedName("InputModalities")
    @Expose
    private String [] InputModalities;

    /**
    * <p>模型别名, 可以用于实际访问</p>
    */
    @SerializedName("ModelAlias")
    @Expose
    private String ModelAlias;

    /**
     * Get <p>模型唯一标识, 用于实际访问</p> 
     * @return ModelId <p>模型唯一标识, 用于实际访问</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>模型唯一标识, 用于实际访问</p>
     * @param ModelId <p>模型唯一标识, 用于实际访问</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>该模型当前支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>默认值：text</p> 
     * @return InputModalities <p>该模型当前支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>默认值：text</p>
     */
    public String [] getInputModalities() {
        return this.InputModalities;
    }

    /**
     * Set <p>该模型当前支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>默认值：text</p>
     * @param InputModalities <p>该模型当前支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>默认值：text</p>
     */
    public void setInputModalities(String [] InputModalities) {
        this.InputModalities = InputModalities;
    }

    /**
     * Get <p>模型别名, 可以用于实际访问</p> 
     * @return ModelAlias <p>模型别名, 可以用于实际访问</p>
     */
    public String getModelAlias() {
        return this.ModelAlias;
    }

    /**
     * Set <p>模型别名, 可以用于实际访问</p>
     * @param ModelAlias <p>模型别名, 可以用于实际访问</p>
     */
    public void setModelAlias(String ModelAlias) {
        this.ModelAlias = ModelAlias;
    }

    public ModelItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelItem(ModelItem source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.InputModalities != null) {
            this.InputModalities = new String[source.InputModalities.length];
            for (int i = 0; i < source.InputModalities.length; i++) {
                this.InputModalities[i] = new String(source.InputModalities[i]);
            }
        }
        if (source.ModelAlias != null) {
            this.ModelAlias = new String(source.ModelAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamArraySimple(map, prefix + "InputModalities.", this.InputModalities);
        this.setParamSimple(map, prefix + "ModelAlias", this.ModelAlias);

    }
}

