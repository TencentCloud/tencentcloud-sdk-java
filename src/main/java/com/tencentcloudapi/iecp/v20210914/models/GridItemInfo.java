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

public class GridItemInfo extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 期望副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 可用副本数
    */
    @SerializedName("AvailableReplicas")
    @Expose
    private Long AvailableReplicas;

    /**
    * 启动时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 工作负载类型
    */
    @SerializedName("WorkloadKind")
    @Expose
    private String WorkloadKind;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 期望副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replicas 期望副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 期望副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas 期望副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 可用副本数 
     * @return AvailableReplicas 可用副本数
     */
    public Long getAvailableReplicas() {
        return this.AvailableReplicas;
    }

    /**
     * Set 可用副本数
     * @param AvailableReplicas 可用副本数
     */
    public void setAvailableReplicas(Long AvailableReplicas) {
        this.AvailableReplicas = AvailableReplicas;
    }

    /**
     * Get 启动时间 
     * @return StartTime 启动时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 启动时间
     * @param StartTime 启动时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 工作负载类型 
     * @return WorkloadKind 工作负载类型
     */
    public String getWorkloadKind() {
        return this.WorkloadKind;
    }

    /**
     * Set 工作负载类型
     * @param WorkloadKind 工作负载类型
     */
    public void setWorkloadKind(String WorkloadKind) {
        this.WorkloadKind = WorkloadKind;
    }

    public GridItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GridItemInfo(GridItemInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.AvailableReplicas != null) {
            this.AvailableReplicas = new Long(source.AvailableReplicas);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.WorkloadKind != null) {
            this.WorkloadKind = new String(source.WorkloadKind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "AvailableReplicas", this.AvailableReplicas);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "WorkloadKind", this.WorkloadKind);

    }
}

