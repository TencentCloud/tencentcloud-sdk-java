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
package com.tencentcloudapi.tbp.v20190311.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextProcessRequest extends AbstractModel{

    /**
    * 机器人标识，用于定义抽象机器人。
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 终端标识，每个终端(或线程)对应一个，区分并发多用户。
    */
    @SerializedName("TerminalId")
    @Expose
    private String TerminalId;

    /**
    * 请求的文本。
    */
    @SerializedName("InputText")
    @Expose
    private String InputText;

    /**
    * 机器人版本，取值"dev"或"release"，{调试版本：dev；线上版本：release}。
    */
    @SerializedName("BotEnv")
    @Expose
    private String BotEnv;

    /**
    * 透传字段，透传给用户自定义的WebService服务。
    */
    @SerializedName("SessionAttributes")
    @Expose
    private String SessionAttributes;

    /**
     * Get 机器人标识，用于定义抽象机器人。 
     * @return BotId 机器人标识，用于定义抽象机器人。
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set 机器人标识，用于定义抽象机器人。
     * @param BotId 机器人标识，用于定义抽象机器人。
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get 终端标识，每个终端(或线程)对应一个，区分并发多用户。 
     * @return TerminalId 终端标识，每个终端(或线程)对应一个，区分并发多用户。
     */
    public String getTerminalId() {
        return this.TerminalId;
    }

    /**
     * Set 终端标识，每个终端(或线程)对应一个，区分并发多用户。
     * @param TerminalId 终端标识，每个终端(或线程)对应一个，区分并发多用户。
     */
    public void setTerminalId(String TerminalId) {
        this.TerminalId = TerminalId;
    }

    /**
     * Get 请求的文本。 
     * @return InputText 请求的文本。
     */
    public String getInputText() {
        return this.InputText;
    }

    /**
     * Set 请求的文本。
     * @param InputText 请求的文本。
     */
    public void setInputText(String InputText) {
        this.InputText = InputText;
    }

    /**
     * Get 机器人版本，取值"dev"或"release"，{调试版本：dev；线上版本：release}。 
     * @return BotEnv 机器人版本，取值"dev"或"release"，{调试版本：dev；线上版本：release}。
     */
    public String getBotEnv() {
        return this.BotEnv;
    }

    /**
     * Set 机器人版本，取值"dev"或"release"，{调试版本：dev；线上版本：release}。
     * @param BotEnv 机器人版本，取值"dev"或"release"，{调试版本：dev；线上版本：release}。
     */
    public void setBotEnv(String BotEnv) {
        this.BotEnv = BotEnv;
    }

    /**
     * Get 透传字段，透传给用户自定义的WebService服务。 
     * @return SessionAttributes 透传字段，透传给用户自定义的WebService服务。
     */
    public String getSessionAttributes() {
        return this.SessionAttributes;
    }

    /**
     * Set 透传字段，透传给用户自定义的WebService服务。
     * @param SessionAttributes 透传字段，透传给用户自定义的WebService服务。
     */
    public void setSessionAttributes(String SessionAttributes) {
        this.SessionAttributes = SessionAttributes;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "TerminalId", this.TerminalId);
        this.setParamSimple(map, prefix + "InputText", this.InputText);
        this.setParamSimple(map, prefix + "BotEnv", this.BotEnv);
        this.setParamSimple(map, prefix + "SessionAttributes", this.SessionAttributes);

    }
}

