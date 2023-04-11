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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePPTCheckResponse extends AbstractModel{

    /**
    * 任务的唯一标识Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * PPT文件是否正常
    */
    @SerializedName("IsOK")
    @Expose
    private Boolean IsOK;

    /**
    * 修复后的PPT URL，只有创建任务时参数AutoHandleUnsupportedElement=true，才返回此参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultUrl")
    @Expose
    private String ResultUrl;

    /**
    * 错误PPT页面列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Slides")
    @Expose
    private PPTErrSlide [] Slides;

    /**
    * 任务的当前状态 - QUEUED: 正在排队等待 - PROCESSING: 执行中 - FINISHED: 执行完成	
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前进度,取值范围为0~100
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务的唯一标识Id 
     * @return TaskId 任务的唯一标识Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务的唯一标识Id
     * @param TaskId 任务的唯一标识Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get PPT文件是否正常 
     * @return IsOK PPT文件是否正常
     */
    public Boolean getIsOK() {
        return this.IsOK;
    }

    /**
     * Set PPT文件是否正常
     * @param IsOK PPT文件是否正常
     */
    public void setIsOK(Boolean IsOK) {
        this.IsOK = IsOK;
    }

    /**
     * Get 修复后的PPT URL，只有创建任务时参数AutoHandleUnsupportedElement=true，才返回此参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultUrl 修复后的PPT URL，只有创建任务时参数AutoHandleUnsupportedElement=true，才返回此参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultUrl() {
        return this.ResultUrl;
    }

    /**
     * Set 修复后的PPT URL，只有创建任务时参数AutoHandleUnsupportedElement=true，才返回此参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultUrl 修复后的PPT URL，只有创建任务时参数AutoHandleUnsupportedElement=true，才返回此参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultUrl(String ResultUrl) {
        this.ResultUrl = ResultUrl;
    }

    /**
     * Get 错误PPT页面列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Slides 错误PPT页面列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PPTErrSlide [] getSlides() {
        return this.Slides;
    }

    /**
     * Set 错误PPT页面列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Slides 错误PPT页面列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlides(PPTErrSlide [] Slides) {
        this.Slides = Slides;
    }

    /**
     * Get 任务的当前状态 - QUEUED: 正在排队等待 - PROCESSING: 执行中 - FINISHED: 执行完成	 
     * @return Status 任务的当前状态 - QUEUED: 正在排队等待 - PROCESSING: 执行中 - FINISHED: 执行完成	
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务的当前状态 - QUEUED: 正在排队等待 - PROCESSING: 执行中 - FINISHED: 执行完成	
     * @param Status 任务的当前状态 - QUEUED: 正在排队等待 - PROCESSING: 执行中 - FINISHED: 执行完成	
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前进度,取值范围为0~100 
     * @return Progress 当前进度,取值范围为0~100
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 当前进度,取值范围为0~100
     * @param Progress 当前进度,取值范围为0~100
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePPTCheckResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePPTCheckResponse(DescribePPTCheckResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.IsOK != null) {
            this.IsOK = new Boolean(source.IsOK);
        }
        if (source.ResultUrl != null) {
            this.ResultUrl = new String(source.ResultUrl);
        }
        if (source.Slides != null) {
            this.Slides = new PPTErrSlide[source.Slides.length];
            for (int i = 0; i < source.Slides.length; i++) {
                this.Slides[i] = new PPTErrSlide(source.Slides[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "IsOK", this.IsOK);
        this.setParamSimple(map, prefix + "ResultUrl", this.ResultUrl);
        this.setParamArrayObj(map, prefix + "Slides.", this.Slides);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

