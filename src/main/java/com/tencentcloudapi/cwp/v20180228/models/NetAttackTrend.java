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

public class NetAttackTrend extends AbstractModel {

    /**
    * 时间点，如 2023-05-06
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DateTime")
    @Expose
    private String DateTime;

    /**
    * 攻击次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

    /**
    * 尝试攻击次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TryAttackCount")
    @Expose
    private Long TryAttackCount;

    /**
    * 攻击成功次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccAttackCount")
    @Expose
    private Long SuccAttackCount;

    /**
     * Get 时间点，如 2023-05-06
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DateTime 时间点，如 2023-05-06
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDateTime() {
        return this.DateTime;
    }

    /**
     * Set 时间点，如 2023-05-06
注意：此字段可能返回 null，表示取不到有效值。
     * @param DateTime 时间点，如 2023-05-06
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    /**
     * Get 攻击次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackCount 攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set 攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackCount 攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
    }

    /**
     * Get 尝试攻击次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TryAttackCount 尝试攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTryAttackCount() {
        return this.TryAttackCount;
    }

    /**
     * Set 尝试攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TryAttackCount 尝试攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTryAttackCount(Long TryAttackCount) {
        this.TryAttackCount = TryAttackCount;
    }

    /**
     * Get 攻击成功次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccAttackCount 攻击成功次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccAttackCount() {
        return this.SuccAttackCount;
    }

    /**
     * Set 攻击成功次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccAttackCount 攻击成功次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccAttackCount(Long SuccAttackCount) {
        this.SuccAttackCount = SuccAttackCount;
    }

    public NetAttackTrend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetAttackTrend(NetAttackTrend source) {
        if (source.DateTime != null) {
            this.DateTime = new String(source.DateTime);
        }
        if (source.AttackCount != null) {
            this.AttackCount = new Long(source.AttackCount);
        }
        if (source.TryAttackCount != null) {
            this.TryAttackCount = new Long(source.TryAttackCount);
        }
        if (source.SuccAttackCount != null) {
            this.SuccAttackCount = new Long(source.SuccAttackCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DateTime", this.DateTime);
        this.setParamSimple(map, prefix + "AttackCount", this.AttackCount);
        this.setParamSimple(map, prefix + "TryAttackCount", this.TryAttackCount);
        this.setParamSimple(map, prefix + "SuccAttackCount", this.SuccAttackCount);

    }
}

