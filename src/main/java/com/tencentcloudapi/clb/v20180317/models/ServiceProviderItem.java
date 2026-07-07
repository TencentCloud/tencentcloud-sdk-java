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

public class ServiceProviderItem extends AbstractModel {

    /**
    * <p>服务提供商 ID</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * <p>用户自定义服务提供商名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceProviderName")
    @Expose
    private String ServiceProviderName;

    /**
    * <p>模型供应商</p>
    */
    @SerializedName("ModelProvider")
    @Expose
    private String ModelProvider;

    /**
    * <p>该byok实例下该模型可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul>
    */
    @SerializedName("InputModalities")
    @Expose
    private String [] InputModalities;

    /**
     * Get <p>服务提供商 ID</p> 
     * @return ServiceProviderId <p>服务提供商 ID</p>
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set <p>服务提供商 ID</p>
     * @param ServiceProviderId <p>服务提供商 ID</p>
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get <p>用户自定义服务提供商名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceProviderName <p>用户自定义服务提供商名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceProviderName() {
        return this.ServiceProviderName;
    }

    /**
     * Set <p>用户自定义服务提供商名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceProviderName <p>用户自定义服务提供商名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceProviderName(String ServiceProviderName) {
        this.ServiceProviderName = ServiceProviderName;
    }

    /**
     * Get <p>模型供应商</p> 
     * @return ModelProvider <p>模型供应商</p>
     */
    public String getModelProvider() {
        return this.ModelProvider;
    }

    /**
     * Set <p>模型供应商</p>
     * @param ModelProvider <p>模型供应商</p>
     */
    public void setModelProvider(String ModelProvider) {
        this.ModelProvider = ModelProvider;
    }

    /**
     * Get <p>该byok实例下该模型可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul> 
     * @return InputModalities <p>该byok实例下该模型可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul>
     */
    public String [] getInputModalities() {
        return this.InputModalities;
    }

    /**
     * Set <p>该byok实例下该模型可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul>
     * @param InputModalities <p>该byok实例下该模型可支持的输入多模态能力列表。</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul>
     */
    public void setInputModalities(String [] InputModalities) {
        this.InputModalities = InputModalities;
    }

    public ServiceProviderItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceProviderItem(ServiceProviderItem source) {
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.ServiceProviderName != null) {
            this.ServiceProviderName = new String(source.ServiceProviderName);
        }
        if (source.ModelProvider != null) {
            this.ModelProvider = new String(source.ModelProvider);
        }
        if (source.InputModalities != null) {
            this.InputModalities = new String[source.InputModalities.length];
            for (int i = 0; i < source.InputModalities.length; i++) {
                this.InputModalities[i] = new String(source.InputModalities[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamSimple(map, prefix + "ServiceProviderName", this.ServiceProviderName);
        this.setParamSimple(map, prefix + "ModelProvider", this.ModelProvider);
        this.setParamArraySimple(map, prefix + "InputModalities.", this.InputModalities);

    }
}

