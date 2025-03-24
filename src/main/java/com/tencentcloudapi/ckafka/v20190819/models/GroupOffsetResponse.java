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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupOffsetResponse extends AbstractModel {

    /**
    * 符合调节的总结果数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 该主题分区数组，其中每个元素为一个 json object
    */
    @SerializedName("TopicList")
    @Expose
    private GroupOffsetTopic [] TopicList;

    /**
     * Get 符合调节的总结果数 
     * @return TotalCount 符合调节的总结果数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合调节的总结果数
     * @param TotalCount 符合调节的总结果数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 该主题分区数组，其中每个元素为一个 json object 
     * @return TopicList 该主题分区数组，其中每个元素为一个 json object
     */
    public GroupOffsetTopic [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set 该主题分区数组，其中每个元素为一个 json object
     * @param TopicList 该主题分区数组，其中每个元素为一个 json object
     */
    public void setTopicList(GroupOffsetTopic [] TopicList) {
        this.TopicList = TopicList;
    }

    public GroupOffsetResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupOffsetResponse(GroupOffsetResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TopicList != null) {
            this.TopicList = new GroupOffsetTopic[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new GroupOffsetTopic(source.TopicList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);

    }
}

