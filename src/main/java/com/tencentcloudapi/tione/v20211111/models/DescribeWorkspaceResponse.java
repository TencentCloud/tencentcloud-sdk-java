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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkspaceResponse extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>运行中的任务信息</p>
    */
    @SerializedName("RunningTasks")
    @Expose
    private WorkspaceTaskInfo [] RunningTasks;

    /**
    * <p>空间创建人信息</p>
    */
    @SerializedName("Creator")
    @Expose
    private UserBriefInfo Creator;

    /**
    * <p>当前空间拥有的角色信息</p>
    */
    @SerializedName("OwnedRoles")
    @Expose
    private RoleBriefInfo [] OwnedRoles;

    /**
    * <p>空间成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberInfo")
    @Expose
    private MemberInfo MemberInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>项目ID</p> 
     * @return TiProjectId <p>项目ID</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param TiProjectId <p>项目ID</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>运行中的任务信息</p> 
     * @return RunningTasks <p>运行中的任务信息</p>
     */
    public WorkspaceTaskInfo [] getRunningTasks() {
        return this.RunningTasks;
    }

    /**
     * Set <p>运行中的任务信息</p>
     * @param RunningTasks <p>运行中的任务信息</p>
     */
    public void setRunningTasks(WorkspaceTaskInfo [] RunningTasks) {
        this.RunningTasks = RunningTasks;
    }

    /**
     * Get <p>空间创建人信息</p> 
     * @return Creator <p>空间创建人信息</p>
     */
    public UserBriefInfo getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>空间创建人信息</p>
     * @param Creator <p>空间创建人信息</p>
     */
    public void setCreator(UserBriefInfo Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>当前空间拥有的角色信息</p> 
     * @return OwnedRoles <p>当前空间拥有的角色信息</p>
     */
    public RoleBriefInfo [] getOwnedRoles() {
        return this.OwnedRoles;
    }

    /**
     * Set <p>当前空间拥有的角色信息</p>
     * @param OwnedRoles <p>当前空间拥有的角色信息</p>
     */
    public void setOwnedRoles(RoleBriefInfo [] OwnedRoles) {
        this.OwnedRoles = OwnedRoles;
    }

    /**
     * Get <p>空间成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberInfo <p>空间成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemberInfo getMemberInfo() {
        return this.MemberInfo;
    }

    /**
     * Set <p>空间成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberInfo <p>空间成员信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberInfo(MemberInfo MemberInfo) {
        this.MemberInfo = MemberInfo;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeWorkspaceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkspaceResponse(DescribeWorkspaceResponse source) {
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RunningTasks != null) {
            this.RunningTasks = new WorkspaceTaskInfo[source.RunningTasks.length];
            for (int i = 0; i < source.RunningTasks.length; i++) {
                this.RunningTasks[i] = new WorkspaceTaskInfo(source.RunningTasks[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new UserBriefInfo(source.Creator);
        }
        if (source.OwnedRoles != null) {
            this.OwnedRoles = new RoleBriefInfo[source.OwnedRoles.length];
            for (int i = 0; i < source.OwnedRoles.length; i++) {
                this.OwnedRoles[i] = new RoleBriefInfo(source.OwnedRoles[i]);
            }
        }
        if (source.MemberInfo != null) {
            this.MemberInfo = new MemberInfo(source.MemberInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "RunningTasks.", this.RunningTasks);
        this.setParamObj(map, prefix + "Creator.", this.Creator);
        this.setParamArrayObj(map, prefix + "OwnedRoles.", this.OwnedRoles);
        this.setParamObj(map, prefix + "MemberInfo.", this.MemberInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

