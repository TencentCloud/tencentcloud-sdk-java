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

public class DescribeDDoSEvListRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 资源实例ID，当Business为basic时，此字段不用填写（因为基础防护没有资源实例）
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 资源的IP
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * 是否超过弹性防护峰值，取值[yes(是)，no(否)]，填写空字符串时表示不进行过滤
    */
    @SerializedName("OverLoad")
    @Expose
    private String OverLoad;

    /**
    * 一页条数，填0表示不分页
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页起始偏移，取值为(页码-1)*一页条数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 资源实例ID，当Business为basic时，此字段不用填写（因为基础防护没有资源实例） 
     * @return Id 资源实例ID，当Business为basic时，此字段不用填写（因为基础防护没有资源实例）
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源实例ID，当Business为basic时，此字段不用填写（因为基础防护没有资源实例）
     * @param Id 资源实例ID，当Business为basic时，此字段不用填写（因为基础防护没有资源实例）
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 资源的IP 
     * @return IpList 资源的IP
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set 资源的IP
     * @param IpList 资源的IP
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get 是否超过弹性防护峰值，取值[yes(是)，no(否)]，填写空字符串时表示不进行过滤 
     * @return OverLoad 是否超过弹性防护峰值，取值[yes(是)，no(否)]，填写空字符串时表示不进行过滤
     */
    public String getOverLoad() {
        return this.OverLoad;
    }

    /**
     * Set 是否超过弹性防护峰值，取值[yes(是)，no(否)]，填写空字符串时表示不进行过滤
     * @param OverLoad 是否超过弹性防护峰值，取值[yes(是)，no(否)]，填写空字符串时表示不进行过滤
     */
    public void setOverLoad(String OverLoad) {
        this.OverLoad = OverLoad;
    }

    /**
     * Get 一页条数，填0表示不分页 
     * @return Limit 一页条数，填0表示不分页
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页条数，填0表示不分页
     * @param Limit 一页条数，填0表示不分页
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "OverLoad", this.OverLoad);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

