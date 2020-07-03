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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupUrlResponse extends AbstractModel{

    /**
    * 外网下载地址（6小时）
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String [] DownloadUrl;

    /**
    * 内网下载地址（6小时）
    */
    @SerializedName("InnerDownloadUrl")
    @Expose
    private String [] InnerDownloadUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 外网下载地址（6小时） 
     * @return DownloadUrl 外网下载地址（6小时）
     */
    public String [] getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 外网下载地址（6小时）
     * @param DownloadUrl 外网下载地址（6小时）
     */
    public void setDownloadUrl(String [] DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 内网下载地址（6小时） 
     * @return InnerDownloadUrl 内网下载地址（6小时）
     */
    public String [] getInnerDownloadUrl() {
        return this.InnerDownloadUrl;
    }

    /**
     * Set 内网下载地址（6小时）
     * @param InnerDownloadUrl 内网下载地址（6小时）
     */
    public void setInnerDownloadUrl(String [] InnerDownloadUrl) {
        this.InnerDownloadUrl = InnerDownloadUrl;
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
        this.setParamArraySimple(map, prefix + "DownloadUrl.", this.DownloadUrl);
        this.setParamArraySimple(map, prefix + "InnerDownloadUrl.", this.InnerDownloadUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

