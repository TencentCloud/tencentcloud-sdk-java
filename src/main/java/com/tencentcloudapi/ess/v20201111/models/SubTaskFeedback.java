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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubTaskFeedback extends AbstractModel {

    /**
    * 信息提取子任务ID
    */
    @SerializedName("SubTaskId")
    @Expose
    private String SubTaskId;

    /**
    * 提取结果反馈信息
    */
    @SerializedName("FeedbackList")
    @Expose
    private FeedbackList [] FeedbackList;

    /**
     * Get 信息提取子任务ID 
     * @return SubTaskId 信息提取子任务ID
     */
    public String getSubTaskId() {
        return this.SubTaskId;
    }

    /**
     * Set 信息提取子任务ID
     * @param SubTaskId 信息提取子任务ID
     */
    public void setSubTaskId(String SubTaskId) {
        this.SubTaskId = SubTaskId;
    }

    /**
     * Get 提取结果反馈信息 
     * @return FeedbackList 提取结果反馈信息
     */
    public FeedbackList [] getFeedbackList() {
        return this.FeedbackList;
    }

    /**
     * Set 提取结果反馈信息
     * @param FeedbackList 提取结果反馈信息
     */
    public void setFeedbackList(FeedbackList [] FeedbackList) {
        this.FeedbackList = FeedbackList;
    }

    public SubTaskFeedback() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubTaskFeedback(SubTaskFeedback source) {
        if (source.SubTaskId != null) {
            this.SubTaskId = new String(source.SubTaskId);
        }
        if (source.FeedbackList != null) {
            this.FeedbackList = new FeedbackList[source.FeedbackList.length];
            for (int i = 0; i < source.FeedbackList.length; i++) {
                this.FeedbackList[i] = new FeedbackList(source.FeedbackList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubTaskId", this.SubTaskId);
        this.setParamArrayObj(map, prefix + "FeedbackList.", this.FeedbackList);

    }
}

