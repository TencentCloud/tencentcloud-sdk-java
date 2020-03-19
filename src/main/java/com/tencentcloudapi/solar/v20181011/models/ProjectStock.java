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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectStock extends AbstractModel{

    /**
    * 奖品id
    */
    @SerializedName("PrizeId")
    @Expose
    private String PrizeId;

    /**
    * 奖品批次
    */
    @SerializedName("PrizeBat")
    @Expose
    private Long PrizeBat;

    /**
    * 奖品名称
    */
    @SerializedName("PrizeName")
    @Expose
    private String PrizeName;

    /**
    * 已分配奖品数量
    */
    @SerializedName("UsedStock")
    @Expose
    private Long UsedStock;

    /**
    * 该奖品剩余库存数量
    */
    @SerializedName("RemainStock")
    @Expose
    private Long RemainStock;

    /**
    * 奖品所在奖池index
    */
    @SerializedName("PoolIdx")
    @Expose
    private Long PoolIdx;

    /**
    * 奖品所在奖池名称
    */
    @SerializedName("PoolName")
    @Expose
    private String PoolName;

    /**
     * Get 奖品id 
     * @return PrizeId 奖品id
     */
    public String getPrizeId() {
        return this.PrizeId;
    }

    /**
     * Set 奖品id
     * @param PrizeId 奖品id
     */
    public void setPrizeId(String PrizeId) {
        this.PrizeId = PrizeId;
    }

    /**
     * Get 奖品批次 
     * @return PrizeBat 奖品批次
     */
    public Long getPrizeBat() {
        return this.PrizeBat;
    }

    /**
     * Set 奖品批次
     * @param PrizeBat 奖品批次
     */
    public void setPrizeBat(Long PrizeBat) {
        this.PrizeBat = PrizeBat;
    }

    /**
     * Get 奖品名称 
     * @return PrizeName 奖品名称
     */
    public String getPrizeName() {
        return this.PrizeName;
    }

    /**
     * Set 奖品名称
     * @param PrizeName 奖品名称
     */
    public void setPrizeName(String PrizeName) {
        this.PrizeName = PrizeName;
    }

    /**
     * Get 已分配奖品数量 
     * @return UsedStock 已分配奖品数量
     */
    public Long getUsedStock() {
        return this.UsedStock;
    }

    /**
     * Set 已分配奖品数量
     * @param UsedStock 已分配奖品数量
     */
    public void setUsedStock(Long UsedStock) {
        this.UsedStock = UsedStock;
    }

    /**
     * Get 该奖品剩余库存数量 
     * @return RemainStock 该奖品剩余库存数量
     */
    public Long getRemainStock() {
        return this.RemainStock;
    }

    /**
     * Set 该奖品剩余库存数量
     * @param RemainStock 该奖品剩余库存数量
     */
    public void setRemainStock(Long RemainStock) {
        this.RemainStock = RemainStock;
    }

    /**
     * Get 奖品所在奖池index 
     * @return PoolIdx 奖品所在奖池index
     */
    public Long getPoolIdx() {
        return this.PoolIdx;
    }

    /**
     * Set 奖品所在奖池index
     * @param PoolIdx 奖品所在奖池index
     */
    public void setPoolIdx(Long PoolIdx) {
        this.PoolIdx = PoolIdx;
    }

    /**
     * Get 奖品所在奖池名称 
     * @return PoolName 奖品所在奖池名称
     */
    public String getPoolName() {
        return this.PoolName;
    }

    /**
     * Set 奖品所在奖池名称
     * @param PoolName 奖品所在奖池名称
     */
    public void setPoolName(String PoolName) {
        this.PoolName = PoolName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrizeId", this.PrizeId);
        this.setParamSimple(map, prefix + "PrizeBat", this.PrizeBat);
        this.setParamSimple(map, prefix + "PrizeName", this.PrizeName);
        this.setParamSimple(map, prefix + "UsedStock", this.UsedStock);
        this.setParamSimple(map, prefix + "RemainStock", this.RemainStock);
        this.setParamSimple(map, prefix + "PoolIdx", this.PoolIdx);
        this.setParamSimple(map, prefix + "PoolName", this.PoolName);

    }
}

