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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CkafkaParams extends AbstractModel {

    /**
    * kafka offset
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * ckafka  topic
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get kafka offset 
     * @return Offset kafka offset
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set kafka offset
     * @param Offset kafka offset
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get ckafka  topic 
     * @return TopicName ckafka  topic
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set ckafka  topic
     * @param TopicName ckafka  topic
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public CkafkaParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CkafkaParams(CkafkaParams source) {
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

