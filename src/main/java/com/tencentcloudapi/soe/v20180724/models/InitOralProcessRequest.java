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

public class InitOralProcessRequest  extends AbstractModel{

    /**
    * 语音段唯一标识，一段语音一个SessionId
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 被评估语音对应的文本，不支持ascii大于128以上的字符，会统一替换成空格。
    */
    @SerializedName("RefText")
    @Expose
    private String RefText;

    /**
    * 语音输入模式，0流式分片，1非流式一次性评估
    */
    @SerializedName("WorkMode")
    @Expose
    private Integer WorkMode;

    /**
    * 评估模式，0:词模式, 1:句子模式，当为词模式评估时，能够提供每个音节的评估信息，当为句子模式时，能够提供完整度和流利度信息。
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
    * 长效session标识，当该参数为1时，session的持续时间为300s，但会一定程度上影响第一个数据包的返回速度，且TransmitOralProcess必须同时为1才可生效。
    */
    @SerializedName("IsLongLifeSession")
    @Expose
    private Integer IsLongLifeSession;

    /**
    * 音频存储模式，0：不存储，1：存储到公共对象存储
    */
    @SerializedName("StorageMode")
    @Expose
    private Integer StorageMode;

    /**
     * 获取语音段唯一标识，一段语音一个SessionId
     * @return SessionId 语音段唯一标识，一段语音一个SessionId
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置语音段唯一标识，一段语音一个SessionId
     * @param SessionId 语音段唯一标识，一段语音一个SessionId
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 获取被评估语音对应的文本，不支持ascii大于128以上的字符，会统一替换成空格。
     * @return RefText 被评估语音对应的文本，不支持ascii大于128以上的字符，会统一替换成空格。
     */
    public String getRefText() {
        return this.RefText;
    }

    /**
     * 设置被评估语音对应的文本，不支持ascii大于128以上的字符，会统一替换成空格。
     * @param RefText 被评估语音对应的文本，不支持ascii大于128以上的字符，会统一替换成空格。
     */
    public void setRefText(String RefText) {
        this.RefText = RefText;
    }

    /**
     * 获取语音输入模式，0流式分片，1非流式一次性评估
     * @return WorkMode 语音输入模式，0流式分片，1非流式一次性评估
     */
    public Integer getWorkMode() {
        return this.WorkMode;
    }

    /**
     * 设置语音输入模式，0流式分片，1非流式一次性评估
     * @param WorkMode 语音输入模式，0流式分片，1非流式一次性评估
     */
    public void setWorkMode(Integer WorkMode) {
        this.WorkMode = WorkMode;
    }

    /**
     * 获取评估模式，0:词模式, 1:句子模式，当为词模式评估时，能够提供每个音节的评估信息，当为句子模式时，能够提供完整度和流利度信息。
     * @return EvalMode 评估模式，0:词模式, 1:句子模式，当为词模式评估时，能够提供每个音节的评估信息，当为句子模式时，能够提供完整度和流利度信息。
     */
    public Integer getEvalMode() {
        return this.EvalMode;
    }

    /**
     * 设置评估模式，0:词模式, 1:句子模式，当为词模式评估时，能够提供每个音节的评估信息，当为句子模式时，能够提供完整度和流利度信息。
     * @param EvalMode 评估模式，0:词模式, 1:句子模式，当为词模式评估时，能够提供每个音节的评估信息，当为句子模式时，能够提供完整度和流利度信息。
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
     * 获取长效session标识，当该参数为1时，session的持续时间为300s，但会一定程度上影响第一个数据包的返回速度，且TransmitOralProcess必须同时为1才可生效。
     * @return IsLongLifeSession 长效session标识，当该参数为1时，session的持续时间为300s，但会一定程度上影响第一个数据包的返回速度，且TransmitOralProcess必须同时为1才可生效。
     */
    public Integer getIsLongLifeSession() {
        return this.IsLongLifeSession;
    }

    /**
     * 设置长效session标识，当该参数为1时，session的持续时间为300s，但会一定程度上影响第一个数据包的返回速度，且TransmitOralProcess必须同时为1才可生效。
     * @param IsLongLifeSession 长效session标识，当该参数为1时，session的持续时间为300s，但会一定程度上影响第一个数据包的返回速度，且TransmitOralProcess必须同时为1才可生效。
     */
    public void setIsLongLifeSession(Integer IsLongLifeSession) {
        this.IsLongLifeSession = IsLongLifeSession;
    }

    /**
     * 获取音频存储模式，0：不存储，1：存储到公共对象存储
     * @return StorageMode 音频存储模式，0：不存储，1：存储到公共对象存储
     */
    public Integer getStorageMode() {
        return this.StorageMode;
    }

    /**
     * 设置音频存储模式，0：不存储，1：存储到公共对象存储
     * @param StorageMode 音频存储模式，0：不存储，1：存储到公共对象存储
     */
    public void setStorageMode(Integer StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RefText", this.RefText);
        this.setParamSimple(map, prefix + "WorkMode", this.WorkMode);
        this.setParamSimple(map, prefix + "EvalMode", this.EvalMode);
        this.setParamSimple(map, prefix + "ScoreCoeff", this.ScoreCoeff);
        this.setParamSimple(map, prefix + "SoeAppId", this.SoeAppId);
        this.setParamSimple(map, prefix + "IsLongLifeSession", this.IsLongLifeSession);
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);

    }
}

