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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTopicAttributeRequest extends AbstractModel{

    /**
    * 主题名字，在单个地域同一帐号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 消息最大长度。取值范围1024 - 65536 Byte（即1 - 64K），默认值65536。
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * 消息保存时间。取值范围60 - 86400 s（即1分钟 - 1天），默认值86400。
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
     * Get 主题名字，在单个地域同一帐号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。 
     * @return TopicName 主题名字，在单个地域同一帐号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名字，在单个地域同一帐号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
     * @param TopicName 主题名字，在单个地域同一帐号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 消息最大长度。取值范围1024 - 65536 Byte（即1 - 64K），默认值65536。 
     * @return MaxMsgSize 消息最大长度。取值范围1024 - 65536 Byte（即1 - 64K），默认值65536。
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set 消息最大长度。取值范围1024 - 65536 Byte（即1 - 64K），默认值65536。
     * @param MaxMsgSize 消息最大长度。取值范围1024 - 65536 Byte（即1 - 64K），默认值65536。
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get 消息保存时间。取值范围60 - 86400 s（即1分钟 - 1天），默认值86400。 
     * @return MsgRetentionSeconds 消息保存时间。取值范围60 - 86400 s（即1分钟 - 1天），默认值86400。
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set 消息保存时间。取值范围60 - 86400 s（即1分钟 - 1天），默认值86400。
     * @param MsgRetentionSeconds 消息保存时间。取值范围60 - 86400 s（即1分钟 - 1天），默认值86400。
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。 
     * @return Trace 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。
     * @param Trace 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MaxMsgSize", this.MaxMsgSize);
        this.setParamSimple(map, prefix + "MsgRetentionSeconds", this.MsgRetentionSeconds);
        this.setParamSimple(map, prefix + "Trace", this.Trace);

    }
}

