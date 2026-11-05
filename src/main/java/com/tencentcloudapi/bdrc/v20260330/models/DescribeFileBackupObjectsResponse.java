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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileBackupObjectsResponse extends AbstractModel {

    /**
    * <p>当前路径下包含的目录信息</p>
    */
    @SerializedName("DirList")
    @Expose
    private FileInfo [] DirList;

    /**
    * <p>当前路径下包含的文件信息</p>
    */
    @SerializedName("FileList")
    @Expose
    private FileInfo [] FileList;

    /**
    * <p>当前路径下包含的目录及文件总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>当前路径下包含的目录信息</p> 
     * @return DirList <p>当前路径下包含的目录信息</p>
     */
    public FileInfo [] getDirList() {
        return this.DirList;
    }

    /**
     * Set <p>当前路径下包含的目录信息</p>
     * @param DirList <p>当前路径下包含的目录信息</p>
     */
    public void setDirList(FileInfo [] DirList) {
        this.DirList = DirList;
    }

    /**
     * Get <p>当前路径下包含的文件信息</p> 
     * @return FileList <p>当前路径下包含的文件信息</p>
     */
    public FileInfo [] getFileList() {
        return this.FileList;
    }

    /**
     * Set <p>当前路径下包含的文件信息</p>
     * @param FileList <p>当前路径下包含的文件信息</p>
     */
    public void setFileList(FileInfo [] FileList) {
        this.FileList = FileList;
    }

    /**
     * Get <p>当前路径下包含的目录及文件总数</p> 
     * @return TotalCount <p>当前路径下包含的目录及文件总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>当前路径下包含的目录及文件总数</p>
     * @param TotalCount <p>当前路径下包含的目录及文件总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeFileBackupObjectsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileBackupObjectsResponse(DescribeFileBackupObjectsResponse source) {
        if (source.DirList != null) {
            this.DirList = new FileInfo[source.DirList.length];
            for (int i = 0; i < source.DirList.length; i++) {
                this.DirList[i] = new FileInfo(source.DirList[i]);
            }
        }
        if (source.FileList != null) {
            this.FileList = new FileInfo[source.FileList.length];
            for (int i = 0; i < source.FileList.length; i++) {
                this.FileList[i] = new FileInfo(source.FileList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DirList.", this.DirList);
        this.setParamArrayObj(map, prefix + "FileList.", this.FileList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

