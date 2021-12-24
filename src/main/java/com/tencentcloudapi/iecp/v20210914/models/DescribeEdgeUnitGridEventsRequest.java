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

public class DescribeEdgeUnitGridEventsRequest extends AbstractModel{

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * Grid名称
    */
    @SerializedName("GridName")
    @Expose
    private String GridName;

    /**
    * 负载类型（StatefulSetGrid｜DeploymentGrid）
    */
    @SerializedName("WorkloadKind")
    @Expose
    private String WorkloadKind;

    /**
    * 命名空间，默认为default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * NodeUnit名称
    */
    @SerializedName("NodeUnit")
    @Expose
    private String NodeUnit;

    /**
    * Pod名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

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
     * @return GridName Grid名称
     */
    public String getGridName() {
        return this.GridName;
    }

    /**
     * Set Grid名称
     * @param GridName Grid名称
     */
    public void setGridName(String GridName) {
        this.GridName = GridName;
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
     * Get 命名空间，默认为default 
     * @return Namespace 命名空间，默认为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，默认为default
     * @param Namespace 命名空间，默认为default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get NodeUnit名称 
     * @return NodeUnit NodeUnit名称
     */
    public String getNodeUnit() {
        return this.NodeUnit;
    }

    /**
     * Set NodeUnit名称
     * @param NodeUnit NodeUnit名称
     */
    public void setNodeUnit(String NodeUnit) {
        this.NodeUnit = NodeUnit;
    }

    /**
     * Get Pod名称 
     * @return PodName Pod名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod名称
     * @param PodName Pod名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    public DescribeEdgeUnitGridEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeUnitGridEventsRequest(DescribeEdgeUnitGridEventsRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.GridName != null) {
            this.GridName = new String(source.GridName);
        }
        if (source.WorkloadKind != null) {
            this.WorkloadKind = new String(source.WorkloadKind);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.NodeUnit != null) {
            this.NodeUnit = new String(source.NodeUnit);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "GridName", this.GridName);
        this.setParamSimple(map, prefix + "WorkloadKind", this.WorkloadKind);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "NodeUnit", this.NodeUnit);
        this.setParamSimple(map, prefix + "PodName", this.PodName);

    }
}

