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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtensionFile extends AbstractModel{

    /**
    * 文件类型。枚举值
<li>FUNCTION：函数代码</li>
<li>STATIC：静态托管代码</li>
<li>SMS：短信文件</li>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件名，长度不超过24
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get 文件类型。枚举值
<li>FUNCTION：函数代码</li>
<li>STATIC：静态托管代码</li>
<li>SMS：短信文件</li> 
     * @return FileType 文件类型。枚举值
<li>FUNCTION：函数代码</li>
<li>STATIC：静态托管代码</li>
<li>SMS：短信文件</li>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型。枚举值
<li>FUNCTION：函数代码</li>
<li>STATIC：静态托管代码</li>
<li>SMS：短信文件</li>
     * @param FileType 文件类型。枚举值
<li>FUNCTION：函数代码</li>
<li>STATIC：静态托管代码</li>
<li>SMS：短信文件</li>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件名，长度不超过24 
     * @return FileName 文件名，长度不超过24
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名，长度不超过24
     * @param FileName 文件名，长度不超过24
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public ExtensionFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtensionFile(ExtensionFile source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

