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

public class AccountStatsGroup extends AbstractModel {

    /**
    * 成员账号信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Member")
    @Expose
    private MemberInfo Member;

    /**
    * 该账号下所有产品待整改风险数汇总
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UntreatedRiskCount")
    @Expose
    private Long UntreatedRiskCount;

    /**
    * 该账号下各产品维度的风险统计列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductStats")
    @Expose
    private AccountProductDetailStats [] ProductStats;

    /**
    * 整改率
    */
    @SerializedName("RectifyRate")
    @Expose
    private String RectifyRate;

    /**
     * Get 成员账号信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Member 成员账号信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemberInfo getMember() {
        return this.Member;
    }

    /**
     * Set 成员账号信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Member 成员账号信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMember(MemberInfo Member) {
        this.Member = Member;
    }

    /**
     * Get 该账号下所有产品待整改风险数汇总
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UntreatedRiskCount 该账号下所有产品待整改风险数汇总
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUntreatedRiskCount() {
        return this.UntreatedRiskCount;
    }

    /**
     * Set 该账号下所有产品待整改风险数汇总
注意：此字段可能返回 null，表示取不到有效值。
     * @param UntreatedRiskCount 该账号下所有产品待整改风险数汇总
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUntreatedRiskCount(Long UntreatedRiskCount) {
        this.UntreatedRiskCount = UntreatedRiskCount;
    }

    /**
     * Get 该账号下各产品维度的风险统计列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductStats 该账号下各产品维度的风险统计列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccountProductDetailStats [] getProductStats() {
        return this.ProductStats;
    }

    /**
     * Set 该账号下各产品维度的风险统计列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductStats 该账号下各产品维度的风险统计列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductStats(AccountProductDetailStats [] ProductStats) {
        this.ProductStats = ProductStats;
    }

    /**
     * Get 整改率 
     * @return RectifyRate 整改率
     */
    public String getRectifyRate() {
        return this.RectifyRate;
    }

    /**
     * Set 整改率
     * @param RectifyRate 整改率
     */
    public void setRectifyRate(String RectifyRate) {
        this.RectifyRate = RectifyRate;
    }

    public AccountStatsGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountStatsGroup(AccountStatsGroup source) {
        if (source.Member != null) {
            this.Member = new MemberInfo(source.Member);
        }
        if (source.UntreatedRiskCount != null) {
            this.UntreatedRiskCount = new Long(source.UntreatedRiskCount);
        }
        if (source.ProductStats != null) {
            this.ProductStats = new AccountProductDetailStats[source.ProductStats.length];
            for (int i = 0; i < source.ProductStats.length; i++) {
                this.ProductStats[i] = new AccountProductDetailStats(source.ProductStats[i]);
            }
        }
        if (source.RectifyRate != null) {
            this.RectifyRate = new String(source.RectifyRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Member.", this.Member);
        this.setParamSimple(map, prefix + "UntreatedRiskCount", this.UntreatedRiskCount);
        this.setParamArrayObj(map, prefix + "ProductStats.", this.ProductStats);
        this.setParamSimple(map, prefix + "RectifyRate", this.RectifyRate);

    }
}

