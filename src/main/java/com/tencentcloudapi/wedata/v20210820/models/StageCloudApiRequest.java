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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StageCloudApiRequest extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 无
    */
    @SerializedName("StageId")
    @Expose
    private String StageId;

    /**
    * 无
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 无
    */
    @SerializedName("StageName")
    @Expose
    private String StageName;

    /**
    * 无
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 无
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 无
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 无
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * 无
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 无
    */
    @SerializedName("Parameters")
    @Expose
    private Property [] Parameters;

    /**
    * 无
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 无
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 无
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 无
    */
    @SerializedName("WorkFlowId")
    @Expose
    private String WorkFlowId;

    /**
     * Get 无 
     * @return ClusterId 无
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 无
     * @param ClusterId 无
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 无 
     * @return StageId 无
     */
    public String getStageId() {
        return this.StageId;
    }

    /**
     * Set 无
     * @param StageId 无
     */
    public void setStageId(String StageId) {
        this.StageId = StageId;
    }

    /**
     * Get 无 
     * @return JobId 无
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 无
     * @param JobId 无
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 无 
     * @return StageName 无
     */
    public String getStageName() {
        return this.StageName;
    }

    /**
     * Set 无
     * @param StageName 无
     */
    public void setStageName(String StageName) {
        this.StageName = StageName;
    }

    /**
     * Get 无 
     * @return Type 无
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 无
     * @param Type 无
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 无 
     * @return Mode 无
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 无
     * @param Mode 无
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 无 
     * @return Version 无
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 无
     * @param Version 无
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 无 
     * @return Queue 无
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set 无
     * @param Queue 无
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get 无 
     * @return Content 无
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 无
     * @param Content 无
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 无 
     * @return Parameters 无
     */
    public Property [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set 无
     * @param Parameters 无
     */
    public void setParameters(Property [] Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 无 
     * @return Description 无
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 无
     * @param Description 无
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 无 
     * @return ProjectId 无
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 无
     * @param ProjectId 无
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 无 
     * @return JobType 无
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set 无
     * @param JobType 无
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 无 
     * @return WorkFlowId 无
     */
    public String getWorkFlowId() {
        return this.WorkFlowId;
    }

    /**
     * Set 无
     * @param WorkFlowId 无
     */
    public void setWorkFlowId(String WorkFlowId) {
        this.WorkFlowId = WorkFlowId;
    }

    public StageCloudApiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StageCloudApiRequest(StageCloudApiRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.StageId != null) {
            this.StageId = new String(source.StageId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.StageName != null) {
            this.StageName = new String(source.StageName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Parameters != null) {
            this.Parameters = new Property[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new Property(source.Parameters[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.WorkFlowId != null) {
            this.WorkFlowId = new String(source.WorkFlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "StageId", this.StageId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "StageName", this.StageName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "WorkFlowId", this.WorkFlowId);

    }
}

