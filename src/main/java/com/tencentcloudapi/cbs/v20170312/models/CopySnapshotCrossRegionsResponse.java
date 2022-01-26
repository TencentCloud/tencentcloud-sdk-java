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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopySnapshotCrossRegionsResponse extends AbstractModel{

    /**
    * 快照跨地域复制的结果，如果请求下发成功，则返回相应地地域的新快照ID，否则返回Error。
    */
    @SerializedName("SnapshotCopyResultSet")
    @Expose
    private SnapshotCopyResult [] SnapshotCopyResultSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 快照跨地域复制的结果，如果请求下发成功，则返回相应地地域的新快照ID，否则返回Error。 
     * @return SnapshotCopyResultSet 快照跨地域复制的结果，如果请求下发成功，则返回相应地地域的新快照ID，否则返回Error。
     */
    public SnapshotCopyResult [] getSnapshotCopyResultSet() {
        return this.SnapshotCopyResultSet;
    }

    /**
     * Set 快照跨地域复制的结果，如果请求下发成功，则返回相应地地域的新快照ID，否则返回Error。
     * @param SnapshotCopyResultSet 快照跨地域复制的结果，如果请求下发成功，则返回相应地地域的新快照ID，否则返回Error。
     */
    public void setSnapshotCopyResultSet(SnapshotCopyResult [] SnapshotCopyResultSet) {
        this.SnapshotCopyResultSet = SnapshotCopyResultSet;
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

    public CopySnapshotCrossRegionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopySnapshotCrossRegionsResponse(CopySnapshotCrossRegionsResponse source) {
        if (source.SnapshotCopyResultSet != null) {
            this.SnapshotCopyResultSet = new SnapshotCopyResult[source.SnapshotCopyResultSet.length];
            for (int i = 0; i < source.SnapshotCopyResultSet.length; i++) {
                this.SnapshotCopyResultSet[i] = new SnapshotCopyResult(source.SnapshotCopyResultSet[i]);
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
        this.setParamArrayObj(map, prefix + "SnapshotCopyResultSet.", this.SnapshotCopyResultSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

