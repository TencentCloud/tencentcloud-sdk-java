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

public class ProductConf  extends AbstractModel{

    /**
    * 产品类型，2-Redis主从版，3-CKV主从版，4-CKV集群版，5-Redis单机版，7-Redis集群版
    */
    @SerializedName("Type")
    @Expose
    private Integer Type;

    /**
    * 产品名称，Redis主从版，CKV主从版，CKV集群版，Redis单机版，Redis集群版
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 购买时的最小数量
    */
    @SerializedName("MinBuyNum")
    @Expose
    private Integer MinBuyNum;

    /**
    * 购买时的最大数量
    */
    @SerializedName("MaxBuyNum")
    @Expose
    private Integer MaxBuyNum;

    /**
    * 产品是否售罄
    */
    @SerializedName("Saleout")
    @Expose
    private Boolean Saleout;

    /**
    * 产品引擎，腾讯云CKV或者社区版Redis
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * 兼容版本，Redis-2.8，Redis-3.2，Redis-4.0
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 规格总大小，单位G
    */
    @SerializedName("TotalSize")
    @Expose
    private String [] TotalSize;

    /**
    * 每个分片大小，单位G
    */
    @SerializedName("ShardSize")
    @Expose
    private String [] ShardSize;

    /**
    * 副本数量
    */
    @SerializedName("ReplicaNum")
    @Expose
    private String [] ReplicaNum;

    /**
    * 分片数量
    */
    @SerializedName("ShardNum")
    @Expose
    private String [] ShardNum;

    /**
    * 支持的计费模式，1-包年包月，0-按量计费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 是否支持副本只读
    */
    @SerializedName("EnableRepicaReadOnly")
    @Expose
    private Boolean EnableRepicaReadOnly;

    /**
     * 获取产品类型，2-Redis主从版，3-CKV主从版，4-CKV集群版，5-Redis单机版，7-Redis集群版
     * @return Type 产品类型，2-Redis主从版，3-CKV主从版，4-CKV集群版，5-Redis单机版，7-Redis集群版
     */
    public Integer getType() {
        return this.Type;
    }

    /**
     * 设置产品类型，2-Redis主从版，3-CKV主从版，4-CKV集群版，5-Redis单机版，7-Redis集群版
     * @param Type 产品类型，2-Redis主从版，3-CKV主从版，4-CKV集群版，5-Redis单机版，7-Redis集群版
     */
    public void setType(Integer Type) {
        this.Type = Type;
    }

    /**
     * 获取产品名称，Redis主从版，CKV主从版，CKV集群版，Redis单机版，Redis集群版
     * @return TypeName 产品名称，Redis主从版，CKV主从版，CKV集群版，Redis单机版，Redis集群版
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * 设置产品名称，Redis主从版，CKV主从版，CKV集群版，Redis单机版，Redis集群版
     * @param TypeName 产品名称，Redis主从版，CKV主从版，CKV集群版，Redis单机版，Redis集群版
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * 获取购买时的最小数量
     * @return MinBuyNum 购买时的最小数量
     */
    public Integer getMinBuyNum() {
        return this.MinBuyNum;
    }

    /**
     * 设置购买时的最小数量
     * @param MinBuyNum 购买时的最小数量
     */
    public void setMinBuyNum(Integer MinBuyNum) {
        this.MinBuyNum = MinBuyNum;
    }

    /**
     * 获取购买时的最大数量
     * @return MaxBuyNum 购买时的最大数量
     */
    public Integer getMaxBuyNum() {
        return this.MaxBuyNum;
    }

    /**
     * 设置购买时的最大数量
     * @param MaxBuyNum 购买时的最大数量
     */
    public void setMaxBuyNum(Integer MaxBuyNum) {
        this.MaxBuyNum = MaxBuyNum;
    }

    /**
     * 获取产品是否售罄
     * @return Saleout 产品是否售罄
     */
    public Boolean getSaleout() {
        return this.Saleout;
    }

    /**
     * 设置产品是否售罄
     * @param Saleout 产品是否售罄
     */
    public void setSaleout(Boolean Saleout) {
        this.Saleout = Saleout;
    }

    /**
     * 获取产品引擎，腾讯云CKV或者社区版Redis
     * @return Engine 产品引擎，腾讯云CKV或者社区版Redis
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * 设置产品引擎，腾讯云CKV或者社区版Redis
     * @param Engine 产品引擎，腾讯云CKV或者社区版Redis
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * 获取兼容版本，Redis-2.8，Redis-3.2，Redis-4.0
     * @return Version 兼容版本，Redis-2.8，Redis-3.2，Redis-4.0
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * 设置兼容版本，Redis-2.8，Redis-3.2，Redis-4.0
     * @param Version 兼容版本，Redis-2.8，Redis-3.2，Redis-4.0
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * 获取规格总大小，单位G
     * @return TotalSize 规格总大小，单位G
     */
    public String [] getTotalSize() {
        return this.TotalSize;
    }

    /**
     * 设置规格总大小，单位G
     * @param TotalSize 规格总大小，单位G
     */
    public void setTotalSize(String [] TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * 获取每个分片大小，单位G
     * @return ShardSize 每个分片大小，单位G
     */
    public String [] getShardSize() {
        return this.ShardSize;
    }

    /**
     * 设置每个分片大小，单位G
     * @param ShardSize 每个分片大小，单位G
     */
    public void setShardSize(String [] ShardSize) {
        this.ShardSize = ShardSize;
    }

    /**
     * 获取副本数量
     * @return ReplicaNum 副本数量
     */
    public String [] getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * 设置副本数量
     * @param ReplicaNum 副本数量
     */
    public void setReplicaNum(String [] ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * 获取分片数量
     * @return ShardNum 分片数量
     */
    public String [] getShardNum() {
        return this.ShardNum;
    }

    /**
     * 设置分片数量
     * @param ShardNum 分片数量
     */
    public void setShardNum(String [] ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * 获取支持的计费模式，1-包年包月，0-按量计费
     * @return PayMode 支持的计费模式，1-包年包月，0-按量计费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置支持的计费模式，1-包年包月，0-按量计费
     * @param PayMode 支持的计费模式，1-包年包月，0-按量计费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取是否支持副本只读
     * @return EnableRepicaReadOnly 是否支持副本只读
     */
    public Boolean getEnableRepicaReadOnly() {
        return this.EnableRepicaReadOnly;
    }

    /**
     * 设置是否支持副本只读
     * @param EnableRepicaReadOnly 是否支持副本只读
     */
    public void setEnableRepicaReadOnly(Boolean EnableRepicaReadOnly) {
        this.EnableRepicaReadOnly = EnableRepicaReadOnly;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "MinBuyNum", this.MinBuyNum);
        this.setParamSimple(map, prefix + "MaxBuyNum", this.MaxBuyNum);
        this.setParamSimple(map, prefix + "Saleout", this.Saleout);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArraySimple(map, prefix + "TotalSize.", this.TotalSize);
        this.setParamArraySimple(map, prefix + "ShardSize.", this.ShardSize);
        this.setParamArraySimple(map, prefix + "ReplicaNum.", this.ReplicaNum);
        this.setParamArraySimple(map, prefix + "ShardNum.", this.ShardNum);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "EnableRepicaReadOnly", this.EnableRepicaReadOnly);

    }
}

