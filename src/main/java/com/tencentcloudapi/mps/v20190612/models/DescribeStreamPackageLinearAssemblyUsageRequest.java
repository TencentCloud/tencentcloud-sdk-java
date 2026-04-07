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

public class DescribeStreamPackageLinearAssemblyUsageRequest extends AbstractModel {

    /**
    * 查询开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 维度，可选值：summary对应false；detail 对应true
    */
    @SerializedName("Dimension")
    @Expose
    private Boolean Dimension;

    /**
    * 要查询的频道ID列表
    */
    @SerializedName("ChannelIds")
    @Expose
    private String [] ChannelIds;

    /**
    * 要查询的频道类型，可选Basic/Standard；若为空，默认查询所有类型
    */
    @SerializedName("ChannelTiers")
    @Expose
    private String [] ChannelTiers;

    /**
     * Get 查询开始时间 
     * @return StartTime 查询开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间
     * @param StartTime 查询开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间 
     * @return EndTime 查询结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间
     * @param EndTime 查询结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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

    /**
     * Get 要查询的频道ID列表 
     * @return ChannelIds 要查询的频道ID列表
     */
    public String [] getChannelIds() {
        return this.ChannelIds;
    }

    /**
     * Set 要查询的频道ID列表
     * @param ChannelIds 要查询的频道ID列表
     */
    public void setChannelIds(String [] ChannelIds) {
        this.ChannelIds = ChannelIds;
    }

    /**
     * Get 要查询的频道类型，可选Basic/Standard；若为空，默认查询所有类型 
     * @return ChannelTiers 要查询的频道类型，可选Basic/Standard；若为空，默认查询所有类型
     */
    public String [] getChannelTiers() {
        return this.ChannelTiers;
    }

    /**
     * Set 要查询的频道类型，可选Basic/Standard；若为空，默认查询所有类型
     * @param ChannelTiers 要查询的频道类型，可选Basic/Standard；若为空，默认查询所有类型
     */
    public void setChannelTiers(String [] ChannelTiers) {
        this.ChannelTiers = ChannelTiers;
    }

    public DescribeStreamPackageLinearAssemblyUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageLinearAssemblyUsageRequest(DescribeStreamPackageLinearAssemblyUsageRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Dimension != null) {
            this.Dimension = new Boolean(source.Dimension);
        }
        if (source.ChannelIds != null) {
            this.ChannelIds = new String[source.ChannelIds.length];
            for (int i = 0; i < source.ChannelIds.length; i++) {
                this.ChannelIds[i] = new String(source.ChannelIds[i]);
            }
        }
        if (source.ChannelTiers != null) {
            this.ChannelTiers = new String[source.ChannelTiers.length];
            for (int i = 0; i < source.ChannelTiers.length; i++) {
                this.ChannelTiers[i] = new String(source.ChannelTiers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamArraySimple(map, prefix + "ChannelIds.", this.ChannelIds);
        this.setParamArraySimple(map, prefix + "ChannelTiers.", this.ChannelTiers);

    }
}

