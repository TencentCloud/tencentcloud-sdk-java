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

public class AgentAppMcpServerVO extends AbstractModel {

    /**
    * 绑定ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 需要认证
    */
    @SerializedName("NeedAuth")
    @Expose
    private Boolean NeedAuth;

    /**
    * 凭据ID
    */
    @SerializedName("AgentCredentialID")
    @Expose
    private String AgentCredentialID;

    /**
    * 凭据详情
    */
    @SerializedName("AgentCredentialVO")
    @Expose
    private DescribeAgentCredentialResp AgentCredentialVO;

    /**
    * mcp详情
    */
    @SerializedName("McpServerVO")
    @Expose
    private DescribeMcpServerResponseVO McpServerVO;

    /**
    * 关联时间
    */
    @SerializedName("RelateTime")
    @Expose
    private String RelateTime;

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
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentAppID")
    @Expose
    private String AgentAppID;

    /**
    * mcp ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("McpServerID")
    @Expose
    private String McpServerID;

    /**
     * Get 绑定ID 
     * @return ID 绑定ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 绑定ID
     * @param ID 绑定ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 需要认证 
     * @return NeedAuth 需要认证
     */
    public Boolean getNeedAuth() {
        return this.NeedAuth;
    }

    /**
     * Set 需要认证
     * @param NeedAuth 需要认证
     */
    public void setNeedAuth(Boolean NeedAuth) {
        this.NeedAuth = NeedAuth;
    }

    /**
     * Get 凭据ID 
     * @return AgentCredentialID 凭据ID
     */
    public String getAgentCredentialID() {
        return this.AgentCredentialID;
    }

    /**
     * Set 凭据ID
     * @param AgentCredentialID 凭据ID
     */
    public void setAgentCredentialID(String AgentCredentialID) {
        this.AgentCredentialID = AgentCredentialID;
    }

    /**
     * Get 凭据详情 
     * @return AgentCredentialVO 凭据详情
     */
    public DescribeAgentCredentialResp getAgentCredentialVO() {
        return this.AgentCredentialVO;
    }

    /**
     * Set 凭据详情
     * @param AgentCredentialVO 凭据详情
     */
    public void setAgentCredentialVO(DescribeAgentCredentialResp AgentCredentialVO) {
        this.AgentCredentialVO = AgentCredentialVO;
    }

    /**
     * Get mcp详情 
     * @return McpServerVO mcp详情
     */
    public DescribeMcpServerResponseVO getMcpServerVO() {
        return this.McpServerVO;
    }

    /**
     * Set mcp详情
     * @param McpServerVO mcp详情
     */
    public void setMcpServerVO(DescribeMcpServerResponseVO McpServerVO) {
        this.McpServerVO = McpServerVO;
    }

    /**
     * Get 关联时间 
     * @return RelateTime 关联时间
     */
    public String getRelateTime() {
        return this.RelateTime;
    }

    /**
     * Set 关联时间
     * @param RelateTime 关联时间
     */
    public void setRelateTime(String RelateTime) {
        this.RelateTime = RelateTime;
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

    /**
     * Get 应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentAppID 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentAppID() {
        return this.AgentAppID;
    }

    /**
     * Set 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentAppID 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentAppID(String AgentAppID) {
        this.AgentAppID = AgentAppID;
    }

    /**
     * Get mcp ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return McpServerID mcp ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMcpServerID() {
        return this.McpServerID;
    }

    /**
     * Set mcp ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param McpServerID mcp ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMcpServerID(String McpServerID) {
        this.McpServerID = McpServerID;
    }

    public AgentAppMcpServerVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentAppMcpServerVO(AgentAppMcpServerVO source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.NeedAuth != null) {
            this.NeedAuth = new Boolean(source.NeedAuth);
        }
        if (source.AgentCredentialID != null) {
            this.AgentCredentialID = new String(source.AgentCredentialID);
        }
        if (source.AgentCredentialVO != null) {
            this.AgentCredentialVO = new DescribeAgentCredentialResp(source.AgentCredentialVO);
        }
        if (source.McpServerVO != null) {
            this.McpServerVO = new DescribeMcpServerResponseVO(source.McpServerVO);
        }
        if (source.RelateTime != null) {
            this.RelateTime = new String(source.RelateTime);
        }
        if (source.SSEResourceIdentifier != null) {
            this.SSEResourceIdentifier = new String(source.SSEResourceIdentifier);
        }
        if (source.StreamableResourceIdentifier != null) {
            this.StreamableResourceIdentifier = new String(source.StreamableResourceIdentifier);
        }
        if (source.AgentAppID != null) {
            this.AgentAppID = new String(source.AgentAppID);
        }
        if (source.McpServerID != null) {
            this.McpServerID = new String(source.McpServerID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "NeedAuth", this.NeedAuth);
        this.setParamSimple(map, prefix + "AgentCredentialID", this.AgentCredentialID);
        this.setParamObj(map, prefix + "AgentCredentialVO.", this.AgentCredentialVO);
        this.setParamObj(map, prefix + "McpServerVO.", this.McpServerVO);
        this.setParamSimple(map, prefix + "RelateTime", this.RelateTime);
        this.setParamSimple(map, prefix + "SSEResourceIdentifier", this.SSEResourceIdentifier);
        this.setParamSimple(map, prefix + "StreamableResourceIdentifier", this.StreamableResourceIdentifier);
        this.setParamSimple(map, prefix + "AgentAppID", this.AgentAppID);
        this.setParamSimple(map, prefix + "McpServerID", this.McpServerID);

    }
}

