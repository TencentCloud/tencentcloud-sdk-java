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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseGrayRequest extends AbstractModel{

    /**
    * 环境Id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 灰度类型
    */
    @SerializedName("GrayType")
    @Expose
    private String GrayType;

    /**
    * 流量类型
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * 流量策略
    */
    @SerializedName("VersionFlowItems")
    @Expose
    private VersionFlowInfo [] VersionFlowItems;

    /**
    * 操作标识
    */
    @SerializedName("OperatorRemark")
    @Expose
    private String OperatorRemark;

    /**
    * 流量比例
    */
    @SerializedName("GrayFlowRatio")
    @Expose
    private Long GrayFlowRatio;

    /**
     * Get 环境Id 
     * @return EnvId 环境Id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境Id
     * @param EnvId 环境Id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
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
     * Get 灰度类型 
     * @return GrayType 灰度类型
     */
    public String getGrayType() {
        return this.GrayType;
    }

    /**
     * Set 灰度类型
     * @param GrayType 灰度类型
     */
    public void setGrayType(String GrayType) {
        this.GrayType = GrayType;
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
     * Get 流量策略 
     * @return VersionFlowItems 流量策略
     */
    public VersionFlowInfo [] getVersionFlowItems() {
        return this.VersionFlowItems;
    }

    /**
     * Set 流量策略
     * @param VersionFlowItems 流量策略
     */
    public void setVersionFlowItems(VersionFlowInfo [] VersionFlowItems) {
        this.VersionFlowItems = VersionFlowItems;
    }

    /**
     * Get 操作标识 
     * @return OperatorRemark 操作标识
     */
    public String getOperatorRemark() {
        return this.OperatorRemark;
    }

    /**
     * Set 操作标识
     * @param OperatorRemark 操作标识
     */
    public void setOperatorRemark(String OperatorRemark) {
        this.OperatorRemark = OperatorRemark;
    }

    /**
     * Get 流量比例 
     * @return GrayFlowRatio 流量比例
     */
    public Long getGrayFlowRatio() {
        return this.GrayFlowRatio;
    }

    /**
     * Set 流量比例
     * @param GrayFlowRatio 流量比例
     */
    public void setGrayFlowRatio(Long GrayFlowRatio) {
        this.GrayFlowRatio = GrayFlowRatio;
    }

    public ReleaseGrayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseGrayRequest(ReleaseGrayRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.GrayType != null) {
            this.GrayType = new String(source.GrayType);
        }
        if (source.TrafficType != null) {
            this.TrafficType = new String(source.TrafficType);
        }
        if (source.VersionFlowItems != null) {
            this.VersionFlowItems = new VersionFlowInfo[source.VersionFlowItems.length];
            for (int i = 0; i < source.VersionFlowItems.length; i++) {
                this.VersionFlowItems[i] = new VersionFlowInfo(source.VersionFlowItems[i]);
            }
        }
        if (source.OperatorRemark != null) {
            this.OperatorRemark = new String(source.OperatorRemark);
        }
        if (source.GrayFlowRatio != null) {
            this.GrayFlowRatio = new Long(source.GrayFlowRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "GrayType", this.GrayType);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamArrayObj(map, prefix + "VersionFlowItems.", this.VersionFlowItems);
        this.setParamSimple(map, prefix + "OperatorRemark", this.OperatorRemark);
        this.setParamSimple(map, prefix + "GrayFlowRatio", this.GrayFlowRatio);

    }
}

