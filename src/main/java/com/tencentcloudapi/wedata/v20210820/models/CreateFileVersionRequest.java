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

public class CreateFileVersionRequest extends AbstractModel {

    /**
    * 脚本资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 版本创建时间，ISO8601格式
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 版本创建人姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 文件远程存储路径
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * 文件在对象存储的地域
    */
    @SerializedName("ObjectRegion")
    @Expose
    private String ObjectRegion;

    /**
    * 文件在对象存储的桶名
    */
    @SerializedName("ObjectBucketName")
    @Expose
    private String ObjectBucketName;

    /**
    * 请求来源，WEB 前端；CLIENT 客户端
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * 版本变更描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 编排空间提交版本的任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 编排空间提交版本的任务版本累加号
    */
    @SerializedName("TaskVersionNum")
    @Expose
    private String TaskVersionNum;

    /**
    * 编排空间提交版本的任务版本id,格式yyyyMMddHHmmssSSS
    */
    @SerializedName("TaskVersionId")
    @Expose
    private String TaskVersionId;

    /**
     * Get 脚本资源id 
     * @return ResourceId 脚本资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 脚本资源id
     * @param ResourceId 脚本资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 版本创建时间，ISO8601格式 
     * @return CreateTime 版本创建时间，ISO8601格式
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 版本创建时间，ISO8601格式
     * @param CreateTime 版本创建时间，ISO8601格式
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 版本创建人姓名 
     * @return UserName 版本创建人姓名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 版本创建人姓名
     * @param UserName 版本创建人姓名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
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
     * Get 文件远程存储路径 
     * @return RemotePath 文件远程存储路径
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set 文件远程存储路径
     * @param RemotePath 文件远程存储路径
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get 文件在对象存储的地域 
     * @return ObjectRegion 文件在对象存储的地域
     */
    public String getObjectRegion() {
        return this.ObjectRegion;
    }

    /**
     * Set 文件在对象存储的地域
     * @param ObjectRegion 文件在对象存储的地域
     */
    public void setObjectRegion(String ObjectRegion) {
        this.ObjectRegion = ObjectRegion;
    }

    /**
     * Get 文件在对象存储的桶名 
     * @return ObjectBucketName 文件在对象存储的桶名
     */
    public String getObjectBucketName() {
        return this.ObjectBucketName;
    }

    /**
     * Set 文件在对象存储的桶名
     * @param ObjectBucketName 文件在对象存储的桶名
     */
    public void setObjectBucketName(String ObjectBucketName) {
        this.ObjectBucketName = ObjectBucketName;
    }

    /**
     * Get 请求来源，WEB 前端；CLIENT 客户端 
     * @return RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set 请求来源，WEB 前端；CLIENT 客户端
     * @param RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
    }

    /**
     * Get 版本变更描述 
     * @return Description 版本变更描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本变更描述
     * @param Description 版本变更描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 编排空间提交版本的任务id 
     * @return TaskId 编排空间提交版本的任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 编排空间提交版本的任务id
     * @param TaskId 编排空间提交版本的任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 编排空间提交版本的任务版本累加号 
     * @return TaskVersionNum 编排空间提交版本的任务版本累加号
     */
    public String getTaskVersionNum() {
        return this.TaskVersionNum;
    }

    /**
     * Set 编排空间提交版本的任务版本累加号
     * @param TaskVersionNum 编排空间提交版本的任务版本累加号
     */
    public void setTaskVersionNum(String TaskVersionNum) {
        this.TaskVersionNum = TaskVersionNum;
    }

    /**
     * Get 编排空间提交版本的任务版本id,格式yyyyMMddHHmmssSSS 
     * @return TaskVersionId 编排空间提交版本的任务版本id,格式yyyyMMddHHmmssSSS
     */
    public String getTaskVersionId() {
        return this.TaskVersionId;
    }

    /**
     * Set 编排空间提交版本的任务版本id,格式yyyyMMddHHmmssSSS
     * @param TaskVersionId 编排空间提交版本的任务版本id,格式yyyyMMddHHmmssSSS
     */
    public void setTaskVersionId(String TaskVersionId) {
        this.TaskVersionId = TaskVersionId;
    }

    public CreateFileVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileVersionRequest(CreateFileVersionRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
        if (source.ObjectRegion != null) {
            this.ObjectRegion = new String(source.ObjectRegion);
        }
        if (source.ObjectBucketName != null) {
            this.ObjectBucketName = new String(source.ObjectBucketName);
        }
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskVersionNum != null) {
            this.TaskVersionNum = new String(source.TaskVersionNum);
        }
        if (source.TaskVersionId != null) {
            this.TaskVersionId = new String(source.TaskVersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "ObjectRegion", this.ObjectRegion);
        this.setParamSimple(map, prefix + "ObjectBucketName", this.ObjectBucketName);
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskVersionNum", this.TaskVersionNum);
        this.setParamSimple(map, prefix + "TaskVersionId", this.TaskVersionId);

    }
}

