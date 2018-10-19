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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Action  extends AbstractModel{

    /**
    * 转发至topic
    */
    @SerializedName("Topic")
    @Expose
    private TopicAction Topic;

    /**
    * 转发至第三发
    */
    @SerializedName("Service")
    @Expose
    private ServiceAction Service;

    /**
    * 转发至第三发Ckafka
    */
    @SerializedName("Ckafka")
    @Expose
    private CkafkaAction Ckafka;

    /**
     * 获取转发至topic
     * @return Topic 转发至topic
     */
    public TopicAction getTopic() {
        return this.Topic;
    }

    /**
     * 设置转发至topic
     * @param Topic 转发至topic
     */
    public void setTopic(TopicAction Topic) {
        this.Topic = Topic;
    }

    /**
     * 获取转发至第三发
     * @return Service 转发至第三发
     */
    public ServiceAction getService() {
        return this.Service;
    }

    /**
     * 设置转发至第三发
     * @param Service 转发至第三发
     */
    public void setService(ServiceAction Service) {
        this.Service = Service;
    }

    /**
     * 获取转发至第三发Ckafka
     * @return Ckafka 转发至第三发Ckafka
     */
    public CkafkaAction getCkafka() {
        return this.Ckafka;
    }

    /**
     * 设置转发至第三发Ckafka
     * @param Ckafka 转发至第三发Ckafka
     */
    public void setCkafka(CkafkaAction Ckafka) {
        this.Ckafka = Ckafka;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Topic.", this.Topic);
        this.setParamObj(map, prefix + "Service.", this.Service);
        this.setParamObj(map, prefix + "Ckafka.", this.Ckafka);

    }
}

