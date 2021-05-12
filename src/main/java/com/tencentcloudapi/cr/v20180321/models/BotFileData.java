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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotFileData extends AbstractModel{

    /**
    * 文件类型 A 拨打结果 T 记录详情
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件地址
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
     * Get 文件类型 A 拨打结果 T 记录详情 
     * @return FileType 文件类型 A 拨打结果 T 记录详情
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型 A 拨打结果 T 记录详情
     * @param FileType 文件类型 A 拨打结果 T 记录详情
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件地址 
     * @return CosUrl 文件地址
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set 文件地址
     * @param CosUrl 文件地址
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    public BotFileData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotFileData(BotFileData source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);

    }
}

