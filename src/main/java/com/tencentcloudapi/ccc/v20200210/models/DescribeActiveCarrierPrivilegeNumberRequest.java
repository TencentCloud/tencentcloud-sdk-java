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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeActiveCarrierPrivilegeNumberRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 默认0
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 默认10，最大100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 筛选条件 Name支持PhoneNumber(按号码模糊查找)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 实例Id 
     * @return SdkAppId 实例Id
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 实例Id
     * @param SdkAppId 实例Id
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 默认0 
     * @return PageNumber 默认0
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 默认0
     * @param PageNumber 默认0
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 默认10，最大100 
     * @return PageSize 默认10，最大100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 默认10，最大100
     * @param PageSize 默认10，最大100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 筛选条件 Name支持PhoneNumber(按号码模糊查找) 
     * @return Filters 筛选条件 Name支持PhoneNumber(按号码模糊查找)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件 Name支持PhoneNumber(按号码模糊查找)
     * @param Filters 筛选条件 Name支持PhoneNumber(按号码模糊查找)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeActiveCarrierPrivilegeNumberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeActiveCarrierPrivilegeNumberRequest(DescribeActiveCarrierPrivilegeNumberRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

