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
package com.tencentcloudapi.nlp.v20190408;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.nlp.v20190408.models.*;

public class NlpClient extends AbstractClient{
    private static String endpoint = "nlp.tencentcloudapi.com";
    private static String service = "nlp";
    private static String version = "2019-04-08";

    public NlpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public NlpClient(Credential credential, String region, ClientProfile profile) {
        super(NlpClient.endpoint, NlpClient.version, credential, region, profile);
    }

    /**
     *情感分析接口能够对带有情感色彩的主观性文本进行分析、处理、归纳和推理，识别出用户的情感倾向，是积极、中性还是消极，并且提供各自概率。
     * @param req AnalyzeSentimentRequest
     * @return AnalyzeSentimentResponse
     * @throws TencentCloudSDKException
     */
    public AnalyzeSentimentResponse AnalyzeSentiment(AnalyzeSentimentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AnalyzeSentiment", AnalyzeSentimentResponse.class);
    }

    /**
     *文本分类接口能够对用户输入的文章进行自动分类，将其映射到具体的类目上，用户只需要提供待分类的文本，而无需关注具体实现。该功能定义了一套较为完备的[三级分类体系](https://cloud.tencent.com/document/product/271/94286)，积累了数百万的语料，经过多轮迭代优化打造了较先进的深度学习模型，以保证效果不断提升。
     * @param req ClassifyContentRequest
     * @return ClassifyContentResponse
     * @throws TencentCloudSDKException
     */
    public ClassifyContentResponse ClassifyContent(ClassifyContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClassifyContent", ClassifyContentResponse.class);
    }

    /**
     *对联生成接口根据用户输入的命题关键词，智能生成一副完整的春联，包括上联、下联和横批。该接口利用先进的自然语言处理技术，确保生成的春联既符合传统对仗、对韵、对义的要求，又具有新意和创意，为用户提供独特的春节祝福。
     * @param req ComposeCoupletRequest
     * @return ComposeCoupletResponse
     * @throws TencentCloudSDKException
     */
    public ComposeCoupletResponse ComposeCouplet(ComposeCoupletRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ComposeCouplet", ComposeCoupletResponse.class);
    }

    /**
     *诗词生成接口利用现代的自然语言处理和深度学习技术，模仿了古代著名诗人的风格，为用户产生独特的诗词。用户只需输入的命题关键词，接口就能自动生成一首七言律诗或五言律诗。
     * @param req ComposePoetryRequest
     * @return ComposePoetryResponse
     * @throws TencentCloudSDKException
     */
    public ComposePoetryResponse ComposePoetry(ComposePoetryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ComposePoetry", ComposePoetryResponse.class);
    }

    /**
     *通过计算句子间的语义相似性，帮助您快速找到文本中重复或相似的句子，用于文本聚类、相似问题检索等应用场景。
     * @param req EvaluateSentenceSimilarityRequest
     * @return EvaluateSentenceSimilarityResponse
     * @throws TencentCloudSDKException
     */
    public EvaluateSentenceSimilarityResponse EvaluateSentenceSimilarity(EvaluateSentenceSimilarityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EvaluateSentenceSimilarity", EvaluateSentenceSimilarityResponse.class);
    }

    /**
     *评估两个词语在语义空间的相似程度，为您的场景应用提供有力支持，如关键词过滤、热门话题挖掘等。（目前仅支持中文）
     * @param req EvaluateWordSimilarityRequest
     * @return EvaluateWordSimilarityResponse
     * @throws TencentCloudSDKException
     */
    public EvaluateWordSimilarityResponse EvaluateWordSimilarity(EvaluateWordSimilarityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EvaluateWordSimilarity", EvaluateWordSimilarityResponse.class);
    }

    /**
     *根据提供的关键词，生成简洁明了的关键句子，便于用户快速获取核心观点。
     * @param req GenerateKeywordSentenceRequest
     * @return GenerateKeywordSentenceResponse
     * @throws TencentCloudSDKException
     */
    public GenerateKeywordSentenceResponse GenerateKeywordSentence(GenerateKeywordSentenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateKeywordSentence", GenerateKeywordSentenceResponse.class);
    }

    /**
     *通过精准地对文本进行分词、词性标注、命名实体识别等功能，助您更好地理解文本内容，挖掘出潜在的价值信息。
     * @param req ParseWordsRequest
     * @return ParseWordsResponse
     * @throws TencentCloudSDKException
     */
    public ParseWordsResponse ParseWords(ParseWordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ParseWords", ParseWordsResponse.class);
    }

    /**
     *基于大数据和深度学习技术，可以快速地找到与给定词语高度相似的其他词语，有助于提高搜索和推荐的准确性。（目前仅支持中文）
     * @param req RetrieveSimilarWordsRequest
     * @return RetrieveSimilarWordsResponse
     * @throws TencentCloudSDKException
     */
    public RetrieveSimilarWordsResponse RetrieveSimilarWords(RetrieveSimilarWordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetrieveSimilarWords", RetrieveSimilarWordsResponse.class);
    }

    /**
     *智能识别并纠正句子中的语法、拼写、用词等错误，确保文本的准确性和可读性。
     * @param req SentenceCorrectionRequest
     * @return SentenceCorrectionResponse
     * @throws TencentCloudSDKException
     */
    public SentenceCorrectionResponse SentenceCorrection(SentenceCorrectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SentenceCorrection", SentenceCorrectionResponse.class);
    }

    /**
     *运用先进的自然语言处理技术，对原始文本进行优化润色，提升文本的通顺性、表达力和语言质量。
     * @param req TextEmbellishRequest
     * @return TextEmbellishResponse
     * @throws TencentCloudSDKException
     */
    public TextEmbellishResponse TextEmbellish(TextEmbellishRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextEmbellish", TextEmbellishResponse.class);
    }

    /**
     *通过自动补全文本片段，帮助用户快速生成高质量、连贯的完整文本，提高创作效率。
     * @param req TextWritingRequest
     * @return TextWritingResponse
     * @throws TencentCloudSDKException
     */
    public TextWritingResponse TextWriting(TextWritingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextWriting", TextWritingResponse.class);
    }

}
