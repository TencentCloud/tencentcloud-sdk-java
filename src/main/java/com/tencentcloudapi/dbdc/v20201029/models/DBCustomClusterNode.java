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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBCustomClusterNode extends AbstractModel {

    /**
    * <p>节点ID</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>节点名称</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>节点内网IP地址</p>
    */
    @SerializedName("LanIP")
    @Expose
    private String LanIP;

    /**
    * <p>节点SSH 访问的Endpoint。格式为IP:Port.</p>
    */
    @SerializedName("SSHEndpoint")
    @Expose
    private String SSHEndpoint;

    /**
    * <p>节点在集群中的实例状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>节点所属的地域</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>节点类型</p><p>枚举值：</p><ul><li>DB.AT5.32XLARGE512： 高IO型服务器：128核心512GB内存，8*7180GB本地NvME SSDB。</li><li>DB.AT5.64XLARGE1152： 高IO型服务器：256核心1152GB内存，12*7180GB本地NvME SSDB。</li><li>DB.AT5.128XLARGE2304： 高IO型服务器：512核心2304GB内存，24*7180GB本地NvME SSDB。</li><li>DB.AT5.16XLARGE256： 高IO型服务器：64核心256GB内存，4*7180GB本地NvME SSDB。</li><li>DB.AT5.8XLARGE128： 高IO型服务器：32核心128GB内存，2*7180GB本地NvME SSDB。</li></ul>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>网络模式</p><p>枚举值：</p><ul><li>privatelink： 四层网络联通，放通SSH 通路</li><li>cross_tenant_eni： 三层网络联通，双网卡模式</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkMode")
    @Expose
    private String NetworkMode;

    /**
    * <p>当选择网络模式为三层网络联通模式时，此处的IP地址则为用户可访问的地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EniIP")
    @Expose
    private String EniIP;

    /**
    * <p>节点绑定的安全组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get <p>节点ID</p> 
     * @return NodeId <p>节点ID</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点ID</p>
     * @param NodeId <p>节点ID</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>节点名称</p> 
     * @return NodeName <p>节点名称</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>节点名称</p>
     * @param NodeName <p>节点名称</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>节点内网IP地址</p> 
     * @return LanIP <p>节点内网IP地址</p>
     */
    public String getLanIP() {
        return this.LanIP;
    }

    /**
     * Set <p>节点内网IP地址</p>
     * @param LanIP <p>节点内网IP地址</p>
     */
    public void setLanIP(String LanIP) {
        this.LanIP = LanIP;
    }

    /**
     * Get <p>节点SSH 访问的Endpoint。格式为IP:Port.</p> 
     * @return SSHEndpoint <p>节点SSH 访问的Endpoint。格式为IP:Port.</p>
     */
    public String getSSHEndpoint() {
        return this.SSHEndpoint;
    }

    /**
     * Set <p>节点SSH 访问的Endpoint。格式为IP:Port.</p>
     * @param SSHEndpoint <p>节点SSH 访问的Endpoint。格式为IP:Port.</p>
     */
    public void setSSHEndpoint(String SSHEndpoint) {
        this.SSHEndpoint = SSHEndpoint;
    }

    /**
     * Get <p>节点在集群中的实例状态</p> 
     * @return Status <p>节点在集群中的实例状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>节点在集群中的实例状态</p>
     * @param Status <p>节点在集群中的实例状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>节点所属的地域</p> 
     * @return Zone <p>节点所属的地域</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>节点所属的地域</p>
     * @param Zone <p>节点所属的地域</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>节点类型</p><p>枚举值：</p><ul><li>DB.AT5.32XLARGE512： 高IO型服务器：128核心512GB内存，8*7180GB本地NvME SSDB。</li><li>DB.AT5.64XLARGE1152： 高IO型服务器：256核心1152GB内存，12*7180GB本地NvME SSDB。</li><li>DB.AT5.128XLARGE2304： 高IO型服务器：512核心2304GB内存，24*7180GB本地NvME SSDB。</li><li>DB.AT5.16XLARGE256： 高IO型服务器：64核心256GB内存，4*7180GB本地NvME SSDB。</li><li>DB.AT5.8XLARGE128： 高IO型服务器：32核心128GB内存，2*7180GB本地NvME SSDB。</li></ul> 
     * @return NodeType <p>节点类型</p><p>枚举值：</p><ul><li>DB.AT5.32XLARGE512： 高IO型服务器：128核心512GB内存，8*7180GB本地NvME SSDB。</li><li>DB.AT5.64XLARGE1152： 高IO型服务器：256核心1152GB内存，12*7180GB本地NvME SSDB。</li><li>DB.AT5.128XLARGE2304： 高IO型服务器：512核心2304GB内存，24*7180GB本地NvME SSDB。</li><li>DB.AT5.16XLARGE256： 高IO型服务器：64核心256GB内存，4*7180GB本地NvME SSDB。</li><li>DB.AT5.8XLARGE128： 高IO型服务器：32核心128GB内存，2*7180GB本地NvME SSDB。</li></ul>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点类型</p><p>枚举值：</p><ul><li>DB.AT5.32XLARGE512： 高IO型服务器：128核心512GB内存，8*7180GB本地NvME SSDB。</li><li>DB.AT5.64XLARGE1152： 高IO型服务器：256核心1152GB内存，12*7180GB本地NvME SSDB。</li><li>DB.AT5.128XLARGE2304： 高IO型服务器：512核心2304GB内存，24*7180GB本地NvME SSDB。</li><li>DB.AT5.16XLARGE256： 高IO型服务器：64核心256GB内存，4*7180GB本地NvME SSDB。</li><li>DB.AT5.8XLARGE128： 高IO型服务器：32核心128GB内存，2*7180GB本地NvME SSDB。</li></ul>
     * @param NodeType <p>节点类型</p><p>枚举值：</p><ul><li>DB.AT5.32XLARGE512： 高IO型服务器：128核心512GB内存，8*7180GB本地NvME SSDB。</li><li>DB.AT5.64XLARGE1152： 高IO型服务器：256核心1152GB内存，12*7180GB本地NvME SSDB。</li><li>DB.AT5.128XLARGE2304： 高IO型服务器：512核心2304GB内存，24*7180GB本地NvME SSDB。</li><li>DB.AT5.16XLARGE256： 高IO型服务器：64核心256GB内存，4*7180GB本地NvME SSDB。</li><li>DB.AT5.8XLARGE128： 高IO型服务器：32核心128GB内存，2*7180GB本地NvME SSDB。</li></ul>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>网络模式</p><p>枚举值：</p><ul><li>privatelink： 四层网络联通，放通SSH 通路</li><li>cross_tenant_eni： 三层网络联通，双网卡模式</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkMode <p>网络模式</p><p>枚举值：</p><ul><li>privatelink： 四层网络联通，放通SSH 通路</li><li>cross_tenant_eni： 三层网络联通，双网卡模式</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkMode() {
        return this.NetworkMode;
    }

    /**
     * Set <p>网络模式</p><p>枚举值：</p><ul><li>privatelink： 四层网络联通，放通SSH 通路</li><li>cross_tenant_eni： 三层网络联通，双网卡模式</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkMode <p>网络模式</p><p>枚举值：</p><ul><li>privatelink： 四层网络联通，放通SSH 通路</li><li>cross_tenant_eni： 三层网络联通，双网卡模式</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkMode(String NetworkMode) {
        this.NetworkMode = NetworkMode;
    }

    /**
     * Get <p>当选择网络模式为三层网络联通模式时，此处的IP地址则为用户可访问的地址。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EniIP <p>当选择网络模式为三层网络联通模式时，此处的IP地址则为用户可访问的地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEniIP() {
        return this.EniIP;
    }

    /**
     * Set <p>当选择网络模式为三层网络联通模式时，此处的IP地址则为用户可访问的地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EniIP <p>当选择网络模式为三层网络联通模式时，此处的IP地址则为用户可访问的地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEniIP(String EniIP) {
        this.EniIP = EniIP;
    }

    /**
     * Get <p>节点绑定的安全组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroupIds <p>节点绑定的安全组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>节点绑定的安全组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroupIds <p>节点绑定的安全组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public DBCustomClusterNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBCustomClusterNode(DBCustomClusterNode source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.LanIP != null) {
            this.LanIP = new String(source.LanIP);
        }
        if (source.SSHEndpoint != null) {
            this.SSHEndpoint = new String(source.SSHEndpoint);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NetworkMode != null) {
            this.NetworkMode = new String(source.NetworkMode);
        }
        if (source.EniIP != null) {
            this.EniIP = new String(source.EniIP);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "LanIP", this.LanIP);
        this.setParamSimple(map, prefix + "SSHEndpoint", this.SSHEndpoint);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NetworkMode", this.NetworkMode);
        this.setParamSimple(map, prefix + "EniIP", this.EniIP);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

