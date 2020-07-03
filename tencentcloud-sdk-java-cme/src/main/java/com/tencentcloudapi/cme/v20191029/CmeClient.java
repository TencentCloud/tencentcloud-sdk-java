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
package com.tencentcloudapi.cme.v20191029;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cme.v20191029.models.*;

public class CmeClient extends AbstractClient{
    private static String endpoint = "cme.tencentcloudapi.com";
    private static String version = "2019-10-29";

    public CmeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CmeClient(Credential credential, String region, ClientProfile profile) {
        super(CmeClient.endpoint, CmeClient.version, credential, region, profile);
    }

    /**
     *向一个团队中团队成员，并且指定成员的角色。
     * @param req AddTeamMemberRequest
     * @return AddTeamMemberResponse
     * @throws TencentCloudSDKException
     */
    public AddTeamMemberResponse AddTeamMember(AddTeamMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddTeamMemberResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddTeamMemberResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddTeamMember"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增分类，用于管理素材。
<li>分类层数不能超过10；</li>
<li>子分类数不能超过10。</li>
     * @param req CreateClassRequest
     * @return CreateClassResponse
     * @throws TencentCloudSDKException
     */
    public CreateClassResponse CreateClass(CreateClassRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClassResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClassResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateClass"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 创建素材链接或分类路径链接，将源资源信息链接到目标。
     * @param req CreateLinkRequest
     * @return CreateLinkResponse
     * @throws TencentCloudSDKException
     */
    public CreateLinkResponse CreateLink(CreateLinkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLinkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLinkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLink"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建云剪的编辑项目，支持创建视频剪辑及直播剪辑两大类项目。

     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建一个团队。
     * @param req CreateTeamRequest
     * @return CreateTeamResponse
     * @throws TencentCloudSDKException
     */
    public CreateTeamResponse CreateTeam(CreateTeamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTeamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTeamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTeam"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除分类信息，删除时检验下述限制：
<li>分类路径必须存在；</li>
<li>分类下没有绑定素材。</li>
     * @param req DeleteClassRequest
     * @return DeleteClassResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClassResponse DeleteClass(DeleteClassRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClassResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClassResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteClass"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户登录态，使用户登出云剪平台。
     * @param req DeleteLoginStatusRequest
     * @return DeleteLoginStatusResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoginStatusResponse DeleteLoginStatus(DeleteLoginStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoginStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLoginStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLoginStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据素材 Id 删除素材。
     * @param req DeleteMaterialRequest
     * @return DeleteMaterialResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMaterialResponse DeleteMaterial(DeleteMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMaterialResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMaterialResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteMaterial"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除云剪编辑项目。
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个团队。
<li>要删除的团队必须没有归属的素材；</li>
<li>要删除的团队必须没有归属的分类。</li>
     * @param req DeleteTeamRequest
     * @return DeleteTeamResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTeamResponse DeleteTeam(DeleteTeamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTeamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTeamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTeam"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将团队成员从团队中删除，默认只有 Owner 及管理员才有此权限。
     * @param req DeleteTeamMembersRequest
     * @return DeleteTeamMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTeamMembersResponse DeleteTeamMembers(DeleteTeamMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTeamMembersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTeamMembersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTeamMembers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定归属者下所有的分类信息。
     * @param req DescribeClassRequest
     * @return DescribeClassResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassResponse DescribeClass(DescribeClassRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeClass"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定的团队成员所加入的团队列表。
     * @param req DescribeJoinTeamsRequest
     * @return DescribeJoinTeamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJoinTeamsResponse DescribeJoinTeams(DescribeJoinTeamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJoinTeamsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJoinTeamsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeJoinTeams"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定用户的登录态。
     * @param req DescribeLoginStatusRequest
     * @return DescribeLoginStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginStatusResponse DescribeLoginStatus(DescribeLoginStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoginStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoginStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLoginStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据素材 Id 批量获取素材详情。
     * @param req DescribeMaterialsRequest
     * @return DescribeMaterialsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaterialsResponse DescribeMaterials(DescribeMaterialsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMaterialsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMaterialsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMaterials"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持根据多种条件过滤出项目列表。
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProjects"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定资源的授权列表。
     * @param req DescribeResourceAuthorizationRequest
     * @return DescribeResourceAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceAuthorizationResponse DescribeResourceAuthorization(DescribeResourceAuthorizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceAuthorizationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceAuthorizationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeResourceAuthorization"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取共享空间。当实体A对实体B授权某资源以后，实体B的共享空间就会增加实体A。
     * @param req DescribeSharedSpaceRequest
     * @return DescribeSharedSpaceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSharedSpaceResponse DescribeSharedSpace(DescribeSharedSpaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSharedSpaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSharedSpaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSharedSpace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取任务详情信息，包含下面几个部分：
<li>任务基础信息：包括任务状态、错误信息、创建时间等；</li>
<li>导出项目输出信息：包括输出的素材 Id 等。</li>
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取任务列表，支持条件筛选，返回对应的任务基础信息列表。
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定成员 ID 的信息，同时支持拉取所有团队成员信息。
     * @param req DescribeTeamMembersRequest
     * @return DescribeTeamMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTeamMembersResponse DescribeTeamMembers(DescribeTeamMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTeamMembersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTeamMembersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTeamMembers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定团队的信息。
     * @param req DescribeTeamsRequest
     * @return DescribeTeamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTeamsResponse DescribeTeams(DescribeTeamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTeamsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTeamsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTeams"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用在线编辑轨道数据直接导出视频。
     * @param req ExportVideoByEditorTrackDataRequest
     * @return ExportVideoByEditorTrackDataResponse
     * @throws TencentCloudSDKException
     */
    public ExportVideoByEditorTrackDataResponse ExportVideoByEditorTrackData(ExportVideoByEditorTrackDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVideoByEditorTrackDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ExportVideoByEditorTrackDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ExportVideoByEditorTrackData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出视频编辑项目，支持指定输出的模板。
     * @param req ExportVideoEditProjectRequest
     * @return ExportVideoEditProjectResponse
     * @throws TencentCloudSDKException
     */
    public ExportVideoEditProjectResponse ExportVideoEditProject(ExportVideoEditProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExportVideoEditProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ExportVideoEditProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ExportVideoEditProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *平铺分类路径下及其子分类下的所有素材。
     * @param req FlattenListMediaRequest
     * @return FlattenListMediaResponse
     * @throws TencentCloudSDKException
     */
    public FlattenListMediaResponse FlattenListMedia(FlattenListMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FlattenListMediaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<FlattenListMediaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "FlattenListMedia"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资源所属实体对目标实体授予目标资源的相应权限。
     * @param req GrantResourceAuthorizationRequest
     * @return GrantResourceAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public GrantResourceAuthorizationResponse GrantResourceAuthorization(GrantResourceAuthorizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GrantResourceAuthorizationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GrantResourceAuthorizationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GrantResourceAuthorization"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将云点播媒资文件导入到云剪素材库。
     * @param req ImportMaterialRequest
     * @return ImportMaterialResponse
     * @throws TencentCloudSDKException
     */
    public ImportMaterialResponse ImportMaterial(ImportMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportMaterialResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ImportMaterialResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ImportMaterial"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将云点播中的媒资添加到素材库中，供后续视频编辑使用。
     * @param req ImportMediaToProjectRequest
     * @return ImportMediaToProjectResponse
     * @throws TencentCloudSDKException
     */
    public ImportMediaToProjectResponse ImportMediaToProject(ImportMediaToProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportMediaToProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ImportMediaToProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ImportMediaToProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 浏览当前分类路径下的资源，包括素材和子分类。
     * @param req ListMediaRequest
     * @return ListMediaResponse
     * @throws TencentCloudSDKException
     */
    public ListMediaResponse ListMedia(ListMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListMediaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListMediaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListMedia"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改素材信息，支持修改素材名称、分类路径、标签等信息。
     * @param req ModifyMaterialRequest
     * @return ModifyMaterialResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaterialResponse ModifyMaterial(ModifyMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMaterialResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMaterialResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyMaterial"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改云剪编辑项目的信息。
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改团队信息，目前支持修改的操作有：
<li>修改团队名称。</li>
     * @param req ModifyTeamRequest
     * @return ModifyTeamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTeamResponse ModifyTeam(ModifyTeamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTeamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTeamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTeam"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改团队成员信息，包括成员备注、角色等。
     * @param req ModifyTeamMemberRequest
     * @return ModifyTeamMemberResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTeamMemberResponse ModifyTeamMember(ModifyTeamMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTeamMemberResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTeamMemberResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTeamMember"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *移动某一个分类到另外一个分类下，也可用于分类重命名。
<li>如果 SourceClassPath = /素材/视频/NBA，DestinationClassPath = /素材/视频/篮球，当 DestinationClassPath 不存在时候，操作结果为重命名 ClassPath，如果 DestinationClassPath 存在时候，操作结果为产生新目录 /素材/视频/篮球/NBA。</li>
     * @param req MoveClassRequest
     * @return MoveClassResponse
     * @throws TencentCloudSDKException
     */
    public MoveClassResponse MoveClass(MoveClassRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MoveClassResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MoveClassResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MoveClass"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 资源所属实体对目标实体回收目标资源的相应权限，若原本没有相应权限则不产生变更。
     * @param req RevokeResourceAuthorizationRequest
     * @return RevokeResourceAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public RevokeResourceAuthorizationResponse RevokeResourceAuthorization(RevokeResourceAuthorizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RevokeResourceAuthorizationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RevokeResourceAuthorizationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RevokeResourceAuthorization"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据检索条件搜索素材，返回素材的基本信息。
     * @param req SearchMaterialRequest
     * @return SearchMaterialResponse
     * @throws TencentCloudSDKException
     */
    public SearchMaterialResponse SearchMaterial(SearchMaterialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchMaterialResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchMaterialResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchMaterial"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
