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

public class GetStatisticDataRequest extends AbstractModel {

    /**
    * <p>设备ID。若不指定设备，可传&quot;-1&quot;</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>统计开始时间，单位：s</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * <p>统计结束时间，单位：s</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

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
    * <p>设备ID列表，最多10个设备，下载多个设备流量和时使用，此时DeviceId可传&quot;-1&quot;</p>
    */
    @SerializedName("DeviceList")
    @Expose
    private String [] DeviceList;

    /**
    * <p>设备分组ID，若不指定分组则不传，按分组下载数据时使用</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get <p>设备ID。若不指定设备，可传&quot;-1&quot;</p> 
     * @return DeviceId <p>设备ID。若不指定设备，可传&quot;-1&quot;</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备ID。若不指定设备，可传&quot;-1&quot;</p>
     * @param DeviceId <p>设备ID。若不指定设备，可传&quot;-1&quot;</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>统计开始时间，单位：s</p> 
     * @return BeginTime <p>统计开始时间，单位：s</p>
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>统计开始时间，单位：s</p>
     * @param BeginTime <p>统计开始时间，单位：s</p>
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>统计结束时间，单位：s</p> 
     * @return EndTime <p>统计结束时间，单位：s</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>统计结束时间，单位：s</p>
     * @param EndTime <p>统计结束时间，单位：s</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
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
     * Get <p>设备ID列表，最多10个设备，下载多个设备流量和时使用，此时DeviceId可传&quot;-1&quot;</p> 
     * @return DeviceList <p>设备ID列表，最多10个设备，下载多个设备流量和时使用，此时DeviceId可传&quot;-1&quot;</p>
     */
    public String [] getDeviceList() {
        return this.DeviceList;
    }

    /**
     * Set <p>设备ID列表，最多10个设备，下载多个设备流量和时使用，此时DeviceId可传&quot;-1&quot;</p>
     * @param DeviceList <p>设备ID列表，最多10个设备，下载多个设备流量和时使用，此时DeviceId可传&quot;-1&quot;</p>
     */
    public void setDeviceList(String [] DeviceList) {
        this.DeviceList = DeviceList;
    }

    /**
     * Get <p>设备分组ID，若不指定分组则不传，按分组下载数据时使用</p> 
     * @return GroupId <p>设备分组ID，若不指定分组则不传，按分组下载数据时使用</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>设备分组ID，若不指定分组则不传，按分组下载数据时使用</p>
     * @param GroupId <p>设备分组ID，若不指定分组则不传，按分组下载数据时使用</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public GetStatisticDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetStatisticDataRequest(GetStatisticDataRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
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
        if (source.DeviceList != null) {
            this.DeviceList = new String[source.DeviceList.length];
            for (int i = 0; i < source.DeviceList.length; i++) {
                this.DeviceList[i] = new String(source.DeviceList[i]);
            }
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TimeGranularity", this.TimeGranularity);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamArraySimple(map, prefix + "DeviceList.", this.DeviceList);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

