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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskConfig extends AbstractModel{

    /**
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 云硬盘类型。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 云硬盘可售卖状态。
    */
    @SerializedName("DiskSalesState")
    @Expose
    private String DiskSalesState;

    /**
    * 最大云硬盘大小。
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * 最小云硬盘大小。
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Long MinDiskSize;

    /**
    * 云硬盘步长。
    */
    @SerializedName("DiskStepSize")
    @Expose
    private Long DiskStepSize;

    /**
     * Get 可用区。 
     * @return Zone 可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。
     * @param Zone 可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 云硬盘类型。 
     * @return DiskType 云硬盘类型。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 云硬盘类型。
     * @param DiskType 云硬盘类型。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 云硬盘可售卖状态。 
     * @return DiskSalesState 云硬盘可售卖状态。
     */
    public String getDiskSalesState() {
        return this.DiskSalesState;
    }

    /**
     * Set 云硬盘可售卖状态。
     * @param DiskSalesState 云硬盘可售卖状态。
     */
    public void setDiskSalesState(String DiskSalesState) {
        this.DiskSalesState = DiskSalesState;
    }

    /**
     * Get 最大云硬盘大小。 
     * @return MaxDiskSize 最大云硬盘大小。
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set 最大云硬盘大小。
     * @param MaxDiskSize 最大云硬盘大小。
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get 最小云硬盘大小。 
     * @return MinDiskSize 最小云硬盘大小。
     */
    public Long getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * Set 最小云硬盘大小。
     * @param MinDiskSize 最小云硬盘大小。
     */
    public void setMinDiskSize(Long MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * Get 云硬盘步长。 
     * @return DiskStepSize 云硬盘步长。
     */
    public Long getDiskStepSize() {
        return this.DiskStepSize;
    }

    /**
     * Set 云硬盘步长。
     * @param DiskStepSize 云硬盘步长。
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

