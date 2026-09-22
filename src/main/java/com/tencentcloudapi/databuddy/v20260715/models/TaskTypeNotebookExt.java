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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskTypeNotebookExt extends AbstractModel {

    /**
    * <p>脚本来源。取值：SCRIPT_SOURCE_LOCAL（本地）/ SCRIPT_SOURCE_GIT（Git 仓库）/<br>SCRIPT_SOURCE_CFS（CFS 文件系统）/ SCRIPT_SOURCE_COS（COS 对象存储）/<br>SCRIPT_SOURCE_WORKSPACE（工作空间）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>前端显示使用，对执行平台无意义</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayPath")
    @Expose
    private String DisplayPath;

    /**
    * <p>Notebook 相对路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotebookPath")
    @Expose
    private String NotebookPath;

    /**
    * <p>Notebook 绝对路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotebookAbsolutePath")
    @Expose
    private String NotebookAbsolutePath;

    /**
     * Get <p>脚本来源。取值：SCRIPT_SOURCE_LOCAL（本地）/ SCRIPT_SOURCE_GIT（Git 仓库）/<br>SCRIPT_SOURCE_CFS（CFS 文件系统）/ SCRIPT_SOURCE_COS（COS 对象存储）/<br>SCRIPT_SOURCE_WORKSPACE（工作空间）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source <p>脚本来源。取值：SCRIPT_SOURCE_LOCAL（本地）/ SCRIPT_SOURCE_GIT（Git 仓库）/<br>SCRIPT_SOURCE_CFS（CFS 文件系统）/ SCRIPT_SOURCE_COS（COS 对象存储）/<br>SCRIPT_SOURCE_WORKSPACE（工作空间）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>脚本来源。取值：SCRIPT_SOURCE_LOCAL（本地）/ SCRIPT_SOURCE_GIT（Git 仓库）/<br>SCRIPT_SOURCE_CFS（CFS 文件系统）/ SCRIPT_SOURCE_COS（COS 对象存储）/<br>SCRIPT_SOURCE_WORKSPACE（工作空间）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source <p>脚本来源。取值：SCRIPT_SOURCE_LOCAL（本地）/ SCRIPT_SOURCE_GIT（Git 仓库）/<br>SCRIPT_SOURCE_CFS（CFS 文件系统）/ SCRIPT_SOURCE_COS（COS 对象存储）/<br>SCRIPT_SOURCE_WORKSPACE（工作空间）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>前端显示使用，对执行平台无意义</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayPath <p>前端显示使用，对执行平台无意义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayPath() {
        return this.DisplayPath;
    }

    /**
     * Set <p>前端显示使用，对执行平台无意义</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayPath <p>前端显示使用，对执行平台无意义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayPath(String DisplayPath) {
        this.DisplayPath = DisplayPath;
    }

    /**
     * Get <p>Notebook 相对路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotebookPath <p>Notebook 相对路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotebookPath() {
        return this.NotebookPath;
    }

    /**
     * Set <p>Notebook 相对路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotebookPath <p>Notebook 相对路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotebookPath(String NotebookPath) {
        this.NotebookPath = NotebookPath;
    }

    /**
     * Get <p>Notebook 绝对路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotebookAbsolutePath <p>Notebook 绝对路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotebookAbsolutePath() {
        return this.NotebookAbsolutePath;
    }

    /**
     * Set <p>Notebook 绝对路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotebookAbsolutePath <p>Notebook 绝对路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotebookAbsolutePath(String NotebookAbsolutePath) {
        this.NotebookAbsolutePath = NotebookAbsolutePath;
    }

    public TaskTypeNotebookExt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTypeNotebookExt(TaskTypeNotebookExt source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.DisplayPath != null) {
            this.DisplayPath = new String(source.DisplayPath);
        }
        if (source.NotebookPath != null) {
            this.NotebookPath = new String(source.NotebookPath);
        }
        if (source.NotebookAbsolutePath != null) {
            this.NotebookAbsolutePath = new String(source.NotebookAbsolutePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "DisplayPath", this.DisplayPath);
        this.setParamSimple(map, prefix + "NotebookPath", this.NotebookPath);
        this.setParamSimple(map, prefix + "NotebookAbsolutePath", this.NotebookAbsolutePath);

    }
}

