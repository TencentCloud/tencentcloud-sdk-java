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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectStreamConnectStatusChangedEvent extends AbstractModel{

    /**
    * 项目 Id。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目状态，取值有：
<li>Working：云转推推流开始；</li>
<li>Stopped：云转推推流结束；</li>
<li>InputInterrupted：云转推输入断流；</li>
<li>OutputInterrupted：云转推输出断流。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 云转推输入断流信息，仅当 Status 取值 InputInterrupted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputInterruptInfo")
    @Expose
    private StreamConnectInputInterruptInfo InputInterruptInfo;

    /**
    * 云转推输出断流信息，仅当 Status 取值 OutputInterrupted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputInterruptInfo")
    @Expose
    private StreamConnectOutputInterruptInfo OutputInterruptInfo;

    /**
     * Get 项目 Id。 
     * @return ProjectId 项目 Id。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 Id。
     * @param ProjectId 项目 Id。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目状态，取值有：
<li>Working：云转推推流开始；</li>
<li>Stopped：云转推推流结束；</li>
<li>InputInterrupted：云转推输入断流；</li>
<li>OutputInterrupted：云转推输出断流。</li> 
     * @return Status 项目状态，取值有：
<li>Working：云转推推流开始；</li>
<li>Stopped：云转推推流结束；</li>
<li>InputInterrupted：云转推输入断流；</li>
<li>OutputInterrupted：云转推输出断流。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 项目状态，取值有：
<li>Working：云转推推流开始；</li>
<li>Stopped：云转推推流结束；</li>
<li>InputInterrupted：云转推输入断流；</li>
<li>OutputInterrupted：云转推输出断流。</li>
     * @param Status 项目状态，取值有：
<li>Working：云转推推流开始；</li>
<li>Stopped：云转推推流结束；</li>
<li>InputInterrupted：云转推输入断流；</li>
<li>OutputInterrupted：云转推输出断流。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 云转推输入断流信息，仅当 Status 取值 InputInterrupted 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputInterruptInfo 云转推输入断流信息，仅当 Status 取值 InputInterrupted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StreamConnectInputInterruptInfo getInputInterruptInfo() {
        return this.InputInterruptInfo;
    }

    /**
     * Set 云转推输入断流信息，仅当 Status 取值 InputInterrupted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputInterruptInfo 云转推输入断流信息，仅当 Status 取值 InputInterrupted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputInterruptInfo(StreamConnectInputInterruptInfo InputInterruptInfo) {
        this.InputInterruptInfo = InputInterruptInfo;
    }

    /**
     * Get 云转推输出断流信息，仅当 Status 取值 OutputInterrupted 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputInterruptInfo 云转推输出断流信息，仅当 Status 取值 OutputInterrupted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StreamConnectOutputInterruptInfo getOutputInterruptInfo() {
        return this.OutputInterruptInfo;
    }

    /**
     * Set 云转推输出断流信息，仅当 Status 取值 OutputInterrupted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputInterruptInfo 云转推输出断流信息，仅当 Status 取值 OutputInterrupted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputInterruptInfo(StreamConnectOutputInterruptInfo OutputInterruptInfo) {
        this.OutputInterruptInfo = OutputInterruptInfo;
    }

    public ProjectStreamConnectStatusChangedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectStreamConnectStatusChangedEvent(ProjectStreamConnectStatusChangedEvent source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InputInterruptInfo != null) {
            this.InputInterruptInfo = new StreamConnectInputInterruptInfo(source.InputInterruptInfo);
        }
        if (source.OutputInterruptInfo != null) {
            this.OutputInterruptInfo = new StreamConnectOutputInterruptInfo(source.OutputInterruptInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "InputInterruptInfo.", this.InputInterruptInfo);
        this.setParamObj(map, prefix + "OutputInterruptInfo.", this.OutputInterruptInfo);

    }
}

