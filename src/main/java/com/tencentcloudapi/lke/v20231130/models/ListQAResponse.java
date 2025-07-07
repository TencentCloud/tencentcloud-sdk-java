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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListQAResponse extends AbstractModel {

    /**
    * 问答数量
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 待校验问答数量
    */
    @SerializedName("WaitVerifyTotal")
    @Expose
    private String WaitVerifyTotal;

    /**
    * 未采纳问答数量
    */
    @SerializedName("NotAcceptedTotal")
    @Expose
    private String NotAcceptedTotal;

    /**
    * 已采纳问答数量
    */
    @SerializedName("AcceptedTotal")
    @Expose
    private String AcceptedTotal;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 问答详情
    */
    @SerializedName("List")
    @Expose
    private ListQaItem [] List;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 问答数量 
     * @return Total 问答数量
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 问答数量
     * @param Total 问答数量
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 待校验问答数量 
     * @return WaitVerifyTotal 待校验问答数量
     */
    public String getWaitVerifyTotal() {
        return this.WaitVerifyTotal;
    }

    /**
     * Set 待校验问答数量
     * @param WaitVerifyTotal 待校验问答数量
     */
    public void setWaitVerifyTotal(String WaitVerifyTotal) {
        this.WaitVerifyTotal = WaitVerifyTotal;
    }

    /**
     * Get 未采纳问答数量 
     * @return NotAcceptedTotal 未采纳问答数量
     */
    public String getNotAcceptedTotal() {
        return this.NotAcceptedTotal;
    }

    /**
     * Set 未采纳问答数量
     * @param NotAcceptedTotal 未采纳问答数量
     */
    public void setNotAcceptedTotal(String NotAcceptedTotal) {
        this.NotAcceptedTotal = NotAcceptedTotal;
    }

    /**
     * Get 已采纳问答数量 
     * @return AcceptedTotal 已采纳问答数量
     */
    public String getAcceptedTotal() {
        return this.AcceptedTotal;
    }

    /**
     * Set 已采纳问答数量
     * @param AcceptedTotal 已采纳问答数量
     */
    public void setAcceptedTotal(String AcceptedTotal) {
        this.AcceptedTotal = AcceptedTotal;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 问答详情 
     * @return List 问答详情
     */
    public ListQaItem [] getList() {
        return this.List;
    }

    /**
     * Set 问答详情
     * @param List 问答详情
     */
    public void setList(ListQaItem [] List) {
        this.List = List;
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

    public ListQAResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListQAResponse(ListQAResponse source) {
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.WaitVerifyTotal != null) {
            this.WaitVerifyTotal = new String(source.WaitVerifyTotal);
        }
        if (source.NotAcceptedTotal != null) {
            this.NotAcceptedTotal = new String(source.NotAcceptedTotal);
        }
        if (source.AcceptedTotal != null) {
            this.AcceptedTotal = new String(source.AcceptedTotal);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.List != null) {
            this.List = new ListQaItem[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new ListQaItem(source.List[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "WaitVerifyTotal", this.WaitVerifyTotal);
        this.setParamSimple(map, prefix + "NotAcceptedTotal", this.NotAcceptedTotal);
        this.setParamSimple(map, prefix + "AcceptedTotal", this.AcceptedTotal);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

