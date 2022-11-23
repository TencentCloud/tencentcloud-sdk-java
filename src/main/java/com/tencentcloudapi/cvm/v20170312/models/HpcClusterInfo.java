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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HpcClusterInfo extends AbstractModel{

    /**
    * 高性能计算集群ID
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * 高性能计算集群名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 高性能计算集群备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 集群下设备容量
    */
    @SerializedName("CvmQuotaTotal")
    @Expose
    private Long CvmQuotaTotal;

    /**
    * 集群所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 集群当前已有设备量
    */
    @SerializedName("CurrentNum")
    @Expose
    private Long CurrentNum;

    /**
    * 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 集群内实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get 高性能计算集群ID 
     * @return HpcClusterId 高性能计算集群ID
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set 高性能计算集群ID
     * @param HpcClusterId 高性能计算集群ID
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get 高性能计算集群名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 高性能计算集群名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 高性能计算集群名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 高性能计算集群名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 高性能计算集群备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 高性能计算集群备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 高性能计算集群备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 高性能计算集群备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 集群下设备容量 
     * @return CvmQuotaTotal 集群下设备容量
     */
    public Long getCvmQuotaTotal() {
        return this.CvmQuotaTotal;
    }

    /**
     * Set 集群下设备容量
     * @param CvmQuotaTotal 集群下设备容量
     */
    public void setCvmQuotaTotal(Long CvmQuotaTotal) {
        this.CvmQuotaTotal = CvmQuotaTotal;
    }

    /**
     * Get 集群所在可用区 
     * @return Zone 集群所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 集群所在可用区
     * @param Zone 集群所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 集群当前已有设备量 
     * @return CurrentNum 集群当前已有设备量
     */
    public Long getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set 集群当前已有设备量
     * @param CurrentNum 集群当前已有设备量
     */
    public void setCurrentNum(Long CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 集群内实例ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceIds 集群内实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 集群内实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceIds 集群内实例ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public HpcClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HpcClusterInfo(HpcClusterInfo source) {
        if (source.HpcClusterId != null) {
            this.HpcClusterId = new String(source.HpcClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CvmQuotaTotal != null) {
            this.CvmQuotaTotal = new Long(source.CvmQuotaTotal);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CurrentNum != null) {
            this.CurrentNum = new Long(source.CurrentNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CvmQuotaTotal", this.CvmQuotaTotal);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

