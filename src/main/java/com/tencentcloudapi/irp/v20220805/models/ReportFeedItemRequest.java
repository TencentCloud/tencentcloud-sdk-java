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
package com.tencentcloudapi.irp.v20220805.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportFeedItemRequest extends AbstractModel{

    /**
    * 实例ID，在控制台获取
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 上报的信息流内容数组，一次数量不超过50
    */
    @SerializedName("FeedItemList")
    @Expose
    private DocItem [] FeedItemList;

    /**
     * Get 实例ID，在控制台获取 
     * @return InstanceId 实例ID，在控制台获取
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，在控制台获取
     * @param InstanceId 实例ID，在控制台获取
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 上报的信息流内容数组，一次数量不超过50 
     * @return FeedItemList 上报的信息流内容数组，一次数量不超过50
     */
    public DocItem [] getFeedItemList() {
        return this.FeedItemList;
    }

    /**
     * Set 上报的信息流内容数组，一次数量不超过50
     * @param FeedItemList 上报的信息流内容数组，一次数量不超过50
     */
    public void setFeedItemList(DocItem [] FeedItemList) {
        this.FeedItemList = FeedItemList;
    }

    public ReportFeedItemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportFeedItemRequest(ReportFeedItemRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FeedItemList != null) {
            this.FeedItemList = new DocItem[source.FeedItemList.length];
            for (int i = 0; i < source.FeedItemList.length; i++) {
                this.FeedItemList[i] = new DocItem(source.FeedItemList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "FeedItemList.", this.FeedItemList);

    }
}

