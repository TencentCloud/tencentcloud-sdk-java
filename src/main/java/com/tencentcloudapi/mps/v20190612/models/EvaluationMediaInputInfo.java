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

public class EvaluationMediaInputInfo extends AbstractModel {

    /**
    * 对比视频的来源 ID，当评测任务的类型为 BD_RATE 且对比视频来自用户输入时有效；当对比视频来自转码模版时为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 对比视频的输入信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
     * Get 对比视频的来源 ID，当评测任务的类型为 BD_RATE 且对比视频来自用户输入时有效；当对比视频来自转码模版时为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceId 对比视频的来源 ID，当评测任务的类型为 BD_RATE 且对比视频来自用户输入时有效；当对比视频来自转码模版时为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 对比视频的来源 ID，当评测任务的类型为 BD_RATE 且对比视频来自用户输入时有效；当对比视频来自转码模版时为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceId 对比视频的来源 ID，当评测任务的类型为 BD_RATE 且对比视频来自用户输入时有效；当对比视频来自转码模版时为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 对比视频的输入信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputInfo 对比视频的输入信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 对比视频的输入信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputInfo 对比视频的输入信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    public EvaluationMediaInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EvaluationMediaInputInfo(EvaluationMediaInputInfo source) {
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);

    }
}

