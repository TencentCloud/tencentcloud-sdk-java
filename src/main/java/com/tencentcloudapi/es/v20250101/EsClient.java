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
package com.tencentcloudapi.es.v20250101;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.es.v20250101.models.*;

public class EsClient extends AbstractClient{
    private static String endpoint = "es.tencentcloudapi.com";
    private static String service = "es";
    private static String version = "2025-01-01";

    public EsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EsClient(Credential credential, String region, ClientProfile profile) {
        super(EsClient.endpoint, EsClient.version, credential, region, profile);
    }

    /**
     *本服务支持一系列高性能的大语言模型，包括DeepSeek以及腾讯自主研发的混元大模型，结合混合搜索等先进搜索技术，快速高效实现RAG，有效解决幻觉和知识更新问题。
本接口有单账号调用上限控制，如您有提高并发限制的需求请[联系我们](https://cloud.tencent.com/act/event/Online_service)  。
     * @param req ChatCompletionsRequest
     * @return ChatCompletionsResponse
     * @throws TencentCloudSDKException
     */
    public ChatCompletionsResponse ChatCompletions(ChatCompletionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChatCompletions", ChatCompletionsResponse.class);
    }

    /**
     *文本切片是将长文本分割为短片段的技术，用于适配模型输入、提升处理效率或信息检索，平衡片段长度与语义连贯性，适用于NLP、数据分析等场景。
本接口为分隔符规则切片接口，有单账号调用上限控制，如您有提高并发限制的需求请 [联系我们](https://cloud.tencent.com/act/event/Online_service)  。
     * @param req ChunkDocumentRequest
     * @return ChunkDocumentResponse
     * @throws TencentCloudSDKException
     */
    public ChunkDocumentResponse ChunkDocument(ChunkDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChunkDocument", ChunkDocumentResponse.class);
    }

    /**
     *文本切片是将长文本分割为短片段的技术，用于适配模型输入、提升处理效率或信息检索，平衡片段长度与语义连贯性，适用于NLP、数据分析等场景。
本接口为异步接口，有单账号调用上限控制，如您有提高并发限制的需求请[联系我们](https://cloud.tencent.com/act/event/Online_service) 。
     * @param req ChunkDocumentAsyncRequest
     * @return ChunkDocumentAsyncResponse
     * @throws TencentCloudSDKException
     */
    public ChunkDocumentAsyncResponse ChunkDocumentAsync(ChunkDocumentAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChunkDocumentAsync", ChunkDocumentAsyncResponse.class);
    }

    /**
     *获取文档切片结果
     * @param req GetDocumentChunkResultRequest
     * @return GetDocumentChunkResultResponse
     * @throws TencentCloudSDKException
     */
    public GetDocumentChunkResultResponse GetDocumentChunkResult(GetDocumentChunkResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDocumentChunkResult", GetDocumentChunkResultResponse.class);
    }

    /**
     *本接口用于获取文档解析异步处理结果。
     * @param req GetDocumentParseResultRequest
     * @return GetDocumentParseResultResponse
     * @throws TencentCloudSDKException
     */
    public GetDocumentParseResultResponse GetDocumentParseResult(GetDocumentParseResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDocumentParseResult", GetDocumentParseResultResponse.class);
    }

    /**
     *Embedding是一种将高维数据映射到低维空间的技术，通常用于将非结构化数据，如文本、图像或音频转化为向量表示，使其更容易输入机器模型进行处理，并且向量之间的距离可以反映对象之间的相似性。
本接口有单账号调用上限控制，如您有提高并发限制的需求请[联系我们](https://cloud.tencent.com/act/event/Online_service)  。
     * @param req GetTextEmbeddingRequest
     * @return GetTextEmbeddingResponse
     * @throws TencentCloudSDKException
     */
    public GetTextEmbeddingResponse GetTextEmbedding(GetTextEmbeddingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTextEmbedding", GetTextEmbeddingResponse.class);
    }

    /**
     *本服务可将各类格式文档精准转换为标准格式，满足企业知识库建设、技术文档迁移、内容平台结构化存储等需求。
本接口有单账号调用上限控制，如您有提高并发限制的需求请[联系我们](https://cloud.tencent.com/act/event/Online_service)。
     * @param req ParseDocumentRequest
     * @return ParseDocumentResponse
     * @throws TencentCloudSDKException
     */
    public ParseDocumentResponse ParseDocument(ParseDocumentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ParseDocument", ParseDocumentResponse.class);
    }

    /**
     *本服务可将各类格式文档精准转换为标准格式，满足企业知识库建设、技术文档迁移、内容平台结构化存储等需求。
本接口为异步接口，有单账号调用上限控制，如您有提高并发限制的需求请[联系我们](https://cloud.tencent.com/act/event/Online_service)  。
     * @param req ParseDocumentAsyncRequest
     * @return ParseDocumentAsyncResponse
     * @throws TencentCloudSDKException
     */
    public ParseDocumentAsyncResponse ParseDocumentAsync(ParseDocumentAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ParseDocumentAsync", ParseDocumentAsyncResponse.class);
    }

    /**
     *重排是指在 RAG 过程中，通过评估文档与查询之间的相关性，将最相关的文档放在前面，确保语言模型在生成回答时优先考虑排名靠前的上下文，提高生成结果的准确性和可信度，也可以通过这种方式进行过滤，减少大模型成本。
本接口有单账号调用上限控制，如您有提高并发限制的需求请[联系我们](https://cloud.tencent.com/act/event/Online_service)  。
     * @param req RunRerankRequest
     * @return RunRerankResponse
     * @throws TencentCloudSDKException
     */
    public RunRerankResponse RunRerank(RunRerankRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunRerank", RunRerankResponse.class);
    }

}
