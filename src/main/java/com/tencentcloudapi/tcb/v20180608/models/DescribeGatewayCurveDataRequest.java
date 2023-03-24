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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayCurveDataRequest extends AbstractModel{

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 网关id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 监控类型 GWQps GWBandwidth GwHttpError GwHttp404 GwHttp502 GwConnect GwCircuit
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 监控起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 监控结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 网关版本
    */
    @SerializedName("GatewayVersion")
    @Expose
    private String GatewayVersion;

    /**
    * 网关路由名称
    */
    @SerializedName("GatewayRoute")
    @Expose
    private String GatewayRoute;

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 网关id 
     * @return GatewayId 网关id
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关id
     * @param GatewayId 网关id
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 监控类型 GWQps GWBandwidth GwHttpError GwHttp404 GwHttp502 GwConnect GwCircuit 
     * @return MetricName 监控类型 GWQps GWBandwidth GwHttpError GwHttp404 GwHttp502 GwConnect GwCircuit
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 监控类型 GWQps GWBandwidth GwHttpError GwHttp404 GwHttp502 GwConnect GwCircuit
     * @param MetricName 监控类型 GWQps GWBandwidth GwHttpError GwHttp404 GwHttp502 GwConnect GwCircuit
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 监控起始时间 
     * @return StartTime 监控起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 监控起始时间
     * @param StartTime 监控起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 监控结束时间 
     * @return EndTime 监控结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 监控结束时间
     * @param EndTime 监控结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 网关版本 
     * @return GatewayVersion 网关版本
     */
    public String getGatewayVersion() {
        return this.GatewayVersion;
    }

    /**
     * Set 网关版本
     * @param GatewayVersion 网关版本
     */
    public void setGatewayVersion(String GatewayVersion) {
        this.GatewayVersion = GatewayVersion;
    }

    /**
     * Get 网关路由名称 
     * @return GatewayRoute 网关路由名称
     */
    public String getGatewayRoute() {
        return this.GatewayRoute;
    }

    /**
     * Set 网关路由名称
     * @param GatewayRoute 网关路由名称
     */
    public void setGatewayRoute(String GatewayRoute) {
        this.GatewayRoute = GatewayRoute;
    }

    public DescribeGatewayCurveDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayCurveDataRequest(DescribeGatewayCurveDataRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.GatewayVersion != null) {
            this.GatewayVersion = new String(source.GatewayVersion);
        }
        if (source.GatewayRoute != null) {
            this.GatewayRoute = new String(source.GatewayRoute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "GatewayVersion", this.GatewayVersion);
        this.setParamSimple(map, prefix + "GatewayRoute", this.GatewayRoute);

    }
}

