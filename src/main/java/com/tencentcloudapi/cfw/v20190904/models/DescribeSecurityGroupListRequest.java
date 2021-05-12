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

public class DescribeSecurityGroupListRequest extends AbstractModel{

    /**
    * 0: 出站规则，1：入站规则
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 地域代码（例: ap-guangzhou),支持腾讯云全部地域
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 搜索值
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * 每页条数，默认为10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移值，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 状态，'': 全部，'0'：筛选停用规则，'1'：筛选启用规则
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 0: 不过滤，1：过滤掉正常规则，保留下发异常规则
    */
    @SerializedName("Filter")
    @Expose
    private Long Filter;

    /**
     * Get 0: 出站规则，1：入站规则 
     * @return Direction 0: 出站规则，1：入站规则
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 0: 出站规则，1：入站规则
     * @param Direction 0: 出站规则，1：入站规则
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 地域代码（例: ap-guangzhou),支持腾讯云全部地域 
     * @return Area 地域代码（例: ap-guangzhou),支持腾讯云全部地域
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域代码（例: ap-guangzhou),支持腾讯云全部地域
     * @param Area 地域代码（例: ap-guangzhou),支持腾讯云全部地域
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 搜索值 
     * @return SearchValue 搜索值
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 搜索值
     * @param SearchValue 搜索值
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get 每页条数，默认为10 
     * @return Limit 每页条数，默认为10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数，默认为10
     * @param Limit 每页条数，默认为10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移值，默认为0 
     * @return Offset 偏移值，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移值，默认为0
     * @param Offset 偏移值，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 状态，'': 全部，'0'：筛选停用规则，'1'：筛选启用规则 
     * @return Status 状态，'': 全部，'0'：筛选停用规则，'1'：筛选启用规则
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，'': 全部，'0'：筛选停用规则，'1'：筛选启用规则
     * @param Status 状态，'': 全部，'0'：筛选停用规则，'1'：筛选启用规则
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 0: 不过滤，1：过滤掉正常规则，保留下发异常规则 
     * @return Filter 0: 不过滤，1：过滤掉正常规则，保留下发异常规则
     */
    public Long getFilter() {
        return this.Filter;
    }

    /**
     * Set 0: 不过滤，1：过滤掉正常规则，保留下发异常规则
     * @param Filter 0: 不过滤，1：过滤掉正常规则，保留下发异常规则
     */
    public void setFilter(Long Filter) {
        this.Filter = Filter;
    }

    public DescribeSecurityGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupListRequest(DescribeSecurityGroupListRequest source) {
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Filter != null) {
            this.Filter = new Long(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Filter", this.Filter);

    }
}

