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

public class DescribeXEventsRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 事件类型，slow-慢SQL事件，blocked-阻塞事件，deadlock-死锁事件
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 扩展文件生成开始时间(yyyy-MM-dd HH:mm:ss)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 扩展文件生成结束时间(yyyy-MM-dd HH:mm:ss)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页返回，页编号，默认值为第0页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回，每页返回的数目，取值为1~100，默认值为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 事件类型，slow-慢SQL事件，blocked-阻塞事件，deadlock-死锁事件 
     * @return EventType 事件类型，slow-慢SQL事件，blocked-阻塞事件，deadlock-死锁事件
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型，slow-慢SQL事件，blocked-阻塞事件，deadlock-死锁事件
     * @param EventType 事件类型，slow-慢SQL事件，blocked-阻塞事件，deadlock-死锁事件
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 扩展文件生成开始时间(yyyy-MM-dd HH:mm:ss) 
     * @return StartTime 扩展文件生成开始时间(yyyy-MM-dd HH:mm:ss)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 扩展文件生成开始时间(yyyy-MM-dd HH:mm:ss)
     * @param StartTime 扩展文件生成开始时间(yyyy-MM-dd HH:mm:ss)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 扩展文件生成结束时间(yyyy-MM-dd HH:mm:ss) 
     * @return EndTime 扩展文件生成结束时间(yyyy-MM-dd HH:mm:ss)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 扩展文件生成结束时间(yyyy-MM-dd HH:mm:ss)
     * @param EndTime 扩展文件生成结束时间(yyyy-MM-dd HH:mm:ss)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 分页返回，每页返回的数目，取值为1~100，默认值为20 
     * @return Limit 分页返回，每页返回的数目，取值为1~100，默认值为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回，每页返回的数目，取值为1~100，默认值为20
     * @param Limit 分页返回，每页返回的数目，取值为1~100，默认值为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeXEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeXEventsRequest(DescribeXEventsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

