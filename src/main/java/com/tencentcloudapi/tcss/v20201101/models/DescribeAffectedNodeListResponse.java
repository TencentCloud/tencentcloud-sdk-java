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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAffectedNodeListResponse extends AbstractModel{

    /**
    * 受影响的节点总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 受影响的节点列表
    */
    @SerializedName("AffectedNodeList")
    @Expose
    private AffectedNodeItem [] AffectedNodeList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 受影响的节点总数 
     * @return TotalCount 受影响的节点总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 受影响的节点总数
     * @param TotalCount 受影响的节点总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 受影响的节点列表 
     * @return AffectedNodeList 受影响的节点列表
     */
    public AffectedNodeItem [] getAffectedNodeList() {
        return this.AffectedNodeList;
    }

    /**
     * Set 受影响的节点列表
     * @param AffectedNodeList 受影响的节点列表
     */
    public void setAffectedNodeList(AffectedNodeItem [] AffectedNodeList) {
        this.AffectedNodeList = AffectedNodeList;
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

    public DescribeAffectedNodeListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAffectedNodeListResponse(DescribeAffectedNodeListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AffectedNodeList != null) {
            this.AffectedNodeList = new AffectedNodeItem[source.AffectedNodeList.length];
            for (int i = 0; i < source.AffectedNodeList.length; i++) {
                this.AffectedNodeList[i] = new AffectedNodeItem(source.AffectedNodeList[i]);
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
        this.setParamArrayObj(map, prefix + "AffectedNodeList.", this.AffectedNodeList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

