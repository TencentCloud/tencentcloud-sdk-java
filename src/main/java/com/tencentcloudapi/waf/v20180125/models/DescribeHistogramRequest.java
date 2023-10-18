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

public class DescribeHistogramRequest extends AbstractModel{

    /**
    * 起始时间
    */
    @SerializedName("FromTime")
    @Expose
    private String FromTime;

    /**
    * 结束时间
    */
    @SerializedName("ToTime")
    @Expose
    private String ToTime;

    /**
    * 聚类字段，ip为ip聚合，art为响应耗时聚合，url为url聚合，local为ip转化的城市聚合
    */
    @SerializedName("QueryField")
    @Expose
    private String QueryField;

    /**
    * 条件，access为访问日志，attack为攻击日志
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 兼容Host，逐步淘汰Host字段
    */
    @SerializedName("Host")
    @Expose
    private String Host;

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
    * 域名过滤，不传则不过滤，用于替代Host字段，逐步淘汰Host
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 起始时间 
     * @return FromTime 起始时间
     */
    public String getFromTime() {
        return this.FromTime;
    }

    /**
     * Set 起始时间
     * @param FromTime 起始时间
     */
    public void setFromTime(String FromTime) {
        this.FromTime = FromTime;
    }

    /**
     * Get 结束时间 
     * @return ToTime 结束时间
     */
    public String getToTime() {
        return this.ToTime;
    }

    /**
     * Set 结束时间
     * @param ToTime 结束时间
     */
    public void setToTime(String ToTime) {
        this.ToTime = ToTime;
    }

    /**
     * Get 聚类字段，ip为ip聚合，art为响应耗时聚合，url为url聚合，local为ip转化的城市聚合 
     * @return QueryField 聚类字段，ip为ip聚合，art为响应耗时聚合，url为url聚合，local为ip转化的城市聚合
     */
    public String getQueryField() {
        return this.QueryField;
    }

    /**
     * Set 聚类字段，ip为ip聚合，art为响应耗时聚合，url为url聚合，local为ip转化的城市聚合
     * @param QueryField 聚类字段，ip为ip聚合，art为响应耗时聚合，url为url聚合，local为ip转化的城市聚合
     */
    public void setQueryField(String QueryField) {
        this.QueryField = QueryField;
    }

    /**
     * Get 条件，access为访问日志，attack为攻击日志 
     * @return Source 条件，access为访问日志，attack为攻击日志
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 条件，access为访问日志，attack为攻击日志
     * @param Source 条件，access为访问日志，attack为攻击日志
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 兼容Host，逐步淘汰Host字段 
     * @return Host 兼容Host，逐步淘汰Host字段
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 兼容Host，逐步淘汰Host字段
     * @param Host 兼容Host，逐步淘汰Host字段
     */
    public void setHost(String Host) {
        this.Host = Host;
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
     * Get 域名过滤，不传则不过滤，用于替代Host字段，逐步淘汰Host 
     * @return Domain 域名过滤，不传则不过滤，用于替代Host字段，逐步淘汰Host
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名过滤，不传则不过滤，用于替代Host字段，逐步淘汰Host
     * @param Domain 域名过滤，不传则不过滤，用于替代Host字段，逐步淘汰Host
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public DescribeHistogramRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHistogramRequest(DescribeHistogramRequest source) {
        if (source.FromTime != null) {
            this.FromTime = new String(source.FromTime);
        }
        if (source.ToTime != null) {
            this.ToTime = new String(source.ToTime);
        }
        if (source.QueryField != null) {
            this.QueryField = new String(source.QueryField);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromTime", this.FromTime);
        this.setParamSimple(map, prefix + "ToTime", this.ToTime);
        this.setParamSimple(map, prefix + "QueryField", this.QueryField);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

