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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceGovernanceConfig extends AbstractModel {

    /**
    * <p>是否开启服务注册治理</p><p>枚举值：</p><ul><li>true： 使用Consul或者北极星服务注册治理</li><li>false： 不使用服务注册治理</li></ul>
    */
    @SerializedName("EnableGovernance")
    @Expose
    private Boolean EnableGovernance;

    /**
    * <p>服务治理类型</p><p>枚举值：</p><ul><li>SHARE： 使用Consul注册中心</li><li>EXCLUSIVE： 使用北极星注册中心</li></ul>
    */
    @SerializedName("GovernanceType")
    @Expose
    private String GovernanceType;

    /**
    * <p>北极星实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExclusiveInstances")
    @Expose
    private ExclusiveInstance [] ExclusiveInstances;

    /**
     * Get <p>是否开启服务注册治理</p><p>枚举值：</p><ul><li>true： 使用Consul或者北极星服务注册治理</li><li>false： 不使用服务注册治理</li></ul> 
     * @return EnableGovernance <p>是否开启服务注册治理</p><p>枚举值：</p><ul><li>true： 使用Consul或者北极星服务注册治理</li><li>false： 不使用服务注册治理</li></ul>
     */
    public Boolean getEnableGovernance() {
        return this.EnableGovernance;
    }

    /**
     * Set <p>是否开启服务注册治理</p><p>枚举值：</p><ul><li>true： 使用Consul或者北极星服务注册治理</li><li>false： 不使用服务注册治理</li></ul>
     * @param EnableGovernance <p>是否开启服务注册治理</p><p>枚举值：</p><ul><li>true： 使用Consul或者北极星服务注册治理</li><li>false： 不使用服务注册治理</li></ul>
     */
    public void setEnableGovernance(Boolean EnableGovernance) {
        this.EnableGovernance = EnableGovernance;
    }

    /**
     * Get <p>服务治理类型</p><p>枚举值：</p><ul><li>SHARE： 使用Consul注册中心</li><li>EXCLUSIVE： 使用北极星注册中心</li></ul> 
     * @return GovernanceType <p>服务治理类型</p><p>枚举值：</p><ul><li>SHARE： 使用Consul注册中心</li><li>EXCLUSIVE： 使用北极星注册中心</li></ul>
     */
    public String getGovernanceType() {
        return this.GovernanceType;
    }

    /**
     * Set <p>服务治理类型</p><p>枚举值：</p><ul><li>SHARE： 使用Consul注册中心</li><li>EXCLUSIVE： 使用北极星注册中心</li></ul>
     * @param GovernanceType <p>服务治理类型</p><p>枚举值：</p><ul><li>SHARE： 使用Consul注册中心</li><li>EXCLUSIVE： 使用北极星注册中心</li></ul>
     */
    public void setGovernanceType(String GovernanceType) {
        this.GovernanceType = GovernanceType;
    }

    /**
     * Get <p>北极星实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExclusiveInstances <p>北极星实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExclusiveInstance [] getExclusiveInstances() {
        return this.ExclusiveInstances;
    }

    /**
     * Set <p>北极星实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExclusiveInstances <p>北极星实例列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExclusiveInstances(ExclusiveInstance [] ExclusiveInstances) {
        this.ExclusiveInstances = ExclusiveInstances;
    }

    public ServiceGovernanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceGovernanceConfig(ServiceGovernanceConfig source) {
        if (source.EnableGovernance != null) {
            this.EnableGovernance = new Boolean(source.EnableGovernance);
        }
        if (source.GovernanceType != null) {
            this.GovernanceType = new String(source.GovernanceType);
        }
        if (source.ExclusiveInstances != null) {
            this.ExclusiveInstances = new ExclusiveInstance[source.ExclusiveInstances.length];
            for (int i = 0; i < source.ExclusiveInstances.length; i++) {
                this.ExclusiveInstances[i] = new ExclusiveInstance(source.ExclusiveInstances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableGovernance", this.EnableGovernance);
        this.setParamSimple(map, prefix + "GovernanceType", this.GovernanceType);
        this.setParamArrayObj(map, prefix + "ExclusiveInstances.", this.ExclusiveInstances);

    }
}

