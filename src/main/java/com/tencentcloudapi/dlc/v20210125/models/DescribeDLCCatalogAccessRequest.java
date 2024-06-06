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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDLCCatalogAccessRequest extends AbstractModel {

    /**
    * 显示条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 记录数量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get 显示条数 
     * @return Limit 显示条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 显示条数
     * @param Limit 显示条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 记录数量 
     * @return Offset 记录数量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录数量
     * @param Offset 记录数量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件 
     * @return Filter 过滤条件
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件
     * @param Filter 过滤条件
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeDLCCatalogAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDLCCatalogAccessRequest(DescribeDLCCatalogAccessRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

