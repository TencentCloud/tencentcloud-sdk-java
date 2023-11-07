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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileVerification extends AbstractModel {

    /**
    * EdgeOne 后台服务器将通过 Scheme + Host + URL Path 的格式（例如 https://www.example.com/.well-known/teo-verification/z12h416twn.txt）获取文件验证信息。该字段为您需要创建的 URL Path 部分。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 验证文件的内容。该字段的内容需要您填写至 Path 字段返回的 txt 文件中。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get EdgeOne 后台服务器将通过 Scheme + Host + URL Path 的格式（例如 https://www.example.com/.well-known/teo-verification/z12h416twn.txt）获取文件验证信息。该字段为您需要创建的 URL Path 部分。 
     * @return Path EdgeOne 后台服务器将通过 Scheme + Host + URL Path 的格式（例如 https://www.example.com/.well-known/teo-verification/z12h416twn.txt）获取文件验证信息。该字段为您需要创建的 URL Path 部分。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set EdgeOne 后台服务器将通过 Scheme + Host + URL Path 的格式（例如 https://www.example.com/.well-known/teo-verification/z12h416twn.txt）获取文件验证信息。该字段为您需要创建的 URL Path 部分。
     * @param Path EdgeOne 后台服务器将通过 Scheme + Host + URL Path 的格式（例如 https://www.example.com/.well-known/teo-verification/z12h416twn.txt）获取文件验证信息。该字段为您需要创建的 URL Path 部分。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 验证文件的内容。该字段的内容需要您填写至 Path 字段返回的 txt 文件中。 
     * @return Content 验证文件的内容。该字段的内容需要您填写至 Path 字段返回的 txt 文件中。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 验证文件的内容。该字段的内容需要您填写至 Path 字段返回的 txt 文件中。
     * @param Content 验证文件的内容。该字段的内容需要您填写至 Path 字段返回的 txt 文件中。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public FileVerification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileVerification(FileVerification source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

