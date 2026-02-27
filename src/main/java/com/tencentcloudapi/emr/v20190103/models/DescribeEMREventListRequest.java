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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEMREventListRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询事件的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询事件的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 事件触发的IP
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 事件受影响服务角色
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 事件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 事件列表的偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 事件列表的Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 查询事件的开始时间 
     * @return StartTime 查询事件的开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询事件的开始时间
     * @param StartTime 查询事件的开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询事件的结束时间 
     * @return EndTime 查询事件的结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询事件的结束时间
     * @param EndTime 查询事件的结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 事件触发的IP 
     * @return Host 事件触发的IP
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 事件触发的IP
     * @param Host 事件触发的IP
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 事件受影响服务角色 
     * @return Role 事件受影响服务角色
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 事件受影响服务角色
     * @param Role 事件受影响服务角色
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 事件名称 
     * @return Name 事件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 事件名称
     * @param Name 事件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 事件列表的偏移量 
     * @return Offset 事件列表的偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 事件列表的偏移量
     * @param Offset 事件列表的偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 事件列表的Limit 
     * @return Limit 事件列表的Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 事件列表的Limit
     * @param Limit 事件列表的Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeEMREventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEMREventListRequest(DescribeEMREventListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

