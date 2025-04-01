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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDCDBPriceRequest extends AbstractModel {

    /**
    * 欲新购实例的可用区ID。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 欲购买实例的数量，目前支持购买1-10个实例
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 欲购买的时长，单位：月。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 单个分片节点个数大小，可以通过 DescribeShardSpec
 查询实例规格获得。
    */
    @SerializedName("ShardNodeCount")
    @Expose
    private Long ShardNodeCount;

    /**
    * 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
    */
    @SerializedName("ShardMemory")
    @Expose
    private Long ShardMemory;

    /**
    * 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
    */
    @SerializedName("ShardStorage")
    @Expose
    private Long ShardStorage;

    /**
    * 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * 付费类型。postpaid：按量付费   prepaid：预付费
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * 价格金额单位，不传默认单位为分，取值：  
* pent：分
* microPent：微分
    */
    @SerializedName("AmountUnit")
    @Expose
    private String AmountUnit;

    /**
    * Cpu类型，如：英特尔：Intel/AMD，海光：Hygon，默认Intel/AMD
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
     * Get 欲新购实例的可用区ID。 
     * @return Zone 欲新购实例的可用区ID。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 欲新购实例的可用区ID。
     * @param Zone 欲新购实例的可用区ID。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 欲购买实例的数量，目前支持购买1-10个实例 
     * @return Count 欲购买实例的数量，目前支持购买1-10个实例
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 欲购买实例的数量，目前支持购买1-10个实例
     * @param Count 欲购买实例的数量，目前支持购买1-10个实例
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 欲购买的时长，单位：月。 
     * @return Period 欲购买的时长，单位：月。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 欲购买的时长，单位：月。
     * @param Period 欲购买的时长，单位：月。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 单个分片节点个数大小，可以通过 DescribeShardSpec
 查询实例规格获得。 
     * @return ShardNodeCount 单个分片节点个数大小，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public Long getShardNodeCount() {
        return this.ShardNodeCount;
    }

    /**
     * Set 单个分片节点个数大小，可以通过 DescribeShardSpec
 查询实例规格获得。
     * @param ShardNodeCount 单个分片节点个数大小，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public void setShardNodeCount(Long ShardNodeCount) {
        this.ShardNodeCount = ShardNodeCount;
    }

    /**
     * Get 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。 
     * @return ShardMemory 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public Long getShardMemory() {
        return this.ShardMemory;
    }

    /**
     * Set 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     * @param ShardMemory 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public void setShardMemory(Long ShardMemory) {
        this.ShardMemory = ShardMemory;
    }

    /**
     * Get 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。 
     * @return ShardStorage 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public Long getShardStorage() {
        return this.ShardStorage;
    }

    /**
     * Set 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     * @param ShardStorage 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public void setShardStorage(Long ShardStorage) {
        this.ShardStorage = ShardStorage;
    }

    /**
     * Get 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。 
     * @return ShardCount 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
     * @param ShardCount 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get 付费类型。postpaid：按量付费   prepaid：预付费 
     * @return Paymode 付费类型。postpaid：按量付费   prepaid：预付费
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set 付费类型。postpaid：按量付费   prepaid：预付费
     * @param Paymode 付费类型。postpaid：按量付费   prepaid：预付费
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * Get 价格金额单位，不传默认单位为分，取值：  
* pent：分
* microPent：微分 
     * @return AmountUnit 价格金额单位，不传默认单位为分，取值：  
* pent：分
* microPent：微分
     */
    public String getAmountUnit() {
        return this.AmountUnit;
    }

    /**
     * Set 价格金额单位，不传默认单位为分，取值：  
* pent：分
* microPent：微分
     * @param AmountUnit 价格金额单位，不传默认单位为分，取值：  
* pent：分
* microPent：微分
     */
    public void setAmountUnit(String AmountUnit) {
        this.AmountUnit = AmountUnit;
    }

    /**
     * Get Cpu类型，如：英特尔：Intel/AMD，海光：Hygon，默认Intel/AMD 
     * @return CpuType Cpu类型，如：英特尔：Intel/AMD，海光：Hygon，默认Intel/AMD
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set Cpu类型，如：英特尔：Intel/AMD，海光：Hygon，默认Intel/AMD
     * @param CpuType Cpu类型，如：英特尔：Intel/AMD，海光：Hygon，默认Intel/AMD
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    public DescribeDCDBPriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDCDBPriceRequest(DescribeDCDBPriceRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ShardNodeCount != null) {
            this.ShardNodeCount = new Long(source.ShardNodeCount);
        }
        if (source.ShardMemory != null) {
            this.ShardMemory = new Long(source.ShardMemory);
        }
        if (source.ShardStorage != null) {
            this.ShardStorage = new Long(source.ShardStorage);
        }
        if (source.ShardCount != null) {
            this.ShardCount = new Long(source.ShardCount);
        }
        if (source.Paymode != null) {
            this.Paymode = new String(source.Paymode);
        }
        if (source.AmountUnit != null) {
            this.AmountUnit = new String(source.AmountUnit);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ShardNodeCount", this.ShardNodeCount);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "AmountUnit", this.AmountUnit);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);

    }
}

