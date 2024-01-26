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

public class SubmitIntegrationTaskRequest extends AbstractModel {

    /**
    * 资源组Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 资源所属region
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 资源所属bucket
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 资源所属bucket
    */
    @SerializedName("ResourceBucket")
    @Expose
    private String ResourceBucket;

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 高级运行临时参数
    */
    @SerializedName("RunParams")
    @Expose
    private String RunParams;

    /**
     * Get 资源组Id 
     * @return GroupId 资源组Id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 资源组Id
     * @param GroupId 资源组Id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 资源所属region 
     * @return ResourceRegion 资源所属region
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所属region
     * @param ResourceRegion 资源所属region
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 资源所属bucket 
     * @return RemotePath 资源所属bucket
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set 资源所属bucket
     * @param RemotePath 资源所属bucket
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 资源所属bucket 
     * @return ResourceBucket 资源所属bucket
     */
    public String getResourceBucket() {
        return this.ResourceBucket;
    }

    /**
     * Set 资源所属bucket
     * @param ResourceBucket 资源所属bucket
     */
    public void setResourceBucket(String ResourceBucket) {
        this.ResourceBucket = ResourceBucket;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 高级运行临时参数 
     * @return RunParams 高级运行临时参数
     */
    public String getRunParams() {
        return this.RunParams;
    }

    /**
     * Set 高级运行临时参数
     * @param RunParams 高级运行临时参数
     */
    public void setRunParams(String RunParams) {
        this.RunParams = RunParams;
    }

    public SubmitIntegrationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitIntegrationTaskRequest(SubmitIntegrationTaskRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ResourceBucket != null) {
            this.ResourceBucket = new String(source.ResourceBucket);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.RunParams != null) {
            this.RunParams = new String(source.RunParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ResourceBucket", this.ResourceBucket);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "RunParams", this.RunParams);

    }
}

