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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchConditionInstance extends AbstractModel{

    /**
    * 执行空间 "DRY_RUN"
    */
    @SerializedName("ExecutionSpace")
    @Expose
    private Long ExecutionSpace;

    /**
    * 产品名称，可选
    */
    @SerializedName("ProductName")
    @Expose
    private Long ProductName;

    /**
    * 资源组
    */
    @SerializedName("ResourceGroup")
    @Expose
    private Long ResourceGroup;

    /**
     * Get 执行空间 "DRY_RUN" 
     * @return ExecutionSpace 执行空间 "DRY_RUN"
     */
    public Long getExecutionSpace() {
        return this.ExecutionSpace;
    }

    /**
     * Set 执行空间 "DRY_RUN"
     * @param ExecutionSpace 执行空间 "DRY_RUN"
     */
    public void setExecutionSpace(Long ExecutionSpace) {
        this.ExecutionSpace = ExecutionSpace;
    }

    /**
     * Get 产品名称，可选 
     * @return ProductName 产品名称，可选
     */
    public Long getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称，可选
     * @param ProductName 产品名称，可选
     */
    public void setProductName(Long ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 资源组 
     * @return ResourceGroup 资源组
     */
    public Long getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 资源组
     * @param ResourceGroup 资源组
     */
    public void setResourceGroup(Long ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    public SearchConditionInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchConditionInstance(SearchConditionInstance source) {
        if (source.ExecutionSpace != null) {
            this.ExecutionSpace = new Long(source.ExecutionSpace);
        }
        if (source.ProductName != null) {
            this.ProductName = new Long(source.ProductName);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new Long(source.ResourceGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionSpace", this.ExecutionSpace);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);

    }
}

