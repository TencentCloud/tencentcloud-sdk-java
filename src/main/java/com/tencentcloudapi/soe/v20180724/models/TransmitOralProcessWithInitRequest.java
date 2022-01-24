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

public class TransmitOralProcessWithInitRequest extends AbstractModel{

    /**
    * 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
注意：序号上限为3000，不能超过上限。
    */
    @SerializedName("SeqId")
    @Expose
    private Long SeqId;

    /**
    * 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
    */
    @SerializedName("IsEnd")
    @Expose
    private Long IsEnd;

    /**
    * 语音文件类型
1: raw
2: wav
3: mp3
4: speex
语音文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败。
    */
    @SerializedName("VoiceFileType")
    @Expose
    private Long VoiceFileType;

    /**
    * 语音编码类型
1:pcm
    */
    @SerializedName("VoiceEncodeType")
    @Expose
    private Long VoiceEncodeType;

    /**
    * 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为1k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
    */
    @SerializedName("UserVoiceData")
    @Expose
    private String UserVoiceData;

    /**
    * 语音段唯一标识，一段完整语音使用一个SessionId，不同语音段的评测需要使用不同的SessionId。一般使用uuid(通用唯一识别码)来作为它的值，要尽量保证SessionId的唯一性。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 被评估语音对应的文本，仅支持中文和英文。
句子模式下不超过个 30 单词或者中文文字，段落模式不超过 120 单词或者中文文字，中文评估使用 utf-8 编码，自由说模式RefText可以不填。
关于RefText的文本键入要求，请参考[评测模式介绍](https://cloud.tencent.com/document/product/884/56131)。
如需要在评测模式下使用自定义注音（支持中英文），可以通过设置「TextMode」参数实现，设置方式请参考[音素标注](https://cloud.tencent.com/document/product/884/33698)。
    */
    @SerializedName("RefText")
    @Expose
    private String RefText;

    /**
    * 语音输入模式
0：流式分片
1：非流式一次性评估
推荐使用流式分片传输。
    */
    @SerializedName("WorkMode")
    @Expose
    private Long WorkMode;

    /**
    * 评测模式
0：单词/单字模式（中文评测模式下为单字模式）
1：句子模式
2：段落模式
3：自由说模式
4：单词音素纠错模式
5：情景评测模式
6：句子多分支评测模式
7：单词实时评测模式
8：拼音评测模式
关于每种评测模式的详细介绍，以及适用场景，请参考[评测模式介绍](https://cloud.tencent.com/document/product/884/56131)。
    */
    @SerializedName("EvalMode")
    @Expose
    private Long EvalMode;

    /**
    * 评价苛刻指数。取值为[1.0 - 4.0]范围内的浮点数，用于平滑不同年龄段的分数。
1.0：适用于最小年龄段用户，一般对应儿童应用场景；
4.0：适用于最高年龄段用户，一般对应成人严格打分场景。
    */
    @SerializedName("ScoreCoeff")
    @Expose
    private Float ScoreCoeff;

    /**
    * 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。如果没有新建SoeAppId，请勿填入该参数，否则会报欠费错误。
    */
    @SerializedName("SoeAppId")
    @Expose
    private String SoeAppId;

    /**
    * 音频存储模式，此参数已废弃，无需设置，设置与否都默认为0不存储；
注：有存储需求的用户建议自行存储至腾讯云COS[对象存储](https://cloud.tencent.com/product/cos)使用。
    */
    @SerializedName("StorageMode")
    @Expose
    private Long StorageMode;

    /**
    * 输出断句中间结果标识
0：不输出
1：输出，通过设置该参数
可以在评估过程中的分片传输请求中，返回已经评估断句的中间结果，中间结果可用于客户端 UI 更新，输出结果为TransmitOralProcess请求返回结果 SentenceInfoSet 字段。
    */
    @SerializedName("SentenceInfoEnabled")
    @Expose
    private Long SentenceInfoEnabled;

    /**
    * 评估语言
0：英文
1：中文
ServerType不填默认为0
    */
    @SerializedName("ServerType")
    @Expose
    private Long ServerType;

    /**
    * 异步模式标识
0：同步模式
1：异步模式（一般情况不建议使用异步模式）
可选值参考[服务模式](https://cloud.tencent.com/document/product/884/33697)。
    */
    @SerializedName("IsAsync")
    @Expose
    private Long IsAsync;

    /**
    * 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
    */
    @SerializedName("IsQuery")
    @Expose
    private Long IsQuery;

    /**
    * 输入文本模式
0: 普通文本
1：[音素结构](https://cloud.tencent.com/document/product/884/33698)文本
2：音素注册模式（提工单注册需要使用音素的单词）。
    */
    @SerializedName("TextMode")
    @Expose
    private Long TextMode;

    /**
     * Get 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
注意：序号上限为3000，不能超过上限。 
     * @return SeqId 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
注意：序号上限为3000，不能超过上限。
     */
    public Long getSeqId() {
        return this.SeqId;
    }

    /**
     * Set 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
注意：序号上限为3000，不能超过上限。
     * @param SeqId 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，当IsLongLifeSession不为1且为非流式模式时无意义。
注意：序号上限为3000，不能超过上限。
     */
    public void setSeqId(Long SeqId) {
        this.SeqId = SeqId;
    }

    /**
     * Get 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。 
     * @return IsEnd 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
     */
    public Long getIsEnd() {
        return this.IsEnd;
    }

    /**
     * Set 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
     * @param IsEnd 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义。
     */
    public void setIsEnd(Long IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * Get 语音文件类型
1: raw
2: wav
3: mp3
4: speex
语音文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败。 
     * @return VoiceFileType 语音文件类型
1: raw
2: wav
3: mp3
4: speex
语音文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败。
     */
    public Long getVoiceFileType() {
        return this.VoiceFileType;
    }

    /**
     * Set 语音文件类型
1: raw
2: wav
3: mp3
4: speex
语音文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败。
     * @param VoiceFileType 语音文件类型
1: raw
2: wav
3: mp3
4: speex
语音文件格式目前仅支持 16k 采样率 16bit 编码单声道，如有不一致可能导致评估不准确或失败。
     */
    public void setVoiceFileType(Long VoiceFileType) {
        this.VoiceFileType = VoiceFileType;
    }

    /**
     * Get 语音编码类型
1:pcm 
     * @return VoiceEncodeType 语音编码类型
1:pcm
     */
    public Long getVoiceEncodeType() {
        return this.VoiceEncodeType;
    }

    /**
     * Set 语音编码类型
1:pcm
     * @param VoiceEncodeType 语音编码类型
1:pcm
     */
    public void setVoiceEncodeType(Long VoiceEncodeType) {
        this.VoiceEncodeType = VoiceEncodeType;
    }

    /**
     * Get 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为1k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。 
     * @return UserVoiceData 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为1k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
     */
    public String getUserVoiceData() {
        return this.UserVoiceData;
    }

    /**
     * Set 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为1k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
     * @param UserVoiceData 当前数据包数据, 流式模式下数据包大小可以按需设置，在网络良好的情况下，建议设置为1k，且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数），编码格式要求为BASE64。
     */
    public void setUserVoiceData(String UserVoiceData) {
        this.UserVoiceData = UserVoiceData;
    }

    /**
     * Get 语音段唯一标识，一段完整语音使用一个SessionId，不同语音段的评测需要使用不同的SessionId。一般使用uuid(通用唯一识别码)来作为它的值，要尽量保证SessionId的唯一性。 
     * @return SessionId 语音段唯一标识，一段完整语音使用一个SessionId，不同语音段的评测需要使用不同的SessionId。一般使用uuid(通用唯一识别码)来作为它的值，要尽量保证SessionId的唯一性。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 语音段唯一标识，一段完整语音使用一个SessionId，不同语音段的评测需要使用不同的SessionId。一般使用uuid(通用唯一识别码)来作为它的值，要尽量保证SessionId的唯一性。
     * @param SessionId 语音段唯一标识，一段完整语音使用一个SessionId，不同语音段的评测需要使用不同的SessionId。一般使用uuid(通用唯一识别码)来作为它的值，要尽量保证SessionId的唯一性。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 被评估语音对应的文本，仅支持中文和英文。
句子模式下不超过个 30 单词或者中文文字，段落模式不超过 120 单词或者中文文字，中文评估使用 utf-8 编码，自由说模式RefText可以不填。
关于RefText的文本键入要求，请参考[评测模式介绍](https://cloud.tencent.com/document/product/884/56131)。
如需要在评测模式下使用自定义注音（支持中英文），可以通过设置「TextMode」参数实现，设置方式请参考[音素标注](https://cloud.tencent.com/document/product/884/33698)。 
     * @return RefText 被评估语音对应的文本，仅支持中文和英文。
句子模式下不超过个 30 单词或者中文文字，段落模式不超过 120 单词或者中文文字，中文评估使用 utf-8 编码，自由说模式RefText可以不填。
关于RefText的文本键入要求，请参考[评测模式介绍](https://cloud.tencent.com/document/product/884/56131)。
如需要在评测模式下使用自定义注音（支持中英文），可以通过设置「TextMode」参数实现，设置方式请参考[音素标注](https://cloud.tencent.com/document/product/884/33698)。
     */
    public String getRefText() {
        return this.RefText;
    }

    /**
     * Set 被评估语音对应的文本，仅支持中文和英文。
句子模式下不超过个 30 单词或者中文文字，段落模式不超过 120 单词或者中文文字，中文评估使用 utf-8 编码，自由说模式RefText可以不填。
关于RefText的文本键入要求，请参考[评测模式介绍](https://cloud.tencent.com/document/product/884/56131)。
如需要在评测模式下使用自定义注音（支持中英文），可以通过设置「TextMode」参数实现，设置方式请参考[音素标注](https://cloud.tencent.com/document/product/884/33698)。
     * @param RefText 被评估语音对应的文本，仅支持中文和英文。
句子模式下不超过个 30 单词或者中文文字，段落模式不超过 120 单词或者中文文字，中文评估使用 utf-8 编码，自由说模式RefText可以不填。
关于RefText的文本键入要求，请参考[评测模式介绍](https://cloud.tencent.com/document/product/884/56131)。
如需要在评测模式下使用自定义注音（支持中英文），可以通过设置「TextMode」参数实现，设置方式请参考[音素标注](https://cloud.tencent.com/document/product/884/33698)。
     */
    public void setRefText(String RefText) {
        this.RefText = RefText;
    }

    /**
     * Get 语音输入模式
0：流式分片
1：非流式一次性评估
推荐使用流式分片传输。 
     * @return WorkMode 语音输入模式
0：流式分片
1：非流式一次性评估
推荐使用流式分片传输。
     */
    public Long getWorkMode() {
        return this.WorkMode;
    }

    /**
     * Set 语音输入模式
0：流式分片
1：非流式一次性评估
推荐使用流式分片传输。
     * @param WorkMode 语音输入模式
0：流式分片
1：非流式一次性评估
推荐使用流式分片传输。
     */
    public void setWorkMode(Long WorkMode) {
        this.WorkMode = WorkMode;
    }

    /**
     * Get 评测模式
0：单词/单字模式（中文评测模式下为单字模式）
1：句子模式
2：段落模式
3：自由说模式
4：单词音素纠错模式
5：情景评测模式
6：句子多分支评测模式
7：单词实时评测模式
8：拼音评测模式
关于每种评测模式的详细介绍，以及适用场景，请参考[评测模式介绍](https://cloud.tencent.com/document/product/884/56131)。 
     * @return EvalMode 评测模式
0：单词/单字模式（中文评测模式下为单字模式）
1：句子模式
2：段落模式
3：自由说模式
4：单词音素纠错模式
5：情景评测模式
6：句子多分支评测模式
7：单词实时评测模式
8：拼音评测模式
关于每种评测模式的详细介绍，以及适用场景，请参考[评测模式介绍](https://cloud.tencent.com/document/product/884/56131)。
     */
    public Long getEvalMode() {
        return this.EvalMode;
    }

    /**
     * Set 评测模式
0：单词/单字模式（中文评测模式下为单字模式）
1：句子模式
2：段落模式
3：自由说模式
4：单词音素纠错模式
5：情景评测模式
6：句子多分支评测模式
7：单词实时评测模式
8：拼音评测模式
关于每种评测模式的详细介绍，以及适用场景，请参考[评测模式介绍](https://cloud.tencent.com/document/product/884/56131)。
     * @param EvalMode 评测模式
0：单词/单字模式（中文评测模式下为单字模式）
1：句子模式
2：段落模式
3：自由说模式
4：单词音素纠错模式
5：情景评测模式
6：句子多分支评测模式
7：单词实时评测模式
8：拼音评测模式
关于每种评测模式的详细介绍，以及适用场景，请参考[评测模式介绍](https://cloud.tencent.com/document/product/884/56131)。
     */
    public void setEvalMode(Long EvalMode) {
        this.EvalMode = EvalMode;
    }

    /**
     * Get 评价苛刻指数。取值为[1.0 - 4.0]范围内的浮点数，用于平滑不同年龄段的分数。
1.0：适用于最小年龄段用户，一般对应儿童应用场景；
4.0：适用于最高年龄段用户，一般对应成人严格打分场景。 
     * @return ScoreCoeff 评价苛刻指数。取值为[1.0 - 4.0]范围内的浮点数，用于平滑不同年龄段的分数。
1.0：适用于最小年龄段用户，一般对应儿童应用场景；
4.0：适用于最高年龄段用户，一般对应成人严格打分场景。
     */
    public Float getScoreCoeff() {
        return this.ScoreCoeff;
    }

    /**
     * Set 评价苛刻指数。取值为[1.0 - 4.0]范围内的浮点数，用于平滑不同年龄段的分数。
1.0：适用于最小年龄段用户，一般对应儿童应用场景；
4.0：适用于最高年龄段用户，一般对应成人严格打分场景。
     * @param ScoreCoeff 评价苛刻指数。取值为[1.0 - 4.0]范围内的浮点数，用于平滑不同年龄段的分数。
1.0：适用于最小年龄段用户，一般对应儿童应用场景；
4.0：适用于最高年龄段用户，一般对应成人严格打分场景。
     */
    public void setScoreCoeff(Float ScoreCoeff) {
        this.ScoreCoeff = ScoreCoeff;
    }

    /**
     * Get 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。如果没有新建SoeAppId，请勿填入该参数，否则会报欠费错误。 
     * @return SoeAppId 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。如果没有新建SoeAppId，请勿填入该参数，否则会报欠费错误。
     */
    public String getSoeAppId() {
        return this.SoeAppId;
    }

    /**
     * Set 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。如果没有新建SoeAppId，请勿填入该参数，否则会报欠费错误。
     * @param SoeAppId 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。如果没有新建SoeAppId，请勿填入该参数，否则会报欠费错误。
     */
    public void setSoeAppId(String SoeAppId) {
        this.SoeAppId = SoeAppId;
    }

    /**
     * Get 音频存储模式，此参数已废弃，无需设置，设置与否都默认为0不存储；
注：有存储需求的用户建议自行存储至腾讯云COS[对象存储](https://cloud.tencent.com/product/cos)使用。 
     * @return StorageMode 音频存储模式，此参数已废弃，无需设置，设置与否都默认为0不存储；
注：有存储需求的用户建议自行存储至腾讯云COS[对象存储](https://cloud.tencent.com/product/cos)使用。
     */
    public Long getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set 音频存储模式，此参数已废弃，无需设置，设置与否都默认为0不存储；
注：有存储需求的用户建议自行存储至腾讯云COS[对象存储](https://cloud.tencent.com/product/cos)使用。
     * @param StorageMode 音频存储模式，此参数已废弃，无需设置，设置与否都默认为0不存储；
注：有存储需求的用户建议自行存储至腾讯云COS[对象存储](https://cloud.tencent.com/product/cos)使用。
     */
    public void setStorageMode(Long StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get 输出断句中间结果标识
0：不输出
1：输出，通过设置该参数
可以在评估过程中的分片传输请求中，返回已经评估断句的中间结果，中间结果可用于客户端 UI 更新，输出结果为TransmitOralProcess请求返回结果 SentenceInfoSet 字段。 
     * @return SentenceInfoEnabled 输出断句中间结果标识
0：不输出
1：输出，通过设置该参数
可以在评估过程中的分片传输请求中，返回已经评估断句的中间结果，中间结果可用于客户端 UI 更新，输出结果为TransmitOralProcess请求返回结果 SentenceInfoSet 字段。
     */
    public Long getSentenceInfoEnabled() {
        return this.SentenceInfoEnabled;
    }

    /**
     * Set 输出断句中间结果标识
0：不输出
1：输出，通过设置该参数
可以在评估过程中的分片传输请求中，返回已经评估断句的中间结果，中间结果可用于客户端 UI 更新，输出结果为TransmitOralProcess请求返回结果 SentenceInfoSet 字段。
     * @param SentenceInfoEnabled 输出断句中间结果标识
0：不输出
1：输出，通过设置该参数
可以在评估过程中的分片传输请求中，返回已经评估断句的中间结果，中间结果可用于客户端 UI 更新，输出结果为TransmitOralProcess请求返回结果 SentenceInfoSet 字段。
     */
    public void setSentenceInfoEnabled(Long SentenceInfoEnabled) {
        this.SentenceInfoEnabled = SentenceInfoEnabled;
    }

    /**
     * Get 评估语言
0：英文
1：中文
ServerType不填默认为0 
     * @return ServerType 评估语言
0：英文
1：中文
ServerType不填默认为0
     */
    public Long getServerType() {
        return this.ServerType;
    }

    /**
     * Set 评估语言
0：英文
1：中文
ServerType不填默认为0
     * @param ServerType 评估语言
0：英文
1：中文
ServerType不填默认为0
     */
    public void setServerType(Long ServerType) {
        this.ServerType = ServerType;
    }

    /**
     * Get 异步模式标识
0：同步模式
1：异步模式（一般情况不建议使用异步模式）
可选值参考[服务模式](https://cloud.tencent.com/document/product/884/33697)。 
     * @return IsAsync 异步模式标识
0：同步模式
1：异步模式（一般情况不建议使用异步模式）
可选值参考[服务模式](https://cloud.tencent.com/document/product/884/33697)。
     */
    public Long getIsAsync() {
        return this.IsAsync;
    }

    /**
     * Set 异步模式标识
0：同步模式
1：异步模式（一般情况不建议使用异步模式）
可选值参考[服务模式](https://cloud.tencent.com/document/product/884/33697)。
     * @param IsAsync 异步模式标识
0：同步模式
1：异步模式（一般情况不建议使用异步模式）
可选值参考[服务模式](https://cloud.tencent.com/document/product/884/33697)。
     */
    public void setIsAsync(Long IsAsync) {
        this.IsAsync = IsAsync;
    }

    /**
     * Get 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。 
     * @return IsQuery 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
     */
    public Long getIsQuery() {
        return this.IsQuery;
    }

    /**
     * Set 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
     * @param IsQuery 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
     */
    public void setIsQuery(Long IsQuery) {
        this.IsQuery = IsQuery;
    }

    /**
     * Get 输入文本模式
0: 普通文本
1：[音素结构](https://cloud.tencent.com/document/product/884/33698)文本
2：音素注册模式（提工单注册需要使用音素的单词）。 
     * @return TextMode 输入文本模式
0: 普通文本
1：[音素结构](https://cloud.tencent.com/document/product/884/33698)文本
2：音素注册模式（提工单注册需要使用音素的单词）。
     */
    public Long getTextMode() {
        return this.TextMode;
    }

    /**
     * Set 输入文本模式
0: 普通文本
1：[音素结构](https://cloud.tencent.com/document/product/884/33698)文本
2：音素注册模式（提工单注册需要使用音素的单词）。
     * @param TextMode 输入文本模式
0: 普通文本
1：[音素结构](https://cloud.tencent.com/document/product/884/33698)文本
2：音素注册模式（提工单注册需要使用音素的单词）。
     */
    public void setTextMode(Long TextMode) {
        this.TextMode = TextMode;
    }

    public TransmitOralProcessWithInitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransmitOralProcessWithInitRequest(TransmitOralProcessWithInitRequest source) {
        if (source.SeqId != null) {
            this.SeqId = new Long(source.SeqId);
        }
        if (source.IsEnd != null) {
            this.IsEnd = new Long(source.IsEnd);
        }
        if (source.VoiceFileType != null) {
            this.VoiceFileType = new Long(source.VoiceFileType);
        }
        if (source.VoiceEncodeType != null) {
            this.VoiceEncodeType = new Long(source.VoiceEncodeType);
        }
        if (source.UserVoiceData != null) {
            this.UserVoiceData = new String(source.UserVoiceData);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RefText != null) {
            this.RefText = new String(source.RefText);
        }
        if (source.WorkMode != null) {
            this.WorkMode = new Long(source.WorkMode);
        }
        if (source.EvalMode != null) {
            this.EvalMode = new Long(source.EvalMode);
        }
        if (source.ScoreCoeff != null) {
            this.ScoreCoeff = new Float(source.ScoreCoeff);
        }
        if (source.SoeAppId != null) {
            this.SoeAppId = new String(source.SoeAppId);
        }
        if (source.StorageMode != null) {
            this.StorageMode = new Long(source.StorageMode);
        }
        if (source.SentenceInfoEnabled != null) {
            this.SentenceInfoEnabled = new Long(source.SentenceInfoEnabled);
        }
        if (source.ServerType != null) {
            this.ServerType = new Long(source.ServerType);
        }
        if (source.IsAsync != null) {
            this.IsAsync = new Long(source.IsAsync);
        }
        if (source.IsQuery != null) {
            this.IsQuery = new Long(source.IsQuery);
        }
        if (source.TextMode != null) {
            this.TextMode = new Long(source.TextMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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

