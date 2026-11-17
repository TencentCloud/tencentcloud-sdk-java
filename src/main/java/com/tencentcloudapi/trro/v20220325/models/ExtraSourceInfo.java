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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraSourceInfo extends AbstractModel {

    /**
    * <p>伴生文件的引用名。只允许 [A-Za-z0-9._-] 路径段，可含子目录（深度 ≤3 层）；不能以 / 开头，不能包含 ..；同一请求内不重复</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>伴生文件相对主视频所在目录（含文件名）的 COS 相对路径。必须为相对路径（不能以 / 开头），长度 ≤128 字节，允许 ../ 上溯最多 2 层；批量接口支持 ${FileName} 占位符（替换为该处理项主视频文件名，不含扩展名</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get <p>伴生文件的引用名。只允许 [A-Za-z0-9._-] 路径段，可含子目录（深度 ≤3 层）；不能以 / 开头，不能包含 ..；同一请求内不重复</p> 
     * @return Name <p>伴生文件的引用名。只允许 [A-Za-z0-9._-] 路径段，可含子目录（深度 ≤3 层）；不能以 / 开头，不能包含 ..；同一请求内不重复</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>伴生文件的引用名。只允许 [A-Za-z0-9._-] 路径段，可含子目录（深度 ≤3 层）；不能以 / 开头，不能包含 ..；同一请求内不重复</p>
     * @param Name <p>伴生文件的引用名。只允许 [A-Za-z0-9._-] 路径段，可含子目录（深度 ≤3 层）；不能以 / 开头，不能包含 ..；同一请求内不重复</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>伴生文件相对主视频所在目录（含文件名）的 COS 相对路径。必须为相对路径（不能以 / 开头），长度 ≤128 字节，允许 ../ 上溯最多 2 层；批量接口支持 ${FileName} 占位符（替换为该处理项主视频文件名，不含扩展名</p> 
     * @return Path <p>伴生文件相对主视频所在目录（含文件名）的 COS 相对路径。必须为相对路径（不能以 / 开头），长度 ≤128 字节，允许 ../ 上溯最多 2 层；批量接口支持 ${FileName} 占位符（替换为该处理项主视频文件名，不含扩展名</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>伴生文件相对主视频所在目录（含文件名）的 COS 相对路径。必须为相对路径（不能以 / 开头），长度 ≤128 字节，允许 ../ 上溯最多 2 层；批量接口支持 ${FileName} 占位符（替换为该处理项主视频文件名，不含扩展名</p>
     * @param Path <p>伴生文件相对主视频所在目录（含文件名）的 COS 相对路径。必须为相对路径（不能以 / 开头），长度 ≤128 字节，允许 ../ 上溯最多 2 层；批量接口支持 ${FileName} 占位符（替换为该处理项主视频文件名，不含扩展名</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public ExtraSourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraSourceInfo(ExtraSourceInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

