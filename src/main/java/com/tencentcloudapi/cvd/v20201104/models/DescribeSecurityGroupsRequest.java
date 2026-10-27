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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityGroupsRequest extends AbstractModel {

    /**
    * <p>页号，从1开始</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页最大展示数量，默认20，最大100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>地域</p>
    */
    @SerializedName("SecurityGroupRegion")
    @Expose
    private String SecurityGroupRegion;

    /**
     * Get <p>页号，从1开始</p> 
     * @return PageNumber <p>页号，从1开始</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页号，从1开始</p>
     * @param PageNumber <p>页号，从1开始</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页最大展示数量，默认20，最大100</p> 
     * @return PageSize <p>每页最大展示数量，默认20，最大100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页最大展示数量，默认20，最大100</p>
     * @param PageSize <p>每页最大展示数量，默认20，最大100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>地域</p> 
     * @return SecurityGroupRegion <p>地域</p>
     */
    public String getSecurityGroupRegion() {
        return this.SecurityGroupRegion;
    }

    /**
     * Set <p>地域</p>
     * @param SecurityGroupRegion <p>地域</p>
     */
    public void setSecurityGroupRegion(String SecurityGroupRegion) {
        this.SecurityGroupRegion = SecurityGroupRegion;
    }

    public DescribeSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupsRequest(DescribeSecurityGroupsRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SecurityGroupRegion != null) {
            this.SecurityGroupRegion = new String(source.SecurityGroupRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SecurityGroupRegion", this.SecurityGroupRegion);

    }
}

