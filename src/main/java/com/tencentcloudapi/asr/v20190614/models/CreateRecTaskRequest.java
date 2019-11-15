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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRecTaskRequest  extends AbstractModel{

    /**
    * 引擎类型。
8k_0：电话 8k 通用模型，可用于双声道音频的识别；
8k_6：电话 8k 话者分离模型，仅用于单声道；
16k_0：16k 通用模型。
    */
    @SerializedName("EngineModelType")
    @Expose
    private String EngineModelType;

    /**
    * 语音声道数。1：单声道；2：双声道（仅在电话 8k 通用模型下支持）。
    */
    @SerializedName("ChannelNum")
    @Expose
    private Long ChannelNum;

    /**
    * 识别结果文本编码方式。0：UTF-8。
    */
    @SerializedName("ResTextFormat")
    @Expose
    private Long ResTextFormat;

    /**
    * 语音数据来源。0：语音 URL；1：语音数据（post body）。
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 回调 URL，用户自行搭建的用于接收识别结果的服务器地址， 长度小于2048字节。如果用户使用回调方式获取识别结果，需提交该参数；如果用户使用轮询方式获取识别结果，则无需提交该参数。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 语音的URL地址，需要公网可下载。长度小于2048字节，当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写。注意：请确保录音文件时长在一个小时之内，否则可能识别失败。请保证文件的下载速度，否则可能下载失败。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 语音数据，当SourceType 值为1时必须填写，为0可不写。要base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频数据要小于5MB。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 数据长度，当 SourceType 值为1时必须填写，为0可不写（此数据长度为数据未进行base64编码时的数据长度）。
    */
    @SerializedName("DataLen")
    @Expose
    private Long DataLen;

    /**
     * 获取引擎类型。
8k_0：电话 8k 通用模型，可用于双声道音频的识别；
8k_6：电话 8k 话者分离模型，仅用于单声道；
16k_0：16k 通用模型。
     * @return EngineModelType 引擎类型。
8k_0：电话 8k 通用模型，可用于双声道音频的识别；
8k_6：电话 8k 话者分离模型，仅用于单声道；
16k_0：16k 通用模型。
     */
    public String getEngineModelType() {
        return this.EngineModelType;
    }

    /**
     * 设置引擎类型。
8k_0：电话 8k 通用模型，可用于双声道音频的识别；
8k_6：电话 8k 话者分离模型，仅用于单声道；
16k_0：16k 通用模型。
     * @param EngineModelType 引擎类型。
8k_0：电话 8k 通用模型，可用于双声道音频的识别；
8k_6：电话 8k 话者分离模型，仅用于单声道；
16k_0：16k 通用模型。
     */
    public void setEngineModelType(String EngineModelType) {
        this.EngineModelType = EngineModelType;
    }

    /**
     * 获取语音声道数。1：单声道；2：双声道（仅在电话 8k 通用模型下支持）。
     * @return ChannelNum 语音声道数。1：单声道；2：双声道（仅在电话 8k 通用模型下支持）。
     */
    public Long getChannelNum() {
        return this.ChannelNum;
    }

    /**
     * 设置语音声道数。1：单声道；2：双声道（仅在电话 8k 通用模型下支持）。
     * @param ChannelNum 语音声道数。1：单声道；2：双声道（仅在电话 8k 通用模型下支持）。
     */
    public void setChannelNum(Long ChannelNum) {
        this.ChannelNum = ChannelNum;
    }

    /**
     * 获取识别结果文本编码方式。0：UTF-8。
     * @return ResTextFormat 识别结果文本编码方式。0：UTF-8。
     */
    public Long getResTextFormat() {
        return this.ResTextFormat;
    }

    /**
     * 设置识别结果文本编码方式。0：UTF-8。
     * @param ResTextFormat 识别结果文本编码方式。0：UTF-8。
     */
    public void setResTextFormat(Long ResTextFormat) {
        this.ResTextFormat = ResTextFormat;
    }

    /**
     * 获取语音数据来源。0：语音 URL；1：语音数据（post body）。
     * @return SourceType 语音数据来源。0：语音 URL；1：语音数据（post body）。
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * 设置语音数据来源。0：语音 URL；1：语音数据（post body）。
     * @param SourceType 语音数据来源。0：语音 URL；1：语音数据（post body）。
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * 获取回调 URL，用户自行搭建的用于接收识别结果的服务器地址， 长度小于2048字节。如果用户使用回调方式获取识别结果，需提交该参数；如果用户使用轮询方式获取识别结果，则无需提交该参数。
     * @return CallbackUrl 回调 URL，用户自行搭建的用于接收识别结果的服务器地址， 长度小于2048字节。如果用户使用回调方式获取识别结果，需提交该参数；如果用户使用轮询方式获取识别结果，则无需提交该参数。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * 设置回调 URL，用户自行搭建的用于接收识别结果的服务器地址， 长度小于2048字节。如果用户使用回调方式获取识别结果，需提交该参数；如果用户使用轮询方式获取识别结果，则无需提交该参数。
     * @param CallbackUrl 回调 URL，用户自行搭建的用于接收识别结果的服务器地址， 长度小于2048字节。如果用户使用回调方式获取识别结果，需提交该参数；如果用户使用轮询方式获取识别结果，则无需提交该参数。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * 获取语音的URL地址，需要公网可下载。长度小于2048字节，当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写。注意：请确保录音文件时长在一个小时之内，否则可能识别失败。请保证文件的下载速度，否则可能下载失败。
     * @return Url 语音的URL地址，需要公网可下载。长度小于2048字节，当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写。注意：请确保录音文件时长在一个小时之内，否则可能识别失败。请保证文件的下载速度，否则可能下载失败。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置语音的URL地址，需要公网可下载。长度小于2048字节，当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写。注意：请确保录音文件时长在一个小时之内，否则可能识别失败。请保证文件的下载速度，否则可能下载失败。
     * @param Url 语音的URL地址，需要公网可下载。长度小于2048字节，当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写。注意：请确保录音文件时长在一个小时之内，否则可能识别失败。请保证文件的下载速度，否则可能下载失败。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取语音数据，当SourceType 值为1时必须填写，为0可不写。要base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频数据要小于5MB。
     * @return Data 语音数据，当SourceType 值为1时必须填写，为0可不写。要base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频数据要小于5MB。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * 设置语音数据，当SourceType 值为1时必须填写，为0可不写。要base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频数据要小于5MB。
     * @param Data 语音数据，当SourceType 值为1时必须填写，为0可不写。要base64编码(采用python语言时注意读取文件应该为string而不是byte，以byte格式读取后要decode()。编码后的数据不可带有回车换行符)。音频数据要小于5MB。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * 获取数据长度，当 SourceType 值为1时必须填写，为0可不写（此数据长度为数据未进行base64编码时的数据长度）。
     * @return DataLen 数据长度，当 SourceType 值为1时必须填写，为0可不写（此数据长度为数据未进行base64编码时的数据长度）。
     */
    public Long getDataLen() {
        return this.DataLen;
    }

    /**
     * 设置数据长度，当 SourceType 值为1时必须填写，为0可不写（此数据长度为数据未进行base64编码时的数据长度）。
     * @param DataLen 数据长度，当 SourceType 值为1时必须填写，为0可不写（此数据长度为数据未进行base64编码时的数据长度）。
     */
    public void setDataLen(Long DataLen) {
        this.DataLen = DataLen;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineModelType", this.EngineModelType);
        this.setParamSimple(map, prefix + "ChannelNum", this.ChannelNum);
        this.setParamSimple(map, prefix + "ResTextFormat", this.ResTextFormat);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "DataLen", this.DataLen);

    }
}

