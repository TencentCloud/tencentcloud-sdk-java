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
    * <p>绑定ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>需要认证</p>
    */
    @SerializedName("NeedAuth")
    @Expose
    private Boolean NeedAuth;

    /**
    * <p>凭据ID</p>
    */
    @SerializedName("AgentCredentialID")
    @Expose
    private String AgentCredentialID;

    /**
    * <p>凭据详情</p>
    */
    @SerializedName("AgentCredentialVO")
    @Expose
    private DescribeAgentCredentialResp AgentCredentialVO;

    /**
    * <p>mcp详情</p>
    */
    @SerializedName("McpServerVO")
    @Expose
    private DescribeMcpServerResponseVO McpServerVO;

    /**
    * <p>关联时间</p>
    */
    @SerializedName("RelateTime")
    @Expose
    private String RelateTime;

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
    * <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentAppID")
    @Expose
    private String AgentAppID;

    /**
    * <p>mcp ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("McpServerID")
    @Expose
    private String McpServerID;

    /**
    * <p>应用</p>
    */
    @SerializedName("AgentAppVO")
    @Expose
    private DescribeAgentAppResp AgentAppVO;

    /**
     * Get <p>绑定ID</p> 
     * @return ID <p>绑定ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>绑定ID</p>
     * @param ID <p>绑定ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>需要认证</p> 
     * @return NeedAuth <p>需要认证</p>
     */
    public Boolean getNeedAuth() {
        return this.NeedAuth;
    }

    /**
     * Set <p>需要认证</p>
     * @param NeedAuth <p>需要认证</p>
     */
    public void setNeedAuth(Boolean NeedAuth) {
        this.NeedAuth = NeedAuth;
    }

    /**
     * Get <p>凭据ID</p> 
     * @return AgentCredentialID <p>凭据ID</p>
     */
    public String getAgentCredentialID() {
        return this.AgentCredentialID;
    }

    /**
     * Set <p>凭据ID</p>
     * @param AgentCredentialID <p>凭据ID</p>
     */
    public void setAgentCredentialID(String AgentCredentialID) {
        this.AgentCredentialID = AgentCredentialID;
    }

    /**
     * Get <p>凭据详情</p> 
     * @return AgentCredentialVO <p>凭据详情</p>
     */
    public DescribeAgentCredentialResp getAgentCredentialVO() {
        return this.AgentCredentialVO;
    }

    /**
     * Set <p>凭据详情</p>
     * @param AgentCredentialVO <p>凭据详情</p>
     */
    public void setAgentCredentialVO(DescribeAgentCredentialResp AgentCredentialVO) {
        this.AgentCredentialVO = AgentCredentialVO;
    }

    /**
     * Get <p>mcp详情</p> 
     * @return McpServerVO <p>mcp详情</p>
     */
    public DescribeMcpServerResponseVO getMcpServerVO() {
        return this.McpServerVO;
    }

    /**
     * Set <p>mcp详情</p>
     * @param McpServerVO <p>mcp详情</p>
     */
    public void setMcpServerVO(DescribeMcpServerResponseVO McpServerVO) {
        this.McpServerVO = McpServerVO;
    }

    /**
     * Get <p>关联时间</p> 
     * @return RelateTime <p>关联时间</p>
     */
    public String getRelateTime() {
        return this.RelateTime;
    }

    /**
     * Set <p>关联时间</p>
     * @param RelateTime <p>关联时间</p>
     */
    public void setRelateTime(String RelateTime) {
        this.RelateTime = RelateTime;
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

    /**
     * Get <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentAppID <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentAppID() {
        return this.AgentAppID;
    }

    /**
     * Set <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentAppID <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentAppID(String AgentAppID) {
        this.AgentAppID = AgentAppID;
    }

    /**
     * Get <p>mcp ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return McpServerID <p>mcp ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMcpServerID() {
        return this.McpServerID;
    }

    /**
     * Set <p>mcp ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param McpServerID <p>mcp ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMcpServerID(String McpServerID) {
        this.McpServerID = McpServerID;
    }

    /**
     * Get <p>应用</p> 
     * @return AgentAppVO <p>应用</p>
     */
    public DescribeAgentAppResp getAgentAppVO() {
        return this.AgentAppVO;
    }

    /**
     * Set <p>应用</p>
     * @param AgentAppVO <p>应用</p>
     */
    public void setAgentAppVO(DescribeAgentAppResp AgentAppVO) {
        this.AgentAppVO = AgentAppVO;
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
        if (source.AgentAppVO != null) {
            this.AgentAppVO = new DescribeAgentAppResp(source.AgentAppVO);
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
        this.setParamObj(map, prefix + "AgentAppVO.", this.AgentAppVO);

    }
}

