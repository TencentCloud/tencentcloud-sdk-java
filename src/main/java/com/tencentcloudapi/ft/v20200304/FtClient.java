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
package com.tencentcloudapi.ft.v20200304;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ft.v20200304.models.*;

public class FtClient extends AbstractClient{
    private static String endpoint = "ft.tencentcloudapi.com";
    private static String service = "ft";
    private static String version = "2020-03-04";

    public FtClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public FtClient(Credential credential, String region, ClientProfile profile) {
        super(FtClient.endpoint, FtClient.version, credential, region, profile);
    }

    /**
     *撤销人像渐变任务请求
     * @param req CancelFaceMorphJobRequest
     * @return CancelFaceMorphJobResponse
     * @throws TencentCloudSDKException
     */
    public CancelFaceMorphJobResponse CancelFaceMorphJob(CancelFaceMorphJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelFaceMorphJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelFaceMorphJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelFaceMorphJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户上传一张人脸图片，基于人脸编辑与生成算法，输出一张人脸变老或变年轻的图片，支持实现人脸不同年龄的变化。
     * @param req ChangeAgePicRequest
     * @return ChangeAgePicResponse
     * @throws TencentCloudSDKException
     */
    public ChangeAgePicResponse ChangeAgePic(ChangeAgePicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChangeAgePicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ChangeAgePicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChangeAgePic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *输入一张人脸照片，生成个性化的二次元动漫形象，可用于打造个性头像、趣味活动、特效类应用等场景，提升社交娱乐的体验。
     * @param req FaceCartoonPicRequest
     * @return FaceCartoonPicResponse
     * @throws TencentCloudSDKException
     */
    public FaceCartoonPicResponse FaceCartoonPic(FaceCartoonPicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FaceCartoonPicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<FaceCartoonPicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FaceCartoonPic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *输入2-5张人脸照片，生成一段以人脸为焦点的渐变视频或GIF图，支持自定义图片播放速度、视频每秒传输帧数，可用于短视频、表情包、创意H5等应用场景，丰富静态图片的玩法。
     * @param req MorphFaceRequest
     * @return MorphFaceResponse
     * @throws TencentCloudSDKException
     */
    public MorphFaceResponse MorphFace(MorphFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MorphFaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MorphFaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MorphFace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询人像渐变处理进度
     * @param req QueryFaceMorphJobRequest
     * @return QueryFaceMorphJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryFaceMorphJobResponse QueryFaceMorphJob(QueryFaceMorphJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryFaceMorphJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryFaceMorphJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryFaceMorphJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户上传一张人脸图片，基于人脸编辑与生成算法，输出一张人脸性别转换的图片。男变女可实现美颜、淡妆、加刘海和长发的效果；女变男可实现加胡须、变短发的效果。 
     * @param req SwapGenderPicRequest
     * @return SwapGenderPicResponse
     * @throws TencentCloudSDKException
     */
    public SwapGenderPicResponse SwapGenderPic(SwapGenderPicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwapGenderPicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SwapGenderPicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwapGenderPic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
