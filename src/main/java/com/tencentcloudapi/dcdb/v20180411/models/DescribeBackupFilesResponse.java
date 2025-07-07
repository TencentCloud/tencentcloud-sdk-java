/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupFilesResponse extends AbstractModel {

    /**
    * 备份文件列表
    */
    @SerializedName("Files")
    @Expose
    private InstanceBackupFileItem [] Files;

    /**
    * 总条目数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 下载链接前缀
    */
    @SerializedName("UrlPrefix")
    @Expose
    private String UrlPrefix;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备份文件列表 
     * @return Files 备份文件列表
     */
    public InstanceBackupFileItem [] getFiles() {
        return this.Files;
    }

    /**
     * Set 备份文件列表
     * @param Files 备份文件列表
     */
    public void setFiles(InstanceBackupFileItem [] Files) {
        this.Files = Files;
    }

    /**
     * Get 总条目数 
     * @return TotalCount 总条目数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条目数
     * @param TotalCount 总条目数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 下载链接前缀 
     * @return UrlPrefix 下载链接前缀
     */
    public String getUrlPrefix() {
        return this.UrlPrefix;
    }

    /**
     * Set 下载链接前缀
     * @param UrlPrefix 下载链接前缀
     */
    public void setUrlPrefix(String UrlPrefix) {
        this.UrlPrefix = UrlPrefix;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupFilesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupFilesResponse(DescribeBackupFilesResponse source) {
        if (source.Files != null) {
            this.Files = new InstanceBackupFileItem[source.Files.length];
            for (int i = 0; i < source.Files.length; i++) {
                this.Files[i] = new InstanceBackupFileItem(source.Files[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.UrlPrefix != null) {
            this.UrlPrefix = new String(source.UrlPrefix);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Files.", this.Files);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "UrlPrefix", this.UrlPrefix);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

