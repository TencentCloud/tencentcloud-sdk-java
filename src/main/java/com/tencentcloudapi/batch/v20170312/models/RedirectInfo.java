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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedirectInfo extends AbstractModel {

    /**
    * 标准输出重定向路径; 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StdoutRedirectPath")
    @Expose
    private String StdoutRedirectPath;

    /**
    * 标准错误重定向路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StderrRedirectPath")
    @Expose
    private String StderrRedirectPath;

    /**
    * 标准输出重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StdoutRedirectFileName")
    @Expose
    private String StdoutRedirectFileName;

    /**
    * 标准错误重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StderrRedirectFileName")
    @Expose
    private String StderrRedirectFileName;

    /**
     * Get 标准输出重定向路径; 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StdoutRedirectPath 标准输出重定向路径; 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStdoutRedirectPath() {
        return this.StdoutRedirectPath;
    }

    /**
     * Set 标准输出重定向路径; 
注意：此字段可能返回 null，表示取不到有效值。
     * @param StdoutRedirectPath 标准输出重定向路径; 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStdoutRedirectPath(String StdoutRedirectPath) {
        this.StdoutRedirectPath = StdoutRedirectPath;
    }

    /**
     * Get 标准错误重定向路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StderrRedirectPath 标准错误重定向路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStderrRedirectPath() {
        return this.StderrRedirectPath;
    }

    /**
     * Set 标准错误重定向路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param StderrRedirectPath 标准错误重定向路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStderrRedirectPath(String StderrRedirectPath) {
        this.StderrRedirectPath = StderrRedirectPath;
    }

    /**
     * Get 标准输出重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StdoutRedirectFileName 标准输出重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStdoutRedirectFileName() {
        return this.StdoutRedirectFileName;
    }

    /**
     * Set 标准输出重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
注意：此字段可能返回 null，表示取不到有效值。
     * @param StdoutRedirectFileName 标准输出重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStdoutRedirectFileName(String StdoutRedirectFileName) {
        this.StdoutRedirectFileName = StdoutRedirectFileName;
    }

    /**
     * Get 标准错误重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StderrRedirectFileName 标准错误重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStderrRedirectFileName() {
        return this.StderrRedirectFileName;
    }

    /**
     * Set 标准错误重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
注意：此字段可能返回 null，表示取不到有效值。
     * @param StderrRedirectFileName 标准错误重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStderrRedirectFileName(String StderrRedirectFileName) {
        this.StderrRedirectFileName = StderrRedirectFileName;
    }

    public RedirectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedirectInfo(RedirectInfo source) {
        if (source.StdoutRedirectPath != null) {
            this.StdoutRedirectPath = new String(source.StdoutRedirectPath);
        }
        if (source.StderrRedirectPath != null) {
            this.StderrRedirectPath = new String(source.StderrRedirectPath);
        }
        if (source.StdoutRedirectFileName != null) {
            this.StdoutRedirectFileName = new String(source.StdoutRedirectFileName);
        }
        if (source.StderrRedirectFileName != null) {
            this.StderrRedirectFileName = new String(source.StderrRedirectFileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StdoutRedirectPath", this.StdoutRedirectPath);
        this.setParamSimple(map, prefix + "StderrRedirectPath", this.StderrRedirectPath);
        this.setParamSimple(map, prefix + "StdoutRedirectFileName", this.StdoutRedirectFileName);
        this.setParamSimple(map, prefix + "StderrRedirectFileName", this.StderrRedirectFileName);

    }
}

