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

public class SeeCallbackCKafkaConfig extends AbstractModel {

    /**
    * <p>CKafka 实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>CKafka 实例中的 Topic 名</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>CKafka 实例所在的地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get <p>CKafka 实例 ID</p> 
     * @return InstanceId <p>CKafka 实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>CKafka 实例 ID</p>
     * @param InstanceId <p>CKafka 实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>CKafka 实例中的 Topic 名</p> 
     * @return Topic <p>CKafka 实例中的 Topic 名</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>CKafka 实例中的 Topic 名</p>
     * @param Topic <p>CKafka 实例中的 Topic 名</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>CKafka 实例所在的地域</p> 
     * @return Region <p>CKafka 实例所在的地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>CKafka 实例所在的地域</p>
     * @param Region <p>CKafka 实例所在的地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public SeeCallbackCKafkaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeCallbackCKafkaConfig(SeeCallbackCKafkaConfig source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

