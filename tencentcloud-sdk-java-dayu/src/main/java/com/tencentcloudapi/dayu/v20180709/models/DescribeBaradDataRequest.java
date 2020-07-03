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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaradDataRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源实例ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 指标名，取值：
connum表示TCP活跃连接数；
new_conn表示新建TCP连接数；
inactive_conn表示非活跃连接数;
intraffic表示入流量；
outtraffic表示出流量；
alltraffic表示出流量和入流量之和；
inpkg表示入包速率；
outpkg表示出包速率；
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 统计时间粒度，单位秒（300表示5分钟；3600表示小时；86400表示天）
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 统计开始时间，秒部分保持为0，分钟部分为5的倍数
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 统计结束时间，秒部分保持为0，分钟部分为5的倍数
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 统计方式，取值：
max表示最大值；
min表示最小值；
avg表示均值；
    */
    @SerializedName("Statistics")
    @Expose
    private String Statistics;

    /**
    * 协议端口数组
    */
    @SerializedName("ProtocolPort")
    @Expose
    private ProtocolPort [] ProtocolPort;

    /**
    * 资源实例下的IP，只有当Business=net(高防IP专业版)时才必须填写资源的一个IP（因为高防IP专业版资源实例有多个IP，才需要指定）；
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源实例ID 
     * @return Id 资源实例ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源实例ID
     * @param Id 资源实例ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 指标名，取值：
connum表示TCP活跃连接数；
new_conn表示新建TCP连接数；
inactive_conn表示非活跃连接数;
intraffic表示入流量；
outtraffic表示出流量；
alltraffic表示出流量和入流量之和；
inpkg表示入包速率；
outpkg表示出包速率； 
     * @return MetricName 指标名，取值：
connum表示TCP活跃连接数；
new_conn表示新建TCP连接数；
inactive_conn表示非活跃连接数;
intraffic表示入流量；
outtraffic表示出流量；
alltraffic表示出流量和入流量之和；
inpkg表示入包速率；
outpkg表示出包速率；
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名，取值：
connum表示TCP活跃连接数；
new_conn表示新建TCP连接数；
inactive_conn表示非活跃连接数;
intraffic表示入流量；
outtraffic表示出流量；
alltraffic表示出流量和入流量之和；
inpkg表示入包速率；
outpkg表示出包速率；
     * @param MetricName 指标名，取值：
connum表示TCP活跃连接数；
new_conn表示新建TCP连接数；
inactive_conn表示非活跃连接数;
intraffic表示入流量；
outtraffic表示出流量；
alltraffic表示出流量和入流量之和；
inpkg表示入包速率；
outpkg表示出包速率；
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 统计时间粒度，单位秒（300表示5分钟；3600表示小时；86400表示天） 
     * @return Period 统计时间粒度，单位秒（300表示5分钟；3600表示小时；86400表示天）
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 统计时间粒度，单位秒（300表示5分钟；3600表示小时；86400表示天）
     * @param Period 统计时间粒度，单位秒（300表示5分钟；3600表示小时；86400表示天）
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 统计开始时间，秒部分保持为0，分钟部分为5的倍数 
     * @return StartTime 统计开始时间，秒部分保持为0，分钟部分为5的倍数
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 统计开始时间，秒部分保持为0，分钟部分为5的倍数
     * @param StartTime 统计开始时间，秒部分保持为0，分钟部分为5的倍数
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 统计结束时间，秒部分保持为0，分钟部分为5的倍数 
     * @return EndTime 统计结束时间，秒部分保持为0，分钟部分为5的倍数
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 统计结束时间，秒部分保持为0，分钟部分为5的倍数
     * @param EndTime 统计结束时间，秒部分保持为0，分钟部分为5的倍数
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 统计方式，取值：
max表示最大值；
min表示最小值；
avg表示均值； 
     * @return Statistics 统计方式，取值：
max表示最大值；
min表示最小值；
avg表示均值；
     */
    public String getStatistics() {
        return this.Statistics;
    }

    /**
     * Set 统计方式，取值：
max表示最大值；
min表示最小值；
avg表示均值；
     * @param Statistics 统计方式，取值：
max表示最大值；
min表示最小值；
avg表示均值；
     */
    public void setStatistics(String Statistics) {
        this.Statistics = Statistics;
    }

    /**
     * Get 协议端口数组 
     * @return ProtocolPort 协议端口数组
     */
    public ProtocolPort [] getProtocolPort() {
        return this.ProtocolPort;
    }

    /**
     * Set 协议端口数组
     * @param ProtocolPort 协议端口数组
     */
    public void setProtocolPort(ProtocolPort [] ProtocolPort) {
        this.ProtocolPort = ProtocolPort;
    }

    /**
     * Get 资源实例下的IP，只有当Business=net(高防IP专业版)时才必须填写资源的一个IP（因为高防IP专业版资源实例有多个IP，才需要指定）； 
     * @return Ip 资源实例下的IP，只有当Business=net(高防IP专业版)时才必须填写资源的一个IP（因为高防IP专业版资源实例有多个IP，才需要指定）；
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 资源实例下的IP，只有当Business=net(高防IP专业版)时才必须填写资源的一个IP（因为高防IP专业版资源实例有多个IP，才需要指定）；
     * @param Ip 资源实例下的IP，只有当Business=net(高防IP专业版)时才必须填写资源的一个IP（因为高防IP专业版资源实例有多个IP，才需要指定）；
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Statistics", this.Statistics);
        this.setParamArrayObj(map, prefix + "ProtocolPort.", this.ProtocolPort);
        this.setParamSimple(map, prefix + "Ip", this.Ip);

    }
}

