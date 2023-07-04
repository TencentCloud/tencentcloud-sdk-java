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

public class DescribeKafkaRechargesRequest extends AbstractModel{

    /**
    * 日志主题 ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 导入配置ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 状态   status 1: 运行中, 2: 暂停...
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 日志主题 ID 
     * @return TopicId 日志主题 ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题 ID
     * @param TopicId 日志主题 ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 导入配置ID 
     * @return Id 导入配置ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 导入配置ID
     * @param Id 导入配置ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 状态   status 1: 运行中, 2: 暂停... 
     * @return Status 状态   status 1: 运行中, 2: 暂停...
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态   status 1: 运行中, 2: 暂停...
     * @param Status 状态   status 1: 运行中, 2: 暂停...
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DescribeKafkaRechargesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKafkaRechargesRequest(DescribeKafkaRechargesRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

