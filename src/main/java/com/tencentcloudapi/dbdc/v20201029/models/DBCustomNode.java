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

public class DBCustomNode extends AbstractModel {

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
    * <p>访问此节点的SSH Endpoint，格式为IP:Port</p>
    */
    @SerializedName("SSHEndpoint")
    @Expose
    private String SSHEndpoint;

    /**
    * <p>节点的内网通信IP地址</p>
    */
    @SerializedName("LanIP")
    @Expose
    private String LanIP;

    /**
    * <p>节点所属的集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>节点所属的可用区</p>
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
    * <p>节点CPU大小</p><p>单位：核</p>
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * <p>节点内存</p><p>单位：GiB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>系统盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * <p>数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>节点的操作系统名称</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>节点的操作系统镜像ID</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>节点SSH Endpoint 所属的VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>节点SSH Endpoint 所属的VPC 子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>节点状态</p><p>枚举值：</p><ul><li>Creating： 创建中</li><li>Running： 运行中</li><li>Isolating： 隔离中</li><li>Isolated： 已隔离</li><li>Activating： 解除隔离中</li><li>Destroying： 销毁中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>付费类型</p><p>枚举值：</p><ul><li>PREPAID： 包年包月</li></ul>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>节点到期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>节点创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>节点隔离时间</p>
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * <p>节点标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>节点是否自动续费标记</p><p>枚举值：</p><ul><li>1： 自动续费</li><li>2： 不自动续费</li></ul>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>交换机ID（已加密）</p>
    */
    @SerializedName("SwitchId")
    @Expose
    private String SwitchId;

    /**
    * <p>机架ID（已加密）</p>
    */
    @SerializedName("RackId")
    @Expose
    private String RackId;

    /**
    * <p>底层物理机IP（已加密）</p>
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

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
     * Get <p>访问此节点的SSH Endpoint，格式为IP:Port</p> 
     * @return SSHEndpoint <p>访问此节点的SSH Endpoint，格式为IP:Port</p>
     */
    public String getSSHEndpoint() {
        return this.SSHEndpoint;
    }

    /**
     * Set <p>访问此节点的SSH Endpoint，格式为IP:Port</p>
     * @param SSHEndpoint <p>访问此节点的SSH Endpoint，格式为IP:Port</p>
     */
    public void setSSHEndpoint(String SSHEndpoint) {
        this.SSHEndpoint = SSHEndpoint;
    }

    /**
     * Get <p>节点的内网通信IP地址</p> 
     * @return LanIP <p>节点的内网通信IP地址</p>
     */
    public String getLanIP() {
        return this.LanIP;
    }

    /**
     * Set <p>节点的内网通信IP地址</p>
     * @param LanIP <p>节点的内网通信IP地址</p>
     */
    public void setLanIP(String LanIP) {
        this.LanIP = LanIP;
    }

    /**
     * Get <p>节点所属的集群ID</p> 
     * @return ClusterId <p>节点所属的集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>节点所属的集群ID</p>
     * @param ClusterId <p>节点所属的集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>节点所属的可用区</p> 
     * @return Zone <p>节点所属的可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>节点所属的可用区</p>
     * @param Zone <p>节点所属的可用区</p>
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
     * Get <p>节点CPU大小</p><p>单位：核</p> 
     * @return CPU <p>节点CPU大小</p><p>单位：核</p>
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set <p>节点CPU大小</p><p>单位：核</p>
     * @param CPU <p>节点CPU大小</p><p>单位：核</p>
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get <p>节点内存</p><p>单位：GiB</p> 
     * @return Memory <p>节点内存</p><p>单位：GiB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>节点内存</p><p>单位：GiB</p>
     * @param Memory <p>节点内存</p><p>单位：GiB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>系统盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemDisk <p>系统盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>系统盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemDisk <p>系统盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDisks <p>数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDisks <p>数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>节点的操作系统名称</p> 
     * @return OsName <p>节点的操作系统名称</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>节点的操作系统名称</p>
     * @param OsName <p>节点的操作系统名称</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>节点的操作系统镜像ID</p> 
     * @return ImageId <p>节点的操作系统镜像ID</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>节点的操作系统镜像ID</p>
     * @param ImageId <p>节点的操作系统镜像ID</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>节点SSH Endpoint 所属的VPC ID</p> 
     * @return VpcId <p>节点SSH Endpoint 所属的VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>节点SSH Endpoint 所属的VPC ID</p>
     * @param VpcId <p>节点SSH Endpoint 所属的VPC ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>节点SSH Endpoint 所属的VPC 子网ID</p> 
     * @return SubnetId <p>节点SSH Endpoint 所属的VPC 子网ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>节点SSH Endpoint 所属的VPC 子网ID</p>
     * @param SubnetId <p>节点SSH Endpoint 所属的VPC 子网ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>节点状态</p><p>枚举值：</p><ul><li>Creating： 创建中</li><li>Running： 运行中</li><li>Isolating： 隔离中</li><li>Isolated： 已隔离</li><li>Activating： 解除隔离中</li><li>Destroying： 销毁中</li></ul> 
     * @return Status <p>节点状态</p><p>枚举值：</p><ul><li>Creating： 创建中</li><li>Running： 运行中</li><li>Isolating： 隔离中</li><li>Isolated： 已隔离</li><li>Activating： 解除隔离中</li><li>Destroying： 销毁中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>节点状态</p><p>枚举值：</p><ul><li>Creating： 创建中</li><li>Running： 运行中</li><li>Isolating： 隔离中</li><li>Isolated： 已隔离</li><li>Activating： 解除隔离中</li><li>Destroying： 销毁中</li></ul>
     * @param Status <p>节点状态</p><p>枚举值：</p><ul><li>Creating： 创建中</li><li>Running： 运行中</li><li>Isolating： 隔离中</li><li>Isolated： 已隔离</li><li>Activating： 解除隔离中</li><li>Destroying： 销毁中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>付费类型</p><p>枚举值：</p><ul><li>PREPAID： 包年包月</li></ul> 
     * @return ChargeType <p>付费类型</p><p>枚举值：</p><ul><li>PREPAID： 包年包月</li></ul>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>付费类型</p><p>枚举值：</p><ul><li>PREPAID： 包年包月</li></ul>
     * @param ChargeType <p>付费类型</p><p>枚举值：</p><ul><li>PREPAID： 包年包月</li></ul>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>节点到期时间</p> 
     * @return ExpireTime <p>节点到期时间</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>节点到期时间</p>
     * @param ExpireTime <p>节点到期时间</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>节点创建时间</p> 
     * @return CreatedTime <p>节点创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>节点创建时间</p>
     * @param CreatedTime <p>节点创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>节点隔离时间</p> 
     * @return IsolatedTime <p>节点隔离时间</p>
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set <p>节点隔离时间</p>
     * @param IsolatedTime <p>节点隔离时间</p>
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get <p>节点标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>节点标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>节点标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>节点标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>节点是否自动续费标记</p><p>枚举值：</p><ul><li>1： 自动续费</li><li>2： 不自动续费</li></ul> 
     * @return AutoRenew <p>节点是否自动续费标记</p><p>枚举值：</p><ul><li>1： 自动续费</li><li>2： 不自动续费</li></ul>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>节点是否自动续费标记</p><p>枚举值：</p><ul><li>1： 自动续费</li><li>2： 不自动续费</li></ul>
     * @param AutoRenew <p>节点是否自动续费标记</p><p>枚举值：</p><ul><li>1： 自动续费</li><li>2： 不自动续费</li></ul>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>交换机ID（已加密）</p> 
     * @return SwitchId <p>交换机ID（已加密）</p>
     */
    public String getSwitchId() {
        return this.SwitchId;
    }

    /**
     * Set <p>交换机ID（已加密）</p>
     * @param SwitchId <p>交换机ID（已加密）</p>
     */
    public void setSwitchId(String SwitchId) {
        this.SwitchId = SwitchId;
    }

    /**
     * Get <p>机架ID（已加密）</p> 
     * @return RackId <p>机架ID（已加密）</p>
     */
    public String getRackId() {
        return this.RackId;
    }

    /**
     * Set <p>机架ID（已加密）</p>
     * @param RackId <p>机架ID（已加密）</p>
     */
    public void setRackId(String RackId) {
        this.RackId = RackId;
    }

    /**
     * Get <p>底层物理机IP（已加密）</p> 
     * @return HostIp <p>底层物理机IP（已加密）</p>
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set <p>底层物理机IP（已加密）</p>
     * @param HostIp <p>底层物理机IP（已加密）</p>
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    public DBCustomNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBCustomNode(DBCustomNode source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.SSHEndpoint != null) {
            this.SSHEndpoint = new String(source.SSHEndpoint);
        }
        if (source.LanIP != null) {
            this.LanIP = new String(source.LanIP);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.SwitchId != null) {
            this.SwitchId = new String(source.SwitchId);
        }
        if (source.RackId != null) {
            this.RackId = new String(source.RackId);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "SSHEndpoint", this.SSHEndpoint);
        this.setParamSimple(map, prefix + "LanIP", this.LanIP);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "SwitchId", this.SwitchId);
        this.setParamSimple(map, prefix + "RackId", this.RackId);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);

    }
}

