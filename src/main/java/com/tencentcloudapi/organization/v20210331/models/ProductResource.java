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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductResource extends AbstractModel {

    /**
    * 产品资源ID。
    */
    @SerializedName("ProductResourceId")
    @Expose
    private String ProductResourceId;

    /**
    * 资源六段式最后一节
    */
    @SerializedName("ResourceGrantLast")
    @Expose
    private String ResourceGrantLast;

    /**
     * Get 产品资源ID。 
     * @return ProductResourceId 产品资源ID。
     */
    public String getProductResourceId() {
        return this.ProductResourceId;
    }

    /**
     * Set 产品资源ID。
     * @param ProductResourceId 产品资源ID。
     */
    public void setProductResourceId(String ProductResourceId) {
        this.ProductResourceId = ProductResourceId;
    }

    /**
     * Get 资源六段式最后一节 
     * @return ResourceGrantLast 资源六段式最后一节
     * @deprecated
     */
    @Deprecated
    public String getResourceGrantLast() {
        return this.ResourceGrantLast;
    }

    /**
     * Set 资源六段式最后一节
     * @param ResourceGrantLast 资源六段式最后一节
     * @deprecated
     */
    @Deprecated
    public void setResourceGrantLast(String ResourceGrantLast) {
        this.ResourceGrantLast = ResourceGrantLast;
    }

    public ProductResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductResource(ProductResource source) {
        if (source.ProductResourceId != null) {
            this.ProductResourceId = new String(source.ProductResourceId);
        }
        if (source.ResourceGrantLast != null) {
            this.ResourceGrantLast = new String(source.ResourceGrantLast);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductResourceId", this.ProductResourceId);
        this.setParamSimple(map, prefix + "ResourceGrantLast", this.ResourceGrantLast);

    }
}

