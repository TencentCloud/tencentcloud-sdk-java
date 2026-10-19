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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogstashNodeTypeResource extends AbstractModel {

    /**
    * <p>规格名称</p>
    */
    @SerializedName("NodeTypeName")
    @Expose
    private String NodeTypeName;

    /**
    * <p>是否可售</p>
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * <p>规格信息</p>
    */
    @SerializedName("NodeTypeInfo")
    @Expose
    private NodeTypeInfo NodeTypeInfo;

    /**
    * <p>SSD盘是否可售</p>
    */
    @SerializedName("SsdAvailable")
    @Expose
    private Boolean SsdAvailable;

    /**
    * <p>SSD磁盘取值范围</p>
    */
    @SerializedName("SsdDiskSizeRange")
    @Expose
    private DiskSizeRange SsdDiskSizeRange;

    /**
    * <p>SSD云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsdSoldOutDetail")
    @Expose
    private FamilyResourceStat [] SsdSoldOutDetail;

    /**
    * <p>SATA盘是否可售</p>
    */
    @SerializedName("SataAvailable")
    @Expose
    private Boolean SataAvailable;

    /**
    * <p>SATA磁盘取值范围</p>
    */
    @SerializedName("SataDiskSizeRange")
    @Expose
    private DiskSizeRange SataDiskSizeRange;

    /**
    * <p>SSD机型售罄原因</p>
    */
    @SerializedName("SsdSoldOutReason")
    @Expose
    private String SsdSoldOutReason;

    /**
    * <p>SATA机型售罄原因</p>
    */
    @SerializedName("SataSoldOutReason")
    @Expose
    private String SataSoldOutReason;

    /**
    * <p>高性能云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SataSoldOutDetail")
    @Expose
    private FamilyResourceStat [] SataSoldOutDetail;

    /**
    * <p>本地盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalDiskInfo")
    @Expose
    private LocalDiskInfo LocalDiskInfo;

    /**
    * <p>云盘块数取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskCountRange")
    @Expose
    private DiskCountRange DiskCountRange;

    /**
    * <p>增强型SSD是否可用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HSsdAvailable")
    @Expose
    private Boolean HSsdAvailable;

    /**
    * <p>增强型SSD机型售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HSsdSoldOutReason")
    @Expose
    private String HSsdSoldOutReason;

    /**
    * <p>增强型SSD售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HSsdSoldOutDetail")
    @Expose
    private FamilyResourceStat [] HSsdSoldOutDetail;

    /**
    * <p>增强型SSD磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HSsdDiskSizeRange")
    @Expose
    private DiskSizeRange HSsdDiskSizeRange;

    /**
    * <p>吞吐型云盘是否可用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThroughputAvailable")
    @Expose
    private Boolean ThroughputAvailable;

    /**
    * <p>吞吐型云盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThroughputSoldOutReason")
    @Expose
    private String ThroughputSoldOutReason;

    /**
    * <p>吞吐型云硬盘售罄</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThroughputSoldOutDetail")
    @Expose
    private FamilyResourceStat [] ThroughputSoldOutDetail;

    /**
    * <p>吞吐型云盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThroughputDiskSizeRange")
    @Expose
    private DiskSizeRange ThroughputDiskSizeRange;

    /**
    * <p>BigData盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BigDataAvailable")
    @Expose
    private Boolean BigDataAvailable;

    /**
    * <p>BigData盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BigDataSoldOutReason")
    @Expose
    private String BigDataSoldOutReason;

    /**
    * <p>大数据型云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BigDataSoldOutDetail")
    @Expose
    private FamilyResourceStat [] BigDataSoldOutDetail;

    /**
    * <p>BigData磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BigDataDiskSizeRange")
    @Expose
    private DiskSizeRange BigDataDiskSizeRange;

    /**
    * <p>HighIO盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighIOAvailable")
    @Expose
    private Boolean HighIOAvailable;

    /**
    * <p>HighIO盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighIOSoldOutReason")
    @Expose
    private String HighIOSoldOutReason;

    /**
    * <p>高IO型云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighIOSoldOutDetail")
    @Expose
    private FamilyResourceStat [] HighIOSoldOutDetail;

    /**
    * <p>HighIO磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighIODiskSizeRange")
    @Expose
    private DiskSizeRange HighIODiskSizeRange;

    /**
    * <p>Bssd盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BssdAvailable")
    @Expose
    private Boolean BssdAvailable;

    /**
    * <p>Bssd盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BssdSoldOutReason")
    @Expose
    private String BssdSoldOutReason;

    /**
    * <p>Bssd盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BssdDiskSizeRange")
    @Expose
    private DiskSizeRange BssdDiskSizeRange;

    /**
    * <p>通用型SSD云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BssdSoldOutDetail")
    @Expose
    private FamilyResourceStat [] BssdSoldOutDetail;

    /**
    * <p>GpuInfo</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuInfo")
    @Expose
    private GpuInfo GpuInfo;

    /**
     * Get <p>规格名称</p> 
     * @return NodeTypeName <p>规格名称</p>
     */
    public String getNodeTypeName() {
        return this.NodeTypeName;
    }

    /**
     * Set <p>规格名称</p>
     * @param NodeTypeName <p>规格名称</p>
     */
    public void setNodeTypeName(String NodeTypeName) {
        this.NodeTypeName = NodeTypeName;
    }

    /**
     * Get <p>是否可售</p> 
     * @return Available <p>是否可售</p>
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>是否可售</p>
     * @param Available <p>是否可售</p>
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get <p>规格信息</p> 
     * @return NodeTypeInfo <p>规格信息</p>
     */
    public NodeTypeInfo getNodeTypeInfo() {
        return this.NodeTypeInfo;
    }

    /**
     * Set <p>规格信息</p>
     * @param NodeTypeInfo <p>规格信息</p>
     */
    public void setNodeTypeInfo(NodeTypeInfo NodeTypeInfo) {
        this.NodeTypeInfo = NodeTypeInfo;
    }

    /**
     * Get <p>SSD盘是否可售</p> 
     * @return SsdAvailable <p>SSD盘是否可售</p>
     */
    public Boolean getSsdAvailable() {
        return this.SsdAvailable;
    }

    /**
     * Set <p>SSD盘是否可售</p>
     * @param SsdAvailable <p>SSD盘是否可售</p>
     */
    public void setSsdAvailable(Boolean SsdAvailable) {
        this.SsdAvailable = SsdAvailable;
    }

    /**
     * Get <p>SSD磁盘取值范围</p> 
     * @return SsdDiskSizeRange <p>SSD磁盘取值范围</p>
     */
    public DiskSizeRange getSsdDiskSizeRange() {
        return this.SsdDiskSizeRange;
    }

    /**
     * Set <p>SSD磁盘取值范围</p>
     * @param SsdDiskSizeRange <p>SSD磁盘取值范围</p>
     */
    public void setSsdDiskSizeRange(DiskSizeRange SsdDiskSizeRange) {
        this.SsdDiskSizeRange = SsdDiskSizeRange;
    }

    /**
     * Get <p>SSD云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsdSoldOutDetail <p>SSD云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FamilyResourceStat [] getSsdSoldOutDetail() {
        return this.SsdSoldOutDetail;
    }

    /**
     * Set <p>SSD云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsdSoldOutDetail <p>SSD云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsdSoldOutDetail(FamilyResourceStat [] SsdSoldOutDetail) {
        this.SsdSoldOutDetail = SsdSoldOutDetail;
    }

    /**
     * Get <p>SATA盘是否可售</p> 
     * @return SataAvailable <p>SATA盘是否可售</p>
     */
    public Boolean getSataAvailable() {
        return this.SataAvailable;
    }

    /**
     * Set <p>SATA盘是否可售</p>
     * @param SataAvailable <p>SATA盘是否可售</p>
     */
    public void setSataAvailable(Boolean SataAvailable) {
        this.SataAvailable = SataAvailable;
    }

    /**
     * Get <p>SATA磁盘取值范围</p> 
     * @return SataDiskSizeRange <p>SATA磁盘取值范围</p>
     */
    public DiskSizeRange getSataDiskSizeRange() {
        return this.SataDiskSizeRange;
    }

    /**
     * Set <p>SATA磁盘取值范围</p>
     * @param SataDiskSizeRange <p>SATA磁盘取值范围</p>
     */
    public void setSataDiskSizeRange(DiskSizeRange SataDiskSizeRange) {
        this.SataDiskSizeRange = SataDiskSizeRange;
    }

    /**
     * Get <p>SSD机型售罄原因</p> 
     * @return SsdSoldOutReason <p>SSD机型售罄原因</p>
     */
    public String getSsdSoldOutReason() {
        return this.SsdSoldOutReason;
    }

    /**
     * Set <p>SSD机型售罄原因</p>
     * @param SsdSoldOutReason <p>SSD机型售罄原因</p>
     */
    public void setSsdSoldOutReason(String SsdSoldOutReason) {
        this.SsdSoldOutReason = SsdSoldOutReason;
    }

    /**
     * Get <p>SATA机型售罄原因</p> 
     * @return SataSoldOutReason <p>SATA机型售罄原因</p>
     */
    public String getSataSoldOutReason() {
        return this.SataSoldOutReason;
    }

    /**
     * Set <p>SATA机型售罄原因</p>
     * @param SataSoldOutReason <p>SATA机型售罄原因</p>
     */
    public void setSataSoldOutReason(String SataSoldOutReason) {
        this.SataSoldOutReason = SataSoldOutReason;
    }

    /**
     * Get <p>高性能云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SataSoldOutDetail <p>高性能云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FamilyResourceStat [] getSataSoldOutDetail() {
        return this.SataSoldOutDetail;
    }

    /**
     * Set <p>高性能云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SataSoldOutDetail <p>高性能云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSataSoldOutDetail(FamilyResourceStat [] SataSoldOutDetail) {
        this.SataSoldOutDetail = SataSoldOutDetail;
    }

    /**
     * Get <p>本地盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalDiskInfo <p>本地盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LocalDiskInfo getLocalDiskInfo() {
        return this.LocalDiskInfo;
    }

    /**
     * Set <p>本地盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalDiskInfo <p>本地盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalDiskInfo(LocalDiskInfo LocalDiskInfo) {
        this.LocalDiskInfo = LocalDiskInfo;
    }

    /**
     * Get <p>云盘块数取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskCountRange <p>云盘块数取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskCountRange getDiskCountRange() {
        return this.DiskCountRange;
    }

    /**
     * Set <p>云盘块数取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskCountRange <p>云盘块数取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskCountRange(DiskCountRange DiskCountRange) {
        this.DiskCountRange = DiskCountRange;
    }

    /**
     * Get <p>增强型SSD是否可用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HSsdAvailable <p>增强型SSD是否可用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHSsdAvailable() {
        return this.HSsdAvailable;
    }

    /**
     * Set <p>增强型SSD是否可用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HSsdAvailable <p>增强型SSD是否可用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHSsdAvailable(Boolean HSsdAvailable) {
        this.HSsdAvailable = HSsdAvailable;
    }

    /**
     * Get <p>增强型SSD机型售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HSsdSoldOutReason <p>增强型SSD机型售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHSsdSoldOutReason() {
        return this.HSsdSoldOutReason;
    }

    /**
     * Set <p>增强型SSD机型售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HSsdSoldOutReason <p>增强型SSD机型售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHSsdSoldOutReason(String HSsdSoldOutReason) {
        this.HSsdSoldOutReason = HSsdSoldOutReason;
    }

    /**
     * Get <p>增强型SSD售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HSsdSoldOutDetail <p>增强型SSD售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FamilyResourceStat [] getHSsdSoldOutDetail() {
        return this.HSsdSoldOutDetail;
    }

    /**
     * Set <p>增强型SSD售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HSsdSoldOutDetail <p>增强型SSD售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHSsdSoldOutDetail(FamilyResourceStat [] HSsdSoldOutDetail) {
        this.HSsdSoldOutDetail = HSsdSoldOutDetail;
    }

    /**
     * Get <p>增强型SSD磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HSsdDiskSizeRange <p>增强型SSD磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskSizeRange getHSsdDiskSizeRange() {
        return this.HSsdDiskSizeRange;
    }

    /**
     * Set <p>增强型SSD磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HSsdDiskSizeRange <p>增强型SSD磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHSsdDiskSizeRange(DiskSizeRange HSsdDiskSizeRange) {
        this.HSsdDiskSizeRange = HSsdDiskSizeRange;
    }

    /**
     * Get <p>吞吐型云盘是否可用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThroughputAvailable <p>吞吐型云盘是否可用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getThroughputAvailable() {
        return this.ThroughputAvailable;
    }

    /**
     * Set <p>吞吐型云盘是否可用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThroughputAvailable <p>吞吐型云盘是否可用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThroughputAvailable(Boolean ThroughputAvailable) {
        this.ThroughputAvailable = ThroughputAvailable;
    }

    /**
     * Get <p>吞吐型云盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThroughputSoldOutReason <p>吞吐型云盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThroughputSoldOutReason() {
        return this.ThroughputSoldOutReason;
    }

    /**
     * Set <p>吞吐型云盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThroughputSoldOutReason <p>吞吐型云盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThroughputSoldOutReason(String ThroughputSoldOutReason) {
        this.ThroughputSoldOutReason = ThroughputSoldOutReason;
    }

    /**
     * Get <p>吞吐型云硬盘售罄</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThroughputSoldOutDetail <p>吞吐型云硬盘售罄</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FamilyResourceStat [] getThroughputSoldOutDetail() {
        return this.ThroughputSoldOutDetail;
    }

    /**
     * Set <p>吞吐型云硬盘售罄</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThroughputSoldOutDetail <p>吞吐型云硬盘售罄</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThroughputSoldOutDetail(FamilyResourceStat [] ThroughputSoldOutDetail) {
        this.ThroughputSoldOutDetail = ThroughputSoldOutDetail;
    }

    /**
     * Get <p>吞吐型云盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThroughputDiskSizeRange <p>吞吐型云盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskSizeRange getThroughputDiskSizeRange() {
        return this.ThroughputDiskSizeRange;
    }

    /**
     * Set <p>吞吐型云盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThroughputDiskSizeRange <p>吞吐型云盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThroughputDiskSizeRange(DiskSizeRange ThroughputDiskSizeRange) {
        this.ThroughputDiskSizeRange = ThroughputDiskSizeRange;
    }

    /**
     * Get <p>BigData盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BigDataAvailable <p>BigData盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBigDataAvailable() {
        return this.BigDataAvailable;
    }

    /**
     * Set <p>BigData盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BigDataAvailable <p>BigData盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBigDataAvailable(Boolean BigDataAvailable) {
        this.BigDataAvailable = BigDataAvailable;
    }

    /**
     * Get <p>BigData盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BigDataSoldOutReason <p>BigData盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBigDataSoldOutReason() {
        return this.BigDataSoldOutReason;
    }

    /**
     * Set <p>BigData盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BigDataSoldOutReason <p>BigData盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBigDataSoldOutReason(String BigDataSoldOutReason) {
        this.BigDataSoldOutReason = BigDataSoldOutReason;
    }

    /**
     * Get <p>大数据型云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BigDataSoldOutDetail <p>大数据型云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FamilyResourceStat [] getBigDataSoldOutDetail() {
        return this.BigDataSoldOutDetail;
    }

    /**
     * Set <p>大数据型云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BigDataSoldOutDetail <p>大数据型云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBigDataSoldOutDetail(FamilyResourceStat [] BigDataSoldOutDetail) {
        this.BigDataSoldOutDetail = BigDataSoldOutDetail;
    }

    /**
     * Get <p>BigData磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BigDataDiskSizeRange <p>BigData磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskSizeRange getBigDataDiskSizeRange() {
        return this.BigDataDiskSizeRange;
    }

    /**
     * Set <p>BigData磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BigDataDiskSizeRange <p>BigData磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBigDataDiskSizeRange(DiskSizeRange BigDataDiskSizeRange) {
        this.BigDataDiskSizeRange = BigDataDiskSizeRange;
    }

    /**
     * Get <p>HighIO盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighIOAvailable <p>HighIO盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHighIOAvailable() {
        return this.HighIOAvailable;
    }

    /**
     * Set <p>HighIO盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighIOAvailable <p>HighIO盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighIOAvailable(Boolean HighIOAvailable) {
        this.HighIOAvailable = HighIOAvailable;
    }

    /**
     * Get <p>HighIO盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighIOSoldOutReason <p>HighIO盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHighIOSoldOutReason() {
        return this.HighIOSoldOutReason;
    }

    /**
     * Set <p>HighIO盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighIOSoldOutReason <p>HighIO盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighIOSoldOutReason(String HighIOSoldOutReason) {
        this.HighIOSoldOutReason = HighIOSoldOutReason;
    }

    /**
     * Get <p>高IO型云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighIOSoldOutDetail <p>高IO型云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FamilyResourceStat [] getHighIOSoldOutDetail() {
        return this.HighIOSoldOutDetail;
    }

    /**
     * Set <p>高IO型云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighIOSoldOutDetail <p>高IO型云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighIOSoldOutDetail(FamilyResourceStat [] HighIOSoldOutDetail) {
        this.HighIOSoldOutDetail = HighIOSoldOutDetail;
    }

    /**
     * Get <p>HighIO磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighIODiskSizeRange <p>HighIO磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskSizeRange getHighIODiskSizeRange() {
        return this.HighIODiskSizeRange;
    }

    /**
     * Set <p>HighIO磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighIODiskSizeRange <p>HighIO磁盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighIODiskSizeRange(DiskSizeRange HighIODiskSizeRange) {
        this.HighIODiskSizeRange = HighIODiskSizeRange;
    }

    /**
     * Get <p>Bssd盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BssdAvailable <p>Bssd盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBssdAvailable() {
        return this.BssdAvailable;
    }

    /**
     * Set <p>Bssd盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BssdAvailable <p>Bssd盘是否可售</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBssdAvailable(Boolean BssdAvailable) {
        this.BssdAvailable = BssdAvailable;
    }

    /**
     * Get <p>Bssd盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BssdSoldOutReason <p>Bssd盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBssdSoldOutReason() {
        return this.BssdSoldOutReason;
    }

    /**
     * Set <p>Bssd盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BssdSoldOutReason <p>Bssd盘售罄原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBssdSoldOutReason(String BssdSoldOutReason) {
        this.BssdSoldOutReason = BssdSoldOutReason;
    }

    /**
     * Get <p>Bssd盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BssdDiskSizeRange <p>Bssd盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskSizeRange getBssdDiskSizeRange() {
        return this.BssdDiskSizeRange;
    }

    /**
     * Set <p>Bssd盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BssdDiskSizeRange <p>Bssd盘取值范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBssdDiskSizeRange(DiskSizeRange BssdDiskSizeRange) {
        this.BssdDiskSizeRange = BssdDiskSizeRange;
    }

    /**
     * Get <p>通用型SSD云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BssdSoldOutDetail <p>通用型SSD云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FamilyResourceStat [] getBssdSoldOutDetail() {
        return this.BssdSoldOutDetail;
    }

    /**
     * Set <p>通用型SSD云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BssdSoldOutDetail <p>通用型SSD云硬盘售罄明细</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBssdSoldOutDetail(FamilyResourceStat [] BssdSoldOutDetail) {
        this.BssdSoldOutDetail = BssdSoldOutDetail;
    }

    /**
     * Get <p>GpuInfo</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuInfo <p>GpuInfo</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GpuInfo getGpuInfo() {
        return this.GpuInfo;
    }

    /**
     * Set <p>GpuInfo</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuInfo <p>GpuInfo</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuInfo(GpuInfo GpuInfo) {
        this.GpuInfo = GpuInfo;
    }

    public LogstashNodeTypeResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogstashNodeTypeResource(LogstashNodeTypeResource source) {
        if (source.NodeTypeName != null) {
            this.NodeTypeName = new String(source.NodeTypeName);
        }
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.NodeTypeInfo != null) {
            this.NodeTypeInfo = new NodeTypeInfo(source.NodeTypeInfo);
        }
        if (source.SsdAvailable != null) {
            this.SsdAvailable = new Boolean(source.SsdAvailable);
        }
        if (source.SsdDiskSizeRange != null) {
            this.SsdDiskSizeRange = new DiskSizeRange(source.SsdDiskSizeRange);
        }
        if (source.SsdSoldOutDetail != null) {
            this.SsdSoldOutDetail = new FamilyResourceStat[source.SsdSoldOutDetail.length];
            for (int i = 0; i < source.SsdSoldOutDetail.length; i++) {
                this.SsdSoldOutDetail[i] = new FamilyResourceStat(source.SsdSoldOutDetail[i]);
            }
        }
        if (source.SataAvailable != null) {
            this.SataAvailable = new Boolean(source.SataAvailable);
        }
        if (source.SataDiskSizeRange != null) {
            this.SataDiskSizeRange = new DiskSizeRange(source.SataDiskSizeRange);
        }
        if (source.SsdSoldOutReason != null) {
            this.SsdSoldOutReason = new String(source.SsdSoldOutReason);
        }
        if (source.SataSoldOutReason != null) {
            this.SataSoldOutReason = new String(source.SataSoldOutReason);
        }
        if (source.SataSoldOutDetail != null) {
            this.SataSoldOutDetail = new FamilyResourceStat[source.SataSoldOutDetail.length];
            for (int i = 0; i < source.SataSoldOutDetail.length; i++) {
                this.SataSoldOutDetail[i] = new FamilyResourceStat(source.SataSoldOutDetail[i]);
            }
        }
        if (source.LocalDiskInfo != null) {
            this.LocalDiskInfo = new LocalDiskInfo(source.LocalDiskInfo);
        }
        if (source.DiskCountRange != null) {
            this.DiskCountRange = new DiskCountRange(source.DiskCountRange);
        }
        if (source.HSsdAvailable != null) {
            this.HSsdAvailable = new Boolean(source.HSsdAvailable);
        }
        if (source.HSsdSoldOutReason != null) {
            this.HSsdSoldOutReason = new String(source.HSsdSoldOutReason);
        }
        if (source.HSsdSoldOutDetail != null) {
            this.HSsdSoldOutDetail = new FamilyResourceStat[source.HSsdSoldOutDetail.length];
            for (int i = 0; i < source.HSsdSoldOutDetail.length; i++) {
                this.HSsdSoldOutDetail[i] = new FamilyResourceStat(source.HSsdSoldOutDetail[i]);
            }
        }
        if (source.HSsdDiskSizeRange != null) {
            this.HSsdDiskSizeRange = new DiskSizeRange(source.HSsdDiskSizeRange);
        }
        if (source.ThroughputAvailable != null) {
            this.ThroughputAvailable = new Boolean(source.ThroughputAvailable);
        }
        if (source.ThroughputSoldOutReason != null) {
            this.ThroughputSoldOutReason = new String(source.ThroughputSoldOutReason);
        }
        if (source.ThroughputSoldOutDetail != null) {
            this.ThroughputSoldOutDetail = new FamilyResourceStat[source.ThroughputSoldOutDetail.length];
            for (int i = 0; i < source.ThroughputSoldOutDetail.length; i++) {
                this.ThroughputSoldOutDetail[i] = new FamilyResourceStat(source.ThroughputSoldOutDetail[i]);
            }
        }
        if (source.ThroughputDiskSizeRange != null) {
            this.ThroughputDiskSizeRange = new DiskSizeRange(source.ThroughputDiskSizeRange);
        }
        if (source.BigDataAvailable != null) {
            this.BigDataAvailable = new Boolean(source.BigDataAvailable);
        }
        if (source.BigDataSoldOutReason != null) {
            this.BigDataSoldOutReason = new String(source.BigDataSoldOutReason);
        }
        if (source.BigDataSoldOutDetail != null) {
            this.BigDataSoldOutDetail = new FamilyResourceStat[source.BigDataSoldOutDetail.length];
            for (int i = 0; i < source.BigDataSoldOutDetail.length; i++) {
                this.BigDataSoldOutDetail[i] = new FamilyResourceStat(source.BigDataSoldOutDetail[i]);
            }
        }
        if (source.BigDataDiskSizeRange != null) {
            this.BigDataDiskSizeRange = new DiskSizeRange(source.BigDataDiskSizeRange);
        }
        if (source.HighIOAvailable != null) {
            this.HighIOAvailable = new Boolean(source.HighIOAvailable);
        }
        if (source.HighIOSoldOutReason != null) {
            this.HighIOSoldOutReason = new String(source.HighIOSoldOutReason);
        }
        if (source.HighIOSoldOutDetail != null) {
            this.HighIOSoldOutDetail = new FamilyResourceStat[source.HighIOSoldOutDetail.length];
            for (int i = 0; i < source.HighIOSoldOutDetail.length; i++) {
                this.HighIOSoldOutDetail[i] = new FamilyResourceStat(source.HighIOSoldOutDetail[i]);
            }
        }
        if (source.HighIODiskSizeRange != null) {
            this.HighIODiskSizeRange = new DiskSizeRange(source.HighIODiskSizeRange);
        }
        if (source.BssdAvailable != null) {
            this.BssdAvailable = new Boolean(source.BssdAvailable);
        }
        if (source.BssdSoldOutReason != null) {
            this.BssdSoldOutReason = new String(source.BssdSoldOutReason);
        }
        if (source.BssdDiskSizeRange != null) {
            this.BssdDiskSizeRange = new DiskSizeRange(source.BssdDiskSizeRange);
        }
        if (source.BssdSoldOutDetail != null) {
            this.BssdSoldOutDetail = new FamilyResourceStat[source.BssdSoldOutDetail.length];
            for (int i = 0; i < source.BssdSoldOutDetail.length; i++) {
                this.BssdSoldOutDetail[i] = new FamilyResourceStat(source.BssdSoldOutDetail[i]);
            }
        }
        if (source.GpuInfo != null) {
            this.GpuInfo = new GpuInfo(source.GpuInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeTypeName", this.NodeTypeName);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamObj(map, prefix + "NodeTypeInfo.", this.NodeTypeInfo);
        this.setParamSimple(map, prefix + "SsdAvailable", this.SsdAvailable);
        this.setParamObj(map, prefix + "SsdDiskSizeRange.", this.SsdDiskSizeRange);
        this.setParamArrayObj(map, prefix + "SsdSoldOutDetail.", this.SsdSoldOutDetail);
        this.setParamSimple(map, prefix + "SataAvailable", this.SataAvailable);
        this.setParamObj(map, prefix + "SataDiskSizeRange.", this.SataDiskSizeRange);
        this.setParamSimple(map, prefix + "SsdSoldOutReason", this.SsdSoldOutReason);
        this.setParamSimple(map, prefix + "SataSoldOutReason", this.SataSoldOutReason);
        this.setParamArrayObj(map, prefix + "SataSoldOutDetail.", this.SataSoldOutDetail);
        this.setParamObj(map, prefix + "LocalDiskInfo.", this.LocalDiskInfo);
        this.setParamObj(map, prefix + "DiskCountRange.", this.DiskCountRange);
        this.setParamSimple(map, prefix + "HSsdAvailable", this.HSsdAvailable);
        this.setParamSimple(map, prefix + "HSsdSoldOutReason", this.HSsdSoldOutReason);
        this.setParamArrayObj(map, prefix + "HSsdSoldOutDetail.", this.HSsdSoldOutDetail);
        this.setParamObj(map, prefix + "HSsdDiskSizeRange.", this.HSsdDiskSizeRange);
        this.setParamSimple(map, prefix + "ThroughputAvailable", this.ThroughputAvailable);
        this.setParamSimple(map, prefix + "ThroughputSoldOutReason", this.ThroughputSoldOutReason);
        this.setParamArrayObj(map, prefix + "ThroughputSoldOutDetail.", this.ThroughputSoldOutDetail);
        this.setParamObj(map, prefix + "ThroughputDiskSizeRange.", this.ThroughputDiskSizeRange);
        this.setParamSimple(map, prefix + "BigDataAvailable", this.BigDataAvailable);
        this.setParamSimple(map, prefix + "BigDataSoldOutReason", this.BigDataSoldOutReason);
        this.setParamArrayObj(map, prefix + "BigDataSoldOutDetail.", this.BigDataSoldOutDetail);
        this.setParamObj(map, prefix + "BigDataDiskSizeRange.", this.BigDataDiskSizeRange);
        this.setParamSimple(map, prefix + "HighIOAvailable", this.HighIOAvailable);
        this.setParamSimple(map, prefix + "HighIOSoldOutReason", this.HighIOSoldOutReason);
        this.setParamArrayObj(map, prefix + "HighIOSoldOutDetail.", this.HighIOSoldOutDetail);
        this.setParamObj(map, prefix + "HighIODiskSizeRange.", this.HighIODiskSizeRange);
        this.setParamSimple(map, prefix + "BssdAvailable", this.BssdAvailable);
        this.setParamSimple(map, prefix + "BssdSoldOutReason", this.BssdSoldOutReason);
        this.setParamObj(map, prefix + "BssdDiskSizeRange.", this.BssdDiskSizeRange);
        this.setParamArrayObj(map, prefix + "BssdSoldOutDetail.", this.BssdSoldOutDetail);
        this.setParamObj(map, prefix + "GpuInfo.", this.GpuInfo);

    }
}

