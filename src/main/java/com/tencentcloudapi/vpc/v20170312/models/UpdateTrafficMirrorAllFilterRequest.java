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

public class UpdateTrafficMirrorAllFilterRequest extends AbstractModel {

    /**
    * <p>流量镜像实例ID</p>
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * <p>流量镜像采集方向</p>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * <p>流量镜像采集对象</p>
    */
    @SerializedName("CollectorSrcs")
    @Expose
    private String [] CollectorSrcs;

    /**
    * <p>流量镜像需要过滤的natgw实例</p>
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * <p>流量镜像需要过滤的五元组规则</p>
    */
    @SerializedName("CollectorNormalFilters")
    @Expose
    private TrafficMirrorFilter [] CollectorNormalFilters;

    /**
    * <p>流量镜像入站过滤规则。</p>
    */
    @SerializedName("IngressFilterRules")
    @Expose
    private TrafficMirrorFilter [] IngressFilterRules;

    /**
    * <p>流量镜像出站过滤规则。</p>
    */
    @SerializedName("EgressFilterRules")
    @Expose
    private TrafficMirrorFilter [] EgressFilterRules;

    /**
     * Get <p>流量镜像实例ID</p> 
     * @return TrafficMirrorId <p>流量镜像实例ID</p>
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set <p>流量镜像实例ID</p>
     * @param TrafficMirrorId <p>流量镜像实例ID</p>
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get <p>流量镜像采集方向</p> 
     * @return Direction <p>流量镜像采集方向</p>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>流量镜像采集方向</p>
     * @param Direction <p>流量镜像采集方向</p>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>流量镜像采集对象</p> 
     * @return CollectorSrcs <p>流量镜像采集对象</p>
     */
    public String [] getCollectorSrcs() {
        return this.CollectorSrcs;
    }

    /**
     * Set <p>流量镜像采集对象</p>
     * @param CollectorSrcs <p>流量镜像采集对象</p>
     */
    public void setCollectorSrcs(String [] CollectorSrcs) {
        this.CollectorSrcs = CollectorSrcs;
    }

    /**
     * Get <p>流量镜像需要过滤的natgw实例</p> 
     * @return NatId <p>流量镜像需要过滤的natgw实例</p>
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set <p>流量镜像需要过滤的natgw实例</p>
     * @param NatId <p>流量镜像需要过滤的natgw实例</p>
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get <p>流量镜像需要过滤的五元组规则</p> 
     * @return CollectorNormalFilters <p>流量镜像需要过滤的五元组规则</p>
     */
    public TrafficMirrorFilter [] getCollectorNormalFilters() {
        return this.CollectorNormalFilters;
    }

    /**
     * Set <p>流量镜像需要过滤的五元组规则</p>
     * @param CollectorNormalFilters <p>流量镜像需要过滤的五元组规则</p>
     */
    public void setCollectorNormalFilters(TrafficMirrorFilter [] CollectorNormalFilters) {
        this.CollectorNormalFilters = CollectorNormalFilters;
    }

    /**
     * Get <p>流量镜像入站过滤规则。</p> 
     * @return IngressFilterRules <p>流量镜像入站过滤规则。</p>
     */
    public TrafficMirrorFilter [] getIngressFilterRules() {
        return this.IngressFilterRules;
    }

    /**
     * Set <p>流量镜像入站过滤规则。</p>
     * @param IngressFilterRules <p>流量镜像入站过滤规则。</p>
     */
    public void setIngressFilterRules(TrafficMirrorFilter [] IngressFilterRules) {
        this.IngressFilterRules = IngressFilterRules;
    }

    /**
     * Get <p>流量镜像出站过滤规则。</p> 
     * @return EgressFilterRules <p>流量镜像出站过滤规则。</p>
     */
    public TrafficMirrorFilter [] getEgressFilterRules() {
        return this.EgressFilterRules;
    }

    /**
     * Set <p>流量镜像出站过滤规则。</p>
     * @param EgressFilterRules <p>流量镜像出站过滤规则。</p>
     */
    public void setEgressFilterRules(TrafficMirrorFilter [] EgressFilterRules) {
        this.EgressFilterRules = EgressFilterRules;
    }

    public UpdateTrafficMirrorAllFilterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTrafficMirrorAllFilterRequest(UpdateTrafficMirrorAllFilterRequest source) {
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.CollectorSrcs != null) {
            this.CollectorSrcs = new String[source.CollectorSrcs.length];
            for (int i = 0; i < source.CollectorSrcs.length; i++) {
                this.CollectorSrcs[i] = new String(source.CollectorSrcs[i]);
            }
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
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamArraySimple(map, prefix + "CollectorSrcs.", this.CollectorSrcs);
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamArrayObj(map, prefix + "CollectorNormalFilters.", this.CollectorNormalFilters);
        this.setParamArrayObj(map, prefix + "IngressFilterRules.", this.IngressFilterRules);
        this.setParamArrayObj(map, prefix + "EgressFilterRules.", this.EgressFilterRules);

    }
}

