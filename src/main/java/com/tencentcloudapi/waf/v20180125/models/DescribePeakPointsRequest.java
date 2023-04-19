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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePeakPointsRequest extends AbstractModel{

    /**
    * 查询起始时间
    */
    @SerializedName("FromTime")
    @Expose
    private String FromTime;

    /**
    * 查询终止时间
    */
    @SerializedName("ToTime")
    @Expose
    private String ToTime;

    /**
    * 查询的域名，如果查询所有域名数据，该参数不填写
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 只有两个值有效，sparta-waf，clb-waf，不传则不过滤
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * WAF实例ID，不传则不过滤
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 十三个值可选：
access-峰值qps趋势图
botAccess- bot峰值qps趋势图
down-下行峰值带宽趋势图
up-上行峰值带宽趋势图
attack-Web攻击总数趋势图
cc-CC攻击总数趋势图
StatusServerError-WAF返回给客户端状态码次数趋势图
StatusClientError-WAF返回给客户端状态码次数趋势图
StatusRedirect-WAF返回给客户端状态码次数趋势图
StatusOk-WAF返回给客户端状态码次数趋势图
UpstreamServerError-源站返回给WAF状态码次数趋势图
UpstreamClientError-源站返回给WAF状态码次数趋势图
UpstreamRedirect-源站返回给WAF状态码次数趋势图
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
     * Get 查询起始时间 
     * @return FromTime 查询起始时间
     */
    public String getFromTime() {
        return this.FromTime;
    }

    /**
     * Set 查询起始时间
     * @param FromTime 查询起始时间
     */
    public void setFromTime(String FromTime) {
        this.FromTime = FromTime;
    }

    /**
     * Get 查询终止时间 
     * @return ToTime 查询终止时间
     */
    public String getToTime() {
        return this.ToTime;
    }

    /**
     * Set 查询终止时间
     * @param ToTime 查询终止时间
     */
    public void setToTime(String ToTime) {
        this.ToTime = ToTime;
    }

    /**
     * Get 查询的域名，如果查询所有域名数据，该参数不填写 
     * @return Domain 查询的域名，如果查询所有域名数据，该参数不填写
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 查询的域名，如果查询所有域名数据，该参数不填写
     * @param Domain 查询的域名，如果查询所有域名数据，该参数不填写
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 只有两个值有效，sparta-waf，clb-waf，不传则不过滤 
     * @return Edition 只有两个值有效，sparta-waf，clb-waf，不传则不过滤
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 只有两个值有效，sparta-waf，clb-waf，不传则不过滤
     * @param Edition 只有两个值有效，sparta-waf，clb-waf，不传则不过滤
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get WAF实例ID，不传则不过滤 
     * @return InstanceID WAF实例ID，不传则不过滤
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set WAF实例ID，不传则不过滤
     * @param InstanceID WAF实例ID，不传则不过滤
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 十三个值可选：
access-峰值qps趋势图
botAccess- bot峰值qps趋势图
down-下行峰值带宽趋势图
up-上行峰值带宽趋势图
attack-Web攻击总数趋势图
cc-CC攻击总数趋势图
StatusServerError-WAF返回给客户端状态码次数趋势图
StatusClientError-WAF返回给客户端状态码次数趋势图
StatusRedirect-WAF返回给客户端状态码次数趋势图
StatusOk-WAF返回给客户端状态码次数趋势图
UpstreamServerError-源站返回给WAF状态码次数趋势图
UpstreamClientError-源站返回给WAF状态码次数趋势图
UpstreamRedirect-源站返回给WAF状态码次数趋势图 
     * @return MetricName 十三个值可选：
access-峰值qps趋势图
botAccess- bot峰值qps趋势图
down-下行峰值带宽趋势图
up-上行峰值带宽趋势图
attack-Web攻击总数趋势图
cc-CC攻击总数趋势图
StatusServerError-WAF返回给客户端状态码次数趋势图
StatusClientError-WAF返回给客户端状态码次数趋势图
StatusRedirect-WAF返回给客户端状态码次数趋势图
StatusOk-WAF返回给客户端状态码次数趋势图
UpstreamServerError-源站返回给WAF状态码次数趋势图
UpstreamClientError-源站返回给WAF状态码次数趋势图
UpstreamRedirect-源站返回给WAF状态码次数趋势图
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 十三个值可选：
access-峰值qps趋势图
botAccess- bot峰值qps趋势图
down-下行峰值带宽趋势图
up-上行峰值带宽趋势图
attack-Web攻击总数趋势图
cc-CC攻击总数趋势图
StatusServerError-WAF返回给客户端状态码次数趋势图
StatusClientError-WAF返回给客户端状态码次数趋势图
StatusRedirect-WAF返回给客户端状态码次数趋势图
StatusOk-WAF返回给客户端状态码次数趋势图
UpstreamServerError-源站返回给WAF状态码次数趋势图
UpstreamClientError-源站返回给WAF状态码次数趋势图
UpstreamRedirect-源站返回给WAF状态码次数趋势图
     * @param MetricName 十三个值可选：
access-峰值qps趋势图
botAccess- bot峰值qps趋势图
down-下行峰值带宽趋势图
up-上行峰值带宽趋势图
attack-Web攻击总数趋势图
cc-CC攻击总数趋势图
StatusServerError-WAF返回给客户端状态码次数趋势图
StatusClientError-WAF返回给客户端状态码次数趋势图
StatusRedirect-WAF返回给客户端状态码次数趋势图
StatusOk-WAF返回给客户端状态码次数趋势图
UpstreamServerError-源站返回给WAF状态码次数趋势图
UpstreamClientError-源站返回给WAF状态码次数趋势图
UpstreamRedirect-源站返回给WAF状态码次数趋势图
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    public DescribePeakPointsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePeakPointsRequest(DescribePeakPointsRequest source) {
        if (source.FromTime != null) {
            this.FromTime = new String(source.FromTime);
        }
        if (source.ToTime != null) {
            this.ToTime = new String(source.ToTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromTime", this.FromTime);
        this.setParamSimple(map, prefix + "ToTime", this.ToTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);

    }
}

