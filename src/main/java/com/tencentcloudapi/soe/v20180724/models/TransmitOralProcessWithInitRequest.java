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
package com.tencentcloudapi.soe.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransmitOralProcessWithInitRequest  extends AbstractModel{

    /**
    * 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
    */
    @SerializedName("SeqId")
    @Expose
    private Integer SeqId;

    /**
    * 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
    */
    @SerializedName("IsEnd")
    @Expose
    private Integer IsEnd;

    /**
    * 语音文件类型 	1: raw, 2: wav, 3: mp3, 4: speex (语言文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败)。
    */
    @SerializedName("VoiceFileType")
    @Expose
    private Integer VoiceFileType;

    /**
    * 语音编码类型	1:pcm。
    */
    @SerializedName("VoiceEncodeType")
    @Expose
    private Integer VoiceEncodeType;

    /**
    * 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为0.5k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
    */
    @SerializedName("UserVoiceData")
    @Expose
    private String UserVoiceData;

    /**
    * 语音段唯一标识，一个完整语音一个SessionId。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 被评估语音对应的文本，句子模式下不超过个 20 单词或者中文文字，段落模式不超过 120 单词或者中文文字，中文评估使用 utf-8 编码，自由说模式该值无效。如需要在单词模式和句子模式下使用自定义音素，可以通过设置 TextMode 使用[音素标注](https://cloud.tencent.com/document/product/884/33698)。
    */
    @SerializedName("RefText")
    @Expose
    private String RefText;

    /**
    * 语音输入模式，0：流式分片，1：非流式一次性评估
    */
    @SerializedName("WorkMode")
    @Expose
    private Integer WorkMode;

    /**
    * 评估模式，0：词模式（中文评测模式下为文字模式），1：句子模式，2：段落模式，3：自由说模式，当为词模式评估时，能够提供每个音节的评估信息，当为句子模式时，能够提供完整度和流利度信息，4：单词纠错模式：能够对单词和句子中的读错读音进行纠正，给出参考正确读音。
    */
    @SerializedName("EvalMode")
    @Expose
    private Integer EvalMode;

    /**
    * 评价苛刻指数，取值为[1.0 - 4.0]范围内的浮点数，用于平滑不同年龄段的分数，1.0为小年龄段，4.0为最高年龄段
    */
    @SerializedName("ScoreCoeff")
    @Expose
    private Float ScoreCoeff;

    /**
    * 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。
    */
    @SerializedName("SoeAppId")
    @Expose
    private String SoeAppId;

    /**
    * 音频存储模式，0：不存储，1：存储到公共对象存储，输出结果为该会话最后一个分片TransmitOralProcess 返回结果 AudioUrl 字段，2：永久存储音频，需要提工单申请，会产生一定存储费用，3：自定义存储，将音频存储到自定义的腾讯云[对象存储](https://cloud.tencent.com/product/cos)中，需要提工单登记存储信息。
    */
    @SerializedName("StorageMode")
    @Expose
    private Integer StorageMode;

    /**
    * 输出断句中间结果标识，0：不输出，1：输出，通过设置该参数，可以在评估过程中的分片传输请求中，返回已经评估断句的中间结果，中间结果可用于客户端 UI 更新，输出结果为TransmitOralProcess请求返回结果 SentenceInfoSet 字段。
    */
    @SerializedName("SentenceInfoEnabled")
    @Expose
    private Integer SentenceInfoEnabled;

    /**
    * 评估语言，0：英文，1：中文。
    */
    @SerializedName("ServerType")
    @Expose
    private Integer ServerType;

    /**
    * 异步模式标识，0：同步模式，1：异步模式，可选值参考[服务模式](https://cloud.tencent.com/document/product/884/33697)。
    */
    @SerializedName("IsAsync")
    @Expose
    private Integer IsAsync;

    /**
    * 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
    */
    @SerializedName("IsQuery")
    @Expose
    private Integer IsQuery;

    /**
    * 输入文本模式，0: 普通文本，1：[音素结构](https://cloud.tencent.com/document/product/884/33698)文本。2：音素注册模式（提工单注册需要使用音素的单词）。
    */
    @SerializedName("TextMode")
    @Expose
    private Integer TextMode;

    /**
     * 获取流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
     * @return SeqId 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
     */
    public Integer getSeqId() {
        return this.SeqId;
    }

    /**
     * 设置流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
     * @param SeqId 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
     */
    public void setSeqId(Integer SeqId) {
        this.SeqId = SeqId;
    }

    /**
     * 获取是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
     * @return IsEnd 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
     */
    public Integer getIsEnd() {
        return this.IsEnd;
    }

    /**
     * 设置是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
     * @param IsEnd 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
     */
    public void setIsEnd(Integer IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * 获取语音文件类型 	1: raw, 2: wav, 3: mp3, 4: speex (语言文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败)。
     * @return VoiceFileType 语音文件类型 	1: raw, 2: wav, 3: mp3, 4: speex (语言文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败)。
     */
    public Integer getVoiceFileType() {
        return this.VoiceFileType;
    }

    /**
     * 设置语音文件类型 	1: raw, 2: wav, 3: mp3, 4: speex (语言文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败)。
     * @param VoiceFileType 语音文件类型 	1: raw, 2: wav, 3: mp3, 4: speex (语言文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败)。
     */
    public void setVoiceFileType(Integer VoiceFileType) {
        this.VoiceFileType = VoiceFileType;
    }

    /**
     * 获取语音编码类型	1:pcm。
     * @return VoiceEncodeType 语音编码类型	1:pcm。
     */
    public Integer getVoiceEncodeType() {
        return this.VoiceEncodeType;
    }

    /**
     * 设置语音编码类型	1:pcm。
     * @param VoiceEncodeType 语音编码类型	1:pcm。
     */
    public void setVoiceEncodeType(Integer VoiceEncodeType) {
        this.VoiceEncodeType = VoiceEncodeType;
    }

    /**
     * 获取当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为0.5k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
     * @return UserVoiceData 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为0.5k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
     */
    public String getUserVoiceData() {
        return this.UserVoiceData;
    }

    /**
     * 设置当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为0.5k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
     * @param UserVoiceData 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为0.5k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
     */
    public void setUserVoiceData(String UserVoiceData) {
        this.UserVoiceData = UserVoiceData;
    }

    /**
     * 获取语音段唯一标识，一个完整语音一个SessionId。
     * @return SessionId 语音段唯一标识，一个完整语音一个SessionId。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置语音段唯一标识，一个完整语音一个SessionId。
     * @param SessionId 语音段唯一标识，一个完整语音一个SessionId。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 获取被评估语音对应的文本，句子模式下不超过个 20 单词或者中文文字，段落模式不超过 120 单词或者中文文字，中文评估使用 utf-8 编码，自由说模式该值无效。如需要在单词模式和句子模式下使用自定义音素，可以通过设置 TextMode 使用[音素标注](https://cloud.tencent.com/document/product/884/33698)。
     * @return RefText 被评估语音对应的文本，句子模式下不超过个 20 单词或者中文文字，段落模式不超过 120 单词或者中文文字，中文评估使用 utf-8 编码，自由说模式该值无效。如需要在单词模式和句子模式下使用自定义音素，可以通过设置 TextMode 使用[音素标注](https://cloud.tencent.com/document/product/884/33698)。
     */
    public String getRefText() {
        return this.RefText;
    }

    /**
     * 设置被评估语音对应的文本，句子模式下不超过个 20 单词或者中文文字，段落模式不超过 120 单词或者中文文字，中文评估使用 utf-8 编码，自由说模式该值无效。如需要在单词模式和句子模式下使用自定义音素，可以通过设置 TextMode 使用[音素标注](https://cloud.tencent.com/document/product/884/33698)。
     * @param RefText 被评估语音对应的文本，句子模式下不超过个 20 单词或者中文文字，段落模式不超过 120 单词或者中文文字，中文评估使用 utf-8 编码，自由说模式该值无效。如需要在单词模式和句子模式下使用自定义音素，可以通过设置 TextMode 使用[音素标注](https://cloud.tencent.com/document/product/884/33698)。
     */
    public void setRefText(String RefText) {
        this.RefText = RefText;
    }

    /**
     * 获取语音输入模式，0：流式分片，1：非流式一次性评估
     * @return WorkMode 语音输入模式，0：流式分片，1：非流式一次性评估
     */
    public Integer getWorkMode() {
        return this.WorkMode;
    }

    /**
     * 设置语音输入模式，0：流式分片，1：非流式一次性评估
     * @param WorkMode 语音输入模式，0：流式分片，1：非流式一次性评估
     */
    public void setWorkMode(Integer WorkMode) {
        this.WorkMode = WorkMode;
    }

    /**
     * 获取评估模式，0：词模式（中文评测模式下为文字模式），1：句子模式，2：段落模式，3：自由说模式，当为词模式评估时，能够提供每个音节的评估信息，当为句子模式时，能够提供完整度和流利度信息，4：单词纠错模式：能够对单词和句子中的读错读音进行纠正，给出参考正确读音。
     * @return EvalMode 评估模式，0：词模式（中文评测模式下为文字模式），1：句子模式，2：段落模式，3：自由说模式，当为词模式评估时，能够提供每个音节的评估信息，当为句子模式时，能够提供完整度和流利度信息，4：单词纠错模式：能够对单词和句子中的读错读音进行纠正，给出参考正确读音。
     */
    public Integer getEvalMode() {
        return this.EvalMode;
    }

    /**
     * 设置评估模式，0：词模式（中文评测模式下为文字模式），1：句子模式，2：段落模式，3：自由说模式，当为词模式评估时，能够提供每个音节的评估信息，当为句子模式时，能够提供完整度和流利度信息，4：单词纠错模式：能够对单词和句子中的读错读音进行纠正，给出参考正确读音。
     * @param EvalMode 评估模式，0：词模式（中文评测模式下为文字模式），1：句子模式，2：段落模式，3：自由说模式，当为词模式评估时，能够提供每个音节的评估信息，当为句子模式时，能够提供完整度和流利度信息，4：单词纠错模式：能够对单词和句子中的读错读音进行纠正，给出参考正确读音。
     */
    public void setEvalMode(Integer EvalMode) {
        this.EvalMode = EvalMode;
    }

    /**
     * 获取评价苛刻指数，取值为[1.0 - 4.0]范围内的浮点数，用于平滑不同年龄段的分数，1.0为小年龄段，4.0为最高年龄段
     * @return ScoreCoeff 评价苛刻指数，取值为[1.0 - 4.0]范围内的浮点数，用于平滑不同年龄段的分数，1.0为小年龄段，4.0为最高年龄段
     */
    public Float getScoreCoeff() {
        return this.ScoreCoeff;
    }

    /**
     * 设置评价苛刻指数，取值为[1.0 - 4.0]范围内的浮点数，用于平滑不同年龄段的分数，1.0为小年龄段，4.0为最高年龄段
     * @param ScoreCoeff 评价苛刻指数，取值为[1.0 - 4.0]范围内的浮点数，用于平滑不同年龄段的分数，1.0为小年龄段，4.0为最高年龄段
     */
    public void setScoreCoeff(Float ScoreCoeff) {
        this.ScoreCoeff = ScoreCoeff;
    }

    /**
     * 获取业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。
     * @return SoeAppId 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。
     */
    public String getSoeAppId() {
        return this.SoeAppId;
    }

    /**
     * 设置业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。
     * @param SoeAppId 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。
     */
    public void setSoeAppId(String SoeAppId) {
        this.SoeAppId = SoeAppId;
    }

    /**
     * 获取音频存储模式，0：不存储，1：存储到公共对象存储，输出结果为该会话最后一个分片TransmitOralProcess 返回结果 AudioUrl 字段，2：永久存储音频，需要提工单申请，会产生一定存储费用，3：自定义存储，将音频存储到自定义的腾讯云[对象存储](https://cloud.tencent.com/product/cos)中，需要提工单登记存储信息。
     * @return StorageMode 音频存储模式，0：不存储，1：存储到公共对象存储，输出结果为该会话最后一个分片TransmitOralProcess 返回结果 AudioUrl 字段，2：永久存储音频，需要提工单申请，会产生一定存储费用，3：自定义存储，将音频存储到自定义的腾讯云[对象存储](https://cloud.tencent.com/product/cos)中，需要提工单登记存储信息。
     */
    public Integer getStorageMode() {
        return this.StorageMode;
    }

    /**
     * 设置音频存储模式，0：不存储，1：存储到公共对象存储，输出结果为该会话最后一个分片TransmitOralProcess 返回结果 AudioUrl 字段，2：永久存储音频，需要提工单申请，会产生一定存储费用，3：自定义存储，将音频存储到自定义的腾讯云[对象存储](https://cloud.tencent.com/product/cos)中，需要提工单登记存储信息。
     * @param StorageMode 音频存储模式，0：不存储，1：存储到公共对象存储，输出结果为该会话最后一个分片TransmitOralProcess 返回结果 AudioUrl 字段，2：永久存储音频，需要提工单申请，会产生一定存储费用，3：自定义存储，将音频存储到自定义的腾讯云[对象存储](https://cloud.tencent.com/product/cos)中，需要提工单登记存储信息。
     */
    public void setStorageMode(Integer StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * 获取输出断句中间结果标识，0：不输出，1：输出，通过设置该参数，可以在评估过程中的分片传输请求中，返回已经评估断句的中间结果，中间结果可用于客户端 UI 更新，输出结果为TransmitOralProcess请求返回结果 SentenceInfoSet 字段。
     * @return SentenceInfoEnabled 输出断句中间结果标识，0：不输出，1：输出，通过设置该参数，可以在评估过程中的分片传输请求中，返回已经评估断句的中间结果，中间结果可用于客户端 UI 更新，输出结果为TransmitOralProcess请求返回结果 SentenceInfoSet 字段。
     */
    public Integer getSentenceInfoEnabled() {
        return this.SentenceInfoEnabled;
    }

    /**
     * 设置输出断句中间结果标识，0：不输出，1：输出，通过设置该参数，可以在评估过程中的分片传输请求中，返回已经评估断句的中间结果，中间结果可用于客户端 UI 更新，输出结果为TransmitOralProcess请求返回结果 SentenceInfoSet 字段。
     * @param SentenceInfoEnabled 输出断句中间结果标识，0：不输出，1：输出，通过设置该参数，可以在评估过程中的分片传输请求中，返回已经评估断句的中间结果，中间结果可用于客户端 UI 更新，输出结果为TransmitOralProcess请求返回结果 SentenceInfoSet 字段。
     */
    public void setSentenceInfoEnabled(Integer SentenceInfoEnabled) {
        this.SentenceInfoEnabled = SentenceInfoEnabled;
    }

    /**
     * 获取评估语言，0：英文，1：中文。
     * @return ServerType 评估语言，0：英文，1：中文。
     */
    public Integer getServerType() {
        return this.ServerType;
    }

    /**
     * 设置评估语言，0：英文，1：中文。
     * @param ServerType 评估语言，0：英文，1：中文。
     */
    public void setServerType(Integer ServerType) {
        this.ServerType = ServerType;
    }

    /**
     * 获取异步模式标识，0：同步模式，1：异步模式，可选值参考[服务模式](https://cloud.tencent.com/document/product/884/33697)。
     * @return IsAsync 异步模式标识，0：同步模式，1：异步模式，可选值参考[服务模式](https://cloud.tencent.com/document/product/884/33697)。
     */
    public Integer getIsAsync() {
        return this.IsAsync;
    }

    /**
     * 设置异步模式标识，0：同步模式，1：异步模式，可选值参考[服务模式](https://cloud.tencent.com/document/product/884/33697)。
     * @param IsAsync 异步模式标识，0：同步模式，1：异步模式，可选值参考[服务模式](https://cloud.tencent.com/document/product/884/33697)。
     */
    public void setIsAsync(Integer IsAsync) {
        this.IsAsync = IsAsync;
    }

    /**
     * 获取查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
     * @return IsQuery 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
     */
    public Integer getIsQuery() {
        return this.IsQuery;
    }

    /**
     * 设置查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
     * @param IsQuery 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
     */
    public void setIsQuery(Integer IsQuery) {
        this.IsQuery = IsQuery;
    }

    /**
     * 获取输入文本模式，0: 普通文本，1：[音素结构](https://cloud.tencent.com/document/product/884/33698)文本。2：音素注册模式（提工单注册需要使用音素的单词）。
     * @return TextMode 输入文本模式，0: 普通文本，1：[音素结构](https://cloud.tencent.com/document/product/884/33698)文本。2：音素注册模式（提工单注册需要使用音素的单词）。
     */
    public Integer getTextMode() {
        return this.TextMode;
    }

    /**
     * 设置输入文本模式，0: 普通文本，1：[音素结构](https://cloud.tencent.com/document/product/884/33698)文本。2：音素注册模式（提工单注册需要使用音素的单词）。
     * @param TextMode 输入文本模式，0: 普通文本，1：[音素结构](https://cloud.tencent.com/document/product/884/33698)文本。2：音素注册模式（提工单注册需要使用音素的单词）。
     */
    public void setTextMode(Integer TextMode) {
        this.TextMode = TextMode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SeqId", this.SeqId);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);
        this.setParamSimple(map, prefix + "VoiceFileType", this.VoiceFileType);
        this.setParamSimple(map, prefix + "VoiceEncodeType", this.VoiceEncodeType);
        this.setParamSimple(map, prefix + "UserVoiceData", this.UserVoiceData);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RefText", this.RefText);
        this.setParamSimple(map, prefix + "WorkMode", this.WorkMode);
        this.setParamSimple(map, prefix + "EvalMode", this.EvalMode);
        this.setParamSimple(map, prefix + "ScoreCoeff", this.ScoreCoeff);
        this.setParamSimple(map, prefix + "SoeAppId", this.SoeAppId);
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "SentenceInfoEnabled", this.SentenceInfoEnabled);
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);
        this.setParamSimple(map, prefix + "IsAsync", this.IsAsync);
        this.setParamSimple(map, prefix + "IsQuery", this.IsQuery);
        this.setParamSimple(map, prefix + "TextMode", this.TextMode);

    }
}

