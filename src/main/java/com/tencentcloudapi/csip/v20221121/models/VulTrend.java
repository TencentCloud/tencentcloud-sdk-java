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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulTrend extends AbstractModel {

    /**
    * 影响的资产数
    */
    @SerializedName("AffectAssetCount")
    @Expose
    private Long AffectAssetCount;

    /**
    * 影响的用户数
    */
    @SerializedName("AffectUserCount")
    @Expose
    private Long AffectUserCount;

    /**
    * 攻击数
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

    /**
    * 时间
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get 影响的资产数 
     * @return AffectAssetCount 影响的资产数
     */
    public Long getAffectAssetCount() {
        return this.AffectAssetCount;
    }

    /**
     * Set 影响的资产数
     * @param AffectAssetCount 影响的资产数
     */
    public void setAffectAssetCount(Long AffectAssetCount) {
        this.AffectAssetCount = AffectAssetCount;
    }

    /**
     * Get 影响的用户数 
     * @return AffectUserCount 影响的用户数
     */
    public Long getAffectUserCount() {
        return this.AffectUserCount;
    }

    /**
     * Set 影响的用户数
     * @param AffectUserCount 影响的用户数
     */
    public void setAffectUserCount(Long AffectUserCount) {
        this.AffectUserCount = AffectUserCount;
    }

    /**
     * Get 攻击数 
     * @return AttackCount 攻击数
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set 攻击数
     * @param AttackCount 攻击数
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
    }

    /**
     * Get 时间 
     * @return Date 时间
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 时间
     * @param Date 时间
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public VulTrend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulTrend(VulTrend source) {
        if (source.AffectAssetCount != null) {
            this.AffectAssetCount = new Long(source.AffectAssetCount);
        }
        if (source.AffectUserCount != null) {
            this.AffectUserCount = new Long(source.AffectUserCount);
        }
        if (source.AttackCount != null) {
            this.AttackCount = new Long(source.AttackCount);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectAssetCount", this.AffectAssetCount);
        this.setParamSimple(map, prefix + "AffectUserCount", this.AffectUserCount);
        this.setParamSimple(map, prefix + "AttackCount", this.AttackCount);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

