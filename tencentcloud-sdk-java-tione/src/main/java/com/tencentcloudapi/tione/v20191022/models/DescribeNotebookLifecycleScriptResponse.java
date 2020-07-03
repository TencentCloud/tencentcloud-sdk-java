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

public class DescribeNotebookLifecycleScriptResponse extends AbstractModel{

    /**
    * 生命周期脚本名称
    */
    @SerializedName("NotebookLifecycleScriptsName")
    @Expose
    private String NotebookLifecycleScriptsName;

    /**
    * 创建脚本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateScript")
    @Expose
    private String CreateScript;

    /**
    * 启动脚本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartScript")
    @Expose
    private String StartScript;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 最后修改时间
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private String LastModifiedTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 生命周期脚本名称 
     * @return NotebookLifecycleScriptsName 生命周期脚本名称
     */
    public String getNotebookLifecycleScriptsName() {
        return this.NotebookLifecycleScriptsName;
    }

    /**
     * Set 生命周期脚本名称
     * @param NotebookLifecycleScriptsName 生命周期脚本名称
     */
    public void setNotebookLifecycleScriptsName(String NotebookLifecycleScriptsName) {
        this.NotebookLifecycleScriptsName = NotebookLifecycleScriptsName;
    }

    /**
     * Get 创建脚本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateScript 创建脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateScript() {
        return this.CreateScript;
    }

    /**
     * Set 创建脚本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateScript 创建脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateScript(String CreateScript) {
        this.CreateScript = CreateScript;
    }

    /**
     * Get 启动脚本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartScript 启动脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartScript() {
        return this.StartScript;
    }

    /**
     * Set 启动脚本
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartScript 启动脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartScript(String StartScript) {
        this.StartScript = StartScript;
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
     * Get 最后修改时间 
     * @return LastModifiedTime 最后修改时间
     */
    public String getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set 最后修改时间
     * @param LastModifiedTime 最后修改时间
     */
    public void setLastModifiedTime(String LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotebookLifecycleScriptsName", this.NotebookLifecycleScriptsName);
        this.setParamSimple(map, prefix + "CreateScript", this.CreateScript);
        this.setParamSimple(map, prefix + "StartScript", this.StartScript);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

