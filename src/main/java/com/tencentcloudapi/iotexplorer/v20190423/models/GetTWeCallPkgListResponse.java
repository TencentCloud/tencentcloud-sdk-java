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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTWeCallPkgListResponse extends AbstractModel {

    /**
    * 激活状态
    */
    @SerializedName("TWeCallPkgList")
    @Expose
    private TWeCallPkgInfo [] TWeCallPkgList;

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 分类统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TWeCallCategoryPkgList")
    @Expose
    private TWeCallCategoryPkgInfo [] TWeCallCategoryPkgList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 激活状态 
     * @return TWeCallPkgList 激活状态
     */
    public TWeCallPkgInfo [] getTWeCallPkgList() {
        return this.TWeCallPkgList;
    }

    /**
     * Set 激活状态
     * @param TWeCallPkgList 激活状态
     */
    public void setTWeCallPkgList(TWeCallPkgInfo [] TWeCallPkgList) {
        this.TWeCallPkgList = TWeCallPkgList;
    }

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 分类统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TWeCallCategoryPkgList 分类统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TWeCallCategoryPkgInfo [] getTWeCallCategoryPkgList() {
        return this.TWeCallCategoryPkgList;
    }

    /**
     * Set 分类统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param TWeCallCategoryPkgList 分类统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTWeCallCategoryPkgList(TWeCallCategoryPkgInfo [] TWeCallCategoryPkgList) {
        this.TWeCallCategoryPkgList = TWeCallCategoryPkgList;
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

    public GetTWeCallPkgListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTWeCallPkgListResponse(GetTWeCallPkgListResponse source) {
        if (source.TWeCallPkgList != null) {
            this.TWeCallPkgList = new TWeCallPkgInfo[source.TWeCallPkgList.length];
            for (int i = 0; i < source.TWeCallPkgList.length; i++) {
                this.TWeCallPkgList[i] = new TWeCallPkgInfo(source.TWeCallPkgList[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.TWeCallCategoryPkgList != null) {
            this.TWeCallCategoryPkgList = new TWeCallCategoryPkgInfo[source.TWeCallCategoryPkgList.length];
            for (int i = 0; i < source.TWeCallCategoryPkgList.length; i++) {
                this.TWeCallCategoryPkgList[i] = new TWeCallCategoryPkgInfo(source.TWeCallCategoryPkgList[i]);
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
        this.setParamArrayObj(map, prefix + "TWeCallPkgList.", this.TWeCallPkgList);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "TWeCallCategoryPkgList.", this.TWeCallCategoryPkgList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

