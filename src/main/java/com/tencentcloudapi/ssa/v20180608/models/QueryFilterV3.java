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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFilterV3 extends AbstractModel{

    /**
    * 过滤条件
    */
    @SerializedName("Filter")
    @Expose
    private QueryFilter Filter;

    /**
    * 有无子条件
    */
    @SerializedName("HasSub")
    @Expose
    private Boolean HasSub;

    /**
    * 查询条件
    */
    @SerializedName("SubFilters")
    @Expose
    private QueryFilter [] SubFilters;

    /**
    * 逻辑操作(只支持32位)
    */
    @SerializedName("Logic")
    @Expose
    private Long Logic;

    /**
     * Get 过滤条件 
     * @return Filter 过滤条件
     */
    public QueryFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件
     * @param Filter 过滤条件
     */
    public void setFilter(QueryFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 有无子条件 
     * @return HasSub 有无子条件
     */
    public Boolean getHasSub() {
        return this.HasSub;
    }

    /**
     * Set 有无子条件
     * @param HasSub 有无子条件
     */
    public void setHasSub(Boolean HasSub) {
        this.HasSub = HasSub;
    }

    /**
     * Get 查询条件 
     * @return SubFilters 查询条件
     */
    public QueryFilter [] getSubFilters() {
        return this.SubFilters;
    }

    /**
     * Set 查询条件
     * @param SubFilters 查询条件
     */
    public void setSubFilters(QueryFilter [] SubFilters) {
        this.SubFilters = SubFilters;
    }

    /**
     * Get 逻辑操作(只支持32位) 
     * @return Logic 逻辑操作(只支持32位)
     */
    public Long getLogic() {
        return this.Logic;
    }

    /**
     * Set 逻辑操作(只支持32位)
     * @param Logic 逻辑操作(只支持32位)
     */
    public void setLogic(Long Logic) {
        this.Logic = Logic;
    }

    public QueryFilterV3() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFilterV3(QueryFilterV3 source) {
        if (source.Filter != null) {
            this.Filter = new QueryFilter(source.Filter);
        }
        if (source.HasSub != null) {
            this.HasSub = new Boolean(source.HasSub);
        }
        if (source.SubFilters != null) {
            this.SubFilters = new QueryFilter[source.SubFilters.length];
            for (int i = 0; i < source.SubFilters.length; i++) {
                this.SubFilters[i] = new QueryFilter(source.SubFilters[i]);
            }
        }
        if (source.Logic != null) {
            this.Logic = new Long(source.Logic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "HasSub", this.HasSub);
        this.setParamArrayObj(map, prefix + "SubFilters.", this.SubFilters);
        this.setParamSimple(map, prefix + "Logic", this.Logic);

    }
}

