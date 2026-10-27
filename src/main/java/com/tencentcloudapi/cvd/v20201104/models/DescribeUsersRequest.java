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

public class DescribeUsersRequest extends AbstractModel {

    /**
    * <p>搜索关键字。</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>页面编号。从1开始</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>页面大小。默认20，不超过100。</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>部门ID。</p>
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
     * Get <p>搜索关键字。</p> 
     * @return Keyword <p>搜索关键字。</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>搜索关键字。</p>
     * @param Keyword <p>搜索关键字。</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>页面编号。从1开始</p> 
     * @return PageNumber <p>页面编号。从1开始</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页面编号。从1开始</p>
     * @param PageNumber <p>页面编号。从1开始</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>页面大小。默认20，不超过100。</p> 
     * @return PageSize <p>页面大小。默认20，不超过100。</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>页面大小。默认20，不超过100。</p>
     * @param PageSize <p>页面大小。默认20，不超过100。</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>部门ID。</p> 
     * @return DepartmentId <p>部门ID。</p>
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set <p>部门ID。</p>
     * @param DepartmentId <p>部门ID。</p>
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    public DescribeUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsersRequest(DescribeUsersRequest source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);

    }
}

