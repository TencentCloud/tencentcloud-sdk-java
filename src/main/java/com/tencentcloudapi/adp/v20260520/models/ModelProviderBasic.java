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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelProviderBasic extends AbstractModel {

    /**
    * <p>模型提供商别名</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>模型提供商名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>模型提供商类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_PROVIDER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_PROVIDER_TYPE_SELF</td><td>1</td><td>自有提供商</td></tr><tr><td>MODEL_PROVIDER_TYPE_CUSTOM</td><td>2</td><td>自定义模型提供商</td></tr><tr><td>MODEL_PROVIDER_TYPE_THIRD</td><td>3</td><td>第三方模型提供商</td></tr></table>
    */
    @SerializedName("ProviderType")
    @Expose
    private Long ProviderType;

    /**
     * Get <p>模型提供商别名</p> 
     * @return Alias <p>模型提供商别名</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>模型提供商别名</p>
     * @param Alias <p>模型提供商别名</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>模型提供商名称</p> 
     * @return Name <p>模型提供商名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模型提供商名称</p>
     * @param Name <p>模型提供商名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>模型提供商类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_PROVIDER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_PROVIDER_TYPE_SELF</td><td>1</td><td>自有提供商</td></tr><tr><td>MODEL_PROVIDER_TYPE_CUSTOM</td><td>2</td><td>自定义模型提供商</td></tr><tr><td>MODEL_PROVIDER_TYPE_THIRD</td><td>3</td><td>第三方模型提供商</td></tr></table> 
     * @return ProviderType <p>模型提供商类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_PROVIDER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_PROVIDER_TYPE_SELF</td><td>1</td><td>自有提供商</td></tr><tr><td>MODEL_PROVIDER_TYPE_CUSTOM</td><td>2</td><td>自定义模型提供商</td></tr><tr><td>MODEL_PROVIDER_TYPE_THIRD</td><td>3</td><td>第三方模型提供商</td></tr></table>
     */
    public Long getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set <p>模型提供商类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_PROVIDER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_PROVIDER_TYPE_SELF</td><td>1</td><td>自有提供商</td></tr><tr><td>MODEL_PROVIDER_TYPE_CUSTOM</td><td>2</td><td>自定义模型提供商</td></tr><tr><td>MODEL_PROVIDER_TYPE_THIRD</td><td>3</td><td>第三方模型提供商</td></tr></table>
     * @param ProviderType <p>模型提供商类型</p><table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODEL_PROVIDER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>MODEL_PROVIDER_TYPE_SELF</td><td>1</td><td>自有提供商</td></tr><tr><td>MODEL_PROVIDER_TYPE_CUSTOM</td><td>2</td><td>自定义模型提供商</td></tr><tr><td>MODEL_PROVIDER_TYPE_THIRD</td><td>3</td><td>第三方模型提供商</td></tr></table>
     */
    public void setProviderType(Long ProviderType) {
        this.ProviderType = ProviderType;
    }

    public ModelProviderBasic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelProviderBasic(ModelProviderBasic source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProviderType != null) {
            this.ProviderType = new Long(source.ProviderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProviderType", this.ProviderType);

    }
}

