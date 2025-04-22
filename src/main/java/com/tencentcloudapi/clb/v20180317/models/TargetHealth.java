/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class TargetHealth extends AbstractModel {

    /**
    * Target的内网IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Target绑定的端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 当前健康状态，true：健康，false：不健康（包括尚未开始探测、探测中、状态异常等几种状态）。只有处于健康状态（且权重大于0），负载均衡才会向其转发流量。
    */
    @SerializedName("HealthStatus")
    @Expose
    private Boolean HealthStatus;

    /**
    * Target的实例ID，如 ins-12345678
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 当前健康状态的详细信息。如：Alive、Dead、Unknown、Close。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知，Close表示健康检查关闭或监听器状态停止。
    */
    @SerializedName("HealthStatusDetail")
    @Expose
    private String HealthStatusDetail;

    /**
    * (**该参数对象即将下线，不推荐使用，请使用HealthStatusDetail获取健康详情**) 当前健康状态的详细信息。如：Alive、Dead、Unknown。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知。
    */
    @SerializedName("HealthStatusDetial")
    @Expose
    private String HealthStatusDetial;

    /**
    * 目标组唯一ID。
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * Target的权重。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get Target的内网IP 
     * @return IP Target的内网IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set Target的内网IP
     * @param IP Target的内网IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Target绑定的端口 
     * @return Port Target绑定的端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Target绑定的端口
     * @param Port Target绑定的端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 当前健康状态，true：健康，false：不健康（包括尚未开始探测、探测中、状态异常等几种状态）。只有处于健康状态（且权重大于0），负载均衡才会向其转发流量。 
     * @return HealthStatus 当前健康状态，true：健康，false：不健康（包括尚未开始探测、探测中、状态异常等几种状态）。只有处于健康状态（且权重大于0），负载均衡才会向其转发流量。
     */
    public Boolean getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set 当前健康状态，true：健康，false：不健康（包括尚未开始探测、探测中、状态异常等几种状态）。只有处于健康状态（且权重大于0），负载均衡才会向其转发流量。
     * @param HealthStatus 当前健康状态，true：健康，false：不健康（包括尚未开始探测、探测中、状态异常等几种状态）。只有处于健康状态（且权重大于0），负载均衡才会向其转发流量。
     */
    public void setHealthStatus(Boolean HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get Target的实例ID，如 ins-12345678 
     * @return TargetId Target的实例ID，如 ins-12345678
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Target的实例ID，如 ins-12345678
     * @param TargetId Target的实例ID，如 ins-12345678
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 当前健康状态的详细信息。如：Alive、Dead、Unknown、Close。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知，Close表示健康检查关闭或监听器状态停止。 
     * @return HealthStatusDetail 当前健康状态的详细信息。如：Alive、Dead、Unknown、Close。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知，Close表示健康检查关闭或监听器状态停止。
     */
    public String getHealthStatusDetail() {
        return this.HealthStatusDetail;
    }

    /**
     * Set 当前健康状态的详细信息。如：Alive、Dead、Unknown、Close。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知，Close表示健康检查关闭或监听器状态停止。
     * @param HealthStatusDetail 当前健康状态的详细信息。如：Alive、Dead、Unknown、Close。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知，Close表示健康检查关闭或监听器状态停止。
     */
    public void setHealthStatusDetail(String HealthStatusDetail) {
        this.HealthStatusDetail = HealthStatusDetail;
    }

    /**
     * Get (**该参数对象即将下线，不推荐使用，请使用HealthStatusDetail获取健康详情**) 当前健康状态的详细信息。如：Alive、Dead、Unknown。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知。 
     * @return HealthStatusDetial (**该参数对象即将下线，不推荐使用，请使用HealthStatusDetail获取健康详情**) 当前健康状态的详细信息。如：Alive、Dead、Unknown。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知。
     * @deprecated
     */
    @Deprecated
    public String getHealthStatusDetial() {
        return this.HealthStatusDetial;
    }

    /**
     * Set (**该参数对象即将下线，不推荐使用，请使用HealthStatusDetail获取健康详情**) 当前健康状态的详细信息。如：Alive、Dead、Unknown。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知。
     * @param HealthStatusDetial (**该参数对象即将下线，不推荐使用，请使用HealthStatusDetail获取健康详情**) 当前健康状态的详细信息。如：Alive、Dead、Unknown。Alive状态为健康，Dead状态为异常，Unknown状态包括尚未开始探测、探测中、状态未知。
     * @deprecated
     */
    @Deprecated
    public void setHealthStatusDetial(String HealthStatusDetial) {
        this.HealthStatusDetial = HealthStatusDetial;
    }

    /**
     * Get 目标组唯一ID。 
     * @return TargetGroupId 目标组唯一ID。
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组唯一ID。
     * @param TargetGroupId 目标组唯一ID。
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get Target的权重。 
     * @return Weight Target的权重。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Target的权重。
     * @param Weight Target的权重。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public TargetHealth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetHealth(TargetHealth source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new Boolean(source.HealthStatus);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.HealthStatusDetail != null) {
            this.HealthStatusDetail = new String(source.HealthStatusDetail);
        }
        if (source.HealthStatusDetial != null) {
            this.HealthStatusDetial = new String(source.HealthStatusDetial);
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "HealthStatusDetail", this.HealthStatusDetail);
        this.setParamSimple(map, prefix + "HealthStatusDetial", this.HealthStatusDetial);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

