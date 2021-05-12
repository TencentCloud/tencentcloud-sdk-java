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
package com.tencentcloudapi.ims.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImsListResponse extends AbstractModel{

    /**
    * 返回列表数据----非必选，该参数暂未对外开放
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImsDetailSet")
    @Expose
    private ImsDetail [] ImsDetailSet;

    /**
    * 总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回列表数据----非必选，该参数暂未对外开放
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImsDetailSet 返回列表数据----非必选，该参数暂未对外开放
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImsDetail [] getImsDetailSet() {
        return this.ImsDetailSet;
    }

    /**
     * Set 返回列表数据----非必选，该参数暂未对外开放
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImsDetailSet 返回列表数据----非必选，该参数暂未对外开放
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImsDetailSet(ImsDetail [] ImsDetailSet) {
        this.ImsDetailSet = ImsDetailSet;
    }

    /**
     * Get 总条数 
     * @return TotalCount 总条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条数
     * @param TotalCount 总条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeImsListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImsListResponse(DescribeImsListResponse source) {
        if (source.ImsDetailSet != null) {
            this.ImsDetailSet = new ImsDetail[source.ImsDetailSet.length];
            for (int i = 0; i < source.ImsDetailSet.length; i++) {
                this.ImsDetailSet[i] = new ImsDetail(source.ImsDetailSet[i]);
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
        this.setParamArrayObj(map, prefix + "ImsDetailSet.", this.ImsDetailSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

