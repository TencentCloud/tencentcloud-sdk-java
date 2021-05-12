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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindCloudResourceRequest extends AbstractModel{

    /**
    * cmk的ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 云产品的唯一性标识符
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 资源/实例ID，由调用方根据自己的云产品特征来定义，以字符串形式做存储。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get cmk的ID 
     * @return KeyId cmk的ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set cmk的ID
     * @param KeyId cmk的ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 云产品的唯一性标识符 
     * @return ProductId 云产品的唯一性标识符
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 云产品的唯一性标识符
     * @param ProductId 云产品的唯一性标识符
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 资源/实例ID，由调用方根据自己的云产品特征来定义，以字符串形式做存储。 
     * @return ResourceId 资源/实例ID，由调用方根据自己的云产品特征来定义，以字符串形式做存储。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源/实例ID，由调用方根据自己的云产品特征来定义，以字符串形式做存储。
     * @param ResourceId 资源/实例ID，由调用方根据自己的云产品特征来定义，以字符串形式做存储。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public BindCloudResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindCloudResourceRequest(BindCloudResourceRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

