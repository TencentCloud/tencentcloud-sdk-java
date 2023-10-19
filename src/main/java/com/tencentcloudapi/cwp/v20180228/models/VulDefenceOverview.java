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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDefenceOverview extends AbstractModel {

    /**
    * 防御开关：0 关闭 1 开启
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 已开启防御主机数
    */
    @SerializedName("DefendHostCount")
    @Expose
    private Long DefendHostCount;

    /**
    * 插件异常数
    */
    @SerializedName("ExceptionCount")
    @Expose
    private Long ExceptionCount;

    /**
    * 每日攻击趋势
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackCounts")
    @Expose
    private Long [] AttackCounts;

    /**
    * 每日防御趋势
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefendCounts")
    @Expose
    private Long [] DefendCounts;

    /**
    * 日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String [] Date;

    /**
     * Get 防御开关：0 关闭 1 开启 
     * @return Enable 防御开关：0 关闭 1 开启
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 防御开关：0 关闭 1 开启
     * @param Enable 防御开关：0 关闭 1 开启
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 已开启防御主机数 
     * @return DefendHostCount 已开启防御主机数
     */
    public Long getDefendHostCount() {
        return this.DefendHostCount;
    }

    /**
     * Set 已开启防御主机数
     * @param DefendHostCount 已开启防御主机数
     */
    public void setDefendHostCount(Long DefendHostCount) {
        this.DefendHostCount = DefendHostCount;
    }

    /**
     * Get 插件异常数 
     * @return ExceptionCount 插件异常数
     */
    public Long getExceptionCount() {
        return this.ExceptionCount;
    }

    /**
     * Set 插件异常数
     * @param ExceptionCount 插件异常数
     */
    public void setExceptionCount(Long ExceptionCount) {
        this.ExceptionCount = ExceptionCount;
    }

    /**
     * Get 每日攻击趋势
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackCounts 每日攻击趋势
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAttackCounts() {
        return this.AttackCounts;
    }

    /**
     * Set 每日攻击趋势
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackCounts 每日攻击趋势
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackCounts(Long [] AttackCounts) {
        this.AttackCounts = AttackCounts;
    }

    /**
     * Get 每日防御趋势
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefendCounts 每日防御趋势
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getDefendCounts() {
        return this.DefendCounts;
    }

    /**
     * Set 每日防御趋势
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefendCounts 每日防御趋势
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefendCounts(Long [] DefendCounts) {
        this.DefendCounts = DefendCounts;
    }

    /**
     * Get 日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDate() {
        return this.Date;
    }

    /**
     * Set 日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String [] Date) {
        this.Date = Date;
    }

    public VulDefenceOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceOverview(VulDefenceOverview source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.DefendHostCount != null) {
            this.DefendHostCount = new Long(source.DefendHostCount);
        }
        if (source.ExceptionCount != null) {
            this.ExceptionCount = new Long(source.ExceptionCount);
        }
        if (source.AttackCounts != null) {
            this.AttackCounts = new Long[source.AttackCounts.length];
            for (int i = 0; i < source.AttackCounts.length; i++) {
                this.AttackCounts[i] = new Long(source.AttackCounts[i]);
            }
        }
        if (source.DefendCounts != null) {
            this.DefendCounts = new Long[source.DefendCounts.length];
            for (int i = 0; i < source.DefendCounts.length; i++) {
                this.DefendCounts[i] = new Long(source.DefendCounts[i]);
            }
        }
        if (source.Date != null) {
            this.Date = new String[source.Date.length];
            for (int i = 0; i < source.Date.length; i++) {
                this.Date[i] = new String(source.Date[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "DefendHostCount", this.DefendHostCount);
        this.setParamSimple(map, prefix + "ExceptionCount", this.ExceptionCount);
        this.setParamArraySimple(map, prefix + "AttackCounts.", this.AttackCounts);
        this.setParamArraySimple(map, prefix + "DefendCounts.", this.DefendCounts);
        this.setParamArraySimple(map, prefix + "Date.", this.Date);

    }
}

