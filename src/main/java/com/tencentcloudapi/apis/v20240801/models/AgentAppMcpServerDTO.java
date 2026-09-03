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
    * <p>mcp server id</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>是否需要鉴权（已废弃，请勿使用）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NeedAuth")
    @Expose
    private Boolean NeedAuth;

    /**
    * <p>凭据代填的ID（已废弃，请勿使用）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentCredentialID")
    @Expose
    private String AgentCredentialID;

    /**
    * <p>应用为OAuth2认证时，sse模式请求mcp时的资源标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSEResourceIdentifier")
    @Expose
    private String SSEResourceIdentifier;

    /**
    * <p>应用为OAuth2认证时，streamable模式请求mcp时的资源标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamableResourceIdentifier")
    @Expose
    private String StreamableResourceIdentifier;

    /**
     * Get <p>mcp server id</p> 
     * @return ID <p>mcp server id</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>mcp server id</p>
     * @param ID <p>mcp server id</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>是否需要鉴权（已废弃，请勿使用）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NeedAuth <p>是否需要鉴权（已废弃，请勿使用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Boolean getNeedAuth() {
        return this.NeedAuth;
    }

    /**
     * Set <p>是否需要鉴权（已废弃，请勿使用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NeedAuth <p>是否需要鉴权（已废弃，请勿使用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setNeedAuth(Boolean NeedAuth) {
        this.NeedAuth = NeedAuth;
    }

    /**
     * Get <p>凭据代填的ID（已废弃，请勿使用）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentCredentialID <p>凭据代填的ID（已废弃，请勿使用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getAgentCredentialID() {
        return this.AgentCredentialID;
    }

    /**
     * Set <p>凭据代填的ID（已废弃，请勿使用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentCredentialID <p>凭据代填的ID（已废弃，请勿使用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setAgentCredentialID(String AgentCredentialID) {
        this.AgentCredentialID = AgentCredentialID;
    }

    /**
     * Get <p>应用为OAuth2认证时，sse模式请求mcp时的资源标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSEResourceIdentifier <p>应用为OAuth2认证时，sse模式请求mcp时的资源标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSSEResourceIdentifier() {
        return this.SSEResourceIdentifier;
    }

    /**
     * Set <p>应用为OAuth2认证时，sse模式请求mcp时的资源标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSEResourceIdentifier <p>应用为OAuth2认证时，sse模式请求mcp时的资源标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSEResourceIdentifier(String SSEResourceIdentifier) {
        this.SSEResourceIdentifier = SSEResourceIdentifier;
    }

    /**
     * Get <p>应用为OAuth2认证时，streamable模式请求mcp时的资源标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamableResourceIdentifier <p>应用为OAuth2认证时，streamable模式请求mcp时的资源标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStreamableResourceIdentifier() {
        return this.StreamableResourceIdentifier;
    }

    /**
     * Set <p>应用为OAuth2认证时，streamable模式请求mcp时的资源标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamableResourceIdentifier <p>应用为OAuth2认证时，streamable模式请求mcp时的资源标识</p>
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

