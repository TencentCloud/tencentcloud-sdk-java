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
package com.tencentcloudapi.gwlb.v20240906.models;

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
    * 目标组的默认端口
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
    * 网关负载均衡目标组协议。
- tencent_geneve ：GENEVE 标准协议
- aws_geneve：GENEVE 兼容协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 均衡算法。
- ip_hash_3_elastic：弹性哈希
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
    * 是否支持全死全活。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllDeadToAlive")
    @Expose
    private Boolean AllDeadToAlive;

    /**
    * 目标组已关联的规则数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociatedRuleCount")
    @Expose
    private Long AssociatedRuleCount;

    /**
    * 目标组内的实例数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegisteredInstancesCount")
    @Expose
    private Long RegisteredInstancesCount;

    /**
    * 目标组的标签。
    */
    @SerializedName("Tag")
    @Expose
    private TagInfo [] Tag;

    /**
    * 流量分发方式

- STATELESS：无状态
- STATEFUL： 有状态
    */
    @SerializedName("ForwardingMode")
    @Expose
    private String ForwardingMode;

    /**
    * TCP协议连接空闲超时时间，可配置60s-6000s，默认350s。
    */
    @SerializedName("TcpIdleConnectTimeout")
    @Expose
    private Long TcpIdleConnectTimeout;

    /**
    * 其他协议连接空闲超时时间，可配置5s-180s，默认120s
    */
    @SerializedName("OthersIdleConnectTimeout")
    @Expose
    private Long OthersIdleConnectTimeout;

    /**
    * 重新调度功能内的解绑后端服务开关，开关打开后解绑后端服务会触发重新调度。
    */
    @SerializedName("RescheduleUnbindRs")
    @Expose
    private Boolean RescheduleUnbindRs;

    /**
    * 解绑RS后开启重调度的时间，可配置0s-3600s，默认0s
    */
    @SerializedName("RescheduleUnbindRsStartTime")
    @Expose
    private Long RescheduleUnbindRsStartTime;

    /**
    * 重新调度功能内的后端服务健康探测异常开关，开关打开后后端服务健康检查异常会触发重新调度。
    */
    @SerializedName("RescheduleUnhealthy")
    @Expose
    private Boolean RescheduleUnhealthy;

    /**
    * 后端服务健康探测异常后开启重调度的时间，可配置0s-3600s，默认0s
    */
    @SerializedName("RescheduleUnhealthyStartTime")
    @Expose
    private Long RescheduleUnhealthyStartTime;

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
     * Get 目标组的默认端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 目标组的默认端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 目标组的默认端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 目标组的默认端口
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
     * Get 网关负载均衡目标组协议。
- tencent_geneve ：GENEVE 标准协议
- aws_geneve：GENEVE 兼容协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 网关负载均衡目标组协议。
- tencent_geneve ：GENEVE 标准协议
- aws_geneve：GENEVE 兼容协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 网关负载均衡目标组协议。
- tencent_geneve ：GENEVE 标准协议
- aws_geneve：GENEVE 兼容协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 网关负载均衡目标组协议。
- tencent_geneve ：GENEVE 标准协议
- aws_geneve：GENEVE 兼容协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 均衡算法。
- ip_hash_3_elastic：弹性哈希
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleAlgorithm 均衡算法。
- ip_hash_3_elastic：弹性哈希
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set 均衡算法。
- ip_hash_3_elastic：弹性哈希
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleAlgorithm 均衡算法。
- ip_hash_3_elastic：弹性哈希
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
     * Get 是否支持全死全活。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllDeadToAlive 是否支持全死全活。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAllDeadToAlive() {
        return this.AllDeadToAlive;
    }

    /**
     * Set 是否支持全死全活。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllDeadToAlive 是否支持全死全活。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllDeadToAlive(Boolean AllDeadToAlive) {
        this.AllDeadToAlive = AllDeadToAlive;
    }

    /**
     * Get 目标组已关联的规则数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociatedRuleCount 目标组已关联的规则数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssociatedRuleCount() {
        return this.AssociatedRuleCount;
    }

    /**
     * Set 目标组已关联的规则数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociatedRuleCount 目标组已关联的规则数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociatedRuleCount(Long AssociatedRuleCount) {
        this.AssociatedRuleCount = AssociatedRuleCount;
    }

    /**
     * Get 目标组内的实例数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegisteredInstancesCount 目标组内的实例数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegisteredInstancesCount() {
        return this.RegisteredInstancesCount;
    }

    /**
     * Set 目标组内的实例数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegisteredInstancesCount 目标组内的实例数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegisteredInstancesCount(Long RegisteredInstancesCount) {
        this.RegisteredInstancesCount = RegisteredInstancesCount;
    }

    /**
     * Get 目标组的标签。 
     * @return Tag 目标组的标签。
     */
    public TagInfo [] getTag() {
        return this.Tag;
    }

    /**
     * Set 目标组的标签。
     * @param Tag 目标组的标签。
     */
    public void setTag(TagInfo [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 流量分发方式

- STATELESS：无状态
- STATEFUL： 有状态 
     * @return ForwardingMode 流量分发方式

- STATELESS：无状态
- STATEFUL： 有状态
     */
    public String getForwardingMode() {
        return this.ForwardingMode;
    }

    /**
     * Set 流量分发方式

- STATELESS：无状态
- STATEFUL： 有状态
     * @param ForwardingMode 流量分发方式

- STATELESS：无状态
- STATEFUL： 有状态
     */
    public void setForwardingMode(String ForwardingMode) {
        this.ForwardingMode = ForwardingMode;
    }

    /**
     * Get TCP协议连接空闲超时时间，可配置60s-6000s，默认350s。 
     * @return TcpIdleConnectTimeout TCP协议连接空闲超时时间，可配置60s-6000s，默认350s。
     */
    public Long getTcpIdleConnectTimeout() {
        return this.TcpIdleConnectTimeout;
    }

    /**
     * Set TCP协议连接空闲超时时间，可配置60s-6000s，默认350s。
     * @param TcpIdleConnectTimeout TCP协议连接空闲超时时间，可配置60s-6000s，默认350s。
     */
    public void setTcpIdleConnectTimeout(Long TcpIdleConnectTimeout) {
        this.TcpIdleConnectTimeout = TcpIdleConnectTimeout;
    }

    /**
     * Get 其他协议连接空闲超时时间，可配置5s-180s，默认120s 
     * @return OthersIdleConnectTimeout 其他协议连接空闲超时时间，可配置5s-180s，默认120s
     */
    public Long getOthersIdleConnectTimeout() {
        return this.OthersIdleConnectTimeout;
    }

    /**
     * Set 其他协议连接空闲超时时间，可配置5s-180s，默认120s
     * @param OthersIdleConnectTimeout 其他协议连接空闲超时时间，可配置5s-180s，默认120s
     */
    public void setOthersIdleConnectTimeout(Long OthersIdleConnectTimeout) {
        this.OthersIdleConnectTimeout = OthersIdleConnectTimeout;
    }

    /**
     * Get 重新调度功能内的解绑后端服务开关，开关打开后解绑后端服务会触发重新调度。 
     * @return RescheduleUnbindRs 重新调度功能内的解绑后端服务开关，开关打开后解绑后端服务会触发重新调度。
     */
    public Boolean getRescheduleUnbindRs() {
        return this.RescheduleUnbindRs;
    }

    /**
     * Set 重新调度功能内的解绑后端服务开关，开关打开后解绑后端服务会触发重新调度。
     * @param RescheduleUnbindRs 重新调度功能内的解绑后端服务开关，开关打开后解绑后端服务会触发重新调度。
     */
    public void setRescheduleUnbindRs(Boolean RescheduleUnbindRs) {
        this.RescheduleUnbindRs = RescheduleUnbindRs;
    }

    /**
     * Get 解绑RS后开启重调度的时间，可配置0s-3600s，默认0s 
     * @return RescheduleUnbindRsStartTime 解绑RS后开启重调度的时间，可配置0s-3600s，默认0s
     */
    public Long getRescheduleUnbindRsStartTime() {
        return this.RescheduleUnbindRsStartTime;
    }

    /**
     * Set 解绑RS后开启重调度的时间，可配置0s-3600s，默认0s
     * @param RescheduleUnbindRsStartTime 解绑RS后开启重调度的时间，可配置0s-3600s，默认0s
     */
    public void setRescheduleUnbindRsStartTime(Long RescheduleUnbindRsStartTime) {
        this.RescheduleUnbindRsStartTime = RescheduleUnbindRsStartTime;
    }

    /**
     * Get 重新调度功能内的后端服务健康探测异常开关，开关打开后后端服务健康检查异常会触发重新调度。 
     * @return RescheduleUnhealthy 重新调度功能内的后端服务健康探测异常开关，开关打开后后端服务健康检查异常会触发重新调度。
     */
    public Boolean getRescheduleUnhealthy() {
        return this.RescheduleUnhealthy;
    }

    /**
     * Set 重新调度功能内的后端服务健康探测异常开关，开关打开后后端服务健康检查异常会触发重新调度。
     * @param RescheduleUnhealthy 重新调度功能内的后端服务健康探测异常开关，开关打开后后端服务健康检查异常会触发重新调度。
     */
    public void setRescheduleUnhealthy(Boolean RescheduleUnhealthy) {
        this.RescheduleUnhealthy = RescheduleUnhealthy;
    }

    /**
     * Get 后端服务健康探测异常后开启重调度的时间，可配置0s-3600s，默认0s 
     * @return RescheduleUnhealthyStartTime 后端服务健康探测异常后开启重调度的时间，可配置0s-3600s，默认0s
     */
    public Long getRescheduleUnhealthyStartTime() {
        return this.RescheduleUnhealthyStartTime;
    }

    /**
     * Set 后端服务健康探测异常后开启重调度的时间，可配置0s-3600s，默认0s
     * @param RescheduleUnhealthyStartTime 后端服务健康探测异常后开启重调度的时间，可配置0s-3600s，默认0s
     */
    public void setRescheduleUnhealthyStartTime(Long RescheduleUnhealthyStartTime) {
        this.RescheduleUnhealthyStartTime = RescheduleUnhealthyStartTime;
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
        if (source.AllDeadToAlive != null) {
            this.AllDeadToAlive = new Boolean(source.AllDeadToAlive);
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
        if (source.ForwardingMode != null) {
            this.ForwardingMode = new String(source.ForwardingMode);
        }
        if (source.TcpIdleConnectTimeout != null) {
            this.TcpIdleConnectTimeout = new Long(source.TcpIdleConnectTimeout);
        }
        if (source.OthersIdleConnectTimeout != null) {
            this.OthersIdleConnectTimeout = new Long(source.OthersIdleConnectTimeout);
        }
        if (source.RescheduleUnbindRs != null) {
            this.RescheduleUnbindRs = new Boolean(source.RescheduleUnbindRs);
        }
        if (source.RescheduleUnbindRsStartTime != null) {
            this.RescheduleUnbindRsStartTime = new Long(source.RescheduleUnbindRsStartTime);
        }
        if (source.RescheduleUnhealthy != null) {
            this.RescheduleUnhealthy = new Boolean(source.RescheduleUnhealthy);
        }
        if (source.RescheduleUnhealthyStartTime != null) {
            this.RescheduleUnhealthyStartTime = new Long(source.RescheduleUnhealthyStartTime);
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
        this.setParamSimple(map, prefix + "AllDeadToAlive", this.AllDeadToAlive);
        this.setParamSimple(map, prefix + "AssociatedRuleCount", this.AssociatedRuleCount);
        this.setParamSimple(map, prefix + "RegisteredInstancesCount", this.RegisteredInstancesCount);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "ForwardingMode", this.ForwardingMode);
        this.setParamSimple(map, prefix + "TcpIdleConnectTimeout", this.TcpIdleConnectTimeout);
        this.setParamSimple(map, prefix + "OthersIdleConnectTimeout", this.OthersIdleConnectTimeout);
        this.setParamSimple(map, prefix + "RescheduleUnbindRs", this.RescheduleUnbindRs);
        this.setParamSimple(map, prefix + "RescheduleUnbindRsStartTime", this.RescheduleUnbindRsStartTime);
        this.setParamSimple(map, prefix + "RescheduleUnhealthy", this.RescheduleUnhealthy);
        this.setParamSimple(map, prefix + "RescheduleUnhealthyStartTime", this.RescheduleUnhealthyStartTime);

    }
}

