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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessImageAsyncOutput extends AbstractModel {

    /**
    * 图片异步处理任务的输出文件信息。
    */
    @SerializedName("FileInfo")
    @Expose
    private ProcessImageAsyncOutputFileInfo FileInfo;

    /**
     * Get 图片异步处理任务的输出文件信息。 
     * @return FileInfo 图片异步处理任务的输出文件信息。
     */
    public ProcessImageAsyncOutputFileInfo getFileInfo() {
        return this.FileInfo;
    }

    /**
     * Set 图片异步处理任务的输出文件信息。
     * @param FileInfo 图片异步处理任务的输出文件信息。
     */
    public void setFileInfo(ProcessImageAsyncOutputFileInfo FileInfo) {
        this.FileInfo = FileInfo;
    }

    public ProcessImageAsyncOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageAsyncOutput(ProcessImageAsyncOutput source) {
        if (source.FileInfo != null) {
            this.FileInfo = new ProcessImageAsyncOutputFileInfo(source.FileInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FileInfo.", this.FileInfo);

    }
}

