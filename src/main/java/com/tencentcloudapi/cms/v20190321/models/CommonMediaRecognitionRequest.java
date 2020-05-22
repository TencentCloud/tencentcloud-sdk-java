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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMediaRecognitionRequest extends AbstractModel{

    /**
    * 公共参数Common类
    */
    @SerializedName("MessageCommon")
    @Expose
    private MessageCommonGjh MessageCommon;

    /**
    * 内容相关参数
    */
    @SerializedName("MessageContent")
    @Expose
    private MessageContentGjh MessageContent;

    /**
    * 内容ID参数
    */
    @SerializedName("MessageId")
    @Expose
    private MessageIdGjh MessageId;

    /**
     * Get 公共参数Common类 
     * @return MessageCommon 公共参数Common类
     */
    public MessageCommonGjh getMessageCommon() {
        return this.MessageCommon;
    }

    /**
     * Set 公共参数Common类
     * @param MessageCommon 公共参数Common类
     */
    public void setMessageCommon(MessageCommonGjh MessageCommon) {
        this.MessageCommon = MessageCommon;
    }

    /**
     * Get 内容相关参数 
     * @return MessageContent 内容相关参数
     */
    public MessageContentGjh getMessageContent() {
        return this.MessageContent;
    }

    /**
     * Set 内容相关参数
     * @param MessageContent 内容相关参数
     */
    public void setMessageContent(MessageContentGjh MessageContent) {
        this.MessageContent = MessageContent;
    }

    /**
     * Get 内容ID参数 
     * @return MessageId 内容ID参数
     */
    public MessageIdGjh getMessageId() {
        return this.MessageId;
    }

    /**
     * Set 内容ID参数
     * @param MessageId 内容ID参数
     */
    public void setMessageId(MessageIdGjh MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MessageCommon.", this.MessageCommon);
        this.setParamObj(map, prefix + "MessageContent.", this.MessageContent);
        this.setParamObj(map, prefix + "MessageId.", this.MessageId);

    }
}

