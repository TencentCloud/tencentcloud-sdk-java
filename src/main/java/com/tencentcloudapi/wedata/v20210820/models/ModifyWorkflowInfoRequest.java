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

public class ModifyWorkflowInfoRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 责任人
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 责任人id
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * 备注
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * 工作流名称
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 所属文件夹id
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 工作流所属用户分组id  若有多个,分号隔开: a;b;c
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * 工作流所属用户分组名称  若有多个,分号隔开: a;b;c
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

    /**
    * 工作流参数列表
    */
    @SerializedName("WorkflowParams")
    @Expose
    private ParamInfo [] WorkflowParams;

    /**
    * 用于配置优化参数（线程、内存、CPU核数等），仅作用于Spark SQL节点。多个参数用英文分号分隔。
    */
    @SerializedName("GeneralTaskParams")
    @Expose
    private GeneralTaskParam [] GeneralTaskParams;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 工作流id 
     * @return WorkflowId 工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
     * @param WorkflowId 工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 责任人 
     * @return Owner 责任人
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 责任人
     * @param Owner 责任人
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 责任人id 
     * @return OwnerId 责任人id
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set 责任人id
     * @param OwnerId 责任人id
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get 备注 
     * @return WorkflowDesc 备注
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set 备注
     * @param WorkflowDesc 备注
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get 工作流名称 
     * @return WorkflowName 工作流名称
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
     * @param WorkflowName 工作流名称
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 所属文件夹id 
     * @return FolderId 所属文件夹id
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 所属文件夹id
     * @param FolderId 所属文件夹id
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 工作流所属用户分组id  若有多个,分号隔开: a;b;c 
     * @return UserGroupId 工作流所属用户分组id  若有多个,分号隔开: a;b;c
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set 工作流所属用户分组id  若有多个,分号隔开: a;b;c
     * @param UserGroupId 工作流所属用户分组id  若有多个,分号隔开: a;b;c
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get 工作流所属用户分组名称  若有多个,分号隔开: a;b;c 
     * @return UserGroupName 工作流所属用户分组名称  若有多个,分号隔开: a;b;c
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set 工作流所属用户分组名称  若有多个,分号隔开: a;b;c
     * @param UserGroupName 工作流所属用户分组名称  若有多个,分号隔开: a;b;c
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
    }

    /**
     * Get 工作流参数列表 
     * @return WorkflowParams 工作流参数列表
     */
    public ParamInfo [] getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set 工作流参数列表
     * @param WorkflowParams 工作流参数列表
     */
    public void setWorkflowParams(ParamInfo [] WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get 用于配置优化参数（线程、内存、CPU核数等），仅作用于Spark SQL节点。多个参数用英文分号分隔。 
     * @return GeneralTaskParams 用于配置优化参数（线程、内存、CPU核数等），仅作用于Spark SQL节点。多个参数用英文分号分隔。
     */
    public GeneralTaskParam [] getGeneralTaskParams() {
        return this.GeneralTaskParams;
    }

    /**
     * Set 用于配置优化参数（线程、内存、CPU核数等），仅作用于Spark SQL节点。多个参数用英文分号分隔。
     * @param GeneralTaskParams 用于配置优化参数（线程、内存、CPU核数等），仅作用于Spark SQL节点。多个参数用英文分号分隔。
     */
    public void setGeneralTaskParams(GeneralTaskParam [] GeneralTaskParams) {
        this.GeneralTaskParams = GeneralTaskParams;
    }

    public ModifyWorkflowInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWorkflowInfoRequest(ModifyWorkflowInfoRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.UserGroupName != null) {
            this.UserGroupName = new String(source.UserGroupName);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new ParamInfo[source.WorkflowParams.length];
            for (int i = 0; i < source.WorkflowParams.length; i++) {
                this.WorkflowParams[i] = new ParamInfo(source.WorkflowParams[i]);
            }
        }
        if (source.GeneralTaskParams != null) {
            this.GeneralTaskParams = new GeneralTaskParam[source.GeneralTaskParams.length];
            for (int i = 0; i < source.GeneralTaskParams.length; i++) {
                this.GeneralTaskParams[i] = new GeneralTaskParam(source.GeneralTaskParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "UserGroupName", this.UserGroupName);
        this.setParamArrayObj(map, prefix + "WorkflowParams.", this.WorkflowParams);
        this.setParamArrayObj(map, prefix + "GeneralTaskParams.", this.GeneralTaskParams);

    }
}

