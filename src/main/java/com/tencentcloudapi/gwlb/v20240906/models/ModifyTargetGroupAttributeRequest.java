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
    * 目标组的ID，可以通过[DescribeTargetGroups](https://cloud.tencent.com/document/product/214/40554)获取。
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 目标组的新名称。
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * 健康检查详情。
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * 是否支持全死全活。
    */
    @SerializedName("AllDeadToAlive")
    @Expose
    private Boolean AllDeadToAlive;

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
     * Get 目标组的ID，可以通过[DescribeTargetGroups](https://cloud.tencent.com/document/product/214/40554)获取。 
     * @return TargetGroupId 目标组的ID，可以通过[DescribeTargetGroups](https://cloud.tencent.com/document/product/214/40554)获取。
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组的ID，可以通过[DescribeTargetGroups](https://cloud.tencent.com/document/product/214/40554)获取。
     * @param TargetGroupId 目标组的ID，可以通过[DescribeTargetGroups](https://cloud.tencent.com/document/product/214/40554)获取。
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 目标组的新名称。 
     * @return TargetGroupName 目标组的新名称。
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set 目标组的新名称。
     * @param TargetGroupName 目标组的新名称。
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get 健康检查详情。 
     * @return HealthCheck 健康检查详情。
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 健康检查详情。
     * @param HealthCheck 健康检查详情。
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 是否支持全死全活。 
     * @return AllDeadToAlive 是否支持全死全活。
     */
    public Boolean getAllDeadToAlive() {
        return this.AllDeadToAlive;
    }

    /**
     * Set 是否支持全死全活。
     * @param AllDeadToAlive 是否支持全死全活。
     */
    public void setAllDeadToAlive(Boolean AllDeadToAlive) {
        this.AllDeadToAlive = AllDeadToAlive;
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

