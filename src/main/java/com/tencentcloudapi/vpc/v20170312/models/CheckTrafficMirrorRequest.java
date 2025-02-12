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

public class CheckTrafficMirrorRequest extends AbstractModel {

    /**
    * 流量镜像所属的vpc
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 流量镜像的实例id
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 流量镜像的采集端IP列表
    */
    @SerializedName("CollectorSources")
    @Expose
    private String [] CollectorSources;

    /**
    * 流量镜像的接收端的子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 流量镜像采集端的
    */
    @SerializedName("CollectorTarget")
    @Expose
    private TrafficMirrorTarget [] CollectorTarget;

    /**
     * Get 流量镜像所属的vpc 
     * @return VpcId 流量镜像所属的vpc
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 流量镜像所属的vpc
     * @param VpcId 流量镜像所属的vpc
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 流量镜像的实例id 
     * @return TrafficMirrorId 流量镜像的实例id
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set 流量镜像的实例id
     * @param TrafficMirrorId 流量镜像的实例id
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get 流量镜像的采集端IP列表 
     * @return CollectorSources 流量镜像的采集端IP列表
     */
    public String [] getCollectorSources() {
        return this.CollectorSources;
    }

    /**
     * Set 流量镜像的采集端IP列表
     * @param CollectorSources 流量镜像的采集端IP列表
     */
    public void setCollectorSources(String [] CollectorSources) {
        this.CollectorSources = CollectorSources;
    }

    /**
     * Get 流量镜像的接收端的子网 
     * @return SubnetId 流量镜像的接收端的子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 流量镜像的接收端的子网
     * @param SubnetId 流量镜像的接收端的子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 流量镜像采集端的 
     * @return CollectorTarget 流量镜像采集端的
     */
    public TrafficMirrorTarget [] getCollectorTarget() {
        return this.CollectorTarget;
    }

    /**
     * Set 流量镜像采集端的
     * @param CollectorTarget 流量镜像采集端的
     */
    public void setCollectorTarget(TrafficMirrorTarget [] CollectorTarget) {
        this.CollectorTarget = CollectorTarget;
    }

    public CheckTrafficMirrorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckTrafficMirrorRequest(CheckTrafficMirrorRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.CollectorSources != null) {
            this.CollectorSources = new String[source.CollectorSources.length];
            for (int i = 0; i < source.CollectorSources.length; i++) {
                this.CollectorSources[i] = new String(source.CollectorSources[i]);
            }
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CollectorTarget != null) {
            this.CollectorTarget = new TrafficMirrorTarget[source.CollectorTarget.length];
            for (int i = 0; i < source.CollectorTarget.length; i++) {
                this.CollectorTarget[i] = new TrafficMirrorTarget(source.CollectorTarget[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamArraySimple(map, prefix + "CollectorSources.", this.CollectorSources);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "CollectorTarget.", this.CollectorTarget);

    }
}

