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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NativeNodeInfo extends AbstractModel {

    /**
    * 节点名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Machine 状态
    */
    @SerializedName("MachineState")
    @Expose
    private String MachineState;

    /**
    * Machine 所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 节点计费类型。PREPAID：包年包月；POSTPAID_BY_HOUR：按量计费（默认）；
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Machine 登录状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoginStatus")
    @Expose
    private String LoginStatus;

    /**
    * 是否开启缩容保护
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsProtectedFromScaleIn")
    @Expose
    private Boolean IsProtectedFromScaleIn;

    /**
    * Machine 名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * CPU核数，单位：核
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * GPU核数，单位：核
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPU")
    @Expose
    private Long GPU;

    /**
    * 自动续费标识
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 节点计费模式（已弃用）
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 节点内存容量，单位：`GB`
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 公网带宽相关信息设置
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 机型所属机型族
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 节点内网 IP
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 机型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 包年包月节点计费过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 安全组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroupIDs")
    @Expose
    private String [] SecurityGroupIDs;

    /**
    * VPC 唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * OS的名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsImage")
    @Expose
    private String OsImage;

    /**
    * **原生节点对应的实例 ID**

- ins-q47ofw6 表示这个实例是一个 CVM 的实例
- eks-f8mvyaep 表示这个实例是一个 CXM 的实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 节点名称 
     * @return MachineName 节点名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 节点名称
     * @param MachineName 节点名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Machine 状态 
     * @return MachineState Machine 状态
     */
    public String getMachineState() {
        return this.MachineState;
    }

    /**
     * Set Machine 状态
     * @param MachineState Machine 状态
     */
    public void setMachineState(String MachineState) {
        this.MachineState = MachineState;
    }

    /**
     * Get Machine 所在可用区 
     * @return Zone Machine 所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Machine 所在可用区
     * @param Zone Machine 所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 节点计费类型。PREPAID：包年包月；POSTPAID_BY_HOUR：按量计费（默认）； 
     * @return InstanceChargeType 节点计费类型。PREPAID：包年包月；POSTPAID_BY_HOUR：按量计费（默认）；
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 节点计费类型。PREPAID：包年包月；POSTPAID_BY_HOUR：按量计费（默认）；
     * @param InstanceChargeType 节点计费类型。PREPAID：包年包月；POSTPAID_BY_HOUR：按量计费（默认）；
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Machine 登录状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoginStatus Machine 登录状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoginStatus() {
        return this.LoginStatus;
    }

    /**
     * Set Machine 登录状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoginStatus Machine 登录状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoginStatus(String LoginStatus) {
        this.LoginStatus = LoginStatus;
    }

    /**
     * Get 是否开启缩容保护
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsProtectedFromScaleIn 是否开启缩容保护
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsProtectedFromScaleIn() {
        return this.IsProtectedFromScaleIn;
    }

    /**
     * Set 是否开启缩容保护
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsProtectedFromScaleIn 是否开启缩容保护
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsProtectedFromScaleIn(Boolean IsProtectedFromScaleIn) {
        this.IsProtectedFromScaleIn = IsProtectedFromScaleIn;
    }

    /**
     * Get Machine 名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName Machine 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Machine 名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName Machine 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get CPU核数，单位：核 
     * @return CPU CPU核数，单位：核
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核数，单位：核
     * @param CPU CPU核数，单位：核
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get GPU核数，单位：核
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPU GPU核数，单位：核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGPU() {
        return this.GPU;
    }

    /**
     * Set GPU核数，单位：核
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPU GPU核数，单位：核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPU(Long GPU) {
        this.GPU = GPU;
    }

    /**
     * Get 自动续费标识 
     * @return RenewFlag 自动续费标识
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识
     * @param RenewFlag 自动续费标识
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 节点计费模式（已弃用） 
     * @return PayMode 节点计费模式（已弃用）
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 节点计费模式（已弃用）
     * @param PayMode 节点计费模式（已弃用）
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 节点内存容量，单位：`GB` 
     * @return Memory 节点内存容量，单位：`GB`
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 节点内存容量，单位：`GB`
     * @param Memory 节点内存容量，单位：`GB`
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 公网带宽相关信息设置 
     * @return InternetAccessible 公网带宽相关信息设置
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set 公网带宽相关信息设置
     * @param InternetAccessible 公网带宽相关信息设置
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get 机型所属机型族 
     * @return InstanceFamily 机型所属机型族
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 机型所属机型族
     * @param InstanceFamily 机型所属机型族
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 节点内网 IP 
     * @return LanIp 节点内网 IP
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * Set 节点内网 IP
     * @param LanIp 节点内网 IP
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * Get 机型 
     * @return InstanceType 机型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 机型
     * @param InstanceType 机型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 包年包月节点计费过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime 包年包月节点计费过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 包年包月节点计费过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime 包年包月节点计费过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 安全组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroupIDs 安全组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroupIDs() {
        return this.SecurityGroupIDs;
    }

    /**
     * Set 安全组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroupIDs 安全组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroupIDs(String [] SecurityGroupIDs) {
        this.SecurityGroupIDs = SecurityGroupIDs;
    }

    /**
     * Get VPC 唯一 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId VPC 唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC 唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId VPC 唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网唯一 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get OS的名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsImage OS的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOsImage() {
        return this.OsImage;
    }

    /**
     * Set OS的名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsImage OS的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsImage(String OsImage) {
        this.OsImage = OsImage;
    }

    /**
     * Get **原生节点对应的实例 ID**

- ins-q47ofw6 表示这个实例是一个 CVM 的实例
- eks-f8mvyaep 表示这个实例是一个 CXM 的实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId **原生节点对应的实例 ID**

- ins-q47ofw6 表示这个实例是一个 CVM 的实例
- eks-f8mvyaep 表示这个实例是一个 CXM 的实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set **原生节点对应的实例 ID**

- ins-q47ofw6 表示这个实例是一个 CVM 的实例
- eks-f8mvyaep 表示这个实例是一个 CXM 的实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId **原生节点对应的实例 ID**

- ins-q47ofw6 表示这个实例是一个 CVM 的实例
- eks-f8mvyaep 表示这个实例是一个 CXM 的实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public NativeNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NativeNodeInfo(NativeNodeInfo source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineState != null) {
            this.MachineState = new String(source.MachineState);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.LoginStatus != null) {
            this.LoginStatus = new String(source.LoginStatus);
        }
        if (source.IsProtectedFromScaleIn != null) {
            this.IsProtectedFromScaleIn = new Boolean(source.IsProtectedFromScaleIn);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.GPU != null) {
            this.GPU = new Long(source.GPU);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.LanIp != null) {
            this.LanIp = new String(source.LanIp);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.SecurityGroupIDs != null) {
            this.SecurityGroupIDs = new String[source.SecurityGroupIDs.length];
            for (int i = 0; i < source.SecurityGroupIDs.length; i++) {
                this.SecurityGroupIDs[i] = new String(source.SecurityGroupIDs[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.OsImage != null) {
            this.OsImage = new String(source.OsImage);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineState", this.MachineState);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "LoginStatus", this.LoginStatus);
        this.setParamSimple(map, prefix + "IsProtectedFromScaleIn", this.IsProtectedFromScaleIn);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "GPU", this.GPU);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamArraySimple(map, prefix + "SecurityGroupIDs.", this.SecurityGroupIDs);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "OsImage", this.OsImage);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

