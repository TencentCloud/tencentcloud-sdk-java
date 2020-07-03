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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBPriceRequest extends AbstractModel{

    /**
    * 可用区信息，格式如 "ap-guangzhou-2"。具体能设置的值请通过 <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> 接口查询。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例数量，默认值为 1，最小值 1，最大值为 100。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 实例内存大小，单位：MB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例硬盘大小，单位：GB。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 付费类型，支持值包括：PRE_PAID - 包年包月，HOUR_PAID - 按量计费。
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 实例时长，单位：月，最小值 1，最大值为 36；查询按量计费价格时，该字段无效。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 实例类型，默认为 master，支持值包括：master - 表示主实例，ro - 表示只读实例，dr - 表示灾备实例。
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
     * Get 可用区信息，格式如 "ap-guangzhou-2"。具体能设置的值请通过 <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> 接口查询。 
     * @return Zone 可用区信息，格式如 "ap-guangzhou-2"。具体能设置的值请通过 <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> 接口查询。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息，格式如 "ap-guangzhou-2"。具体能设置的值请通过 <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> 接口查询。
     * @param Zone 可用区信息，格式如 "ap-guangzhou-2"。具体能设置的值请通过 <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> 接口查询。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例数量，默认值为 1，最小值 1，最大值为 100。 
     * @return GoodsNum 实例数量，默认值为 1，最小值 1，最大值为 100。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 实例数量，默认值为 1，最小值 1，最大值为 100。
     * @param GoodsNum 实例数量，默认值为 1，最小值 1，最大值为 100。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 实例内存大小，单位：MB。 
     * @return Memory 实例内存大小，单位：MB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位：MB。
     * @param Memory 实例内存大小，单位：MB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例硬盘大小，单位：GB。 
     * @return Volume 实例硬盘大小，单位：GB。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例硬盘大小，单位：GB。
     * @param Volume 实例硬盘大小，单位：GB。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 付费类型，支持值包括：PRE_PAID - 包年包月，HOUR_PAID - 按量计费。 
     * @return PayType 付费类型，支持值包括：PRE_PAID - 包年包月，HOUR_PAID - 按量计费。
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 付费类型，支持值包括：PRE_PAID - 包年包月，HOUR_PAID - 按量计费。
     * @param PayType 付费类型，支持值包括：PRE_PAID - 包年包月，HOUR_PAID - 按量计费。
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 实例时长，单位：月，最小值 1，最大值为 36；查询按量计费价格时，该字段无效。 
     * @return Period 实例时长，单位：月，最小值 1，最大值为 36；查询按量计费价格时，该字段无效。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 实例时长，单位：月，最小值 1，最大值为 36；查询按量计费价格时，该字段无效。
     * @param Period 实例时长，单位：月，最小值 1，最大值为 36；查询按量计费价格时，该字段无效。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 实例类型，默认为 master，支持值包括：master - 表示主实例，ro - 表示只读实例，dr - 表示灾备实例。 
     * @return InstanceRole 实例类型，默认为 master，支持值包括：master - 表示主实例，ro - 表示只读实例，dr - 表示灾备实例。
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 实例类型，默认为 master，支持值包括：master - 表示主实例，ro - 表示只读实例，dr - 表示灾备实例。
     * @param InstanceRole 实例类型，默认为 master，支持值包括：master - 表示主实例，ro - 表示只读实例，dr - 表示灾备实例。
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。 
     * @return ProtectMode 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。
     * @param ProtectMode 数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);

    }
}

