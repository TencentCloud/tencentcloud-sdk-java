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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskFolderResult extends AbstractModel {

    /**
    * 创建成功的文件夹ID。如果创建失败则报错。
    */
    @SerializedName("TaskFolderId")
    @Expose
    private String TaskFolderId;

    /**
     * Get 创建成功的文件夹ID。如果创建失败则报错。 
     * @return TaskFolderId 创建成功的文件夹ID。如果创建失败则报错。
     */
    public String getTaskFolderId() {
        return this.TaskFolderId;
    }

    /**
     * Set 创建成功的文件夹ID。如果创建失败则报错。
     * @param TaskFolderId 创建成功的文件夹ID。如果创建失败则报错。
     */
    public void setTaskFolderId(String TaskFolderId) {
        this.TaskFolderId = TaskFolderId;
    }

    public CreateTaskFolderResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskFolderResult(CreateTaskFolderResult source) {
        if (source.TaskFolderId != null) {
            this.TaskFolderId = new String(source.TaskFolderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskFolderId", this.TaskFolderId);

    }
}

