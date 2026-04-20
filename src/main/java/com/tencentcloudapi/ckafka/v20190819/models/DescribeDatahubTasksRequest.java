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

public class DescribeDatahubTasksRequest extends AbstractModel {

    /**
    * <p>返回数量，默认为20，最大值为100 (超过100限制为100)</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>过滤条件，按照 TaskName 过滤，支持模糊查询</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>转储的目标类型</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>任务类型，SOURCE数据接入，SINK数据流出</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>转储的源类型</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>转储的资源</p>
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
     * Get <p>返回数量，默认为20，最大值为100 (超过100限制为100)</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100 (超过100限制为100)</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100 (超过100限制为100)</p>
     * @param Limit <p>返回数量，默认为20，最大值为100 (超过100限制为100)</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量，默认为0</p> 
     * @return Offset <p>分页偏移量，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认为0</p>
     * @param Offset <p>分页偏移量，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>过滤条件，按照 TaskName 过滤，支持模糊查询</p> 
     * @return SearchWord <p>过滤条件，按照 TaskName 过滤，支持模糊查询</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>过滤条件，按照 TaskName 过滤，支持模糊查询</p>
     * @param SearchWord <p>过滤条件，按照 TaskName 过滤，支持模糊查询</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>转储的目标类型</p> 
     * @return TargetType <p>转储的目标类型</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>转储的目标类型</p>
     * @param TargetType <p>转储的目标类型</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>任务类型，SOURCE数据接入，SINK数据流出</p> 
     * @return TaskType <p>任务类型，SOURCE数据接入，SINK数据流出</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型，SOURCE数据接入，SINK数据流出</p>
     * @param TaskType <p>任务类型，SOURCE数据接入，SINK数据流出</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>转储的源类型</p> 
     * @return SourceType <p>转储的源类型</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>转储的源类型</p>
     * @param SourceType <p>转储的源类型</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>转储的资源</p> 
     * @return Resource <p>转储的资源</p>
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set <p>转储的资源</p>
     * @param Resource <p>转储的资源</p>
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    public DescribeDatahubTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatahubTasksRequest(DescribeDatahubTasksRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Resource", this.Resource);

    }
}

