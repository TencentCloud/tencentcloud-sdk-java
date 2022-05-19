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
package com.tencentcloudapi.tmt.v20180321;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tmt.v20180321.models.*;

public class TmtClient extends AbstractClient{
    private static String endpoint = "tmt.tencentcloudapi.com";
    private static String service = "tmt";
    private static String version = "2018-03-21";

    public TmtClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TmtClient(Credential credential, String region, ClientProfile profile) {
        super(TmtClient.endpoint, TmtClient.version, credential, region, profile);
    }

    /**
     *提交文档原文内容，输出任务ID， 支持原文为单一语种文档（如出现多语言文档，仅支持以选定的源语言相关内容翻译）,文件格式有pdf、docx、pptx、xlsx，支持的文本格式有txt、xml、html、markdown、properties。任务翻译数据可保存7天，7天后不再返回任务数据。请注意保存。
     * @param req FileTranslateRequest
     * @return FileTranslateResponse
     * @throws TencentCloudSDKException
     */
    public FileTranslateResponse FileTranslate(FileTranslateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FileTranslateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<FileTranslateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FileTranslate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在调用文档翻译请求接口后，有回调和轮询两种方式获取识别结果。
•当采用回调方式时，翻译完成后会将结果通过 POST 请求的形式通知到用户在请求时填写的回调 URL，具体请参见文档翻译结果回调 。
• 当采用轮询方式时，需要主动提交任务ID来轮询识别结果，共有任务成功、等待、执行中和失败四种结果，具体信息请参见参数说明。
     * @param req GetFileTranslateRequest
     * @return GetFileTranslateResponse
     * @throws TencentCloudSDKException
     */
    public GetFileTranslateResponse GetFileTranslate(GetFileTranslateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFileTranslateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetFileTranslateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetFileTranslate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供13种语言的图片翻译服务，可自动识别图片中的文本内容并翻译成目标语言，识别后的文本按行翻译，后续会提供可按段落翻译的版本。<br />
提示：对于一般开发者，我们建议优先使用SDK接入简化开发。SDK使用介绍请直接查看 5. 开发者资源 部分。
     * @param req ImageTranslateRequest
     * @return ImageTranslateResponse
     * @throws TencentCloudSDKException
     */
    public ImageTranslateResponse ImageTranslate(ImageTranslateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImageTranslateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImageTranslateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImageTranslate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *可自动识别文本内容的语言种类，轻量高效，无需额外实现判断方式，使面向客户的服务体验更佳。 <br />
提示：对于一般开发者，我们建议优先使用SDK接入简化开发。SDK使用介绍请直接查看 5. 开发者资源 部分。
     * @param req LanguageDetectRequest
     * @return LanguageDetectResponse
     * @throws TencentCloudSDKException
     */
    public LanguageDetectResponse LanguageDetect(LanguageDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LanguageDetectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<LanguageDetectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LanguageDetect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口提供上传音频，将音频进行语音识别并翻译成文本的服务，目前开放中英互译的语音翻译服务。
待识别和翻译的音频文件可以是 pcm、mp3和speex 格式，pcm采样率要求16kHz、位深16bit、单声道，音频内语音清晰。<br/>
如果采用流式传输的方式，要求每个分片时长200ms~500ms；如果采用非流式的传输方式，要求音频时长不超过8s。注意最后一个分片的IsEnd参数设置为1。<br />
提示：对于一般开发者，我们建议优先使用SDK接入简化开发。SDK使用介绍请直接查看 5. 开发者资源部分。

     * @param req SpeechTranslateRequest
     * @return SpeechTranslateResponse
     * @throws TencentCloudSDKException
     */
    public SpeechTranslateResponse SpeechTranslate(SpeechTranslateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SpeechTranslateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SpeechTranslateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SpeechTranslate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供中文到英文、英文到中文的等多种语言的文本内容翻译服务， 经过大数据语料库、多种解码算法、翻译引擎深度优化，在新闻文章、生活口语等不同语言场景中都有深厚积累，翻译结果专业评价处于行业领先水平。<br />
提示：对于一般开发者，我们建议优先使用SDK接入简化开发。SDK使用介绍请直接查看 5. 开发者资源 部分。

     * @param req TextTranslateRequest
     * @return TextTranslateResponse
     * @throws TencentCloudSDKException
     */
    public TextTranslateResponse TextTranslate(TextTranslateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextTranslateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TextTranslateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextTranslate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *文本翻译的批量接口
     * @param req TextTranslateBatchRequest
     * @return TextTranslateBatchResponse
     * @throws TencentCloudSDKException
     */
    public TextTranslateBatchResponse TextTranslateBatch(TextTranslateBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextTranslateBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TextTranslateBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextTranslateBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
