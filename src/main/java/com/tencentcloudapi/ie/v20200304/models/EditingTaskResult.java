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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditingTaskResult extends AbstractModel{

    /**
    * 编辑任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 编辑任务状态。 
1：执行中；2：已完成。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 视频标签识别结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagTaskResult")
    @Expose
    private TagTaskResult TagTaskResult;

    /**
    * 视频分类识别结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassificationTaskResult")
    @Expose
    private ClassificationTaskResult ClassificationTaskResult;

    /**
    * 智能拆条结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StripTaskResult")
    @Expose
    private StripTaskResult StripTaskResult;

    /**
    * 智能集锦结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighlightsTaskResult")
    @Expose
    private HighlightsTaskResult HighlightsTaskResult;

    /**
    * 智能封面结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverTaskResult")
    @Expose
    private CoverTaskResult CoverTaskResult;

    /**
    * 片头片尾识别结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpeningEndingTaskResult")
    @Expose
    private OpeningEndingTaskResult OpeningEndingTaskResult;

    /**
     * Get 编辑任务 ID。 
     * @return TaskId 编辑任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 编辑任务 ID。
     * @param TaskId 编辑任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 编辑任务状态。 
1：执行中；2：已完成。 
     * @return Status 编辑任务状态。 
1：执行中；2：已完成。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 编辑任务状态。 
1：执行中；2：已完成。
     * @param Status 编辑任务状态。 
1：执行中；2：已完成。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 视频标签识别结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagTaskResult 视频标签识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagTaskResult getTagTaskResult() {
        return this.TagTaskResult;
    }

    /**
     * Set 视频标签识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagTaskResult 视频标签识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagTaskResult(TagTaskResult TagTaskResult) {
        this.TagTaskResult = TagTaskResult;
    }

    /**
     * Get 视频分类识别结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassificationTaskResult 视频分类识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClassificationTaskResult getClassificationTaskResult() {
        return this.ClassificationTaskResult;
    }

    /**
     * Set 视频分类识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassificationTaskResult 视频分类识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassificationTaskResult(ClassificationTaskResult ClassificationTaskResult) {
        this.ClassificationTaskResult = ClassificationTaskResult;
    }

    /**
     * Get 智能拆条结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StripTaskResult 智能拆条结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StripTaskResult getStripTaskResult() {
        return this.StripTaskResult;
    }

    /**
     * Set 智能拆条结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StripTaskResult 智能拆条结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStripTaskResult(StripTaskResult StripTaskResult) {
        this.StripTaskResult = StripTaskResult;
    }

    /**
     * Get 智能集锦结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighlightsTaskResult 智能集锦结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HighlightsTaskResult getHighlightsTaskResult() {
        return this.HighlightsTaskResult;
    }

    /**
     * Set 智能集锦结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighlightsTaskResult 智能集锦结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighlightsTaskResult(HighlightsTaskResult HighlightsTaskResult) {
        this.HighlightsTaskResult = HighlightsTaskResult;
    }

    /**
     * Get 智能封面结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoverTaskResult 智能封面结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CoverTaskResult getCoverTaskResult() {
        return this.CoverTaskResult;
    }

    /**
     * Set 智能封面结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverTaskResult 智能封面结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverTaskResult(CoverTaskResult CoverTaskResult) {
        this.CoverTaskResult = CoverTaskResult;
    }

    /**
     * Get 片头片尾识别结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpeningEndingTaskResult 片头片尾识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OpeningEndingTaskResult getOpeningEndingTaskResult() {
        return this.OpeningEndingTaskResult;
    }

    /**
     * Set 片头片尾识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpeningEndingTaskResult 片头片尾识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpeningEndingTaskResult(OpeningEndingTaskResult OpeningEndingTaskResult) {
        this.OpeningEndingTaskResult = OpeningEndingTaskResult;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "TagTaskResult.", this.TagTaskResult);
        this.setParamObj(map, prefix + "ClassificationTaskResult.", this.ClassificationTaskResult);
        this.setParamObj(map, prefix + "StripTaskResult.", this.StripTaskResult);
        this.setParamObj(map, prefix + "HighlightsTaskResult.", this.HighlightsTaskResult);
        this.setParamObj(map, prefix + "CoverTaskResult.", this.CoverTaskResult);
        this.setParamObj(map, prefix + "OpeningEndingTaskResult.", this.OpeningEndingTaskResult);

    }
}

