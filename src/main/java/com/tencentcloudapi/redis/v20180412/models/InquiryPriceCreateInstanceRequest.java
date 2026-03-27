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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateInstanceRequest extends AbstractModel {

    /**
    * <p>实例类型。- 2：Redis 2.8 内存版（标准架构）。- 6：Redis 4.0 内存版（标准架构）。- 7：Redis 4.0 内存版（集群架构）。- 8：Redis 5.0 内存版（标准架构）。- 9：Redis 5.0 内存版（集群架构）。- 15：Redis 6.2 内存版（标准架构）。- 16：Redis 6.2 内存版（集群架构）。- 17：Redis 7.0 内存版（标准架构）。- 18：Redis 7.0 内存版（集群架构）。- 200:Memcached 1.6 内存版（集群架构）。</p>
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * <p>内存容量，单位为MB， 数值需为1024的整数倍，具体规格以 <a href="https://cloud.tencent.com/document/api/239/30600">查询产品售卖规格</a> 返回的规格为准。TypeId为标准架构时，MemSize是实例总内存容量；TypeId为集群架构时，MemSize是单分片内存容量。</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>实例数量，单次购买实例数量以 <a href="https://cloud.tencent.com/document/api/239/30600">查询产品售卖规格</a> 返回的规格为准。</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>付费方式。- 0：按量计费。- 1：包年包月。</p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>实例所属的可用区 ID，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。<strong>说明</strong>：请在 <strong>ZoneId</strong> 与 <strong>ZoneName</strong> 中至少指定一个参数。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>实例分片数量。- 标准架构需要配置分片数量为1。- 集群架构分片数量支持设置为1、3、5、8、12、16、24、32、40、48、64、80、96、128。</p>
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * <p>实例副本数量。取值范围为：1、2、3、4、5。</p>
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * <p>是否支持副本只读。Redis2.8标准架构、CKV标准架构无需填写。- true：无需支持副本只读。- false：需支持。</p>
    */
    @SerializedName("ReplicasReadonly")
    @Expose
    private Boolean ReplicasReadonly;

    /**
    * <p>实例所属的可用区名称，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。<strong>说明</strong>：请在 <strong>ZoneId</strong> 与 <strong>ZoneName</strong> 中至少指定一个参数。</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>部署方式。- local：本地盘版，默认为 local。- cloud：云盘版。- cdc：独享集群版。</p>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
     * Get <p>实例类型。- 2：Redis 2.8 内存版（标准架构）。- 6：Redis 4.0 内存版（标准架构）。- 7：Redis 4.0 内存版（集群架构）。- 8：Redis 5.0 内存版（标准架构）。- 9：Redis 5.0 内存版（集群架构）。- 15：Redis 6.2 内存版（标准架构）。- 16：Redis 6.2 内存版（集群架构）。- 17：Redis 7.0 内存版（标准架构）。- 18：Redis 7.0 内存版（集群架构）。- 200:Memcached 1.6 内存版（集群架构）。</p> 
     * @return TypeId <p>实例类型。- 2：Redis 2.8 内存版（标准架构）。- 6：Redis 4.0 内存版（标准架构）。- 7：Redis 4.0 内存版（集群架构）。- 8：Redis 5.0 内存版（标准架构）。- 9：Redis 5.0 内存版（集群架构）。- 15：Redis 6.2 内存版（标准架构）。- 16：Redis 6.2 内存版（集群架构）。- 17：Redis 7.0 内存版（标准架构）。- 18：Redis 7.0 内存版（集群架构）。- 200:Memcached 1.6 内存版（集群架构）。</p>
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set <p>实例类型。- 2：Redis 2.8 内存版（标准架构）。- 6：Redis 4.0 内存版（标准架构）。- 7：Redis 4.0 内存版（集群架构）。- 8：Redis 5.0 内存版（标准架构）。- 9：Redis 5.0 内存版（集群架构）。- 15：Redis 6.2 内存版（标准架构）。- 16：Redis 6.2 内存版（集群架构）。- 17：Redis 7.0 内存版（标准架构）。- 18：Redis 7.0 内存版（集群架构）。- 200:Memcached 1.6 内存版（集群架构）。</p>
     * @param TypeId <p>实例类型。- 2：Redis 2.8 内存版（标准架构）。- 6：Redis 4.0 内存版（标准架构）。- 7：Redis 4.0 内存版（集群架构）。- 8：Redis 5.0 内存版（标准架构）。- 9：Redis 5.0 内存版（集群架构）。- 15：Redis 6.2 内存版（标准架构）。- 16：Redis 6.2 内存版（集群架构）。- 17：Redis 7.0 内存版（标准架构）。- 18：Redis 7.0 内存版（集群架构）。- 200:Memcached 1.6 内存版（集群架构）。</p>
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get <p>内存容量，单位为MB， 数值需为1024的整数倍，具体规格以 <a href="https://cloud.tencent.com/document/api/239/30600">查询产品售卖规格</a> 返回的规格为准。TypeId为标准架构时，MemSize是实例总内存容量；TypeId为集群架构时，MemSize是单分片内存容量。</p> 
     * @return MemSize <p>内存容量，单位为MB， 数值需为1024的整数倍，具体规格以 <a href="https://cloud.tencent.com/document/api/239/30600">查询产品售卖规格</a> 返回的规格为准。TypeId为标准架构时，MemSize是实例总内存容量；TypeId为集群架构时，MemSize是单分片内存容量。</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>内存容量，单位为MB， 数值需为1024的整数倍，具体规格以 <a href="https://cloud.tencent.com/document/api/239/30600">查询产品售卖规格</a> 返回的规格为准。TypeId为标准架构时，MemSize是实例总内存容量；TypeId为集群架构时，MemSize是单分片内存容量。</p>
     * @param MemSize <p>内存容量，单位为MB， 数值需为1024的整数倍，具体规格以 <a href="https://cloud.tencent.com/document/api/239/30600">查询产品售卖规格</a> 返回的规格为准。TypeId为标准架构时，MemSize是实例总内存容量；TypeId为集群架构时，MemSize是单分片内存容量。</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>实例数量，单次购买实例数量以 <a href="https://cloud.tencent.com/document/api/239/30600">查询产品售卖规格</a> 返回的规格为准。</p> 
     * @return GoodsNum <p>实例数量，单次购买实例数量以 <a href="https://cloud.tencent.com/document/api/239/30600">查询产品售卖规格</a> 返回的规格为准。</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>实例数量，单次购买实例数量以 <a href="https://cloud.tencent.com/document/api/239/30600">查询产品售卖规格</a> 返回的规格为准。</p>
     * @param GoodsNum <p>实例数量，单次购买实例数量以 <a href="https://cloud.tencent.com/document/api/239/30600">查询产品售卖规格</a> 返回的规格为准。</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p> 
     * @return Period <p>购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p>
     * @param Period <p>购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>付费方式。- 0：按量计费。- 1：包年包月。</p> 
     * @return BillingMode <p>付费方式。- 0：按量计费。- 1：包年包月。</p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>付费方式。- 0：按量计费。- 1：包年包月。</p>
     * @param BillingMode <p>付费方式。- 0：按量计费。- 1：包年包月。</p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>实例所属的可用区 ID，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。<strong>说明</strong>：请在 <strong>ZoneId</strong> 与 <strong>ZoneName</strong> 中至少指定一个参数。</p> 
     * @return ZoneId <p>实例所属的可用区 ID，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。<strong>说明</strong>：请在 <strong>ZoneId</strong> 与 <strong>ZoneName</strong> 中至少指定一个参数。</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>实例所属的可用区 ID，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。<strong>说明</strong>：请在 <strong>ZoneId</strong> 与 <strong>ZoneName</strong> 中至少指定一个参数。</p>
     * @param ZoneId <p>实例所属的可用区 ID，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。<strong>说明</strong>：请在 <strong>ZoneId</strong> 与 <strong>ZoneName</strong> 中至少指定一个参数。</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>实例分片数量。- 标准架构需要配置分片数量为1。- 集群架构分片数量支持设置为1、3、5、8、12、16、24、32、40、48、64、80、96、128。</p> 
     * @return RedisShardNum <p>实例分片数量。- 标准架构需要配置分片数量为1。- 集群架构分片数量支持设置为1、3、5、8、12、16、24、32、40、48、64、80、96、128。</p>
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set <p>实例分片数量。- 标准架构需要配置分片数量为1。- 集群架构分片数量支持设置为1、3、5、8、12、16、24、32、40、48、64、80、96、128。</p>
     * @param RedisShardNum <p>实例分片数量。- 标准架构需要配置分片数量为1。- 集群架构分片数量支持设置为1、3、5、8、12、16、24、32、40、48、64、80、96、128。</p>
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get <p>实例副本数量。取值范围为：1、2、3、4、5。</p> 
     * @return RedisReplicasNum <p>实例副本数量。取值范围为：1、2、3、4、5。</p>
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set <p>实例副本数量。取值范围为：1、2、3、4、5。</p>
     * @param RedisReplicasNum <p>实例副本数量。取值范围为：1、2、3、4、5。</p>
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get <p>是否支持副本只读。Redis2.8标准架构、CKV标准架构无需填写。- true：无需支持副本只读。- false：需支持。</p> 
     * @return ReplicasReadonly <p>是否支持副本只读。Redis2.8标准架构、CKV标准架构无需填写。- true：无需支持副本只读。- false：需支持。</p>
     */
    public Boolean getReplicasReadonly() {
        return this.ReplicasReadonly;
    }

    /**
     * Set <p>是否支持副本只读。Redis2.8标准架构、CKV标准架构无需填写。- true：无需支持副本只读。- false：需支持。</p>
     * @param ReplicasReadonly <p>是否支持副本只读。Redis2.8标准架构、CKV标准架构无需填写。- true：无需支持副本只读。- false：需支持。</p>
     */
    public void setReplicasReadonly(Boolean ReplicasReadonly) {
        this.ReplicasReadonly = ReplicasReadonly;
    }

    /**
     * Get <p>实例所属的可用区名称，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。<strong>说明</strong>：请在 <strong>ZoneId</strong> 与 <strong>ZoneName</strong> 中至少指定一个参数。</p> 
     * @return ZoneName <p>实例所属的可用区名称，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。<strong>说明</strong>：请在 <strong>ZoneId</strong> 与 <strong>ZoneName</strong> 中至少指定一个参数。</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>实例所属的可用区名称，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。<strong>说明</strong>：请在 <strong>ZoneId</strong> 与 <strong>ZoneName</strong> 中至少指定一个参数。</p>
     * @param ZoneName <p>实例所属的可用区名称，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。<strong>说明</strong>：请在 <strong>ZoneId</strong> 与 <strong>ZoneName</strong> 中至少指定一个参数。</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>部署方式。- local：本地盘版，默认为 local。- cloud：云盘版。- cdc：独享集群版。</p> 
     * @return ProductVersion <p>部署方式。- local：本地盘版，默认为 local。- cloud：云盘版。- cdc：独享集群版。</p>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>部署方式。- local：本地盘版，默认为 local。- cloud：云盘版。- cdc：独享集群版。</p>
     * @param ProductVersion <p>部署方式。- local：本地盘版，默认为 local。- cloud：云盘版。- cdc：独享集群版。</p>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    public InquiryPriceCreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateInstanceRequest(InquiryPriceCreateInstanceRequest source) {
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
        if (source.ReplicasReadonly != null) {
            this.ReplicasReadonly = new Boolean(source.ReplicasReadonly);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "ReplicasReadonly", this.ReplicasReadonly);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);

    }
}

