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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowlogsRequest extends AbstractModel{

    /**
    * 实例ID，形如mssql-k8voqdlz
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页返回，每页返回的数目，取值为1-100，默认值为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页返回，页编号，默认值为第0页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例ID，形如mssql-k8voqdlz 
     * @return InstanceId 实例ID，形如mssql-k8voqdlz
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-k8voqdlz
     * @param InstanceId 实例ID，形如mssql-k8voqdlz
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 查询开始时间 
     * @return StartTime 查询开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间
     * @param StartTime 查询开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间 
     * @return EndTime 查询结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间
     * @param EndTime 查询结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页返回，每页返回的数目，取值为1-100，默认值为20 
     * @return Limit 分页返回，每页返回的数目，取值为1-100，默认值为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回，每页返回的数目，取值为1-100，默认值为20
     * @param Limit 分页返回，每页返回的数目，取值为1-100，默认值为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页返回，页编号，默认值为第0页 
     * @return Offset 分页返回，页编号，默认值为第0页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回，页编号，默认值为第0页
     * @param Offset 分页返回，页编号，默认值为第0页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

