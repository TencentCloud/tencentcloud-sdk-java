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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishCmqMsgRequest extends AbstractModel{

    /**
    * 主题名
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 消息内容
    */
    @SerializedName("MsgContent")
    @Expose
    private String MsgContent;

    /**
    * 消息标签
    */
    @SerializedName("MsgTag")
    @Expose
    private String [] MsgTag;

    /**
     * Get 主题名 
     * @return TopicName 主题名
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名
     * @param TopicName 主题名
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 消息内容 
     * @return MsgContent 消息内容
     */
    public String getMsgContent() {
        return this.MsgContent;
    }

    /**
     * Set 消息内容
     * @param MsgContent 消息内容
     */
    public void setMsgContent(String MsgContent) {
        this.MsgContent = MsgContent;
    }

    /**
     * Get 消息标签 
     * @return MsgTag 消息标签
     */
    public String [] getMsgTag() {
        return this.MsgTag;
    }

    /**
     * Set 消息标签
     * @param MsgTag 消息标签
     */
    public void setMsgTag(String [] MsgTag) {
        this.MsgTag = MsgTag;
    }

    public PublishCmqMsgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishCmqMsgRequest(PublishCmqMsgRequest source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MsgContent != null) {
            this.MsgContent = new String(source.MsgContent);
        }
        if (source.MsgTag != null) {
            this.MsgTag = new String[source.MsgTag.length];
            for (int i = 0; i < source.MsgTag.length; i++) {
                this.MsgTag[i] = new String(source.MsgTag[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgContent", this.MsgContent);
        this.setParamArraySimple(map, prefix + "MsgTag.", this.MsgTag);

    }
}

