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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskCode extends AbstractModel {

    /**
    * 代码内容
    */
    @SerializedName("CodeContent")
    @Expose
    private String CodeContent;

    /**
    * 代码文件大小，单位bytes
    */
    @SerializedName("CodeFileSize")
    @Expose
    private Long CodeFileSize;

    /**
     * Get 代码内容 
     * @return CodeContent 代码内容
     */
    public String getCodeContent() {
        return this.CodeContent;
    }

    /**
     * Set 代码内容
     * @param CodeContent 代码内容
     */
    public void setCodeContent(String CodeContent) {
        this.CodeContent = CodeContent;
    }

    /**
     * Get 代码文件大小，单位bytes 
     * @return CodeFileSize 代码文件大小，单位bytes
     */
    public Long getCodeFileSize() {
        return this.CodeFileSize;
    }

    /**
     * Set 代码文件大小，单位bytes
     * @param CodeFileSize 代码文件大小，单位bytes
     */
    public void setCodeFileSize(Long CodeFileSize) {
        this.CodeFileSize = CodeFileSize;
    }

    public TaskCode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskCode(TaskCode source) {
        if (source.CodeContent != null) {
            this.CodeContent = new String(source.CodeContent);
        }
        if (source.CodeFileSize != null) {
            this.CodeFileSize = new Long(source.CodeFileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CodeContent", this.CodeContent);
        this.setParamSimple(map, prefix + "CodeFileSize", this.CodeFileSize);

    }
}

