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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRedoLogListByVaultResponse extends AbstractModel {

    /**
    * 符合条件的RedoLog文件总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * RedoLog文件列表
    */
    @SerializedName("RedoLogList")
    @Expose
    private DescribeRedoLogListByVaultItem [] RedoLogList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的RedoLog文件总数 
     * @return TotalCount 符合条件的RedoLog文件总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的RedoLog文件总数
     * @param TotalCount 符合条件的RedoLog文件总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get RedoLog文件列表 
     * @return RedoLogList RedoLog文件列表
     */
    public DescribeRedoLogListByVaultItem [] getRedoLogList() {
        return this.RedoLogList;
    }

    /**
     * Set RedoLog文件列表
     * @param RedoLogList RedoLog文件列表
     */
    public void setRedoLogList(DescribeRedoLogListByVaultItem [] RedoLogList) {
        this.RedoLogList = RedoLogList;
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

    public DescribeRedoLogListByVaultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedoLogListByVaultResponse(DescribeRedoLogListByVaultResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RedoLogList != null) {
            this.RedoLogList = new DescribeRedoLogListByVaultItem[source.RedoLogList.length];
            for (int i = 0; i < source.RedoLogList.length; i++) {
                this.RedoLogList[i] = new DescribeRedoLogListByVaultItem(source.RedoLogList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RedoLogList.", this.RedoLogList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

