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

public class DescribeLiveTranscodeDetailInfoResponse extends AbstractModel {

    /**
    * <p>统计数据列表。</p>
    */
    @SerializedName("DataInfoList")
    @Expose
    private TranscodeDetailInfo [] DataInfoList;

    /**
    * <p>页码。</p>
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * <p>每页个数。</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>总个数。</p>
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * <p>总页数。</p>
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
     * Get <p>统计数据列表。</p> 
     * @return DataInfoList <p>统计数据列表。</p>
     */
    public TranscodeDetailInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set <p>统计数据列表。</p>
     * @param DataInfoList <p>统计数据列表。</p>
     */
    public void setDataInfoList(TranscodeDetailInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
    }

    /**
     * Get <p>页码。</p> 
     * @return PageNum <p>页码。</p>
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set <p>页码。</p>
     * @param PageNum <p>页码。</p>
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get <p>每页个数。</p> 
     * @return PageSize <p>每页个数。</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页个数。</p>
     * @param PageSize <p>每页个数。</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>总个数。</p> 
     * @return TotalNum <p>总个数。</p>
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set <p>总个数。</p>
     * @param TotalNum <p>总个数。</p>
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get <p>总页数。</p> 
     * @return TotalPage <p>总页数。</p>
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set <p>总页数。</p>
     * @param TotalPage <p>总页数。</p>
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

    public DescribeLiveTranscodeDetailInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveTranscodeDetailInfoResponse(DescribeLiveTranscodeDetailInfoResponse source) {
        if (source.DataInfoList != null) {
            this.DataInfoList = new TranscodeDetailInfo[source.DataInfoList.length];
            for (int i = 0; i < source.DataInfoList.length; i++) {
                this.DataInfoList[i] = new TranscodeDetailInfo(source.DataInfoList[i]);
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
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

