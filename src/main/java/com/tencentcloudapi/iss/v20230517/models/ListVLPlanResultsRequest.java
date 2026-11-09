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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListVLPlanResultsRequest extends AbstractModel {

    /**
    * <p>开始时间戳（秒），不早于 30 天前</p>
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * <p>结束时间戳（秒），不超过当前时间，时间范围不超过 30 天</p>
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * <p>分析计划 ID，不传则查询所有计划的结果</p>
    */
    @SerializedName("VLPlanId")
    @Expose
    private String VLPlanId;

    /**
    * <p>通道 ID 列表，支持多值（英文逗号分隔），不传则查询所有通道的结果</p>
    */
    @SerializedName("ChannelIds")
    @Expose
    private String [] ChannelIds;

    /**
    * <p>页码，默认 1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数量，默认 20，最大 200</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>分析模式</p><p>枚举值：</p><ul><li>image： 图片模式</li><li>video： 视频模式</li></ul>
    */
    @SerializedName("AnalysisMode")
    @Expose
    private String AnalysisMode;

    /**
     * Get <p>开始时间戳（秒），不早于 30 天前</p> 
     * @return Start <p>开始时间戳（秒），不早于 30 天前</p>
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set <p>开始时间戳（秒），不早于 30 天前</p>
     * @param Start <p>开始时间戳（秒），不早于 30 天前</p>
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get <p>结束时间戳（秒），不超过当前时间，时间范围不超过 30 天</p> 
     * @return End <p>结束时间戳（秒），不超过当前时间，时间范围不超过 30 天</p>
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set <p>结束时间戳（秒），不超过当前时间，时间范围不超过 30 天</p>
     * @param End <p>结束时间戳（秒），不超过当前时间，时间范围不超过 30 天</p>
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get <p>分析计划 ID，不传则查询所有计划的结果</p> 
     * @return VLPlanId <p>分析计划 ID，不传则查询所有计划的结果</p>
     */
    public String getVLPlanId() {
        return this.VLPlanId;
    }

    /**
     * Set <p>分析计划 ID，不传则查询所有计划的结果</p>
     * @param VLPlanId <p>分析计划 ID，不传则查询所有计划的结果</p>
     */
    public void setVLPlanId(String VLPlanId) {
        this.VLPlanId = VLPlanId;
    }

    /**
     * Get <p>通道 ID 列表，支持多值（英文逗号分隔），不传则查询所有通道的结果</p> 
     * @return ChannelIds <p>通道 ID 列表，支持多值（英文逗号分隔），不传则查询所有通道的结果</p>
     */
    public String [] getChannelIds() {
        return this.ChannelIds;
    }

    /**
     * Set <p>通道 ID 列表，支持多值（英文逗号分隔），不传则查询所有通道的结果</p>
     * @param ChannelIds <p>通道 ID 列表，支持多值（英文逗号分隔），不传则查询所有通道的结果</p>
     */
    public void setChannelIds(String [] ChannelIds) {
        this.ChannelIds = ChannelIds;
    }

    /**
     * Get <p>页码，默认 1</p> 
     * @return PageNumber <p>页码，默认 1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，默认 1</p>
     * @param PageNumber <p>页码，默认 1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数量，默认 20，最大 200</p> 
     * @return PageSize <p>每页数量，默认 20，最大 200</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量，默认 20，最大 200</p>
     * @param PageSize <p>每页数量，默认 20，最大 200</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>分析模式</p><p>枚举值：</p><ul><li>image： 图片模式</li><li>video： 视频模式</li></ul> 
     * @return AnalysisMode <p>分析模式</p><p>枚举值：</p><ul><li>image： 图片模式</li><li>video： 视频模式</li></ul>
     */
    public String getAnalysisMode() {
        return this.AnalysisMode;
    }

    /**
     * Set <p>分析模式</p><p>枚举值：</p><ul><li>image： 图片模式</li><li>video： 视频模式</li></ul>
     * @param AnalysisMode <p>分析模式</p><p>枚举值：</p><ul><li>image： 图片模式</li><li>video： 视频模式</li></ul>
     */
    public void setAnalysisMode(String AnalysisMode) {
        this.AnalysisMode = AnalysisMode;
    }

    public ListVLPlanResultsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVLPlanResultsRequest(ListVLPlanResultsRequest source) {
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
        if (source.VLPlanId != null) {
            this.VLPlanId = new String(source.VLPlanId);
        }
        if (source.ChannelIds != null) {
            this.ChannelIds = new String[source.ChannelIds.length];
            for (int i = 0; i < source.ChannelIds.length; i++) {
                this.ChannelIds[i] = new String(source.ChannelIds[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.AnalysisMode != null) {
            this.AnalysisMode = new String(source.AnalysisMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "VLPlanId", this.VLPlanId);
        this.setParamArraySimple(map, prefix + "ChannelIds.", this.ChannelIds);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "AnalysisMode", this.AnalysisMode);

    }
}

