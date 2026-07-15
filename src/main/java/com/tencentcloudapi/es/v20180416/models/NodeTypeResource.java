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

public class NodeTypeResource extends AbstractModel {

    /**
    * 规格名称
    */
    @SerializedName("NodeTypeName")
    @Expose
    private String NodeTypeName;

    /**
    * 是否可售
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * 规格信息
    */
    @SerializedName("NodeTypeInfo")
    @Expose
    private NodeTypeInfo NodeTypeInfo;

    /**
    * SSD盘是否可售
    */
    @SerializedName("SsdAvailable")
    @Expose
    private Boolean SsdAvailable;

    /**
    * SSD磁盘取值范围
    */
    @SerializedName("SsdDiskSizeRange")
    @Expose
    private DiskSizeRange SsdDiskSizeRange;

    /**
    * SATA盘是否可售
    */
    @SerializedName("SataAvailable")
    @Expose
    private Boolean SataAvailable;

    /**
    * SATA磁盘取值范围
    */
    @SerializedName("SataDiskSizeRange")
    @Expose
    private DiskSizeRange SataDiskSizeRange;

    /**
    * SSD机型售罄原因
    */
    @SerializedName("SsdSoldOutReason")
    @Expose
    private String SsdSoldOutReason;

    /**
    * SATA机型售罄原因
    */
    @SerializedName("SataSoldOutReason")
    @Expose
    private String SataSoldOutReason;

    /**
    * 本地盘信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalDiskInfo")
    @Expose
    private LocalDiskInfo LocalDiskInfo;

    /**
    * 云盘块数取值范围
    */
    @SerializedName("DiskCountRange")
    @Expose
    private DiskCountRange DiskCountRange;

    /**
    * HSSD盘是否可售
    */
    @SerializedName("HSsdAvailable")
    @Expose
    private Boolean HSsdAvailable;

    /**
    * HSSD机型售罄原因
    */
    @SerializedName("HSsdSoldOutReason")
    @Expose
    private String HSsdSoldOutReason;

    /**
    * HSSD磁盘取值范围
    */
    @SerializedName("HSsdDiskSizeRange")
    @Expose
    private DiskSizeRange HSsdDiskSizeRange;

    /**
    * Throughput盘是否可售
    */
    @SerializedName("ThroughputAvailable")
    @Expose
    private Boolean ThroughputAvailable;

    /**
    * Throughput机型售罄原因
    */
    @SerializedName("ThroughputSoldOutReason")
    @Expose
    private String ThroughputSoldOutReason;

    /**
    * Throughput磁盘取值范围
    */
    @SerializedName("ThroughputDiskSizeRange")
    @Expose
    private DiskSizeRange ThroughputDiskSizeRange;

    /**
    * BigData盘是否可售
    */
    @SerializedName("BigDataAvailable")
    @Expose
    private Boolean BigDataAvailable;

    /**
    * BigData盘售罄原因
    */
    @SerializedName("BigDataSoldOutReason")
    @Expose
    private String BigDataSoldOutReason;

    /**
    * BigData磁盘取值范围
    */
    @SerializedName("BigDataDiskSizeRange")
    @Expose
    private DiskSizeRange BigDataDiskSizeRange;

    /**
    * HighIO盘是否可售
    */
    @SerializedName("HighIOAvailable")
    @Expose
    private Boolean HighIOAvailable;

    /**
    * HighIO盘售罄原因
    */
    @SerializedName("HighIOSoldOutReason")
    @Expose
    private String HighIOSoldOutReason;

    /**
    * HighIO磁盘取值范围
    */
    @SerializedName("HighIODiskSizeRange")
    @Expose
    private DiskSizeRange HighIODiskSizeRange;

    /**
    * Bssd盘是否可售
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BssdAvailable")
    @Expose
    private Boolean BssdAvailable;

    /**
    * Bssd盘售罄原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BssdSoldOutReason")
    @Expose
    private String BssdSoldOutReason;

    /**
    * Bssd盘取值范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BssdDiskSizeRange")
    @Expose
    private DiskSizeRange BssdDiskSizeRange;

    /**
    * 节点Gpu信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuInfo")
    @Expose
    private GpuInfo GpuInfo;

    /**
     * Get 规格名称 
     * @return NodeTypeName 规格名称
     */
    public String getNodeTypeName() {
        return this.NodeTypeName;
    }

    /**
     * Set 规格名称
     * @param NodeTypeName 规格名称
     */
    public void setNodeTypeName(String NodeTypeName) {
        this.NodeTypeName = NodeTypeName;
    }

    /**
     * Get 是否可售 
     * @return Available 是否可售
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set 是否可售
     * @param Available 是否可售
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get 规格信息 
     * @return NodeTypeInfo 规格信息
     */
    public NodeTypeInfo getNodeTypeInfo() {
        return this.NodeTypeInfo;
    }

    /**
     * Set 规格信息
     * @param NodeTypeInfo 规格信息
     */
    public void setNodeTypeInfo(NodeTypeInfo NodeTypeInfo) {
        this.NodeTypeInfo = NodeTypeInfo;
    }

    /**
     * Get SSD盘是否可售 
     * @return SsdAvailable SSD盘是否可售
     */
    public Boolean getSsdAvailable() {
        return this.SsdAvailable;
    }

    /**
     * Set SSD盘是否可售
     * @param SsdAvailable SSD盘是否可售
     */
    public void setSsdAvailable(Boolean SsdAvailable) {
        this.SsdAvailable = SsdAvailable;
    }

    /**
     * Get SSD磁盘取值范围 
     * @return SsdDiskSizeRange SSD磁盘取值范围
     */
    public DiskSizeRange getSsdDiskSizeRange() {
        return this.SsdDiskSizeRange;
    }

    /**
     * Set SSD磁盘取值范围
     * @param SsdDiskSizeRange SSD磁盘取值范围
     */
    public void setSsdDiskSizeRange(DiskSizeRange SsdDiskSizeRange) {
        this.SsdDiskSizeRange = SsdDiskSizeRange;
    }

    /**
     * Get SATA盘是否可售 
     * @return SataAvailable SATA盘是否可售
     */
    public Boolean getSataAvailable() {
        return this.SataAvailable;
    }

    /**
     * Set SATA盘是否可售
     * @param SataAvailable SATA盘是否可售
     */
    public void setSataAvailable(Boolean SataAvailable) {
        this.SataAvailable = SataAvailable;
    }

    /**
     * Get SATA磁盘取值范围 
     * @return SataDiskSizeRange SATA磁盘取值范围
     */
    public DiskSizeRange getSataDiskSizeRange() {
        return this.SataDiskSizeRange;
    }

    /**
     * Set SATA磁盘取值范围
     * @param SataDiskSizeRange SATA磁盘取值范围
     */
    public void setSataDiskSizeRange(DiskSizeRange SataDiskSizeRange) {
        this.SataDiskSizeRange = SataDiskSizeRange;
    }

    /**
     * Get SSD机型售罄原因 
     * @return SsdSoldOutReason SSD机型售罄原因
     */
    public String getSsdSoldOutReason() {
        return this.SsdSoldOutReason;
    }

    /**
     * Set SSD机型售罄原因
     * @param SsdSoldOutReason SSD机型售罄原因
     */
    public void setSsdSoldOutReason(String SsdSoldOutReason) {
        this.SsdSoldOutReason = SsdSoldOutReason;
    }

    /**
     * Get SATA机型售罄原因 
     * @return SataSoldOutReason SATA机型售罄原因
     */
    public String getSataSoldOutReason() {
        return this.SataSoldOutReason;
    }

    /**
     * Set SATA机型售罄原因
     * @param SataSoldOutReason SATA机型售罄原因
     */
    public void setSataSoldOutReason(String SataSoldOutReason) {
        this.SataSoldOutReason = SataSoldOutReason;
    }

    /**
     * Get 本地盘信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalDiskInfo 本地盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LocalDiskInfo getLocalDiskInfo() {
        return this.LocalDiskInfo;
    }

    /**
     * Set 本地盘信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalDiskInfo 本地盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalDiskInfo(LocalDiskInfo LocalDiskInfo) {
        this.LocalDiskInfo = LocalDiskInfo;
    }

    /**
     * Get 云盘块数取值范围 
     * @return DiskCountRange 云盘块数取值范围
     */
    public DiskCountRange getDiskCountRange() {
        return this.DiskCountRange;
    }

    /**
     * Set 云盘块数取值范围
     * @param DiskCountRange 云盘块数取值范围
     */
    public void setDiskCountRange(DiskCountRange DiskCountRange) {
        this.DiskCountRange = DiskCountRange;
    }

    /**
     * Get HSSD盘是否可售 
     * @return HSsdAvailable HSSD盘是否可售
     */
    public Boolean getHSsdAvailable() {
        return this.HSsdAvailable;
    }

    /**
     * Set HSSD盘是否可售
     * @param HSsdAvailable HSSD盘是否可售
     */
    public void setHSsdAvailable(Boolean HSsdAvailable) {
        this.HSsdAvailable = HSsdAvailable;
    }

    /**
     * Get HSSD机型售罄原因 
     * @return HSsdSoldOutReason HSSD机型售罄原因
     */
    public String getHSsdSoldOutReason() {
        return this.HSsdSoldOutReason;
    }

    /**
     * Set HSSD机型售罄原因
     * @param HSsdSoldOutReason HSSD机型售罄原因
     */
    public void setHSsdSoldOutReason(String HSsdSoldOutReason) {
        this.HSsdSoldOutReason = HSsdSoldOutReason;
    }

    /**
     * Get HSSD磁盘取值范围 
     * @return HSsdDiskSizeRange HSSD磁盘取值范围
     */
    public DiskSizeRange getHSsdDiskSizeRange() {
        return this.HSsdDiskSizeRange;
    }

    /**
     * Set HSSD磁盘取值范围
     * @param HSsdDiskSizeRange HSSD磁盘取值范围
     */
    public void setHSsdDiskSizeRange(DiskSizeRange HSsdDiskSizeRange) {
        this.HSsdDiskSizeRange = HSsdDiskSizeRange;
    }

    /**
     * Get Throughput盘是否可售 
     * @return ThroughputAvailable Throughput盘是否可售
     */
    public Boolean getThroughputAvailable() {
        return this.ThroughputAvailable;
    }

    /**
     * Set Throughput盘是否可售
     * @param ThroughputAvailable Throughput盘是否可售
     */
    public void setThroughputAvailable(Boolean ThroughputAvailable) {
        this.ThroughputAvailable = ThroughputAvailable;
    }

    /**
     * Get Throughput机型售罄原因 
     * @return ThroughputSoldOutReason Throughput机型售罄原因
     */
    public String getThroughputSoldOutReason() {
        return this.ThroughputSoldOutReason;
    }

    /**
     * Set Throughput机型售罄原因
     * @param ThroughputSoldOutReason Throughput机型售罄原因
     */
    public void setThroughputSoldOutReason(String ThroughputSoldOutReason) {
        this.ThroughputSoldOutReason = ThroughputSoldOutReason;
    }

    /**
     * Get Throughput磁盘取值范围 
     * @return ThroughputDiskSizeRange Throughput磁盘取值范围
     */
    public DiskSizeRange getThroughputDiskSizeRange() {
        return this.ThroughputDiskSizeRange;
    }

    /**
     * Set Throughput磁盘取值范围
     * @param ThroughputDiskSizeRange Throughput磁盘取值范围
     */
    public void setThroughputDiskSizeRange(DiskSizeRange ThroughputDiskSizeRange) {
        this.ThroughputDiskSizeRange = ThroughputDiskSizeRange;
    }

    /**
     * Get BigData盘是否可售 
     * @return BigDataAvailable BigData盘是否可售
     */
    public Boolean getBigDataAvailable() {
        return this.BigDataAvailable;
    }

    /**
     * Set BigData盘是否可售
     * @param BigDataAvailable BigData盘是否可售
     */
    public void setBigDataAvailable(Boolean BigDataAvailable) {
        this.BigDataAvailable = BigDataAvailable;
    }

    /**
     * Get BigData盘售罄原因 
     * @return BigDataSoldOutReason BigData盘售罄原因
     */
    public String getBigDataSoldOutReason() {
        return this.BigDataSoldOutReason;
    }

    /**
     * Set BigData盘售罄原因
     * @param BigDataSoldOutReason BigData盘售罄原因
     */
    public void setBigDataSoldOutReason(String BigDataSoldOutReason) {
        this.BigDataSoldOutReason = BigDataSoldOutReason;
    }

    /**
     * Get BigData磁盘取值范围 
     * @return BigDataDiskSizeRange BigData磁盘取值范围
     */
    public DiskSizeRange getBigDataDiskSizeRange() {
        return this.BigDataDiskSizeRange;
    }

    /**
     * Set BigData磁盘取值范围
     * @param BigDataDiskSizeRange BigData磁盘取值范围
     */
    public void setBigDataDiskSizeRange(DiskSizeRange BigDataDiskSizeRange) {
        this.BigDataDiskSizeRange = BigDataDiskSizeRange;
    }

    /**
     * Get HighIO盘是否可售 
     * @return HighIOAvailable HighIO盘是否可售
     */
    public Boolean getHighIOAvailable() {
        return this.HighIOAvailable;
    }

    /**
     * Set HighIO盘是否可售
     * @param HighIOAvailable HighIO盘是否可售
     */
    public void setHighIOAvailable(Boolean HighIOAvailable) {
        this.HighIOAvailable = HighIOAvailable;
    }

    /**
     * Get HighIO盘售罄原因 
     * @return HighIOSoldOutReason HighIO盘售罄原因
     */
    public String getHighIOSoldOutReason() {
        return this.HighIOSoldOutReason;
    }

    /**
     * Set HighIO盘售罄原因
     * @param HighIOSoldOutReason HighIO盘售罄原因
     */
    public void setHighIOSoldOutReason(String HighIOSoldOutReason) {
        this.HighIOSoldOutReason = HighIOSoldOutReason;
    }

    /**
     * Get HighIO磁盘取值范围 
     * @return HighIODiskSizeRange HighIO磁盘取值范围
     */
    public DiskSizeRange getHighIODiskSizeRange() {
        return this.HighIODiskSizeRange;
    }

    /**
     * Set HighIO磁盘取值范围
     * @param HighIODiskSizeRange HighIO磁盘取值范围
     */
    public void setHighIODiskSizeRange(DiskSizeRange HighIODiskSizeRange) {
        this.HighIODiskSizeRange = HighIODiskSizeRange;
    }

    /**
     * Get Bssd盘是否可售
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BssdAvailable Bssd盘是否可售
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBssdAvailable() {
        return this.BssdAvailable;
    }

    /**
     * Set Bssd盘是否可售
注意：此字段可能返回 null，表示取不到有效值。
     * @param BssdAvailable Bssd盘是否可售
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBssdAvailable(Boolean BssdAvailable) {
        this.BssdAvailable = BssdAvailable;
    }

    /**
     * Get Bssd盘售罄原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BssdSoldOutReason Bssd盘售罄原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBssdSoldOutReason() {
        return this.BssdSoldOutReason;
    }

    /**
     * Set Bssd盘售罄原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param BssdSoldOutReason Bssd盘售罄原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBssdSoldOutReason(String BssdSoldOutReason) {
        this.BssdSoldOutReason = BssdSoldOutReason;
    }

    /**
     * Get Bssd盘取值范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BssdDiskSizeRange Bssd盘取值范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiskSizeRange getBssdDiskSizeRange() {
        return this.BssdDiskSizeRange;
    }

    /**
     * Set Bssd盘取值范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param BssdDiskSizeRange Bssd盘取值范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBssdDiskSizeRange(DiskSizeRange BssdDiskSizeRange) {
        this.BssdDiskSizeRange = BssdDiskSizeRange;
    }

    /**
     * Get 节点Gpu信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuInfo 节点Gpu信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GpuInfo getGpuInfo() {
        return this.GpuInfo;
    }

    /**
     * Set 节点Gpu信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuInfo 节点Gpu信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuInfo(GpuInfo GpuInfo) {
        this.GpuInfo = GpuInfo;
    }

    public NodeTypeResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeTypeResource(NodeTypeResource source) {
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
        if (source.HSsdDiskSizeRange != null) {
            this.HSsdDiskSizeRange = new DiskSizeRange(source.HSsdDiskSizeRange);
        }
        if (source.ThroughputAvailable != null) {
            this.ThroughputAvailable = new Boolean(source.ThroughputAvailable);
        }
        if (source.ThroughputSoldOutReason != null) {
            this.ThroughputSoldOutReason = new String(source.ThroughputSoldOutReason);
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
        if (source.BigDataDiskSizeRange != null) {
            this.BigDataDiskSizeRange = new DiskSizeRange(source.BigDataDiskSizeRange);
        }
        if (source.HighIOAvailable != null) {
            this.HighIOAvailable = new Boolean(source.HighIOAvailable);
        }
        if (source.HighIOSoldOutReason != null) {
            this.HighIOSoldOutReason = new String(source.HighIOSoldOutReason);
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
        this.setParamSimple(map, prefix + "SataAvailable", this.SataAvailable);
        this.setParamObj(map, prefix + "SataDiskSizeRange.", this.SataDiskSizeRange);
        this.setParamSimple(map, prefix + "SsdSoldOutReason", this.SsdSoldOutReason);
        this.setParamSimple(map, prefix + "SataSoldOutReason", this.SataSoldOutReason);
        this.setParamObj(map, prefix + "LocalDiskInfo.", this.LocalDiskInfo);
        this.setParamObj(map, prefix + "DiskCountRange.", this.DiskCountRange);
        this.setParamSimple(map, prefix + "HSsdAvailable", this.HSsdAvailable);
        this.setParamSimple(map, prefix + "HSsdSoldOutReason", this.HSsdSoldOutReason);
        this.setParamObj(map, prefix + "HSsdDiskSizeRange.", this.HSsdDiskSizeRange);
        this.setParamSimple(map, prefix + "ThroughputAvailable", this.ThroughputAvailable);
        this.setParamSimple(map, prefix + "ThroughputSoldOutReason", this.ThroughputSoldOutReason);
        this.setParamObj(map, prefix + "ThroughputDiskSizeRange.", this.ThroughputDiskSizeRange);
        this.setParamSimple(map, prefix + "BigDataAvailable", this.BigDataAvailable);
        this.setParamSimple(map, prefix + "BigDataSoldOutReason", this.BigDataSoldOutReason);
        this.setParamObj(map, prefix + "BigDataDiskSizeRange.", this.BigDataDiskSizeRange);
        this.setParamSimple(map, prefix + "HighIOAvailable", this.HighIOAvailable);
        this.setParamSimple(map, prefix + "HighIOSoldOutReason", this.HighIOSoldOutReason);
        this.setParamObj(map, prefix + "HighIODiskSizeRange.", this.HighIODiskSizeRange);
        this.setParamSimple(map, prefix + "BssdAvailable", this.BssdAvailable);
        this.setParamSimple(map, prefix + "BssdSoldOutReason", this.BssdSoldOutReason);
        this.setParamObj(map, prefix + "BssdDiskSizeRange.", this.BssdDiskSizeRange);
        this.setParamObj(map, prefix + "GpuInfo.", this.GpuInfo);

    }
}

