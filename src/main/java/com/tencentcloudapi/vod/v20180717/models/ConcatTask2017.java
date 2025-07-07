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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConcatTask2017 extends AbstractModel {

    /**
    * 视频拼接任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 视频拼接源文件信息。
    */
    @SerializedName("FileInfoSet")
    @Expose
    private ConcatFileInfo2017 [] FileInfoSet;

    /**
     * Get 视频拼接任务 ID。 
     * @return TaskId 视频拼接任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 视频拼接任务 ID。
     * @param TaskId 视频拼接任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 视频拼接源文件信息。 
     * @return FileInfoSet 视频拼接源文件信息。
     */
    public ConcatFileInfo2017 [] getFileInfoSet() {
        return this.FileInfoSet;
    }

    /**
     * Set 视频拼接源文件信息。
     * @param FileInfoSet 视频拼接源文件信息。
     */
    public void setFileInfoSet(ConcatFileInfo2017 [] FileInfoSet) {
        this.FileInfoSet = FileInfoSet;
    }

    public ConcatTask2017() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConcatTask2017(ConcatTask2017 source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.FileInfoSet != null) {
            this.FileInfoSet = new ConcatFileInfo2017[source.FileInfoSet.length];
            for (int i = 0; i < source.FileInfoSet.length; i++) {
                this.FileInfoSet[i] = new ConcatFileInfo2017(source.FileInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "FileInfoSet.", this.FileInfoSet);

    }
}

