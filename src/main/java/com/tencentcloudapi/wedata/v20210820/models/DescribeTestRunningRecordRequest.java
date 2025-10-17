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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTestRunningRecordRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 搜索关键词
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 搜索用户UIN
    */
    @SerializedName("SearchUserUin")
    @Expose
    private String SearchUserUin;

    /**
    * 试运行记录创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 试运行记录最大创建结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 试运行记录id
    */
    @SerializedName("RecordIdList")
    @Expose
    private Long [] RecordIdList;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页索引
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 搜索关键词 
     * @return SearchWord 搜索关键词
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键词
     * @param SearchWord 搜索关键词
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 搜索用户UIN 
     * @return SearchUserUin 搜索用户UIN
     */
    public String getSearchUserUin() {
        return this.SearchUserUin;
    }

    /**
     * Set 搜索用户UIN
     * @param SearchUserUin 搜索用户UIN
     */
    public void setSearchUserUin(String SearchUserUin) {
        this.SearchUserUin = SearchUserUin;
    }

    /**
     * Get 试运行记录创建时间 
     * @return CreateTime 试运行记录创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 试运行记录创建时间
     * @param CreateTime 试运行记录创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 试运行记录最大创建结束时间 
     * @return EndTime 试运行记录最大创建结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 试运行记录最大创建结束时间
     * @param EndTime 试运行记录最大创建结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 试运行记录id 
     * @return RecordIdList 试运行记录id
     */
    public Long [] getRecordIdList() {
        return this.RecordIdList;
    }

    /**
     * Set 试运行记录id
     * @param RecordIdList 试运行记录id
     */
    public void setRecordIdList(Long [] RecordIdList) {
        this.RecordIdList = RecordIdList;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页索引 
     * @return PageIndex 分页索引
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 分页索引
     * @param PageIndex 分页索引
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    public DescribeTestRunningRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTestRunningRecordRequest(DescribeTestRunningRecordRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.SearchUserUin != null) {
            this.SearchUserUin = new String(source.SearchUserUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RecordIdList != null) {
            this.RecordIdList = new Long[source.RecordIdList.length];
            for (int i = 0; i < source.RecordIdList.length; i++) {
                this.RecordIdList[i] = new Long(source.RecordIdList[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "SearchUserUin", this.SearchUserUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "RecordIdList.", this.RecordIdList);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);

    }
}

