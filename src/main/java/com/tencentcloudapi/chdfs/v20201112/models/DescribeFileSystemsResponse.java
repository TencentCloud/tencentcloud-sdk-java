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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileSystemsResponse extends AbstractModel {

    /**
    * 文件系统列表
    */
    @SerializedName("FileSystems")
    @Expose
    private FileSystem [] FileSystems;

    /**
    * 标识是否已获取全量
    */
    @SerializedName("IsOver")
    @Expose
    private Boolean IsOver;

    /**
    * 下一次请求起始文件系统ID标记
    */
    @SerializedName("NextFileSystemIdMarker")
    @Expose
    private String NextFileSystemIdMarker;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文件系统列表 
     * @return FileSystems 文件系统列表
     */
    public FileSystem [] getFileSystems() {
        return this.FileSystems;
    }

    /**
     * Set 文件系统列表
     * @param FileSystems 文件系统列表
     */
    public void setFileSystems(FileSystem [] FileSystems) {
        this.FileSystems = FileSystems;
    }

    /**
     * Get 标识是否已获取全量 
     * @return IsOver 标识是否已获取全量
     */
    public Boolean getIsOver() {
        return this.IsOver;
    }

    /**
     * Set 标识是否已获取全量
     * @param IsOver 标识是否已获取全量
     */
    public void setIsOver(Boolean IsOver) {
        this.IsOver = IsOver;
    }

    /**
     * Get 下一次请求起始文件系统ID标记 
     * @return NextFileSystemIdMarker 下一次请求起始文件系统ID标记
     */
    public String getNextFileSystemIdMarker() {
        return this.NextFileSystemIdMarker;
    }

    /**
     * Set 下一次请求起始文件系统ID标记
     * @param NextFileSystemIdMarker 下一次请求起始文件系统ID标记
     */
    public void setNextFileSystemIdMarker(String NextFileSystemIdMarker) {
        this.NextFileSystemIdMarker = NextFileSystemIdMarker;
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

    public DescribeFileSystemsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileSystemsResponse(DescribeFileSystemsResponse source) {
        if (source.FileSystems != null) {
            this.FileSystems = new FileSystem[source.FileSystems.length];
            for (int i = 0; i < source.FileSystems.length; i++) {
                this.FileSystems[i] = new FileSystem(source.FileSystems[i]);
            }
        }
        if (source.IsOver != null) {
            this.IsOver = new Boolean(source.IsOver);
        }
        if (source.NextFileSystemIdMarker != null) {
            this.NextFileSystemIdMarker = new String(source.NextFileSystemIdMarker);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FileSystems.", this.FileSystems);
        this.setParamSimple(map, prefix + "IsOver", this.IsOver);
        this.setParamSimple(map, prefix + "NextFileSystemIdMarker", this.NextFileSystemIdMarker);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

