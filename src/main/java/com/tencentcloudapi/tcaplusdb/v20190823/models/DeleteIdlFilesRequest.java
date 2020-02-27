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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteIdlFilesRequest extends AbstractModel{

    /**
    * IDL所属集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 待删除的IDL文件信息列表
    */
    @SerializedName("IdlFiles")
    @Expose
    private IdlFileInfo [] IdlFiles;

    /**
     * Get IDL所属集群ID 
     * @return ClusterId IDL所属集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set IDL所属集群ID
     * @param ClusterId IDL所属集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 待删除的IDL文件信息列表 
     * @return IdlFiles 待删除的IDL文件信息列表
     */
    public IdlFileInfo [] getIdlFiles() {
        return this.IdlFiles;
    }

    /**
     * Set 待删除的IDL文件信息列表
     * @param IdlFiles 待删除的IDL文件信息列表
     */
    public void setIdlFiles(IdlFileInfo [] IdlFiles) {
        this.IdlFiles = IdlFiles;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "IdlFiles.", this.IdlFiles);

    }
}

