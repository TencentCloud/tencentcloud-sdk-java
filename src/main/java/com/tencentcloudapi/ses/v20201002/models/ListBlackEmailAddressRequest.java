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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListBlackEmailAddressRequest extends AbstractModel{

    /**
    * 开始日期，格式为YYYY-MM-DD
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 结束日期，格式为YYYY-MM-DD
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 规范，配合Offset使用
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 规范，配合Limit使用，Limit最大取值为100
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 可以指定邮箱进行查询
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * 可以指定任务ID进行查询
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
     * Get 开始日期，格式为YYYY-MM-DD 
     * @return StartDate 开始日期，格式为YYYY-MM-DD
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 开始日期，格式为YYYY-MM-DD
     * @param StartDate 开始日期，格式为YYYY-MM-DD
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 结束日期，格式为YYYY-MM-DD 
     * @return EndDate 结束日期，格式为YYYY-MM-DD
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束日期，格式为YYYY-MM-DD
     * @param EndDate 结束日期，格式为YYYY-MM-DD
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 规范，配合Offset使用 
     * @return Limit 规范，配合Offset使用
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 规范，配合Offset使用
     * @param Limit 规范，配合Offset使用
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 规范，配合Limit使用，Limit最大取值为100 
     * @return Offset 规范，配合Limit使用，Limit最大取值为100
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 规范，配合Limit使用，Limit最大取值为100
     * @param Offset 规范，配合Limit使用，Limit最大取值为100
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 可以指定邮箱进行查询 
     * @return EmailAddress 可以指定邮箱进行查询
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 可以指定邮箱进行查询
     * @param EmailAddress 可以指定邮箱进行查询
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get 可以指定任务ID进行查询 
     * @return TaskID 可以指定任务ID进行查询
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 可以指定任务ID进行查询
     * @param TaskID 可以指定任务ID进行查询
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    public ListBlackEmailAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListBlackEmailAddressRequest(ListBlackEmailAddressRequest source) {
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.EmailAddress != null) {
            this.EmailAddress = new String(source.EmailAddress);
        }
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);

    }
}

