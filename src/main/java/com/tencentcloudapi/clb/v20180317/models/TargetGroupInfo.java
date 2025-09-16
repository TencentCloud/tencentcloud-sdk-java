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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupInfo extends AbstractModel {

    /**
    * 目标组ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 目标组的vpcid
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 目标组的名字
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * 目标组的默认端口，全监听目标组此字段返回0，表示无效端口。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 目标组的创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 目标组的修改时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 关联到的规则数组。在DescribeTargetGroupList接口调用时无法获取到该参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociatedRule")
    @Expose
    private AssociationItem [] AssociatedRule;

    /**
    * 目标组后端转发协议, 仅v2新版目标组返回有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 调度算法，仅后端转发协议为(HTTP、HTTPS、GRPC)的目标组返回有效值， 可选值：
<ur>
<li>WRR:按权重轮询。</li>
<li>LEAST_CONN:最小连接数。</li>
<li>IP_HASH:按IP哈希。</li>
</ur>

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * 健康检查详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * 目标组类型，当前支持v1(旧版目标组), v2(新版目标组)。默认为v1旧版目标组。
    */
    @SerializedName("TargetGroupType")
    @Expose
    private String TargetGroupType;

    /**
    * 目标组已关联的规则数。
    */
    @SerializedName("AssociatedRuleCount")
    @Expose
    private Long AssociatedRuleCount;

    /**
    * 目标组内的实例数量。
    */
    @SerializedName("RegisteredInstancesCount")
    @Expose
    private Long RegisteredInstancesCount;

    /**
    * 标签。
    */
    @SerializedName("Tag")
    @Expose
    private TagInfo [] Tag;

    /**
    * 默认权重。只有v2类型目标组返回该字段。当返回为NULL时， 表示未设置默认权重。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 是否全监听目标组。
    */
    @SerializedName("FullListenSwitch")
    @Expose
    private Boolean FullListenSwitch;

    /**
    * 是否开启长连接,  仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Boolean KeepaliveEnable;

    /**
    * 会话保持时间，仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * IP版本。
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
     * Get 目标组ID 
     * @return TargetGroupId 目标组ID
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组ID
     * @param TargetGroupId 目标组ID
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 目标组的vpcid 
     * @return VpcId 目标组的vpcid
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 目标组的vpcid
     * @param VpcId 目标组的vpcid
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 目标组的名字 
     * @return TargetGroupName 目标组的名字
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set 目标组的名字
     * @param TargetGroupName 目标组的名字
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get 目标组的默认端口，全监听目标组此字段返回0，表示无效端口。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 目标组的默认端口，全监听目标组此字段返回0，表示无效端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 目标组的默认端口，全监听目标组此字段返回0，表示无效端口。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 目标组的默认端口，全监听目标组此字段返回0，表示无效端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 目标组的创建时间 
     * @return CreatedTime 目标组的创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 目标组的创建时间
     * @param CreatedTime 目标组的创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 目标组的修改时间 
     * @return UpdatedTime 目标组的修改时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 目标组的修改时间
     * @param UpdatedTime 目标组的修改时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 关联到的规则数组。在DescribeTargetGroupList接口调用时无法获取到该参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociatedRule 关联到的规则数组。在DescribeTargetGroupList接口调用时无法获取到该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssociationItem [] getAssociatedRule() {
        return this.AssociatedRule;
    }

    /**
     * Set 关联到的规则数组。在DescribeTargetGroupList接口调用时无法获取到该参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociatedRule 关联到的规则数组。在DescribeTargetGroupList接口调用时无法获取到该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociatedRule(AssociationItem [] AssociatedRule) {
        this.AssociatedRule = AssociatedRule;
    }

    /**
     * Get 目标组后端转发协议, 仅v2新版目标组返回有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 目标组后端转发协议, 仅v2新版目标组返回有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 目标组后端转发协议, 仅v2新版目标组返回有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 目标组后端转发协议, 仅v2新版目标组返回有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 调度算法，仅后端转发协议为(HTTP、HTTPS、GRPC)的目标组返回有效值， 可选值：
<ur>
<li>WRR:按权重轮询。</li>
<li>LEAST_CONN:最小连接数。</li>
<li>IP_HASH:按IP哈希。</li>
</ur>

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleAlgorithm 调度算法，仅后端转发协议为(HTTP、HTTPS、GRPC)的目标组返回有效值， 可选值：
<ur>
<li>WRR:按权重轮询。</li>
<li>LEAST_CONN:最小连接数。</li>
<li>IP_HASH:按IP哈希。</li>
</ur>

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set 调度算法，仅后端转发协议为(HTTP、HTTPS、GRPC)的目标组返回有效值， 可选值：
<ur>
<li>WRR:按权重轮询。</li>
<li>LEAST_CONN:最小连接数。</li>
<li>IP_HASH:按IP哈希。</li>
</ur>

注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleAlgorithm 调度算法，仅后端转发协议为(HTTP、HTTPS、GRPC)的目标组返回有效值， 可选值：
<ur>
<li>WRR:按权重轮询。</li>
<li>LEAST_CONN:最小连接数。</li>
<li>IP_HASH:按IP哈希。</li>
</ur>

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get 健康检查详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheck 健康检查详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 健康检查详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheck 健康检查详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 目标组类型，当前支持v1(旧版目标组), v2(新版目标组)。默认为v1旧版目标组。 
     * @return TargetGroupType 目标组类型，当前支持v1(旧版目标组), v2(新版目标组)。默认为v1旧版目标组。
     */
    public String getTargetGroupType() {
        return this.TargetGroupType;
    }

    /**
     * Set 目标组类型，当前支持v1(旧版目标组), v2(新版目标组)。默认为v1旧版目标组。
     * @param TargetGroupType 目标组类型，当前支持v1(旧版目标组), v2(新版目标组)。默认为v1旧版目标组。
     */
    public void setTargetGroupType(String TargetGroupType) {
        this.TargetGroupType = TargetGroupType;
    }

    /**
     * Get 目标组已关联的规则数。 
     * @return AssociatedRuleCount 目标组已关联的规则数。
     */
    public Long getAssociatedRuleCount() {
        return this.AssociatedRuleCount;
    }

    /**
     * Set 目标组已关联的规则数。
     * @param AssociatedRuleCount 目标组已关联的规则数。
     */
    public void setAssociatedRuleCount(Long AssociatedRuleCount) {
        this.AssociatedRuleCount = AssociatedRuleCount;
    }

    /**
     * Get 目标组内的实例数量。 
     * @return RegisteredInstancesCount 目标组内的实例数量。
     */
    public Long getRegisteredInstancesCount() {
        return this.RegisteredInstancesCount;
    }

    /**
     * Set 目标组内的实例数量。
     * @param RegisteredInstancesCount 目标组内的实例数量。
     */
    public void setRegisteredInstancesCount(Long RegisteredInstancesCount) {
        this.RegisteredInstancesCount = RegisteredInstancesCount;
    }

    /**
     * Get 标签。 
     * @return Tag 标签。
     */
    public TagInfo [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签。
     * @param Tag 标签。
     */
    public void setTag(TagInfo [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 默认权重。只有v2类型目标组返回该字段。当返回为NULL时， 表示未设置默认权重。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 默认权重。只有v2类型目标组返回该字段。当返回为NULL时， 表示未设置默认权重。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 默认权重。只有v2类型目标组返回该字段。当返回为NULL时， 表示未设置默认权重。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 默认权重。只有v2类型目标组返回该字段。当返回为NULL时， 表示未设置默认权重。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 是否全监听目标组。 
     * @return FullListenSwitch 是否全监听目标组。
     */
    public Boolean getFullListenSwitch() {
        return this.FullListenSwitch;
    }

    /**
     * Set 是否全监听目标组。
     * @param FullListenSwitch 是否全监听目标组。
     */
    public void setFullListenSwitch(Boolean FullListenSwitch) {
        this.FullListenSwitch = FullListenSwitch;
    }

    /**
     * Get 是否开启长连接,  仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。 
     * @return KeepaliveEnable 是否开启长连接,  仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。
     */
    public Boolean getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set 是否开启长连接,  仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。
     * @param KeepaliveEnable 是否开启长连接,  仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。
     */
    public void setKeepaliveEnable(Boolean KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get 会话保持时间，仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。 
     * @return SessionExpireTime 会话保持时间，仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set 会话保持时间，仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。
     * @param SessionExpireTime 会话保持时间，仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get IP版本。 
     * @return IpVersion IP版本。
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP版本。
     * @param IpVersion IP版本。
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    public TargetGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupInfo(TargetGroupInfo source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.AssociatedRule != null) {
            this.AssociatedRule = new AssociationItem[source.AssociatedRule.length];
            for (int i = 0; i < source.AssociatedRule.length; i++) {
                this.AssociatedRule[i] = new AssociationItem(source.AssociatedRule[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ScheduleAlgorithm != null) {
            this.ScheduleAlgorithm = new String(source.ScheduleAlgorithm);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new TargetGroupHealthCheck(source.HealthCheck);
        }
        if (source.TargetGroupType != null) {
            this.TargetGroupType = new String(source.TargetGroupType);
        }
        if (source.AssociatedRuleCount != null) {
            this.AssociatedRuleCount = new Long(source.AssociatedRuleCount);
        }
        if (source.RegisteredInstancesCount != null) {
            this.RegisteredInstancesCount = new Long(source.RegisteredInstancesCount);
        }
        if (source.Tag != null) {
            this.Tag = new TagInfo[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new TagInfo(source.Tag[i]);
            }
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.FullListenSwitch != null) {
            this.FullListenSwitch = new Boolean(source.FullListenSwitch);
        }
        if (source.KeepaliveEnable != null) {
            this.KeepaliveEnable = new Boolean(source.KeepaliveEnable);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamArrayObj(map, prefix + "AssociatedRule.", this.AssociatedRule);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ScheduleAlgorithm", this.ScheduleAlgorithm);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "TargetGroupType", this.TargetGroupType);
        this.setParamSimple(map, prefix + "AssociatedRuleCount", this.AssociatedRuleCount);
        this.setParamSimple(map, prefix + "RegisteredInstancesCount", this.RegisteredInstancesCount);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "FullListenSwitch", this.FullListenSwitch);
        this.setParamSimple(map, prefix + "KeepaliveEnable", this.KeepaliveEnable);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);

    }
}

