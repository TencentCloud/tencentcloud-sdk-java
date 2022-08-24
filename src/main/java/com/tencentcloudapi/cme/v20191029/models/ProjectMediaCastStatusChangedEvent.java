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

public class ProjectMediaCastStatusChangedEvent extends AbstractModel{

    /**
    * 项目 Id。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目状态，取值有：
<li>Started：点播转直播开始；</li>
<li>Stopped：点播转直播结束；</li>
<li>SourceInterrupted：点播转直播输入断流；</li>
<li>DestinationInterrupted：点播转直播输出断流。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 点播转直播输入断流信息，仅当 Status 取值 SourceInterrupted 时有效。
    */
    @SerializedName("SourceInterruptInfo")
    @Expose
    private MediaCastSourceInterruptInfo SourceInterruptInfo;

    /**
    * 点播转直播输出断流信息，仅当 Status 取值 DestinationInterrupted 时有效。
    */
    @SerializedName("DestinationInterruptInfo")
    @Expose
    private MediaCastDestinationInterruptInfo DestinationInterruptInfo;

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
<li>Started：点播转直播开始；</li>
<li>Stopped：点播转直播结束；</li>
<li>SourceInterrupted：点播转直播输入断流；</li>
<li>DestinationInterrupted：点播转直播输出断流。</li> 
     * @return Status 项目状态，取值有：
<li>Started：点播转直播开始；</li>
<li>Stopped：点播转直播结束；</li>
<li>SourceInterrupted：点播转直播输入断流；</li>
<li>DestinationInterrupted：点播转直播输出断流。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 项目状态，取值有：
<li>Started：点播转直播开始；</li>
<li>Stopped：点播转直播结束；</li>
<li>SourceInterrupted：点播转直播输入断流；</li>
<li>DestinationInterrupted：点播转直播输出断流。</li>
     * @param Status 项目状态，取值有：
<li>Started：点播转直播开始；</li>
<li>Stopped：点播转直播结束；</li>
<li>SourceInterrupted：点播转直播输入断流；</li>
<li>DestinationInterrupted：点播转直播输出断流。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 点播转直播输入断流信息，仅当 Status 取值 SourceInterrupted 时有效。 
     * @return SourceInterruptInfo 点播转直播输入断流信息，仅当 Status 取值 SourceInterrupted 时有效。
     */
    public MediaCastSourceInterruptInfo getSourceInterruptInfo() {
        return this.SourceInterruptInfo;
    }

    /**
     * Set 点播转直播输入断流信息，仅当 Status 取值 SourceInterrupted 时有效。
     * @param SourceInterruptInfo 点播转直播输入断流信息，仅当 Status 取值 SourceInterrupted 时有效。
     */
    public void setSourceInterruptInfo(MediaCastSourceInterruptInfo SourceInterruptInfo) {
        this.SourceInterruptInfo = SourceInterruptInfo;
    }

    /**
     * Get 点播转直播输出断流信息，仅当 Status 取值 DestinationInterrupted 时有效。 
     * @return DestinationInterruptInfo 点播转直播输出断流信息，仅当 Status 取值 DestinationInterrupted 时有效。
     */
    public MediaCastDestinationInterruptInfo getDestinationInterruptInfo() {
        return this.DestinationInterruptInfo;
    }

    /**
     * Set 点播转直播输出断流信息，仅当 Status 取值 DestinationInterrupted 时有效。
     * @param DestinationInterruptInfo 点播转直播输出断流信息，仅当 Status 取值 DestinationInterrupted 时有效。
     */
    public void setDestinationInterruptInfo(MediaCastDestinationInterruptInfo DestinationInterruptInfo) {
        this.DestinationInterruptInfo = DestinationInterruptInfo;
    }

    public ProjectMediaCastStatusChangedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectMediaCastStatusChangedEvent(ProjectMediaCastStatusChangedEvent source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SourceInterruptInfo != null) {
            this.SourceInterruptInfo = new MediaCastSourceInterruptInfo(source.SourceInterruptInfo);
        }
        if (source.DestinationInterruptInfo != null) {
            this.DestinationInterruptInfo = new MediaCastDestinationInterruptInfo(source.DestinationInterruptInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "SourceInterruptInfo.", this.SourceInterruptInfo);
        this.setParamObj(map, prefix + "DestinationInterruptInfo.", this.DestinationInterruptInfo);

    }
}

