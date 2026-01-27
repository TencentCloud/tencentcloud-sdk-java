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
     *智能识别并纠正句子中的语法、拼写、用词等错误，确保文本的准确性和可读性。
     * @param req SentenceCorrectionRequest
     * @return SentenceCorrectionResponse
     * @throws TencentCloudSDKException
     */
    public SentenceCorrectionResponse SentenceCorrection(SentenceCorrectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SentenceCorrection", SentenceCorrectionResponse.class);
    }

}
