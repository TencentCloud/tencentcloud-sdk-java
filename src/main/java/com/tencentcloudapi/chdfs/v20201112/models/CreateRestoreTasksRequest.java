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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRestoreTasksRequest extends AbstractModel{

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 多个回热任务，上限为10
    */
    @SerializedName("RestoreTasks")
    @Expose
    private RestoreTask [] RestoreTasks;

    /**
     * Get 文件系统ID 
     * @return FileSystemId 文件系统ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
     * @param FileSystemId 文件系统ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 多个回热任务，上限为10 
     * @return RestoreTasks 多个回热任务，上限为10
     */
    public RestoreTask [] getRestoreTasks() {
        return this.RestoreTasks;
    }

    /**
     * Set 多个回热任务，上限为10
     * @param RestoreTasks 多个回热任务，上限为10
     */
    public void setRestoreTasks(RestoreTask [] RestoreTasks) {
        this.RestoreTasks = RestoreTasks;
    }

    public CreateRestoreTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRestoreTasksRequest(CreateRestoreTasksRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.RestoreTasks != null) {
            this.RestoreTasks = new RestoreTask[source.RestoreTasks.length];
            for (int i = 0; i < source.RestoreTasks.length; i++) {
                this.RestoreTasks[i] = new RestoreTask(source.RestoreTasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamArrayObj(map, prefix + "RestoreTasks.", this.RestoreTasks);

    }
}

