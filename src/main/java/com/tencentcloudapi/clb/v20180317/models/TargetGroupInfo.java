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
    * <p>目标组ID</p>
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * <p>目标组的vpcid</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>目标组的名字</p>
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * <p>目标组的默认端口，全监听目标组此字段返回0，表示无效端口。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>目标组的创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>目标组的修改时间</p>
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <p>关联到的规则数组。在DescribeTargetGroupList接口调用时无法获取到该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociatedRule")
    @Expose
    private AssociationItem [] AssociatedRule;

    /**
    * <p>目标组后端转发协议, 仅v2新版目标组返回有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>调度算法，仅后端转发协议为(HTTP、HTTPS、GRPC)的目标组返回有效值， 可选值：<br><ur></p><li>WRR:按权重轮询。</li><li>LEAST_CONN:最小连接数。</li><li>IP_HASH:按IP哈希。</li></ur>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * <p>健康检查详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * <p>目标组类型，当前支持v1(旧版目标组), v2(新版目标组)。默认为v1旧版目标组。</p>
    */
    @SerializedName("TargetGroupType")
    @Expose
    private String TargetGroupType;

    /**
    * <p>目标组已关联的规则数。</p>
    */
    @SerializedName("AssociatedRuleCount")
    @Expose
    private Long AssociatedRuleCount;

    /**
    * <p>目标组内的实例数量。</p>
    */
    @SerializedName("RegisteredInstancesCount")
    @Expose
    private Long RegisteredInstancesCount;

    /**
    * <p>标签。</p>
    */
    @SerializedName("Tag")
    @Expose
    private TagInfo [] Tag;

    /**
    * <p>默认权重。只有v2类型目标组返回该字段。当返回为NULL时， 表示未设置默认权重。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>是否全监听目标组。</p>
    */
    @SerializedName("FullListenSwitch")
    @Expose
    private Boolean FullListenSwitch;

    /**
    * <p>是否开启长连接,  仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。</p>
    */
    @SerializedName("KeepaliveEnable")
    @Expose
    private Boolean KeepaliveEnable;

    /**
    * <p>会话保持时间，仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。</p>
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * <p>IP版本。</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
     * Get <p>目标组ID</p> 
     * @return TargetGroupId <p>目标组ID</p>
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set <p>目标组ID</p>
     * @param TargetGroupId <p>目标组ID</p>
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get <p>目标组的vpcid</p> 
     * @return VpcId <p>目标组的vpcid</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>目标组的vpcid</p>
     * @param VpcId <p>目标组的vpcid</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>目标组的名字</p> 
     * @return TargetGroupName <p>目标组的名字</p>
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set <p>目标组的名字</p>
     * @param TargetGroupName <p>目标组的名字</p>
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get <p>目标组的默认端口，全监听目标组此字段返回0，表示无效端口。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port <p>目标组的默认端口，全监听目标组此字段返回0，表示无效端口。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>目标组的默认端口，全监听目标组此字段返回0，表示无效端口。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port <p>目标组的默认端口，全监听目标组此字段返回0，表示无效端口。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>目标组的创建时间</p> 
     * @return CreatedTime <p>目标组的创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>目标组的创建时间</p>
     * @param CreatedTime <p>目标组的创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>目标组的修改时间</p> 
     * @return UpdatedTime <p>目标组的修改时间</p>
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>目标组的修改时间</p>
     * @param UpdatedTime <p>目标组的修改时间</p>
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <p>关联到的规则数组。在DescribeTargetGroupList接口调用时无法获取到该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociatedRule <p>关联到的规则数组。在DescribeTargetGroupList接口调用时无法获取到该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssociationItem [] getAssociatedRule() {
        return this.AssociatedRule;
    }

    /**
     * Set <p>关联到的规则数组。在DescribeTargetGroupList接口调用时无法获取到该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociatedRule <p>关联到的规则数组。在DescribeTargetGroupList接口调用时无法获取到该参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociatedRule(AssociationItem [] AssociatedRule) {
        this.AssociatedRule = AssociatedRule;
    }

    /**
     * Get <p>目标组后端转发协议, 仅v2新版目标组返回有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol <p>目标组后端转发协议, 仅v2新版目标组返回有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>目标组后端转发协议, 仅v2新版目标组返回有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol <p>目标组后端转发协议, 仅v2新版目标组返回有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>调度算法，仅后端转发协议为(HTTP、HTTPS、GRPC)的目标组返回有效值， 可选值：<br><ur></p><li>WRR:按权重轮询。</li><li>LEAST_CONN:最小连接数。</li><li>IP_HASH:按IP哈希。</li></ur>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleAlgorithm <p>调度算法，仅后端转发协议为(HTTP、HTTPS、GRPC)的目标组返回有效值， 可选值：<br><ur></p><li>WRR:按权重轮询。</li><li>LEAST_CONN:最小连接数。</li><li>IP_HASH:按IP哈希。</li></ur>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set <p>调度算法，仅后端转发协议为(HTTP、HTTPS、GRPC)的目标组返回有效值， 可选值：<br><ur></p><li>WRR:按权重轮询。</li><li>LEAST_CONN:最小连接数。</li><li>IP_HASH:按IP哈希。</li></ur>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleAlgorithm <p>调度算法，仅后端转发协议为(HTTP、HTTPS、GRPC)的目标组返回有效值， 可选值：<br><ur></p><li>WRR:按权重轮询。</li><li>LEAST_CONN:最小连接数。</li><li>IP_HASH:按IP哈希。</li></ur>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get <p>健康检查详情。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheck <p>健康检查详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>健康检查详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheck <p>健康检查详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>目标组类型，当前支持v1(旧版目标组), v2(新版目标组)。默认为v1旧版目标组。</p> 
     * @return TargetGroupType <p>目标组类型，当前支持v1(旧版目标组), v2(新版目标组)。默认为v1旧版目标组。</p>
     */
    public String getTargetGroupType() {
        return this.TargetGroupType;
    }

    /**
     * Set <p>目标组类型，当前支持v1(旧版目标组), v2(新版目标组)。默认为v1旧版目标组。</p>
     * @param TargetGroupType <p>目标组类型，当前支持v1(旧版目标组), v2(新版目标组)。默认为v1旧版目标组。</p>
     */
    public void setTargetGroupType(String TargetGroupType) {
        this.TargetGroupType = TargetGroupType;
    }

    /**
     * Get <p>目标组已关联的规则数。</p> 
     * @return AssociatedRuleCount <p>目标组已关联的规则数。</p>
     */
    public Long getAssociatedRuleCount() {
        return this.AssociatedRuleCount;
    }

    /**
     * Set <p>目标组已关联的规则数。</p>
     * @param AssociatedRuleCount <p>目标组已关联的规则数。</p>
     */
    public void setAssociatedRuleCount(Long AssociatedRuleCount) {
        this.AssociatedRuleCount = AssociatedRuleCount;
    }

    /**
     * Get <p>目标组内的实例数量。</p> 
     * @return RegisteredInstancesCount <p>目标组内的实例数量。</p>
     */
    public Long getRegisteredInstancesCount() {
        return this.RegisteredInstancesCount;
    }

    /**
     * Set <p>目标组内的实例数量。</p>
     * @param RegisteredInstancesCount <p>目标组内的实例数量。</p>
     */
    public void setRegisteredInstancesCount(Long RegisteredInstancesCount) {
        this.RegisteredInstancesCount = RegisteredInstancesCount;
    }

    /**
     * Get <p>标签。</p> 
     * @return Tag <p>标签。</p>
     */
    public TagInfo [] getTag() {
        return this.Tag;
    }

    /**
     * Set <p>标签。</p>
     * @param Tag <p>标签。</p>
     */
    public void setTag(TagInfo [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>默认权重。只有v2类型目标组返回该字段。当返回为NULL时， 表示未设置默认权重。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight <p>默认权重。只有v2类型目标组返回该字段。当返回为NULL时， 表示未设置默认权重。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>默认权重。只有v2类型目标组返回该字段。当返回为NULL时， 表示未设置默认权重。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight <p>默认权重。只有v2类型目标组返回该字段。当返回为NULL时， 表示未设置默认权重。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>是否全监听目标组。</p> 
     * @return FullListenSwitch <p>是否全监听目标组。</p>
     */
    public Boolean getFullListenSwitch() {
        return this.FullListenSwitch;
    }

    /**
     * Set <p>是否全监听目标组。</p>
     * @param FullListenSwitch <p>是否全监听目标组。</p>
     */
    public void setFullListenSwitch(Boolean FullListenSwitch) {
        this.FullListenSwitch = FullListenSwitch;
    }

    /**
     * Get <p>是否开启长连接,  仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。</p> 
     * @return KeepaliveEnable <p>是否开启长连接,  仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。</p>
     */
    public Boolean getKeepaliveEnable() {
        return this.KeepaliveEnable;
    }

    /**
     * Set <p>是否开启长连接,  仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。</p>
     * @param KeepaliveEnable <p>是否开启长连接,  仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。</p>
     */
    public void setKeepaliveEnable(Boolean KeepaliveEnable) {
        this.KeepaliveEnable = KeepaliveEnable;
    }

    /**
     * Get <p>会话保持时间，仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。</p> 
     * @return SessionExpireTime <p>会话保持时间，仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。</p>
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set <p>会话保持时间，仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。</p>
     * @param SessionExpireTime <p>会话保持时间，仅后端转发协议为HTTP/HTTPS/GRPC目标组返回有效值。</p>
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get <p>IP版本。</p> 
     * @return IpVersion <p>IP版本。</p>
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>IP版本。</p>
     * @param IpVersion <p>IP版本。</p>
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

