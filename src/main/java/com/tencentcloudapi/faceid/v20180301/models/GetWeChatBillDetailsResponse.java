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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWeChatBillDetailsResponse extends AbstractModel{

    /**
    * 是否还有下一页。该字段为true时，需要将NextCursor的值作为入参Cursor继续调用本接口。
    */
    @SerializedName("HasNextPage")
    @Expose
    private Boolean HasNextPage;

    /**
    * 下一页的游标。用于分页。
    */
    @SerializedName("NextCursor")
    @Expose
    private Long NextCursor;

    /**
    * 数据
    */
    @SerializedName("WeChatBillDetails")
    @Expose
    private WeChatBillDetail [] WeChatBillDetails;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否还有下一页。该字段为true时，需要将NextCursor的值作为入参Cursor继续调用本接口。 
     * @return HasNextPage 是否还有下一页。该字段为true时，需要将NextCursor的值作为入参Cursor继续调用本接口。
     */
    public Boolean getHasNextPage() {
        return this.HasNextPage;
    }

    /**
     * Set 是否还有下一页。该字段为true时，需要将NextCursor的值作为入参Cursor继续调用本接口。
     * @param HasNextPage 是否还有下一页。该字段为true时，需要将NextCursor的值作为入参Cursor继续调用本接口。
     */
    public void setHasNextPage(Boolean HasNextPage) {
        this.HasNextPage = HasNextPage;
    }

    /**
     * Get 下一页的游标。用于分页。 
     * @return NextCursor 下一页的游标。用于分页。
     */
    public Long getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set 下一页的游标。用于分页。
     * @param NextCursor 下一页的游标。用于分页。
     */
    public void setNextCursor(Long NextCursor) {
        this.NextCursor = NextCursor;
    }

    /**
     * Get 数据 
     * @return WeChatBillDetails 数据
     */
    public WeChatBillDetail [] getWeChatBillDetails() {
        return this.WeChatBillDetails;
    }

    /**
     * Set 数据
     * @param WeChatBillDetails 数据
     */
    public void setWeChatBillDetails(WeChatBillDetail [] WeChatBillDetails) {
        this.WeChatBillDetails = WeChatBillDetails;
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

    public GetWeChatBillDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWeChatBillDetailsResponse(GetWeChatBillDetailsResponse source) {
        if (source.HasNextPage != null) {
            this.HasNextPage = new Boolean(source.HasNextPage);
        }
        if (source.NextCursor != null) {
            this.NextCursor = new Long(source.NextCursor);
        }
        if (source.WeChatBillDetails != null) {
            this.WeChatBillDetails = new WeChatBillDetail[source.WeChatBillDetails.length];
            for (int i = 0; i < source.WeChatBillDetails.length; i++) {
                this.WeChatBillDetails[i] = new WeChatBillDetail(source.WeChatBillDetails[i]);
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
        this.setParamSimple(map, prefix + "HasNextPage", this.HasNextPage);
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);
        this.setParamArrayObj(map, prefix + "WeChatBillDetails.", this.WeChatBillDetails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

