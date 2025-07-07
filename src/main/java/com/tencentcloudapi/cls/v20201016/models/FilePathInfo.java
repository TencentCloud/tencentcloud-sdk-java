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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilePathInfo extends AbstractModel {

    /**
    * 文件路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 文件名称
    */
    @SerializedName("File")
    @Expose
    private String File;

    /**
     * Get 文件路径 
     * @return Path 文件路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 文件路径
     * @param Path 文件路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 文件名称 
     * @return File 文件名称
     */
    public String getFile() {
        return this.File;
    }

    /**
     * Set 文件名称
     * @param File 文件名称
     */
    public void setFile(String File) {
        this.File = File;
    }

    public FilePathInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilePathInfo(FilePathInfo source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.File != null) {
            this.File = new String(source.File);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "File", this.File);

    }
}

