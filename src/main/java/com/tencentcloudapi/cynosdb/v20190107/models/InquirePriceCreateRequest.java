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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateRequest extends AbstractModel{

    /**
    * 可用区,每个地域提供最佳实践
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 购买计算节点个数
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS
    */
    @SerializedName("InstancePayMode")
    @Expose
    private String InstancePayMode;

    /**
    * 存储购买类型，可选值为：PREPAID, POSTPAID
    */
    @SerializedName("StoragePayMode")
    @Expose
    private String StoragePayMode;

    /**
    * CPU核数，PREPAID与POSTPAID实例类型必传
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小，单位G，PREPAID与POSTPAID实例类型必传
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Ccu大小，serverless类型必传
    */
    @SerializedName("Ccu")
    @Expose
    private Float Ccu;

    /**
    * 存储大小，PREPAID存储类型必传
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * 购买时长，PREPAID购买类型必传
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 时长单位，可选值为：m,d。PREPAID购买类型必传
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
     * Get 可用区,每个地域提供最佳实践 
     * @return Zone 可用区,每个地域提供最佳实践
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区,每个地域提供最佳实践
     * @param Zone 可用区,每个地域提供最佳实践
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 购买计算节点个数 
     * @return GoodsNum 购买计算节点个数
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 购买计算节点个数
     * @param GoodsNum 购买计算节点个数
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS 
     * @return InstancePayMode 实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS
     */
    public String getInstancePayMode() {
        return this.InstancePayMode;
    }

    /**
     * Set 实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS
     * @param InstancePayMode 实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS
     */
    public void setInstancePayMode(String InstancePayMode) {
        this.InstancePayMode = InstancePayMode;
    }

    /**
     * Get 存储购买类型，可选值为：PREPAID, POSTPAID 
     * @return StoragePayMode 存储购买类型，可选值为：PREPAID, POSTPAID
     */
    public String getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set 存储购买类型，可选值为：PREPAID, POSTPAID
     * @param StoragePayMode 存储购买类型，可选值为：PREPAID, POSTPAID
     */
    public void setStoragePayMode(String StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get CPU核数，PREPAID与POSTPAID实例类型必传 
     * @return Cpu CPU核数，PREPAID与POSTPAID实例类型必传
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数，PREPAID与POSTPAID实例类型必传
     * @param Cpu CPU核数，PREPAID与POSTPAID实例类型必传
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小，单位G，PREPAID与POSTPAID实例类型必传 
     * @return Memory 内存大小，单位G，PREPAID与POSTPAID实例类型必传
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位G，PREPAID与POSTPAID实例类型必传
     * @param Memory 内存大小，单位G，PREPAID与POSTPAID实例类型必传
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Ccu大小，serverless类型必传 
     * @return Ccu Ccu大小，serverless类型必传
     */
    public Float getCcu() {
        return this.Ccu;
    }

    /**
     * Set Ccu大小，serverless类型必传
     * @param Ccu Ccu大小，serverless类型必传
     */
    public void setCcu(Float Ccu) {
        this.Ccu = Ccu;
    }

    /**
     * Get 存储大小，PREPAID存储类型必传 
     * @return StorageLimit 存储大小，PREPAID存储类型必传
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 存储大小，PREPAID存储类型必传
     * @param StorageLimit 存储大小，PREPAID存储类型必传
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 购买时长，PREPAID购买类型必传 
     * @return TimeSpan 购买时长，PREPAID购买类型必传
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长，PREPAID购买类型必传
     * @param TimeSpan 购买时长，PREPAID购买类型必传
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 时长单位，可选值为：m,d。PREPAID购买类型必传 
     * @return TimeUnit 时长单位，可选值为：m,d。PREPAID购买类型必传
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时长单位，可选值为：m,d。PREPAID购买类型必传
     * @param TimeUnit 时长单位，可选值为：m,d。PREPAID购买类型必传
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "InstancePayMode", this.InstancePayMode);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Ccu", this.Ccu);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);

    }
}

