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
    private static String service = "bda";
    private static String version = "2020-03-24";

    public BdaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BdaClient(Credential credential, String region, ClientProfile profile) {
        super(BdaClient.endpoint, BdaClient.version, credential, region, profile);
    }

    /**
     *本接口为人像分割在线处理接口组中的提交任务接口，可以对提交的资源进行处理视频流/图片流识别视频作品中的人像区域，进行一键抠像、背景替换、人像虚化等后期处理。
     * @param req CreateSegmentationTaskRequest
     * @return CreateSegmentationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSegmentationTaskResponse CreateSegmentationTask(CreateSegmentationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSegmentationTask", CreateSegmentationTaskResponse.class);
    }

    /**
     *可以查看单条任务的处理情况，包括处理状态，处理结果。
     * @param req DescribeSegmentationTaskRequest
     * @return DescribeSegmentationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSegmentationTaskResponse DescribeSegmentationTask(DescribeSegmentationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSegmentationTask", DescribeSegmentationTaskResponse.class);
    }

    /**
     *在前后景分割的基础上优化多分类分割，支持对头发、五官等的分割，既作为换发型、挂件等底层技术，也可用于抠人头、抠人脸等玩法
     * @param req SegmentCustomizedPortraitPicRequest
     * @return SegmentCustomizedPortraitPicResponse
     * @throws TencentCloudSDKException
     */
    public SegmentCustomizedPortraitPicResponse SegmentCustomizedPortraitPic(SegmentCustomizedPortraitPicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SegmentCustomizedPortraitPic", SegmentCustomizedPortraitPicResponse.class);
    }

    /**
     *即二分类人像分割，识别传入图片中人体的完整轮廓，进行抠像。
     * @param req SegmentPortraitPicRequest
     * @return SegmentPortraitPicResponse
     * @throws TencentCloudSDKException
     */
    public SegmentPortraitPicResponse SegmentPortraitPic(SegmentPortraitPicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SegmentPortraitPic", SegmentPortraitPicResponse.class);
    }

    /**
     *终止指定视频人像分割处理任务
     * @param req TerminateSegmentationTaskRequest
     * @return TerminateSegmentationTaskResponse
     * @throws TencentCloudSDKException
     */
    public TerminateSegmentationTaskResponse TerminateSegmentationTask(TerminateSegmentationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateSegmentationTask", TerminateSegmentationTaskResponse.class);
    }

}
