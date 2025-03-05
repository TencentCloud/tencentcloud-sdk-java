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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * ID值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * cdwpg-cn或者其他
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * cdwpg-cn或者其他
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Running
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 运行中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStateInfo")
    @Expose
    private InstanceStateInfo InstanceStateInfo;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 2022-09-05 20:00:01
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * ap-chongqing
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * ap
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * region
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionDesc")
    @Expose
    private String RegionDesc;

    /**
    * zone
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneDesc")
    @Expose
    private String ZoneDesc;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * v3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 字符集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * CN节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CNNodes")
    @Expose
    private InstanceNodeGroup [] CNNodes;

    /**
    * DN节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DNNodes")
    @Expose
    private InstanceNodeGroup [] DNNodes;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Boolean RenewFlag;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 访问信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessDetails")
    @Expose
    private AccessInfo [] AccessDetails;

    /**
     * Get ID值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID ID值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set ID值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID ID值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get cdwpg-cn或者其他
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType cdwpg-cn或者其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set cdwpg-cn或者其他
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType cdwpg-cn或者其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get cdwpg-cn或者其他
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName cdwpg-cn或者其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set cdwpg-cn或者其他
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName cdwpg-cn或者其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Running
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status Running
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Running
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status Running
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 运行中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc 运行中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 运行中
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 运行中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStateInfo 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceStateInfo getInstanceStateInfo() {
        return this.InstanceStateInfo;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStateInfo 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStateInfo(InstanceStateInfo InstanceStateInfo) {
        this.InstanceStateInfo = InstanceStateInfo;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceID -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceID -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 2022-09-05 20:00:01
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 2022-09-05 20:00:01
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 2022-09-05 20:00:01
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 2022-09-05 20:00:01
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get ap-chongqing
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region ap-chongqing
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set ap-chongqing
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region ap-chongqing
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get ap
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone ap
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set ap
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone ap
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get region
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionDesc region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionDesc() {
        return this.RegionDesc;
    }

    /**
     * Set region
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionDesc region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionDesc(String RegionDesc) {
        this.RegionDesc = RegionDesc;
    }

    /**
     * Get zone
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneDesc zone
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneDesc() {
        return this.ZoneDesc;
    }

    /**
     * Set zone
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneDesc zone
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneDesc(String ZoneDesc) {
        this.ZoneDesc = ZoneDesc;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get v3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version v3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set v3
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version v3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 字符集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Charset 字符集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set 字符集
注意：此字段可能返回 null，表示取不到有效值。
     * @param Charset 字符集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get CN节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CNNodes CN节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNodeGroup [] getCNNodes() {
        return this.CNNodes;
    }

    /**
     * Set CN节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CNNodes CN节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCNNodes(InstanceNodeGroup [] CNNodes) {
        this.CNNodes = CNNodes;
    }

    /**
     * Get DN节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DNNodes DN节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNodeGroup [] getDNNodes() {
        return this.DNNodes;
    }

    /**
     * Set DN节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DNNodes DN节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDNNodes(InstanceNodeGroup [] DNNodes) {
        this.DNNodes = DNNodes;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Boolean RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 访问信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessDetails 访问信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessInfo [] getAccessDetails() {
        return this.AccessDetails;
    }

    /**
     * Set 访问信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessDetails 访问信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessDetails(AccessInfo [] AccessDetails) {
        this.AccessDetails = AccessDetails;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.InstanceStateInfo != null) {
            this.InstanceStateInfo = new InstanceStateInfo(source.InstanceStateInfo);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.RegionDesc != null) {
            this.RegionDesc = new String(source.RegionDesc);
        }
        if (source.ZoneDesc != null) {
            this.ZoneDesc = new String(source.ZoneDesc);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.CNNodes != null) {
            this.CNNodes = new InstanceNodeGroup[source.CNNodes.length];
            for (int i = 0; i < source.CNNodes.length; i++) {
                this.CNNodes[i] = new InstanceNodeGroup(source.CNNodes[i]);
            }
        }
        if (source.DNNodes != null) {
            this.DNNodes = new InstanceNodeGroup[source.DNNodes.length];
            for (int i = 0; i < source.DNNodes.length; i++) {
                this.DNNodes[i] = new InstanceNodeGroup(source.DNNodes[i]);
            }
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Boolean(source.RenewFlag);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AccessDetails != null) {
            this.AccessDetails = new AccessInfo[source.AccessDetails.length];
            for (int i = 0; i < source.AccessDetails.length; i++) {
                this.AccessDetails[i] = new AccessInfo(source.AccessDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamObj(map, prefix + "InstanceStateInfo.", this.InstanceStateInfo);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "RegionDesc", this.RegionDesc);
        this.setParamSimple(map, prefix + "ZoneDesc", this.ZoneDesc);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamArrayObj(map, prefix + "CNNodes.", this.CNNodes);
        this.setParamArrayObj(map, prefix + "DNNodes.", this.DNNodes);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "AccessDetails.", this.AccessDetails);

    }
}

