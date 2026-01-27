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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CollectorConfigInfo extends AbstractModel {

    /**
    * 采集器的主配置文件名，如filebeat.yml，metricbeat.yml等
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 采集器的主配置文件内容
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
     * Get 采集器的主配置文件名，如filebeat.yml，metricbeat.yml等 
     * @return FileName 采集器的主配置文件名，如filebeat.yml，metricbeat.yml等
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 采集器的主配置文件名，如filebeat.yml，metricbeat.yml等
     * @param FileName 采集器的主配置文件名，如filebeat.yml，metricbeat.yml等
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 采集器的主配置文件内容 
     * @return FileContent 采集器的主配置文件内容
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 采集器的主配置文件内容
     * @param FileContent 采集器的主配置文件内容
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    public CollectorConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CollectorConfigInfo(CollectorConfigInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);

    }
}

