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

public class FleetUtilization extends AbstractModel{

    /**
    * 游戏会话数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveGameServerSessionCount")
    @Expose
    private Long ActiveGameServerSessionCount;

    /**
    * 活跃进程数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveServerProcessCount")
    @Expose
    private Long ActiveServerProcessCount;

    /**
    * 当前游戏玩家数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentPlayerSessionCount")
    @Expose
    private Long CurrentPlayerSessionCount;

    /**
    * 服务部署 Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 最大玩家会话数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
     * Get 游戏会话数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveGameServerSessionCount 游戏会话数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActiveGameServerSessionCount() {
        return this.ActiveGameServerSessionCount;
    }

    /**
     * Set 游戏会话数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveGameServerSessionCount 游戏会话数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveGameServerSessionCount(Long ActiveGameServerSessionCount) {
        this.ActiveGameServerSessionCount = ActiveGameServerSessionCount;
    }

    /**
     * Get 活跃进程数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveServerProcessCount 活跃进程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActiveServerProcessCount() {
        return this.ActiveServerProcessCount;
    }

    /**
     * Set 活跃进程数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveServerProcessCount 活跃进程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveServerProcessCount(Long ActiveServerProcessCount) {
        this.ActiveServerProcessCount = ActiveServerProcessCount;
    }

    /**
     * Get 当前游戏玩家数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentPlayerSessionCount 当前游戏玩家数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentPlayerSessionCount() {
        return this.CurrentPlayerSessionCount;
    }

    /**
     * Set 当前游戏玩家数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentPlayerSessionCount 当前游戏玩家数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentPlayerSessionCount(Long CurrentPlayerSessionCount) {
        this.CurrentPlayerSessionCount = CurrentPlayerSessionCount;
    }

    /**
     * Get 服务部署 Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FleetId 服务部署 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务部署 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FleetId 服务部署 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 最大玩家会话数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaximumPlayerSessionCount 最大玩家会话数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaximumPlayerSessionCount() {
        return this.MaximumPlayerSessionCount;
    }

    /**
     * Set 最大玩家会话数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaximumPlayerSessionCount 最大玩家会话数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaximumPlayerSessionCount(Long MaximumPlayerSessionCount) {
        this.MaximumPlayerSessionCount = MaximumPlayerSessionCount;
    }

    public FleetUtilization() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FleetUtilization(FleetUtilization source) {
        if (source.ActiveGameServerSessionCount != null) {
            this.ActiveGameServerSessionCount = new Long(source.ActiveGameServerSessionCount);
        }
        if (source.ActiveServerProcessCount != null) {
            this.ActiveServerProcessCount = new Long(source.ActiveServerProcessCount);
        }
        if (source.CurrentPlayerSessionCount != null) {
            this.CurrentPlayerSessionCount = new Long(source.CurrentPlayerSessionCount);
        }
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.MaximumPlayerSessionCount != null) {
            this.MaximumPlayerSessionCount = new Long(source.MaximumPlayerSessionCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActiveGameServerSessionCount", this.ActiveGameServerSessionCount);
        this.setParamSimple(map, prefix + "ActiveServerProcessCount", this.ActiveServerProcessCount);
        this.setParamSimple(map, prefix + "CurrentPlayerSessionCount", this.CurrentPlayerSessionCount);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "MaximumPlayerSessionCount", this.MaximumPlayerSessionCount);

    }
}

