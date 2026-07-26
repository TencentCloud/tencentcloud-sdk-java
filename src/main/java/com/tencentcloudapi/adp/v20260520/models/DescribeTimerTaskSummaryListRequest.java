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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimerTaskSummaryListRequest extends AbstractModel {

    /**
    * 查询条件
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询关键字
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 空间ID
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>子用户Uin</p>
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * <p>主用户Uin</p>
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
     * Get 查询条件 
     * @return FilterList 查询条件
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set 查询条件
     * @param FilterList 查询条件
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页大小 
     * @return PageSize 页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小
     * @param PageSize 页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询关键字 
     * @return Query 查询关键字
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询关键字
     * @param Query 查询关键字
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 空间ID 
     * @return SpaceId 空间ID
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 空间ID
     * @param SpaceId 空间ID
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>子用户Uin</p> 
     * @return LoginSubAccountUin <p>子用户Uin</p>
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set <p>子用户Uin</p>
     * @param LoginSubAccountUin <p>子用户Uin</p>
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get <p>主用户Uin</p> 
     * @return LoginUin <p>主用户Uin</p>
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set <p>主用户Uin</p>
     * @param LoginUin <p>主用户Uin</p>
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    public DescribeTimerTaskSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimerTaskSummaryListRequest(DescribeTimerTaskSummaryListRequest source) {
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);

    }
}

