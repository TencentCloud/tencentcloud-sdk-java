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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetRocketMQPublicAccessPointRequest extends AbstractModel {

    /**
    * 集群ID，当前只支持专享集群
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开启或关闭访问
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 带宽大小，开启或者调整公网时必须指定，Mbps为单位
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 付费模式，开启公网时必须指定，0为按小时计费，1为包年包月，当前只支持按小时计费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 公网访问安全规则列表，Enabled为true时必须传入
    */
    @SerializedName("Rules")
    @Expose
    private PublicAccessRule [] Rules;

    /**
    * 公网是否按流量计费
    */
    @SerializedName("BillingFlow")
    @Expose
    private Boolean BillingFlow;

    /**
     * Get 集群ID，当前只支持专享集群 
     * @return InstanceId 集群ID，当前只支持专享集群
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID，当前只支持专享集群
     * @param InstanceId 集群ID，当前只支持专享集群
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开启或关闭访问 
     * @return Enabled 开启或关闭访问
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 开启或关闭访问
     * @param Enabled 开启或关闭访问
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 带宽大小，开启或者调整公网时必须指定，Mbps为单位 
     * @return Bandwidth 带宽大小，开启或者调整公网时必须指定，Mbps为单位
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽大小，开启或者调整公网时必须指定，Mbps为单位
     * @param Bandwidth 带宽大小，开启或者调整公网时必须指定，Mbps为单位
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 付费模式，开启公网时必须指定，0为按小时计费，1为包年包月，当前只支持按小时计费 
     * @return PayMode 付费模式，开启公网时必须指定，0为按小时计费，1为包年包月，当前只支持按小时计费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式，开启公网时必须指定，0为按小时计费，1为包年包月，当前只支持按小时计费
     * @param PayMode 付费模式，开启公网时必须指定，0为按小时计费，1为包年包月，当前只支持按小时计费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 公网访问安全规则列表，Enabled为true时必须传入 
     * @return Rules 公网访问安全规则列表，Enabled为true时必须传入
     */
    public PublicAccessRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 公网访问安全规则列表，Enabled为true时必须传入
     * @param Rules 公网访问安全规则列表，Enabled为true时必须传入
     */
    public void setRules(PublicAccessRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 公网是否按流量计费 
     * @return BillingFlow 公网是否按流量计费
     */
    public Boolean getBillingFlow() {
        return this.BillingFlow;
    }

    /**
     * Set 公网是否按流量计费
     * @param BillingFlow 公网是否按流量计费
     */
    public void setBillingFlow(Boolean BillingFlow) {
        this.BillingFlow = BillingFlow;
    }

    public SetRocketMQPublicAccessPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetRocketMQPublicAccessPointRequest(SetRocketMQPublicAccessPointRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Rules != null) {
            this.Rules = new PublicAccessRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new PublicAccessRule(source.Rules[i]);
            }
        }
        if (source.BillingFlow != null) {
            this.BillingFlow = new Boolean(source.BillingFlow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "BillingFlow", this.BillingFlow);

    }
}

