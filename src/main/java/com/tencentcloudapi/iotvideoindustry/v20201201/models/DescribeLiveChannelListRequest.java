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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveChannelListRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 直播频道类型，1：固定直播；2：移动直播
    */
    @SerializedName("LiveChannelType")
    @Expose
    private Long LiveChannelType;

    /**
    * 直播录制计划ID, null: 直播录制计划为空
    */
    @SerializedName("RecordPlanId")
    @Expose
    private String RecordPlanId;

    /**
    * 频道名称 (支持模糊搜索)
    */
    @SerializedName("LiveChannelName")
    @Expose
    private String LiveChannelName;

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
     * Get 最大数 
     * @return Limit 最大数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大数
     * @param Limit 最大数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 直播频道类型，1：固定直播；2：移动直播 
     * @return LiveChannelType 直播频道类型，1：固定直播；2：移动直播
     */
    public Long getLiveChannelType() {
        return this.LiveChannelType;
    }

    /**
     * Set 直播频道类型，1：固定直播；2：移动直播
     * @param LiveChannelType 直播频道类型，1：固定直播；2：移动直播
     */
    public void setLiveChannelType(Long LiveChannelType) {
        this.LiveChannelType = LiveChannelType;
    }

    /**
     * Get 直播录制计划ID, null: 直播录制计划为空 
     * @return RecordPlanId 直播录制计划ID, null: 直播录制计划为空
     */
    public String getRecordPlanId() {
        return this.RecordPlanId;
    }

    /**
     * Set 直播录制计划ID, null: 直播录制计划为空
     * @param RecordPlanId 直播录制计划ID, null: 直播录制计划为空
     */
    public void setRecordPlanId(String RecordPlanId) {
        this.RecordPlanId = RecordPlanId;
    }

    /**
     * Get 频道名称 (支持模糊搜索) 
     * @return LiveChannelName 频道名称 (支持模糊搜索)
     */
    public String getLiveChannelName() {
        return this.LiveChannelName;
    }

    /**
     * Set 频道名称 (支持模糊搜索)
     * @param LiveChannelName 频道名称 (支持模糊搜索)
     */
    public void setLiveChannelName(String LiveChannelName) {
        this.LiveChannelName = LiveChannelName;
    }

    public DescribeLiveChannelListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveChannelListRequest(DescribeLiveChannelListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.LiveChannelType != null) {
            this.LiveChannelType = new Long(source.LiveChannelType);
        }
        if (source.RecordPlanId != null) {
            this.RecordPlanId = new String(source.RecordPlanId);
        }
        if (source.LiveChannelName != null) {
            this.LiveChannelName = new String(source.LiveChannelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "LiveChannelType", this.LiveChannelType);
        this.setParamSimple(map, prefix + "RecordPlanId", this.RecordPlanId);
        this.setParamSimple(map, prefix + "LiveChannelName", this.LiveChannelName);

    }
}

