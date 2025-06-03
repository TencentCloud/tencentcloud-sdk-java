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
    private static String service = "cme";
    private static String version = "2019-10-29";
    
    public CmeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CmeClient(Credential credential, String region, ClientProfile profile) {
        super(CmeClient.endpoint, CmeClient.version, credential, region, profile);
    }

    /**
     *向一个团队中添加团队成员，并且指定成员的角色。
     * @param req AddTeamMemberRequest
     * @return AddTeamMemberResponse
     * @throws TencentCloudSDKException
     */
    public AddTeamMemberResponse AddTeamMember(AddTeamMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddTeamMember", AddTeamMemberResponse.class);
    }

    /**
     *复制一个项目，包括项目素材及轨道数据。目前仅普通剪辑及模板制作项目可复制，其它类型的项目不支持复制。
     * @param req CopyProjectRequest
     * @return CopyProjectResponse
     * @throws TencentCloudSDKException
     */
    public CopyProjectResponse CopyProject(CopyProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyProject", CopyProjectResponse.class);
    }

    /**
     *新增分类，用于管理素材。分类层数不能超过20。
     * @param req CreateClassRequest
     * @return CreateClassResponse
     * @throws TencentCloudSDKException
     */
    public CreateClassResponse CreateClass(CreateClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClass", CreateClassResponse.class);
    }

    /**
     *创建媒体链接或分类路径链接，将资源信息链接到目标。
     * @param req CreateLinkRequest
     * @return CreateLinkResponse
     * @throws TencentCloudSDKException
     */
    public CreateLinkResponse CreateLink(CreateLinkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLink", CreateLinkResponse.class);
    }

    /**
     *创建多媒体创作引擎项目，目前支持的项目类型有：
<li>视频剪辑项目：用于普通视频剪辑；</li>
<li>直播剪辑项目：用于直播流剪辑；</li>
<li>导播台项目：用于云导播台；</li>
<li>视频拆条：用于视频拆条；</li>
<li>录制回放项目：用于直播录制回放；</li>
<li>媒体转推项目：用于媒体文件转直播输出。</li>
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *创建一个团队。
     * @param req CreateTeamRequest
     * @return CreateTeamResponse
     * @throws TencentCloudSDKException
     */
    public CreateTeamResponse CreateTeam(CreateTeamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTeam", CreateTeamResponse.class);
    }

    /**
     *指定导出的参数，创建一个视频编码配置
     * @param req CreateVideoEncodingPresetRequest
     * @return CreateVideoEncodingPresetResponse
     * @throws TencentCloudSDKException
     */
    public CreateVideoEncodingPresetResponse CreateVideoEncodingPreset(CreateVideoEncodingPresetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVideoEncodingPreset", CreateVideoEncodingPresetResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClass", DeleteClassResponse.class);
    }

    /**
     *删除用户登录态，使用户登出多媒体创作引擎平台。
     * @param req DeleteLoginStatusRequest
     * @return DeleteLoginStatusResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoginStatusResponse DeleteLoginStatus(DeleteLoginStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoginStatus", DeleteLoginStatusResponse.class);
    }

    /**
     *根据媒体 Id 删除媒体。
     * @param req DeleteMaterialRequest
     * @return DeleteMaterialResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMaterialResponse DeleteMaterial(DeleteMaterialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMaterial", DeleteMaterialResponse.class);
    }

    /**
     *删除项目。处于推流状态的云转推和点播转直播项目不允许删除，若强行调用删除项目接口会返回失败。
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProject", DeleteProjectResponse.class);
    }

    /**
     *删除一个团队。要删除团队，必须满足以下条件：
<li>要删除的团队必须没有归属的素材；</li>
<li>要删除的团队必须没有归属的分类。</li>
     * @param req DeleteTeamRequest
     * @return DeleteTeamResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTeamResponse DeleteTeam(DeleteTeamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTeam", DeleteTeamResponse.class);
    }

    /**
     *将团队成员从团队中删除。
     * @param req DeleteTeamMembersRequest
     * @return DeleteTeamMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTeamMembersResponse DeleteTeamMembers(DeleteTeamMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTeamMembers", DeleteTeamMembersResponse.class);
    }

    /**
     *删除指定 ID 的视频编码配置
     * @param req DeleteVideoEncodingPresetRequest
     * @return DeleteVideoEncodingPresetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVideoEncodingPresetResponse DeleteVideoEncodingPreset(DeleteVideoEncodingPresetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVideoEncodingPreset", DeleteVideoEncodingPresetResponse.class);
    }

    /**
     *获取平台中所有的已注册账号。
     * @param req DescribeAccountsRequest
     * @return DescribeAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountsResponse DescribeAccounts(DescribeAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccounts", DescribeAccountsResponse.class);
    }

    /**
     *获取指定归属者下所有的分类信息。
     * @param req DescribeClassRequest
     * @return DescribeClassResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassResponse DescribeClass(DescribeClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClass", DescribeClassResponse.class);
    }

    /**
     *获取用户所加入的团队列表
     * @param req DescribeJoinTeamsRequest
     * @return DescribeJoinTeamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJoinTeamsResponse DescribeJoinTeams(DescribeJoinTeamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJoinTeams", DescribeJoinTeamsResponse.class);
    }

    /**
     *查询指定用户的登录态。
     * @param req DescribeLoginStatusRequest
     * @return DescribeLoginStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginStatusResponse DescribeLoginStatus(DescribeLoginStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoginStatus", DescribeLoginStatusResponse.class);
    }

    /**
     *根据媒体 Id 批量获取媒体详情。
     * @param req DescribeMaterialsRequest
     * @return DescribeMaterialsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaterialsResponse DescribeMaterials(DescribeMaterialsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaterials", DescribeMaterialsResponse.class);
    }

    /**
     *<li>支持获取所创建的所有平台列表信息；</li>
<li>支持获取指定的平台列表信息。</li>

关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     * @param req DescribePlatformsRequest
     * @return DescribePlatformsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlatformsResponse DescribePlatforms(DescribePlatformsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlatforms", DescribePlatformsResponse.class);
    }

    /**
     *支持根据多种条件过滤出项目列表。
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjects", DescribeProjectsResponse.class);
    }

    /**
     *查询资源被授权的情况。
     * @param req DescribeResourceAuthorizationRequest
     * @return DescribeResourceAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceAuthorizationResponse DescribeResourceAuthorization(DescribeResourceAuthorizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceAuthorization", DescribeResourceAuthorizationResponse.class);
    }

    /**
     *获取共享空间。当个人或团队A对个人或团队B授权某资源以后，个人或团队B的共享空间就会增加个人或团队A。
     * @param req DescribeSharedSpaceRequest
     * @return DescribeSharedSpaceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSharedSpaceResponse DescribeSharedSpace(DescribeSharedSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSharedSpace", DescribeSharedSpaceResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskDetail", DescribeTaskDetailResponse.class);
    }

    /**
     *获取任务列表，支持条件筛选，返回对应的任务基础信息列表。
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
    }

    /**
     *获取指定团队的成员信息。支持获取指定成员的信息，同时也支持分页拉取指定团队的所有成员信息。
     * @param req DescribeTeamMembersRequest
     * @return DescribeTeamMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTeamMembersResponse DescribeTeamMembers(DescribeTeamMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTeamMembers", DescribeTeamMembersResponse.class);
    }

    /**
     *获取指定团队的信息，拉取团队信息列表。
     * @param req DescribeTeamsRequest
     * @return DescribeTeamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTeamsResponse DescribeTeams(DescribeTeamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTeams", DescribeTeamsResponse.class);
    }

    /**
     *查询视频编码配置信息。
     * @param req DescribeVideoEncodingPresetsRequest
     * @return DescribeVideoEncodingPresetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoEncodingPresetsResponse DescribeVideoEncodingPresets(DescribeVideoEncodingPresetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoEncodingPresets", DescribeVideoEncodingPresetsResponse.class);
    }

    /**
     *使用 [视频合成协议](https://cloud.tencent.com/document/product/1156/51225) 合成视频，支持导出视频到 CME 云媒资或者云点播媒资。
     * @param req ExportVideoByEditorTrackDataRequest
     * @return ExportVideoByEditorTrackDataResponse
     * @throws TencentCloudSDKException
     */
    public ExportVideoByEditorTrackDataResponse ExportVideoByEditorTrackData(ExportVideoByEditorTrackDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVideoByEditorTrackData", ExportVideoByEditorTrackDataResponse.class);
    }

    /**
     *使用视频剪辑模板直接导出视频。
     * @param req ExportVideoByTemplateRequest
     * @return ExportVideoByTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ExportVideoByTemplateResponse ExportVideoByTemplate(ExportVideoByTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVideoByTemplate", ExportVideoByTemplateResponse.class);
    }

    /**
     *使用视频智能拆条数据导出视频，将指定的视频拆条片段导出为一个视频(内测中，请勿使用)。
     * @param req ExportVideoByVideoSegmentationDataRequest
     * @return ExportVideoByVideoSegmentationDataResponse
     * @throws TencentCloudSDKException
     */
    public ExportVideoByVideoSegmentationDataResponse ExportVideoByVideoSegmentationData(ExportVideoByVideoSegmentationDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVideoByVideoSegmentationData", ExportVideoByVideoSegmentationDataResponse.class);
    }

    /**
     *导出视频编辑项目，支持指定输出的模板。
     * @param req ExportVideoEditProjectRequest
     * @return ExportVideoEditProjectResponse
     * @throws TencentCloudSDKException
     */
    public ExportVideoEditProjectResponse ExportVideoEditProject(ExportVideoEditProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVideoEditProject", ExportVideoEditProjectResponse.class);
    }

    /**
     *平铺分类路径下及其子分类下的所有媒体基础信息，返回当前分类及子分类中的所有媒体的基础信息。
     * @param req FlattenListMediaRequest
     * @return FlattenListMediaResponse
     * @throws TencentCloudSDKException
     */
    public FlattenListMediaResponse FlattenListMedia(FlattenListMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FlattenListMedia", FlattenListMediaResponse.class);
    }

    /**
     *<li>发起视频智能拆条任务，支持智能生成和平精英集锦、王者荣耀集锦、足球集锦、篮球集锦 、人物集锦、新闻拆条等任务。</li>
<li>和平精英集锦和王者荣耀集锦根据击杀场景进行拆条，足球集锦和篮球集锦根据进球场景进行拆条，人物集锦根据人物人脸特征进行拆条，新闻拆条根据导播进行拆条。</li>
<li>【本接口内测中，暂不建议使用】</li>
     * @param req GenerateVideoSegmentationSchemeByAiRequest
     * @return GenerateVideoSegmentationSchemeByAiResponse
     * @throws TencentCloudSDKException
     */
    public GenerateVideoSegmentationSchemeByAiResponse GenerateVideoSegmentationSchemeByAi(GenerateVideoSegmentationSchemeByAiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateVideoSegmentationSchemeByAi", GenerateVideoSegmentationSchemeByAiResponse.class);
    }

    /**
     *资源归属者对个人或团队授予目标资源的相应权限。
     * @param req GrantResourceAuthorizationRequest
     * @return GrantResourceAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public GrantResourceAuthorizationResponse GrantResourceAuthorization(GrantResourceAuthorizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GrantResourceAuthorization", GrantResourceAuthorizationResponse.class);
    }

    /**
     *对媒体转推项目进行操作。
### 操作类型<a id="Operation"></a>
- `AddSource`（添加输入源），项目状态为 Idle、Working 时均可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B9-.E6.B7.BB.E5.8A.A0.E8.BE.93.E5.85.A5.E6.BA.90)；
- `DeleteSource`（删除输入源），项目状态为 Idle、Working 时均可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B6-.E5.88.A0.E9.99.A4.E8.BE.93.E5.85.A5.E6.BA.90)；
- `SwitchSource`（切换当前播放的输入源），项目状态为 Working 时可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B5-.E5.88.87.E6.8D.A2.E5.BD.93.E5.89.8D.E6.92.AD.E6.94.BE.E7.9A.84.E8.BE.93.E5.85.A5.E6.BA.90)
- `AddDestination`（ 添加输出源），项目状态为 Idle、Working 时均可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B8-.E5.90.AF.E5.8A.A8.E8.BE.93.E5.87.BA.E6.BA.90)；
- `DeleteDestination`（删除输出源），项目状态为 Idle、Working 时均可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B7-.E5.88.A0.E9.99.A4.E8.BE.93.E5.87.BA.E6.BA.90)；
- `EnableDestination`（启动输出源），项目状态为 Working 时可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B8-.E5.90.AF.E5.8A.A8.E8.BE.93.E5.87.BA.E6.BA.90)；
- `DisableDestination`（停止输出源），项目状态为 Working 时可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B4-.E5.81.9C.E6.AD.A2.E8.BE.93.E5.87.BA.E6.BA.90)；
- `ModifyDestination`（修改输出源），项目状态为 Idle、Working 时均可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B2-.E4.BF.AE.E6.94.B9.E8.BE.93.E5.87.BA.E6.BA.90)；
- `Start`（启动媒体转推），项目状态为 Idle 时可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B12-.E5.90.AF.E5.8A.A8.E5.AA.92.E4.BD.93.E8.BD.AC.E6.8E.A8)。发起 Start 请求成功后，媒体转推项目开始启动，30秒内还需要再进行一次 Confirm操作进行确认；
- `Confirm`（确认媒体转推项目启动），项目状态为 Working 时可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B14-.E7.A1.AE.E8.AE.A4.E5.AA.92.E4.BD.93.E8.BD.AC.E6.8E.A8.E9.A1.B9.E7.9B.AE.E5.90.AF.E5.8A.A8)；
- `Stop`（停止媒体转推），项目状态为 Working 时可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B11-.E5.81.9C.E6.AD.A2.E5.AA.92.E4.BD.93.E8.BD.AC.E6.8E.A8)；
- `ModifyOutputMediaSetting`（修改媒体输出配置），项目状态为 Idle 时可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B3-.E4.BF.AE.E6.94.B9.E8.BE.93.E5.87.BA.E7.9A.84.E5.AA.92.E4.BD.93.E9.85.8D.E7.BD.AE)；
- `ModifyPlaySetting`（修改播放结束时间），项目状态为 Idle、Working 时均可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B1-.E4.BF.AE.E6.94.B9.E7.BB.93.E6.9D.9F.E6.97.B6.E9.97.B4);
- `DescribePlayInfo`（查询播放信息），项目状态为 Idle、Working 时均可以操作。参见 [示例](#.E7.A4.BA.E4.BE.8B13-.E6.9F.A5.E8.AF.A2.E5.AA.92.E4.BD.93.E8.BD.AC.E6.8E.A8.E9.A1.B9.E7.9B.AE.E7.9A.84.E6.92.AD.E6.94.BE.E4.BF.A1.E6.81.AF)。
     * @param req HandleMediaCastProjectRequest
     * @return HandleMediaCastProjectResponse
     * @throws TencentCloudSDKException
     */
    public HandleMediaCastProjectResponse HandleMediaCastProject(HandleMediaCastProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HandleMediaCastProject", HandleMediaCastProjectResponse.class);
    }

    /**
     *<font color=red>本接口废弃，可创建媒体转推项目替代，操作媒体转推项目可使用 <b>[HandleMediaCastProject 接口](/document/product/1156/87841) </b>实现。</font>

### 操作类型<a id="Operation"></a>
- `AddInput`（添加输入源），包括：
	- 添加直播拉流输入源，参见 [示例1](#.E7.A4.BA.E4.BE.8B1-.E6.B7.BB.E5.8A.A0.E7.9B.B4.E6.92.AD.E6.8B.89.E6.B5.81.E8.BE.93.E5.85.A5.E6.BA.90)；
	- 添加直播推流输入源，参见 [示例2](#.E7.A4.BA.E4.BE.8B2-.E6.B7.BB.E5.8A.A0.E7.9B.B4.E6.92.AD.E6.8E.A8.E6.B5.81.E8.BE.93.E5.85.A5.E6.BA.90)；
	- 添加点播拉流输入源，参见 [示例3](#.E7.A4.BA.E4.BE.8B3-.E6.B7.BB.E5.8A.A0.E7.82.B9.E6.92.AD.E6.8B.89.E6.B5.81.E8.BE.93.E5.85.A5.E6.BA.90.E4.B8.94.E5.BE.AA.E7.8E.AF.E6.92.AD.E6.94.BE)、[示例4](#.E7.A4.BA.E4.BE.8B4-.E6.B7.BB.E5.8A.A0.E7.82.B9.E6.92.AD.E6.8B.89.E6.B5.81.E8.BE.93.E5.85.A5.E6.BA.90.E4.B8.94.E5.8D.95.E6.AC.A1.E6.92.AD.E6.94.BE)；
- `DeleteInput`（删除输入源），参见 [示例5](#.E7.A4.BA.E4.BE.8B5-.E5.88.A0.E9.99.A4.E8.BE.93.E5.85.A5.E6.BA.90)；
- `ModifyInput`（修改输入源），参见 [示例6](#.E7.A4.BA.E4.BE.8B6-.E4.BF.AE.E6.94.B9.E8.BE.93.E5.85.A5.E6.BA.90)；
- `AddOutput`（ 添加输出源），参见 [示例7](#.E7.A4.BA.E4.BE.8B7-.E6.B7.BB.E5.8A.A0.E8.BE.93.E5.87.BA.E6.BA.90)；
- `DeleteOutput`（删除输出源），参见 [示例8](#.E7.A4.BA.E4.BE.8B8-.E5.88.A0.E9.99.A4.E8.BE.93.E5.87.BA.E6.BA.90)；
- `ModifyOutput`（修改输出源），参见 [示例9](#.E7.A4.BA.E4.BE.8B9-.E4.BF.AE.E6.94.B9.E8.BE.93.E5.87.BA.E6.BA.90)；
- `Start`（开启转推），参见 [示例10](#.E7.A4.BA.E4.BE.8B10-.E5.BC.80.E5.90.AF.E4.BA.91.E8.BD.AC.E6.8E.A8)；
- `Stop`（停止转推），参见 [示例11](#.E7.A4.BA.E4.BE.8B11-.E5.81.9C.E6.AD.A2.E4.BA.91.E8.BD.AC.E6.8E.A8)；
- `SwitchInput`（切换输入源），参见 [示例12](#.E7.A4.BA.E4.BE.8B12-.E5.88.87.E6.8D.A2.E8.BE.93.E5.85.A5.E6.BA.90)；
- `ModifyCurrentStopTime`（修改当前计划结束时间），参见 [示例13](#.E7.A4.BA.E4.BE.8B13-.E4.BF.AE.E6.94.B9.E8.BD.AC.E6.8E.A8.E7.BB.93.E6.9D.9F.E6.97.B6.E9.97.B4);
- `DescribeInputPlayInfo`（查询播放进度），参见 [示例14](#.E7.A4.BA.E4.BE.8B14-.E6.9F.A5.E8.AF.A2.E7.82.B9.E6.92.AD.E8.BE.93.E5.85.A5.E6.BA.90.E6.92.AD.E6.94.BE.E8.BF.9B.E5.BA.A6)。
     * @param req HandleStreamConnectProjectRequest
     * @return HandleStreamConnectProjectResponse
     * @throws TencentCloudSDKException
     */
    public HandleStreamConnectProjectResponse HandleStreamConnectProject(HandleStreamConnectProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HandleStreamConnectProject", HandleStreamConnectProjectResponse.class);
    }

    /**
     *将云点播媒资文件导入到多媒体创作引擎媒体资源库。支持导入媒体归属团队或者个人。
     * @param req ImportMaterialRequest
     * @return ImportMaterialResponse
     * @throws TencentCloudSDKException
     */
    public ImportMaterialResponse ImportMaterial(ImportMaterialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportMaterial", ImportMaterialResponse.class);
    }

    /**
     *将云点播中的媒资或者用户自有媒资文件添加到项目中与项目关联，供后续视频编辑使用。目前仅视频编辑项目和智能视频拆条项目有效。
     * @param req ImportMediaToProjectRequest
     * @return ImportMediaToProjectResponse
     * @throws TencentCloudSDKException
     */
    public ImportMediaToProjectResponse ImportMediaToProject(ImportMediaToProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportMediaToProject", ImportMediaToProjectResponse.class);
    }

    /**
     *浏览当前分类路径下的资源，包括媒体文件和子分类，返回媒资基础信息和分类信息。
     * @param req ListMediaRequest
     * @return ListMediaResponse
     * @throws TencentCloudSDKException
     */
    public ListMediaResponse ListMedia(ListMediaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListMedia", ListMediaResponse.class);
    }

    /**
     *修改媒体信息，支持修改媒体名称、分类路径、标签等信息。
     * @param req ModifyMaterialRequest
     * @return ModifyMaterialResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaterialResponse ModifyMaterial(ModifyMaterialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMaterial", ModifyMaterialResponse.class);
    }

    /**
     *修改项目信息。
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProject", ModifyProjectResponse.class);
    }

    /**
     *修改团队信息，目前支持修改的操作有：
<li>修改团队名称。</li>
     * @param req ModifyTeamRequest
     * @return ModifyTeamResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTeamResponse ModifyTeam(ModifyTeamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTeam", ModifyTeamResponse.class);
    }

    /**
     *修改团队成员信息，包括成员备注、角色等。
     * @param req ModifyTeamMemberRequest
     * @return ModifyTeamMemberResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTeamMemberResponse ModifyTeamMember(ModifyTeamMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTeamMember", ModifyTeamMemberResponse.class);
    }

    /**
     *修改视频编码配置信息。
     * @param req ModifyVideoEncodingPresetRequest
     * @return ModifyVideoEncodingPresetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVideoEncodingPresetResponse ModifyVideoEncodingPreset(ModifyVideoEncodingPresetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVideoEncodingPreset", ModifyVideoEncodingPresetResponse.class);
    }

    /**
     *移动某一个分类到另外一个分类下，也可用于分类重命名。
如果 SourceClassPath = /素材/视频/NBA，DestinationClassPath = /素材/视频/篮球
<li>当 DestinationClassPath 不存在时候，操作结果为重命名 ClassPath；</li>
<li>当 DestinationClassPath 存在时候，操作结果为产生新目录 /素材/视频/篮球/NBA</li>
     * @param req MoveClassRequest
     * @return MoveClassResponse
     * @throws TencentCloudSDKException
     */
    public MoveClassResponse MoveClass(MoveClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MoveClass", MoveClassResponse.class);
    }

    /**
     *移动资源，支持跨个人或团队移动媒体以及分类。如果填写了Operator，则需要校验用户对媒体和分类资源的访问以及写权限。
<li>当原始资源为媒体时，该接口效果为将该媒体移动到目标分类下面；</li>
<li>当原始资源为分类时，该接口效果为将原始分类移动到目标分类或者是重命名。</li>
 如果 SourceResource.Resource.Id = /素材/视频/NBA，DestinationResource.Resource.Id= /素材/视频/篮球 
<li>当 DestinationResource.Resource.Id 不存在时候且原始资源与目标资源归属相同，操作结果为重命名原始分类；</li>
<li>当 DestinationResource.Resource.Id 存在时候，操作结果为产生新目录 /素材/视频/篮球/NBA</li>
     * @param req MoveResourceRequest
     * @return MoveResourceResponse
     * @throws TencentCloudSDKException
     */
    public MoveResourceResponse MoveResource(MoveResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MoveResource", MoveResourceResponse.class);
    }

    /**
     *该接口接受多媒体创作引擎回调给业务的事件内容，将其转化为对应的 EventContent 结构。请不要实际调用该接口，只需要将接收到的事件内容直接使用 JSON 解析到 EventContent  结构即可使用。
     * @param req ParseEventRequest
     * @return ParseEventResponse
     * @throws TencentCloudSDKException
     */
    public ParseEventResponse ParseEvent(ParseEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ParseEvent", ParseEventResponse.class);
    }

    /**
     *资源所属实体对目标实体撤销目标资源的相应权限，若原本没有相应权限则不产生变更。
     * @param req RevokeResourceAuthorizationRequest
     * @return RevokeResourceAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public RevokeResourceAuthorizationResponse RevokeResourceAuthorization(RevokeResourceAuthorizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevokeResourceAuthorization", RevokeResourceAuthorizationResponse.class);
    }

    /**
     *根据检索条件搜索媒体，返回媒体的基本信息。
     * @param req SearchMaterialRequest
     * @return SearchMaterialResponse
     * @throws TencentCloudSDKException
     */
    public SearchMaterialResponse SearchMaterial(SearchMaterialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchMaterial", SearchMaterialResponse.class);
    }

}
