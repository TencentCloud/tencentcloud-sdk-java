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

public class DescribeTimerTaskRunLogListRequest extends AbstractModel {

    /**
    * 工作空间ID
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 定时任务ID，必须按任务维度查询
    */
    @SerializedName("TimerId")
    @Expose
    private String TimerId;

    /**
    * 过滤条件，支持: Status(执行状态，值为枚举int); Unread(仅未读，值为"true"/"false")
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

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
    * 页码，从0开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数目，最大100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 工作空间ID 
     * @return SpaceId 工作空间ID
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 工作空间ID
     * @param SpaceId 工作空间ID
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 定时任务ID，必须按任务维度查询 
     * @return TimerId 定时任务ID，必须按任务维度查询
     */
    public String getTimerId() {
        return this.TimerId;
    }

    /**
     * Set 定时任务ID，必须按任务维度查询
     * @param TimerId 定时任务ID，必须按任务维度查询
     */
    public void setTimerId(String TimerId) {
        this.TimerId = TimerId;
    }

    /**
     * Get 过滤条件，支持: Status(执行状态，值为枚举int); Unread(仅未读，值为"true"/"false") 
     * @return FilterList 过滤条件，支持: Status(执行状态，值为枚举int); Unread(仅未读，值为"true"/"false")
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set 过滤条件，支持: Status(执行状态，值为枚举int); Unread(仅未读，值为"true"/"false")
     * @param FilterList 过滤条件，支持: Status(执行状态，值为枚举int); Unread(仅未读，值为"true"/"false")
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
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

    /**
     * Get 页码，从0开始 
     * @return PageNumber 页码，从0开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，从0开始
     * @param PageNumber 页码，从0开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数目，最大100 
     * @return PageSize 每页数目，最大100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数目，最大100
     * @param PageSize 每页数目，最大100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeTimerTaskRunLogListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimerTaskRunLogListRequest(DescribeTimerTaskRunLogListRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.TimerId != null) {
            this.TimerId = new String(source.TimerId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "TimerId", this.TimerId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

