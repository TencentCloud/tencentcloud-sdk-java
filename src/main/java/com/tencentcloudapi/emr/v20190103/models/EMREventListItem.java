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

public class EMREventListItem extends AbstractModel {

    /**
    * 事件受影响ip
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 事件受影响的服务角色
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
    * 事件告警详情
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 事件发生时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 事件受影响ip 
     * @return Host 事件受影响ip
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 事件受影响ip
     * @param Host 事件受影响ip
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 事件受影响的服务角色 
     * @return Role 事件受影响的服务角色
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 事件受影响的服务角色
     * @param Role 事件受影响的服务角色
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
     * Get 事件告警详情 
     * @return Detail 事件告警详情
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 事件告警详情
     * @param Detail 事件告警详情
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 事件发生时间 
     * @return CreateTime 事件发生时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 事件发生时间
     * @param CreateTime 事件发生时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public EMREventListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EMREventListItem(EMREventListItem source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

