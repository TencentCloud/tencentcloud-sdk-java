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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabasesInfo extends AbstractModel {

    /**
    * 数据库唯一标识
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 状态。包含以下取值：
<li>INITIALIZING：资源初始化中</li>
<li>RUNNING：运行中，可正常使用的状态</li>
<li>UNUSABLE：禁用，不可用</li>
<li>OVERDUE：资源过期</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 所属地域。
当前支持ap-shanghai
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 数据库唯一标识 
     * @return InstanceId 数据库唯一标识
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据库唯一标识
     * @param InstanceId 数据库唯一标识
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 状态。包含以下取值：
<li>INITIALIZING：资源初始化中</li>
<li>RUNNING：运行中，可正常使用的状态</li>
<li>UNUSABLE：禁用，不可用</li>
<li>OVERDUE：资源过期</li> 
     * @return Status 状态。包含以下取值：
<li>INITIALIZING：资源初始化中</li>
<li>RUNNING：运行中，可正常使用的状态</li>
<li>UNUSABLE：禁用，不可用</li>
<li>OVERDUE：资源过期</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。包含以下取值：
<li>INITIALIZING：资源初始化中</li>
<li>RUNNING：运行中，可正常使用的状态</li>
<li>UNUSABLE：禁用，不可用</li>
<li>OVERDUE：资源过期</li>
     * @param Status 状态。包含以下取值：
<li>INITIALIZING：资源初始化中</li>
<li>RUNNING：运行中，可正常使用的状态</li>
<li>UNUSABLE：禁用，不可用</li>
<li>OVERDUE：资源过期</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 所属地域。
当前支持ap-shanghai 
     * @return Region 所属地域。
当前支持ap-shanghai
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所属地域。
当前支持ap-shanghai
     * @param Region 所属地域。
当前支持ap-shanghai
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DatabasesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabasesInfo(DatabasesInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

