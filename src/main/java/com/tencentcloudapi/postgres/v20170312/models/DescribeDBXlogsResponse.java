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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBXlogsResponse extends AbstractModel{

    /**
    * 表示此次返回结果有多少条数据。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Xlog列表
    */
    @SerializedName("XlogList")
    @Expose
    private Xlog [] XlogList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 表示此次返回结果有多少条数据。 
     * @return TotalCount 表示此次返回结果有多少条数据。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 表示此次返回结果有多少条数据。
     * @param TotalCount 表示此次返回结果有多少条数据。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Xlog列表 
     * @return XlogList Xlog列表
     */
    public Xlog [] getXlogList() {
        return this.XlogList;
    }

    /**
     * Set Xlog列表
     * @param XlogList Xlog列表
     */
    public void setXlogList(Xlog [] XlogList) {
        this.XlogList = XlogList;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "XlogList.", this.XlogList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

