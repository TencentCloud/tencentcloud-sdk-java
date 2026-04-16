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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogSources extends AbstractModel {

    /**
    * <p>需要采集的日志文件路径，必须是 /logs/ 目录下的文件，不支持子目录，最大支持 10 个文件。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Files")
    @Expose
    private String [] Files;

    /**
     * Get <p>需要采集的日志文件路径，必须是 /logs/ 目录下的文件，不支持子目录，最大支持 10 个文件。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Files <p>需要采集的日志文件路径，必须是 /logs/ 目录下的文件，不支持子目录，最大支持 10 个文件。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFiles() {
        return this.Files;
    }

    /**
     * Set <p>需要采集的日志文件路径，必须是 /logs/ 目录下的文件，不支持子目录，最大支持 10 个文件。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Files <p>需要采集的日志文件路径，必须是 /logs/ 目录下的文件，不支持子目录，最大支持 10 个文件。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFiles(String [] Files) {
        this.Files = Files;
    }

    public LogSources() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogSources(LogSources source) {
        if (source.Files != null) {
            this.Files = new String[source.Files.length];
            for (int i = 0; i < source.Files.length; i++) {
                this.Files[i] = new String(source.Files[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Files.", this.Files);

    }
}

