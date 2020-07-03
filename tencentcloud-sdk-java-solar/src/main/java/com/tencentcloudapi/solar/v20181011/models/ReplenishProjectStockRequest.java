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

public class ReplenishProjectStockRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("SubProjectId")
    @Expose
    private String SubProjectId;

    /**
    * 奖品id
    */
    @SerializedName("PrizeId")
    @Expose
    private String PrizeId;

    /**
    * 奖品数量
    */
    @SerializedName("PrizeNum")
    @Expose
    private Long PrizeNum;

    /**
    * 奖池索引
    */
    @SerializedName("PoolIndex")
    @Expose
    private Long PoolIndex;

    /**
    * 奖池名称
    */
    @SerializedName("PoolName")
    @Expose
    private String PoolName;

    /**
     * Get 项目id 
     * @return SubProjectId 项目id
     */
    public String getSubProjectId() {
        return this.SubProjectId;
    }

    /**
     * Set 项目id
     * @param SubProjectId 项目id
     */
    public void setSubProjectId(String SubProjectId) {
        this.SubProjectId = SubProjectId;
    }

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
     * Get 奖品数量 
     * @return PrizeNum 奖品数量
     */
    public Long getPrizeNum() {
        return this.PrizeNum;
    }

    /**
     * Set 奖品数量
     * @param PrizeNum 奖品数量
     */
    public void setPrizeNum(Long PrizeNum) {
        this.PrizeNum = PrizeNum;
    }

    /**
     * Get 奖池索引 
     * @return PoolIndex 奖池索引
     */
    public Long getPoolIndex() {
        return this.PoolIndex;
    }

    /**
     * Set 奖池索引
     * @param PoolIndex 奖池索引
     */
    public void setPoolIndex(Long PoolIndex) {
        this.PoolIndex = PoolIndex;
    }

    /**
     * Get 奖池名称 
     * @return PoolName 奖池名称
     */
    public String getPoolName() {
        return this.PoolName;
    }

    /**
     * Set 奖池名称
     * @param PoolName 奖池名称
     */
    public void setPoolName(String PoolName) {
        this.PoolName = PoolName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubProjectId", this.SubProjectId);
        this.setParamSimple(map, prefix + "PrizeId", this.PrizeId);
        this.setParamSimple(map, prefix + "PrizeNum", this.PrizeNum);
        this.setParamSimple(map, prefix + "PoolIndex", this.PoolIndex);
        this.setParamSimple(map, prefix + "PoolName", this.PoolName);

    }
}

