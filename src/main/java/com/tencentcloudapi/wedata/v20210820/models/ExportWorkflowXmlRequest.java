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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportWorkflowXmlRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowIds")
    @Expose
    private String [] WorkflowIds;

    /**
    * 跨域访问域名，文件存储在共享存储中，跨域下载会出现跨域访问失败问题，如果是跨域请求，请填写该值
    */
    @SerializedName("OriginDomain")
    @Expose
    private String OriginDomain;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 工作流ID 
     * @return WorkflowIds 工作流ID
     */
    public String [] getWorkflowIds() {
        return this.WorkflowIds;
    }

    /**
     * Set 工作流ID
     * @param WorkflowIds 工作流ID
     */
    public void setWorkflowIds(String [] WorkflowIds) {
        this.WorkflowIds = WorkflowIds;
    }

    /**
     * Get 跨域访问域名，文件存储在共享存储中，跨域下载会出现跨域访问失败问题，如果是跨域请求，请填写该值 
     * @return OriginDomain 跨域访问域名，文件存储在共享存储中，跨域下载会出现跨域访问失败问题，如果是跨域请求，请填写该值
     */
    public String getOriginDomain() {
        return this.OriginDomain;
    }

    /**
     * Set 跨域访问域名，文件存储在共享存储中，跨域下载会出现跨域访问失败问题，如果是跨域请求，请填写该值
     * @param OriginDomain 跨域访问域名，文件存储在共享存储中，跨域下载会出现跨域访问失败问题，如果是跨域请求，请填写该值
     */
    public void setOriginDomain(String OriginDomain) {
        this.OriginDomain = OriginDomain;
    }

    public ExportWorkflowXmlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportWorkflowXmlRequest(ExportWorkflowXmlRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowIds != null) {
            this.WorkflowIds = new String[source.WorkflowIds.length];
            for (int i = 0; i < source.WorkflowIds.length; i++) {
                this.WorkflowIds[i] = new String(source.WorkflowIds[i]);
            }
        }
        if (source.OriginDomain != null) {
            this.OriginDomain = new String(source.OriginDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "WorkflowIds.", this.WorkflowIds);
        this.setParamSimple(map, prefix + "OriginDomain", this.OriginDomain);

    }
}

