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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDosAttackSourceEvent extends AbstractModel{

    /**
    * 攻击源ip。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackSourceIp")
    @Expose
    private String AttackSourceIp;

    /**
    * 地区（国家）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackRegion")
    @Expose
    private String AttackRegion;

    /**
    * 累计攻击流量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackFlow")
    @Expose
    private Long AttackFlow;

    /**
    * 累计攻击包量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackPacketNum")
    @Expose
    private Long AttackPacketNum;

    /**
     * Get 攻击源ip。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackSourceIp 攻击源ip。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackSourceIp() {
        return this.AttackSourceIp;
    }

    /**
     * Set 攻击源ip。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackSourceIp 攻击源ip。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackSourceIp(String AttackSourceIp) {
        this.AttackSourceIp = AttackSourceIp;
    }

    /**
     * Get 地区（国家）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackRegion 地区（国家）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackRegion() {
        return this.AttackRegion;
    }

    /**
     * Set 地区（国家）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackRegion 地区（国家）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackRegion(String AttackRegion) {
        this.AttackRegion = AttackRegion;
    }

    /**
     * Get 累计攻击流量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackFlow 累计攻击流量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackFlow() {
        return this.AttackFlow;
    }

    /**
     * Set 累计攻击流量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackFlow 累计攻击流量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackFlow(Long AttackFlow) {
        this.AttackFlow = AttackFlow;
    }

    /**
     * Get 累计攻击包量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackPacketNum 累计攻击包量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackPacketNum() {
        return this.AttackPacketNum;
    }

    /**
     * Set 累计攻击包量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackPacketNum 累计攻击包量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackPacketNum(Long AttackPacketNum) {
        this.AttackPacketNum = AttackPacketNum;
    }

    public DDosAttackSourceEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDosAttackSourceEvent(DDosAttackSourceEvent source) {
        if (source.AttackSourceIp != null) {
            this.AttackSourceIp = new String(source.AttackSourceIp);
        }
        if (source.AttackRegion != null) {
            this.AttackRegion = new String(source.AttackRegion);
        }
        if (source.AttackFlow != null) {
            this.AttackFlow = new Long(source.AttackFlow);
        }
        if (source.AttackPacketNum != null) {
            this.AttackPacketNum = new Long(source.AttackPacketNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackSourceIp", this.AttackSourceIp);
        this.setParamSimple(map, prefix + "AttackRegion", this.AttackRegion);
        this.setParamSimple(map, prefix + "AttackFlow", this.AttackFlow);
        this.setParamSimple(map, prefix + "AttackPacketNum", this.AttackPacketNum);

    }
}

