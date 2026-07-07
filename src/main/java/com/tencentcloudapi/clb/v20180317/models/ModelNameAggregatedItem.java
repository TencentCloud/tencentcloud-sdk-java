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

public class ModelNameAggregatedItem extends AbstractModel {

    /**
    * <p>模型标识显示名称（优先使用 model_alias，否则使用 model_name）</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>关联的服务商列表</p>
    */
    @SerializedName("ServiceProviders")
    @Expose
    private ServiceProviderItem [] ServiceProviders;

    /**
    * <p>该模型最大可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul>
    */
    @SerializedName("InputModalitiesUnion")
    @Expose
    private String [] InputModalitiesUnion;

    /**
     * Get <p>模型标识显示名称（优先使用 model_alias，否则使用 model_name）</p> 
     * @return ModelName <p>模型标识显示名称（优先使用 model_alias，否则使用 model_name）</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型标识显示名称（优先使用 model_alias，否则使用 model_name）</p>
     * @param ModelName <p>模型标识显示名称（优先使用 model_alias，否则使用 model_name）</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>关联的服务商列表</p> 
     * @return ServiceProviders <p>关联的服务商列表</p>
     */
    public ServiceProviderItem [] getServiceProviders() {
        return this.ServiceProviders;
    }

    /**
     * Set <p>关联的服务商列表</p>
     * @param ServiceProviders <p>关联的服务商列表</p>
     */
    public void setServiceProviders(ServiceProviderItem [] ServiceProviders) {
        this.ServiceProviders = ServiceProviders;
    }

    /**
     * Get <p>该模型最大可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul> 
     * @return InputModalitiesUnion <p>该模型最大可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul>
     */
    public String [] getInputModalitiesUnion() {
        return this.InputModalitiesUnion;
    }

    /**
     * Set <p>该模型最大可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul>
     * @param InputModalitiesUnion <p>该模型最大可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul>
     */
    public void setInputModalitiesUnion(String [] InputModalitiesUnion) {
        this.InputModalitiesUnion = InputModalitiesUnion;
    }

    public ModelNameAggregatedItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelNameAggregatedItem(ModelNameAggregatedItem source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ServiceProviders != null) {
            this.ServiceProviders = new ServiceProviderItem[source.ServiceProviders.length];
            for (int i = 0; i < source.ServiceProviders.length; i++) {
                this.ServiceProviders[i] = new ServiceProviderItem(source.ServiceProviders[i]);
            }
        }
        if (source.InputModalitiesUnion != null) {
            this.InputModalitiesUnion = new String[source.InputModalitiesUnion.length];
            for (int i = 0; i < source.InputModalitiesUnion.length; i++) {
                this.InputModalitiesUnion[i] = new String(source.InputModalitiesUnion[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamArrayObj(map, prefix + "ServiceProviders.", this.ServiceProviders);
        this.setParamArraySimple(map, prefix + "InputModalitiesUnion.", this.InputModalitiesUnion);

    }
}

