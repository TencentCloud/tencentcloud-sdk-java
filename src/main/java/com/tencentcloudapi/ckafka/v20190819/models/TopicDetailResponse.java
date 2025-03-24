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

public class TopicDetailResponse extends AbstractModel {

    /**
    * 返回的主题详情列表
    */
    @SerializedName("TopicList")
    @Expose
    private TopicDetail [] TopicList;

    /**
    * 符合条件的所有主题详情数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 返回的主题详情列表 
     * @return TopicList 返回的主题详情列表
     */
    public TopicDetail [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set 返回的主题详情列表
     * @param TopicList 返回的主题详情列表
     */
    public void setTopicList(TopicDetail [] TopicList) {
        this.TopicList = TopicList;
    }

    /**
     * Get 符合条件的所有主题详情数量 
     * @return TotalCount 符合条件的所有主题详情数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的所有主题详情数量
     * @param TotalCount 符合条件的所有主题详情数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public TopicDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicDetailResponse(TopicDetailResponse source) {
        if (source.TopicList != null) {
            this.TopicList = new TopicDetail[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new TopicDetail(source.TopicList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

