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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostMetricConfig extends AbstractModel {

    /**
    * 采集配置 id
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 采集配置名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 采集频率,单位ms
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 采集项.
    */
    @SerializedName("HostMetricItems")
    @Expose
    private HostMetricItem [] HostMetricItems;

    /**
    * 机器组 id 列表
    */
    @SerializedName("MachineGroupIds")
    @Expose
    private String [] MachineGroupIds;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 采集配置 id 
     * @return ConfigId 采集配置 id
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 采集配置 id
     * @param ConfigId 采集配置 id
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 采集配置名称 
     * @return Name 采集配置名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 采集配置名称
     * @param Name 采集配置名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 采集频率,单位ms 
     * @return Interval 采集频率,单位ms
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 采集频率,单位ms
     * @param Interval 采集频率,单位ms
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 采集项. 
     * @return HostMetricItems 采集项.
     */
    public HostMetricItem [] getHostMetricItems() {
        return this.HostMetricItems;
    }

    /**
     * Set 采集项.
     * @param HostMetricItems 采集项.
     */
    public void setHostMetricItems(HostMetricItem [] HostMetricItems) {
        this.HostMetricItems = HostMetricItems;
    }

    /**
     * Get 机器组 id 列表 
     * @return MachineGroupIds 机器组 id 列表
     */
    public String [] getMachineGroupIds() {
        return this.MachineGroupIds;
    }

    /**
     * Set 机器组 id 列表
     * @param MachineGroupIds 机器组 id 列表
     */
    public void setMachineGroupIds(String [] MachineGroupIds) {
        this.MachineGroupIds = MachineGroupIds;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return UpdateTime 修改时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public HostMetricConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostMetricConfig(HostMetricConfig source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.HostMetricItems != null) {
            this.HostMetricItems = new HostMetricItem[source.HostMetricItems.length];
            for (int i = 0; i < source.HostMetricItems.length; i++) {
                this.HostMetricItems[i] = new HostMetricItem(source.HostMetricItems[i]);
            }
        }
        if (source.MachineGroupIds != null) {
            this.MachineGroupIds = new String[source.MachineGroupIds.length];
            for (int i = 0; i < source.MachineGroupIds.length; i++) {
                this.MachineGroupIds[i] = new String(source.MachineGroupIds[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "HostMetricItems.", this.HostMetricItems);
        this.setParamArraySimple(map, prefix + "MachineGroupIds.", this.MachineGroupIds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

