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

public class SetMessageQueueRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 消息队列类型 1-CMQ; 2-Ckafka
    */
    @SerializedName("MsgQueueType")
    @Expose
    private Long MsgQueueType;

    /**
    * 消息类型,整型值（0-31）之间以“,”分隔
0：在线状态变更
1.固件版本变更
2.设置参数变更
3.控制状态变更
4.状态信息变更
5.事件发布
    */
    @SerializedName("MsgType")
    @Expose
    private String MsgType;

    /**
    * 消息队列主题，不超过32字符
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * kafka消息队列的实例名，不超过64字符
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * 消息地域，不超过32字符
    */
    @SerializedName("MsgRegion")
    @Expose
    private String MsgRegion;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 消息队列类型 1-CMQ; 2-Ckafka 
     * @return MsgQueueType 消息队列类型 1-CMQ; 2-Ckafka
     */
    public Long getMsgQueueType() {
        return this.MsgQueueType;
    }

    /**
     * Set 消息队列类型 1-CMQ; 2-Ckafka
     * @param MsgQueueType 消息队列类型 1-CMQ; 2-Ckafka
     */
    public void setMsgQueueType(Long MsgQueueType) {
        this.MsgQueueType = MsgQueueType;
    }

    /**
     * Get 消息类型,整型值（0-31）之间以“,”分隔
0：在线状态变更
1.固件版本变更
2.设置参数变更
3.控制状态变更
4.状态信息变更
5.事件发布 
     * @return MsgType 消息类型,整型值（0-31）之间以“,”分隔
0：在线状态变更
1.固件版本变更
2.设置参数变更
3.控制状态变更
4.状态信息变更
5.事件发布
     */
    public String getMsgType() {
        return this.MsgType;
    }

    /**
     * Set 消息类型,整型值（0-31）之间以“,”分隔
0：在线状态变更
1.固件版本变更
2.设置参数变更
3.控制状态变更
4.状态信息变更
5.事件发布
     * @param MsgType 消息类型,整型值（0-31）之间以“,”分隔
0：在线状态变更
1.固件版本变更
2.设置参数变更
3.控制状态变更
4.状态信息变更
5.事件发布
     */
    public void setMsgType(String MsgType) {
        this.MsgType = MsgType;
    }

    /**
     * Get 消息队列主题，不超过32字符 
     * @return Topic 消息队列主题，不超过32字符
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 消息队列主题，不超过32字符
     * @param Topic 消息队列主题，不超过32字符
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get kafka消息队列的实例名，不超过64字符 
     * @return Instance kafka消息队列的实例名，不超过64字符
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set kafka消息队列的实例名，不超过64字符
     * @param Instance kafka消息队列的实例名，不超过64字符
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 消息地域，不超过32字符 
     * @return MsgRegion 消息地域，不超过32字符
     */
    public String getMsgRegion() {
        return this.MsgRegion;
    }

    /**
     * Set 消息地域，不超过32字符
     * @param MsgRegion 消息地域，不超过32字符
     */
    public void setMsgRegion(String MsgRegion) {
        this.MsgRegion = MsgRegion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "MsgQueueType", this.MsgQueueType);
        this.setParamSimple(map, prefix + "MsgType", this.MsgType);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "MsgRegion", this.MsgRegion);

    }
}

