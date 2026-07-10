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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVasListResponse extends AbstractModel {

    /**
    * <p>符合筛选条件的套餐总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>增值服务信息列表</p>
    */
    @SerializedName("VasList")
    @Expose
    private VasListItem [] VasList;

    /**
    * <p>增值服务信息列表</p>
    */
    @SerializedName("VASList")
    @Expose
    private VasListItem [] VASList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>符合筛选条件的套餐总数</p> 
     * @return TotalCount <p>符合筛选条件的套餐总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>符合筛选条件的套餐总数</p>
     * @param TotalCount <p>符合筛选条件的套餐总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>增值服务信息列表</p> 
     * @return VasList <p>增值服务信息列表</p>
     * @deprecated
     */
    @Deprecated
    public VasListItem [] getVasList() {
        return this.VasList;
    }

    /**
     * Set <p>增值服务信息列表</p>
     * @param VasList <p>增值服务信息列表</p>
     * @deprecated
     */
    @Deprecated
    public void setVasList(VasListItem [] VasList) {
        this.VasList = VasList;
    }

    /**
     * Get <p>增值服务信息列表</p> 
     * @return VASList <p>增值服务信息列表</p>
     */
    public VasListItem [] getVASList() {
        return this.VASList;
    }

    /**
     * Set <p>增值服务信息列表</p>
     * @param VASList <p>增值服务信息列表</p>
     */
    public void setVASList(VasListItem [] VASList) {
        this.VASList = VASList;
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

    public DescribeVasListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVasListResponse(DescribeVasListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VasList != null) {
            this.VasList = new VasListItem[source.VasList.length];
            for (int i = 0; i < source.VasList.length; i++) {
                this.VasList[i] = new VasListItem(source.VasList[i]);
            }
        }
        if (source.VASList != null) {
            this.VASList = new VasListItem[source.VASList.length];
            for (int i = 0; i < source.VASList.length; i++) {
                this.VASList[i] = new VasListItem(source.VASList[i]);
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
        this.setParamArrayObj(map, prefix + "VasList.", this.VasList);
        this.setParamArrayObj(map, prefix + "VASList.", this.VASList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

