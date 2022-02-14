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

public class DescribeOfflineLogsRequest extends AbstractModel{

    /**
    * 项目唯一上报 key
    */
    @SerializedName("ProjectKey")
    @Expose
    private String ProjectKey;

    /**
    * 离线日志文件 id 列表
    */
    @SerializedName("FileIDs")
    @Expose
    private String [] FileIDs;

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
     * Get 离线日志文件 id 列表 
     * @return FileIDs 离线日志文件 id 列表
     */
    public String [] getFileIDs() {
        return this.FileIDs;
    }

    /**
     * Set 离线日志文件 id 列表
     * @param FileIDs 离线日志文件 id 列表
     */
    public void setFileIDs(String [] FileIDs) {
        this.FileIDs = FileIDs;
    }

    public DescribeOfflineLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOfflineLogsRequest(DescribeOfflineLogsRequest source) {
        if (source.ProjectKey != null) {
            this.ProjectKey = new String(source.ProjectKey);
        }
        if (source.FileIDs != null) {
            this.FileIDs = new String[source.FileIDs.length];
            for (int i = 0; i < source.FileIDs.length; i++) {
                this.FileIDs[i] = new String(source.FileIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectKey", this.ProjectKey);
        this.setParamArraySimple(map, prefix + "FileIDs.", this.FileIDs);

    }
}

