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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPackageIngestStatisticsRequest extends AbstractModel {

    /**
    * <p>查询起始时间，RFC3339 格式，如2026-08-24T00:00:00+08:00</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间，RFC3339 格式，如 2026-08-24T00:00:00+08:00；必须晚于 StartTime</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>频道ID列表，不传则查全部频道</p>
    */
    @SerializedName("ChannelIds")
    @Expose
    private String [] ChannelIds;

    /**
    * <p>频道类型过滤，枚举值：LiveChannel、SSAI、FASTChannel</p>
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * <p>维度，false(默认): summary 汇总模式；true: detail 明细模式（按时间拆分），当为false时粒度不生效</p>
    */
    @SerializedName("Dimension")
    @Expose
    private Boolean Dimension;

    /**
    * <p>时间粒度（分钟），支持5（默认）/ 60 / 1440</p>
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
     * Get <p>查询起始时间，RFC3339 格式，如2026-08-24T00:00:00+08:00</p> 
     * @return StartTime <p>查询起始时间，RFC3339 格式，如2026-08-24T00:00:00+08:00</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询起始时间，RFC3339 格式，如2026-08-24T00:00:00+08:00</p>
     * @param StartTime <p>查询起始时间，RFC3339 格式，如2026-08-24T00:00:00+08:00</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间，RFC3339 格式，如 2026-08-24T00:00:00+08:00；必须晚于 StartTime</p> 
     * @return EndTime <p>查询结束时间，RFC3339 格式，如 2026-08-24T00:00:00+08:00；必须晚于 StartTime</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间，RFC3339 格式，如 2026-08-24T00:00:00+08:00；必须晚于 StartTime</p>
     * @param EndTime <p>查询结束时间，RFC3339 格式，如 2026-08-24T00:00:00+08:00；必须晚于 StartTime</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>频道ID列表，不传则查全部频道</p> 
     * @return ChannelIds <p>频道ID列表，不传则查全部频道</p>
     */
    public String [] getChannelIds() {
        return this.ChannelIds;
    }

    /**
     * Set <p>频道ID列表，不传则查全部频道</p>
     * @param ChannelIds <p>频道ID列表，不传则查全部频道</p>
     */
    public void setChannelIds(String [] ChannelIds) {
        this.ChannelIds = ChannelIds;
    }

    /**
     * Get <p>频道类型过滤，枚举值：LiveChannel、SSAI、FASTChannel</p> 
     * @return Types <p>频道类型过滤，枚举值：LiveChannel、SSAI、FASTChannel</p>
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set <p>频道类型过滤，枚举值：LiveChannel、SSAI、FASTChannel</p>
     * @param Types <p>频道类型过滤，枚举值：LiveChannel、SSAI、FASTChannel</p>
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get <p>维度，false(默认): summary 汇总模式；true: detail 明细模式（按时间拆分），当为false时粒度不生效</p> 
     * @return Dimension <p>维度，false(默认): summary 汇总模式；true: detail 明细模式（按时间拆分），当为false时粒度不生效</p>
     */
    public Boolean getDimension() {
        return this.Dimension;
    }

    /**
     * Set <p>维度，false(默认): summary 汇总模式；true: detail 明细模式（按时间拆分），当为false时粒度不生效</p>
     * @param Dimension <p>维度，false(默认): summary 汇总模式；true: detail 明细模式（按时间拆分），当为false时粒度不生效</p>
     */
    public void setDimension(Boolean Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get <p>时间粒度（分钟），支持5（默认）/ 60 / 1440</p> 
     * @return Granularity <p>时间粒度（分钟），支持5（默认）/ 60 / 1440</p>
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set <p>时间粒度（分钟），支持5（默认）/ 60 / 1440</p>
     * @param Granularity <p>时间粒度（分钟），支持5（默认）/ 60 / 1440</p>
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    public DescribeStreamPackageIngestStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageIngestStatisticsRequest(DescribeStreamPackageIngestStatisticsRequest source) {
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
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
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
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

