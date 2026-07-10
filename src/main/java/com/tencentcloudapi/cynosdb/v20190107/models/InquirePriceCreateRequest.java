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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateRequest extends AbstractModel {

    /**
    * <p>可用区,每个地域提供最佳实践</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>购买计算节点个数</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS</p>
    */
    @SerializedName("InstancePayMode")
    @Expose
    private String InstancePayMode;

    /**
    * <p>存储购买类型，可选值为：PREPAID, POSTPAID</p>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private String StoragePayMode;

    /**
    * <p>实例设备类型，支持值如下：</p><ul><li>common：表示通用型</li><li>exclusive：表示独享型</li></ul>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>CPU核数，PREPAID与POSTPAID实例类型必传</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存大小，单位G，PREPAID与POSTPAID实例类型必传</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Ccu大小，serverless类型必传</p>
    */
    @SerializedName("Ccu")
    @Expose
    private Float Ccu;

    /**
    * <p>存储大小，PREPAID存储类型必传</p>
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * <p>购买时长，PREPAID购买类型必传</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>时长单位，可选值为：m,d。PREPAID购买类型必传</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>存储架构类型。 枚举值：1.0/2.0 默认值：1.0</p>
    */
    @SerializedName("StorageVersion")
    @Expose
    private String StorageVersion;

    /**
    * <p>存储是否跨AZ，2.0存储架构下有效</p>
    */
    @SerializedName("IsMultiAz")
    @Expose
    private Boolean IsMultiAz;

    /**
     * Get <p>可用区,每个地域提供最佳实践</p> 
     * @return Zone <p>可用区,每个地域提供最佳实践</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区,每个地域提供最佳实践</p>
     * @param Zone <p>可用区,每个地域提供最佳实践</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>购买计算节点个数</p> 
     * @return GoodsNum <p>购买计算节点个数</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>购买计算节点个数</p>
     * @param GoodsNum <p>购买计算节点个数</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS</p> 
     * @return InstancePayMode <p>实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS</p>
     */
    public String getInstancePayMode() {
        return this.InstancePayMode;
    }

    /**
     * Set <p>实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS</p>
     * @param InstancePayMode <p>实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS</p>
     */
    public void setInstancePayMode(String InstancePayMode) {
        this.InstancePayMode = InstancePayMode;
    }

    /**
     * Get <p>存储购买类型，可选值为：PREPAID, POSTPAID</p> 
     * @return StoragePayMode <p>存储购买类型，可选值为：PREPAID, POSTPAID</p>
     */
    public String getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>存储购买类型，可选值为：PREPAID, POSTPAID</p>
     * @param StoragePayMode <p>存储购买类型，可选值为：PREPAID, POSTPAID</p>
     */
    public void setStoragePayMode(String StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get <p>实例设备类型，支持值如下：</p><ul><li>common：表示通用型</li><li>exclusive：表示独享型</li></ul> 
     * @return DeviceType <p>实例设备类型，支持值如下：</p><ul><li>common：表示通用型</li><li>exclusive：表示独享型</li></ul>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>实例设备类型，支持值如下：</p><ul><li>common：表示通用型</li><li>exclusive：表示独享型</li></ul>
     * @param DeviceType <p>实例设备类型，支持值如下：</p><ul><li>common：表示通用型</li><li>exclusive：表示独享型</li></ul>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>CPU核数，PREPAID与POSTPAID实例类型必传</p> 
     * @return Cpu <p>CPU核数，PREPAID与POSTPAID实例类型必传</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU核数，PREPAID与POSTPAID实例类型必传</p>
     * @param Cpu <p>CPU核数，PREPAID与POSTPAID实例类型必传</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存大小，单位G，PREPAID与POSTPAID实例类型必传</p> 
     * @return Memory <p>内存大小，单位G，PREPAID与POSTPAID实例类型必传</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存大小，单位G，PREPAID与POSTPAID实例类型必传</p>
     * @param Memory <p>内存大小，单位G，PREPAID与POSTPAID实例类型必传</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Ccu大小，serverless类型必传</p> 
     * @return Ccu <p>Ccu大小，serverless类型必传</p>
     */
    public Float getCcu() {
        return this.Ccu;
    }

    /**
     * Set <p>Ccu大小，serverless类型必传</p>
     * @param Ccu <p>Ccu大小，serverless类型必传</p>
     */
    public void setCcu(Float Ccu) {
        this.Ccu = Ccu;
    }

    /**
     * Get <p>存储大小，PREPAID存储类型必传</p> 
     * @return StorageLimit <p>存储大小，PREPAID存储类型必传</p>
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set <p>存储大小，PREPAID存储类型必传</p>
     * @param StorageLimit <p>存储大小，PREPAID存储类型必传</p>
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get <p>购买时长，PREPAID购买类型必传</p> 
     * @return TimeSpan <p>购买时长，PREPAID购买类型必传</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>购买时长，PREPAID购买类型必传</p>
     * @param TimeSpan <p>购买时长，PREPAID购买类型必传</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>时长单位，可选值为：m,d。PREPAID购买类型必传</p> 
     * @return TimeUnit <p>时长单位，可选值为：m,d。PREPAID购买类型必传</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>时长单位，可选值为：m,d。PREPAID购买类型必传</p>
     * @param TimeUnit <p>时长单位，可选值为：m,d。PREPAID购买类型必传</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>存储架构类型。 枚举值：1.0/2.0 默认值：1.0</p> 
     * @return StorageVersion <p>存储架构类型。 枚举值：1.0/2.0 默认值：1.0</p>
     */
    public String getStorageVersion() {
        return this.StorageVersion;
    }

    /**
     * Set <p>存储架构类型。 枚举值：1.0/2.0 默认值：1.0</p>
     * @param StorageVersion <p>存储架构类型。 枚举值：1.0/2.0 默认值：1.0</p>
     */
    public void setStorageVersion(String StorageVersion) {
        this.StorageVersion = StorageVersion;
    }

    /**
     * Get <p>存储是否跨AZ，2.0存储架构下有效</p> 
     * @return IsMultiAz <p>存储是否跨AZ，2.0存储架构下有效</p>
     */
    public Boolean getIsMultiAz() {
        return this.IsMultiAz;
    }

    /**
     * Set <p>存储是否跨AZ，2.0存储架构下有效</p>
     * @param IsMultiAz <p>存储是否跨AZ，2.0存储架构下有效</p>
     */
    public void setIsMultiAz(Boolean IsMultiAz) {
        this.IsMultiAz = IsMultiAz;
    }

    public InquirePriceCreateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateRequest(InquirePriceCreateRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.InstancePayMode != null) {
            this.InstancePayMode = new String(source.InstancePayMode);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new String(source.StoragePayMode);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Ccu != null) {
            this.Ccu = new Float(source.Ccu);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.StorageVersion != null) {
            this.StorageVersion = new String(source.StorageVersion);
        }
        if (source.IsMultiAz != null) {
            this.IsMultiAz = new Boolean(source.IsMultiAz);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "InstancePayMode", this.InstancePayMode);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Ccu", this.Ccu);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "StorageVersion", this.StorageVersion);
        this.setParamSimple(map, prefix + "IsMultiAz", this.IsMultiAz);

    }
}

