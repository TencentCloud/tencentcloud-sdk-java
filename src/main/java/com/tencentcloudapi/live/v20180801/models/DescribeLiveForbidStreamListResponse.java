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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveForbidStreamListResponse extends AbstractModel {

    /**
    * 符合条件的总个数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 总页数。
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 分页的页码。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页显示的条数。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 禁推流列表。
    */
    @SerializedName("ForbidStreamList")
    @Expose
    private ForbidStreamInfo [] ForbidStreamList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的总个数。 
     * @return TotalNum 符合条件的总个数。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 符合条件的总个数。
     * @param TotalNum 符合条件的总个数。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 总页数。 
     * @return TotalPage 总页数。
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总页数。
     * @param TotalPage 总页数。
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 分页的页码。 
     * @return PageNum 分页的页码。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 分页的页码。
     * @param PageNum 分页的页码。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页显示的条数。 
     * @return PageSize 每页显示的条数。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示的条数。
     * @param PageSize 每页显示的条数。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 禁推流列表。 
     * @return ForbidStreamList 禁推流列表。
     */
    public ForbidStreamInfo [] getForbidStreamList() {
        return this.ForbidStreamList;
    }

    /**
     * Set 禁推流列表。
     * @param ForbidStreamList 禁推流列表。
     */
    public void setForbidStreamList(ForbidStreamInfo [] ForbidStreamList) {
        this.ForbidStreamList = ForbidStreamList;
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

    public DescribeLiveForbidStreamListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveForbidStreamListResponse(DescribeLiveForbidStreamListResponse source) {
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ForbidStreamList != null) {
            this.ForbidStreamList = new ForbidStreamInfo[source.ForbidStreamList.length];
            for (int i = 0; i < source.ForbidStreamList.length; i++) {
                this.ForbidStreamList[i] = new ForbidStreamInfo(source.ForbidStreamList[i]);
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
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "ForbidStreamList.", this.ForbidStreamList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

