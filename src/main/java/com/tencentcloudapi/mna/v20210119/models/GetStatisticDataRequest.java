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
    * 设备ID。若不指定设备，可传"-1"
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 统计开始时间，单位：s
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 统计结束时间，单位：s
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 聚合粒度：
1:按小时统计
2:按天统计
    */
    @SerializedName("TimeGranularity")
    @Expose
    private Long TimeGranularity;

    /**
    * 接入区域。取值范围：['MC','AP','EU','AM'] MC=中国大陆 AP=亚太 EU=欧洲 AM=美洲。不填代表全量区域。
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * 网关类型。0：公有云网关；1：自有网关。不传默认为0。
    */
    @SerializedName("GatewayType")
    @Expose
    private Long GatewayType;

    /**
    * 设备ID列表，最多10个设备，下载多个设备流量和时使用，此时DeviceId可传"-1"
    */
    @SerializedName("DeviceList")
    @Expose
    private String [] DeviceList;

    /**
    * 设备分组ID，若不指定分组则不传，按分组下载数据时使用
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 设备ID。若不指定设备，可传"-1" 
     * @return DeviceId 设备ID。若不指定设备，可传"-1"
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID。若不指定设备，可传"-1"
     * @param DeviceId 设备ID。若不指定设备，可传"-1"
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 统计开始时间，单位：s 
     * @return BeginTime 统计开始时间，单位：s
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 统计开始时间，单位：s
     * @param BeginTime 统计开始时间，单位：s
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 统计结束时间，单位：s 
     * @return EndTime 统计结束时间，单位：s
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 统计结束时间，单位：s
     * @param EndTime 统计结束时间，单位：s
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 聚合粒度：
1:按小时统计
2:按天统计 
     * @return TimeGranularity 聚合粒度：
1:按小时统计
2:按天统计
     */
    public Long getTimeGranularity() {
        return this.TimeGranularity;
    }

    /**
     * Set 聚合粒度：
1:按小时统计
2:按天统计
     * @param TimeGranularity 聚合粒度：
1:按小时统计
2:按天统计
     */
    public void setTimeGranularity(Long TimeGranularity) {
        this.TimeGranularity = TimeGranularity;
    }

    /**
     * Get 接入区域。取值范围：['MC','AP','EU','AM'] MC=中国大陆 AP=亚太 EU=欧洲 AM=美洲。不填代表全量区域。 
     * @return AccessRegion 接入区域。取值范围：['MC','AP','EU','AM'] MC=中国大陆 AP=亚太 EU=欧洲 AM=美洲。不填代表全量区域。
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set 接入区域。取值范围：['MC','AP','EU','AM'] MC=中国大陆 AP=亚太 EU=欧洲 AM=美洲。不填代表全量区域。
     * @param AccessRegion 接入区域。取值范围：['MC','AP','EU','AM'] MC=中国大陆 AP=亚太 EU=欧洲 AM=美洲。不填代表全量区域。
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get 网关类型。0：公有云网关；1：自有网关。不传默认为0。 
     * @return GatewayType 网关类型。0：公有云网关；1：自有网关。不传默认为0。
     */
    public Long getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 网关类型。0：公有云网关；1：自有网关。不传默认为0。
     * @param GatewayType 网关类型。0：公有云网关；1：自有网关。不传默认为0。
     */
    public void setGatewayType(Long GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get 设备ID列表，最多10个设备，下载多个设备流量和时使用，此时DeviceId可传"-1" 
     * @return DeviceList 设备ID列表，最多10个设备，下载多个设备流量和时使用，此时DeviceId可传"-1"
     */
    public String [] getDeviceList() {
        return this.DeviceList;
    }

    /**
     * Set 设备ID列表，最多10个设备，下载多个设备流量和时使用，此时DeviceId可传"-1"
     * @param DeviceList 设备ID列表，最多10个设备，下载多个设备流量和时使用，此时DeviceId可传"-1"
     */
    public void setDeviceList(String [] DeviceList) {
        this.DeviceList = DeviceList;
    }

    /**
     * Get 设备分组ID，若不指定分组则不传，按分组下载数据时使用 
     * @return GroupId 设备分组ID，若不指定分组则不传，按分组下载数据时使用
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 设备分组ID，若不指定分组则不传，按分组下载数据时使用
     * @param GroupId 设备分组ID，若不指定分组则不传，按分组下载数据时使用
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

