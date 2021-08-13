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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatFwInstancesInfoRequest extends AbstractModel{

    /**
    * 获取实例列表过滤字段
    */
    @SerializedName("Filter")
    @Expose
    private NatFwFilter [] Filter;

    /**
    * 第几页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页长度
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 获取实例列表过滤字段 
     * @return Filter 获取实例列表过滤字段
     */
    public NatFwFilter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 获取实例列表过滤字段
     * @param Filter 获取实例列表过滤字段
     */
    public void setFilter(NatFwFilter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 第几页 
     * @return Offset 第几页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 第几页
     * @param Offset 第几页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页长度 
     * @return Limit 每页长度
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页长度
     * @param Limit 每页长度
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeNatFwInstancesInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwInstancesInfoRequest(DescribeNatFwInstancesInfoRequest source) {
        if (source.Filter != null) {
            this.Filter = new NatFwFilter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new NatFwFilter(source.Filter[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

