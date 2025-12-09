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
package com.tencentcloudapi.tms.v20201229;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tms.v20201229.models.*;

public class TmsClient extends AbstractClient{
    private static String endpoint = "tms.tencentcloudapi.com";
    private static String service = "tms";
    private static String version = "2020-12-29";

    public TmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TmsClient(Credential credential, String region, ClientProfile profile) {
        super(TmsClient.endpoint, TmsClient.version, credential, region, profile);
    }

    /**
     *本接口适用于“金融大模型审校”服务。在对接前，请参考快速入门文档并配置好业务基础信息。
- **快速入门**：[快速入门文档](https://cloud.tencent.com/document/product/1124/124604)

### 接口功能说明：
由于大模型审校服务耗时较长，通常达到分钟级，因此采用异步模式，整体流程分为两步：
1. 创建金融大模型审校任务（详见本文档）。
2. 查询审校结果（详见 [查询结果文档](https://cloud.tencent.com/document/product/1124/124463)）。

### 接口调用说明：
- **请求域名**：tms.tencentcloudapi.com
- **并发限制**：每个账号最多可同时进行3个审校任务。
- **支持的文件格式**：纯文本、PDF、DOC、DOCX。

### 文件限制说明：
- **文档大小限制**：PDF/DOC/DOCX 格式文件不超过 200M（该大小为Base64编码后）。
- **文档下载时长**：不超过 15 秒（建议将文档存储在腾讯云 URL，以确保更高的下载稳定性）。
     * @param req CreateFinancialLLMTaskRequest
     * @return CreateFinancialLLMTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateFinancialLLMTaskResponse CreateFinancialLLMTask(CreateFinancialLLMTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFinancialLLMTask", CreateFinancialLLMTaskResponse.class);
    }

    /**
     *本接口适用于“金融大模型审校”服务的结果查询。
     * @param req GetFinancialLLMTaskResultRequest
     * @return GetFinancialLLMTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public GetFinancialLLMTaskResultResponse GetFinancialLLMTaskResult(GetFinancialLLMTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFinancialLLMTaskResult", GetFinancialLLMTaskResultResponse.class);
    }

    /**
     *本接口提供“内容安全”和“AI生成识别”服务。在对接之前，请先参考快速入门，以配置业务基础信息。
- **内容安全**：[快速入门](https://cloud.tencent.com/document/product/1124/37119)
- **AI生成识别**：[快速入门](https://cloud.tencent.com/document/product/1124/118694)

### 接口功能说明：
- **内容安全**：对输入的文本，识别其中是否存在色情、违法等风险，返回处置建议、风险标签及对应的模型阈值。
- **AI生成识别**：对输入的文本，判断其是否为AI工具生成，返回AI生成的概率分数。

### 接口调用说明：
- **请求域名**：tms.tencentcloudapi.com
- **文本长度限制**：最长10,000个字符（以Unicode编码计量）。
- **请求频率**：内容安全默认1000次/秒，AI生成识别默认50次/秒。
- **支持语言**：中文、英文。
     * @param req TextModerationRequest
     * @return TextModerationResponse
     * @throws TencentCloudSDKException
     */
    public TextModerationResponse TextModeration(TextModerationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextModeration", TextModerationResponse.class);
    }

}
