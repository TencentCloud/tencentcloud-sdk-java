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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEdgeUnitDeployGridItemRequest extends AbstractModel{

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * Grid名称
    */
    @SerializedName("GridItemName")
    @Expose
    private String GridItemName;

    /**
    * 负载类型（StatefulSetGrid｜DeploymentGrid）
    */
    @SerializedName("WorkloadKind")
    @Expose
    private String WorkloadKind;

    /**
    * 副本数
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 命名空间，默认default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get IECP边缘单元ID 
     * @return EdgeUnitId IECP边缘单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set IECP边缘单元ID
     * @param EdgeUnitId IECP边缘单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get Grid名称 
     * @return GridItemName Grid名称
     */
    public String getGridItemName() {
        return this.GridItemName;
    }

    /**
     * Set Grid名称
     * @param GridItemName Grid名称
     */
    public void setGridItemName(String GridItemName) {
        this.GridItemName = GridItemName;
    }

    /**
     * Get 负载类型（StatefulSetGrid｜DeploymentGrid） 
     * @return WorkloadKind 负载类型（StatefulSetGrid｜DeploymentGrid）
     */
    public String getWorkloadKind() {
        return this.WorkloadKind;
    }

    /**
     * Set 负载类型（StatefulSetGrid｜DeploymentGrid）
     * @param WorkloadKind 负载类型（StatefulSetGrid｜DeploymentGrid）
     */
    public void setWorkloadKind(String WorkloadKind) {
        this.WorkloadKind = WorkloadKind;
    }

    /**
     * Get 副本数 
     * @return Replicas 副本数
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 副本数
     * @param Replicas 副本数
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 命名空间，默认default 
     * @return Namespace 命名空间，默认default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，默认default
     * @param Namespace 命名空间，默认default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public ModifyEdgeUnitDeployGridItemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEdgeUnitDeployGridItemRequest(ModifyEdgeUnitDeployGridItemRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.GridItemName != null) {
            this.GridItemName = new String(source.GridItemName);
        }
        if (source.WorkloadKind != null) {
            this.WorkloadKind = new String(source.WorkloadKind);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "GridItemName", this.GridItemName);
        this.setParamSimple(map, prefix + "WorkloadKind", this.WorkloadKind);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

