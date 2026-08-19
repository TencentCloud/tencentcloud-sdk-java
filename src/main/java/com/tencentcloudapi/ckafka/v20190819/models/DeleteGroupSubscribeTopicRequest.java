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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGroupSubscribeTopicRequest extends AbstractModel {

    /**
    * <p>ckafka集群实例Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>消费分组名称</p>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>主题名</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
     * Get <p>ckafka集群实例Id</p> 
     * @return InstanceId <p>ckafka集群实例Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id</p>
     * @param InstanceId <p>ckafka集群实例Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>消费分组名称</p> 
     * @return Group <p>消费分组名称</p>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>消费分组名称</p>
     * @param Group <p>消费分组名称</p>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>主题名</p> 
     * @return Topic <p>主题名</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>主题名</p>
     * @param Topic <p>主题名</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    public DeleteGroupSubscribeTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGroupSubscribeTopicRequest(DeleteGroupSubscribeTopicRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Topic", this.Topic);

    }
}

