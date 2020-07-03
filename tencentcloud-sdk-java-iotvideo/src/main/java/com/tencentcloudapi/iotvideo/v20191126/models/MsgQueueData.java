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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MsgQueueData extends AbstractModel{

    /**
    * 消息队列类型 1：CMQ 2：kafka
    */
    @SerializedName("MsgQueueType")
    @Expose
    private Long MsgQueueType;

    /**
    * 消息类型列表，整型值（0-31）之间以“,”分隔
    */
    @SerializedName("MsgType")
    @Expose
    private String MsgType;

    /**
    * 主题名称
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 实例名称
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * 消息地域
    */
    @SerializedName("MsgRegion")
    @Expose
    private String MsgRegion;

    /**
     * Get 消息队列类型 1：CMQ 2：kafka 
     * @return MsgQueueType 消息队列类型 1：CMQ 2：kafka
     */
    public Long getMsgQueueType() {
        return this.MsgQueueType;
    }

    /**
     * Set 消息队列类型 1：CMQ 2：kafka
     * @param MsgQueueType 消息队列类型 1：CMQ 2：kafka
     */
    public void setMsgQueueType(Long MsgQueueType) {
        this.MsgQueueType = MsgQueueType;
    }

    /**
     * Get 消息类型列表，整型值（0-31）之间以“,”分隔 
     * @return MsgType 消息类型列表，整型值（0-31）之间以“,”分隔
     */
    public String getMsgType() {
        return this.MsgType;
    }

    /**
     * Set 消息类型列表，整型值（0-31）之间以“,”分隔
     * @param MsgType 消息类型列表，整型值（0-31）之间以“,”分隔
     */
    public void setMsgType(String MsgType) {
        this.MsgType = MsgType;
    }

    /**
     * Get 主题名称 
     * @return Topic 主题名称
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名称
     * @param Topic 主题名称
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 实例名称 
     * @return Instance 实例名称
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set 实例名称
     * @param Instance 实例名称
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 消息地域 
     * @return MsgRegion 消息地域
     */
    public String getMsgRegion() {
        return this.MsgRegion;
    }

    /**
     * Set 消息地域
     * @param MsgRegion 消息地域
     */
    public void setMsgRegion(String MsgRegion) {
        this.MsgRegion = MsgRegion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgQueueType", this.MsgQueueType);
        this.setParamSimple(map, prefix + "MsgType", this.MsgType);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "MsgRegion", this.MsgRegion);

    }
}

