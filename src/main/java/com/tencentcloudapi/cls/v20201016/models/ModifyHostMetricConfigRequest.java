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

public class ModifyHostMetricConfigRequest extends AbstractModel {

    /**
    * 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 采集配置id
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 名称。

- 长度不超过 64字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 机器组id列表。最多支持100个机器组。
    */
    @SerializedName("MachineGroupIds")
    @Expose
    private String [] MachineGroupIds;

    /**
    * 采集频率。单位:ms。 最小支持5000ms
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 采集项。支持"cpu"，"mem"，"net"，"disk"，"system"。**目前仅支持:所有采集项都需配置**。
- cpu：CPU
- mem：内存
- net：网络
- disk：磁盘
- system：系统

    */
    @SerializedName("HostMetricItems")
    @Expose
    private HostMetricItem [] HostMetricItems;

    /**
     * Get 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题 
     * @return TopicId 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
     * @param TopicId 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 采集配置id 
     * @return ConfigId 采集配置id
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 采集配置id
     * @param ConfigId 采集配置id
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 名称。

- 长度不超过 64字符。 
     * @return Name 名称。

- 长度不超过 64字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称。

- 长度不超过 64字符。
     * @param Name 名称。

- 长度不超过 64字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 机器组id列表。最多支持100个机器组。 
     * @return MachineGroupIds 机器组id列表。最多支持100个机器组。
     */
    public String [] getMachineGroupIds() {
        return this.MachineGroupIds;
    }

    /**
     * Set 机器组id列表。最多支持100个机器组。
     * @param MachineGroupIds 机器组id列表。最多支持100个机器组。
     */
    public void setMachineGroupIds(String [] MachineGroupIds) {
        this.MachineGroupIds = MachineGroupIds;
    }

    /**
     * Get 采集频率。单位:ms。 最小支持5000ms 
     * @return Interval 采集频率。单位:ms。 最小支持5000ms
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 采集频率。单位:ms。 最小支持5000ms
     * @param Interval 采集频率。单位:ms。 最小支持5000ms
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 采集项。支持"cpu"，"mem"，"net"，"disk"，"system"。**目前仅支持:所有采集项都需配置**。
- cpu：CPU
- mem：内存
- net：网络
- disk：磁盘
- system：系统
 
     * @return HostMetricItems 采集项。支持"cpu"，"mem"，"net"，"disk"，"system"。**目前仅支持:所有采集项都需配置**。
- cpu：CPU
- mem：内存
- net：网络
- disk：磁盘
- system：系统

     */
    public HostMetricItem [] getHostMetricItems() {
        return this.HostMetricItems;
    }

    /**
     * Set 采集项。支持"cpu"，"mem"，"net"，"disk"，"system"。**目前仅支持:所有采集项都需配置**。
- cpu：CPU
- mem：内存
- net：网络
- disk：磁盘
- system：系统

     * @param HostMetricItems 采集项。支持"cpu"，"mem"，"net"，"disk"，"system"。**目前仅支持:所有采集项都需配置**。
- cpu：CPU
- mem：内存
- net：网络
- disk：磁盘
- system：系统

     */
    public void setHostMetricItems(HostMetricItem [] HostMetricItems) {
        this.HostMetricItems = HostMetricItems;
    }

    public ModifyHostMetricConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHostMetricConfigRequest(ModifyHostMetricConfigRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MachineGroupIds != null) {
            this.MachineGroupIds = new String[source.MachineGroupIds.length];
            for (int i = 0; i < source.MachineGroupIds.length; i++) {
                this.MachineGroupIds[i] = new String(source.MachineGroupIds[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MachineGroupIds.", this.MachineGroupIds);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "HostMetricItems.", this.HostMetricItems);

    }
}

