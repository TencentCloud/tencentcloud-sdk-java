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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyFile extends AbstractModel{

    /**
    * key文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * key文件扩展名
    */
    @SerializedName("FileExtType")
    @Expose
    private String FileExtType;

    /**
    * key文件内容
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * key文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
     * Get key文件名称 
     * @return FileName key文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set key文件名称
     * @param FileName key文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get key文件扩展名 
     * @return FileExtType key文件扩展名
     */
    public String getFileExtType() {
        return this.FileExtType;
    }

    /**
     * Set key文件扩展名
     * @param FileExtType key文件扩展名
     */
    public void setFileExtType(String FileExtType) {
        this.FileExtType = FileExtType;
    }

    /**
     * Get key文件内容 
     * @return FileContent key文件内容
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set key文件内容
     * @param FileContent key文件内容
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get key文件大小 
     * @return FileSize key文件大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set key文件大小
     * @param FileSize key文件大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    public KeyFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyFile(KeyFile source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileExtType != null) {
            this.FileExtType = new String(source.FileExtType);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileExtType", this.FileExtType);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);

    }
}

