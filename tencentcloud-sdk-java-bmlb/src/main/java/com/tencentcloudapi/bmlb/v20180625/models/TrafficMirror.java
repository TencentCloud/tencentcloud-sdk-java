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

public class TrafficMirror extends AbstractModel{

    /**
    * 流量镜像ID。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 流量镜像名称。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 流量镜像所在的私有网络ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 接收机负载均衡方式。wrr，ip_hash，wlc。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 是否开始对接收机的健康检查。0：关闭，非0：开启。
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Long HealthSwitch;

    /**
    * 健康阈值。
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * 不健康阈值。
    */
    @SerializedName("UnhealthNum")
    @Expose
    private Long UnhealthNum;

    /**
    * 检查间隔。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 检查域名。
    */
    @SerializedName("HttpCheckDomain")
    @Expose
    private String HttpCheckDomain;

    /**
    * 检查目录。
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * 健康检查返回码。 1：1xx，2：2xx，3：3xx，4：4xx，5：5xx。
    */
    @SerializedName("HttpCodes")
    @Expose
    private Long [] HttpCodes;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 流量镜像所在私有网络的Cidr。
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 流量镜像所在私有网络的名称。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
     * Get 流量镜像ID。 
     * @return TrafficMirrorId 流量镜像ID。
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set 流量镜像ID。
     * @param TrafficMirrorId 流量镜像ID。
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get 流量镜像名称。 
     * @return Alias 流量镜像名称。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 流量镜像名称。
     * @param Alias 流量镜像名称。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 流量镜像所在的私有网络ID。 
     * @return VpcId 流量镜像所在的私有网络ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 流量镜像所在的私有网络ID。
     * @param VpcId 流量镜像所在的私有网络ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 接收机负载均衡方式。wrr，ip_hash，wlc。 
     * @return LoadBalancerType 接收机负载均衡方式。wrr，ip_hash，wlc。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 接收机负载均衡方式。wrr，ip_hash，wlc。
     * @param LoadBalancerType 接收机负载均衡方式。wrr，ip_hash，wlc。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 是否开始对接收机的健康检查。0：关闭，非0：开启。 
     * @return HealthSwitch 是否开始对接收机的健康检查。0：关闭，非0：开启。
     */
    public Long getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set 是否开始对接收机的健康检查。0：关闭，非0：开启。
     * @param HealthSwitch 是否开始对接收机的健康检查。0：关闭，非0：开启。
     */
    public void setHealthSwitch(Long HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get 健康阈值。 
     * @return HealthNum 健康阈值。
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set 健康阈值。
     * @param HealthNum 健康阈值。
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get 不健康阈值。 
     * @return UnhealthNum 不健康阈值。
     */
    public Long getUnhealthNum() {
        return this.UnhealthNum;
    }

    /**
     * Set 不健康阈值。
     * @param UnhealthNum 不健康阈值。
     */
    public void setUnhealthNum(Long UnhealthNum) {
        this.UnhealthNum = UnhealthNum;
    }

    /**
     * Get 检查间隔。 
     * @return IntervalTime 检查间隔。
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 检查间隔。
     * @param IntervalTime 检查间隔。
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 检查域名。 
     * @return HttpCheckDomain 检查域名。
     */
    public String getHttpCheckDomain() {
        return this.HttpCheckDomain;
    }

    /**
     * Set 检查域名。
     * @param HttpCheckDomain 检查域名。
     */
    public void setHttpCheckDomain(String HttpCheckDomain) {
        this.HttpCheckDomain = HttpCheckDomain;
    }

    /**
     * Get 检查目录。 
     * @return HttpCheckPath 检查目录。
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * Set 检查目录。
     * @param HttpCheckPath 检查目录。
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * Get 健康检查返回码。 1：1xx，2：2xx，3：3xx，4：4xx，5：5xx。 
     * @return HttpCodes 健康检查返回码。 1：1xx，2：2xx，3：3xx，4：4xx，5：5xx。
     */
    public Long [] getHttpCodes() {
        return this.HttpCodes;
    }

    /**
     * Set 健康检查返回码。 1：1xx，2：2xx，3：3xx，4：4xx，5：5xx。
     * @param HttpCodes 健康检查返回码。 1：1xx，2：2xx，3：3xx，4：4xx，5：5xx。
     */
    public void setHttpCodes(Long [] HttpCodes) {
        this.HttpCodes = HttpCodes;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 流量镜像所在私有网络的Cidr。 
     * @return VpcCidrBlock 流量镜像所在私有网络的Cidr。
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set 流量镜像所在私有网络的Cidr。
     * @param VpcCidrBlock 流量镜像所在私有网络的Cidr。
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 流量镜像所在私有网络的名称。 
     * @return VpcName 流量镜像所在私有网络的名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 流量镜像所在私有网络的名称。
     * @param VpcName 流量镜像所在私有网络的名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnhealthNum", this.UnhealthNum);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HttpCheckDomain", this.HttpCheckDomain);
        this.setParamSimple(map, prefix + "HttpCheckPath", this.HttpCheckPath);
        this.setParamArraySimple(map, prefix + "HttpCodes.", this.HttpCodes);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);

    }
}

