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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResumeWorkflowRunRequest extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>工作流运行实例ID</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * <p>用户输入的内容</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>文件信息</p>
    */
    @SerializedName("FileList")
    @Expose
    private ConversationFileInfo [] FileList;

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>工作流运行实例ID</p> 
     * @return WorkflowRunId <p>工作流运行实例ID</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>工作流运行实例ID</p>
     * @param WorkflowRunId <p>工作流运行实例ID</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get <p>用户输入的内容</p> 
     * @return Query <p>用户输入的内容</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>用户输入的内容</p>
     * @param Query <p>用户输入的内容</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>文件信息</p> 
     * @return FileList <p>文件信息</p>
     */
    public ConversationFileInfo [] getFileList() {
        return this.FileList;
    }

    /**
     * Set <p>文件信息</p>
     * @param FileList <p>文件信息</p>
     */
    public void setFileList(ConversationFileInfo [] FileList) {
        this.FileList = FileList;
    }

    public ResumeWorkflowRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResumeWorkflowRunRequest(ResumeWorkflowRunRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.FileList != null) {
            this.FileList = new ConversationFileInfo[source.FileList.length];
            for (int i = 0; i < source.FileList.length; i++) {
                this.FileList[i] = new ConversationFileInfo(source.FileList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArrayObj(map, prefix + "FileList.", this.FileList);

    }
}

