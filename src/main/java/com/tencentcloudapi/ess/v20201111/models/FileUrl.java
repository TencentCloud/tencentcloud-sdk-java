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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileUrl extends AbstractModel{

    /**
    * 下载文件的URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 下载文件的附加信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Option")
    @Expose
    private String Option;

    /**
     * Get 下载文件的URL 
     * @return Url 下载文件的URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 下载文件的URL
     * @param Url 下载文件的URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 下载文件的附加信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Option 下载文件的附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOption() {
        return this.Option;
    }

    /**
     * Set 下载文件的附加信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Option 下载文件的附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOption(String Option) {
        this.Option = Option;
    }

    public FileUrl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileUrl(FileUrl source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Option != null) {
            this.Option = new String(source.Option);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Option", this.Option);

    }
}

