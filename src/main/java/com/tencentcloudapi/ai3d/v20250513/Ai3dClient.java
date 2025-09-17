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
package com.tencentcloudapi.ai3d.v20250513;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ai3d.v20250513.models.*;

public class Ai3dClient extends AbstractClient{
    private static String endpoint = "ai3d.tencentcloudapi.com";
    private static String service = "ai3d";
    private static String version = "2025-05-13";

    public Ai3dClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public Ai3dClient(Credential credential, String region, ClientProfile profile) {
        super(Ai3dClient.endpoint, Ai3dClient.version, credential, region, profile);
    }

    /**
     *混元生3D接口，基于混元大模型，根据输入的文本描述/图片智能生成3D。
默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req QueryHunyuanTo3DJobRequest
     * @return QueryHunyuanTo3DJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryHunyuanTo3DJobResponse QueryHunyuanTo3DJob(QueryHunyuanTo3DJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryHunyuanTo3DJob", QueryHunyuanTo3DJobResponse.class);
    }

    /**
     *混元生3D接口，基于混元大模型，根据输入的文本描述/图片智能生成3D。
默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req QueryHunyuanTo3DProJobRequest
     * @return QueryHunyuanTo3DProJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryHunyuanTo3DProJobResponse QueryHunyuanTo3DProJob(QueryHunyuanTo3DProJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryHunyuanTo3DProJob", QueryHunyuanTo3DProJobResponse.class);
    }

    /**
     *混元生3D接口，基于混元大模型，根据输入的文本描述/图片智能生成3D。
默认提供3个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req QueryHunyuanTo3DRapidJobRequest
     * @return QueryHunyuanTo3DRapidJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryHunyuanTo3DRapidJobResponse QueryHunyuanTo3DRapidJob(QueryHunyuanTo3DRapidJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryHunyuanTo3DRapidJob", QueryHunyuanTo3DRapidJobResponse.class);
    }

    /**
     *混元生3D接口，基于混元大模型，根据输入的文本描述/图片智能生成3D。
默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req SubmitHunyuanTo3DJobRequest
     * @return SubmitHunyuanTo3DJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuanTo3DJobResponse SubmitHunyuanTo3DJob(SubmitHunyuanTo3DJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuanTo3DJob", SubmitHunyuanTo3DJobResponse.class);
    }

    /**
     *混元生3D接口，基于混元大模型，根据输入的文本描述/图片智能生成3D。
默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req SubmitHunyuanTo3DProJobRequest
     * @return SubmitHunyuanTo3DProJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuanTo3DProJobResponse SubmitHunyuanTo3DProJob(SubmitHunyuanTo3DProJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuanTo3DProJob", SubmitHunyuanTo3DProJobResponse.class);
    }

    /**
     *混元生3D接口，基于混元大模型，根据输入的文本描述/图片智能生成3D。
默认提供3个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req SubmitHunyuanTo3DRapidJobRequest
     * @return SubmitHunyuanTo3DRapidJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuanTo3DRapidJobResponse SubmitHunyuanTo3DRapidJob(SubmitHunyuanTo3DRapidJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuanTo3DRapidJob", SubmitHunyuanTo3DRapidJobResponse.class);
    }

}
