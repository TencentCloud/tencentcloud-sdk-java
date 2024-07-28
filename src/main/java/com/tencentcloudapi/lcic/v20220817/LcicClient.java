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
package com.tencentcloudapi.lcic.v20220817;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.lcic.v20220817.models.*;

public class LcicClient extends AbstractClient{
    private static String endpoint = "lcic.tencentcloudapi.com";
    private static String service = "lcic";
    private static String version = "2022-08-17";
    
    public LcicClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LcicClient(Credential credential, String region, ClientProfile profile) {
        super(LcicClient.endpoint, LcicClient.version, credential, region, profile);
    }

    /**
     *此接口用于添加成员列表到指定群组
     * @param req AddGroupMemberRequest
     * @return AddGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public AddGroupMemberResponse AddGroupMember(AddGroupMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddGroupMember", AddGroupMemberResponse.class);
    }

    /**
     *此接口用于批量添加成员列表到指定群组
     * @param req BatchAddGroupMemberRequest
     * @return BatchAddGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public BatchAddGroupMemberResponse BatchAddGroupMember(BatchAddGroupMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchAddGroupMember", BatchAddGroupMemberResponse.class);
    }

    /**
     *此接口用于批量创建群组
     * @param req BatchCreateGroupWithMembersRequest
     * @return BatchCreateGroupWithMembersResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateGroupWithMembersResponse BatchCreateGroupWithMembers(BatchCreateGroupWithMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchCreateGroupWithMembers", BatchCreateGroupWithMembersResponse.class);
    }

    /**
     *批量创建房间接口
     * @param req BatchCreateRoomRequest
     * @return BatchCreateRoomResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateRoomResponse BatchCreateRoom(BatchCreateRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchCreateRoom", BatchCreateRoomResponse.class);
    }

    /**
     *此接口用于批量删除成员列表到指定群组列表
     * @param req BatchDeleteGroupMemberRequest
     * @return BatchDeleteGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteGroupMemberResponse BatchDeleteGroupMember(BatchDeleteGroupMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteGroupMember", BatchDeleteGroupMemberResponse.class);
    }

    /**
     *批量删除多个房间的录制文件
     * @param req BatchDeleteRecordRequest
     * @return BatchDeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteRecordResponse BatchDeleteRecord(BatchDeleteRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteRecord", BatchDeleteRecordResponse.class);
    }

    /**
     *批量获取文档详情
     * @param req BatchDescribeDocumentRequest
     * @return BatchDescribeDocumentResponse
     * @throws TencentCloudSDKException
     */
    public BatchDescribeDocumentResponse BatchDescribeDocument(BatchDescribeDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDescribeDocument", BatchDescribeDocumentResponse.class);
    }

    /**
     *如果批量注册的用户已存在，则会被覆盖。一次最多注册1000个用户。默认请求频率限制：10次/秒
     * @param req BatchRegisterRequest
     * @return BatchRegisterResponse
     * @throws TencentCloudSDKException
     */
    public BatchRegisterResponse BatchRegister(BatchRegisterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchRegister", BatchRegisterResponse.class);
    }

    /**
     *绑定文档到房间
     * @param req BindDocumentToRoomRequest
     * @return BindDocumentToRoomResponse
     * @throws TencentCloudSDKException
     */
    public BindDocumentToRoomResponse BindDocumentToRoom(BindDocumentToRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindDocumentToRoom", BindDocumentToRoomResponse.class);
    }

    /**
     *创建房间内可以使用的文档。
     * @param req CreateDocumentRequest
     * @return CreateDocumentResponse
     * @throws TencentCloudSDKException
     */
    public CreateDocumentResponse CreateDocument(CreateDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDocument", CreateDocumentResponse.class);
    }

    /**
     *此接口根据成员列表创建群组
     * @param req CreateGroupWithMembersRequest
     * @return CreateGroupWithMembersResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupWithMembersResponse CreateGroupWithMembers(CreateGroupWithMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGroupWithMembers", CreateGroupWithMembersResponse.class);
    }

    /**
     *此接口会聚合子群组创建联合群组
     * @param req CreateGroupWithSubGroupRequest
     * @return CreateGroupWithSubGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupWithSubGroupResponse CreateGroupWithSubGroup(CreateGroupWithSubGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGroupWithSubGroup", CreateGroupWithSubGroupResponse.class);
    }

    /**
     *创建房间
     * @param req CreateRoomRequest
     * @return CreateRoomResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoomResponse CreateRoom(CreateRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoom", CreateRoomResponse.class);
    }

    /**
     *创建巡课
     * @param req CreateSupervisorRequest
     * @return CreateSupervisorResponse
     * @throws TencentCloudSDKException
     */
    public CreateSupervisorResponse CreateSupervisor(CreateSupervisorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSupervisor", CreateSupervisorResponse.class);
    }

    /**
     *删除设置自定义元素。如果参数scenes为空则删除所有自定义元素，否则删除指定的scene自定义元素。
     * @param req DeleteAppCustomContentRequest
     * @return DeleteAppCustomContentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppCustomContentResponse DeleteAppCustomContent(DeleteAppCustomContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAppCustomContent", DeleteAppCustomContentResponse.class);
    }

    /**
     *删除文档
     * @param req DeleteDocumentRequest
     * @return DeleteDocumentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDocumentResponse DeleteDocument(DeleteDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDocument", DeleteDocumentResponse.class);
    }

    /**
     *此接口用于删除指定群组，支持批量操作。
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroup", DeleteGroupResponse.class);
    }

    /**
     *此接口用于删除群组中指定成员
     * @param req DeleteGroupMemberRequest
     * @return DeleteGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupMemberResponse DeleteGroupMember(DeleteGroupMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroupMember", DeleteGroupMemberResponse.class);
    }

    /**
     *删除指定房间的录制文件
     * @param req DeleteRecordRequest
     * @return DeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordResponse DeleteRecord(DeleteRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecord", DeleteRecordResponse.class);
    }

    /**
     *删除房间
     * @param req DeleteRoomRequest
     * @return DeleteRoomResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoomResponse DeleteRoom(DeleteRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoom", DeleteRoomResponse.class);
    }

    /**
     *删除巡课
     * @param req DeleteSupervisorRequest
     * @return DeleteSupervisorResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSupervisorResponse DeleteSupervisor(DeleteSupervisorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSupervisor", DeleteSupervisorResponse.class);
    }

    /**
     *删除已注册用户。注：如果该成员已被添加到群组，请先在群组中删除该成员。
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
    }

    /**
     *获取房间答题详情
     * @param req DescribeAnswerListRequest
     * @return DescribeAnswerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAnswerListResponse DescribeAnswerList(DescribeAnswerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAnswerList", DescribeAnswerListResponse.class);
    }

    /**
     *获取应用详情
     * @param req DescribeAppDetailRequest
     * @return DescribeAppDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppDetailResponse DescribeAppDetail(DescribeAppDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppDetail", DescribeAppDetailResponse.class);
    }

    /**
     *获取当前房间的成员列表，房间结束或过期后无法使用。
     * @param req DescribeCurrentMemberListRequest
     * @return DescribeCurrentMemberListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCurrentMemberListResponse DescribeCurrentMemberList(DescribeCurrentMemberListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCurrentMemberList", DescribeCurrentMemberListResponse.class);
    }

    /**
     *开发商信息获取
     * @param req DescribeDeveloperRequest
     * @return DescribeDeveloperResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeveloperResponse DescribeDeveloper(DescribeDeveloperRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeveloper", DescribeDeveloperResponse.class);
    }

    /**
     *获取文档信息
     * @param req DescribeDocumentRequest
     * @return DescribeDocumentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentResponse DescribeDocument(DescribeDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDocument", DescribeDocumentResponse.class);
    }

    /**
     *有新接口替换

批量获取文档信息（已废弃，替代接口BatchDescribeDocument）
     * @param req DescribeDocumentsRequest
     * @return DescribeDocumentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentsResponse DescribeDocuments(DescribeDocumentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDocuments", DescribeDocumentsResponse.class);
    }

    /**
     *此接口获取指定房间下课件列表
     * @param req DescribeDocumentsByRoomRequest
     * @return DescribeDocumentsByRoomResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentsByRoomResponse DescribeDocumentsByRoom(DescribeDocumentsByRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDocumentsByRoom", DescribeDocumentsByRoomResponse.class);
    }

    /**
     *此接口用于获取群组详情
     * @param req DescribeGroupRequest
     * @return DescribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupResponse DescribeGroup(DescribeGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroup", DescribeGroupResponse.class);
    }

    /**
     *获取群组列表
     * @param req DescribeGroupListRequest
     * @return DescribeGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupListResponse DescribeGroupList(DescribeGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupList", DescribeGroupListResponse.class);
    }

    /**
     *此接口用于获取群组成员列表
     * @param req DescribeGroupMemberListRequest
     * @return DescribeGroupMemberListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupMemberListResponse DescribeGroupMemberList(DescribeGroupMemberListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupMemberList", DescribeGroupMemberListResponse.class);
    }

    /**
     *获取房间提问列表
     * @param req DescribeQuestionListRequest
     * @return DescribeQuestionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuestionListResponse DescribeQuestionList(DescribeQuestionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuestionList", DescribeQuestionListResponse.class);
    }

    /**
     *获取房间配置信息
     * @param req DescribeRoomRequest
     * @return DescribeRoomResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomResponse DescribeRoom(DescribeRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoom", DescribeRoomResponse.class);
    }

    /**
     *根据房间ID获取群组中被禁言的用户列表。
     * @param req DescribeRoomForbiddenUserRequest
     * @return DescribeRoomForbiddenUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomForbiddenUserResponse DescribeRoomForbiddenUser(DescribeRoomForbiddenUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoomForbiddenUser", DescribeRoomForbiddenUserResponse.class);
    }

    /**
     *获取房间统计信息，仅可在房间结束后调用。
     * @param req DescribeRoomStatisticsRequest
     * @return DescribeRoomStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomStatisticsResponse DescribeRoomStatistics(DescribeRoomStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoomStatistics", DescribeRoomStatisticsResponse.class);
    }

    /**
     *获取课堂评分列表
     * @param req DescribeScoreListRequest
     * @return DescribeScoreListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScoreListResponse DescribeScoreList(DescribeScoreListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScoreList", DescribeScoreListResponse.class);
    }

    /**
     *此接口用于获取指定应用ID下用户列表
     * @param req DescribeSdkAppIdUsersRequest
     * @return DescribeSdkAppIdUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSdkAppIdUsersResponse DescribeSdkAppIdUsers(DescribeSdkAppIdUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSdkAppIdUsers", DescribeSdkAppIdUsersResponse.class);
    }

    /**
     *获取巡课列表
     * @param req DescribeSupervisorsRequest
     * @return DescribeSupervisorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupervisorsResponse DescribeSupervisors(DescribeSupervisorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSupervisors", DescribeSupervisorsResponse.class);
    }

    /**
     *获取用户信息
     * @param req DescribeUserRequest
     * @return DescribeUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResponse DescribeUser(DescribeUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUser", DescribeUserResponse.class);
    }

    /**
     *结束房间的直播
     * @param req EndRoomRequest
     * @return EndRoomResponse
     * @throws TencentCloudSDKException
     */
    public EndRoomResponse EndRoom(EndRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EndRoom", EndRoomResponse.class);
    }

    /**
     *禁止指定房间中某些用户在一段时间内发言。
取消对某些用户的禁言。
被禁言用户退出房间之后再进入同一房间，禁言仍然有效。
     * @param req ForbidSendMsgRequest
     * @return ForbidSendMsgResponse
     * @throws TencentCloudSDKException
     */
    public ForbidSendMsgResponse ForbidSendMsg(ForbidSendMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForbidSendMsg", ForbidSendMsgResponse.class);
    }

    /**
     *获取房间事件,仅在课堂结束1小时内有效。
     * @param req GetRoomEventRequest
     * @return GetRoomEventResponse
     * @throws TencentCloudSDKException
     */
    public GetRoomEventResponse GetRoomEvent(GetRoomEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRoomEvent", GetRoomEventResponse.class);
    }

    /**
     *获取房间历史消息(房间历史消息保存7天)
     * @param req GetRoomMessageRequest
     * @return GetRoomMessageResponse
     * @throws TencentCloudSDKException
     */
    public GetRoomMessageResponse GetRoomMessage(GetRoomMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRoomMessage", GetRoomMessageResponse.class);
    }

    /**
     *获取房间列表
     * @param req GetRoomsRequest
     * @return GetRoomsResponse
     * @throws TencentCloudSDKException
     */
    public GetRoomsResponse GetRooms(GetRoomsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRooms", GetRoomsResponse.class);
    }

    /**
     *获取水印设置
     * @param req GetWatermarkRequest
     * @return GetWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public GetWatermarkResponse GetWatermark(GetWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWatermark", GetWatermarkResponse.class);
    }

    /**
     *从房间里面踢出用户
     * @param req KickUserFromRoomRequest
     * @return KickUserFromRoomResponse
     * @throws TencentCloudSDKException
     */
    public KickUserFromRoomResponse KickUserFromRoom(KickUserFromRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KickUserFromRoom", KickUserFromRoomResponse.class);
    }

    /**
     *使用源账号登录，源账号为注册时填入的originId
     * @param req LoginOriginIdRequest
     * @return LoginOriginIdResponse
     * @throws TencentCloudSDKException
     */
    public LoginOriginIdResponse LoginOriginId(LoginOriginIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LoginOriginId", LoginOriginIdResponse.class);
    }

    /**
     *登录
     * @param req LoginUserRequest
     * @return LoginUserResponse
     * @throws TencentCloudSDKException
     */
    public LoginUserResponse LoginUser(LoginUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LoginUser", LoginUserResponse.class);
    }

    /**
     *修改应用
     * @param req ModifyAppRequest
     * @return ModifyAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppResponse ModifyApp(ModifyAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApp", ModifyAppResponse.class);
    }

    /**
     *此接口修改群组信息
     * @param req ModifyGroupRequest
     * @return ModifyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupResponse ModifyGroup(ModifyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGroup", ModifyGroupResponse.class);
    }

    /**
     *修改房间
     * @param req ModifyRoomRequest
     * @return ModifyRoomResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoomResponse ModifyRoom(ModifyRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRoom", ModifyRoomResponse.class);
    }

    /**
     *此接口用于修改用户配置，如头像，昵称/用户名等。
     * @param req ModifyUserProfileRequest
     * @return ModifyUserProfileResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserProfileResponse ModifyUserProfile(ModifyUserProfileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserProfile", ModifyUserProfileResponse.class);
    }

    /**
     *注册用户
     * @param req RegisterUserRequest
     * @return RegisterUserResponse
     * @throws TencentCloudSDKException
     */
    public RegisterUserResponse RegisterUser(RegisterUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterUser", RegisterUserResponse.class);
    }

    /**
     *1、按照指定身份发送消息，目前支持表情消息、图片消息、文本消息。
     * @param req SendRoomNormalMessageRequest
     * @return SendRoomNormalMessageResponse
     * @throws TencentCloudSDKException
     */
    public SendRoomNormalMessageResponse SendRoomNormalMessage(SendRoomNormalMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendRoomNormalMessage", SendRoomNormalMessageResponse.class);
    }

    /**
     *App 管理员可以通过该接口在群组中发送通知、公告等。目前仅支持文本消息。
     * @param req SendRoomNotificationMessageRequest
     * @return SendRoomNotificationMessageResponse
     * @throws TencentCloudSDKException
     */
    public SendRoomNotificationMessageResponse SendRoomNotificationMessage(SendRoomNotificationMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendRoomNotificationMessage", SendRoomNotificationMessageResponse.class);
    }

    /**
     *设置应用的自定义内容，包括应用图标，自定义的代码等。如果已存在，则为更新。更新js、css内容后，要生效也需要调用该接口
     * @param req SetAppCustomContentRequest
     * @return SetAppCustomContentResponse
     * @throws TencentCloudSDKException
     */
    public SetAppCustomContentResponse SetAppCustomContent(SetAppCustomContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetAppCustomContent", SetAppCustomContentResponse.class);
    }

    /**
     *设置水印
     * @param req SetWatermarkRequest
     * @return SetWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public SetWatermarkResponse SetWatermark(SetWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetWatermark", SetWatermarkResponse.class);
    }

    /**
     *开始房间的直播。 说明：开始房间接口调用之前需要有用户进入课堂初始化课堂信息。
     * @param req StartRoomRequest
     * @return StartRoomResponse
     * @throws TencentCloudSDKException
     */
    public StartRoomResponse StartRoom(StartRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartRoom", StartRoomResponse.class);
    }

    /**
     *文档从房间解绑
     * @param req UnbindDocumentFromRoomRequest
     * @return UnbindDocumentFromRoomResponse
     * @throws TencentCloudSDKException
     */
    public UnbindDocumentFromRoomResponse UnbindDocumentFromRoom(UnbindDocumentFromRoomRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindDocumentFromRoom", UnbindDocumentFromRoomResponse.class);
    }

    /**
     *解禁从房间里面踢出的用户
     * @param req UnblockKickedUserRequest
     * @return UnblockKickedUserResponse
     * @throws TencentCloudSDKException
     */
    public UnblockKickedUserResponse UnblockKickedUser(UnblockKickedUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnblockKickedUser", UnblockKickedUserResponse.class);
    }

}
