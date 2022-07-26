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

public class DescribeDatahubTasksRequest extends AbstractModel{

    /**
    * 返回数量，默认为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件，按照 TaskName 过滤，支持模糊查询
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 转储的目标类型
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 任务类型，SOURCE数据接入，SINK数据流出
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 转储的源类型
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 转储的资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
     * Get 返回数量，默认为20，最大值为100 
     * @return Limit 返回数量，默认为20，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100
     * @param Limit 返回数量，默认为20，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，默认为0 
     * @return Offset 分页偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认为0
     * @param Offset 分页偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件，按照 TaskName 过滤，支持模糊查询 
     * @return SearchWord 过滤条件，按照 TaskName 过滤，支持模糊查询
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 过滤条件，按照 TaskName 过滤，支持模糊查询
     * @param SearchWord 过滤条件，按照 TaskName 过滤，支持模糊查询
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 转储的目标类型 
     * @return TargetType 转储的目标类型
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 转储的目标类型
     * @param TargetType 转储的目标类型
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 任务类型，SOURCE数据接入，SINK数据流出 
     * @return TaskType 任务类型，SOURCE数据接入，SINK数据流出
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，SOURCE数据接入，SINK数据流出
     * @param TaskType 任务类型，SOURCE数据接入，SINK数据流出
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 转储的源类型 
     * @return SourceType 转储的源类型
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 转储的源类型
     * @param SourceType 转储的源类型
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 转储的资源 
     * @return Resource 转储的资源
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 转储的资源
     * @param Resource 转储的资源
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

