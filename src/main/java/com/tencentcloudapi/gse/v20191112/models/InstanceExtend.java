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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceExtend extends AbstractModel{

    /**
    * 实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instance")
    @Expose
    private Instance Instance;

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 健康进程数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthyProcessCnt")
    @Expose
    private Long HealthyProcessCnt;

    /**
    * 活跃进程数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveProcessCnt")
    @Expose
    private Long ActiveProcessCnt;

    /**
    * 当前游戏会话总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GameSessionCnt")
    @Expose
    private Long GameSessionCnt;

    /**
    * 最大游戏会话数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxGameSessionCnt")
    @Expose
    private Long MaxGameSessionCnt;

    /**
    * 当前玩家会话数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlayerSessionCnt")
    @Expose
    private Long PlayerSessionCnt;

    /**
    * 最大玩家会话数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxPlayerSessionCnt")
    @Expose
    private Long MaxPlayerSessionCnt;

    /**
     * Get 实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instance 实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Instance getInstance() {
        return this.Instance;
    }

    /**
     * Set 实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instance 实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstance(Instance Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 健康进程数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthyProcessCnt 健康进程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHealthyProcessCnt() {
        return this.HealthyProcessCnt;
    }

    /**
     * Set 健康进程数
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthyProcessCnt 健康进程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthyProcessCnt(Long HealthyProcessCnt) {
        this.HealthyProcessCnt = HealthyProcessCnt;
    }

    /**
     * Get 活跃进程数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveProcessCnt 活跃进程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActiveProcessCnt() {
        return this.ActiveProcessCnt;
    }

    /**
     * Set 活跃进程数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveProcessCnt 活跃进程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveProcessCnt(Long ActiveProcessCnt) {
        this.ActiveProcessCnt = ActiveProcessCnt;
    }

    /**
     * Get 当前游戏会话总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GameSessionCnt 当前游戏会话总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGameSessionCnt() {
        return this.GameSessionCnt;
    }

    /**
     * Set 当前游戏会话总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param GameSessionCnt 当前游戏会话总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGameSessionCnt(Long GameSessionCnt) {
        this.GameSessionCnt = GameSessionCnt;
    }

    /**
     * Get 最大游戏会话数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxGameSessionCnt 最大游戏会话数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxGameSessionCnt() {
        return this.MaxGameSessionCnt;
    }

    /**
     * Set 最大游戏会话数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxGameSessionCnt 最大游戏会话数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxGameSessionCnt(Long MaxGameSessionCnt) {
        this.MaxGameSessionCnt = MaxGameSessionCnt;
    }

    /**
     * Get 当前玩家会话数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlayerSessionCnt 当前玩家会话数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPlayerSessionCnt() {
        return this.PlayerSessionCnt;
    }

    /**
     * Set 当前玩家会话数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlayerSessionCnt 当前玩家会话数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlayerSessionCnt(Long PlayerSessionCnt) {
        this.PlayerSessionCnt = PlayerSessionCnt;
    }

    /**
     * Get 最大玩家会话数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxPlayerSessionCnt 最大玩家会话数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxPlayerSessionCnt() {
        return this.MaxPlayerSessionCnt;
    }

    /**
     * Set 最大玩家会话数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxPlayerSessionCnt 最大玩家会话数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxPlayerSessionCnt(Long MaxPlayerSessionCnt) {
        this.MaxPlayerSessionCnt = MaxPlayerSessionCnt;
    }

    public InstanceExtend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceExtend(InstanceExtend source) {
        if (source.Instance != null) {
            this.Instance = new Instance(source.Instance);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.HealthyProcessCnt != null) {
            this.HealthyProcessCnt = new Long(source.HealthyProcessCnt);
        }
        if (source.ActiveProcessCnt != null) {
            this.ActiveProcessCnt = new Long(source.ActiveProcessCnt);
        }
        if (source.GameSessionCnt != null) {
            this.GameSessionCnt = new Long(source.GameSessionCnt);
        }
        if (source.MaxGameSessionCnt != null) {
            this.MaxGameSessionCnt = new Long(source.MaxGameSessionCnt);
        }
        if (source.PlayerSessionCnt != null) {
            this.PlayerSessionCnt = new Long(source.PlayerSessionCnt);
        }
        if (source.MaxPlayerSessionCnt != null) {
            this.MaxPlayerSessionCnt = new Long(source.MaxPlayerSessionCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Instance.", this.Instance);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "HealthyProcessCnt", this.HealthyProcessCnt);
        this.setParamSimple(map, prefix + "ActiveProcessCnt", this.ActiveProcessCnt);
        this.setParamSimple(map, prefix + "GameSessionCnt", this.GameSessionCnt);
        this.setParamSimple(map, prefix + "MaxGameSessionCnt", this.MaxGameSessionCnt);
        this.setParamSimple(map, prefix + "PlayerSessionCnt", this.PlayerSessionCnt);
        this.setParamSimple(map, prefix + "MaxPlayerSessionCnt", this.MaxPlayerSessionCnt);

    }
}

