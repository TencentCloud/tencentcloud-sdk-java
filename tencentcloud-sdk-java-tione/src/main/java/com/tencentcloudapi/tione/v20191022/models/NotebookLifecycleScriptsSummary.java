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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotebookLifecycleScriptsSummary extends AbstractModel{

    /**
    * notebook生命周期脚本名称
    */
    @SerializedName("NotebookLifecycleScriptsName")
    @Expose
    private String NotebookLifecycleScriptsName;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 修改时间
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private String LastModifiedTime;

    /**
     * Get notebook生命周期脚本名称 
     * @return NotebookLifecycleScriptsName notebook生命周期脚本名称
     */
    public String getNotebookLifecycleScriptsName() {
        return this.NotebookLifecycleScriptsName;
    }

    /**
     * Set notebook生命周期脚本名称
     * @param NotebookLifecycleScriptsName notebook生命周期脚本名称
     */
    public void setNotebookLifecycleScriptsName(String NotebookLifecycleScriptsName) {
        this.NotebookLifecycleScriptsName = NotebookLifecycleScriptsName;
    }

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 修改时间 
     * @return LastModifiedTime 修改时间
     */
    public String getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set 修改时间
     * @param LastModifiedTime 修改时间
     */
    public void setLastModifiedTime(String LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotebookLifecycleScriptsName", this.NotebookLifecycleScriptsName);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);

    }
}

