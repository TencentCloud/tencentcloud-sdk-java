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
package com.tencentcloudapi.ams.v20200608;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ams.v20200608.models.*;

public class AmsClient extends AbstractClient{
    private static String endpoint = "ams.tencentcloudapi.com";
    private static String service = "ams";
    private static String version = "2020-06-08";

    public AmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AmsClient(Credential credential, String region, ClientProfile profile) {
        super(AmsClient.endpoint, AmsClient.version, credential, region, profile);
    }

    /**
     *取消任务
     * @param req CancelTaskRequest
     * @return CancelTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelTaskResponse CancelTask(CancelTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（Audio Moderation）用于提交音频内容（包括音频文件或流地址）进行智能审核任务，使用前请您登陆控制台开通音频内容安全服务。

### 功能使用说明：
- 前往“内容安全控制台-音频内容安全”开启使用音频内容安全服务，首次开通可获得20小时免费调用时长

### 接口功能说明：
- 支持对音频流或音频文件进行检测，判断其中是否包含违规内容；
- 支持设置回调地址 Callback 获取检测结果，或通过接口(查询音频检测结果)主动轮询获取检测结果；
- 支持识别违规内容，包括：低俗、谩骂、色情、涉政、广告等场景；
- 支持批量提交检测任务。检测任务列表最多支持10个；

### 音频文件调用说明：
- 音频文件大小支持：文件 < 500M；
- 音频文件时长支持：< 1小时；
- 音频码率类型支持：128 Kbps - 256 Kbps ；
- 音频文件支持格式：wav、mp3、aac、flac、amr、3gp、 m4a、wma、ogg、ape；
- 支持音视频文件分离并对音频文件进行独立识别；

### 音频流调用说明：
- 音频流时长支持：< 3小时；
- 音频码率类型支持：128 Kbps - 256 Kbps ；
- 音频流支持的传输协议：RTMP、HTTP、HTTPS；
- 音频流格式支持的类型：rtp、srtp、rtmp、rtmps、mmsh、 mmst、hls、http、tcp、https、m3u8；
- 支持音视频流分离并对音频流进行独立识别；
     * @param req CreateAudioModerationTaskRequest
     * @return CreateAudioModerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAudioModerationTaskResponse CreateAudioModerationTask(CreateAudioModerationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAudioModerationTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAudioModerationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAudioModerationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建业务配置，1个账号最多可以创建20个配置，可定义音频审核的场景，如色情、谩骂等，

在创建业务配置之前，你需要以下步骤：
1. 开通COS存储桶功能，新建存储桶，例如 cms_segments，用来存储 视频转换过程中生成对音频和图片。
2. 然后在COS控制台，授权天御内容安全主账号 对 cms_segments 存储桶对读写权限。具体授权操作，参考https://cloud.tencent.com/document/product/436/38648

     * @param req CreateBizConfigRequest
     * @return CreateBizConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateBizConfigResponse CreateBizConfig(CreateBizConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBizConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBizConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBizConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *音频审核明细列表
     * @param req DescribeAmsListRequest
     * @return DescribeAmsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAmsListResponse DescribeAmsList(DescribeAmsListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAmsListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAmsListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAmsList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *控制台识别统计
     * @param req DescribeAudioStatRequest
     * @return DescribeAudioStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAudioStatResponse DescribeAudioStat(DescribeAudioStatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAudioStatResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAudioStatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAudioStat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看单个配置
     * @param req DescribeBizConfigRequest
     * @return DescribeBizConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBizConfigResponse DescribeBizConfig(DescribeBizConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBizConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBizConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBizConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看任务详情
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
