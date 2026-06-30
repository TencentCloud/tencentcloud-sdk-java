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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficQosPolicySet extends AbstractModel {

    /**
    * <p>CCN实例ID。形如：ccn-f49l6u0z。</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>qos id。</p>
    */
    @SerializedName("QosId")
    @Expose
    private Long QosId;

    /**
    * <p>描述。</p>
    */
    @SerializedName("QosPolicyDescription")
    @Expose
    private String QosPolicyDescription;

    /**
    * <p>名称。</p>
    */
    @SerializedName("QosPolicyName")
    @Expose
    private String QosPolicyName;

    /**
    * <p>带宽。</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>流量调度策略ID。</p>
    */
    @SerializedName("QosPolicyId")
    @Expose
    private String QosPolicyId;

    /**
    * <p>服务等级信息</p>
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * <p>服务等级信息</p>
    */
    @SerializedName("ServiceLevel")
    @Expose
    private String ServiceLevel;

    /**
    * <p>带宽ID</p><p>参数格式：fcr-xxx</p>
    */
    @SerializedName("RegionFlowControlId")
    @Expose
    private String RegionFlowControlId;

    /**
    * <p>源地域</p><p>参数格式：ap-xxx</p>
    */
    @SerializedName("LocalRegion")
    @Expose
    private String LocalRegion;

    /**
    * <p>目的地域</p><p>参数格式：ap-xxx</p>
    */
    @SerializedName("RemoteRegion")
    @Expose
    private String RemoteRegion;

    /**
    * <p>流量匹配策略ID</p>
    */
    @SerializedName("TrafficMatchPolicyId")
    @Expose
    private String TrafficMatchPolicyId;

    /**
     * Get <p>CCN实例ID。形如：ccn-f49l6u0z。</p> 
     * @return CcnId <p>CCN实例ID。形如：ccn-f49l6u0z。</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>CCN实例ID。形如：ccn-f49l6u0z。</p>
     * @param CcnId <p>CCN实例ID。形如：ccn-f49l6u0z。</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>qos id。</p> 
     * @return QosId <p>qos id。</p>
     */
    public Long getQosId() {
        return this.QosId;
    }

    /**
     * Set <p>qos id。</p>
     * @param QosId <p>qos id。</p>
     */
    public void setQosId(Long QosId) {
        this.QosId = QosId;
    }

    /**
     * Get <p>描述。</p> 
     * @return QosPolicyDescription <p>描述。</p>
     */
    public String getQosPolicyDescription() {
        return this.QosPolicyDescription;
    }

    /**
     * Set <p>描述。</p>
     * @param QosPolicyDescription <p>描述。</p>
     */
    public void setQosPolicyDescription(String QosPolicyDescription) {
        this.QosPolicyDescription = QosPolicyDescription;
    }

    /**
     * Get <p>名称。</p> 
     * @return QosPolicyName <p>名称。</p>
     */
    public String getQosPolicyName() {
        return this.QosPolicyName;
    }

    /**
     * Set <p>名称。</p>
     * @param QosPolicyName <p>名称。</p>
     */
    public void setQosPolicyName(String QosPolicyName) {
        this.QosPolicyName = QosPolicyName;
    }

    /**
     * Get <p>带宽。</p> 
     * @return Bandwidth <p>带宽。</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>带宽。</p>
     * @param Bandwidth <p>带宽。</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>流量调度策略ID。</p> 
     * @return QosPolicyId <p>流量调度策略ID。</p>
     */
    public String getQosPolicyId() {
        return this.QosPolicyId;
    }

    /**
     * Set <p>流量调度策略ID。</p>
     * @param QosPolicyId <p>流量调度策略ID。</p>
     */
    public void setQosPolicyId(String QosPolicyId) {
        this.QosPolicyId = QosPolicyId;
    }

    /**
     * Get <p>服务等级信息</p> 
     * @return QosLevel <p>服务等级信息</p>
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set <p>服务等级信息</p>
     * @param QosLevel <p>服务等级信息</p>
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get <p>服务等级信息</p> 
     * @return ServiceLevel <p>服务等级信息</p>
     */
    public String getServiceLevel() {
        return this.ServiceLevel;
    }

    /**
     * Set <p>服务等级信息</p>
     * @param ServiceLevel <p>服务等级信息</p>
     */
    public void setServiceLevel(String ServiceLevel) {
        this.ServiceLevel = ServiceLevel;
    }

    /**
     * Get <p>带宽ID</p><p>参数格式：fcr-xxx</p> 
     * @return RegionFlowControlId <p>带宽ID</p><p>参数格式：fcr-xxx</p>
     */
    public String getRegionFlowControlId() {
        return this.RegionFlowControlId;
    }

    /**
     * Set <p>带宽ID</p><p>参数格式：fcr-xxx</p>
     * @param RegionFlowControlId <p>带宽ID</p><p>参数格式：fcr-xxx</p>
     */
    public void setRegionFlowControlId(String RegionFlowControlId) {
        this.RegionFlowControlId = RegionFlowControlId;
    }

    /**
     * Get <p>源地域</p><p>参数格式：ap-xxx</p> 
     * @return LocalRegion <p>源地域</p><p>参数格式：ap-xxx</p>
     */
    public String getLocalRegion() {
        return this.LocalRegion;
    }

    /**
     * Set <p>源地域</p><p>参数格式：ap-xxx</p>
     * @param LocalRegion <p>源地域</p><p>参数格式：ap-xxx</p>
     */
    public void setLocalRegion(String LocalRegion) {
        this.LocalRegion = LocalRegion;
    }

    /**
     * Get <p>目的地域</p><p>参数格式：ap-xxx</p> 
     * @return RemoteRegion <p>目的地域</p><p>参数格式：ap-xxx</p>
     */
    public String getRemoteRegion() {
        return this.RemoteRegion;
    }

    /**
     * Set <p>目的地域</p><p>参数格式：ap-xxx</p>
     * @param RemoteRegion <p>目的地域</p><p>参数格式：ap-xxx</p>
     */
    public void setRemoteRegion(String RemoteRegion) {
        this.RemoteRegion = RemoteRegion;
    }

    /**
     * Get <p>流量匹配策略ID</p> 
     * @return TrafficMatchPolicyId <p>流量匹配策略ID</p>
     */
    public String getTrafficMatchPolicyId() {
        return this.TrafficMatchPolicyId;
    }

    /**
     * Set <p>流量匹配策略ID</p>
     * @param TrafficMatchPolicyId <p>流量匹配策略ID</p>
     */
    public void setTrafficMatchPolicyId(String TrafficMatchPolicyId) {
        this.TrafficMatchPolicyId = TrafficMatchPolicyId;
    }

    public TrafficQosPolicySet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficQosPolicySet(TrafficQosPolicySet source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.QosId != null) {
            this.QosId = new Long(source.QosId);
        }
        if (source.QosPolicyDescription != null) {
            this.QosPolicyDescription = new String(source.QosPolicyDescription);
        }
        if (source.QosPolicyName != null) {
            this.QosPolicyName = new String(source.QosPolicyName);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.QosPolicyId != null) {
            this.QosPolicyId = new String(source.QosPolicyId);
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
        if (source.ServiceLevel != null) {
            this.ServiceLevel = new String(source.ServiceLevel);
        }
        if (source.RegionFlowControlId != null) {
            this.RegionFlowControlId = new String(source.RegionFlowControlId);
        }
        if (source.LocalRegion != null) {
            this.LocalRegion = new String(source.LocalRegion);
        }
        if (source.RemoteRegion != null) {
            this.RemoteRegion = new String(source.RemoteRegion);
        }
        if (source.TrafficMatchPolicyId != null) {
            this.TrafficMatchPolicyId = new String(source.TrafficMatchPolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "QosId", this.QosId);
        this.setParamSimple(map, prefix + "QosPolicyDescription", this.QosPolicyDescription);
        this.setParamSimple(map, prefix + "QosPolicyName", this.QosPolicyName);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "QosPolicyId", this.QosPolicyId);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamSimple(map, prefix + "ServiceLevel", this.ServiceLevel);
        this.setParamSimple(map, prefix + "RegionFlowControlId", this.RegionFlowControlId);
        this.setParamSimple(map, prefix + "LocalRegion", this.LocalRegion);
        this.setParamSimple(map, prefix + "RemoteRegion", this.RemoteRegion);
        this.setParamSimple(map, prefix + "TrafficMatchPolicyId", this.TrafficMatchPolicyId);

    }
}

