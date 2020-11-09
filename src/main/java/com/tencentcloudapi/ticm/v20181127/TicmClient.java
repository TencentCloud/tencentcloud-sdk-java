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
package com.tencentcloudapi.ticm.v20181127;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ticm.v20181127.models.*;

public class TicmClient extends AbstractClient{
    private static String endpoint = "ticm.tencentcloudapi.com";
    private static String service = "ticm";
    private static String version = "2018-11-27";

    public TicmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TicmClient(Credential credential, String region, ClientProfile profile) {
        super(TicmClient.endpoint, TicmClient.version, credential, region, profile);
    }

    /**
     *提交完视频审核任务后，可以通过本接口来获取当前处理的进度和结果
     * @param req DescribeVideoTaskRequest
     * @return DescribeVideoTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoTaskResponse DescribeVideoTask(DescribeVideoTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVideoTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVideoTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVideoTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口提供多种维度的图像审核能力，支持色情和性感内容识别，政治人物和涉政敏感场景识别，以及暴恐人物、场景、旗帜标识等违禁内容的识别。
     * @param req ImageModerationRequest
     * @return ImageModerationResponse
     * @throws TencentCloudSDKException
     */
    public ImageModerationResponse ImageModeration(ImageModerationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImageModerationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImageModerationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImageModeration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口提供多种维度的视频审核能力，支持色情和性感内容识别，政治人物和涉政敏感场景识别，以及暴恐人物、场景、旗帜标识等违禁内容的识别。
     * @param req VideoModerationRequest
     * @return VideoModerationResponse
     * @throws TencentCloudSDKException
     */
    public VideoModerationResponse VideoModeration(VideoModerationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VideoModerationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VideoModerationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VideoModeration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
