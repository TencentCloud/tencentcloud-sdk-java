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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryOpenBankDownLoadUrlResult extends AbstractModel{

    /**
    * 供下一步请求账单文件的下载地址。
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 从 download_url 下载的文件的哈希值，用于校验文件的完整性。
    */
    @SerializedName("HashValue")
    @Expose
    private String HashValue;

    /**
    * 从 download_url 下载的文件的哈希类型，用于校验文件的完整性。
    */
    @SerializedName("HashType")
    @Expose
    private String HashType;

    /**
     * Get 供下一步请求账单文件的下载地址。 
     * @return DownloadUrl 供下一步请求账单文件的下载地址。
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 供下一步请求账单文件的下载地址。
     * @param DownloadUrl 供下一步请求账单文件的下载地址。
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 从 download_url 下载的文件的哈希值，用于校验文件的完整性。 
     * @return HashValue 从 download_url 下载的文件的哈希值，用于校验文件的完整性。
     */
    public String getHashValue() {
        return this.HashValue;
    }

    /**
     * Set 从 download_url 下载的文件的哈希值，用于校验文件的完整性。
     * @param HashValue 从 download_url 下载的文件的哈希值，用于校验文件的完整性。
     */
    public void setHashValue(String HashValue) {
        this.HashValue = HashValue;
    }

    /**
     * Get 从 download_url 下载的文件的哈希类型，用于校验文件的完整性。 
     * @return HashType 从 download_url 下载的文件的哈希类型，用于校验文件的完整性。
     */
    public String getHashType() {
        return this.HashType;
    }

    /**
     * Set 从 download_url 下载的文件的哈希类型，用于校验文件的完整性。
     * @param HashType 从 download_url 下载的文件的哈希类型，用于校验文件的完整性。
     */
    public void setHashType(String HashType) {
        this.HashType = HashType;
    }

    public QueryOpenBankDownLoadUrlResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankDownLoadUrlResult(QueryOpenBankDownLoadUrlResult source) {
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.HashValue != null) {
            this.HashValue = new String(source.HashValue);
        }
        if (source.HashType != null) {
            this.HashType = new String(source.HashType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "HashValue", this.HashValue);
        this.setParamSimple(map, prefix + "HashType", this.HashType);

    }
}

