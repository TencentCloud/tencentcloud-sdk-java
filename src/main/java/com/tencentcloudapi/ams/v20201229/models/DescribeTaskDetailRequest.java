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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailRequest extends AbstractModel {

    /**
    * <p>该字段表示创建音频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。<br><br>备注：查询接口单次最大查询量为<strong>20条每次</strong>。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>该布尔字段表示是否展示全部的音频片段，取值：True(展示全部的音频分片)、False(只展示命中审核规则的音频分片)；默认值为False。</p>
    */
    @SerializedName("ShowAllSegments")
    @Expose
    private Boolean ShowAllSegments;

    /**
     * Get <p>该字段表示创建音频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。<br><br>备注：查询接口单次最大查询量为<strong>20条每次</strong>。</p> 
     * @return TaskId <p>该字段表示创建音频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。<br><br>备注：查询接口单次最大查询量为<strong>20条每次</strong>。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>该字段表示创建音频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。<br><br>备注：查询接口单次最大查询量为<strong>20条每次</strong>。</p>
     * @param TaskId <p>该字段表示创建音频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。<br><br>备注：查询接口单次最大查询量为<strong>20条每次</strong>。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>该布尔字段表示是否展示全部的音频片段，取值：True(展示全部的音频分片)、False(只展示命中审核规则的音频分片)；默认值为False。</p> 
     * @return ShowAllSegments <p>该布尔字段表示是否展示全部的音频片段，取值：True(展示全部的音频分片)、False(只展示命中审核规则的音频分片)；默认值为False。</p>
     */
    public Boolean getShowAllSegments() {
        return this.ShowAllSegments;
    }

    /**
     * Set <p>该布尔字段表示是否展示全部的音频片段，取值：True(展示全部的音频分片)、False(只展示命中审核规则的音频分片)；默认值为False。</p>
     * @param ShowAllSegments <p>该布尔字段表示是否展示全部的音频片段，取值：True(展示全部的音频分片)、False(只展示命中审核规则的音频分片)；默认值为False。</p>
     */
    public void setShowAllSegments(Boolean ShowAllSegments) {
        this.ShowAllSegments = ShowAllSegments;
    }

    public DescribeTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskDetailRequest(DescribeTaskDetailRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ShowAllSegments != null) {
            this.ShowAllSegments = new Boolean(source.ShowAllSegments);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ShowAllSegments", this.ShowAllSegments);

    }
}

