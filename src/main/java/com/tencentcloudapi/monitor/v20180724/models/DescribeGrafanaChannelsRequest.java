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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGrafanaChannelsRequest extends AbstractModel {

    /**
    * <p>Grafana 实例 ID，例如：grafana-12345678</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>查询数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>告警通道名称，例如：test</p>
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * <p>告警通道 ID，例如：nchannel-abcd1234</p>
    */
    @SerializedName("ChannelIds")
    @Expose
    private String [] ChannelIds;

    /**
    * <p>告警通道状态(不用填写，目前只有可用和删除状态，默认只能查询可用的告警通道)</p>
    */
    @SerializedName("ChannelState")
    @Expose
    private Long ChannelState;

    /**
     * Get <p>Grafana 实例 ID，例如：grafana-12345678</p> 
     * @return InstanceId <p>Grafana 实例 ID，例如：grafana-12345678</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Grafana 实例 ID，例如：grafana-12345678</p>
     * @param InstanceId <p>Grafana 实例 ID，例如：grafana-12345678</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>查询数量</p> 
     * @return Limit <p>查询数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>查询数量</p>
     * @param Limit <p>查询数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>告警通道名称，例如：test</p> 
     * @return ChannelName <p>告警通道名称，例如：test</p>
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set <p>告警通道名称，例如：test</p>
     * @param ChannelName <p>告警通道名称，例如：test</p>
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get <p>告警通道 ID，例如：nchannel-abcd1234</p> 
     * @return ChannelIds <p>告警通道 ID，例如：nchannel-abcd1234</p>
     */
    public String [] getChannelIds() {
        return this.ChannelIds;
    }

    /**
     * Set <p>告警通道 ID，例如：nchannel-abcd1234</p>
     * @param ChannelIds <p>告警通道 ID，例如：nchannel-abcd1234</p>
     */
    public void setChannelIds(String [] ChannelIds) {
        this.ChannelIds = ChannelIds;
    }

    /**
     * Get <p>告警通道状态(不用填写，目前只有可用和删除状态，默认只能查询可用的告警通道)</p> 
     * @return ChannelState <p>告警通道状态(不用填写，目前只有可用和删除状态，默认只能查询可用的告警通道)</p>
     */
    public Long getChannelState() {
        return this.ChannelState;
    }

    /**
     * Set <p>告警通道状态(不用填写，目前只有可用和删除状态，默认只能查询可用的告警通道)</p>
     * @param ChannelState <p>告警通道状态(不用填写，目前只有可用和删除状态，默认只能查询可用的告警通道)</p>
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

