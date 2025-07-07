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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JoinGameServerSessionResponse extends AbstractModel {

    /**
    * 玩家会话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlayerSession")
    @Expose
    private PlayerSession PlayerSession;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 玩家会话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlayerSession 玩家会话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PlayerSession getPlayerSession() {
        return this.PlayerSession;
    }

    /**
     * Set 玩家会话
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlayerSession 玩家会话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlayerSession(PlayerSession PlayerSession) {
        this.PlayerSession = PlayerSession;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public JoinGameServerSessionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinGameServerSessionResponse(JoinGameServerSessionResponse source) {
        if (source.PlayerSession != null) {
            this.PlayerSession = new PlayerSession(source.PlayerSession);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PlayerSession.", this.PlayerSession);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

