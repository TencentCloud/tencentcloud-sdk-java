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

public class TransmitOralProcessRequest  extends AbstractModel{

    /**
    * 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，非流式模式下无意义
    */
    @SerializedName("SeqId")
    @Expose
    private Integer SeqId;

    /**
    * 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义
    */
    @SerializedName("IsEnd")
    @Expose
    private Integer IsEnd;

    /**
    * 语音文件类型 	1:raw, 2:wav, 3:mp3(mp3格式目前仅支持16k采样率16bit编码单声道)
    */
    @SerializedName("VoiceFileType")
    @Expose
    private Integer VoiceFileType;

    /**
    * 语音编码类型	1:pcm
    */
    @SerializedName("VoiceEncodeType")
    @Expose
    private Integer VoiceEncodeType;

    /**
    * 当前数据包数据, 流式模式下数据包大小可以按需设置，数据包大小必须 >= 4K，编码格式要求为BASE64。
    */
    @SerializedName("UserVoiceData")
    @Expose
    private String UserVoiceData;

    /**
    * 语音段唯一标识，一个完整语音一个SessionId
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，需要结合[控制台](https://console.cloud.tencent.com/soe)使用。
    */
    @SerializedName("SoeAppId")
    @Expose
    private String SoeAppId;

    /**
     * 获取流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，非流式模式下无意义
     * @return SeqId 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，非流式模式下无意义
     */
    public Integer getSeqId() {
        return this.SeqId;
    }

    /**
     * 设置流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，非流式模式下无意义
     * @param SeqId 流式数据包的序号，从1开始，当IsEnd字段为1后后续序号无意义，非流式模式下无意义
     */
    public void setSeqId(Integer SeqId) {
        this.SeqId = SeqId;
    }

    /**
     * 获取是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义
     * @return IsEnd 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义
     */
    public Integer getIsEnd() {
        return this.IsEnd;
    }

    /**
     * 设置是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义
     * @param IsEnd 是否传输完毕标志，若为0表示未完毕，若为1则传输完毕开始评估，非流式模式下无意义
     */
    public void setIsEnd(Integer IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * 获取语音文件类型 	1:raw, 2:wav, 3:mp3(mp3格式目前仅支持16k采样率16bit编码单声道)
     * @return VoiceFileType 语音文件类型 	1:raw, 2:wav, 3:mp3(mp3格式目前仅支持16k采样率16bit编码单声道)
     */
    public Integer getVoiceFileType() {
        return this.VoiceFileType;
    }

    /**
     * 设置语音文件类型 	1:raw, 2:wav, 3:mp3(mp3格式目前仅支持16k采样率16bit编码单声道)
     * @param VoiceFileType 语音文件类型 	1:raw, 2:wav, 3:mp3(mp3格式目前仅支持16k采样率16bit编码单声道)
     */
    public void setVoiceFileType(Integer VoiceFileType) {
        this.VoiceFileType = VoiceFileType;
    }

    /**
     * 获取语音编码类型	1:pcm
     * @return VoiceEncodeType 语音编码类型	1:pcm
     */
    public Integer getVoiceEncodeType() {
        return this.VoiceEncodeType;
    }

    /**
     * 设置语音编码类型	1:pcm
     * @param VoiceEncodeType 语音编码类型	1:pcm
     */
    public void setVoiceEncodeType(Integer VoiceEncodeType) {
        this.VoiceEncodeType = VoiceEncodeType;
    }

    /**
     * 获取当前数据包数据, 流式模式下数据包大小可以按需设置，数据包大小必须 >= 4K，编码格式要求为BASE64。
     * @return UserVoiceData 当前数据包数据, 流式模式下数据包大小可以按需设置，数据包大小必须 >= 4K，编码格式要求为BASE64。
     */
    public String getUserVoiceData() {
        return this.UserVoiceData;
    }

    /**
     * 设置当前数据包数据, 流式模式下数据包大小可以按需设置，数据包大小必须 >= 4K，编码格式要求为BASE64。
     * @param UserVoiceData 当前数据包数据, 流式模式下数据包大小可以按需设置，数据包大小必须 >= 4K，编码格式要求为BASE64。
     */
    public void setUserVoiceData(String UserVoiceData) {
        this.UserVoiceData = UserVoiceData;
    }

    /**
     * 获取语音段唯一标识，一个完整语音一个SessionId
     * @return SessionId 语音段唯一标识，一个完整语音一个SessionId
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置语音段唯一标识，一个完整语音一个SessionId
     * @param SessionId 语音段唯一标识，一个完整语音一个SessionId
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 获取业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，需要结合[控制台](https://console.cloud.tencent.com/soe)使用。
     * @return SoeAppId 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，需要结合[控制台](https://console.cloud.tencent.com/soe)使用。
     */
    public String getSoeAppId() {
        return this.SoeAppId;
    }

    /**
     * 设置业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，需要结合[控制台](https://console.cloud.tencent.com/soe)使用。
     * @param SoeAppId 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，需要结合[控制台](https://console.cloud.tencent.com/soe)使用。
     */
    public void setSoeAppId(String SoeAppId) {
        this.SoeAppId = SoeAppId;
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
        this.setParamSimple(map, prefix + "SoeAppId", this.SoeAppId);

    }
}

