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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskConfig extends AbstractModel {

    /**
    * <p>可用区。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>云硬盘类型。枚举值如下：</p><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>云硬盘可售卖状态。</p>
    */
    @SerializedName("DiskSalesState")
    @Expose
    private String DiskSalesState;

    /**
    * <p>最大云硬盘大小。</p><p>单位：GB</p>
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * <p>最小云硬盘大小。</p><p>单位：GB</p>
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Long MinDiskSize;

    /**
    * <p>云硬盘步长。</p><p>单位：GB</p>
    */
    @SerializedName("DiskStepSize")
    @Expose
    private Long DiskStepSize;

    /**
     * Get <p>可用区。</p> 
     * @return Zone <p>可用区。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区。</p>
     * @param Zone <p>可用区。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>云硬盘类型。枚举值如下：</p><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li> 
     * @return DiskType <p>云硬盘类型。枚举值如下：</p><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>云硬盘类型。枚举值如下：</p><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li>
     * @param DiskType <p>云硬盘类型。枚举值如下：</p><li>CLOUD_BASIC：普通云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_SSD：SSD云硬盘</li>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>云硬盘可售卖状态。</p> 
     * @return DiskSalesState <p>云硬盘可售卖状态。</p>
     */
    public String getDiskSalesState() {
        return this.DiskSalesState;
    }

    /**
     * Set <p>云硬盘可售卖状态。</p>
     * @param DiskSalesState <p>云硬盘可售卖状态。</p>
     */
    public void setDiskSalesState(String DiskSalesState) {
        this.DiskSalesState = DiskSalesState;
    }

    /**
     * Get <p>最大云硬盘大小。</p><p>单位：GB</p> 
     * @return MaxDiskSize <p>最大云硬盘大小。</p><p>单位：GB</p>
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set <p>最大云硬盘大小。</p><p>单位：GB</p>
     * @param MaxDiskSize <p>最大云硬盘大小。</p><p>单位：GB</p>
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get <p>最小云硬盘大小。</p><p>单位：GB</p> 
     * @return MinDiskSize <p>最小云硬盘大小。</p><p>单位：GB</p>
     */
    public Long getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * Set <p>最小云硬盘大小。</p><p>单位：GB</p>
     * @param MinDiskSize <p>最小云硬盘大小。</p><p>单位：GB</p>
     */
    public void setMinDiskSize(Long MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * Get <p>云硬盘步长。</p><p>单位：GB</p> 
     * @return DiskStepSize <p>云硬盘步长。</p><p>单位：GB</p>
     */
    public Long getDiskStepSize() {
        return this.DiskStepSize;
    }

    /**
     * Set <p>云硬盘步长。</p><p>单位：GB</p>
     * @param DiskStepSize <p>云硬盘步长。</p><p>单位：GB</p>
     */
    public void setDiskStepSize(Long DiskStepSize) {
        this.DiskStepSize = DiskStepSize;
    }

    public DiskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskConfig(DiskConfig source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSalesState != null) {
            this.DiskSalesState = new String(source.DiskSalesState);
        }
        if (source.MaxDiskSize != null) {
            this.MaxDiskSize = new Long(source.MaxDiskSize);
        }
        if (source.MinDiskSize != null) {
            this.MinDiskSize = new Long(source.MinDiskSize);
        }
        if (source.DiskStepSize != null) {
            this.DiskStepSize = new Long(source.DiskStepSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSalesState", this.DiskSalesState);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamSimple(map, prefix + "MinDiskSize", this.MinDiskSize);
        this.setParamSimple(map, prefix + "DiskStepSize", this.DiskStepSize);

    }
}

