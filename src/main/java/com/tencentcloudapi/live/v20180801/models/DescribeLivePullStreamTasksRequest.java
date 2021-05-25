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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLivePullStreamTasksRequest extends AbstractModel{

    /**
    * 任务 ID。 
来源：调用 CreateLivePullStreamTask 接口时返回。
不填默认查询所有任务，按更新时间倒序排序。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 取得第几页，默认值：1。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 分页大小，默认值：10。
取值范围：1~20 之前的任意整数。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 任务 ID。 
来源：调用 CreateLivePullStreamTask 接口时返回。
不填默认查询所有任务，按更新时间倒序排序。 
     * @return TaskId 任务 ID。 
来源：调用 CreateLivePullStreamTask 接口时返回。
不填默认查询所有任务，按更新时间倒序排序。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID。 
来源：调用 CreateLivePullStreamTask 接口时返回。
不填默认查询所有任务，按更新时间倒序排序。
     * @param TaskId 任务 ID。 
来源：调用 CreateLivePullStreamTask 接口时返回。
不填默认查询所有任务，按更新时间倒序排序。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 取得第几页，默认值：1。 
     * @return PageNum 取得第几页，默认值：1。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 取得第几页，默认值：1。
     * @param PageNum 取得第几页，默认值：1。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 分页大小，默认值：10。
取值范围：1~20 之前的任意整数。 
     * @return PageSize 分页大小，默认值：10。
取值范围：1~20 之前的任意整数。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，默认值：10。
取值范围：1~20 之前的任意整数。
     * @param PageSize 分页大小，默认值：10。
取值范围：1~20 之前的任意整数。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeLivePullStreamTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLivePullStreamTasksRequest(DescribeLivePullStreamTasksRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

