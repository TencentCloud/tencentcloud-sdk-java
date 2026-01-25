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

public class ModifyTargetGroupAttributeRequest extends AbstractModel {

    /**
    * <p>目标组的ID，可以通过<a href="https://cloud.tencent.com/document/product/214/40554">DescribeTargetGroups</a>获取。</p>
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * <p>目标组的新名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * <p>健康检查详情。</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * <p>是否支持全死全活。</p>
    */
    @SerializedName("AllDeadToAlive")
    @Expose
    private Boolean AllDeadToAlive;

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
     * Get <p>目标组的ID，可以通过<a href="https://cloud.tencent.com/document/product/214/40554">DescribeTargetGroups</a>获取。</p> 
     * @return TargetGroupId <p>目标组的ID，可以通过<a href="https://cloud.tencent.com/document/product/214/40554">DescribeTargetGroups</a>获取。</p>
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set <p>目标组的ID，可以通过<a href="https://cloud.tencent.com/document/product/214/40554">DescribeTargetGroups</a>获取。</p>
     * @param TargetGroupId <p>目标组的ID，可以通过<a href="https://cloud.tencent.com/document/product/214/40554">DescribeTargetGroups</a>获取。</p>
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get <p>目标组的新名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p> 
     * @return TargetGroupName <p>目标组的新名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set <p>目标组的新名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     * @param TargetGroupName <p>目标组的新名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get <p>健康检查详情。</p> 
     * @return HealthCheck <p>健康检查详情。</p>
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>健康检查详情。</p>
     * @param HealthCheck <p>健康检查详情。</p>
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>是否支持全死全活。</p> 
     * @return AllDeadToAlive <p>是否支持全死全活。</p>
     */
    public Boolean getAllDeadToAlive() {
        return this.AllDeadToAlive;
    }

    /**
     * Set <p>是否支持全死全活。</p>
     * @param AllDeadToAlive <p>是否支持全死全活。</p>
     */
    public void setAllDeadToAlive(Boolean AllDeadToAlive) {
        this.AllDeadToAlive = AllDeadToAlive;
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

    public ModifyTargetGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTargetGroupAttributeRequest(ModifyTargetGroupAttributeRequest source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new TargetGroupHealthCheck(source.HealthCheck);
        }
        if (source.AllDeadToAlive != null) {
            this.AllDeadToAlive = new Boolean(source.AllDeadToAlive);
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
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "AllDeadToAlive", this.AllDeadToAlive);
        this.setParamSimple(map, prefix + "TcpIdleConnectTimeout", this.TcpIdleConnectTimeout);
        this.setParamSimple(map, prefix + "OthersIdleConnectTimeout", this.OthersIdleConnectTimeout);
        this.setParamSimple(map, prefix + "RescheduleUnbindRs", this.RescheduleUnbindRs);
        this.setParamSimple(map, prefix + "RescheduleUnbindRsStartTime", this.RescheduleUnbindRsStartTime);
        this.setParamSimple(map, prefix + "RescheduleUnhealthy", this.RescheduleUnhealthy);
        this.setParamSimple(map, prefix + "RescheduleUnhealthyStartTime", this.RescheduleUnhealthyStartTime);

    }
}

