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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryResultRequest extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * objectListMarker={marker}&lastReadFile={filename}&lastReadOffsetlastReadFile为上一次读取的文件，lastReadOffset为上一次读取到的位置
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get objectListMarker={marker}&lastReadFile={filename}&lastReadOffsetlastReadFile为上一次读取的文件，lastReadOffset为上一次读取到的位置 
     * @return NextToken objectListMarker={marker}&lastReadFile={filename}&lastReadOffsetlastReadFile为上一次读取的文件，lastReadOffset为上一次读取到的位置
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set objectListMarker={marker}&lastReadFile={filename}&lastReadOffsetlastReadFile为上一次读取的文件，lastReadOffset为上一次读取到的位置
     * @param NextToken objectListMarker={marker}&lastReadFile={filename}&lastReadOffsetlastReadFile为上一次读取的文件，lastReadOffset为上一次读取到的位置
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public QueryResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryResultRequest(QueryResultRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

