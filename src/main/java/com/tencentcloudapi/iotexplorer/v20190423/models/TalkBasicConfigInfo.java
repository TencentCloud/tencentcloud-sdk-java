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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkBasicConfigInfo extends AbstractModel {

    /**
    * 系统提示词
    */
    @SerializedName("SystemPrompt")
    @Expose
    private String SystemPrompt;

    /**
    * 欢迎语，支持多个欢迎语随机切换，格式：字符串数组，JSON字符串。
    */
    @SerializedName("GreetingMessage")
    @Expose
    private String GreetingMessage;

    /**
    * 音色，支持的音色列表：100510000-阅读男声智逍遥；101001-情感女声智瑜；101002-通用女声智聆；101003-客服女声智美；101004-通用男声智云；101005-通用女声智莉；101006-助手女声智言；101008-客服女声智琪；101009-知性女声智芸；101010-通用男声智华；101011-新闻女声智燕；101012-新闻女声智丹；101013-新闻男声智辉；101014 -新闻男声智宁；101015-男童声智萌；101016-女童声智甜；101017-情感女声智蓉；101018-情感男声智靖；101019-粤语女声智彤。
    */
    @SerializedName("DefaultVoiceType")
    @Expose
    private Long DefaultVoiceType;

    /**
     * Get 系统提示词 
     * @return SystemPrompt 系统提示词
     */
    public String getSystemPrompt() {
        return this.SystemPrompt;
    }

    /**
     * Set 系统提示词
     * @param SystemPrompt 系统提示词
     */
    public void setSystemPrompt(String SystemPrompt) {
        this.SystemPrompt = SystemPrompt;
    }

    /**
     * Get 欢迎语，支持多个欢迎语随机切换，格式：字符串数组，JSON字符串。 
     * @return GreetingMessage 欢迎语，支持多个欢迎语随机切换，格式：字符串数组，JSON字符串。
     */
    public String getGreetingMessage() {
        return this.GreetingMessage;
    }

    /**
     * Set 欢迎语，支持多个欢迎语随机切换，格式：字符串数组，JSON字符串。
     * @param GreetingMessage 欢迎语，支持多个欢迎语随机切换，格式：字符串数组，JSON字符串。
     */
    public void setGreetingMessage(String GreetingMessage) {
        this.GreetingMessage = GreetingMessage;
    }

    /**
     * Get 音色，支持的音色列表：100510000-阅读男声智逍遥；101001-情感女声智瑜；101002-通用女声智聆；101003-客服女声智美；101004-通用男声智云；101005-通用女声智莉；101006-助手女声智言；101008-客服女声智琪；101009-知性女声智芸；101010-通用男声智华；101011-新闻女声智燕；101012-新闻女声智丹；101013-新闻男声智辉；101014 -新闻男声智宁；101015-男童声智萌；101016-女童声智甜；101017-情感女声智蓉；101018-情感男声智靖；101019-粤语女声智彤。 
     * @return DefaultVoiceType 音色，支持的音色列表：100510000-阅读男声智逍遥；101001-情感女声智瑜；101002-通用女声智聆；101003-客服女声智美；101004-通用男声智云；101005-通用女声智莉；101006-助手女声智言；101008-客服女声智琪；101009-知性女声智芸；101010-通用男声智华；101011-新闻女声智燕；101012-新闻女声智丹；101013-新闻男声智辉；101014 -新闻男声智宁；101015-男童声智萌；101016-女童声智甜；101017-情感女声智蓉；101018-情感男声智靖；101019-粤语女声智彤。
     */
    public Long getDefaultVoiceType() {
        return this.DefaultVoiceType;
    }

    /**
     * Set 音色，支持的音色列表：100510000-阅读男声智逍遥；101001-情感女声智瑜；101002-通用女声智聆；101003-客服女声智美；101004-通用男声智云；101005-通用女声智莉；101006-助手女声智言；101008-客服女声智琪；101009-知性女声智芸；101010-通用男声智华；101011-新闻女声智燕；101012-新闻女声智丹；101013-新闻男声智辉；101014 -新闻男声智宁；101015-男童声智萌；101016-女童声智甜；101017-情感女声智蓉；101018-情感男声智靖；101019-粤语女声智彤。
     * @param DefaultVoiceType 音色，支持的音色列表：100510000-阅读男声智逍遥；101001-情感女声智瑜；101002-通用女声智聆；101003-客服女声智美；101004-通用男声智云；101005-通用女声智莉；101006-助手女声智言；101008-客服女声智琪；101009-知性女声智芸；101010-通用男声智华；101011-新闻女声智燕；101012-新闻女声智丹；101013-新闻男声智辉；101014 -新闻男声智宁；101015-男童声智萌；101016-女童声智甜；101017-情感女声智蓉；101018-情感男声智靖；101019-粤语女声智彤。
     */
    public void setDefaultVoiceType(Long DefaultVoiceType) {
        this.DefaultVoiceType = DefaultVoiceType;
    }

    public TalkBasicConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkBasicConfigInfo(TalkBasicConfigInfo source) {
        if (source.SystemPrompt != null) {
            this.SystemPrompt = new String(source.SystemPrompt);
        }
        if (source.GreetingMessage != null) {
            this.GreetingMessage = new String(source.GreetingMessage);
        }
        if (source.DefaultVoiceType != null) {
            this.DefaultVoiceType = new Long(source.DefaultVoiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SystemPrompt", this.SystemPrompt);
        this.setParamSimple(map, prefix + "GreetingMessage", this.GreetingMessage);
        this.setParamSimple(map, prefix + "DefaultVoiceType", this.DefaultVoiceType);

    }
}

