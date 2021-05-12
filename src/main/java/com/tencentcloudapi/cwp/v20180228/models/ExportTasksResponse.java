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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportTasksResponse extends AbstractModel{

    /**
    * PENDING：正在生成下载链接，FINISHED：下载链接已生成，ERROR：网络异常等异常情况
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 下载链接
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
     * Get PENDING：正在生成下载链接，FINISHED：下载链接已生成，ERROR：网络异常等异常情况 
     * @return Status PENDING：正在生成下载链接，FINISHED：下载链接已生成，ERROR：网络异常等异常情况
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set PENDING：正在生成下载链接，FINISHED：下载链接已生成，ERROR：网络异常等异常情况
     * @param Status PENDING：正在生成下载链接，FINISHED：下载链接已生成，ERROR：网络异常等异常情况
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 下载链接 
     * @return DownloadUrl 下载链接
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 下载链接
     * @param DownloadUrl 下载链接
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

    public ExportTasksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportTasksResponse(ExportTasksResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

