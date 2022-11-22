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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotListResponse extends AbstractModel{

    /**
    * 分页信息
    */
    @SerializedName("Info")
    @Expose
    private SnapshotPageInfo Info;

    /**
    * 快照列表
    */
    @SerializedName("SnapshotList")
    @Expose
    private SnapshotInfo [] SnapshotList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分页信息 
     * @return Info 分页信息
     */
    public SnapshotPageInfo getInfo() {
        return this.Info;
    }

    /**
     * Set 分页信息
     * @param Info 分页信息
     */
    public void setInfo(SnapshotPageInfo Info) {
        this.Info = Info;
    }

    /**
     * Get 快照列表 
     * @return SnapshotList 快照列表
     */
    public SnapshotInfo [] getSnapshotList() {
        return this.SnapshotList;
    }

    /**
     * Set 快照列表
     * @param SnapshotList 快照列表
     */
    public void setSnapshotList(SnapshotInfo [] SnapshotList) {
        this.SnapshotList = SnapshotList;
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

    public DescribeSnapshotListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotListResponse(DescribeSnapshotListResponse source) {
        if (source.Info != null) {
            this.Info = new SnapshotPageInfo(source.Info);
        }
        if (source.SnapshotList != null) {
            this.SnapshotList = new SnapshotInfo[source.SnapshotList.length];
            for (int i = 0; i < source.SnapshotList.length; i++) {
                this.SnapshotList[i] = new SnapshotInfo(source.SnapshotList[i]);
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
        this.setParamObj(map, prefix + "Info.", this.Info);
        this.setParamArrayObj(map, prefix + "SnapshotList.", this.SnapshotList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

