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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupFile extends AbstractModel{

    /**
    * 备份文件所属的副本集/分片ID
    */
    @SerializedName("ReplicateSetId")
    @Expose
    private String ReplicateSetId;

    /**
    * 备份文件保存路径
    */
    @SerializedName("File")
    @Expose
    private String File;

    /**
     * Get 备份文件所属的副本集/分片ID 
     * @return ReplicateSetId 备份文件所属的副本集/分片ID
     */
    public String getReplicateSetId() {
        return this.ReplicateSetId;
    }

    /**
     * Set 备份文件所属的副本集/分片ID
     * @param ReplicateSetId 备份文件所属的副本集/分片ID
     */
    public void setReplicateSetId(String ReplicateSetId) {
        this.ReplicateSetId = ReplicateSetId;
    }

    /**
     * Get 备份文件保存路径 
     * @return File 备份文件保存路径
     */
    public String getFile() {
        return this.File;
    }

    /**
     * Set 备份文件保存路径
     * @param File 备份文件保存路径
     */
    public void setFile(String File) {
        this.File = File;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicateSetId", this.ReplicateSetId);
        this.setParamSimple(map, prefix + "File", this.File);

    }
}

