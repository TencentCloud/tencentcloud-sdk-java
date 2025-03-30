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

public class OutputMapping extends AbstractModel {

    /**
    * 源端路径
    */
    @SerializedName("SourcePath")
    @Expose
    private String SourcePath;

    /**
    * 目的端路径
    */
    @SerializedName("DestinationPath")
    @Expose
    private String DestinationPath;

    /**
    * 输出映射选项
    */
    @SerializedName("OutputMappingOption")
    @Expose
    private OutputMappingOption OutputMappingOption;

    /**
     * Get 源端路径 
     * @return SourcePath 源端路径
     */
    public String getSourcePath() {
        return this.SourcePath;
    }

    /**
     * Set 源端路径
     * @param SourcePath 源端路径
     */
    public void setSourcePath(String SourcePath) {
        this.SourcePath = SourcePath;
    }

    /**
     * Get 目的端路径 
     * @return DestinationPath 目的端路径
     */
    public String getDestinationPath() {
        return this.DestinationPath;
    }

    /**
     * Set 目的端路径
     * @param DestinationPath 目的端路径
     */
    public void setDestinationPath(String DestinationPath) {
        this.DestinationPath = DestinationPath;
    }

    /**
     * Get 输出映射选项 
     * @return OutputMappingOption 输出映射选项
     */
    public OutputMappingOption getOutputMappingOption() {
        return this.OutputMappingOption;
    }

    /**
     * Set 输出映射选项
     * @param OutputMappingOption 输出映射选项
     */
    public void setOutputMappingOption(OutputMappingOption OutputMappingOption) {
        this.OutputMappingOption = OutputMappingOption;
    }

    public OutputMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputMapping(OutputMapping source) {
        if (source.SourcePath != null) {
            this.SourcePath = new String(source.SourcePath);
        }
        if (source.DestinationPath != null) {
            this.DestinationPath = new String(source.DestinationPath);
        }
        if (source.OutputMappingOption != null) {
            this.OutputMappingOption = new OutputMappingOption(source.OutputMappingOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourcePath", this.SourcePath);
        this.setParamSimple(map, prefix + "DestinationPath", this.DestinationPath);
        this.setParamObj(map, prefix + "OutputMappingOption.", this.OutputMappingOption);

    }
}

