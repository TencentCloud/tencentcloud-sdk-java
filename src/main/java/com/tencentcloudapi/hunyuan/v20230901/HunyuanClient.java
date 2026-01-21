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
package com.tencentcloudapi.hunyuan.v20230901;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.hunyuan.v20230901.models.*;

public class HunyuanClient extends AbstractClient{
    private static String endpoint = "hunyuan.tencentcloudapi.com";
    private static String service = "hunyuan";
    private static String version = "2023-09-01";

    public HunyuanClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public HunyuanClient(Credential credential, String region, ClientProfile profile) {
        super(HunyuanClient.endpoint, HunyuanClient.version, credential, region, profile);
    }

    /**
     *开通服务
     * @param req ActivateServiceRequest
     * @return ActivateServiceResponse
     * @throws TencentCloudSDKException
     */
    public ActivateServiceResponse ActivateService(ActivateServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ActivateService", ActivateServiceResponse.class);
    }

    /**
     *如需使用OpenAI兼容接口， 请参考文档：[OpenAI 兼容接口](https://cloud.tencent.com/document/product/1729/111007)

腾讯混元大模型是由腾讯研发的大语言模型，具备强大的中文创作能力，复杂语境下的逻辑推理能力，以及可靠的任务执行能力。本接口支持流式或非流式调用，当使用流式调用时为 SSE 协议。

 1. 本接口暂不支持返回图片内容。
 2. 默认该接口下单账号限制并发数为  5 路，如您有提高并发限制的需求请 [购买](https://buy.cloud.tencent.com/hunyuan) 。
 3. 请使用 SDK 调用本接口，每种开发语言的 SDK Git 仓库 examples/hunyuan/v20230901/ 目录下有提供示例供参考。SDK 链接在文档下方 “**开发者资源 - SDK**” 部分提供。
 4. 我们推荐您使用 API Explorer，方便快速地在线调试接口和下载各语言的示例代码，[点击打开](https://console.cloud.tencent.com/api/explorer?Product=hunyuan&Version=2023-09-01&Action=ChatCompletions)。
     * @param req ChatCompletionsRequest
     * @return ChatCompletionsResponse
     * @throws TencentCloudSDKException
     */
    public ChatCompletionsResponse ChatCompletions(ChatCompletionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChatCompletions", ChatCompletionsResponse.class);
    }

    /**
     *腾讯混元大模型是由腾讯研发的大语言模型，具备强大的中文创作能力，复杂语境下的逻辑推理能力，以及可靠的任务执行能力。本接口支持流式或非流式调用，当使用流式调用时为 SSE 协议。

 1. 本接口暂不支持返回图片内容。
 2. 默认该接口下单账号限制并发数为  5 路，如您有提高并发限制的需求请 [购买](https://buy.cloud.tencent.com/hunyuan) 。
 3. 请使用 SDK 调用本接口，每种开发语言的 SDK Git 仓库 examples/hunyuan/v20230901/ 目录下有提供示例供参考。SDK 链接在文档下方 “**开发者资源 - SDK**” 部分提供。
 4. 我们推荐您使用 API Explorer，方便快速地在线调试接口和下载各语言的示例代码，[点击打开](https://console.cloud.tencent.com/api/explorer?Product=hunyuan&Version=2023-09-01&Action=ChatCompletions)。
     * @param req ChatTranslationsRequest
     * @return ChatTranslationsResponse
     * @throws TencentCloudSDKException
     */
    public ChatTranslationsResponse ChatTranslations(ChatTranslationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChatTranslations", ChatTranslationsResponse.class);
    }

    /**
     *腾讯混元大模型是由腾讯研发的大语言模型，具备强大的中文创作能力，复杂语境下的逻辑推理能力，以及可靠的任务执行能力。本接口支持流式或非流式调用，当使用流式调用时为 SSE 协议。

 1. 本接口暂不支持返回图片内容。
 2. 默认该接口下单账号限制并发数为  5 路，如您有提高并发限制的需求请 [购买](https://buy.cloud.tencent.com/hunyuan) 。
 3. 请使用 SDK 调用本接口，每种开发语言的 SDK Git 仓库 examples/hunyuan/v20230901/ 目录下有提供示例供参考。SDK 链接在文档下方 “**开发者资源 - SDK**” 部分提供。
 4. 我们推荐您使用 API Explorer，方便快速地在线调试接口和下载各语言的示例代码，[点击打开](https://console.cloud.tencent.com/api/explorer?Product=hunyuan&Version=2023-09-01&Action=ChatCompletions)。
     * @param req CreateThreadRequest
     * @return CreateThreadResponse
     * @throws TencentCloudSDKException
     */
    public CreateThreadResponse CreateThread(CreateThreadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateThread", CreateThreadResponse.class);
    }

    /**
     *混元生3D接口，采用 Polygon 1.5模型，输入3D 高模后，可生成布线规整，较低面数的3D 模型。
默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req Describe3DSmartTopologyJobRequest
     * @return Describe3DSmartTopologyJobResponse
     * @throws TencentCloudSDKException
     */
    public Describe3DSmartTopologyJobResponse Describe3DSmartTopologyJob(Describe3DSmartTopologyJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Describe3DSmartTopologyJob", Describe3DSmartTopologyJobResponse.class);
    }

    /**
     *删除文件。
     * @param req FilesDeletionsRequest
     * @return FilesDeletionsResponse
     * @throws TencentCloudSDKException
     */
    public FilesDeletionsResponse FilesDeletions(FilesDeletionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FilesDeletions", FilesDeletionsResponse.class);
    }

    /**
     *文件列表。
     * @param req FilesListRequest
     * @return FilesListResponse
     * @throws TencentCloudSDKException
     */
    public FilesListResponse FilesList(FilesListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FilesList", FilesListResponse.class);
    }

    /**
     *上传用于不同用途的文件。
当前用途仅支持 hunyuan 等模型的文档理解。
     * @param req FilesUploadsRequest
     * @return FilesUploadsResponse
     * @throws TencentCloudSDKException
     */
    public FilesUploadsResponse FilesUploads(FilesUploadsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FilesUploads", FilesUploadsResponse.class);
    }

    /**
     *腾讯混元 Embedding 接口，可以将文本转化为高质量的向量数据。向量维度为1024维。
     * @param req GetEmbeddingRequest
     * @return GetEmbeddingResponse
     * @throws TencentCloudSDKException
     */
    public GetEmbeddingResponse GetEmbedding(GetEmbeddingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetEmbedding", GetEmbeddingResponse.class);
    }

    /**
     *腾讯混元大模型是由腾讯研发的大语言模型，具备强大的中文创作能力，复杂语境下的逻辑推理能力，以及可靠的任务执行能力。本接口支持流式或非流式调用，当使用流式调用时为 SSE 协议。

 1. 本接口暂不支持返回图片内容。
 2. 默认该接口下单账号限制并发数为  5 路，如您有提高并发限制的需求请 [购买](https://buy.cloud.tencent.com/hunyuan) 。
 3. 请使用 SDK 调用本接口，每种开发语言的 SDK Git 仓库 examples/hunyuan/v20230901/ 目录下有提供示例供参考。SDK 链接在文档下方 “**开发者资源 - SDK**” 部分提供。
 4. 我们推荐您使用 API Explorer，方便快速地在线调试接口和下载各语言的示例代码，[点击打开](https://console.cloud.tencent.com/api/explorer?Product=hunyuan&Version=2023-09-01&Action=ChatCompletions)。
     * @param req GetThreadRequest
     * @return GetThreadResponse
     * @throws TencentCloudSDKException
     */
    public GetThreadResponse GetThread(GetThreadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetThread", GetThreadResponse.class);
    }

    /**
     *腾讯混元大模型是由腾讯研发的大语言模型，具备强大的中文创作能力，复杂语境下的逻辑推理能力，以及可靠的任务执行能力。本接口支持流式或非流式调用，当使用流式调用时为 SSE 协议。

 1. 本接口暂不支持返回图片内容。
 2. 默认该接口下单账号限制并发数为  5 路，如您有提高并发限制的需求请 [购买](https://buy.cloud.tencent.com/hunyuan) 。
 3. 请使用 SDK 调用本接口，每种开发语言的 SDK Git 仓库 examples/hunyuan/v20230901/ 目录下有提供示例供参考。SDK 链接在文档下方 “**开发者资源 - SDK**” 部分提供。
 4. 我们推荐您使用 API Explorer，方便快速地在线调试接口和下载各语言的示例代码，[点击打开](https://console.cloud.tencent.com/api/explorer?Product=hunyuan&Version=2023-09-01&Action=ChatCompletions)。
     * @param req GetThreadMessageRequest
     * @return GetThreadMessageResponse
     * @throws TencentCloudSDKException
     */
    public GetThreadMessageResponse GetThreadMessage(GetThreadMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetThreadMessage", GetThreadMessageResponse.class);
    }

    /**
     *腾讯混元大模型是由腾讯研发的大语言模型，具备强大的中文创作能力，复杂语境下的逻辑推理能力，以及可靠的任务执行能力。本接口支持流式或非流式调用，当使用流式调用时为 SSE 协议。

 1. 本接口暂不支持返回图片内容。
 2. 默认该接口下单账号限制并发数为  5 路，如您有提高并发限制的需求请 [购买](https://buy.cloud.tencent.com/hunyuan) 。
 3. 请使用 SDK 调用本接口，每种开发语言的 SDK Git 仓库 examples/hunyuan/v20230901/ 目录下有提供示例供参考。SDK 链接在文档下方 “**开发者资源 - SDK**” 部分提供。
 4. 我们推荐您使用 API Explorer，方便快速地在线调试接口和下载各语言的示例代码，[点击打开](https://console.cloud.tencent.com/api/explorer?Product=hunyuan&Version=2023-09-01&Action=ChatCompletions)。
     * @param req GetThreadMessageListRequest
     * @return GetThreadMessageListResponse
     * @throws TencentCloudSDKException
     */
    public GetThreadMessageListResponse GetThreadMessageList(GetThreadMessageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetThreadMessageList", GetThreadMessageListResponse.class);
    }

    /**
     *该接口用于计算文本对应Token数、字符数。
     * @param req GetTokenCountRequest
     * @return GetTokenCountResponse
     * @throws TencentCloudSDKException
     */
    public GetTokenCountResponse GetTokenCount(GetTokenCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTokenCount", GetTokenCountResponse.class);
    }

    /**
     *如需使用OpenAI兼容接口， 请参考文档：[OpenAI 兼容接口](https://cloud.tencent.com/document/product/1729/111007)

腾讯混元大模型是由腾讯研发的大语言模型，具备强大的中文创作能力，复杂语境下的逻辑推理能力，以及可靠的任务执行能力。本接口支持流式或非流式调用，当使用流式调用时为 SSE 协议。

 1. 本接口暂不支持返回图片内容。
 2. 默认该接口下单账号限制并发数为  5 路，如您有提高并发限制的需求请 [购买](https://buy.cloud.tencent.com/hunyuan) 。
 3. 请使用 SDK 调用本接口，每种开发语言的 SDK Git 仓库 examples/hunyuan/v20230901/ 目录下有提供示例供参考。SDK 链接在文档下方 “**开发者资源 - SDK**” 部分提供。
 4. 我们推荐您使用 API Explorer，方便快速地在线调试接口和下载各语言的示例代码，[点击打开](https://console.cloud.tencent.com/api/explorer?Product=hunyuan&Version=2023-09-01&Action=ChatCompletions)。
     * @param req GroupChatCompletionsRequest
     * @return GroupChatCompletionsResponse
     * @throws TencentCloudSDKException
     */
    public GroupChatCompletionsResponse GroupChatCompletions(GroupChatCompletionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GroupChatCompletions", GroupChatCompletionsResponse.class);
    }

    /**
     *如需使用OpenAI兼容接口， 请参考文档：[OpenAI 兼容接口](https://cloud.tencent.com/document/product/1729/111007)

腾讯混元大模型是由腾讯研发的大语言模型，具备强大的中文创作能力，复杂语境下的逻辑推理能力，以及可靠的任务执行能力。本接口支持流式或非流式调用，当使用流式调用时为 SSE 协议。

 1. 本接口暂不支持返回图片内容。
 2. 默认该接口下单账号限制并发数为  5 路，如您有提高并发限制的需求请 [购买](https://buy.cloud.tencent.com/hunyuan) 。
 3. 请使用 SDK 调用本接口，每种开发语言的 SDK Git 仓库 examples/hunyuan/v20230901/ 目录下有提供示例供参考。SDK 链接在文档下方 “**开发者资源 - SDK**” 部分提供。
 4. 我们推荐您使用 API Explorer，方便快速地在线调试接口和下载各语言的示例代码，[点击打开](https://console.cloud.tencent.com/api/explorer?Product=hunyuan&Version=2023-09-01&Action=ChatCompletions)。
     * @param req ImageQuestionRequest
     * @return ImageQuestionResponse
     * @throws TencentCloudSDKException
     */
    public ImageQuestionResponse ImageQuestion(ImageQuestionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImageQuestion", ImageQuestionResponse.class);
    }

    /**
     *混元生图（多轮对话）接口基于混元大模型，将根据输入的文本描述生成图像，支持通过多轮对话的方式不断调整图像内容。分为提交任务和查询任务2个接口。
提交任务：输入文本和前置对话 ID 等，提交一个混元生图多轮对话异步任务，获得任务 ID。
查询任务：根据任务 ID 查询任务的处理状态、处理结果，任务处理完成后可获得在上一轮对话基础上继续生成的图像结果。
混元生图（多轮对话）默认提供1个并发任务数，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后才能开始处理下一个任务。
     * @param req QueryHunyuanImageChatJobRequest
     * @return QueryHunyuanImageChatJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryHunyuanImageChatJobResponse QueryHunyuanImageChatJob(QueryHunyuanImageChatJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryHunyuanImageChatJob", QueryHunyuanImageChatJobResponse.class);
    }

    /**
     *混元生图接口基于混元大模型，将根据输入的文本描述，智能生成与之相关的结果图。分为提交任务和查询任务2个接口。
提交任务：输入文本等，提交一个混元生图异步任务，获得任务 ID。
查询任务：根据任务 ID 查询任务的处理状态、处理结果，任务处理完成后可获得生成图像结果。
并发任务数（并发）说明：并发任务数指能同时处理的任务数量。混元生图默认提供1个并发任务数，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后才能开始处理下一个任务。
     * @param req QueryHunyuanImageJobRequest
     * @return QueryHunyuanImageJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryHunyuanImageJobResponse QueryHunyuanImageJob(QueryHunyuanImageJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryHunyuanImageJob", QueryHunyuanImageJobResponse.class);
    }

    /**
     *腾讯混元大模型是由腾讯研发的大语言模型，具备强大的中文创作能力，复杂语境下的逻辑推理能力，以及可靠的任务执行能力。本接口支持流式或非流式调用，当使用流式调用时为 SSE 协议。

 1. 本接口暂不支持返回图片内容。
 2. 默认该接口下单账号限制并发数为  5 路，如您有提高并发限制的需求请 [购买](https://buy.cloud.tencent.com/hunyuan) 。
 3. 请使用 SDK 调用本接口，每种开发语言的 SDK Git 仓库 examples/hunyuan/v20230901/ 目录下有提供示例供参考。SDK 链接在文档下方 “**开发者资源 - SDK**” 部分提供。
 4. 我们推荐您使用 API Explorer，方便快速地在线调试接口和下载各语言的示例代码，[点击打开](https://console.cloud.tencent.com/api/explorer?Product=hunyuan&Version=2023-09-01&Action=ChatCompletions)。
     * @param req RunThreadRequest
     * @return RunThreadResponse
     * @throws TencentCloudSDKException
     */
    public RunThreadResponse RunThread(RunThreadRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunThread", RunThreadResponse.class);
    }

    /**
     *设置付费模式
     * @param req SetPayModeRequest
     * @return SetPayModeResponse
     * @throws TencentCloudSDKException
     */
    public SetPayModeResponse SetPayMode(SetPayModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetPayMode", SetPayModeResponse.class);
    }

    /**
     *混元生3D接口，采用 Polygon 1.5模型，输入3D 高模后，可生成布线规整，较低面数的3D 模型。
默认提供1个并发，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后，才能开始处理下一个任务。
     * @param req Submit3DSmartTopologyJobRequest
     * @return Submit3DSmartTopologyJobResponse
     * @throws TencentCloudSDKException
     */
    public Submit3DSmartTopologyJobResponse Submit3DSmartTopologyJob(Submit3DSmartTopologyJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Submit3DSmartTopologyJob", Submit3DSmartTopologyJobResponse.class);
    }

    /**
     *混元生图（多轮对话）接口基于混元大模型，将根据输入的文本描述生成图像，支持通过多轮对话的方式不断调整图像内容。分为提交任务和查询任务2个接口。
提交任务：输入文本和前置对话 ID 等，提交一个混元生图多轮对话异步任务，获得任务 ID。
查询任务：根据任务 ID 查询任务的处理状态、处理结果，任务处理完成后可获得在上一轮对话基础上继续生成的图像结果。
混元生图（多轮对话）默认提供1个并发任务数，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后才能开始处理下一个任务。
     * @param req SubmitHunyuanImageChatJobRequest
     * @return SubmitHunyuanImageChatJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuanImageChatJobResponse SubmitHunyuanImageChatJob(SubmitHunyuanImageChatJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuanImageChatJob", SubmitHunyuanImageChatJobResponse.class);
    }

    /**
     *混元生图接口基于混元大模型，将根据输入的文本描述，智能生成与之相关的结果图。分为提交任务和查询任务2个接口。
提交任务：输入文本等，提交一个混元生图异步任务，获得任务 ID。
查询任务：根据任务 ID 查询任务的处理状态、处理结果，任务处理完成后可获得生成图像结果。
并发任务数（并发）说明：并发任务数指能同时处理的任务数量。混元生图默认提供1个并发任务数，代表最多能同时处理1个已提交的任务，上一个任务处理完毕后才能开始处理下一个任务。
     * @param req SubmitHunyuanImageJobRequest
     * @return SubmitHunyuanImageJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuanImageJobResponse SubmitHunyuanImageJob(SubmitHunyuanImageJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuanImageJob", SubmitHunyuanImageJobResponse.class);
    }

    /**
     *文生图轻量版接口根据输入的文本描述，智能生成与之相关的结果图。
文生图轻量版默认提供3个并发任务数，代表最多能同时处理3个已提交的任务，上一个任务处理完毕后才能开始处理下一个任务。
     * @param req TextToImageLiteRequest
     * @return TextToImageLiteResponse
     * @throws TencentCloudSDKException
     */
    public TextToImageLiteResponse TextToImageLite(TextToImageLiteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextToImageLite", TextToImageLiteResponse.class);
    }

}
