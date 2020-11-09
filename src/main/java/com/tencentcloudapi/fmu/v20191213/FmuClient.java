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
package com.tencentcloudapi.fmu.v20191213;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.fmu.v20191213.models.*;

public class FmuClient extends AbstractClient{
    private static String endpoint = "fmu.tencentcloudapi.com";
    private static String service = "fmu";
    private static String version = "2019-12-13";

    public FmuClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public FmuClient(Credential credential, String region, ClientProfile profile) {
        super(FmuClient.endpoint, FmuClient.version, credential, region, profile);
    }

    /**
     *用户上传一张人脸图片，精准定位五官，实现美肤、亮肤、祛痘等美颜功能。
     * @param req BeautifyPicRequest
     * @return BeautifyPicResponse
     * @throws TencentCloudSDKException
     */
    public BeautifyPicResponse BeautifyPic(BeautifyPicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BeautifyPicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BeautifyPicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BeautifyPic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *视频美颜
     * @param req BeautifyVideoRequest
     * @return BeautifyVideoResponse
     * @throws TencentCloudSDKException
     */
    public BeautifyVideoResponse BeautifyVideo(BeautifyVideoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BeautifyVideoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BeautifyVideoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BeautifyVideo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *撤销视频美颜任务请求
     * @param req CancelBeautifyVideoJobRequest
     * @return CancelBeautifyVideoJobResponse
     * @throws TencentCloudSDKException
     */
    public CancelBeautifyVideoJobResponse CancelBeautifyVideoJob(CancelBeautifyVideoJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelBeautifyVideoJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelBeautifyVideoJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelBeautifyVideoJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在使用LUT素材的modelid实现试唇色前，您需要先上传 LUT 格式的cube文件注册唇色ID。查看 [LUT文件的使用说明](https://cloud.tencent.com/document/product/1172/41701)。

注：您也可以直接使用 [试唇色接口](https://cloud.tencent.com/document/product/1172/40706)，通过输入RGBA模型数值的方式指定唇色，更简单易用。

     * @param req CreateModelRequest
     * @return CreateModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateModelResponse CreateModel(CreateModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateModelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateModelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateModel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除已注册的唇色素材。
     * @param req DeleteModelRequest
     * @return DeleteModelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelResponse DeleteModel(DeleteModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteModelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteModelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteModel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询已注册的唇色素材。
     * @param req GetModelListRequest
     * @return GetModelListResponse
     * @throws TencentCloudSDKException
     */
    public GetModelListResponse GetModelList(GetModelListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetModelListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetModelListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetModelList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询视频美颜处理进度
     * @param req QueryBeautifyVideoJobRequest
     * @return QueryBeautifyVideoJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryBeautifyVideoJobResponse QueryBeautifyVideoJob(QueryBeautifyVideoJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryBeautifyVideoJobResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBeautifyVideoJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryBeautifyVideoJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传一张照片，输出滤镜处理后的图片。
     * @param req StyleImageRequest
     * @return StyleImageResponse
     * @throws TencentCloudSDKException
     */
    public StyleImageResponse StyleImage(StyleImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StyleImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StyleImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StyleImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传一张照片，输出滤镜处理后的图片。
     * @param req StyleImageProRequest
     * @return StyleImageProResponse
     * @throws TencentCloudSDKException
     */
    public StyleImageProResponse StyleImagePro(StyleImageProRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StyleImageProResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StyleImageProResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StyleImagePro");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对图片中的人脸嘴唇进行着色，最多支持同时对一张图中的3张人脸进行试唇色。

您可以通过事先注册在腾讯云的唇色素材（LUT文件）改变图片中的人脸唇色，也可以输入RGBA模型数值。

为了更好的效果，建议您使用事先注册在腾讯云的唇色素材（LUT文件）。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req TryLipstickPicRequest
     * @return TryLipstickPicResponse
     * @throws TencentCloudSDKException
     */
    public TryLipstickPicResponse TryLipstickPic(TryLipstickPicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TryLipstickPicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TryLipstickPicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TryLipstickPic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
