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

public class ResetTrafficMirrorFilterRequest extends AbstractModel {

    /**
    * 流量镜像实例ID
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 流量镜像需要过滤的natgw实例ID
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * 流量镜像需要过滤的五元组规则
    */
    @SerializedName("CollectorNormalFilters")
    @Expose
    private TrafficMirrorFilter [] CollectorNormalFilters;

    /**
    * 流量镜像入站过滤规则。
    */
    @SerializedName("IngressFilterRules")
    @Expose
    private TrafficMirrorFilter [] IngressFilterRules;

    /**
    * 流量镜像出站过滤规则。
    */
    @SerializedName("EgressFilterRules")
    @Expose
    private TrafficMirrorFilter [] EgressFilterRules;

    /**
     * Get 流量镜像实例ID 
     * @return TrafficMirrorId 流量镜像实例ID
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set 流量镜像实例ID
     * @param TrafficMirrorId 流量镜像实例ID
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get 流量镜像需要过滤的natgw实例ID 
     * @return NatId 流量镜像需要过滤的natgw实例ID
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set 流量镜像需要过滤的natgw实例ID
     * @param NatId 流量镜像需要过滤的natgw实例ID
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get 流量镜像需要过滤的五元组规则 
     * @return CollectorNormalFilters 流量镜像需要过滤的五元组规则
     */
    public TrafficMirrorFilter [] getCollectorNormalFilters() {
        return this.CollectorNormalFilters;
    }

    /**
     * Set 流量镜像需要过滤的五元组规则
     * @param CollectorNormalFilters 流量镜像需要过滤的五元组规则
     */
    public void setCollectorNormalFilters(TrafficMirrorFilter [] CollectorNormalFilters) {
        this.CollectorNormalFilters = CollectorNormalFilters;
    }

    /**
     * Get 流量镜像入站过滤规则。 
     * @return IngressFilterRules 流量镜像入站过滤规则。
     */
    public TrafficMirrorFilter [] getIngressFilterRules() {
        return this.IngressFilterRules;
    }

    /**
     * Set 流量镜像入站过滤规则。
     * @param IngressFilterRules 流量镜像入站过滤规则。
     */
    public void setIngressFilterRules(TrafficMirrorFilter [] IngressFilterRules) {
        this.IngressFilterRules = IngressFilterRules;
    }

    /**
     * Get 流量镜像出站过滤规则。 
     * @return EgressFilterRules 流量镜像出站过滤规则。
     */
    public TrafficMirrorFilter [] getEgressFilterRules() {
        return this.EgressFilterRules;
    }

    /**
     * Set 流量镜像出站过滤规则。
     * @param EgressFilterRules 流量镜像出站过滤规则。
     */
    public void setEgressFilterRules(TrafficMirrorFilter [] EgressFilterRules) {
        this.EgressFilterRules = EgressFilterRules;
    }

    public ResetTrafficMirrorFilterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetTrafficMirrorFilterRequest(ResetTrafficMirrorFilterRequest source) {
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.NatId != null) {
            this.NatId = new String(source.NatId);
        }
        if (source.CollectorNormalFilters != null) {
            this.CollectorNormalFilters = new TrafficMirrorFilter[source.CollectorNormalFilters.length];
            for (int i = 0; i < source.CollectorNormalFilters.length; i++) {
                this.CollectorNormalFilters[i] = new TrafficMirrorFilter(source.CollectorNormalFilters[i]);
            }
        }
        if (source.IngressFilterRules != null) {
            this.IngressFilterRules = new TrafficMirrorFilter[source.IngressFilterRules.length];
            for (int i = 0; i < source.IngressFilterRules.length; i++) {
                this.IngressFilterRules[i] = new TrafficMirrorFilter(source.IngressFilterRules[i]);
            }
        }
        if (source.EgressFilterRules != null) {
            this.EgressFilterRules = new TrafficMirrorFilter[source.EgressFilterRules.length];
            for (int i = 0; i < source.EgressFilterRules.length; i++) {
                this.EgressFilterRules[i] = new TrafficMirrorFilter(source.EgressFilterRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamArrayObj(map, prefix + "CollectorNormalFilters.", this.CollectorNormalFilters);
        this.setParamArrayObj(map, prefix + "IngressFilterRules.", this.IngressFilterRules);
        this.setParamArrayObj(map, prefix + "EgressFilterRules.", this.EgressFilterRules);

    }
}

