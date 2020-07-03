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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMediaInfosRequest extends AbstractModel{

    /**
    * 媒体文件 ID 列表，N 从 0 开始取值，最大 19。
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：
<li>basicInfo（视频基础信息）。</li>
<li>metaData（视频元信息）。</li>
<li>transcodeInfo（视频转码结果信息）。</li>
<li>animatedGraphicsInfo（视频转动图结果信息）。</li>
<li>imageSpriteInfo（视频雪碧图信息）。</li>
<li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li>
<li>sampleSnapshotInfo（采样截图信息）。</li>
<li>keyFrameDescInfo（打点信息）。</li>
<li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li>
<li>miniProgramReviewInfo（小程序审核信息）。</li>
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 媒体文件 ID 列表，N 从 0 开始取值，最大 19。 
     * @return FileIds 媒体文件 ID 列表，N 从 0 开始取值，最大 19。
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 媒体文件 ID 列表，N 从 0 开始取值，最大 19。
     * @param FileIds 媒体文件 ID 列表，N 从 0 开始取值，最大 19。
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get 指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：
<li>basicInfo（视频基础信息）。</li>
<li>metaData（视频元信息）。</li>
<li>transcodeInfo（视频转码结果信息）。</li>
<li>animatedGraphicsInfo（视频转动图结果信息）。</li>
<li>imageSpriteInfo（视频雪碧图信息）。</li>
<li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li>
<li>sampleSnapshotInfo（采样截图信息）。</li>
<li>keyFrameDescInfo（打点信息）。</li>
<li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li>
<li>miniProgramReviewInfo（小程序审核信息）。</li> 
     * @return Filters 指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：
<li>basicInfo（视频基础信息）。</li>
<li>metaData（视频元信息）。</li>
<li>transcodeInfo（视频转码结果信息）。</li>
<li>animatedGraphicsInfo（视频转动图结果信息）。</li>
<li>imageSpriteInfo（视频雪碧图信息）。</li>
<li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li>
<li>sampleSnapshotInfo（采样截图信息）。</li>
<li>keyFrameDescInfo（打点信息）。</li>
<li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li>
<li>miniProgramReviewInfo（小程序审核信息）。</li>
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：
<li>basicInfo（视频基础信息）。</li>
<li>metaData（视频元信息）。</li>
<li>transcodeInfo（视频转码结果信息）。</li>
<li>animatedGraphicsInfo（视频转动图结果信息）。</li>
<li>imageSpriteInfo（视频雪碧图信息）。</li>
<li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li>
<li>sampleSnapshotInfo（采样截图信息）。</li>
<li>keyFrameDescInfo（打点信息）。</li>
<li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li>
<li>miniProgramReviewInfo（小程序审核信息）。</li>
     * @param Filters 指定所有媒体文件需要返回的信息，可同时指定多个信息，N 从 0 开始递增。如果未填写该字段，默认返回所有信息。选项有：
<li>basicInfo（视频基础信息）。</li>
<li>metaData（视频元信息）。</li>
<li>transcodeInfo（视频转码结果信息）。</li>
<li>animatedGraphicsInfo（视频转动图结果信息）。</li>
<li>imageSpriteInfo（视频雪碧图信息）。</li>
<li>snapshotByTimeOffsetInfo（视频指定时间点截图信息）。</li>
<li>sampleSnapshotInfo（采样截图信息）。</li>
<li>keyFrameDescInfo（打点信息）。</li>
<li>adaptiveDynamicStreamingInfo（转自适应码流信息）。</li>
<li>miniProgramReviewInfo（小程序审核信息）。</li>
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

