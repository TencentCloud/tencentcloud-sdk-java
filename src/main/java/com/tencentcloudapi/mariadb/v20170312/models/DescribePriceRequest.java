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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePriceRequest extends AbstractModel {

    /**
    * 欲新购实例的可用区ID。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例节点个数，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 欲购买的时长，单位：月。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 欲购买的数量，默认查询购买1个实例的价格。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

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
     * Get 实例节点个数，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。 
     * @return NodeCount 实例节点个数，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 实例节点个数，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     * @param NodeCount 实例节点个数，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。 
     * @return Memory 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     * @param Memory 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。 
     * @return Storage 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
     * @param Storage 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
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
     * Get 欲购买的数量，默认查询购买1个实例的价格。 
     * @return Count 欲购买的数量，默认查询购买1个实例的价格。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 欲购买的数量，默认查询购买1个实例的价格。
     * @param Count 欲购买的数量，默认查询购买1个实例的价格。
     */
    public void setCount(Long Count) {
        this.Count = Count;
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

    public DescribePriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePriceRequest(DescribePriceRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
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
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "AmountUnit", this.AmountUnit);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);

    }
}

