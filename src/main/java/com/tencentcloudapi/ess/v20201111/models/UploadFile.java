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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadFile extends AbstractModel {

    /**
    * Base64编码后的文件内容
    */
    @SerializedName("FileBody")
    @Expose
    private String FileBody;

    /**
    * 文件的名字。
文件名的最大长度应不超过200个字符，并且文件名的后缀必须反映其文件类型。
例如，PDF文件应以“.pdf”结尾，如“XXX.pdf”，而Word文件应以“.doc”或“.docx”结尾，如“XXX.doc”或“XXX.docx”。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get Base64编码后的文件内容 
     * @return FileBody Base64编码后的文件内容
     */
    public String getFileBody() {
        return this.FileBody;
    }

    /**
     * Set Base64编码后的文件内容
     * @param FileBody Base64编码后的文件内容
     */
    public void setFileBody(String FileBody) {
        this.FileBody = FileBody;
    }

    /**
     * Get 文件的名字。
文件名的最大长度应不超过200个字符，并且文件名的后缀必须反映其文件类型。
例如，PDF文件应以“.pdf”结尾，如“XXX.pdf”，而Word文件应以“.doc”或“.docx”结尾，如“XXX.doc”或“XXX.docx”。 
     * @return FileName 文件的名字。
文件名的最大长度应不超过200个字符，并且文件名的后缀必须反映其文件类型。
例如，PDF文件应以“.pdf”结尾，如“XXX.pdf”，而Word文件应以“.doc”或“.docx”结尾，如“XXX.doc”或“XXX.docx”。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件的名字。
文件名的最大长度应不超过200个字符，并且文件名的后缀必须反映其文件类型。
例如，PDF文件应以“.pdf”结尾，如“XXX.pdf”，而Word文件应以“.doc”或“.docx”结尾，如“XXX.doc”或“XXX.docx”。
     * @param FileName 文件的名字。
文件名的最大长度应不超过200个字符，并且文件名的后缀必须反映其文件类型。
例如，PDF文件应以“.pdf”结尾，如“XXX.pdf”，而Word文件应以“.doc”或“.docx”结尾，如“XXX.doc”或“XXX.docx”。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public UploadFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFile(UploadFile source) {
        if (source.FileBody != null) {
            this.FileBody = new String(source.FileBody);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileBody", this.FileBody);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

