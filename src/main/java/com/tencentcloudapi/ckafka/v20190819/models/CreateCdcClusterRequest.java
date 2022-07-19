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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCdcClusterRequest extends AbstractModel{

    /**
    * cdc的id
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * vpcId,一个地域只有唯一一个vpcid用于CDC
    */
    @SerializedName("CdcVpcId")
    @Expose
    private String CdcVpcId;

    /**
    * 每个CDC集群有唯一一个子网ID
    */
    @SerializedName("CdcSubnetId")
    @Expose
    private String CdcSubnetId;

    /**
    * 所在可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * cdc集群的总带宽
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * cdc集群的总磁盘
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 数据盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 系统盘类型
    */
    @SerializedName("SystemDiskType")
    @Expose
    private String SystemDiskType;

    /**
     * Get cdc的id 
     * @return CdcId cdc的id
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set cdc的id
     * @param CdcId cdc的id
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get vpcId,一个地域只有唯一一个vpcid用于CDC 
     * @return CdcVpcId vpcId,一个地域只有唯一一个vpcid用于CDC
     */
    public String getCdcVpcId() {
        return this.CdcVpcId;
    }

    /**
     * Set vpcId,一个地域只有唯一一个vpcid用于CDC
     * @param CdcVpcId vpcId,一个地域只有唯一一个vpcid用于CDC
     */
    public void setCdcVpcId(String CdcVpcId) {
        this.CdcVpcId = CdcVpcId;
    }

    /**
     * Get 每个CDC集群有唯一一个子网ID 
     * @return CdcSubnetId 每个CDC集群有唯一一个子网ID
     */
    public String getCdcSubnetId() {
        return this.CdcSubnetId;
    }

    /**
     * Set 每个CDC集群有唯一一个子网ID
     * @param CdcSubnetId 每个CDC集群有唯一一个子网ID
     */
    public void setCdcSubnetId(String CdcSubnetId) {
        this.CdcSubnetId = CdcSubnetId;
    }

    /**
     * Get 所在可用区ID 
     * @return ZoneId 所在可用区ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 所在可用区ID
     * @param ZoneId 所在可用区ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get cdc集群的总带宽 
     * @return Bandwidth cdc集群的总带宽
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set cdc集群的总带宽
     * @param Bandwidth cdc集群的总带宽
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get cdc集群的总磁盘 
     * @return DiskSize cdc集群的总磁盘
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set cdc集群的总磁盘
     * @param DiskSize cdc集群的总磁盘
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 数据盘类型 
     * @return DiskType 数据盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 数据盘类型
     * @param DiskType 数据盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 系统盘类型 
     * @return SystemDiskType 系统盘类型
     */
    public String getSystemDiskType() {
        return this.SystemDiskType;
    }

    /**
     * Set 系统盘类型
     * @param SystemDiskType 系统盘类型
     */
    public void setSystemDiskType(String SystemDiskType) {
        this.SystemDiskType = SystemDiskType;
    }

    public CreateCdcClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCdcClusterRequest(CreateCdcClusterRequest source) {
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.CdcVpcId != null) {
            this.CdcVpcId = new String(source.CdcVpcId);
        }
        if (source.CdcSubnetId != null) {
            this.CdcSubnetId = new String(source.CdcSubnetId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.SystemDiskType != null) {
            this.SystemDiskType = new String(source.SystemDiskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "CdcVpcId", this.CdcVpcId);
        this.setParamSimple(map, prefix + "CdcSubnetId", this.CdcSubnetId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "SystemDiskType", this.SystemDiskType);

    }
}

