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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartFormFileUrl extends AbstractModel{

    /**
    * 文件url地址
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 文件的顺序，顺序从1开始
    */
    @SerializedName("FileOrderNumber")
    @Expose
    private Long FileOrderNumber;

    /**
     * Get 文件url地址 
     * @return FileUrl 文件url地址
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件url地址
     * @param FileUrl 文件url地址
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 文件的顺序，顺序从1开始 
     * @return FileOrderNumber 文件的顺序，顺序从1开始
     */
    public Long getFileOrderNumber() {
        return this.FileOrderNumber;
    }

    /**
     * Set 文件的顺序，顺序从1开始
     * @param FileOrderNumber 文件的顺序，顺序从1开始
     */
    public void setFileOrderNumber(Long FileOrderNumber) {
        this.FileOrderNumber = FileOrderNumber;
    }

    public SmartFormFileUrl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartFormFileUrl(SmartFormFileUrl source) {
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileOrderNumber != null) {
            this.FileOrderNumber = new Long(source.FileOrderNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileOrderNumber", this.FileOrderNumber);

    }
}

