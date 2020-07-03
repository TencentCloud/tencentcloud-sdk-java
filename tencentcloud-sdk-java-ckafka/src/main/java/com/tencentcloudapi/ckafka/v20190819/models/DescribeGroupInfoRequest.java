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

public class DescribeGroupInfoRequest extends AbstractModel{

    /**
    * （过滤条件）按照实例 ID 过滤。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Kafka 消费分组，Consumer-group，这里是数组形式，格式：GroupList.0=xxx&GroupList.1=yyy。
    */
    @SerializedName("GroupList")
    @Expose
    private String [] GroupList;

    /**
     * Get （过滤条件）按照实例 ID 过滤。 
     * @return InstanceId （过滤条件）按照实例 ID 过滤。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set （过滤条件）按照实例 ID 过滤。
     * @param InstanceId （过滤条件）按照实例 ID 过滤。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Kafka 消费分组，Consumer-group，这里是数组形式，格式：GroupList.0=xxx&GroupList.1=yyy。 
     * @return GroupList Kafka 消费分组，Consumer-group，这里是数组形式，格式：GroupList.0=xxx&GroupList.1=yyy。
     */
    public String [] getGroupList() {
        return this.GroupList;
    }

    /**
     * Set Kafka 消费分组，Consumer-group，这里是数组形式，格式：GroupList.0=xxx&GroupList.1=yyy。
     * @param GroupList Kafka 消费分组，Consumer-group，这里是数组形式，格式：GroupList.0=xxx&GroupList.1=yyy。
     */
    public void setGroupList(String [] GroupList) {
        this.GroupList = GroupList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "GroupList.", this.GroupList);

    }
}

