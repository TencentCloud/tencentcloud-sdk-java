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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseOrderInfo extends AbstractModel {

    /**
    * 发布单Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 当前版本
    */
    @SerializedName("CurrentVersion")
    @Expose
    private VersionInfo CurrentVersion;

    /**
    * 发布版本
    */
    @SerializedName("ReleaseVersion")
    @Expose
    private VersionInfo ReleaseVersion;

    /**
    * 灰度状态
    */
    @SerializedName("GrayStatus")
    @Expose
    private String GrayStatus;

    /**
    * 发布状态
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private String ReleaseStatus;

    /**
    * 流量值
    */
    @SerializedName("TrafficTypeValues")
    @Expose
    private ObjectKV [] TrafficTypeValues;

    /**
    * 流量类型
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * 百分比
    */
    @SerializedName("FlowRatio")
    @Expose
    private Long FlowRatio;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否发布中
    */
    @SerializedName("IsReleasing")
    @Expose
    private Boolean IsReleasing;

    /**
     * Get 发布单Id 
     * @return Id 发布单Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 发布单Id
     * @param Id 发布单Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 服务名 
     * @return ServerName 服务名
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名
     * @param ServerName 服务名
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 当前版本 
     * @return CurrentVersion 当前版本
     */
    public VersionInfo getCurrentVersion() {
        return this.CurrentVersion;
    }

    /**
     * Set 当前版本
     * @param CurrentVersion 当前版本
     */
    public void setCurrentVersion(VersionInfo CurrentVersion) {
        this.CurrentVersion = CurrentVersion;
    }

    /**
     * Get 发布版本 
     * @return ReleaseVersion 发布版本
     */
    public VersionInfo getReleaseVersion() {
        return this.ReleaseVersion;
    }

    /**
     * Set 发布版本
     * @param ReleaseVersion 发布版本
     */
    public void setReleaseVersion(VersionInfo ReleaseVersion) {
        this.ReleaseVersion = ReleaseVersion;
    }

    /**
     * Get 灰度状态 
     * @return GrayStatus 灰度状态
     */
    public String getGrayStatus() {
        return this.GrayStatus;
    }

    /**
     * Set 灰度状态
     * @param GrayStatus 灰度状态
     */
    public void setGrayStatus(String GrayStatus) {
        this.GrayStatus = GrayStatus;
    }

    /**
     * Get 发布状态 
     * @return ReleaseStatus 发布状态
     */
    public String getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set 发布状态
     * @param ReleaseStatus 发布状态
     */
    public void setReleaseStatus(String ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    /**
     * Get 流量值 
     * @return TrafficTypeValues 流量值
     */
    public ObjectKV [] getTrafficTypeValues() {
        return this.TrafficTypeValues;
    }

    /**
     * Set 流量值
     * @param TrafficTypeValues 流量值
     */
    public void setTrafficTypeValues(ObjectKV [] TrafficTypeValues) {
        this.TrafficTypeValues = TrafficTypeValues;
    }

    /**
     * Get 流量类型 
     * @return TrafficType 流量类型
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set 流量类型
     * @param TrafficType 流量类型
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get 百分比 
     * @return FlowRatio 百分比
     */
    public Long getFlowRatio() {
        return this.FlowRatio;
    }

    /**
     * Set 百分比
     * @param FlowRatio 百分比
     */
    public void setFlowRatio(Long FlowRatio) {
        this.FlowRatio = FlowRatio;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否发布中 
     * @return IsReleasing 是否发布中
     */
    public Boolean getIsReleasing() {
        return this.IsReleasing;
    }

    /**
     * Set 是否发布中
     * @param IsReleasing 是否发布中
     */
    public void setIsReleasing(Boolean IsReleasing) {
        this.IsReleasing = IsReleasing;
    }

    public ReleaseOrderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseOrderInfo(ReleaseOrderInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.CurrentVersion != null) {
            this.CurrentVersion = new VersionInfo(source.CurrentVersion);
        }
        if (source.ReleaseVersion != null) {
            this.ReleaseVersion = new VersionInfo(source.ReleaseVersion);
        }
        if (source.GrayStatus != null) {
            this.GrayStatus = new String(source.GrayStatus);
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new String(source.ReleaseStatus);
        }
        if (source.TrafficTypeValues != null) {
            this.TrafficTypeValues = new ObjectKV[source.TrafficTypeValues.length];
            for (int i = 0; i < source.TrafficTypeValues.length; i++) {
                this.TrafficTypeValues[i] = new ObjectKV(source.TrafficTypeValues[i]);
            }
        }
        if (source.TrafficType != null) {
            this.TrafficType = new String(source.TrafficType);
        }
        if (source.FlowRatio != null) {
            this.FlowRatio = new Long(source.FlowRatio);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsReleasing != null) {
            this.IsReleasing = new Boolean(source.IsReleasing);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamObj(map, prefix + "CurrentVersion.", this.CurrentVersion);
        this.setParamObj(map, prefix + "ReleaseVersion.", this.ReleaseVersion);
        this.setParamSimple(map, prefix + "GrayStatus", this.GrayStatus);
        this.setParamSimple(map, prefix + "ReleaseStatus", this.ReleaseStatus);
        this.setParamArrayObj(map, prefix + "TrafficTypeValues.", this.TrafficTypeValues);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "FlowRatio", this.FlowRatio);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsReleasing", this.IsReleasing);

    }
}

