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

public class GoodsSpec extends AbstractModel {

    /**
    * 商品数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * CPU核数，PREPAID与POSTPAID实例类型必传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小，单位G，PREPAID与POSTPAID实例类型必传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Ccu大小，serverless类型必传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ccu")
    @Expose
    private Float Ccu;

    /**
    * 存储大小，PREPAID存储类型必传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * 购买时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 时长单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 机器类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get 商品数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GoodsNum 商品数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 商品数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsNum 商品数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get CPU核数，PREPAID与POSTPAID实例类型必传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu CPU核数，PREPAID与POSTPAID实例类型必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数，PREPAID与POSTPAID实例类型必传
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu CPU核数，PREPAID与POSTPAID实例类型必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小，单位G，PREPAID与POSTPAID实例类型必传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 内存大小，单位G，PREPAID与POSTPAID实例类型必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位G，PREPAID与POSTPAID实例类型必传
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存大小，单位G，PREPAID与POSTPAID实例类型必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Ccu大小，serverless类型必传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ccu Ccu大小，serverless类型必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCcu() {
        return this.Ccu;
    }

    /**
     * Set Ccu大小，serverless类型必传
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ccu Ccu大小，serverless类型必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcu(Float Ccu) {
        this.Ccu = Ccu;
    }

    /**
     * Get 存储大小，PREPAID存储类型必传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageLimit 存储大小，PREPAID存储类型必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 存储大小，PREPAID存储类型必传
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageLimit 存储大小，PREPAID存储类型必传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 购买时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeSpan 购买时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeSpan 购买时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 时长单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeUnit 时长单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时长单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeUnit 时长单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 机器类型 
     * @return DeviceType 机器类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 机器类型
     * @param DeviceType 机器类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public GoodsSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GoodsSpec(GoodsSpec source) {
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
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
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Ccu", this.Ccu);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

