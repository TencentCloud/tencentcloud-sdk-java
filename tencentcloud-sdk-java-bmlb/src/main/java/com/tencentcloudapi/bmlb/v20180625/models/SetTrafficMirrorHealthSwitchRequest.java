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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetTrafficMirrorHealthSwitchRequest extends AbstractModel{

    /**
    * 流量镜像实例ID。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 健康检查开关，0：关闭，1：打开
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Long HealthSwitch;

    /**
    * 健康检查判断健康的次数，最小值2，最大值10。
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * 健康检查判断不健康的次数，最小值2，最大值10。
    */
    @SerializedName("UnhealthNum")
    @Expose
    private Long UnhealthNum;

    /**
    * 健康检查间隔，单位：秒，最小值5，最大值300。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 检查的域名配置。
    */
    @SerializedName("HttpCheckDomain")
    @Expose
    private String HttpCheckDomain;

    /**
    * 检查的路径配置。
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * 健康检查中认为健康的HTTP返回码的组合。可选值为1~5的集合，1表示HTTP返回码为1xx认为健康。2表示HTTP返回码为2xx认为健康。3表示HTTP返回码为3xx认为健康。4表示HTTP返回码为4xx认为健康。5表示HTTP返回码为5xx认为健康。
    */
    @SerializedName("HttpCodes")
    @Expose
    private Long [] HttpCodes;

    /**
     * Get 流量镜像实例ID。 
     * @return TrafficMirrorId 流量镜像实例ID。
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set 流量镜像实例ID。
     * @param TrafficMirrorId 流量镜像实例ID。
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get 健康检查开关，0：关闭，1：打开 
     * @return HealthSwitch 健康检查开关，0：关闭，1：打开
     */
    public Long getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set 健康检查开关，0：关闭，1：打开
     * @param HealthSwitch 健康检查开关，0：关闭，1：打开
     */
    public void setHealthSwitch(Long HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get 健康检查判断健康的次数，最小值2，最大值10。 
     * @return HealthNum 健康检查判断健康的次数，最小值2，最大值10。
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set 健康检查判断健康的次数，最小值2，最大值10。
     * @param HealthNum 健康检查判断健康的次数，最小值2，最大值10。
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get 健康检查判断不健康的次数，最小值2，最大值10。 
     * @return UnhealthNum 健康检查判断不健康的次数，最小值2，最大值10。
     */
    public Long getUnhealthNum() {
        return this.UnhealthNum;
    }

    /**
     * Set 健康检查判断不健康的次数，最小值2，最大值10。
     * @param UnhealthNum 健康检查判断不健康的次数，最小值2，最大值10。
     */
    public void setUnhealthNum(Long UnhealthNum) {
        this.UnhealthNum = UnhealthNum;
    }

    /**
     * Get 健康检查间隔，单位：秒，最小值5，最大值300。 
     * @return IntervalTime 健康检查间隔，单位：秒，最小值5，最大值300。
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 健康检查间隔，单位：秒，最小值5，最大值300。
     * @param IntervalTime 健康检查间隔，单位：秒，最小值5，最大值300。
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 检查的域名配置。 
     * @return HttpCheckDomain 检查的域名配置。
     */
    public String getHttpCheckDomain() {
        return this.HttpCheckDomain;
    }

    /**
     * Set 检查的域名配置。
     * @param HttpCheckDomain 检查的域名配置。
     */
    public void setHttpCheckDomain(String HttpCheckDomain) {
        this.HttpCheckDomain = HttpCheckDomain;
    }

    /**
     * Get 检查的路径配置。 
     * @return HttpCheckPath 检查的路径配置。
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * Set 检查的路径配置。
     * @param HttpCheckPath 检查的路径配置。
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * Get 健康检查中认为健康的HTTP返回码的组合。可选值为1~5的集合，1表示HTTP返回码为1xx认为健康。2表示HTTP返回码为2xx认为健康。3表示HTTP返回码为3xx认为健康。4表示HTTP返回码为4xx认为健康。5表示HTTP返回码为5xx认为健康。 
     * @return HttpCodes 健康检查中认为健康的HTTP返回码的组合。可选值为1~5的集合，1表示HTTP返回码为1xx认为健康。2表示HTTP返回码为2xx认为健康。3表示HTTP返回码为3xx认为健康。4表示HTTP返回码为4xx认为健康。5表示HTTP返回码为5xx认为健康。
     */
    public Long [] getHttpCodes() {
        return this.HttpCodes;
    }

    /**
     * Set 健康检查中认为健康的HTTP返回码的组合。可选值为1~5的集合，1表示HTTP返回码为1xx认为健康。2表示HTTP返回码为2xx认为健康。3表示HTTP返回码为3xx认为健康。4表示HTTP返回码为4xx认为健康。5表示HTTP返回码为5xx认为健康。
     * @param HttpCodes 健康检查中认为健康的HTTP返回码的组合。可选值为1~5的集合，1表示HTTP返回码为1xx认为健康。2表示HTTP返回码为2xx认为健康。3表示HTTP返回码为3xx认为健康。4表示HTTP返回码为4xx认为健康。5表示HTTP返回码为5xx认为健康。
     */
    public void setHttpCodes(Long [] HttpCodes) {
        this.HttpCodes = HttpCodes;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnhealthNum", this.UnhealthNum);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HttpCheckDomain", this.HttpCheckDomain);
        this.setParamSimple(map, prefix + "HttpCheckPath", this.HttpCheckPath);
        this.setParamArraySimple(map, prefix + "HttpCodes.", this.HttpCodes);

    }
}

