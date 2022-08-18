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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenKafkaConsumerRequest extends AbstractModel{

    /**
    * CLS控制台创建的TopicId
    */
    @SerializedName("FromTopicId")
    @Expose
    private String FromTopicId;

    /**
    * 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
    */
    @SerializedName("Compression")
    @Expose
    private Long Compression;

    /**
     * Get CLS控制台创建的TopicId 
     * @return FromTopicId CLS控制台创建的TopicId
     */
    public String getFromTopicId() {
        return this.FromTopicId;
    }

    /**
     * Set CLS控制台创建的TopicId
     * @param FromTopicId CLS控制台创建的TopicId
     */
    public void setFromTopicId(String FromTopicId) {
        this.FromTopicId = FromTopicId;
    }

    /**
     * Get 压缩方式[0:NONE；2:SNAPPY；3:LZ4] 
     * @return Compression 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
     */
    public Long getCompression() {
        return this.Compression;
    }

    /**
     * Set 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
     * @param Compression 压缩方式[0:NONE；2:SNAPPY；3:LZ4]
     */
    public void setCompression(Long Compression) {
        this.Compression = Compression;
    }

    public OpenKafkaConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenKafkaConsumerRequest(OpenKafkaConsumerRequest source) {
        if (source.FromTopicId != null) {
            this.FromTopicId = new String(source.FromTopicId);
        }
        if (source.Compression != null) {
            this.Compression = new Long(source.Compression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromTopicId", this.FromTopicId);
        this.setParamSimple(map, prefix + "Compression", this.Compression);

    }
}

