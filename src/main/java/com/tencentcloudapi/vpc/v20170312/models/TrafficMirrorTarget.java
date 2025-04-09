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

public class TrafficMirrorTarget extends AbstractModel {

    /**
    * 流量镜像的接收IP
    */
    @SerializedName("TargetIps")
    @Expose
    private String [] TargetIps;

    /**
    * 流量镜像接收IP组，均衡规则，支持ENI/FIVE_TUPLE_FLOW（vpc），FIVE_TUPLE_FLOW（公网IP）
    */
    @SerializedName("AlgHash")
    @Expose
    private String AlgHash;

    /**
    * 流量镜像的接收endpoint（公网IP）
    */
    @SerializedName("TargetEndPoints")
    @Expose
    private String [] TargetEndPoints;

    /**
    * 流量镜像的接收类型，分别为：IP/ENI/CLB
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
     * Get 流量镜像的接收IP 
     * @return TargetIps 流量镜像的接收IP
     */
    public String [] getTargetIps() {
        return this.TargetIps;
    }

    /**
     * Set 流量镜像的接收IP
     * @param TargetIps 流量镜像的接收IP
     */
    public void setTargetIps(String [] TargetIps) {
        this.TargetIps = TargetIps;
    }

    /**
     * Get 流量镜像接收IP组，均衡规则，支持ENI/FIVE_TUPLE_FLOW（vpc），FIVE_TUPLE_FLOW（公网IP） 
     * @return AlgHash 流量镜像接收IP组，均衡规则，支持ENI/FIVE_TUPLE_FLOW（vpc），FIVE_TUPLE_FLOW（公网IP）
     */
    public String getAlgHash() {
        return this.AlgHash;
    }

    /**
     * Set 流量镜像接收IP组，均衡规则，支持ENI/FIVE_TUPLE_FLOW（vpc），FIVE_TUPLE_FLOW（公网IP）
     * @param AlgHash 流量镜像接收IP组，均衡规则，支持ENI/FIVE_TUPLE_FLOW（vpc），FIVE_TUPLE_FLOW（公网IP）
     */
    public void setAlgHash(String AlgHash) {
        this.AlgHash = AlgHash;
    }

    /**
     * Get 流量镜像的接收endpoint（公网IP） 
     * @return TargetEndPoints 流量镜像的接收endpoint（公网IP）
     */
    public String [] getTargetEndPoints() {
        return this.TargetEndPoints;
    }

    /**
     * Set 流量镜像的接收endpoint（公网IP）
     * @param TargetEndPoints 流量镜像的接收endpoint（公网IP）
     */
    public void setTargetEndPoints(String [] TargetEndPoints) {
        this.TargetEndPoints = TargetEndPoints;
    }

    /**
     * Get 流量镜像的接收类型，分别为：IP/ENI/CLB 
     * @return TargetType 流量镜像的接收类型，分别为：IP/ENI/CLB
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 流量镜像的接收类型，分别为：IP/ENI/CLB
     * @param TargetType 流量镜像的接收类型，分别为：IP/ENI/CLB
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    public TrafficMirrorTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficMirrorTarget(TrafficMirrorTarget source) {
        if (source.TargetIps != null) {
            this.TargetIps = new String[source.TargetIps.length];
            for (int i = 0; i < source.TargetIps.length; i++) {
                this.TargetIps[i] = new String(source.TargetIps[i]);
            }
        }
        if (source.AlgHash != null) {
            this.AlgHash = new String(source.AlgHash);
        }
        if (source.TargetEndPoints != null) {
            this.TargetEndPoints = new String[source.TargetEndPoints.length];
            for (int i = 0; i < source.TargetEndPoints.length; i++) {
                this.TargetEndPoints[i] = new String(source.TargetEndPoints[i]);
            }
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TargetIps.", this.TargetIps);
        this.setParamSimple(map, prefix + "AlgHash", this.AlgHash);
        this.setParamArraySimple(map, prefix + "TargetEndPoints.", this.TargetEndPoints);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);

    }
}

