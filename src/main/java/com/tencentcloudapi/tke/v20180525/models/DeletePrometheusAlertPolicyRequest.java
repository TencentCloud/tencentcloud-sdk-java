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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePrometheusAlertPolicyRequest extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 告警策略id列表
    */
    @SerializedName("AlertIds")
    @Expose
    private String [] AlertIds;

    /**
    * 告警策略名称
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 告警策略id列表 
     * @return AlertIds 告警策略id列表
     */
    public String [] getAlertIds() {
        return this.AlertIds;
    }

    /**
     * Set 告警策略id列表
     * @param AlertIds 告警策略id列表
     */
    public void setAlertIds(String [] AlertIds) {
        this.AlertIds = AlertIds;
    }

    /**
     * Get 告警策略名称 
     * @return Names 告警策略名称
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 告警策略名称
     * @param Names 告警策略名称
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    public DeletePrometheusAlertPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePrometheusAlertPolicyRequest(DeletePrometheusAlertPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AlertIds != null) {
            this.AlertIds = new String[source.AlertIds.length];
            for (int i = 0; i < source.AlertIds.length; i++) {
                this.AlertIds[i] = new String(source.AlertIds[i]);
            }
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "AlertIds.", this.AlertIds);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);

    }
}

