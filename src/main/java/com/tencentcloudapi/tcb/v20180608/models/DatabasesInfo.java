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
    * <p>数据库唯一标识</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>状态。包含以下取值：</p><li>INITIALIZING：资源初始化中</li><li>RUNNING：运行中，可正常使用的状态</li><li>UNUSABLE：禁用，不可用</li><li>OVERDUE：资源过期</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>所属地域。<br>当前支持ap-shanghai</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>数据库唯一标识</p> 
     * @return InstanceId <p>数据库唯一标识</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>数据库唯一标识</p>
     * @param InstanceId <p>数据库唯一标识</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>状态。包含以下取值：</p><li>INITIALIZING：资源初始化中</li><li>RUNNING：运行中，可正常使用的状态</li><li>UNUSABLE：禁用，不可用</li><li>OVERDUE：资源过期</li> 
     * @return Status <p>状态。包含以下取值：</p><li>INITIALIZING：资源初始化中</li><li>RUNNING：运行中，可正常使用的状态</li><li>UNUSABLE：禁用，不可用</li><li>OVERDUE：资源过期</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态。包含以下取值：</p><li>INITIALIZING：资源初始化中</li><li>RUNNING：运行中，可正常使用的状态</li><li>UNUSABLE：禁用，不可用</li><li>OVERDUE：资源过期</li>
     * @param Status <p>状态。包含以下取值：</p><li>INITIALIZING：资源初始化中</li><li>RUNNING：运行中，可正常使用的状态</li><li>UNUSABLE：禁用，不可用</li><li>OVERDUE：资源过期</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>所属地域。<br>当前支持ap-shanghai</p> 
     * @return Region <p>所属地域。<br>当前支持ap-shanghai</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>所属地域。<br>当前支持ap-shanghai</p>
     * @param Region <p>所属地域。<br>当前支持ap-shanghai</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
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

