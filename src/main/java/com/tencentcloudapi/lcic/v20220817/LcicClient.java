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
     *批量创建房间接口
     * @param req BatchCreateRoomRequest
     * @return BatchCreateRoomResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateRoomResponse BatchCreateRoom(BatchCreateRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchCreateRoomResponse> rsp = null;
        String rspStr = "";
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
     *批量删除多个房间的录制文件
     * @param req BatchDeleteRecordRequest
     * @return BatchDeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteRecordResponse BatchDeleteRecord(BatchDeleteRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteRecordResponse> rsp = null;
        String rspStr = "";
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
     *如果批量注册的用户已存在，则会被覆盖。一次最多注册1000个用户。默认请求频率限制：10次/秒
     * @param req BatchRegisterRequest
     * @return BatchRegisterResponse
     * @throws TencentCloudSDKException
     */
    public BatchRegisterResponse BatchRegister(BatchRegisterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchRegisterResponse> rsp = null;
        String rspStr = "";
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
     *创建房间
     * @param req CreateRoomRequest
     * @return CreateRoomResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoomResponse CreateRoom(CreateRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoomResponse> rsp = null;
        String rspStr = "";
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
     *删除文档
     * @param req DeleteDocumentRequest
     * @return DeleteDocumentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDocumentResponse DeleteDocument(DeleteDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDocumentResponse> rsp = null;
        String rspStr = "";
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
     *删除指定房间的录制文件
     * @param req DeleteRecordRequest
     * @return DeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordResponse DeleteRecord(DeleteRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordResponse> rsp = null;
        String rspStr = "";
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
     *获取应用详情
     * @param req DescribeAppDetailRequest
     * @return DescribeAppDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppDetailResponse DescribeAppDetail(DescribeAppDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAppDetailResponse> rsp = null;
        String rspStr = "";
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
     *获取文档信息
     * @param req DescribeDocumentRequest
     * @return DescribeDocumentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentResponse DescribeDocument(DescribeDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDocumentResponse> rsp = null;
        String rspStr = "";
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
     *此接口获取指定房间下课件列表
     * @param req DescribeDocumentsByRoomRequest
     * @return DescribeDocumentsByRoomResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDocumentsByRoomResponse DescribeDocumentsByRoom(DescribeDocumentsByRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDocumentsByRoomResponse> rsp = null;
        String rspStr = "";
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
     *获取房间信息
     * @param req DescribeRoomRequest
     * @return DescribeRoomResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomResponse DescribeRoom(DescribeRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoomResponse> rsp = null;
        String rspStr = "";
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
     *获取用户信息
     * @param req DescribeUserRequest
     * @return DescribeUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResponse DescribeUser(DescribeUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserResponse> rsp = null;
        String rspStr = "";
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
     *获取水印设置
     * @param req GetWatermarkRequest
     * @return GetWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public GetWatermarkResponse GetWatermark(GetWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetWatermarkResponse> rsp = null;
        String rspStr = "";
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
     *使用源账号登录，源账号为注册时填入的originId
     * @param req LoginOriginIdRequest
     * @return LoginOriginIdResponse
     * @throws TencentCloudSDKException
     */
    public LoginOriginIdResponse LoginOriginId(LoginOriginIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LoginOriginIdResponse> rsp = null;
        String rspStr = "";
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
     *修改房间
     * @param req ModifyRoomRequest
     * @return ModifyRoomResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoomResponse ModifyRoom(ModifyRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRoomResponse> rsp = null;
        String rspStr = "";
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
     *文档从房间解绑
     * @param req UnbindDocumentFromRoomRequest
     * @return UnbindDocumentFromRoomResponse
     * @throws TencentCloudSDKException
     */
    public UnbindDocumentFromRoomResponse UnbindDocumentFromRoom(UnbindDocumentFromRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindDocumentFromRoomResponse> rsp = null;
        String rspStr = "";
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
