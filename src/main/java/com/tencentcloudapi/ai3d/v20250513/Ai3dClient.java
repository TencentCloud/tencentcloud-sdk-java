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
     *输入3D模型文件后，可进行3D模型文件格式转换。
     * @param req Convert3DFormatRequest
     * @return Convert3DFormatResponse
     * @throws TencentCloudSDKException
     */
    public Convert3DFormatResponse Convert3DFormat(Convert3DFormatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Convert3DFormat", Convert3DFormatResponse.class);
    }

    /**
     *查询组件拆分任务。
     * @param req DescribeHunyuanTo3DUVJobRequest
     * @return DescribeHunyuanTo3DUVJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHunyuanTo3DUVJobResponse DescribeHunyuanTo3DUVJob(DescribeHunyuanTo3DUVJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHunyuanTo3DUVJob", DescribeHunyuanTo3DUVJobResponse.class);
    }

    /**
     *混元生3D接口，采用 Polygon 1.5模型，输入3D 高模后，可生成布线规整，较低面数的3D 模型。
默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req DescribeReduceFaceJobRequest
     * @return DescribeReduceFaceJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReduceFaceJobResponse DescribeReduceFaceJob(DescribeReduceFaceJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReduceFaceJob", DescribeReduceFaceJobResponse.class);
    }

    /**
     *混元生3D接口，输入单几何模型和参考图或文字描述后，可生成对应的纹理贴图。
默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req DescribeTextureTo3DJobRequest
     * @return DescribeTextureTo3DJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTextureTo3DJobResponse DescribeTextureTo3DJob(DescribeTextureTo3DJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTextureTo3DJob", DescribeTextureTo3DJobResponse.class);
    }

    /**
     *查询组件生成任务。
     * @param req QueryHunyuan3DPartJobRequest
     * @return QueryHunyuan3DPartJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryHunyuan3DPartJobResponse QueryHunyuan3DPartJob(QueryHunyuan3DPartJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryHunyuan3DPartJob", QueryHunyuan3DPartJobResponse.class);
    }

    /**
     *混元生3D接口，基于混元大模型，根据输入的文本描述/图片智能生成3D。
默认提供3个并发，代表最多能同时处理3个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
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
默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req QueryHunyuanTo3DRapidJobRequest
     * @return QueryHunyuanTo3DRapidJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryHunyuanTo3DRapidJobResponse QueryHunyuanTo3DRapidJob(QueryHunyuanTo3DRapidJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryHunyuanTo3DRapidJob", QueryHunyuanTo3DRapidJobResponse.class);
    }

    /**
     *输入3D模型文件后，根据模型结构自动进行组件识别生成。
     * @param req SubmitHunyuan3DPartJobRequest
     * @return SubmitHunyuan3DPartJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuan3DPartJobResponse SubmitHunyuan3DPartJob(SubmitHunyuan3DPartJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuan3DPartJob", SubmitHunyuan3DPartJobResponse.class);
    }

    /**
     *混元生3D接口，基于混元大模型，根据输入的文本描述/图片智能生成3D。
默认提供3个并发，代表最多能同时处理3个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
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
默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req SubmitHunyuanTo3DRapidJobRequest
     * @return SubmitHunyuanTo3DRapidJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuanTo3DRapidJobResponse SubmitHunyuanTo3DRapidJob(SubmitHunyuanTo3DRapidJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuanTo3DRapidJob", SubmitHunyuanTo3DRapidJobResponse.class);
    }

    /**
     *输入模型后，可根据模型纹理进行UV展开，输出对应UV贴图。
     * @param req SubmitHunyuanTo3DUVJobRequest
     * @return SubmitHunyuanTo3DUVJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuanTo3DUVJobResponse SubmitHunyuanTo3DUVJob(SubmitHunyuanTo3DUVJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuanTo3DUVJob", SubmitHunyuanTo3DUVJobResponse.class);
    }

    /**
     *混元生3D接口，采用 Polygon 1.5模型，输入3D 高模后，可生成布线规整，较低面数的3D 模型。
默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req SubmitReduceFaceJobRequest
     * @return SubmitReduceFaceJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitReduceFaceJobResponse SubmitReduceFaceJob(SubmitReduceFaceJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitReduceFaceJob", SubmitReduceFaceJobResponse.class);
    }

    /**
     *混元生3D接口，输入单几何模型和参考图或文字描述后，可生成对应的纹理贴图。
默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req SubmitTextureTo3DJobRequest
     * @return SubmitTextureTo3DJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTextureTo3DJobResponse SubmitTextureTo3DJob(SubmitTextureTo3DJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitTextureTo3DJob", SubmitTextureTo3DJobResponse.class);
    }

}
