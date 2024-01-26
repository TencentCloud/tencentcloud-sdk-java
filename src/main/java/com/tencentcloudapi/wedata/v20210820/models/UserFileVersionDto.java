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

public class UserFileVersionDto extends AbstractModel {

    /**
    * id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 版本id,格式yyyyMMddHHmmssSSS
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 脚本资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 版本创建时间，ISO8601格式
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 版本变更描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 编排空间提交版本的任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 编排空间提交版本的任务版本累加号，如V3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskVersionNum")
    @Expose
    private String TaskVersionNum;

    /**
    * 编排空间提交版本的任务版本id，,格式yyyyMMddHHmmssSSS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskVersionId")
    @Expose
    private String TaskVersionId;

    /**
    * 版本创建人姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 版本创建人uin
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 主账号uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 租户id
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 文件远程存储路径
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * 文件在对象存储的地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectRegion")
    @Expose
    private String ObjectRegion;

    /**
    * 文件在对象存储的桶名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectBucketName")
    @Expose
    private String ObjectBucketName;

    /**
     * Get id 
     * @return Id id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
     * @param Id id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 版本id,格式yyyyMMddHHmmssSSS 
     * @return VersionId 版本id,格式yyyyMMddHHmmssSSS
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本id,格式yyyyMMddHHmmssSSS
     * @param VersionId 版本id,格式yyyyMMddHHmmssSSS
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

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
     * Get 版本名称 
     * @return VersionName 版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称
     * @param VersionName 版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 编排空间提交版本的任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 编排空间提交版本的任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 编排空间提交版本的任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 编排空间提交版本的任务版本累加号，如V3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskVersionNum 编排空间提交版本的任务版本累加号，如V3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskVersionNum() {
        return this.TaskVersionNum;
    }

    /**
     * Set 编排空间提交版本的任务版本累加号，如V3
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskVersionNum 编排空间提交版本的任务版本累加号，如V3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskVersionNum(String TaskVersionNum) {
        this.TaskVersionNum = TaskVersionNum;
    }

    /**
     * Get 编排空间提交版本的任务版本id，,格式yyyyMMddHHmmssSSS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskVersionId 编排空间提交版本的任务版本id，,格式yyyyMMddHHmmssSSS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskVersionId() {
        return this.TaskVersionId;
    }

    /**
     * Set 编排空间提交版本的任务版本id，,格式yyyyMMddHHmmssSSS
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskVersionId 编排空间提交版本的任务版本id，,格式yyyyMMddHHmmssSSS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskVersionId(String TaskVersionId) {
        this.TaskVersionId = TaskVersionId;
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
     * Get 版本创建人uin 
     * @return UserUin 版本创建人uin
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 版本创建人uin
     * @param UserUin 版本创建人uin
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 主账号uin 
     * @return OwnerUin 主账号uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号uin
     * @param OwnerUin 主账号uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
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
     * Get 租户id 
     * @return AppId 租户id
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户id
     * @param AppId 租户id
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectRegion 文件在对象存储的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectRegion() {
        return this.ObjectRegion;
    }

    /**
     * Set 文件在对象存储的地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectRegion 文件在对象存储的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectRegion(String ObjectRegion) {
        this.ObjectRegion = ObjectRegion;
    }

    /**
     * Get 文件在对象存储的桶名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectBucketName 文件在对象存储的桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectBucketName() {
        return this.ObjectBucketName;
    }

    /**
     * Set 文件在对象存储的桶名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectBucketName 文件在对象存储的桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectBucketName(String ObjectBucketName) {
        this.ObjectBucketName = ObjectBucketName;
    }

    public UserFileVersionDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserFileVersionDto(UserFileVersionDto source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskVersionNum", this.TaskVersionNum);
        this.setParamSimple(map, prefix + "TaskVersionId", this.TaskVersionId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "ObjectRegion", this.ObjectRegion);
        this.setParamSimple(map, prefix + "ObjectBucketName", this.ObjectBucketName);

    }
}

