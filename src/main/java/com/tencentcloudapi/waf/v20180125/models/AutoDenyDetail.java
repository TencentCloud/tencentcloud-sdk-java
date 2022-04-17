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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoDenyDetail extends AbstractModel{

    /**
    * 攻击封禁类型标签
    */
    @SerializedName("AttackTags")
    @Expose
    private String [] AttackTags;

    /**
    * 攻击次数阈值
    */
    @SerializedName("AttackThreshold")
    @Expose
    private Long AttackThreshold;

    /**
    * 自动封禁状态
    */
    @SerializedName("DefenseStatus")
    @Expose
    private Long DefenseStatus;

    /**
    * 攻击时间阈值
    */
    @SerializedName("TimeThreshold")
    @Expose
    private Long TimeThreshold;

    /**
    * 自动封禁时间
    */
    @SerializedName("DenyTimeThreshold")
    @Expose
    private Long DenyTimeThreshold;

    /**
    * 最后更新时间
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
     * Get 攻击封禁类型标签 
     * @return AttackTags 攻击封禁类型标签
     */
    public String [] getAttackTags() {
        return this.AttackTags;
    }

    /**
     * Set 攻击封禁类型标签
     * @param AttackTags 攻击封禁类型标签
     */
    public void setAttackTags(String [] AttackTags) {
        this.AttackTags = AttackTags;
    }

    /**
     * Get 攻击次数阈值 
     * @return AttackThreshold 攻击次数阈值
     */
    public Long getAttackThreshold() {
        return this.AttackThreshold;
    }

    /**
     * Set 攻击次数阈值
     * @param AttackThreshold 攻击次数阈值
     */
    public void setAttackThreshold(Long AttackThreshold) {
        this.AttackThreshold = AttackThreshold;
    }

    /**
     * Get 自动封禁状态 
     * @return DefenseStatus 自动封禁状态
     */
    public Long getDefenseStatus() {
        return this.DefenseStatus;
    }

    /**
     * Set 自动封禁状态
     * @param DefenseStatus 自动封禁状态
     */
    public void setDefenseStatus(Long DefenseStatus) {
        this.DefenseStatus = DefenseStatus;
    }

    /**
     * Get 攻击时间阈值 
     * @return TimeThreshold 攻击时间阈值
     */
    public Long getTimeThreshold() {
        return this.TimeThreshold;
    }

    /**
     * Set 攻击时间阈值
     * @param TimeThreshold 攻击时间阈值
     */
    public void setTimeThreshold(Long TimeThreshold) {
        this.TimeThreshold = TimeThreshold;
    }

    /**
     * Get 自动封禁时间 
     * @return DenyTimeThreshold 自动封禁时间
     */
    public Long getDenyTimeThreshold() {
        return this.DenyTimeThreshold;
    }

    /**
     * Set 自动封禁时间
     * @param DenyTimeThreshold 自动封禁时间
     */
    public void setDenyTimeThreshold(Long DenyTimeThreshold) {
        this.DenyTimeThreshold = DenyTimeThreshold;
    }

    /**
     * Get 最后更新时间 
     * @return LastUpdateTime 最后更新时间
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后更新时间
     * @param LastUpdateTime 最后更新时间
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    public AutoDenyDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoDenyDetail(AutoDenyDetail source) {
        if (source.AttackTags != null) {
            this.AttackTags = new String[source.AttackTags.length];
            for (int i = 0; i < source.AttackTags.length; i++) {
                this.AttackTags[i] = new String(source.AttackTags[i]);
            }
        }
        if (source.AttackThreshold != null) {
            this.AttackThreshold = new Long(source.AttackThreshold);
        }
        if (source.DefenseStatus != null) {
            this.DefenseStatus = new Long(source.DefenseStatus);
        }
        if (source.TimeThreshold != null) {
            this.TimeThreshold = new Long(source.TimeThreshold);
        }
        if (source.DenyTimeThreshold != null) {
            this.DenyTimeThreshold = new Long(source.DenyTimeThreshold);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AttackTags.", this.AttackTags);
        this.setParamSimple(map, prefix + "AttackThreshold", this.AttackThreshold);
        this.setParamSimple(map, prefix + "DefenseStatus", this.DefenseStatus);
        this.setParamSimple(map, prefix + "TimeThreshold", this.TimeThreshold);
        this.setParamSimple(map, prefix + "DenyTimeThreshold", this.DenyTimeThreshold);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);

    }
}

