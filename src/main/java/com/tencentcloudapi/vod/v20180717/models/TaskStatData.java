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

public class TaskStatData extends AbstractModel{

    /**
    * 任务类型。
<li> Transcoding: 普通转码</li>
<li> Transcoding-TESHD: 极速高清转码</li>
<li> Editing: 视频编辑</li>
<li> Editing-TESHD: 极速高清视频编辑</li>
<li> AdaptiveBitrateStreaming: 自适应码流</li>
<li> ContentAudit: 智能识别</li>
<li> RemoveWatermark: 去水印</li>
<li>Transcode: 转码，包含普通转码、极速高清和视频编辑（不推荐使用）</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务数统计数据概览，用量单位为秒。
    */
    @SerializedName("Summary")
    @Expose
    private TaskStatDataItem [] Summary;

    /**
    * 不同规格任务统计数据详情。
转码规格：
<li>Remuxing: 转封装</li>
<li>Audio: 音频转码</li>
<li>Standard.H264.SD: H.264编码方式标清转码</li>
<li>Standard.H264.HD: H.264编码方式高清转码</li>
<li>Standard.H264.FHD: H.264编码方式全高清转码</li>
<li>Standard.H264.2K: H.264编码方式2K转码</li>
<li>Standard.H264.4K: H.264编码方式4K转码</li>
<li>Standard.H265.SD: H.265编码方式标清转码</li>
<li>Standard.H265.HD: H.265编码方式高清转码</li>
<li>Standard.H265.FHD: H.265编码方式全高清转码</li>
<li>Standard.H265.2K: H.265编码方式2K转码</li>
<li>Standard.H265.4K: H.265编码方式4K转码</li>
<li>TESHD-10.H264.SD: H.264编码方式标清极速高清转码</li>
<li>TESHD-10.H264.HD: H.264编码方式高清极速高清转码</li>
<li>TESHD-10.H264.FHD: H.264编码方式全高清极速高清转码</li>
<li>TESHD-10.H264.2K: H.264编码方式2K极速高清转码</li>
<li>TESHD-10.H264.4K: H.264编码方式4K极速高清转码</li>
<li>TESHD-10.H265.SD: H.265编码方式标清极速高清转码</li>
<li>TESHD-10.H265.HD: H.265编码方式高清极速高清转码</li>
<li>TESHD-10.H265.FHD: H.265编码方式全高清极速高清转码</li>
<li>TESHD-10.H265.2K: H.265编码方式2K极速高清转码</li>
<li>TESHD-10.H265.4K: H.265编码方式4K极速高清转码</li>
<li>Edit.Audio: 音频编辑</li>
<li>Edit.H264.SD: H.264编码方式标清视频编辑</li>
<li>Edit.H264.HD: H.264编码方式高清视频编辑</li>
<li>Edit.H264.FHD: H.264编码方式全高清视频编辑</li>
<li>Edit.H264.2K: H.264编码方式2K视频编辑</li>
<li>Edit.H264.4K: H.264编码方式4K视频编辑</li>
<li>Edit.H265.SD: H.265编码方式标清视频编辑</li>
<li>Edit.H265.HD: H.265编码方式高清视频编辑</li>
<li>Edit.H265.FHD: H.265编码方式全高清视频编辑</li>
<li>Edit.H265.2K: H.265编码方式2K视频编辑</li>
<li>Edit.H265.4K: H.265编码方式4K视频编辑</li>
<li>Edit.TESHD-10.H264.SD: H.264编码方式标清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.HD: H.264编码方式高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.FHD: H.264编码方式全高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.2K: H.264编码方式2K极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.4K: H.264编码方式4K极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.SD: H.265编码方式标清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.HD: H.265编码方式高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.FHD: H.265编码方式全高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.2K: H.265编码方式2K极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.4K: H.265编码方式4K极速高清视频编辑</li>
去水印规格：
<li>480P: 分辨率640*480及以下</li>
<li>720P: 分辨率1280*720及以下</li>
<li>1080P: 分辨率1920*1080及以下</li>
<li>2K: 分辨率2560*1440及以下</li>
<li>4K: 分辨率3840*2160及以下</li>
<li>8K: 分辨率7680*4320及以下</li>
    */
    @SerializedName("Details")
    @Expose
    private SpecificationDataItem [] Details;

    /**
     * Get 任务类型。
<li> Transcoding: 普通转码</li>
<li> Transcoding-TESHD: 极速高清转码</li>
<li> Editing: 视频编辑</li>
<li> Editing-TESHD: 极速高清视频编辑</li>
<li> AdaptiveBitrateStreaming: 自适应码流</li>
<li> ContentAudit: 智能识别</li>
<li> RemoveWatermark: 去水印</li>
<li>Transcode: 转码，包含普通转码、极速高清和视频编辑（不推荐使用）</li> 
     * @return TaskType 任务类型。
<li> Transcoding: 普通转码</li>
<li> Transcoding-TESHD: 极速高清转码</li>
<li> Editing: 视频编辑</li>
<li> Editing-TESHD: 极速高清视频编辑</li>
<li> AdaptiveBitrateStreaming: 自适应码流</li>
<li> ContentAudit: 智能识别</li>
<li> RemoveWatermark: 去水印</li>
<li>Transcode: 转码，包含普通转码、极速高清和视频编辑（不推荐使用）</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型。
<li> Transcoding: 普通转码</li>
<li> Transcoding-TESHD: 极速高清转码</li>
<li> Editing: 视频编辑</li>
<li> Editing-TESHD: 极速高清视频编辑</li>
<li> AdaptiveBitrateStreaming: 自适应码流</li>
<li> ContentAudit: 智能识别</li>
<li> RemoveWatermark: 去水印</li>
<li>Transcode: 转码，包含普通转码、极速高清和视频编辑（不推荐使用）</li>
     * @param TaskType 任务类型。
<li> Transcoding: 普通转码</li>
<li> Transcoding-TESHD: 极速高清转码</li>
<li> Editing: 视频编辑</li>
<li> Editing-TESHD: 极速高清视频编辑</li>
<li> AdaptiveBitrateStreaming: 自适应码流</li>
<li> ContentAudit: 智能识别</li>
<li> RemoveWatermark: 去水印</li>
<li>Transcode: 转码，包含普通转码、极速高清和视频编辑（不推荐使用）</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务数统计数据概览，用量单位为秒。 
     * @return Summary 任务数统计数据概览，用量单位为秒。
     */
    public TaskStatDataItem [] getSummary() {
        return this.Summary;
    }

    /**
     * Set 任务数统计数据概览，用量单位为秒。
     * @param Summary 任务数统计数据概览，用量单位为秒。
     */
    public void setSummary(TaskStatDataItem [] Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 不同规格任务统计数据详情。
转码规格：
<li>Remuxing: 转封装</li>
<li>Audio: 音频转码</li>
<li>Standard.H264.SD: H.264编码方式标清转码</li>
<li>Standard.H264.HD: H.264编码方式高清转码</li>
<li>Standard.H264.FHD: H.264编码方式全高清转码</li>
<li>Standard.H264.2K: H.264编码方式2K转码</li>
<li>Standard.H264.4K: H.264编码方式4K转码</li>
<li>Standard.H265.SD: H.265编码方式标清转码</li>
<li>Standard.H265.HD: H.265编码方式高清转码</li>
<li>Standard.H265.FHD: H.265编码方式全高清转码</li>
<li>Standard.H265.2K: H.265编码方式2K转码</li>
<li>Standard.H265.4K: H.265编码方式4K转码</li>
<li>TESHD-10.H264.SD: H.264编码方式标清极速高清转码</li>
<li>TESHD-10.H264.HD: H.264编码方式高清极速高清转码</li>
<li>TESHD-10.H264.FHD: H.264编码方式全高清极速高清转码</li>
<li>TESHD-10.H264.2K: H.264编码方式2K极速高清转码</li>
<li>TESHD-10.H264.4K: H.264编码方式4K极速高清转码</li>
<li>TESHD-10.H265.SD: H.265编码方式标清极速高清转码</li>
<li>TESHD-10.H265.HD: H.265编码方式高清极速高清转码</li>
<li>TESHD-10.H265.FHD: H.265编码方式全高清极速高清转码</li>
<li>TESHD-10.H265.2K: H.265编码方式2K极速高清转码</li>
<li>TESHD-10.H265.4K: H.265编码方式4K极速高清转码</li>
<li>Edit.Audio: 音频编辑</li>
<li>Edit.H264.SD: H.264编码方式标清视频编辑</li>
<li>Edit.H264.HD: H.264编码方式高清视频编辑</li>
<li>Edit.H264.FHD: H.264编码方式全高清视频编辑</li>
<li>Edit.H264.2K: H.264编码方式2K视频编辑</li>
<li>Edit.H264.4K: H.264编码方式4K视频编辑</li>
<li>Edit.H265.SD: H.265编码方式标清视频编辑</li>
<li>Edit.H265.HD: H.265编码方式高清视频编辑</li>
<li>Edit.H265.FHD: H.265编码方式全高清视频编辑</li>
<li>Edit.H265.2K: H.265编码方式2K视频编辑</li>
<li>Edit.H265.4K: H.265编码方式4K视频编辑</li>
<li>Edit.TESHD-10.H264.SD: H.264编码方式标清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.HD: H.264编码方式高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.FHD: H.264编码方式全高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.2K: H.264编码方式2K极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.4K: H.264编码方式4K极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.SD: H.265编码方式标清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.HD: H.265编码方式高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.FHD: H.265编码方式全高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.2K: H.265编码方式2K极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.4K: H.265编码方式4K极速高清视频编辑</li>
去水印规格：
<li>480P: 分辨率640*480及以下</li>
<li>720P: 分辨率1280*720及以下</li>
<li>1080P: 分辨率1920*1080及以下</li>
<li>2K: 分辨率2560*1440及以下</li>
<li>4K: 分辨率3840*2160及以下</li>
<li>8K: 分辨率7680*4320及以下</li> 
     * @return Details 不同规格任务统计数据详情。
转码规格：
<li>Remuxing: 转封装</li>
<li>Audio: 音频转码</li>
<li>Standard.H264.SD: H.264编码方式标清转码</li>
<li>Standard.H264.HD: H.264编码方式高清转码</li>
<li>Standard.H264.FHD: H.264编码方式全高清转码</li>
<li>Standard.H264.2K: H.264编码方式2K转码</li>
<li>Standard.H264.4K: H.264编码方式4K转码</li>
<li>Standard.H265.SD: H.265编码方式标清转码</li>
<li>Standard.H265.HD: H.265编码方式高清转码</li>
<li>Standard.H265.FHD: H.265编码方式全高清转码</li>
<li>Standard.H265.2K: H.265编码方式2K转码</li>
<li>Standard.H265.4K: H.265编码方式4K转码</li>
<li>TESHD-10.H264.SD: H.264编码方式标清极速高清转码</li>
<li>TESHD-10.H264.HD: H.264编码方式高清极速高清转码</li>
<li>TESHD-10.H264.FHD: H.264编码方式全高清极速高清转码</li>
<li>TESHD-10.H264.2K: H.264编码方式2K极速高清转码</li>
<li>TESHD-10.H264.4K: H.264编码方式4K极速高清转码</li>
<li>TESHD-10.H265.SD: H.265编码方式标清极速高清转码</li>
<li>TESHD-10.H265.HD: H.265编码方式高清极速高清转码</li>
<li>TESHD-10.H265.FHD: H.265编码方式全高清极速高清转码</li>
<li>TESHD-10.H265.2K: H.265编码方式2K极速高清转码</li>
<li>TESHD-10.H265.4K: H.265编码方式4K极速高清转码</li>
<li>Edit.Audio: 音频编辑</li>
<li>Edit.H264.SD: H.264编码方式标清视频编辑</li>
<li>Edit.H264.HD: H.264编码方式高清视频编辑</li>
<li>Edit.H264.FHD: H.264编码方式全高清视频编辑</li>
<li>Edit.H264.2K: H.264编码方式2K视频编辑</li>
<li>Edit.H264.4K: H.264编码方式4K视频编辑</li>
<li>Edit.H265.SD: H.265编码方式标清视频编辑</li>
<li>Edit.H265.HD: H.265编码方式高清视频编辑</li>
<li>Edit.H265.FHD: H.265编码方式全高清视频编辑</li>
<li>Edit.H265.2K: H.265编码方式2K视频编辑</li>
<li>Edit.H265.4K: H.265编码方式4K视频编辑</li>
<li>Edit.TESHD-10.H264.SD: H.264编码方式标清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.HD: H.264编码方式高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.FHD: H.264编码方式全高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.2K: H.264编码方式2K极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.4K: H.264编码方式4K极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.SD: H.265编码方式标清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.HD: H.265编码方式高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.FHD: H.265编码方式全高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.2K: H.265编码方式2K极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.4K: H.265编码方式4K极速高清视频编辑</li>
去水印规格：
<li>480P: 分辨率640*480及以下</li>
<li>720P: 分辨率1280*720及以下</li>
<li>1080P: 分辨率1920*1080及以下</li>
<li>2K: 分辨率2560*1440及以下</li>
<li>4K: 分辨率3840*2160及以下</li>
<li>8K: 分辨率7680*4320及以下</li>
     */
    public SpecificationDataItem [] getDetails() {
        return this.Details;
    }

    /**
     * Set 不同规格任务统计数据详情。
转码规格：
<li>Remuxing: 转封装</li>
<li>Audio: 音频转码</li>
<li>Standard.H264.SD: H.264编码方式标清转码</li>
<li>Standard.H264.HD: H.264编码方式高清转码</li>
<li>Standard.H264.FHD: H.264编码方式全高清转码</li>
<li>Standard.H264.2K: H.264编码方式2K转码</li>
<li>Standard.H264.4K: H.264编码方式4K转码</li>
<li>Standard.H265.SD: H.265编码方式标清转码</li>
<li>Standard.H265.HD: H.265编码方式高清转码</li>
<li>Standard.H265.FHD: H.265编码方式全高清转码</li>
<li>Standard.H265.2K: H.265编码方式2K转码</li>
<li>Standard.H265.4K: H.265编码方式4K转码</li>
<li>TESHD-10.H264.SD: H.264编码方式标清极速高清转码</li>
<li>TESHD-10.H264.HD: H.264编码方式高清极速高清转码</li>
<li>TESHD-10.H264.FHD: H.264编码方式全高清极速高清转码</li>
<li>TESHD-10.H264.2K: H.264编码方式2K极速高清转码</li>
<li>TESHD-10.H264.4K: H.264编码方式4K极速高清转码</li>
<li>TESHD-10.H265.SD: H.265编码方式标清极速高清转码</li>
<li>TESHD-10.H265.HD: H.265编码方式高清极速高清转码</li>
<li>TESHD-10.H265.FHD: H.265编码方式全高清极速高清转码</li>
<li>TESHD-10.H265.2K: H.265编码方式2K极速高清转码</li>
<li>TESHD-10.H265.4K: H.265编码方式4K极速高清转码</li>
<li>Edit.Audio: 音频编辑</li>
<li>Edit.H264.SD: H.264编码方式标清视频编辑</li>
<li>Edit.H264.HD: H.264编码方式高清视频编辑</li>
<li>Edit.H264.FHD: H.264编码方式全高清视频编辑</li>
<li>Edit.H264.2K: H.264编码方式2K视频编辑</li>
<li>Edit.H264.4K: H.264编码方式4K视频编辑</li>
<li>Edit.H265.SD: H.265编码方式标清视频编辑</li>
<li>Edit.H265.HD: H.265编码方式高清视频编辑</li>
<li>Edit.H265.FHD: H.265编码方式全高清视频编辑</li>
<li>Edit.H265.2K: H.265编码方式2K视频编辑</li>
<li>Edit.H265.4K: H.265编码方式4K视频编辑</li>
<li>Edit.TESHD-10.H264.SD: H.264编码方式标清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.HD: H.264编码方式高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.FHD: H.264编码方式全高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.2K: H.264编码方式2K极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.4K: H.264编码方式4K极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.SD: H.265编码方式标清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.HD: H.265编码方式高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.FHD: H.265编码方式全高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.2K: H.265编码方式2K极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.4K: H.265编码方式4K极速高清视频编辑</li>
去水印规格：
<li>480P: 分辨率640*480及以下</li>
<li>720P: 分辨率1280*720及以下</li>
<li>1080P: 分辨率1920*1080及以下</li>
<li>2K: 分辨率2560*1440及以下</li>
<li>4K: 分辨率3840*2160及以下</li>
<li>8K: 分辨率7680*4320及以下</li>
     * @param Details 不同规格任务统计数据详情。
转码规格：
<li>Remuxing: 转封装</li>
<li>Audio: 音频转码</li>
<li>Standard.H264.SD: H.264编码方式标清转码</li>
<li>Standard.H264.HD: H.264编码方式高清转码</li>
<li>Standard.H264.FHD: H.264编码方式全高清转码</li>
<li>Standard.H264.2K: H.264编码方式2K转码</li>
<li>Standard.H264.4K: H.264编码方式4K转码</li>
<li>Standard.H265.SD: H.265编码方式标清转码</li>
<li>Standard.H265.HD: H.265编码方式高清转码</li>
<li>Standard.H265.FHD: H.265编码方式全高清转码</li>
<li>Standard.H265.2K: H.265编码方式2K转码</li>
<li>Standard.H265.4K: H.265编码方式4K转码</li>
<li>TESHD-10.H264.SD: H.264编码方式标清极速高清转码</li>
<li>TESHD-10.H264.HD: H.264编码方式高清极速高清转码</li>
<li>TESHD-10.H264.FHD: H.264编码方式全高清极速高清转码</li>
<li>TESHD-10.H264.2K: H.264编码方式2K极速高清转码</li>
<li>TESHD-10.H264.4K: H.264编码方式4K极速高清转码</li>
<li>TESHD-10.H265.SD: H.265编码方式标清极速高清转码</li>
<li>TESHD-10.H265.HD: H.265编码方式高清极速高清转码</li>
<li>TESHD-10.H265.FHD: H.265编码方式全高清极速高清转码</li>
<li>TESHD-10.H265.2K: H.265编码方式2K极速高清转码</li>
<li>TESHD-10.H265.4K: H.265编码方式4K极速高清转码</li>
<li>Edit.Audio: 音频编辑</li>
<li>Edit.H264.SD: H.264编码方式标清视频编辑</li>
<li>Edit.H264.HD: H.264编码方式高清视频编辑</li>
<li>Edit.H264.FHD: H.264编码方式全高清视频编辑</li>
<li>Edit.H264.2K: H.264编码方式2K视频编辑</li>
<li>Edit.H264.4K: H.264编码方式4K视频编辑</li>
<li>Edit.H265.SD: H.265编码方式标清视频编辑</li>
<li>Edit.H265.HD: H.265编码方式高清视频编辑</li>
<li>Edit.H265.FHD: H.265编码方式全高清视频编辑</li>
<li>Edit.H265.2K: H.265编码方式2K视频编辑</li>
<li>Edit.H265.4K: H.265编码方式4K视频编辑</li>
<li>Edit.TESHD-10.H264.SD: H.264编码方式标清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.HD: H.264编码方式高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.FHD: H.264编码方式全高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.2K: H.264编码方式2K极速高清视频编辑</li>
<li>Edit.TESHD-10.H264.4K: H.264编码方式4K极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.SD: H.265编码方式标清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.HD: H.265编码方式高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.FHD: H.265编码方式全高清极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.2K: H.265编码方式2K极速高清视频编辑</li>
<li>Edit.TESHD-10.H265.4K: H.265编码方式4K极速高清视频编辑</li>
去水印规格：
<li>480P: 分辨率640*480及以下</li>
<li>720P: 分辨率1280*720及以下</li>
<li>1080P: 分辨率1920*1080及以下</li>
<li>2K: 分辨率2560*1440及以下</li>
<li>4K: 分辨率3840*2160及以下</li>
<li>8K: 分辨率7680*4320及以下</li>
     */
    public void setDetails(SpecificationDataItem [] Details) {
        this.Details = Details;
    }

    public TaskStatData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatData(TaskStatData source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Summary != null) {
            this.Summary = new TaskStatDataItem[source.Summary.length];
            for (int i = 0; i < source.Summary.length; i++) {
                this.Summary[i] = new TaskStatDataItem(source.Summary[i]);
            }
        }
        if (source.Details != null) {
            this.Details = new SpecificationDataItem[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new SpecificationDataItem(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "Summary.", this.Summary);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

