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

public class KeywordEvaluateRequest extends AbstractModel{

    /**
    * 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，非流式模式时无意义。
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
1: raw/pcm
2: wav
3: mp3
4: speex
[音频上传格式](https://cloud.tencent.com/document/product/884/56132)
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
    * 当前语音数据, 编码格式要求为BASE64且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数）。格式要求参考[音频上传格式](https://cloud.tencent.com/document/product/884/56132)
流式模式下需要将语音数据进行分片处理，参考：[分片大小设置](https://cloud.tencent.com/document/product/884/78985#.E5.88.86.E7.89.87.E5.A4.A7.E5.B0.8F.E8.AE.BE.E7.BD.AE.E4.B8.BA.E5.A4.9A.E5.A4.A7.E6.AF.94.E8.BE.83.E5.90.88.E9.80.82.3F)
如何进行流式分片参考：[流式评测](https://cloud.tencent.com/document/product/884/78824#.E6.B5.81.E5.BC.8F.E8.AF.84.E6.B5.8B)
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
    * 关键词列表
    */
    @SerializedName("Keywords")
    @Expose
    private Keyword [] Keywords;

    /**
    * 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。如果没有新建SoeAppId，请勿填入该参数，否则会报欠费错误。使用指南：[业务应用](https://cloud.tencent.com/document/product/884/78824#.E4.B8.9A.E5.8A.A1.E5.BA.94.E7.94.A8)
    */
    @SerializedName("SoeAppId")
    @Expose
    private String SoeAppId;

    /**
    * 查询标识，当该参数为1时，该请求为查询请求，请求返回该 Session 评估结果。
    */
    @SerializedName("IsQuery")
    @Expose
    private Long IsQuery;

    /**
     * Get 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，非流式模式时无意义。
注意：序号上限为3000，不能超过上限。 
     * @return SeqId 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，非流式模式时无意义。
注意：序号上限为3000，不能超过上限。
     */
    public Long getSeqId() {
        return this.SeqId;
    }

    /**
     * Set 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，非流式模式时无意义。
注意：序号上限为3000，不能超过上限。
     * @param SeqId 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，非流式模式时无意义。
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
1: raw/pcm
2: wav
3: mp3
4: speex
[音频上传格式](https://cloud.tencent.com/document/product/884/56132) 
     * @return VoiceFileType 语音文件类型
1: raw/pcm
2: wav
3: mp3
4: speex
[音频上传格式](https://cloud.tencent.com/document/product/884/56132)
     */
    public Long getVoiceFileType() {
        return this.VoiceFileType;
    }

    /**
     * Set 语音文件类型
1: raw/pcm
2: wav
3: mp3
4: speex
[音频上传格式](https://cloud.tencent.com/document/product/884/56132)
     * @param VoiceFileType 语音文件类型
1: raw/pcm
2: wav
3: mp3
4: speex
[音频上传格式](https://cloud.tencent.com/document/product/884/56132)
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
     * Get 当前语音数据, 编码格式要求为BASE64且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数）。格式要求参考[音频上传格式](https://cloud.tencent.com/document/product/884/56132)
流式模式下需要将语音数据进行分片处理，参考：[分片大小设置](https://cloud.tencent.com/document/product/884/78985#.E5.88.86.E7.89.87.E5.A4.A7.E5.B0.8F.E8.AE.BE.E7.BD.AE.E4.B8.BA.E5.A4.9A.E5.A4.A7.E6.AF.94.E8.BE.83.E5.90.88.E9.80.82.3F)
如何进行流式分片参考：[流式评测](https://cloud.tencent.com/document/product/884/78824#.E6.B5.81.E5.BC.8F.E8.AF.84.E6.B5.8B) 
     * @return UserVoiceData 当前语音数据, 编码格式要求为BASE64且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数）。格式要求参考[音频上传格式](https://cloud.tencent.com/document/product/884/56132)
流式模式下需要将语音数据进行分片处理，参考：[分片大小设置](https://cloud.tencent.com/document/product/884/78985#.E5.88.86.E7.89.87.E5.A4.A7.E5.B0.8F.E8.AE.BE.E7.BD.AE.E4.B8.BA.E5.A4.9A.E5.A4.A7.E6.AF.94.E8.BE.83.E5.90.88.E9.80.82.3F)
如何进行流式分片参考：[流式评测](https://cloud.tencent.com/document/product/884/78824#.E6.B5.81.E5.BC.8F.E8.AF.84.E6.B5.8B)
     */
    public String getUserVoiceData() {
        return this.UserVoiceData;
    }

    /**
     * Set 当前语音数据, 编码格式要求为BASE64且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数）。格式要求参考[音频上传格式](https://cloud.tencent.com/document/product/884/56132)
流式模式下需要将语音数据进行分片处理，参考：[分片大小设置](https://cloud.tencent.com/document/product/884/78985#.E5.88.86.E7.89.87.E5.A4.A7.E5.B0.8F.E8.AE.BE.E7.BD.AE.E4.B8.BA.E5.A4.9A.E5.A4.A7.E6.AF.94.E8.BE.83.E5.90.88.E9.80.82.3F)
如何进行流式分片参考：[流式评测](https://cloud.tencent.com/document/product/884/78824#.E6.B5.81.E5.BC.8F.E8.AF.84.E6.B5.8B)
     * @param UserVoiceData 当前语音数据, 编码格式要求为BASE64且必须保证分片帧完整（16bit的数据必须保证音频长度为偶数）。格式要求参考[音频上传格式](https://cloud.tencent.com/document/product/884/56132)
流式模式下需要将语音数据进行分片处理，参考：[分片大小设置](https://cloud.tencent.com/document/product/884/78985#.E5.88.86.E7.89.87.E5.A4.A7.E5.B0.8F.E8.AE.BE.E7.BD.AE.E4.B8.BA.E5.A4.9A.E5.A4.A7.E6.AF.94.E8.BE.83.E5.90.88.E9.80.82.3F)
如何进行流式分片参考：[流式评测](https://cloud.tencent.com/document/product/884/78824#.E6.B5.81.E5.BC.8F.E8.AF.84.E6.B5.8B)
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
     * Get 关键词列表 
     * @return Keywords 关键词列表
     */
    public Keyword [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 关键词列表
     * @param Keywords 关键词列表
     */
    public void setKeywords(Keyword [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。如果没有新建SoeAppId，请勿填入该参数，否则会报欠费错误。使用指南：[业务应用](https://cloud.tencent.com/document/product/884/78824#.E4.B8.9A.E5.8A.A1.E5.BA.94.E7.94.A8) 
     * @return SoeAppId 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。如果没有新建SoeAppId，请勿填入该参数，否则会报欠费错误。使用指南：[业务应用](https://cloud.tencent.com/document/product/884/78824#.E4.B8.9A.E5.8A.A1.E5.BA.94.E7.94.A8)
     */
    public String getSoeAppId() {
        return this.SoeAppId;
    }

    /**
     * Set 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。如果没有新建SoeAppId，请勿填入该参数，否则会报欠费错误。使用指南：[业务应用](https://cloud.tencent.com/document/product/884/78824#.E4.B8.9A.E5.8A.A1.E5.BA.94.E7.94.A8)
     * @param SoeAppId 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 SoeAppId 可以在[控制台](https://console.cloud.tencent.com/soe)【应用管理】下新建。如果没有新建SoeAppId，请勿填入该参数，否则会报欠费错误。使用指南：[业务应用](https://cloud.tencent.com/document/product/884/78824#.E4.B8.9A.E5.8A.A1.E5.BA.94.E7.94.A8)
     */
    public void setSoeAppId(String SoeAppId) {
        this.SoeAppId = SoeAppId;
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

    public KeywordEvaluateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeywordEvaluateRequest(KeywordEvaluateRequest source) {
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
        if (source.Keywords != null) {
            this.Keywords = new Keyword[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new Keyword(source.Keywords[i]);
            }
        }
        if (source.SoeAppId != null) {
            this.SoeAppId = new String(source.SoeAppId);
        }
        if (source.IsQuery != null) {
            this.IsQuery = new Long(source.IsQuery);
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
        this.setParamArrayObj(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "SoeAppId", this.SoeAppId);
        this.setParamSimple(map, prefix + "IsQuery", this.IsQuery);

    }
}

