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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryExternalContactDetailByDateResponse extends AbstractModel {

    /**
    * 分页游标，再下次请求时填写以获取之后分页的记录，如果已经没有更多的数据则返回空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextCursor")
    @Expose
    private String NextCursor;

    /**
    * 外部联系人详细信息
    */
    @SerializedName("PageData")
    @Expose
    private ExternalContactDetailPro [] PageData;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分页游标，再下次请求时填写以获取之后分页的记录，如果已经没有更多的数据则返回空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextCursor 分页游标，再下次请求时填写以获取之后分页的记录，如果已经没有更多的数据则返回空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set 分页游标，再下次请求时填写以获取之后分页的记录，如果已经没有更多的数据则返回空
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextCursor 分页游标，再下次请求时填写以获取之后分页的记录，如果已经没有更多的数据则返回空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextCursor(String NextCursor) {
        this.NextCursor = NextCursor;
    }

    /**
     * Get 外部联系人详细信息 
     * @return PageData 外部联系人详细信息
     */
    public ExternalContactDetailPro [] getPageData() {
        return this.PageData;
    }

    /**
     * Set 外部联系人详细信息
     * @param PageData 外部联系人详细信息
     */
    public void setPageData(ExternalContactDetailPro [] PageData) {
        this.PageData = PageData;
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

    public QueryExternalContactDetailByDateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryExternalContactDetailByDateResponse(QueryExternalContactDetailByDateResponse source) {
        if (source.NextCursor != null) {
            this.NextCursor = new String(source.NextCursor);
        }
        if (source.PageData != null) {
            this.PageData = new ExternalContactDetailPro[source.PageData.length];
            for (int i = 0; i < source.PageData.length; i++) {
                this.PageData[i] = new ExternalContactDetailPro(source.PageData[i]);
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
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);
        this.setParamArrayObj(map, prefix + "PageData.", this.PageData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

