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

public class DownloadBillResponse extends AbstractModel{

    /**
    * 账单文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 账单文件的MD5值
    */
    @SerializedName("FileMD5")
    @Expose
    private String FileMD5;

    /**
    * 账单文件的真实下载地址
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 账单文件名 
     * @return FileName 账单文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 账单文件名
     * @param FileName 账单文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 账单文件的MD5值 
     * @return FileMD5 账单文件的MD5值
     */
    public String getFileMD5() {
        return this.FileMD5;
    }

    /**
     * Set 账单文件的MD5值
     * @param FileMD5 账单文件的MD5值
     */
    public void setFileMD5(String FileMD5) {
        this.FileMD5 = FileMD5;
    }

    /**
     * Get 账单文件的真实下载地址 
     * @return DownloadUrl 账单文件的真实下载地址
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 账单文件的真实下载地址
     * @param DownloadUrl 账单文件的真实下载地址
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileMD5", this.FileMD5);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

