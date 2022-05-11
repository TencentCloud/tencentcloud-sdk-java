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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListIPAlarmConfigRequest extends AbstractModel{

    /**
    * 页起始偏移，取值为(页码-1)*一页条数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 一页条数，当Limit=0时，默认一页条数为100;最大取值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 资源实例ID搜索, 支持资源实例前缀通配搜索，例如bgp-*表示获取高防包类型的资源实例
    */
    @SerializedName("FilterInstanceId")
    @Expose
    private String FilterInstanceId;

    /**
    * 告警阈值类型搜索，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
]
    */
    @SerializedName("FilterAlarmType")
    @Expose
    private Long FilterAlarmType;

    /**
    * IP搜索
    */
    @SerializedName("FilterIp")
    @Expose
    private String FilterIp;

    /**
    * 高防IP实例资源的cname
    */
    @SerializedName("FilterCname")
    @Expose
    private String FilterCname;

    /**
     * Get 页起始偏移，取值为(页码-1)*一页条数 
     * @return Offset 页起始偏移，取值为(页码-1)*一页条数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页起始偏移，取值为(页码-1)*一页条数
     * @param Offset 页起始偏移，取值为(页码-1)*一页条数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 一页条数，当Limit=0时，默认一页条数为100;最大取值为100 
     * @return Limit 一页条数，当Limit=0时，默认一页条数为100;最大取值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页条数，当Limit=0时，默认一页条数为100;最大取值为100
     * @param Limit 一页条数，当Limit=0时，默认一页条数为100;最大取值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 资源实例ID搜索, 支持资源实例前缀通配搜索，例如bgp-*表示获取高防包类型的资源实例 
     * @return FilterInstanceId 资源实例ID搜索, 支持资源实例前缀通配搜索，例如bgp-*表示获取高防包类型的资源实例
     */
    public String getFilterInstanceId() {
        return this.FilterInstanceId;
    }

    /**
     * Set 资源实例ID搜索, 支持资源实例前缀通配搜索，例如bgp-*表示获取高防包类型的资源实例
     * @param FilterInstanceId 资源实例ID搜索, 支持资源实例前缀通配搜索，例如bgp-*表示获取高防包类型的资源实例
     */
    public void setFilterInstanceId(String FilterInstanceId) {
        this.FilterInstanceId = FilterInstanceId;
    }

    /**
     * Get 告警阈值类型搜索，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
] 
     * @return FilterAlarmType 告警阈值类型搜索，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
]
     */
    public Long getFilterAlarmType() {
        return this.FilterAlarmType;
    }

    /**
     * Set 告警阈值类型搜索，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
]
     * @param FilterAlarmType 告警阈值类型搜索，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
]
     */
    public void setFilterAlarmType(Long FilterAlarmType) {
        this.FilterAlarmType = FilterAlarmType;
    }

    /**
     * Get IP搜索 
     * @return FilterIp IP搜索
     */
    public String getFilterIp() {
        return this.FilterIp;
    }

    /**
     * Set IP搜索
     * @param FilterIp IP搜索
     */
    public void setFilterIp(String FilterIp) {
        this.FilterIp = FilterIp;
    }

    /**
     * Get 高防IP实例资源的cname 
     * @return FilterCname 高防IP实例资源的cname
     */
    public String getFilterCname() {
        return this.FilterCname;
    }

    /**
     * Set 高防IP实例资源的cname
     * @param FilterCname 高防IP实例资源的cname
     */
    public void setFilterCname(String FilterCname) {
        this.FilterCname = FilterCname;
    }

    public DescribeListIPAlarmConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListIPAlarmConfigRequest(DescribeListIPAlarmConfigRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterInstanceId != null) {
            this.FilterInstanceId = new String(source.FilterInstanceId);
        }
        if (source.FilterAlarmType != null) {
            this.FilterAlarmType = new Long(source.FilterAlarmType);
        }
        if (source.FilterIp != null) {
            this.FilterIp = new String(source.FilterIp);
        }
        if (source.FilterCname != null) {
            this.FilterCname = new String(source.FilterCname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FilterInstanceId", this.FilterInstanceId);
        this.setParamSimple(map, prefix + "FilterAlarmType", this.FilterAlarmType);
        this.setParamSimple(map, prefix + "FilterIp", this.FilterIp);
        this.setParamSimple(map, prefix + "FilterCname", this.FilterCname);

    }
}

