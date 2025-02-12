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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateTrafficMirrorAllFilterRequest extends AbstractModel {

    /**
    * 流量镜像实例ID
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 流量镜像采集方向
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 流量镜像采集对象
    */
    @SerializedName("CollectorSrcs")
    @Expose
    private String [] CollectorSrcs;

    /**
    * 流量镜像需要过滤的natgw实例
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
     * Get 流量镜像采集方向 
     * @return Direction 流量镜像采集方向
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 流量镜像采集方向
     * @param Direction 流量镜像采集方向
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 流量镜像采集对象 
     * @return CollectorSrcs 流量镜像采集对象
     */
    public String [] getCollectorSrcs() {
        return this.CollectorSrcs;
    }

    /**
     * Set 流量镜像采集对象
     * @param CollectorSrcs 流量镜像采集对象
     */
    public void setCollectorSrcs(String [] CollectorSrcs) {
        this.CollectorSrcs = CollectorSrcs;
    }

    /**
     * Get 流量镜像需要过滤的natgw实例 
     * @return NatId 流量镜像需要过滤的natgw实例
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set 流量镜像需要过滤的natgw实例
     * @param NatId 流量镜像需要过滤的natgw实例
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

    }
}

