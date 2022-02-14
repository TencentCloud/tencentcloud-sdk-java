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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteOfflineLogRecordRequest extends AbstractModel{

    /**
    * 项目唯一上报 key
    */
    @SerializedName("ProjectKey")
    @Expose
    private String ProjectKey;

    /**
    * 离线日志文件 id
    */
    @SerializedName("FileID")
    @Expose
    private String FileID;

    /**
     * Get 项目唯一上报 key 
     * @return ProjectKey 项目唯一上报 key
     */
    public String getProjectKey() {
        return this.ProjectKey;
    }

    /**
     * Set 项目唯一上报 key
     * @param ProjectKey 项目唯一上报 key
     */
    public void setProjectKey(String ProjectKey) {
        this.ProjectKey = ProjectKey;
    }

    /**
     * Get 离线日志文件 id 
     * @return FileID 离线日志文件 id
     */
    public String getFileID() {
        return this.FileID;
    }

    /**
     * Set 离线日志文件 id
     * @param FileID 离线日志文件 id
     */
    public void setFileID(String FileID) {
        this.FileID = FileID;
    }

    public DeleteOfflineLogRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOfflineLogRecordRequest(DeleteOfflineLogRecordRequest source) {
        if (source.ProjectKey != null) {
            this.ProjectKey = new String(source.ProjectKey);
        }
        if (source.FileID != null) {
            this.FileID = new String(source.FileID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectKey", this.ProjectKey);
        this.setParamSimple(map, prefix + "FileID", this.FileID);

    }
}

