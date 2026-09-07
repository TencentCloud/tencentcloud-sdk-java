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

public class ModifyDocToVideoTaskStatusInput extends AbstractModel {

    /**
    * <p>修改动作类型。</p><p>枚举值：</p><ul><li>confirm： 确认已完成阶段并推进下一阶段</li><li>regenerate： 重新生成指定阶段</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>修改目标阶段。</p><p>枚举值：</p><ul><li>STAGE_1：<br>Action=confirm 时：确认大纲、继续生成后续配音、动画效果、字幕；<br>Action=regenerate 时：重新生成大纲。</li></ul><ul><li>STAGE_2：<br>Action=confirm 时：确认生成的配音、动画效果、字幕，生成最终成片；<br>Action=regenerate 时：重新生成配音、动画效果、字幕。</li></ul>
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * <p>需要进行修改的目标任务 ID。</p>
    */
    @SerializedName("SourceTaskId")
    @Expose
    private String SourceTaskId;

    /**
    * <p>重新生成参数。</p><p>仅 Action=regenerate 时必填。</p>
    */
    @SerializedName("Regenerate")
    @Expose
    private DocToVideoRegenerateInput Regenerate;

    /**
     * Get <p>修改动作类型。</p><p>枚举值：</p><ul><li>confirm： 确认已完成阶段并推进下一阶段</li><li>regenerate： 重新生成指定阶段</li></ul> 
     * @return Action <p>修改动作类型。</p><p>枚举值：</p><ul><li>confirm： 确认已完成阶段并推进下一阶段</li><li>regenerate： 重新生成指定阶段</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>修改动作类型。</p><p>枚举值：</p><ul><li>confirm： 确认已完成阶段并推进下一阶段</li><li>regenerate： 重新生成指定阶段</li></ul>
     * @param Action <p>修改动作类型。</p><p>枚举值：</p><ul><li>confirm： 确认已完成阶段并推进下一阶段</li><li>regenerate： 重新生成指定阶段</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>修改目标阶段。</p><p>枚举值：</p><ul><li>STAGE_1：<br>Action=confirm 时：确认大纲、继续生成后续配音、动画效果、字幕；<br>Action=regenerate 时：重新生成大纲。</li></ul><ul><li>STAGE_2：<br>Action=confirm 时：确认生成的配音、动画效果、字幕，生成最终成片；<br>Action=regenerate 时：重新生成配音、动画效果、字幕。</li></ul> 
     * @return Stage <p>修改目标阶段。</p><p>枚举值：</p><ul><li>STAGE_1：<br>Action=confirm 时：确认大纲、继续生成后续配音、动画效果、字幕；<br>Action=regenerate 时：重新生成大纲。</li></ul><ul><li>STAGE_2：<br>Action=confirm 时：确认生成的配音、动画效果、字幕，生成最终成片；<br>Action=regenerate 时：重新生成配音、动画效果、字幕。</li></ul>
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set <p>修改目标阶段。</p><p>枚举值：</p><ul><li>STAGE_1：<br>Action=confirm 时：确认大纲、继续生成后续配音、动画效果、字幕；<br>Action=regenerate 时：重新生成大纲。</li></ul><ul><li>STAGE_2：<br>Action=confirm 时：确认生成的配音、动画效果、字幕，生成最终成片；<br>Action=regenerate 时：重新生成配音、动画效果、字幕。</li></ul>
     * @param Stage <p>修改目标阶段。</p><p>枚举值：</p><ul><li>STAGE_1：<br>Action=confirm 时：确认大纲、继续生成后续配音、动画效果、字幕；<br>Action=regenerate 时：重新生成大纲。</li></ul><ul><li>STAGE_2：<br>Action=confirm 时：确认生成的配音、动画效果、字幕，生成最终成片；<br>Action=regenerate 时：重新生成配音、动画效果、字幕。</li></ul>
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get <p>需要进行修改的目标任务 ID。</p> 
     * @return SourceTaskId <p>需要进行修改的目标任务 ID。</p>
     */
    public String getSourceTaskId() {
        return this.SourceTaskId;
    }

    /**
     * Set <p>需要进行修改的目标任务 ID。</p>
     * @param SourceTaskId <p>需要进行修改的目标任务 ID。</p>
     */
    public void setSourceTaskId(String SourceTaskId) {
        this.SourceTaskId = SourceTaskId;
    }

    /**
     * Get <p>重新生成参数。</p><p>仅 Action=regenerate 时必填。</p> 
     * @return Regenerate <p>重新生成参数。</p><p>仅 Action=regenerate 时必填。</p>
     */
    public DocToVideoRegenerateInput getRegenerate() {
        return this.Regenerate;
    }

    /**
     * Set <p>重新生成参数。</p><p>仅 Action=regenerate 时必填。</p>
     * @param Regenerate <p>重新生成参数。</p><p>仅 Action=regenerate 时必填。</p>
     */
    public void setRegenerate(DocToVideoRegenerateInput Regenerate) {
        this.Regenerate = Regenerate;
    }

    public ModifyDocToVideoTaskStatusInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDocToVideoTaskStatusInput(ModifyDocToVideoTaskStatusInput source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.SourceTaskId != null) {
            this.SourceTaskId = new String(source.SourceTaskId);
        }
        if (source.Regenerate != null) {
            this.Regenerate = new DocToVideoRegenerateInput(source.Regenerate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "SourceTaskId", this.SourceTaskId);
        this.setParamObj(map, prefix + "Regenerate.", this.Regenerate);

    }
}

