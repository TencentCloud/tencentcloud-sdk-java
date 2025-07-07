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

public class ModifyYarnQueueV2Request extends AbstractModel {

    /**
    * 集群Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 调度器类型。可选值：

1. capacity
2. fair
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 资源池数据
    */
    @SerializedName("ConfigModifyInfoList")
    @Expose
    private ConfigModifyInfoV2 [] ConfigModifyInfoList;

    /**
     * Get 集群Id 
     * @return InstanceId 集群Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群Id
     * @param InstanceId 集群Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 调度器类型。可选值：

1. capacity
2. fair 
     * @return Scheduler 调度器类型。可选值：

1. capacity
2. fair
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 调度器类型。可选值：

1. capacity
2. fair
     * @param Scheduler 调度器类型。可选值：

1. capacity
2. fair
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 资源池数据 
     * @return ConfigModifyInfoList 资源池数据
     */
    public ConfigModifyInfoV2 [] getConfigModifyInfoList() {
        return this.ConfigModifyInfoList;
    }

    /**
     * Set 资源池数据
     * @param ConfigModifyInfoList 资源池数据
     */
    public void setConfigModifyInfoList(ConfigModifyInfoV2 [] ConfigModifyInfoList) {
        this.ConfigModifyInfoList = ConfigModifyInfoList;
    }

    public ModifyYarnQueueV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyYarnQueueV2Request(ModifyYarnQueueV2Request source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.ConfigModifyInfoList != null) {
            this.ConfigModifyInfoList = new ConfigModifyInfoV2[source.ConfigModifyInfoList.length];
            for (int i = 0; i < source.ConfigModifyInfoList.length; i++) {
                this.ConfigModifyInfoList[i] = new ConfigModifyInfoV2(source.ConfigModifyInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamArrayObj(map, prefix + "ConfigModifyInfoList.", this.ConfigModifyInfoList);

    }
}

