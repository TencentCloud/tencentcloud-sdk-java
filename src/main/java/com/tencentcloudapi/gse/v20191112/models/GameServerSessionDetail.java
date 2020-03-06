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

public class GameServerSessionDetail extends AbstractModel{

    /**
    * 游戏服务器会话
    */
    @SerializedName("GameServerSession")
    @Expose
    private GameServerSession GameServerSession;

    /**
    * 保护策略，可选（NoProtection,FullProtection）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectionPolicy")
    @Expose
    private String ProtectionPolicy;

    /**
     * Get 游戏服务器会话 
     * @return GameServerSession 游戏服务器会话
     */
    public GameServerSession getGameServerSession() {
        return this.GameServerSession;
    }

    /**
     * Set 游戏服务器会话
     * @param GameServerSession 游戏服务器会话
     */
    public void setGameServerSession(GameServerSession GameServerSession) {
        this.GameServerSession = GameServerSession;
    }

    /**
     * Get 保护策略，可选（NoProtection,FullProtection）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectionPolicy 保护策略，可选（NoProtection,FullProtection）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtectionPolicy() {
        return this.ProtectionPolicy;
    }

    /**
     * Set 保护策略，可选（NoProtection,FullProtection）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectionPolicy 保护策略，可选（NoProtection,FullProtection）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectionPolicy(String ProtectionPolicy) {
        this.ProtectionPolicy = ProtectionPolicy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "GameServerSession.", this.GameServerSession);
        this.setParamSimple(map, prefix + "ProtectionPolicy", this.ProtectionPolicy);

    }
}

