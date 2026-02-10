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

public class ImageUnderstandingItem extends AbstractModel {

    /**
    * 模板id。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 任务输出文件。
    */
    @SerializedName("OutputFile")
    @Expose
    private MPSOutputFileInfo [] OutputFile;

    /**
     * Get 模板id。 
     * @return Definition 模板id。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 模板id。
     * @param Definition 模板id。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 任务输出文件。 
     * @return OutputFile 任务输出文件。
     */
    public MPSOutputFileInfo [] getOutputFile() {
        return this.OutputFile;
    }

    /**
     * Set 任务输出文件。
     * @param OutputFile 任务输出文件。
     */
    public void setOutputFile(MPSOutputFileInfo [] OutputFile) {
        this.OutputFile = OutputFile;
    }

    public ImageUnderstandingItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageUnderstandingItem(ImageUnderstandingItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.OutputFile != null) {
            this.OutputFile = new MPSOutputFileInfo[source.OutputFile.length];
            for (int i = 0; i < source.OutputFile.length; i++) {
                this.OutputFile[i] = new MPSOutputFileInfo(source.OutputFile[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "OutputFile.", this.OutputFile);

    }
}

