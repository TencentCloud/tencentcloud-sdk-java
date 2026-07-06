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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterMachineRequest extends AbstractModel {

    /**
    * <p>集群 ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>节点名列表</p>
    */
    @SerializedName("MachineNames")
    @Expose
    private String [] MachineNames;

    /**
    * <p>machine的display name</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>系统盘的信息</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private Disk SystemDisk;

    /**
    * <p>安全组列表</p>
    */
    @SerializedName("SecurityGroupIDs")
    @Expose
    private String [] SecurityGroupIDs;

    /**
    * <p>节点预付费信息</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>节点计费类型变更</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 目标计费类型为按量计费</li><li>PREPAID： 目标计费类型为包年包月计费</li></ul>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>是否同时切换弹性数据云盘计费模式。取值范围：  true：表示切换弹性数据云盘计费模式 false：表示不切换弹性数据云盘计费模式 默认取值：true。</p><p>默认值：true</p>
    */
    @SerializedName("ModifyPortableDataDisk")
    @Expose
    private Boolean ModifyPortableDataDisk;

    /**
     * Get <p>集群 ID</p> 
     * @return ClusterId <p>集群 ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID</p>
     * @param ClusterId <p>集群 ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>节点名列表</p> 
     * @return MachineNames <p>节点名列表</p>
     */
    public String [] getMachineNames() {
        return this.MachineNames;
    }

    /**
     * Set <p>节点名列表</p>
     * @param MachineNames <p>节点名列表</p>
     */
    public void setMachineNames(String [] MachineNames) {
        this.MachineNames = MachineNames;
    }

    /**
     * Get <p>machine的display name</p> 
     * @return DisplayName <p>machine的display name</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>machine的display name</p>
     * @param DisplayName <p>machine的display name</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>系统盘的信息</p> 
     * @return SystemDisk <p>系统盘的信息</p>
     */
    public Disk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>系统盘的信息</p>
     * @param SystemDisk <p>系统盘的信息</p>
     */
    public void setSystemDisk(Disk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>安全组列表</p> 
     * @return SecurityGroupIDs <p>安全组列表</p>
     */
    public String [] getSecurityGroupIDs() {
        return this.SecurityGroupIDs;
    }

    /**
     * Set <p>安全组列表</p>
     * @param SecurityGroupIDs <p>安全组列表</p>
     */
    public void setSecurityGroupIDs(String [] SecurityGroupIDs) {
        this.SecurityGroupIDs = SecurityGroupIDs;
    }

    /**
     * Get <p>节点预付费信息</p> 
     * @return InstanceChargePrepaid <p>节点预付费信息</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>节点预付费信息</p>
     * @param InstanceChargePrepaid <p>节点预付费信息</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>节点计费类型变更</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 目标计费类型为按量计费</li><li>PREPAID： 目标计费类型为包年包月计费</li></ul> 
     * @return InstanceChargeType <p>节点计费类型变更</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 目标计费类型为按量计费</li><li>PREPAID： 目标计费类型为包年包月计费</li></ul>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>节点计费类型变更</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 目标计费类型为按量计费</li><li>PREPAID： 目标计费类型为包年包月计费</li></ul>
     * @param InstanceChargeType <p>节点计费类型变更</p><p>枚举值：</p><ul><li>POSTPAID_BY_HOUR： 目标计费类型为按量计费</li><li>PREPAID： 目标计费类型为包年包月计费</li></ul>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>是否同时切换弹性数据云盘计费模式。取值范围：  true：表示切换弹性数据云盘计费模式 false：表示不切换弹性数据云盘计费模式 默认取值：true。</p><p>默认值：true</p> 
     * @return ModifyPortableDataDisk <p>是否同时切换弹性数据云盘计费模式。取值范围：  true：表示切换弹性数据云盘计费模式 false：表示不切换弹性数据云盘计费模式 默认取值：true。</p><p>默认值：true</p>
     */
    public Boolean getModifyPortableDataDisk() {
        return this.ModifyPortableDataDisk;
    }

    /**
     * Set <p>是否同时切换弹性数据云盘计费模式。取值范围：  true：表示切换弹性数据云盘计费模式 false：表示不切换弹性数据云盘计费模式 默认取值：true。</p><p>默认值：true</p>
     * @param ModifyPortableDataDisk <p>是否同时切换弹性数据云盘计费模式。取值范围：  true：表示切换弹性数据云盘计费模式 false：表示不切换弹性数据云盘计费模式 默认取值：true。</p><p>默认值：true</p>
     */
    public void setModifyPortableDataDisk(Boolean ModifyPortableDataDisk) {
        this.ModifyPortableDataDisk = ModifyPortableDataDisk;
    }

    public ModifyClusterMachineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterMachineRequest(ModifyClusterMachineRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.MachineNames != null) {
            this.MachineNames = new String[source.MachineNames.length];
            for (int i = 0; i < source.MachineNames.length; i++) {
                this.MachineNames[i] = new String(source.MachineNames[i]);
            }
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new Disk(source.SystemDisk);
        }
        if (source.SecurityGroupIDs != null) {
            this.SecurityGroupIDs = new String[source.SecurityGroupIDs.length];
            for (int i = 0; i < source.SecurityGroupIDs.length; i++) {
                this.SecurityGroupIDs[i] = new String(source.SecurityGroupIDs[i]);
            }
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.ModifyPortableDataDisk != null) {
            this.ModifyPortableDataDisk = new Boolean(source.ModifyPortableDataDisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "MachineNames.", this.MachineNames);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArraySimple(map, prefix + "SecurityGroupIDs.", this.SecurityGroupIDs);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "ModifyPortableDataDisk", this.ModifyPortableDataDisk);

    }
}

