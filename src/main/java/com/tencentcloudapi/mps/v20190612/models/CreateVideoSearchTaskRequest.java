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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVideoSearchTaskRequest extends AbstractModel {

    /**
    * 用于检索任务的输入
    */
    @SerializedName("SearchValueInput")
    @Expose
    private SearchValueInput SearchValueInput;

    /**
    * 返回视频的最大数量，取值范围[1,20]，将返回最相近的前Limit条视频,默认为5
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 可选，用于检索任务完成后向回调方发送检索结果，目前仅支持URL方式
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
     * Get 用于检索任务的输入 
     * @return SearchValueInput 用于检索任务的输入
     */
    public SearchValueInput getSearchValueInput() {
        return this.SearchValueInput;
    }

    /**
     * Set 用于检索任务的输入
     * @param SearchValueInput 用于检索任务的输入
     */
    public void setSearchValueInput(SearchValueInput SearchValueInput) {
        this.SearchValueInput = SearchValueInput;
    }

    /**
     * Get 返回视频的最大数量，取值范围[1,20]，将返回最相近的前Limit条视频,默认为5 
     * @return Limit 返回视频的最大数量，取值范围[1,20]，将返回最相近的前Limit条视频,默认为5
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回视频的最大数量，取值范围[1,20]，将返回最相近的前Limit条视频,默认为5
     * @param Limit 返回视频的最大数量，取值范围[1,20]，将返回最相近的前Limit条视频,默认为5
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 可选，用于检索任务完成后向回调方发送检索结果，目前仅支持URL方式 
     * @return TaskNotifyConfig 可选，用于检索任务完成后向回调方发送检索结果，目前仅支持URL方式
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 可选，用于检索任务完成后向回调方发送检索结果，目前仅支持URL方式
     * @param TaskNotifyConfig 可选，用于检索任务完成后向回调方发送检索结果，目前仅支持URL方式
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    public CreateVideoSearchTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVideoSearchTaskRequest(CreateVideoSearchTaskRequest source) {
        if (source.SearchValueInput != null) {
            this.SearchValueInput = new SearchValueInput(source.SearchValueInput);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SearchValueInput.", this.SearchValueInput);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);

    }
}

