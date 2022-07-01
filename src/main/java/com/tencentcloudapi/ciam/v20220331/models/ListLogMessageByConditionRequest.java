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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListLogMessageByConditionRequest extends AbstractModel{

    /**
    * 用户池ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * 分页数据
    */
    @SerializedName("Pageable")
    @Expose
    private Pageable Pageable;

    /**
    * 开始时间，时间戳精确到毫秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Key可选值为events

<li> **events** </li>	Values为["SIGNUP", "USER_UPDATE", "USER_DELETE", "USER_CREATE", "ACCOUNT_LINKING"] 中的一个或多个
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 用户池ID 
     * @return UserStoreId 用户池ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set 用户池ID
     * @param UserStoreId 用户池ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get 分页数据 
     * @return Pageable 分页数据
     */
    public Pageable getPageable() {
        return this.Pageable;
    }

    /**
     * Set 分页数据
     * @param Pageable 分页数据
     */
    public void setPageable(Pageable Pageable) {
        this.Pageable = Pageable;
    }

    /**
     * Get 开始时间，时间戳精确到毫秒 
     * @return StartTime 开始时间，时间戳精确到毫秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，时间戳精确到毫秒
     * @param StartTime 开始时间，时间戳精确到毫秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Key可选值为events

<li> **events** </li>	Values为["SIGNUP", "USER_UPDATE", "USER_DELETE", "USER_CREATE", "ACCOUNT_LINKING"] 中的一个或多个 
     * @return Filters Key可选值为events

<li> **events** </li>	Values为["SIGNUP", "USER_UPDATE", "USER_DELETE", "USER_CREATE", "ACCOUNT_LINKING"] 中的一个或多个
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Key可选值为events

<li> **events** </li>	Values为["SIGNUP", "USER_UPDATE", "USER_DELETE", "USER_CREATE", "ACCOUNT_LINKING"] 中的一个或多个
     * @param Filters Key可选值为events

<li> **events** </li>	Values为["SIGNUP", "USER_UPDATE", "USER_DELETE", "USER_CREATE", "ACCOUNT_LINKING"] 中的一个或多个
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ListLogMessageByConditionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListLogMessageByConditionRequest(ListLogMessageByConditionRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.Pageable != null) {
            this.Pageable = new Pageable(source.Pageable);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
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
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamObj(map, prefix + "Pageable.", this.Pageable);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

