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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClipTask2017 extends AbstractModel{

    /**
    * 视频剪辑任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 视频剪辑任务源文件 ID。
    */
    @SerializedName("SrcFileId")
    @Expose
    private String SrcFileId;

    /**
    * 视频剪辑输出的文件信息。
    */
    @SerializedName("FileInfo")
    @Expose
    private ClipFileInfo2017 FileInfo;

    /**
     * Get 视频剪辑任务 ID。 
     * @return TaskId 视频剪辑任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 视频剪辑任务 ID。
     * @param TaskId 视频剪辑任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 视频剪辑任务源文件 ID。 
     * @return SrcFileId 视频剪辑任务源文件 ID。
     */
    public String getSrcFileId() {
        return this.SrcFileId;
    }

    /**
     * Set 视频剪辑任务源文件 ID。
     * @param SrcFileId 视频剪辑任务源文件 ID。
     */
    public void setSrcFileId(String SrcFileId) {
        this.SrcFileId = SrcFileId;
    }

    /**
     * Get 视频剪辑输出的文件信息。 
     * @return FileInfo 视频剪辑输出的文件信息。
     */
    public ClipFileInfo2017 getFileInfo() {
        return this.FileInfo;
    }

    /**
     * Set 视频剪辑输出的文件信息。
     * @param FileInfo 视频剪辑输出的文件信息。
     */
    public void setFileInfo(ClipFileInfo2017 FileInfo) {
        this.FileInfo = FileInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SrcFileId", this.SrcFileId);
        this.setParamObj(map, prefix + "FileInfo.", this.FileInfo);

    }
}

