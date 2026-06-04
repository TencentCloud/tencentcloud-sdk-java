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
    * 模型提供商别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 模型提供商名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模型提供商类型。1-自有提供商, 2-自定义模型提供商, 3-第三方模型提供商
    */
    @SerializedName("ProviderType")
    @Expose
    private Long ProviderType;

    /**
     * Get 模型提供商别名 
     * @return Alias 模型提供商别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 模型提供商别名
     * @param Alias 模型提供商别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 模型提供商名称 
     * @return Name 模型提供商名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模型提供商名称
     * @param Name 模型提供商名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模型提供商类型。1-自有提供商, 2-自定义模型提供商, 3-第三方模型提供商 
     * @return ProviderType 模型提供商类型。1-自有提供商, 2-自定义模型提供商, 3-第三方模型提供商
     */
    public Long getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set 模型提供商类型。1-自有提供商, 2-自定义模型提供商, 3-第三方模型提供商
     * @param ProviderType 模型提供商类型。1-自有提供商, 2-自定义模型提供商, 3-第三方模型提供商
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

