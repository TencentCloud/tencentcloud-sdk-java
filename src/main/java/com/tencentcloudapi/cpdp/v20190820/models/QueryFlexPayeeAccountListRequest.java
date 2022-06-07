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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFlexPayeeAccountListRequest extends AbstractModel{

    /**
    * 账户属性信息
    */
    @SerializedName("PropertyInfo")
    @Expose
    private PayeeAccountPropertyInfo PropertyInfo;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页
    */
    @SerializedName("PageNumber")
    @Expose
    private Paging PageNumber;

    /**
     * Get 账户属性信息 
     * @return PropertyInfo 账户属性信息
     */
    public PayeeAccountPropertyInfo getPropertyInfo() {
        return this.PropertyInfo;
    }

    /**
     * Set 账户属性信息
     * @param PropertyInfo 账户属性信息
     */
    public void setPropertyInfo(PayeeAccountPropertyInfo PropertyInfo) {
        this.PropertyInfo = PropertyInfo;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页 
     * @return PageNumber 分页
     */
    public Paging getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页
     * @param PageNumber 分页
     */
    public void setPageNumber(Paging PageNumber) {
        this.PageNumber = PageNumber;
    }

    public QueryFlexPayeeAccountListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFlexPayeeAccountListRequest(QueryFlexPayeeAccountListRequest source) {
        if (source.PropertyInfo != null) {
            this.PropertyInfo = new PayeeAccountPropertyInfo(source.PropertyInfo);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Paging(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PropertyInfo.", this.PropertyInfo);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "PageNumber.", this.PageNumber);

    }
}

