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

public class CreateConsumerRequest extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * group名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * topic名称，TopicName、TopicNameList 需要显示指定一个存在的topic名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * topic名称数组
    */
    @SerializedName("TopicNameList")
    @Expose
    private String [] TopicNameList;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get group名称 
     * @return GroupName group名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set group名称
     * @param GroupName group名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get topic名称，TopicName、TopicNameList 需要显示指定一个存在的topic名称 
     * @return TopicName topic名称，TopicName、TopicNameList 需要显示指定一个存在的topic名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set topic名称，TopicName、TopicNameList 需要显示指定一个存在的topic名称
     * @param TopicName topic名称，TopicName、TopicNameList 需要显示指定一个存在的topic名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get topic名称数组 
     * @return TopicNameList topic名称数组
     */
    public String [] getTopicNameList() {
        return this.TopicNameList;
    }

    /**
     * Set topic名称数组
     * @param TopicNameList topic名称数组
     */
    public void setTopicNameList(String [] TopicNameList) {
        this.TopicNameList = TopicNameList;
    }

    public CreateConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsumerRequest(CreateConsumerRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.TopicNameList != null) {
            this.TopicNameList = new String[source.TopicNameList.length];
            for (int i = 0; i < source.TopicNameList.length; i++) {
                this.TopicNameList[i] = new String(source.TopicNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArraySimple(map, prefix + "TopicNameList.", this.TopicNameList);

    }
}

