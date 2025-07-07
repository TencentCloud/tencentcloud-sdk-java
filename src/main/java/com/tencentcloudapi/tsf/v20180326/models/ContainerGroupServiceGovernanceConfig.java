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

public class ContainerGroupServiceGovernanceConfig extends AbstractModel {

    /**
    * 是否开启服务治理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableGovernance")
    @Expose
    private Boolean EnableGovernance;

    /**
    * 控制台场景使用 mesh服务配置信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceConfigList")
    @Expose
    private ServiceConfig [] ServiceConfigList;

    /**
    * 注册服务治理实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExclusiveInstances")
    @Expose
    private ExclusiveInstance [] ExclusiveInstances;

    /**
    * 服务治理类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GovernanceType")
    @Expose
    private String GovernanceType;

    /**
     * Get 是否开启服务治理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableGovernance 是否开启服务治理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableGovernance() {
        return this.EnableGovernance;
    }

    /**
     * Set 是否开启服务治理
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableGovernance 是否开启服务治理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableGovernance(Boolean EnableGovernance) {
        this.EnableGovernance = EnableGovernance;
    }

    /**
     * Get 控制台场景使用 mesh服务配置信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceConfigList 控制台场景使用 mesh服务配置信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceConfig [] getServiceConfigList() {
        return this.ServiceConfigList;
    }

    /**
     * Set 控制台场景使用 mesh服务配置信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceConfigList 控制台场景使用 mesh服务配置信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceConfigList(ServiceConfig [] ServiceConfigList) {
        this.ServiceConfigList = ServiceConfigList;
    }

    /**
     * Get 注册服务治理实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExclusiveInstances 注册服务治理实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExclusiveInstance [] getExclusiveInstances() {
        return this.ExclusiveInstances;
    }

    /**
     * Set 注册服务治理实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExclusiveInstances 注册服务治理实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExclusiveInstances(ExclusiveInstance [] ExclusiveInstances) {
        this.ExclusiveInstances = ExclusiveInstances;
    }

    /**
     * Get 服务治理类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GovernanceType 服务治理类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGovernanceType() {
        return this.GovernanceType;
    }

    /**
     * Set 服务治理类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GovernanceType 服务治理类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGovernanceType(String GovernanceType) {
        this.GovernanceType = GovernanceType;
    }

    public ContainerGroupServiceGovernanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerGroupServiceGovernanceConfig(ContainerGroupServiceGovernanceConfig source) {
        if (source.EnableGovernance != null) {
            this.EnableGovernance = new Boolean(source.EnableGovernance);
        }
        if (source.ServiceConfigList != null) {
            this.ServiceConfigList = new ServiceConfig[source.ServiceConfigList.length];
            for (int i = 0; i < source.ServiceConfigList.length; i++) {
                this.ServiceConfigList[i] = new ServiceConfig(source.ServiceConfigList[i]);
            }
        }
        if (source.ExclusiveInstances != null) {
            this.ExclusiveInstances = new ExclusiveInstance[source.ExclusiveInstances.length];
            for (int i = 0; i < source.ExclusiveInstances.length; i++) {
                this.ExclusiveInstances[i] = new ExclusiveInstance(source.ExclusiveInstances[i]);
            }
        }
        if (source.GovernanceType != null) {
            this.GovernanceType = new String(source.GovernanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableGovernance", this.EnableGovernance);
        this.setParamArrayObj(map, prefix + "ServiceConfigList.", this.ServiceConfigList);
        this.setParamArrayObj(map, prefix + "ExclusiveInstances.", this.ExclusiveInstances);
        this.setParamSimple(map, prefix + "GovernanceType", this.GovernanceType);

    }
}

