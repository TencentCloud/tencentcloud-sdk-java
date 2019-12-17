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

public class RedirectLocalInfo extends AbstractModel{

    /**
    * 标准输出重定向本地路径
    */
    @SerializedName("StdoutLocalPath")
    @Expose
    private String StdoutLocalPath;

    /**
    * 标准错误重定向本地路径
    */
    @SerializedName("StderrLocalPath")
    @Expose
    private String StderrLocalPath;

    /**
    * 标准输出重定向本地文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
    */
    @SerializedName("StdoutLocalFileName")
    @Expose
    private String StdoutLocalFileName;

    /**
    * 标准错误重定向本地文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
    */
    @SerializedName("StderrLocalFileName")
    @Expose
    private String StderrLocalFileName;

    /**
     * Get 标准输出重定向本地路径 
     * @return StdoutLocalPath 标准输出重定向本地路径
     */
    public String getStdoutLocalPath() {
        return this.StdoutLocalPath;
    }

    /**
     * Set 标准输出重定向本地路径
     * @param StdoutLocalPath 标准输出重定向本地路径
     */
    public void setStdoutLocalPath(String StdoutLocalPath) {
        this.StdoutLocalPath = StdoutLocalPath;
    }

    /**
     * Get 标准错误重定向本地路径 
     * @return StderrLocalPath 标准错误重定向本地路径
     */
    public String getStderrLocalPath() {
        return this.StderrLocalPath;
    }

    /**
     * Set 标准错误重定向本地路径
     * @param StderrLocalPath 标准错误重定向本地路径
     */
    public void setStderrLocalPath(String StderrLocalPath) {
        this.StderrLocalPath = StderrLocalPath;
    }

    /**
     * Get 标准输出重定向本地文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX} 
     * @return StdoutLocalFileName 标准输出重定向本地文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
     */
    public String getStdoutLocalFileName() {
        return this.StdoutLocalFileName;
    }

    /**
     * Set 标准输出重定向本地文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
     * @param StdoutLocalFileName 标准输出重定向本地文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
     */
    public void setStdoutLocalFileName(String StdoutLocalFileName) {
        this.StdoutLocalFileName = StdoutLocalFileName;
    }

    /**
     * Get 标准错误重定向本地文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX} 
     * @return StderrLocalFileName 标准错误重定向本地文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
     */
    public String getStderrLocalFileName() {
        return this.StderrLocalFileName;
    }

    /**
     * Set 标准错误重定向本地文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
     * @param StderrLocalFileName 标准错误重定向本地文件名，支持三个占位符${BATCH_JOB_ID}、${BATCH_TASK_NAME}、${BATCH_TASK_INSTANCE_INDEX}
     */
    public void setStderrLocalFileName(String StderrLocalFileName) {
        this.StderrLocalFileName = StderrLocalFileName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StdoutLocalPath", this.StdoutLocalPath);
        this.setParamSimple(map, prefix + "StderrLocalPath", this.StderrLocalPath);
        this.setParamSimple(map, prefix + "StdoutLocalFileName", this.StdoutLocalFileName);
        this.setParamSimple(map, prefix + "StderrLocalFileName", this.StderrLocalFileName);

    }
}

