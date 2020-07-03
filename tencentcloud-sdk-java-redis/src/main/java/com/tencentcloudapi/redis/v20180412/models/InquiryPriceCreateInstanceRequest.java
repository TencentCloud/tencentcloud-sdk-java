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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateInstanceRequest extends AbstractModel{

    /**
    * 实例所属的可用区id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 实例类型：2 – Redis2.8主从版，3 – Redis3.2主从版(CKV主从版)，4 – Redis3.2集群版(CKV集群版)，5-Redis2.8单机版，6 – Redis4.0主从版，7 – Redis4.0集群版，
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 实例容量，单位MB， 取值大小以 查询售卖规格接口返回的规格为准
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 实例数量，单次购买实例数量以 查询售卖规格接口返回的规格为准
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 付费方式:0-按量计费，1-包年包月。
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * 实例分片数量，Redis2.8主从版、CKV主从版和Redis2.8单机版、Redis4.0主从版不需要填写
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * 实例副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * 是否支持副本只读，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
    */
    @SerializedName("ReplicasReadonly")
    @Expose
    private Boolean ReplicasReadonly;

    /**
     * Get 实例所属的可用区id 
     * @return ZoneId 实例所属的可用区id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 实例所属的可用区id
     * @param ZoneId 实例所属的可用区id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 实例类型：2 – Redis2.8主从版，3 – Redis3.2主从版(CKV主从版)，4 – Redis3.2集群版(CKV集群版)，5-Redis2.8单机版，6 – Redis4.0主从版，7 – Redis4.0集群版， 
     * @return TypeId 实例类型：2 – Redis2.8主从版，3 – Redis3.2主从版(CKV主从版)，4 – Redis3.2集群版(CKV集群版)，5-Redis2.8单机版，6 – Redis4.0主从版，7 – Redis4.0集群版，
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 实例类型：2 – Redis2.8主从版，3 – Redis3.2主从版(CKV主从版)，4 – Redis3.2集群版(CKV集群版)，5-Redis2.8单机版，6 – Redis4.0主从版，7 – Redis4.0集群版，
     * @param TypeId 实例类型：2 – Redis2.8主从版，3 – Redis3.2主从版(CKV主从版)，4 – Redis3.2集群版(CKV集群版)，5-Redis2.8单机版，6 – Redis4.0主从版，7 – Redis4.0集群版，
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 实例容量，单位MB， 取值大小以 查询售卖规格接口返回的规格为准 
     * @return MemSize 实例容量，单位MB， 取值大小以 查询售卖规格接口返回的规格为准
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 实例容量，单位MB， 取值大小以 查询售卖规格接口返回的规格为准
     * @param MemSize 实例容量，单位MB， 取值大小以 查询售卖规格接口返回的规格为准
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 实例数量，单次购买实例数量以 查询售卖规格接口返回的规格为准 
     * @return GoodsNum 实例数量，单次购买实例数量以 查询售卖规格接口返回的规格为准
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 实例数量，单次购买实例数量以 查询售卖规格接口返回的规格为准
     * @param GoodsNum 实例数量，单次购买实例数量以 查询售卖规格接口返回的规格为准
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36] 
     * @return Period 购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     * @param Period 购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 付费方式:0-按量计费，1-包年包月。 
     * @return BillingMode 付费方式:0-按量计费，1-包年包月。
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set 付费方式:0-按量计费，1-包年包月。
     * @param BillingMode 付费方式:0-按量计费，1-包年包月。
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get 实例分片数量，Redis2.8主从版、CKV主从版和Redis2.8单机版、Redis4.0主从版不需要填写 
     * @return RedisShardNum 实例分片数量，Redis2.8主从版、CKV主从版和Redis2.8单机版、Redis4.0主从版不需要填写
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set 实例分片数量，Redis2.8主从版、CKV主从版和Redis2.8单机版、Redis4.0主从版不需要填写
     * @param RedisShardNum 实例分片数量，Redis2.8主从版、CKV主从版和Redis2.8单机版、Redis4.0主从版不需要填写
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get 实例副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写 
     * @return RedisReplicasNum 实例副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set 实例副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
     * @param RedisReplicasNum 实例副本数量，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get 是否支持副本只读，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写 
     * @return ReplicasReadonly 是否支持副本只读，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
     */
    public Boolean getReplicasReadonly() {
        return this.ReplicasReadonly;
    }

    /**
     * Set 是否支持副本只读，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
     * @param ReplicasReadonly 是否支持副本只读，Redis2.8主从版、CKV主从版和Redis2.8单机版不需要填写
     */
    public void setReplicasReadonly(Boolean ReplicasReadonly) {
        this.ReplicasReadonly = ReplicasReadonly;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "ReplicasReadonly", this.ReplicasReadonly);

    }
}

