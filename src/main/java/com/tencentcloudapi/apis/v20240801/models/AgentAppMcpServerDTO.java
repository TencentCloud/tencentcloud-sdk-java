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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentAppMcpServerDTO extends AbstractModel {

    /**
    * mcp server id
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 是否需要鉴权
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NeedAuth")
    @Expose
    private Boolean NeedAuth;

    /**
    * 凭据代填的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentCredentialID")
    @Expose
    private String AgentCredentialID;

    /**
    * 应用为OAuth2认证时，sse模式请求mcp时的资源标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSEResourceIdentifier")
    @Expose
    private String SSEResourceIdentifier;

    /**
    * 应用为OAuth2认证时，streamable模式请求mcp时的资源标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamableResourceIdentifier")
    @Expose
    private String StreamableResourceIdentifier;

    /**
     * Get mcp server id 
     * @return ID mcp server id
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set mcp server id
     * @param ID mcp server id
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 是否需要鉴权
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NeedAuth 是否需要鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNeedAuth() {
        return this.NeedAuth;
    }

    /**
     * Set 是否需要鉴权
注意：此字段可能返回 null，表示取不到有效值。
     * @param NeedAuth 是否需要鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNeedAuth(Boolean NeedAuth) {
        this.NeedAuth = NeedAuth;
    }

    /**
     * Get 凭据代填的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentCredentialID 凭据代填的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentCredentialID() {
        return this.AgentCredentialID;
    }

    /**
     * Set 凭据代填的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentCredentialID 凭据代填的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentCredentialID(String AgentCredentialID) {
        this.AgentCredentialID = AgentCredentialID;
    }

    /**
     * Get 应用为OAuth2认证时，sse模式请求mcp时的资源标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSEResourceIdentifier 应用为OAuth2认证时，sse模式请求mcp时的资源标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSSEResourceIdentifier() {
        return this.SSEResourceIdentifier;
    }

    /**
     * Set 应用为OAuth2认证时，sse模式请求mcp时的资源标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSEResourceIdentifier 应用为OAuth2认证时，sse模式请求mcp时的资源标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSEResourceIdentifier(String SSEResourceIdentifier) {
        this.SSEResourceIdentifier = SSEResourceIdentifier;
    }

    /**
     * Get 应用为OAuth2认证时，streamable模式请求mcp时的资源标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamableResourceIdentifier 应用为OAuth2认证时，streamable模式请求mcp时的资源标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStreamableResourceIdentifier() {
        return this.StreamableResourceIdentifier;
    }

    /**
     * Set 应用为OAuth2认证时，streamable模式请求mcp时的资源标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamableResourceIdentifier 应用为OAuth2认证时，streamable模式请求mcp时的资源标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamableResourceIdentifier(String StreamableResourceIdentifier) {
        this.StreamableResourceIdentifier = StreamableResourceIdentifier;
    }

    public AgentAppMcpServerDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentAppMcpServerDTO(AgentAppMcpServerDTO source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.NeedAuth != null) {
            this.NeedAuth = new Boolean(source.NeedAuth);
        }
        if (source.AgentCredentialID != null) {
            this.AgentCredentialID = new String(source.AgentCredentialID);
        }
        if (source.SSEResourceIdentifier != null) {
            this.SSEResourceIdentifier = new String(source.SSEResourceIdentifier);
        }
        if (source.StreamableResourceIdentifier != null) {
            this.StreamableResourceIdentifier = new String(source.StreamableResourceIdentifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "NeedAuth", this.NeedAuth);
        this.setParamSimple(map, prefix + "AgentCredentialID", this.AgentCredentialID);
        this.setParamSimple(map, prefix + "SSEResourceIdentifier", this.SSEResourceIdentifier);
        this.setParamSimple(map, prefix + "StreamableResourceIdentifier", this.StreamableResourceIdentifier);

    }
}

