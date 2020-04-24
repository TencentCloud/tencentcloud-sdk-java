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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePriceRequest extends AbstractModel{

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

    }
}

