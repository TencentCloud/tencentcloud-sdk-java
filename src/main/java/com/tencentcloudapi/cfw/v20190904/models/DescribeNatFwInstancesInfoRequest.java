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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatFwInstancesInfoRequest extends AbstractModel {

    /**
    * <p>获取实例列表过滤字段</p>
    */
    @SerializedName("Filter")
    @Expose
    private NatFwFilter [] Filter;

    /**
    * <p>第几页</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页长度</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>获取实例列表过滤字段</p> 
     * @return Filter <p>获取实例列表过滤字段</p>
     */
    public NatFwFilter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>获取实例列表过滤字段</p>
     * @param Filter <p>获取实例列表过滤字段</p>
     */
    public void setFilter(NatFwFilter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>第几页</p> 
     * @return Offset <p>第几页</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>第几页</p>
     * @param Offset <p>第几页</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页长度</p> 
     * @return Limit <p>每页长度</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页长度</p>
     * @param Limit <p>每页长度</p>
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

