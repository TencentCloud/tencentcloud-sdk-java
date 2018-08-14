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

public class DescribePriceRequest  extends AbstractModel{

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
    private Integer NodeCount;

    /**
    * 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;

    /**
    * 欲购买的时长，单位：月。
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;

    /**
    * 欲购买的数量，默认查询购买1个实例的价格。
    */
    @SerializedName("Count")
    @Expose
    private Integer Count;

    /**
     * 获取欲新购实例的可用区ID。
     * @return Zone 欲新购实例的可用区ID。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置欲新购实例的可用区ID。
     * @param Zone 欲新购实例的可用区ID。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取实例节点个数，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     * @return NodeCount 实例节点个数，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     */
    public Integer getNodeCount() {
        return this.NodeCount;
    }

    /**
     * 设置实例节点个数，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     * @param NodeCount 实例节点个数，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     */
    public void setNodeCount(Integer NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * 获取内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     * @return Memory 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     * @param Memory 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
     * @return Storage 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * 设置存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
     * @param Storage 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * 获取欲购买的时长，单位：月。
     * @return Period 欲购买的时长，单位：月。
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * 设置欲购买的时长，单位：月。
     * @param Period 欲购买的时长，单位：月。
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * 获取欲购买的数量，默认查询购买1个实例的价格。
     * @return Count 欲购买的数量，默认查询购买1个实例的价格。
     */
    public Integer getCount() {
        return this.Count;
    }

    /**
     * 设置欲购买的数量，默认查询购买1个实例的价格。
     * @param Count 欲购买的数量，默认查询购买1个实例的价格。
     */
    public void setCount(Integer Count) {
        this.Count = Count;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

