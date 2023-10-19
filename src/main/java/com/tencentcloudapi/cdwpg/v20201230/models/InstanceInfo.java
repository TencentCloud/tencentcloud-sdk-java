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
    * 引擎版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * GTM节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GTMNodes")
    @Expose
    private InstanceNodeGroup [] GTMNodes;

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
    * 备份存储
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupStorage")
    @Expose
    private InstanceNodeGroup [] BackupStorage;

    /**
    * FN节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FNNodes")
    @Expose
    private InstanceNodeGroup [] FNNodes;

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
     * Get 引擎版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineVersion 引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineVersion 引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get GTM节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GTMNodes GTM节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNodeGroup [] getGTMNodes() {
        return this.GTMNodes;
    }

    /**
     * Set GTM节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param GTMNodes GTM节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGTMNodes(InstanceNodeGroup [] GTMNodes) {
        this.GTMNodes = GTMNodes;
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
     * Get 备份存储
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupStorage 备份存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNodeGroup [] getBackupStorage() {
        return this.BackupStorage;
    }

    /**
     * Set 备份存储
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupStorage 备份存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupStorage(InstanceNodeGroup [] BackupStorage) {
        this.BackupStorage = BackupStorage;
    }

    /**
     * Get FN节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FNNodes FN节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNodeGroup [] getFNNodes() {
        return this.FNNodes;
    }

    /**
     * Set FN节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FNNodes FN节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFNNodes(InstanceNodeGroup [] FNNodes) {
        this.FNNodes = FNNodes;
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
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.GTMNodes != null) {
            this.GTMNodes = new InstanceNodeGroup[source.GTMNodes.length];
            for (int i = 0; i < source.GTMNodes.length; i++) {
                this.GTMNodes[i] = new InstanceNodeGroup(source.GTMNodes[i]);
            }
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
        if (source.BackupStorage != null) {
            this.BackupStorage = new InstanceNodeGroup[source.BackupStorage.length];
            for (int i = 0; i < source.BackupStorage.length; i++) {
                this.BackupStorage[i] = new InstanceNodeGroup(source.BackupStorage[i]);
            }
        }
        if (source.FNNodes != null) {
            this.FNNodes = new InstanceNodeGroup[source.FNNodes.length];
            for (int i = 0; i < source.FNNodes.length; i++) {
                this.FNNodes[i] = new InstanceNodeGroup(source.FNNodes[i]);
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
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamArrayObj(map, prefix + "GTMNodes.", this.GTMNodes);
        this.setParamArrayObj(map, prefix + "CNNodes.", this.CNNodes);
        this.setParamArrayObj(map, prefix + "DNNodes.", this.DNNodes);
        this.setParamArrayObj(map, prefix + "BackupStorage.", this.BackupStorage);
        this.setParamArrayObj(map, prefix + "FNNodes.", this.FNNodes);

    }
}

