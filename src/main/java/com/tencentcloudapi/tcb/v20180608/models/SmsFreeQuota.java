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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsFreeQuota extends AbstractModel{

    /**
    * 免费量总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreeQuota")
    @Expose
    private Long FreeQuota;

    /**
    * 共计已使用总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalUsedQuota")
    @Expose
    private Long TotalUsedQuota;

    /**
    * 免费周期起点，0000-00-00 00:00:00 形式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleStart")
    @Expose
    private String CycleStart;

    /**
    * 免费周期终点，0000-00-00 00:00:00 形式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleEnd")
    @Expose
    private String CycleEnd;

    /**
    * 今天已使用总条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TodayUsedQuota")
    @Expose
    private Long TodayUsedQuota;

    /**
     * Get 免费量总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreeQuota 免费量总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set 免费量总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreeQuota 免费量总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreeQuota(Long FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Get 共计已使用总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalUsedQuota 共计已使用总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalUsedQuota() {
        return this.TotalUsedQuota;
    }

    /**
     * Set 共计已使用总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalUsedQuota 共计已使用总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalUsedQuota(Long TotalUsedQuota) {
        this.TotalUsedQuota = TotalUsedQuota;
    }

    /**
     * Get 免费周期起点，0000-00-00 00:00:00 形式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleStart 免费周期起点，0000-00-00 00:00:00 形式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleStart() {
        return this.CycleStart;
    }

    /**
     * Set 免费周期起点，0000-00-00 00:00:00 形式
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleStart 免费周期起点，0000-00-00 00:00:00 形式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleStart(String CycleStart) {
        this.CycleStart = CycleStart;
    }

    /**
     * Get 免费周期终点，0000-00-00 00:00:00 形式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleEnd 免费周期终点，0000-00-00 00:00:00 形式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleEnd() {
        return this.CycleEnd;
    }

    /**
     * Set 免费周期终点，0000-00-00 00:00:00 形式
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleEnd 免费周期终点，0000-00-00 00:00:00 形式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleEnd(String CycleEnd) {
        this.CycleEnd = CycleEnd;
    }

    /**
     * Get 今天已使用总条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TodayUsedQuota 今天已使用总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTodayUsedQuota() {
        return this.TodayUsedQuota;
    }

    /**
     * Set 今天已使用总条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TodayUsedQuota 今天已使用总条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTodayUsedQuota(Long TodayUsedQuota) {
        this.TodayUsedQuota = TodayUsedQuota;
    }

    public SmsFreeQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsFreeQuota(SmsFreeQuota source) {
        if (source.FreeQuota != null) {
            this.FreeQuota = new Long(source.FreeQuota);
        }
        if (source.TotalUsedQuota != null) {
            this.TotalUsedQuota = new Long(source.TotalUsedQuota);
        }
        if (source.CycleStart != null) {
            this.CycleStart = new String(source.CycleStart);
        }
        if (source.CycleEnd != null) {
            this.CycleEnd = new String(source.CycleEnd);
        }
        if (source.TodayUsedQuota != null) {
            this.TodayUsedQuota = new Long(source.TodayUsedQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FreeQuota", this.FreeQuota);
        this.setParamSimple(map, prefix + "TotalUsedQuota", this.TotalUsedQuota);
        this.setParamSimple(map, prefix + "CycleStart", this.CycleStart);
        this.setParamSimple(map, prefix + "CycleEnd", this.CycleEnd);
        this.setParamSimple(map, prefix + "TodayUsedQuota", this.TodayUsedQuota);

    }
}

