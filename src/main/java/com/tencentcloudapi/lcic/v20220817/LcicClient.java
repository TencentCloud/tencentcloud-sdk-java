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
        JsonResponseModel<AddGroupMemberResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddGroupMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddGroupMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于批量添加成员列表到指定群组
     * @param req BatchAddGroupMemberRequest
     * @return BatchAddGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public BatchAddGroupMemberResponse BatchAddGroupMember(BatchAddGroupMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchAddGroupMemberResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchAddGroupMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchAddGroupMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于批量创建群组
     * @param req BatchCreateGroupWithMembersRequest
     * @return BatchCreateGroupWithMembersResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateGroupWithMembersResponse BatchCreateGroupWithMembers(BatchCreateGroupWithMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchCreateGroupWithMembersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchCreateGroupWithMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchCreateGroupWithMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量创建房间接口
     * @param req BatchCreateRoomRequest
     * @return BatchCreateRoomResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateRoomResponse BatchCreateRoom(BatchCreateRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchCreateRoomResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchCreateRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchCreateRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于批量删除成员列表到指定群组列表
     * @param req BatchDeleteGroupMemberRequest
     * @return BatchDeleteGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteGroupMemberResponse BatchDeleteGroupMember(BatchDeleteGroupMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteGroupMemberResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteGroupMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteGroupMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除多个房间的录制文件
     * @param req BatchDeleteRecordRequest
     * @return BatchDeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteRecordResponse BatchDeleteRecord(BatchDeleteRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量获取文档详情
     * @param req BatchDescribeDocumentRequest
     * @return BatchDescribeDocumentResponse
     * @throws TencentCloudSDKException
     */
    public BatchDescribeDocumentResponse BatchDescribeDocument(BatchDescribeDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDescribeDocumentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDescribeDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDescribeDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *如果批量注册的用户已存在，则会被覆盖。一次最多注册1000个用户。默认请求频率限制：10次/秒
     * @param req BatchRegisterRequest
     * @return BatchRegisterResponse
     * @throws TencentCloudSDKException
     */
    public BatchRegisterResponse BatchRegister(BatchRegisterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchRegisterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BatchRegisterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchRegister");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定文档到房间
     * @param req BindDocumentToRoomRequest
     * @return BindDocumentToRoomResponse
     * @throws TencentCloudSDKException
     */
    public BindDocumentToRoomResponse BindDocumentToRoom(BindDocumentToRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindDocumentToRoomResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BindDocumentToRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindDocumentToRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建房间内可以使用的文档。
     * @param req CreateDocumentRequest
     * @return CreateDocumentResponse
     * @throws TencentCloudSDKException
     */
    public CreateDocumentResponse CreateDocument(CreateDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDocumentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口根据成员列表创建群组
     * @param req CreateGroupWithMembersRequest
     * @return CreateGroupWithMembersResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupWithMembersResponse CreateGroupWithMembers(CreateGroupWithMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGroupWithMembersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupWithMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGroupWithMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口会聚合子群组创建联合群组
     * @param req CreateGroupWithSubGroupRequest
     * @return CreateGroupWithSubGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupWithSubGroupResponse CreateGroupWithSubGroup(CreateGroupWithSubGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGroupWithSubGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupWithSubGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateGroupWithSubGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建房间
     * @param req CreateRoomRequest
     * @return CreateRoomResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoomResponse CreateRoom(CreateRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoomResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建巡课
     * @param req CreateSupervisorRequest
     * @return CreateSupervisorResponse
     * @throws TencentCloudSDKException
     */
    public CreateSupervisorResponse CreateSupervisor(CreateSupervisorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSupervisorResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSupervisorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSupervisor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除设置自定义元素。如果参数scenes为空则删除所有自定义元素，否则删除指定的scene自定义元素。
     * @param req DeleteAppCustomContentRequest
     * @return DeleteAppCustomContentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppCustomContentResponse DeleteAppCustomContent(DeleteAppCustomContentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAppCustomContentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAppCustomContentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAppCustomContent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除文档
     * @param req DeleteDocumentRequest
     * @return DeleteDocumentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDocumentResponse DeleteDocument(DeleteDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDocumentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于删除指定群组，支持批量操作。
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于删除群组中指定成员
     * @param req DeleteGroupMemberRequest
     * @return DeleteGroupMemberResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupMemberResponse DeleteGroupMember(DeleteGroupMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGroupMemberResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGroupMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除指定房间的录制文件
     * @param req DeleteRecordRequest
     * @return DeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordResponse DeleteRecord(DeleteRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除房间
     * @param req DeleteRoomRequest
     * @return DeleteRoomResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoomResponse DeleteRoom(DeleteRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRoomResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除巡课
     * @param req DeleteSupervisorRequest
     * @return DeleteSupervisorResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSupervisorResponse DeleteSupervisor(DeleteSupervisorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSupervisorResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSupervisorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSupervisor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除已注册用户。注：如果该成员已被添加到群组，请先在群组中删除该成员。
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取房间答题详情
     * @param req DescribeAnswerListRequest
     * @return DescribeAnswerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAnswerListResponse DescribeAnswerList(DescribeAnswerListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAnswerListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAnswerListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAnswerList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用详情
     * @param req DescribeAppDetailRequest
     * @return DescribeAppDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppDetailResponse DescribeAppDetail(DescribeAppDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAppDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAppDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAppDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取当前房间的成员列表，房间结束或过期后无法使用。
     * @param req DescribeCurrentMemberListRequest
     * @return DescribeCurrentMemberListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCurrentMemberListResponse DescribeCurrentMemberList(DescribeCurrentMemberListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCurrentMemberListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCurrentMemberListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCurrentMemberList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开发商信息获取
     * @param req DescribeDeveloperRequest
     * @return DescribeDeveloperResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeveloperResponse DescribeDeveloper(DescribeDeveloperRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeveloperResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeveloperResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeveloper");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取文档信息
     * @param req DescribeDocumentRequest
     * @return DescribeDocumentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentResponse DescribeDocument(DescribeDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDocumentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *有新接口替换

批量获取文档信息（已废弃，替代接口BatchDescribeDocument）
     * @param req DescribeDocumentsRequest
     * @return DescribeDocumentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentsResponse DescribeDocuments(DescribeDocumentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDocumentsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDocumentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDocuments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口获取指定房间下课件列表
     * @param req DescribeDocumentsByRoomRequest
     * @return DescribeDocumentsByRoomResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentsByRoomResponse DescribeDocumentsByRoom(DescribeDocumentsByRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDocumentsByRoomResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDocumentsByRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDocumentsByRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于获取群组详情
     * @param req DescribeGroupRequest
     * @return DescribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupResponse DescribeGroup(DescribeGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取群组列表
     * @param req DescribeGroupListRequest
     * @return DescribeGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupListResponse DescribeGroupList(DescribeGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于获取群组成员列表
     * @param req DescribeGroupMemberListRequest
     * @return DescribeGroupMemberListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupMemberListResponse DescribeGroupMemberList(DescribeGroupMemberListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupMemberListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupMemberListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupMemberList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取房间提问列表
     * @param req DescribeQuestionListRequest
     * @return DescribeQuestionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuestionListResponse DescribeQuestionList(DescribeQuestionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQuestionListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQuestionListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeQuestionList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取房间信息
     * @param req DescribeRoomRequest
     * @return DescribeRoomResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomResponse DescribeRoom(DescribeRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoomResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取房间统计信息，仅可在房间结束后调用。
     * @param req DescribeRoomStatisticsRequest
     * @return DescribeRoomStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomStatisticsResponse DescribeRoomStatistics(DescribeRoomStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoomStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoomStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoomStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于获取指定应用ID下用户列表
     * @param req DescribeSdkAppIdUsersRequest
     * @return DescribeSdkAppIdUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSdkAppIdUsersResponse DescribeSdkAppIdUsers(DescribeSdkAppIdUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSdkAppIdUsersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSdkAppIdUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSdkAppIdUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取巡课列表
     * @param req DescribeSupervisorsRequest
     * @return DescribeSupervisorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSupervisorsResponse DescribeSupervisors(DescribeSupervisorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSupervisorsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSupervisorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSupervisors");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户信息
     * @param req DescribeUserRequest
     * @return DescribeUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResponse DescribeUser(DescribeUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *结束房间的直播
     * @param req EndRoomRequest
     * @return EndRoomResponse
     * @throws TencentCloudSDKException
     */
    public EndRoomResponse EndRoom(EndRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EndRoomResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EndRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EndRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取房间事件,仅在课堂结束1小时内有效。
     * @param req GetRoomEventRequest
     * @return GetRoomEventResponse
     * @throws TencentCloudSDKException
     */
    public GetRoomEventResponse GetRoomEvent(GetRoomEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRoomEventResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetRoomEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRoomEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取房间历史消息(房间历史消息保存7天)
     * @param req GetRoomMessageRequest
     * @return GetRoomMessageResponse
     * @throws TencentCloudSDKException
     */
    public GetRoomMessageResponse GetRoomMessage(GetRoomMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRoomMessageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetRoomMessageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRoomMessage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取房间列表
     * @param req GetRoomsRequest
     * @return GetRoomsResponse
     * @throws TencentCloudSDKException
     */
    public GetRoomsResponse GetRooms(GetRoomsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRoomsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetRoomsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRooms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取水印设置
     * @param req GetWatermarkRequest
     * @return GetWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public GetWatermarkResponse GetWatermark(GetWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetWatermarkResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetWatermarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetWatermark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从房间里面踢出用户
     * @param req KickUserFromRoomRequest
     * @return KickUserFromRoomResponse
     * @throws TencentCloudSDKException
     */
    public KickUserFromRoomResponse KickUserFromRoom(KickUserFromRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KickUserFromRoomResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<KickUserFromRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "KickUserFromRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用源账号登录，源账号为注册时填入的originId
     * @param req LoginOriginIdRequest
     * @return LoginOriginIdResponse
     * @throws TencentCloudSDKException
     */
    public LoginOriginIdResponse LoginOriginId(LoginOriginIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LoginOriginIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<LoginOriginIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LoginOriginId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *登录
     * @param req LoginUserRequest
     * @return LoginUserResponse
     * @throws TencentCloudSDKException
     */
    public LoginUserResponse LoginUser(LoginUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LoginUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<LoginUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LoginUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改应用
     * @param req ModifyAppRequest
     * @return ModifyAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppResponse ModifyApp(ModifyAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAppResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口修改群组信息
     * @param req ModifyGroupRequest
     * @return ModifyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupResponse ModifyGroup(ModifyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改房间
     * @param req ModifyRoomRequest
     * @return ModifyRoomResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoomResponse ModifyRoom(ModifyRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRoomResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于修改用户配置，如头像，昵称/用户名等。
     * @param req ModifyUserProfileRequest
     * @return ModifyUserProfileResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserProfileResponse ModifyUserProfile(ModifyUserProfileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserProfileResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserProfileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserProfile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *注册用户
     * @param req RegisterUserRequest
     * @return RegisterUserResponse
     * @throws TencentCloudSDKException
     */
    public RegisterUserResponse RegisterUser(RegisterUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置应用的自定义内容，包括应用图标，自定义的代码等。如果已存在，则为更新。更新js、css内容后，要生效也需要调用该接口
     * @param req SetAppCustomContentRequest
     * @return SetAppCustomContentResponse
     * @throws TencentCloudSDKException
     */
    public SetAppCustomContentResponse SetAppCustomContent(SetAppCustomContentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetAppCustomContentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetAppCustomContentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetAppCustomContent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置水印
     * @param req SetWatermarkRequest
     * @return SetWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public SetWatermarkResponse SetWatermark(SetWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetWatermarkResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetWatermarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetWatermark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开始房间的直播。 说明：开始房间接口调用之前需要有用户进入课堂初始化课堂信息。
     * @param req StartRoomRequest
     * @return StartRoomResponse
     * @throws TencentCloudSDKException
     */
    public StartRoomResponse StartRoom(StartRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartRoomResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *文档从房间解绑
     * @param req UnbindDocumentFromRoomRequest
     * @return UnbindDocumentFromRoomResponse
     * @throws TencentCloudSDKException
     */
    public UnbindDocumentFromRoomResponse UnbindDocumentFromRoom(UnbindDocumentFromRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindDocumentFromRoomResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindDocumentFromRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindDocumentFromRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
