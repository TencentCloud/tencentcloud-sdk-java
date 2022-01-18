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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cdc extends AbstractModel{

    /**
    * 独享集群围笼ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
    * 独享集群状态。取值范围：<br><li>NORMAL：正常；<br><li>CLOSED：关闭，此时将不可使用该独享集群创建新的云硬盘；<br><li>FAULT：独享集群状态异常，此时独享集群将不可操作，腾讯云运维团队将会及时修复该集群；<br><li>ISOLATED：因未及时续费导致独享集群被隔离，此时将不可使用该独享集群创建新的云硬盘，对应的云硬盘也将不可操作。
    */
    @SerializedName("CdcState")
    @Expose
    private String CdcState;

    /**
    * 独享集群所属的[可用区](/document/product/213/15753#ZoneInfo)ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 独享集群实例名称。
    */
    @SerializedName("CdcName")
    @Expose
    private String CdcName;

    /**
    * 独享集群的资源容量大小。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdcResource")
    @Expose
    private CdcSize CdcResource;

    /**
    * 独享集群实例id。
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * 独享集群类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘集群<br><li>CLOUD_PREMIUM：表示高性能云硬盘集群<br><li>CLOUD_SSD：SSD表示SSD云硬盘集群。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 独享集群到期时间。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
     * Get 独享集群围笼ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CageId 独享集群围笼ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCageId() {
        return this.CageId;
    }

    /**
     * Set 独享集群围笼ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CageId 独享集群围笼ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCageId(String CageId) {
        this.CageId = CageId;
    }

    /**
     * Get 独享集群状态。取值范围：<br><li>NORMAL：正常；<br><li>CLOSED：关闭，此时将不可使用该独享集群创建新的云硬盘；<br><li>FAULT：独享集群状态异常，此时独享集群将不可操作，腾讯云运维团队将会及时修复该集群；<br><li>ISOLATED：因未及时续费导致独享集群被隔离，此时将不可使用该独享集群创建新的云硬盘，对应的云硬盘也将不可操作。 
     * @return CdcState 独享集群状态。取值范围：<br><li>NORMAL：正常；<br><li>CLOSED：关闭，此时将不可使用该独享集群创建新的云硬盘；<br><li>FAULT：独享集群状态异常，此时独享集群将不可操作，腾讯云运维团队将会及时修复该集群；<br><li>ISOLATED：因未及时续费导致独享集群被隔离，此时将不可使用该独享集群创建新的云硬盘，对应的云硬盘也将不可操作。
     */
    public String getCdcState() {
        return this.CdcState;
    }

    /**
     * Set 独享集群状态。取值范围：<br><li>NORMAL：正常；<br><li>CLOSED：关闭，此时将不可使用该独享集群创建新的云硬盘；<br><li>FAULT：独享集群状态异常，此时独享集群将不可操作，腾讯云运维团队将会及时修复该集群；<br><li>ISOLATED：因未及时续费导致独享集群被隔离，此时将不可使用该独享集群创建新的云硬盘，对应的云硬盘也将不可操作。
     * @param CdcState 独享集群状态。取值范围：<br><li>NORMAL：正常；<br><li>CLOSED：关闭，此时将不可使用该独享集群创建新的云硬盘；<br><li>FAULT：独享集群状态异常，此时独享集群将不可操作，腾讯云运维团队将会及时修复该集群；<br><li>ISOLATED：因未及时续费导致独享集群被隔离，此时将不可使用该独享集群创建新的云硬盘，对应的云硬盘也将不可操作。
     */
    public void setCdcState(String CdcState) {
        this.CdcState = CdcState;
    }

    /**
     * Get 独享集群所属的[可用区](/document/product/213/15753#ZoneInfo)ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 独享集群所属的[可用区](/document/product/213/15753#ZoneInfo)ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 独享集群所属的[可用区](/document/product/213/15753#ZoneInfo)ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 独享集群所属的[可用区](/document/product/213/15753#ZoneInfo)ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 独享集群实例名称。 
     * @return CdcName 独享集群实例名称。
     */
    public String getCdcName() {
        return this.CdcName;
    }

    /**
     * Set 独享集群实例名称。
     * @param CdcName 独享集群实例名称。
     */
    public void setCdcName(String CdcName) {
        this.CdcName = CdcName;
    }

    /**
     * Get 独享集群的资源容量大小。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdcResource 独享集群的资源容量大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CdcSize getCdcResource() {
        return this.CdcResource;
    }

    /**
     * Set 独享集群的资源容量大小。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdcResource 独享集群的资源容量大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdcResource(CdcSize CdcResource) {
        this.CdcResource = CdcResource;
    }

    /**
     * Get 独享集群实例id。 
     * @return CdcId 独享集群实例id。
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set 独享集群实例id。
     * @param CdcId 独享集群实例id。
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get 独享集群类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘集群<br><li>CLOUD_PREMIUM：表示高性能云硬盘集群<br><li>CLOUD_SSD：SSD表示SSD云硬盘集群。 
     * @return DiskType 独享集群类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘集群<br><li>CLOUD_PREMIUM：表示高性能云硬盘集群<br><li>CLOUD_SSD：SSD表示SSD云硬盘集群。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 独享集群类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘集群<br><li>CLOUD_PREMIUM：表示高性能云硬盘集群<br><li>CLOUD_SSD：SSD表示SSD云硬盘集群。
     * @param DiskType 独享集群类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘集群<br><li>CLOUD_PREMIUM：表示高性能云硬盘集群<br><li>CLOUD_SSD：SSD表示SSD云硬盘集群。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 独享集群到期时间。 
     * @return ExpiredTime 独享集群到期时间。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 独享集群到期时间。
     * @param ExpiredTime 独享集群到期时间。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public Cdc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cdc(Cdc source) {
        if (source.CageId != null) {
            this.CageId = new String(source.CageId);
        }
        if (source.CdcState != null) {
            this.CdcState = new String(source.CdcState);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CdcName != null) {
            this.CdcName = new String(source.CdcName);
        }
        if (source.CdcResource != null) {
            this.CdcResource = new CdcSize(source.CdcResource);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CageId", this.CageId);
        this.setParamSimple(map, prefix + "CdcState", this.CdcState);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CdcName", this.CdcName);
        this.setParamObj(map, prefix + "CdcResource.", this.CdcResource);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

