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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductConf extends AbstractModel{

    /**
    * 产品类型，13-KeewiDB标准架构，14-KeewiDB集群架构
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * KeewiDB标准架构，KeewiDB集群架构
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 购买时的最小数量
    */
    @SerializedName("MinBuyNum")
    @Expose
    private Long MinBuyNum;

    /**
    * 购买时的最大数量
    */
    @SerializedName("MaxBuyNum")
    @Expose
    private Long MaxBuyNum;

    /**
    * 产品是否售罄
    */
    @SerializedName("Saleout")
    @Expose
    private Boolean Saleout;

    /**
    * 产品引擎，keewidb
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
    * 副本数量
    */
    @SerializedName("ReplicaNum")
    @Expose
    private String [] ReplicaNum;

    /**
    * 支持的计费模式，1-包年包月，0-按量计费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
     * Get 产品类型，13-KeewiDB标准架构，14-KeewiDB集群架构 
     * @return Type 产品类型，13-KeewiDB标准架构，14-KeewiDB集群架构
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 产品类型，13-KeewiDB标准架构，14-KeewiDB集群架构
     * @param Type 产品类型，13-KeewiDB标准架构，14-KeewiDB集群架构
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get KeewiDB标准架构，KeewiDB集群架构 
     * @return TypeName KeewiDB标准架构，KeewiDB集群架构
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set KeewiDB标准架构，KeewiDB集群架构
     * @param TypeName KeewiDB标准架构，KeewiDB集群架构
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 购买时的最小数量 
     * @return MinBuyNum 购买时的最小数量
     */
    public Long getMinBuyNum() {
        return this.MinBuyNum;
    }

    /**
     * Set 购买时的最小数量
     * @param MinBuyNum 购买时的最小数量
     */
    public void setMinBuyNum(Long MinBuyNum) {
        this.MinBuyNum = MinBuyNum;
    }

    /**
     * Get 购买时的最大数量 
     * @return MaxBuyNum 购买时的最大数量
     */
    public Long getMaxBuyNum() {
        return this.MaxBuyNum;
    }

    /**
     * Set 购买时的最大数量
     * @param MaxBuyNum 购买时的最大数量
     */
    public void setMaxBuyNum(Long MaxBuyNum) {
        this.MaxBuyNum = MaxBuyNum;
    }

    /**
     * Get 产品是否售罄 
     * @return Saleout 产品是否售罄
     */
    public Boolean getSaleout() {
        return this.Saleout;
    }

    /**
     * Set 产品是否售罄
     * @param Saleout 产品是否售罄
     */
    public void setSaleout(Boolean Saleout) {
        this.Saleout = Saleout;
    }

    /**
     * Get 产品引擎，keewidb 
     * @return Engine 产品引擎，keewidb
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 产品引擎，keewidb
     * @param Engine 产品引擎，keewidb
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 兼容版本，Redis-2.8，Redis-3.2，Redis-4.0 
     * @return Version 兼容版本，Redis-2.8，Redis-3.2，Redis-4.0
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 兼容版本，Redis-2.8，Redis-3.2，Redis-4.0
     * @param Version 兼容版本，Redis-2.8，Redis-3.2，Redis-4.0
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 副本数量 
     * @return ReplicaNum 副本数量
     */
    public String [] getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set 副本数量
     * @param ReplicaNum 副本数量
     */
    public void setReplicaNum(String [] ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get 支持的计费模式，1-包年包月，0-按量计费 
     * @return PayMode 支持的计费模式，1-包年包月，0-按量计费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 支持的计费模式，1-包年包月，0-按量计费
     * @param PayMode 支持的计费模式，1-包年包月，0-按量计费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    public ProductConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductConf(ProductConf source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.MinBuyNum != null) {
            this.MinBuyNum = new Long(source.MinBuyNum);
        }
        if (source.MaxBuyNum != null) {
            this.MaxBuyNum = new Long(source.MaxBuyNum);
        }
        if (source.Saleout != null) {
            this.Saleout = new Boolean(source.Saleout);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new String[source.ReplicaNum.length];
            for (int i = 0; i < source.ReplicaNum.length; i++) {
                this.ReplicaNum[i] = new String(source.ReplicaNum[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "MinBuyNum", this.MinBuyNum);
        this.setParamSimple(map, prefix + "MaxBuyNum", this.MaxBuyNum);
        this.setParamSimple(map, prefix + "Saleout", this.Saleout);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArraySimple(map, prefix + "ReplicaNum.", this.ReplicaNum);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

