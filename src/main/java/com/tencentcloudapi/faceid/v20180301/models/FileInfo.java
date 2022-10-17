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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileInfo extends AbstractModel{

    /**
    * 用于下载文件的URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 文件的32位MD5
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * 文件字节数
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 用于下载文件的URL 
     * @return Url 用于下载文件的URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 用于下载文件的URL
     * @param Url 用于下载文件的URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 文件的32位MD5 
     * @return MD5 文件的32位MD5
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set 文件的32位MD5
     * @param MD5 文件的32位MD5
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get 文件字节数 
     * @return Size 文件字节数
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件字节数
     * @param Size 文件字节数
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public FileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfo(FileInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

