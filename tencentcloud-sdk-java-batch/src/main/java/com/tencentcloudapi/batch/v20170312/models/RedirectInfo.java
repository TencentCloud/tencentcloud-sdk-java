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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedirectInfo extends AbstractModel{

    /**
    * 标准输出重定向路径
    */
    @SerializedName("StdoutRedirectPath")
    @Expose
    private String StdoutRedirectPath;

    /**
    * 标准错误重定向路径
    */
    @SerializedName("StderrRedirectPath")
    @Expose
    private String StderrRedirectPath;

    /**
    * 标准输出重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
    */
    @SerializedName("StdoutRedirectFileName")
    @Expose
    private String StdoutRedirectFileName;

    /**
    * 标准错误重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
    */
    @SerializedName("StderrRedirectFileName")
    @Expose
    private String StderrRedirectFileName;

    /**
     * Get 标准输出重定向路径 
     * @return StdoutRedirectPath 标准输出重定向路径
     */
    public String getStdoutRedirectPath() {
        return this.StdoutRedirectPath;
    }

    /**
     * Set 标准输出重定向路径
     * @param StdoutRedirectPath 标准输出重定向路径
     */
    public void setStdoutRedirectPath(String StdoutRedirectPath) {
        this.StdoutRedirectPath = StdoutRedirectPath;
    }

    /**
     * Get 标准错误重定向路径 
     * @return StderrRedirectPath 标准错误重定向路径
     */
    public String getStderrRedirectPath() {
        return this.StderrRedirectPath;
    }

    /**
     * Set 标准错误重定向路径
     * @param StderrRedirectPath 标准错误重定向路径
     */
    public void setStderrRedirectPath(String StderrRedirectPath) {
        this.StderrRedirectPath = StderrRedirectPath;
    }

    /**
     * Get 标准输出重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX} 
     * @return StdoutRedirectFileName 标准输出重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
     */
    public String getStdoutRedirectFileName() {
        return this.StdoutRedirectFileName;
    }

    /**
     * Set 标准输出重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
     * @param StdoutRedirectFileName 标准输出重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
     */
    public void setStdoutRedirectFileName(String StdoutRedirectFileName) {
        this.StdoutRedirectFileName = StdoutRedirectFileName;
    }

    /**
     * Get 标准错误重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX} 
     * @return StderrRedirectFileName 标准错误重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
     */
    public String getStderrRedirectFileName() {
        return this.StderrRedirectFileName;
    }

    /**
     * Set 标准错误重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
     * @param StderrRedirectFileName 标准错误重定向文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
     */
    public void setStderrRedirectFileName(String StderrRedirectFileName) {
        this.StderrRedirectFileName = StderrRedirectFileName;
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

