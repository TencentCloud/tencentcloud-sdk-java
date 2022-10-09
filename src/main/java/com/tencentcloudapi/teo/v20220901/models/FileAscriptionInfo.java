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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileAscriptionInfo extends AbstractModel{

    /**
    * 文件校验目录。
    */
    @SerializedName("IdentifyPath")
    @Expose
    private String IdentifyPath;

    /**
    * 文件校验内容。
    */
    @SerializedName("IdentifyContent")
    @Expose
    private String IdentifyContent;

    /**
     * Get 文件校验目录。 
     * @return IdentifyPath 文件校验目录。
     */
    public String getIdentifyPath() {
        return this.IdentifyPath;
    }

    /**
     * Set 文件校验目录。
     * @param IdentifyPath 文件校验目录。
     */
    public void setIdentifyPath(String IdentifyPath) {
        this.IdentifyPath = IdentifyPath;
    }

    /**
     * Get 文件校验内容。 
     * @return IdentifyContent 文件校验内容。
     */
    public String getIdentifyContent() {
        return this.IdentifyContent;
    }

    /**
     * Set 文件校验内容。
     * @param IdentifyContent 文件校验内容。
     */
    public void setIdentifyContent(String IdentifyContent) {
        this.IdentifyContent = IdentifyContent;
    }

    public FileAscriptionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileAscriptionInfo(FileAscriptionInfo source) {
        if (source.IdentifyPath != null) {
            this.IdentifyPath = new String(source.IdentifyPath);
        }
        if (source.IdentifyContent != null) {
            this.IdentifyContent = new String(source.IdentifyContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentifyPath", this.IdentifyPath);
        this.setParamSimple(map, prefix + "IdentifyContent", this.IdentifyContent);

    }
}

