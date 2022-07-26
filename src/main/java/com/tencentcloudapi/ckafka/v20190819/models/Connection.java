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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Connection extends AbstractModel{

    /**
    * Topic名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 消费组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Topic的Id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get Topic名称 
     * @return TopicName Topic名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic名称
     * @param TopicName Topic名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 消费组ID 
     * @return GroupId 消费组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 消费组ID
     * @param GroupId 消费组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Topic的Id 
     * @return TopicId Topic的Id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic的Id
     * @param TopicId Topic的Id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public Connection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Connection(Connection source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

