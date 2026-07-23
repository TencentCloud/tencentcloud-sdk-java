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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDataRepositoryTaskStatusRequest extends AbstractModel {

    /**
    * <p>文件系统ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>数据流动任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>修改数据流动任务目标状态对应的类型，仅支持任务暂停和恢复（暂停对应pause，恢复对应resume）</p><p>枚举值：</p><ul><li>pause： 暂停</li><li>resume： 恢复</li></ul>
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
     * Get <p>文件系统ID</p> 
     * @return FileSystemId <p>文件系统ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统ID</p>
     * @param FileSystemId <p>文件系统ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>数据流动任务ID</p> 
     * @return TaskId <p>数据流动任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>数据流动任务ID</p>
     * @param TaskId <p>数据流动任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>修改数据流动任务目标状态对应的类型，仅支持任务暂停和恢复（暂停对应pause，恢复对应resume）</p><p>枚举值：</p><ul><li>pause： 暂停</li><li>resume： 恢复</li></ul> 
     * @return ModifyType <p>修改数据流动任务目标状态对应的类型，仅支持任务暂停和恢复（暂停对应pause，恢复对应resume）</p><p>枚举值：</p><ul><li>pause： 暂停</li><li>resume： 恢复</li></ul>
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set <p>修改数据流动任务目标状态对应的类型，仅支持任务暂停和恢复（暂停对应pause，恢复对应resume）</p><p>枚举值：</p><ul><li>pause： 暂停</li><li>resume： 恢复</li></ul>
     * @param ModifyType <p>修改数据流动任务目标状态对应的类型，仅支持任务暂停和恢复（暂停对应pause，恢复对应resume）</p><p>枚举值：</p><ul><li>pause： 暂停</li><li>resume： 恢复</li></ul>
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    public ModifyDataRepositoryTaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDataRepositoryTaskStatusRequest(ModifyDataRepositoryTaskStatusRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);

    }
}

