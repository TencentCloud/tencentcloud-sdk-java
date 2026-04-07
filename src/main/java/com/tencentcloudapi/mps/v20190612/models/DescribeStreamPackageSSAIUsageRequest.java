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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPackageSSAIUsageRequest extends AbstractModel {

    /**
    * 起始时间
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
    * 需要查询的channel_id
    */
    @SerializedName("ChannelIds")
    @Expose
    private String [] ChannelIds;

    /**
    * 需要查询的广告类型。可选Pre-roll/Mid-roll/VOD；若为空，默认查询所有类型
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * 维度，可选值：summary对应false；detail 对应true
    */
    @SerializedName("Dimension")
    @Expose
    private Boolean Dimension;

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
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
     * Get 需要查询的channel_id 
     * @return ChannelIds 需要查询的channel_id
     */
    public String [] getChannelIds() {
        return this.ChannelIds;
    }

    /**
     * Set 需要查询的channel_id
     * @param ChannelIds 需要查询的channel_id
     */
    public void setChannelIds(String [] ChannelIds) {
        this.ChannelIds = ChannelIds;
    }

    /**
     * Get 需要查询的广告类型。可选Pre-roll/Mid-roll/VOD；若为空，默认查询所有类型 
     * @return Types 需要查询的广告类型。可选Pre-roll/Mid-roll/VOD；若为空，默认查询所有类型
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set 需要查询的广告类型。可选Pre-roll/Mid-roll/VOD；若为空，默认查询所有类型
     * @param Types 需要查询的广告类型。可选Pre-roll/Mid-roll/VOD；若为空，默认查询所有类型
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get 维度，可选值：summary对应false；detail 对应true 
     * @return Dimension 维度，可选值：summary对应false；detail 对应true
     */
    public Boolean getDimension() {
        return this.Dimension;
    }

    /**
     * Set 维度，可选值：summary对应false；detail 对应true
     * @param Dimension 维度，可选值：summary对应false；detail 对应true
     */
    public void setDimension(Boolean Dimension) {
        this.Dimension = Dimension;
    }

    public DescribeStreamPackageSSAIUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageSSAIUsageRequest(DescribeStreamPackageSSAIUsageRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ChannelIds != null) {
            this.ChannelIds = new String[source.ChannelIds.length];
            for (int i = 0; i < source.ChannelIds.length; i++) {
                this.ChannelIds[i] = new String(source.ChannelIds[i]);
            }
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
        if (source.Dimension != null) {
            this.Dimension = new Boolean(source.Dimension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "ChannelIds.", this.ChannelIds);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);

    }
}

