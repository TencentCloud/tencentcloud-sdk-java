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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDCDBPriceRequest  extends AbstractModel{

    /**
    * 欲新购实例的可用区ID。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 欲购买实例的数量，目前只支持购买1个实例
    */
    @SerializedName("Count")
    @Expose
    private Integer Count;

    /**
    * 欲购买的时长，单位：月。
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;

    /**
    * 单个分片节点个数大小，可以通过 DescribeShardSpec
 查询实例规格获得。
    */
    @SerializedName("ShardNodeCount")
    @Expose
    private Integer ShardNodeCount;

    /**
    * 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
    */
    @SerializedName("ShardMemory")
    @Expose
    private Integer ShardMemory;

    /**
    * 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
    */
    @SerializedName("ShardStorage")
    @Expose
    private Integer ShardStorage;

    /**
    * 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
    */
    @SerializedName("ShardCount")
    @Expose
    private Integer ShardCount;

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
     * 获取欲购买实例的数量，目前只支持购买1个实例
     * @return Count 欲购买实例的数量，目前只支持购买1个实例
     */
    public Integer getCount() {
        return this.Count;
    }

    /**
     * 设置欲购买实例的数量，目前只支持购买1个实例
     * @param Count 欲购买实例的数量，目前只支持购买1个实例
     */
    public void setCount(Integer Count) {
        this.Count = Count;
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
     * 获取单个分片节点个数大小，可以通过 DescribeShardSpec
 查询实例规格获得。
     * @return ShardNodeCount 单个分片节点个数大小，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public Integer getShardNodeCount() {
        return this.ShardNodeCount;
    }

    /**
     * 设置单个分片节点个数大小，可以通过 DescribeShardSpec
 查询实例规格获得。
     * @param ShardNodeCount 单个分片节点个数大小，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public void setShardNodeCount(Integer ShardNodeCount) {
        this.ShardNodeCount = ShardNodeCount;
    }

    /**
     * 获取分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     * @return ShardMemory 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public Integer getShardMemory() {
        return this.ShardMemory;
    }

    /**
     * 设置分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     * @param ShardMemory 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public void setShardMemory(Integer ShardMemory) {
        this.ShardMemory = ShardMemory;
    }

    /**
     * 获取分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     * @return ShardStorage 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public Integer getShardStorage() {
        return this.ShardStorage;
    }

    /**
     * 设置分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     * @param ShardStorage 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public void setShardStorage(Integer ShardStorage) {
        this.ShardStorage = ShardStorage;
    }

    /**
     * 获取实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
     * @return ShardCount 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
     */
    public Integer getShardCount() {
        return this.ShardCount;
    }

    /**
     * 设置实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
     * @param ShardCount 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
     */
    public void setShardCount(Integer ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ShardNodeCount", this.ShardNodeCount);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);

    }
}

