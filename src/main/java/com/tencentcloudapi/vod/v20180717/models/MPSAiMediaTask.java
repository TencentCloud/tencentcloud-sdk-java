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

public class MPSAiMediaTask extends AbstractModel {

    /**
    * MPS智能任务的模板 ID
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * MPS智能任务输出文件集合
    */
    @SerializedName("OutputFile")
    @Expose
    private MPSOutputFileInfo [] OutputFile;

    /**
    * MPS智能任务输出
    */
    @SerializedName("OutputText")
    @Expose
    private String OutputText;

    /**
     * Get MPS智能任务的模板 ID 
     * @return Definition MPS智能任务的模板 ID
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set MPS智能任务的模板 ID
     * @param Definition MPS智能任务的模板 ID
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get MPS智能任务输出文件集合 
     * @return OutputFile MPS智能任务输出文件集合
     */
    public MPSOutputFileInfo [] getOutputFile() {
        return this.OutputFile;
    }

    /**
     * Set MPS智能任务输出文件集合
     * @param OutputFile MPS智能任务输出文件集合
     */
    public void setOutputFile(MPSOutputFileInfo [] OutputFile) {
        this.OutputFile = OutputFile;
    }

    /**
     * Get MPS智能任务输出 
     * @return OutputText MPS智能任务输出
     */
    public String getOutputText() {
        return this.OutputText;
    }

    /**
     * Set MPS智能任务输出
     * @param OutputText MPS智能任务输出
     */
    public void setOutputText(String OutputText) {
        this.OutputText = OutputText;
    }

    public MPSAiMediaTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSAiMediaTask(MPSAiMediaTask source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.OutputFile != null) {
            this.OutputFile = new MPSOutputFileInfo[source.OutputFile.length];
            for (int i = 0; i < source.OutputFile.length; i++) {
                this.OutputFile[i] = new MPSOutputFileInfo(source.OutputFile[i]);
            }
        }
        if (source.OutputText != null) {
            this.OutputText = new String(source.OutputText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "OutputFile.", this.OutputFile);
        this.setParamSimple(map, prefix + "OutputText", this.OutputText);

    }
}

