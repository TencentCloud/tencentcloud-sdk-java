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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGrafanaChannelsRequest extends AbstractModel{

    /**
    * Grafana 实例 ID，例如：grafana-12345678
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 告警通道名称，例如：test
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 告警通道 ID，例如：nchannel-abcd1234
    */
    @SerializedName("ChannelIds")
    @Expose
    private String [] ChannelIds;

    /**
    * 告警通道状态
    */
    @SerializedName("ChannelState")
    @Expose
    private Long ChannelState;

    /**
     * Get Grafana 实例 ID，例如：grafana-12345678 
     * @return InstanceId Grafana 实例 ID，例如：grafana-12345678
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Grafana 实例 ID，例如：grafana-12345678
     * @param InstanceId Grafana 实例 ID，例如：grafana-12345678
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询数量 
     * @return Limit 查询数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询数量
     * @param Limit 查询数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 告警通道名称，例如：test 
     * @return ChannelName 告警通道名称，例如：test
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 告警通道名称，例如：test
     * @param ChannelName 告警通道名称，例如：test
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 告警通道 ID，例如：nchannel-abcd1234 
     * @return ChannelIds 告警通道 ID，例如：nchannel-abcd1234
     */
    public String [] getChannelIds() {
        return this.ChannelIds;
    }

    /**
     * Set 告警通道 ID，例如：nchannel-abcd1234
     * @param ChannelIds 告警通道 ID，例如：nchannel-abcd1234
     */
    public void setChannelIds(String [] ChannelIds) {
        this.ChannelIds = ChannelIds;
    }

    /**
     * Get 告警通道状态 
     * @return ChannelState 告警通道状态
     */
    public Long getChannelState() {
        return this.ChannelState;
    }

    /**
     * Set 告警通道状态
     * @param ChannelState 告警通道状态
     */
    public void setChannelState(Long ChannelState) {
        this.ChannelState = ChannelState;
    }

    public DescribeGrafanaChannelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGrafanaChannelsRequest(DescribeGrafanaChannelsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ChannelIds != null) {
            this.ChannelIds = new String[source.ChannelIds.length];
            for (int i = 0; i < source.ChannelIds.length; i++) {
                this.ChannelIds[i] = new String(source.ChannelIds[i]);
            }
        }
        if (source.ChannelState != null) {
            this.ChannelState = new Long(source.ChannelState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArraySimple(map, prefix + "ChannelIds.", this.ChannelIds);
        this.setParamSimple(map, prefix + "ChannelState", this.ChannelState);

    }
}

