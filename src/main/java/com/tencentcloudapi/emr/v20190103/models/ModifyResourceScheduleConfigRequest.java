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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceScheduleConfigRequest extends AbstractModel{

    /**
    * emr集群的英文id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 业务标识，fair表示编辑公平的配置项，fairPlan表示编辑执行计划，capacity表示编辑容量的配置项
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 修改后的模块消息
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get emr集群的英文id 
     * @return InstanceId emr集群的英文id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set emr集群的英文id
     * @param InstanceId emr集群的英文id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 业务标识，fair表示编辑公平的配置项，fairPlan表示编辑执行计划，capacity表示编辑容量的配置项 
     * @return Key 业务标识，fair表示编辑公平的配置项，fairPlan表示编辑执行计划，capacity表示编辑容量的配置项
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 业务标识，fair表示编辑公平的配置项，fairPlan表示编辑执行计划，capacity表示编辑容量的配置项
     * @param Key 业务标识，fair表示编辑公平的配置项，fairPlan表示编辑执行计划，capacity表示编辑容量的配置项
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 修改后的模块消息 
     * @return Value 修改后的模块消息
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 修改后的模块消息
     * @param Value 修改后的模块消息
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ModifyResourceScheduleConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceScheduleConfigRequest(ModifyResourceScheduleConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

