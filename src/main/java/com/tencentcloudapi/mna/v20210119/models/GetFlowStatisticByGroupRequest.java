/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFlowStatisticByGroupRequest extends AbstractModel {

    /**
    * <p>分组ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>开始查找时间</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * <p>截止时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>流量种类（1：上行流量，2：下行流量， 3: 上下行总和）</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>时间粒度</p><p>枚举值：</p><ul><li>1： 按小时统计</li><li>2： 按天统计</li><li>3： 按分钟统计</li><li>4： 按5分钟统计</li></ul>
    */
    @SerializedName("TimeGranularity")
    @Expose
    private Long TimeGranularity;

    /**
    * <p>接入区域。取值范围：[&#39;MC&#39;,&#39;AP&#39;,&#39;EU&#39;,&#39;AM&#39;] MC=中国大陆 AP=亚太 EU=欧洲 AM=美洲。不填代表全量区域。</p>
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * <p>网关类型。0：公有云网关；1：自有网关。不传默认为0。</p>
    */
    @SerializedName("GatewayType")
    @Expose
    private Long GatewayType;

    /**
    * <p>应用ID, 查询分组流量时无需使用。 查询应用流量时该字段为应用ID，GroupId 填写 &quot;-1&quot;</p>
    */
    @SerializedName("MpApplicationId")
    @Expose
    private String MpApplicationId;

    /**
     * Get <p>分组ID</p> 
     * @return GroupId <p>分组ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>分组ID</p>
     * @param GroupId <p>分组ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>开始查找时间</p> 
     * @return BeginTime <p>开始查找时间</p>
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>开始查找时间</p>
     * @param BeginTime <p>开始查找时间</p>
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>截止时间</p> 
     * @return EndTime <p>截止时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>截止时间</p>
     * @param EndTime <p>截止时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>流量种类（1：上行流量，2：下行流量， 3: 上下行总和）</p> 
     * @return Type <p>流量种类（1：上行流量，2：下行流量， 3: 上下行总和）</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>流量种类（1：上行流量，2：下行流量， 3: 上下行总和）</p>
     * @param Type <p>流量种类（1：上行流量，2：下行流量， 3: 上下行总和）</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>时间粒度</p><p>枚举值：</p><ul><li>1： 按小时统计</li><li>2： 按天统计</li><li>3： 按分钟统计</li><li>4： 按5分钟统计</li></ul> 
     * @return TimeGranularity <p>时间粒度</p><p>枚举值：</p><ul><li>1： 按小时统计</li><li>2： 按天统计</li><li>3： 按分钟统计</li><li>4： 按5分钟统计</li></ul>
     */
    public Long getTimeGranularity() {
        return this.TimeGranularity;
    }

    /**
     * Set <p>时间粒度</p><p>枚举值：</p><ul><li>1： 按小时统计</li><li>2： 按天统计</li><li>3： 按分钟统计</li><li>4： 按5分钟统计</li></ul>
     * @param TimeGranularity <p>时间粒度</p><p>枚举值：</p><ul><li>1： 按小时统计</li><li>2： 按天统计</li><li>3： 按分钟统计</li><li>4： 按5分钟统计</li></ul>
     */
    public void setTimeGranularity(Long TimeGranularity) {
        this.TimeGranularity = TimeGranularity;
    }

    /**
     * Get <p>接入区域。取值范围：[&#39;MC&#39;,&#39;AP&#39;,&#39;EU&#39;,&#39;AM&#39;] MC=中国大陆 AP=亚太 EU=欧洲 AM=美洲。不填代表全量区域。</p> 
     * @return AccessRegion <p>接入区域。取值范围：[&#39;MC&#39;,&#39;AP&#39;,&#39;EU&#39;,&#39;AM&#39;] MC=中国大陆 AP=亚太 EU=欧洲 AM=美洲。不填代表全量区域。</p>
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set <p>接入区域。取值范围：[&#39;MC&#39;,&#39;AP&#39;,&#39;EU&#39;,&#39;AM&#39;] MC=中国大陆 AP=亚太 EU=欧洲 AM=美洲。不填代表全量区域。</p>
     * @param AccessRegion <p>接入区域。取值范围：[&#39;MC&#39;,&#39;AP&#39;,&#39;EU&#39;,&#39;AM&#39;] MC=中国大陆 AP=亚太 EU=欧洲 AM=美洲。不填代表全量区域。</p>
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get <p>网关类型。0：公有云网关；1：自有网关。不传默认为0。</p> 
     * @return GatewayType <p>网关类型。0：公有云网关；1：自有网关。不传默认为0。</p>
     */
    public Long getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set <p>网关类型。0：公有云网关；1：自有网关。不传默认为0。</p>
     * @param GatewayType <p>网关类型。0：公有云网关；1：自有网关。不传默认为0。</p>
     */
    public void setGatewayType(Long GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get <p>应用ID, 查询分组流量时无需使用。 查询应用流量时该字段为应用ID，GroupId 填写 &quot;-1&quot;</p> 
     * @return MpApplicationId <p>应用ID, 查询分组流量时无需使用。 查询应用流量时该字段为应用ID，GroupId 填写 &quot;-1&quot;</p>
     */
    public String getMpApplicationId() {
        return this.MpApplicationId;
    }

    /**
     * Set <p>应用ID, 查询分组流量时无需使用。 查询应用流量时该字段为应用ID，GroupId 填写 &quot;-1&quot;</p>
     * @param MpApplicationId <p>应用ID, 查询分组流量时无需使用。 查询应用流量时该字段为应用ID，GroupId 填写 &quot;-1&quot;</p>
     */
    public void setMpApplicationId(String MpApplicationId) {
        this.MpApplicationId = MpApplicationId;
    }

    public GetFlowStatisticByGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFlowStatisticByGroupRequest(GetFlowStatisticByGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TimeGranularity != null) {
            this.TimeGranularity = new Long(source.TimeGranularity);
        }
        if (source.AccessRegion != null) {
            this.AccessRegion = new String(source.AccessRegion);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new Long(source.GatewayType);
        }
        if (source.MpApplicationId != null) {
            this.MpApplicationId = new String(source.MpApplicationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TimeGranularity", this.TimeGranularity);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "MpApplicationId", this.MpApplicationId);

    }
}

