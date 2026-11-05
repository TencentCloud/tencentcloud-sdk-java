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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStrategiesRequest extends AbstractModel {

    /**
    * <p>产品类型</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>执行区域：pre是前区，post 是后区</p>
    */
    @SerializedName("ExecArea")
    @Expose
    private String ExecArea;

    /**
    * <p>筛选条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * <p>条数限制</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>产品类型</p> 
     * @return Product <p>产品类型</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>产品类型</p>
     * @param Product <p>产品类型</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>执行区域：pre是前区，post 是后区</p> 
     * @return ExecArea <p>执行区域：pre是前区，post 是后区</p>
     */
    public String getExecArea() {
        return this.ExecArea;
    }

    /**
     * Set <p>执行区域：pre是前区，post 是后区</p>
     * @param ExecArea <p>执行区域：pre是前区，post 是后区</p>
     */
    public void setExecArea(String ExecArea) {
        this.ExecArea = ExecArea;
    }

    /**
     * Get <p>筛选条件</p> 
     * @return Filters <p>筛选条件</p>
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件</p>
     * @param Filters <p>筛选条件</p>
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>条数限制</p> 
     * @return Limit <p>条数限制</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>条数限制</p>
     * @param Limit <p>条数限制</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeStrategiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStrategiesRequest(DescribeStrategiesRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ExecArea != null) {
            this.ExecArea = new String(source.ExecArea);
        }
        if (source.Filters != null) {
            this.Filters = new CommonFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CommonFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ExecArea", this.ExecArea);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

