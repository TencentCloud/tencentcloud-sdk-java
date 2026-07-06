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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Account extends AbstractModel {

    /**
    * 租户appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 租户uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 剩余可用额度
    */
    @SerializedName("RemainQuota")
    @Expose
    private Long RemainQuota;

    /**
    * 租户名称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 下发规则数
    */
    @SerializedName("DispatchRuleNum")
    @Expose
    private Long DispatchRuleNum;

    /**
    * 产品已有规则数
    */
    @SerializedName("OriginRuleNum")
    @Expose
    private Long OriginRuleNum;

    /**
    * 总额度
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * 成员Id
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
     * Get 租户appid 
     * @return AppId 租户appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户appid
     * @param AppId 租户appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 租户uin 
     * @return Uin 租户uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 租户uin
     * @param Uin 租户uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 剩余可用额度 
     * @return RemainQuota 剩余可用额度
     */
    public Long getRemainQuota() {
        return this.RemainQuota;
    }

    /**
     * Set 剩余可用额度
     * @param RemainQuota 剩余可用额度
     */
    public void setRemainQuota(Long RemainQuota) {
        this.RemainQuota = RemainQuota;
    }

    /**
     * Get 租户名称 
     * @return Nickname 租户名称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 租户名称
     * @param Nickname 租户名称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 下发规则数 
     * @return DispatchRuleNum 下发规则数
     */
    public Long getDispatchRuleNum() {
        return this.DispatchRuleNum;
    }

    /**
     * Set 下发规则数
     * @param DispatchRuleNum 下发规则数
     */
    public void setDispatchRuleNum(Long DispatchRuleNum) {
        this.DispatchRuleNum = DispatchRuleNum;
    }

    /**
     * Get 产品已有规则数 
     * @return OriginRuleNum 产品已有规则数
     */
    public Long getOriginRuleNum() {
        return this.OriginRuleNum;
    }

    /**
     * Set 产品已有规则数
     * @param OriginRuleNum 产品已有规则数
     */
    public void setOriginRuleNum(Long OriginRuleNum) {
        this.OriginRuleNum = OriginRuleNum;
    }

    /**
     * Get 总额度 
     * @return TotalQuota 总额度
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set 总额度
     * @param TotalQuota 总额度
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get 成员Id 
     * @return MemberId 成员Id
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 成员Id
     * @param MemberId 成员Id
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    public Account() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Account(Account source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.RemainQuota != null) {
            this.RemainQuota = new Long(source.RemainQuota);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.DispatchRuleNum != null) {
            this.DispatchRuleNum = new Long(source.DispatchRuleNum);
        }
        if (source.OriginRuleNum != null) {
            this.OriginRuleNum = new Long(source.OriginRuleNum);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RemainQuota", this.RemainQuota);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "DispatchRuleNum", this.DispatchRuleNum);
        this.setParamSimple(map, prefix + "OriginRuleNum", this.OriginRuleNum);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);

    }
}

