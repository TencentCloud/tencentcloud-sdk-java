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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckFacePhotoRequest extends AbstractModel{

    /**
    * 输入分析对象内容
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 输入分析对象类型，picture_url:图片地址
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
     * Get 输入分析对象内容 
     * @return FileContent 输入分析对象内容
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 输入分析对象内容
     * @param FileContent 输入分析对象内容
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 输入分析对象类型，picture_url:图片地址 
     * @return FileType 输入分析对象类型，picture_url:图片地址
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 输入分析对象类型，picture_url:图片地址
     * @param FileType 输入分析对象类型，picture_url:图片地址
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

