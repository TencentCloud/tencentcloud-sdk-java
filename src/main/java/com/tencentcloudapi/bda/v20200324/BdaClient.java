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
package com.tencentcloudapi.bda.v20200324;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bda.v20200324.models.*;

public class BdaClient extends AbstractClient{
    private static String endpoint = "bda.tencentcloudapi.com";
    private static String version = "2020-03-24";

    public BdaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BdaClient(Credential credential, String region, ClientProfile profile) {
        super(BdaClient.endpoint, BdaClient.version, credential, region, profile);
    }

    /**
     *用于创建一个空的人体库，如果人体库已存在返回错误。

1个APPID下最多有2000W个人体轨迹（Trace），最多1W个人体库（Group）。

单个人体库（Group）最多10W个人体轨迹（Trace）。

单个人员（Person）最多添加 5 个人体轨迹（Trace）。
     * @param req CreateGroupRequest
     * @return CreateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupResponse CreateGroup(CreateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建人员，添加对应人员的人体轨迹信息。

请注意：
- 我们希望您的输入为 严格符合轨迹图片 要求的图片。如果您输入的图片不符合轨迹图片要求，会对最终效果产生较大负面影响。请您尽量保证一个Trace中的图片人体清晰、无遮挡、连贯；
- 一个人体轨迹（Trace）可以包含1-5张人体图片。提供越多质量高的人体图片有助于提升最终识别结果；
- 无论您在单个Trace中提供了多少张人体图片，我们都将生成一个对应的轨迹（Trace）信息。即，Trace仅和本次输入的图片序列相关，和图片的个数无关；
- 输入的图片组中，若有部分图片输入不合法（如图片大小过大、分辨率过大、无法解码等），我们将舍弃这部分图片，确保合法图片被正确搜索。即，我们将尽可能保证请求成功，去除不合法的输入；
- 构成人体轨迹单张图片大小不得超过2M，分辨率不得超过1920*1080。
     * @param req CreatePersonRequest
     * @return CreatePersonResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonResponse CreatePerson(CreatePersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将一个人体轨迹添加到一个人员中。一个人员最多允许包含 5 个人体轨迹。同一人的人体轨迹越多，搜索识别效果越好。

>请注意：
- 我们希望您的输入为 严格符合轨迹图片 要求的图片。如果您输入的图片不符合轨迹图片要求，会对最终效果产生较大负面影响。请您尽量保证一个Trace中的图片人体清晰、无遮挡、连贯。
- 一个人体轨迹（Trace）可以包含1-5张人体图片。提供越多质量高的人体图片有助于提升最终识别结果。
- 无论您在单个Trace中提供了多少张人体图片，我们都将生成一个对应的轨迹（Trace）信息。即，Trace仅和本次输入的图片序列相关，和图片的个数无关。
- 输入的图片组中，若有部分图片输入不合法（如图片大小过大、分辨率过大、无法解码等），我们将舍弃这部分图片，确保合法图片被正确搜索。即，我们将尽可能保证请求成功，去除不合法的输入；
- 构成人体轨迹单张图片大小限制为2M，分辨率限制为1920*1080。
     * @param req CreateTraceRequest
     * @return CreateTraceResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceResponse CreateTrace(CreateTraceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTraceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTraceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTrace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除该人体库及包含的所有的人员。
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除人员。
     * @param req DeletePersonRequest
     * @return DeletePersonResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonResponse DeletePerson(DeletePersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检测给定图片中的人体（Body）的位置信息（属性信息将在后续开放）。

     * @param req DetectBodyRequest
     * @return DetectBodyResponse
     * @throws TencentCloudSDKException
     */
    public DetectBodyResponse DetectBody(DetectBodyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectBodyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectBodyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectBody"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取人体库列表。
     * @param req GetGroupListRequest
     * @return GetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupListResponse GetGroupList(GetGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGroupListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetGroupListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetGroupList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定人体库中的人员列表。
     * @param req GetPersonListRequest
     * @return GetPersonListResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonListResponse GetPersonList(GetPersonListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPersonList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改人体库名称、备注。
     * @param req ModifyGroupRequest
     * @return ModifyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupResponse ModifyGroup(ModifyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改人员信息。
     * @param req ModifyPersonInfoRequest
     * @return ModifyPersonInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonInfoResponse ModifyPersonInfo(ModifyPersonInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPersonInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于对一组待识别的人体轨迹（Trace）图片，在人体库中识别出最相似的 TopK 人体，按照相似度从大到小排列。

人体轨迹（Trace）图片要求：图片中当且仅包含一个人体。人体完整、无遮挡。

> 请注意：
- 我们希望您的输入为严格符合轨迹图片要求的图片。如果您输入的图片不符合轨迹图片要求，会对最终效果产生较大负面影响；
- 人体轨迹，是一个包含1-5张图片的图片序列。您可以输入1张图片作为轨迹，也可以输入多张。单个轨迹中包含越多符合质量的图片，搜索效果越好。
- 构成人体轨迹单张图片大小不得超过2M，分辨率不得超过1920*1080。
     * @param req SearchTraceRequest
     * @return SearchTraceResponse
     * @throws TencentCloudSDKException
     */
    public SearchTraceResponse SearchTrace(SearchTraceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchTraceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchTraceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchTrace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *识别传入图片中人体的完整轮廓，进行抠像。

     * @param req SegmentPortraitPicRequest
     * @return SegmentPortraitPicResponse
     * @throws TencentCloudSDKException
     */
    public SegmentPortraitPicResponse SegmentPortraitPic(SegmentPortraitPicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SegmentPortraitPicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SegmentPortraitPicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SegmentPortraitPic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
