/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.ie.v20200304;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ie.v20200304.models.*;

public class IeClient extends AbstractClient{
    private static String endpoint = "ie.tencentcloudapi.com";
    private static String service = "ie";
    private static String version = "2020-03-04";

    public IeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IeClient(Credential credential, String region, ClientProfile profile) {
        super(IeClient.endpoint, IeClient.version, credential, region, profile);
    }

    /**
     *创建编辑理解任务，可以同时选择视频标签识别、分类识别、智能拆条、智能集锦、智能封面和片头片尾识别中的一项或者多项能力。
     * @param req CreateEditingTaskRequest
     * @return CreateEditingTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateEditingTaskResponse CreateEditingTask(CreateEditingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEditingTask", CreateEditingTaskResponse.class);
    }

    /**
     *用于创建编辑处理任务，如媒体截取、媒体编辑、媒体拼接、媒体字幕。
     * @param req CreateMediaProcessTaskRequest
     * @return CreateMediaProcessTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateMediaProcessTaskResponse CreateMediaProcessTask(CreateMediaProcessTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMediaProcessTask", CreateMediaProcessTaskResponse.class);
    }

    /**
     *创建画质重生任务，对视频进行转码、去噪、去划痕、去毛刺、超分、细节增强和色彩增强。
     * @param req CreateMediaQualityRestorationTaskRequest
     * @return CreateMediaQualityRestorationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateMediaQualityRestorationTaskResponse CreateMediaQualityRestorationTask(CreateMediaQualityRestorationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMediaQualityRestorationTask", CreateMediaQualityRestorationTaskResponse.class);
    }

    /**
     *通过接口可以智能检测视频画面中抖动重影、模糊、低光照、过曝光、黑边、白边、黑屏、白屏、花屏、噪点、马赛克、二维码等在内的多个场景，还可以自动检测视频无音频异常、无声音片段。
     * @param req CreateQualityControlTaskRequest
     * @return CreateQualityControlTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateQualityControlTaskResponse CreateQualityControlTask(CreateQualityControlTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQualityControlTask", CreateQualityControlTaskResponse.class);
    }

    /**
     *获取编辑理解任务结果。
     * @param req DescribeEditingTaskResultRequest
     * @return DescribeEditingTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEditingTaskResultResponse DescribeEditingTaskResult(DescribeEditingTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEditingTaskResult", DescribeEditingTaskResultResponse.class);
    }

    /**
     *用于获取编辑处理任务的结果。
     * @param req DescribeMediaProcessTaskResultRequest
     * @return DescribeMediaProcessTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaProcessTaskResultResponse DescribeMediaProcessTaskResult(DescribeMediaProcessTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMediaProcessTaskResult", DescribeMediaProcessTaskResultResponse.class);
    }

    /**
     *获取画质重生任务结果，查看结束后的文件信息
     * @param req DescribeMediaQualityRestorationTaskRusultRequest
     * @return DescribeMediaQualityRestorationTaskRusultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaQualityRestorationTaskRusultResponse DescribeMediaQualityRestorationTaskRusult(DescribeMediaQualityRestorationTaskRusultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMediaQualityRestorationTaskRusult", DescribeMediaQualityRestorationTaskRusultResponse.class);
    }

    /**
     *获取媒体质检任务结果
     * @param req DescribeQualityControlTaskResultRequest
     * @return DescribeQualityControlTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityControlTaskResultResponse DescribeQualityControlTaskResult(DescribeQualityControlTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQualityControlTaskResult", DescribeQualityControlTaskResultResponse.class);
    }

    /**
     *用于停止正在进行中的编辑处理任务。
     * @param req StopMediaProcessTaskRequest
     * @return StopMediaProcessTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopMediaProcessTaskResponse StopMediaProcessTask(StopMediaProcessTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopMediaProcessTask", StopMediaProcessTaskResponse.class);
    }

    /**
     *删除正在进行的画质重生任务
     * @param req StopMediaQualityRestorationTaskRequest
     * @return StopMediaQualityRestorationTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopMediaQualityRestorationTaskResponse StopMediaQualityRestorationTask(StopMediaQualityRestorationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopMediaQualityRestorationTask", StopMediaQualityRestorationTaskResponse.class);
    }

}
