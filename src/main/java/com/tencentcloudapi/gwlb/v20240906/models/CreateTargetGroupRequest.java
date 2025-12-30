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

public class CreateTargetGroupRequest extends AbstractModel {

    /**
    * <p>目标组名称，限定60个字符。</p>
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * <p>网关负载均衡后端目标组所属的网络 ID，如vpc-12345678，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>  接口获取。 不填此参数则默认为DefaultVPC。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>目标组的默认端口， 后续添加服务器时可使用该默认端口。Port和TargetGroupInstances.N中的port二者必填其一。仅支持6081。</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>目标组绑定的后端服务器</p>
    */
    @SerializedName("TargetGroupInstances")
    @Expose
    private TargetGroupInstance [] TargetGroupInstances;

    /**
    * <p>网关负载均衡目标组协议。- TENCENT_GENEVE ：GENEVE 标准协议- AWS_GENEVE：GENEVE 兼容协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>健康检查设置。</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * <p>均衡算法。</p><ul><li>IP_HASH_2_CONSISTENT：二元组一致性哈希</li><li>IP_HASH_3_CONSISTENT：三元组一致性哈希</li><li>IP_HASH_5_CONSISTENT：五元组一致性哈希</li></ul>
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * <p>是否支持全死全活。默认支持。</p>
    */
    @SerializedName("AllDeadToAlive")
    @Expose
    private Boolean AllDeadToAlive;

    /**
    * <p>标签。</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>流量分发方式</p><ul><li>STATELESS：无状态</li><li>STATEFUL： 有状态</li></ul>
    */
    @SerializedName("ForwardingMode")
    @Expose
    private String ForwardingMode;

    /**
    * <p>TCP协议连接空闲超时时间，可配置60s-6000s，默认350s。</p>
    */
    @SerializedName("TcpIdleConnectTimeout")
    @Expose
    private Long TcpIdleConnectTimeout;

    /**
    * <p>其他协议连接空闲超时时间，可配置5s-180s，默认120s</p>
    */
    @SerializedName("OthersIdleConnectTimeout")
    @Expose
    private Long OthersIdleConnectTimeout;

    /**
    * <p>重新调度功能内的解绑后端服务开关，开关打开后解绑后端服务会触发重新调度。</p>
    */
    @SerializedName("RescheduleUnbindRs")
    @Expose
    private Boolean RescheduleUnbindRs;

    /**
    * <p>解绑RS后开启重调度的时间，可配置0s-3600s，默认0s</p>
    */
    @SerializedName("RescheduleUnbindRsStartTime")
    @Expose
    private Long RescheduleUnbindRsStartTime;

    /**
    * <p>重新调度功能内的后端服务健康探测异常开关，开关打开后后端服务健康检查异常会触发重新调度。</p>
    */
    @SerializedName("RescheduleUnhealthy")
    @Expose
    private Boolean RescheduleUnhealthy;

    /**
    * <p>后端服务健康探测异常后开启重调度的时间，可配置0s-3600s，默认0s</p>
    */
    @SerializedName("RescheduleUnhealthyStartTime")
    @Expose
    private Long RescheduleUnhealthyStartTime;

    /**
     * Get <p>目标组名称，限定60个字符。</p> 
     * @return TargetGroupName <p>目标组名称，限定60个字符。</p>
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set <p>目标组名称，限定60个字符。</p>
     * @param TargetGroupName <p>目标组名称，限定60个字符。</p>
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get <p>网关负载均衡后端目标组所属的网络 ID，如vpc-12345678，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>  接口获取。 不填此参数则默认为DefaultVPC。</p> 
     * @return VpcId <p>网关负载均衡后端目标组所属的网络 ID，如vpc-12345678，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>  接口获取。 不填此参数则默认为DefaultVPC。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>网关负载均衡后端目标组所属的网络 ID，如vpc-12345678，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>  接口获取。 不填此参数则默认为DefaultVPC。</p>
     * @param VpcId <p>网关负载均衡后端目标组所属的网络 ID，如vpc-12345678，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>  接口获取。 不填此参数则默认为DefaultVPC。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>目标组的默认端口， 后续添加服务器时可使用该默认端口。Port和TargetGroupInstances.N中的port二者必填其一。仅支持6081。</p> 
     * @return Port <p>目标组的默认端口， 后续添加服务器时可使用该默认端口。Port和TargetGroupInstances.N中的port二者必填其一。仅支持6081。</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>目标组的默认端口， 后续添加服务器时可使用该默认端口。Port和TargetGroupInstances.N中的port二者必填其一。仅支持6081。</p>
     * @param Port <p>目标组的默认端口， 后续添加服务器时可使用该默认端口。Port和TargetGroupInstances.N中的port二者必填其一。仅支持6081。</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>目标组绑定的后端服务器</p> 
     * @return TargetGroupInstances <p>目标组绑定的后端服务器</p>
     */
    public TargetGroupInstance [] getTargetGroupInstances() {
        return this.TargetGroupInstances;
    }

    /**
     * Set <p>目标组绑定的后端服务器</p>
     * @param TargetGroupInstances <p>目标组绑定的后端服务器</p>
     */
    public void setTargetGroupInstances(TargetGroupInstance [] TargetGroupInstances) {
        this.TargetGroupInstances = TargetGroupInstances;
    }

    /**
     * Get <p>网关负载均衡目标组协议。- TENCENT_GENEVE ：GENEVE 标准协议- AWS_GENEVE：GENEVE 兼容协议</p> 
     * @return Protocol <p>网关负载均衡目标组协议。- TENCENT_GENEVE ：GENEVE 标准协议- AWS_GENEVE：GENEVE 兼容协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>网关负载均衡目标组协议。- TENCENT_GENEVE ：GENEVE 标准协议- AWS_GENEVE：GENEVE 兼容协议</p>
     * @param Protocol <p>网关负载均衡目标组协议。- TENCENT_GENEVE ：GENEVE 标准协议- AWS_GENEVE：GENEVE 兼容协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>健康检查设置。</p> 
     * @return HealthCheck <p>健康检查设置。</p>
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>健康检查设置。</p>
     * @param HealthCheck <p>健康检查设置。</p>
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>均衡算法。</p><ul><li>IP_HASH_2_CONSISTENT：二元组一致性哈希</li><li>IP_HASH_3_CONSISTENT：三元组一致性哈希</li><li>IP_HASH_5_CONSISTENT：五元组一致性哈希</li></ul> 
     * @return ScheduleAlgorithm <p>均衡算法。</p><ul><li>IP_HASH_2_CONSISTENT：二元组一致性哈希</li><li>IP_HASH_3_CONSISTENT：三元组一致性哈希</li><li>IP_HASH_5_CONSISTENT：五元组一致性哈希</li></ul>
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set <p>均衡算法。</p><ul><li>IP_HASH_2_CONSISTENT：二元组一致性哈希</li><li>IP_HASH_3_CONSISTENT：三元组一致性哈希</li><li>IP_HASH_5_CONSISTENT：五元组一致性哈希</li></ul>
     * @param ScheduleAlgorithm <p>均衡算法。</p><ul><li>IP_HASH_2_CONSISTENT：二元组一致性哈希</li><li>IP_HASH_3_CONSISTENT：三元组一致性哈希</li><li>IP_HASH_5_CONSISTENT：五元组一致性哈希</li></ul>
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get <p>是否支持全死全活。默认支持。</p> 
     * @return AllDeadToAlive <p>是否支持全死全活。默认支持。</p>
     */
    public Boolean getAllDeadToAlive() {
        return this.AllDeadToAlive;
    }

    /**
     * Set <p>是否支持全死全活。默认支持。</p>
     * @param AllDeadToAlive <p>是否支持全死全活。默认支持。</p>
     */
    public void setAllDeadToAlive(Boolean AllDeadToAlive) {
        this.AllDeadToAlive = AllDeadToAlive;
    }

    /**
     * Get <p>标签。</p> 
     * @return Tags <p>标签。</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签。</p>
     * @param Tags <p>标签。</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>流量分发方式</p><ul><li>STATELESS：无状态</li><li>STATEFUL： 有状态</li></ul> 
     * @return ForwardingMode <p>流量分发方式</p><ul><li>STATELESS：无状态</li><li>STATEFUL： 有状态</li></ul>
     */
    public String getForwardingMode() {
        return this.ForwardingMode;
    }

    /**
     * Set <p>流量分发方式</p><ul><li>STATELESS：无状态</li><li>STATEFUL： 有状态</li></ul>
     * @param ForwardingMode <p>流量分发方式</p><ul><li>STATELESS：无状态</li><li>STATEFUL： 有状态</li></ul>
     */
    public void setForwardingMode(String ForwardingMode) {
        this.ForwardingMode = ForwardingMode;
    }

    /**
     * Get <p>TCP协议连接空闲超时时间，可配置60s-6000s，默认350s。</p> 
     * @return TcpIdleConnectTimeout <p>TCP协议连接空闲超时时间，可配置60s-6000s，默认350s。</p>
     */
    public Long getTcpIdleConnectTimeout() {
        return this.TcpIdleConnectTimeout;
    }

    /**
     * Set <p>TCP协议连接空闲超时时间，可配置60s-6000s，默认350s。</p>
     * @param TcpIdleConnectTimeout <p>TCP协议连接空闲超时时间，可配置60s-6000s，默认350s。</p>
     */
    public void setTcpIdleConnectTimeout(Long TcpIdleConnectTimeout) {
        this.TcpIdleConnectTimeout = TcpIdleConnectTimeout;
    }

    /**
     * Get <p>其他协议连接空闲超时时间，可配置5s-180s，默认120s</p> 
     * @return OthersIdleConnectTimeout <p>其他协议连接空闲超时时间，可配置5s-180s，默认120s</p>
     */
    public Long getOthersIdleConnectTimeout() {
        return this.OthersIdleConnectTimeout;
    }

    /**
     * Set <p>其他协议连接空闲超时时间，可配置5s-180s，默认120s</p>
     * @param OthersIdleConnectTimeout <p>其他协议连接空闲超时时间，可配置5s-180s，默认120s</p>
     */
    public void setOthersIdleConnectTimeout(Long OthersIdleConnectTimeout) {
        this.OthersIdleConnectTimeout = OthersIdleConnectTimeout;
    }

    /**
     * Get <p>重新调度功能内的解绑后端服务开关，开关打开后解绑后端服务会触发重新调度。</p> 
     * @return RescheduleUnbindRs <p>重新调度功能内的解绑后端服务开关，开关打开后解绑后端服务会触发重新调度。</p>
     */
    public Boolean getRescheduleUnbindRs() {
        return this.RescheduleUnbindRs;
    }

    /**
     * Set <p>重新调度功能内的解绑后端服务开关，开关打开后解绑后端服务会触发重新调度。</p>
     * @param RescheduleUnbindRs <p>重新调度功能内的解绑后端服务开关，开关打开后解绑后端服务会触发重新调度。</p>
     */
    public void setRescheduleUnbindRs(Boolean RescheduleUnbindRs) {
        this.RescheduleUnbindRs = RescheduleUnbindRs;
    }

    /**
     * Get <p>解绑RS后开启重调度的时间，可配置0s-3600s，默认0s</p> 
     * @return RescheduleUnbindRsStartTime <p>解绑RS后开启重调度的时间，可配置0s-3600s，默认0s</p>
     */
    public Long getRescheduleUnbindRsStartTime() {
        return this.RescheduleUnbindRsStartTime;
    }

    /**
     * Set <p>解绑RS后开启重调度的时间，可配置0s-3600s，默认0s</p>
     * @param RescheduleUnbindRsStartTime <p>解绑RS后开启重调度的时间，可配置0s-3600s，默认0s</p>
     */
    public void setRescheduleUnbindRsStartTime(Long RescheduleUnbindRsStartTime) {
        this.RescheduleUnbindRsStartTime = RescheduleUnbindRsStartTime;
    }

    /**
     * Get <p>重新调度功能内的后端服务健康探测异常开关，开关打开后后端服务健康检查异常会触发重新调度。</p> 
     * @return RescheduleUnhealthy <p>重新调度功能内的后端服务健康探测异常开关，开关打开后后端服务健康检查异常会触发重新调度。</p>
     */
    public Boolean getRescheduleUnhealthy() {
        return this.RescheduleUnhealthy;
    }

    /**
     * Set <p>重新调度功能内的后端服务健康探测异常开关，开关打开后后端服务健康检查异常会触发重新调度。</p>
     * @param RescheduleUnhealthy <p>重新调度功能内的后端服务健康探测异常开关，开关打开后后端服务健康检查异常会触发重新调度。</p>
     */
    public void setRescheduleUnhealthy(Boolean RescheduleUnhealthy) {
        this.RescheduleUnhealthy = RescheduleUnhealthy;
    }

    /**
     * Get <p>后端服务健康探测异常后开启重调度的时间，可配置0s-3600s，默认0s</p> 
     * @return RescheduleUnhealthyStartTime <p>后端服务健康探测异常后开启重调度的时间，可配置0s-3600s，默认0s</p>
     */
    public Long getRescheduleUnhealthyStartTime() {
        return this.RescheduleUnhealthyStartTime;
    }

    /**
     * Set <p>后端服务健康探测异常后开启重调度的时间，可配置0s-3600s，默认0s</p>
     * @param RescheduleUnhealthyStartTime <p>后端服务健康探测异常后开启重调度的时间，可配置0s-3600s，默认0s</p>
     */
    public void setRescheduleUnhealthyStartTime(Long RescheduleUnhealthyStartTime) {
        this.RescheduleUnhealthyStartTime = RescheduleUnhealthyStartTime;
    }

    public CreateTargetGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTargetGroupRequest(CreateTargetGroupRequest source) {
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.TargetGroupInstances != null) {
            this.TargetGroupInstances = new TargetGroupInstance[source.TargetGroupInstances.length];
            for (int i = 0; i < source.TargetGroupInstances.length; i++) {
                this.TargetGroupInstances[i] = new TargetGroupInstance(source.TargetGroupInstances[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new TargetGroupHealthCheck(source.HealthCheck);
        }
        if (source.ScheduleAlgorithm != null) {
            this.ScheduleAlgorithm = new String(source.ScheduleAlgorithm);
        }
        if (source.AllDeadToAlive != null) {
            this.AllDeadToAlive = new Boolean(source.AllDeadToAlive);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
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
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "TargetGroupInstances.", this.TargetGroupInstances);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "ScheduleAlgorithm", this.ScheduleAlgorithm);
        this.setParamSimple(map, prefix + "AllDeadToAlive", this.AllDeadToAlive);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ForwardingMode", this.ForwardingMode);
        this.setParamSimple(map, prefix + "TcpIdleConnectTimeout", this.TcpIdleConnectTimeout);
        this.setParamSimple(map, prefix + "OthersIdleConnectTimeout", this.OthersIdleConnectTimeout);
        this.setParamSimple(map, prefix + "RescheduleUnbindRs", this.RescheduleUnbindRs);
        this.setParamSimple(map, prefix + "RescheduleUnbindRsStartTime", this.RescheduleUnbindRsStartTime);
        this.setParamSimple(map, prefix + "RescheduleUnhealthy", this.RescheduleUnhealthy);
        this.setParamSimple(map, prefix + "RescheduleUnhealthyStartTime", this.RescheduleUnhealthyStartTime);

    }
}

