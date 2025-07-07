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

public class DescribeLivePadStreamListResponse extends AbstractModel {

    /**
    * 当前正在拉取垫片的流信息列表。
    */
    @SerializedName("StreamInfoList")
    @Expose
    private PadStreamInfo [] StreamInfoList;

    /**
    * 传入的分页页数。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 传入的分页个数。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询到的总个数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 可以分的总页数。
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前正在拉取垫片的流信息列表。 
     * @return StreamInfoList 当前正在拉取垫片的流信息列表。
     */
    public PadStreamInfo [] getStreamInfoList() {
        return this.StreamInfoList;
    }

    /**
     * Set 当前正在拉取垫片的流信息列表。
     * @param StreamInfoList 当前正在拉取垫片的流信息列表。
     */
    public void setStreamInfoList(PadStreamInfo [] StreamInfoList) {
        this.StreamInfoList = StreamInfoList;
    }

    /**
     * Get 传入的分页页数。 
     * @return PageNum 传入的分页页数。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 传入的分页页数。
     * @param PageNum 传入的分页页数。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 传入的分页个数。 
     * @return PageSize 传入的分页个数。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 传入的分页个数。
     * @param PageSize 传入的分页个数。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询到的总个数。 
     * @return TotalNum 查询到的总个数。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 查询到的总个数。
     * @param TotalNum 查询到的总个数。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 可以分的总页数。 
     * @return TotalPage 可以分的总页数。
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 可以分的总页数。
     * @param TotalPage 可以分的总页数。
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
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

    public DescribeLivePadStreamListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLivePadStreamListResponse(DescribeLivePadStreamListResponse source) {
        if (source.StreamInfoList != null) {
            this.StreamInfoList = new PadStreamInfo[source.StreamInfoList.length];
            for (int i = 0; i < source.StreamInfoList.length; i++) {
                this.StreamInfoList[i] = new PadStreamInfo(source.StreamInfoList[i]);
            }
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "StreamInfoList.", this.StreamInfoList);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

