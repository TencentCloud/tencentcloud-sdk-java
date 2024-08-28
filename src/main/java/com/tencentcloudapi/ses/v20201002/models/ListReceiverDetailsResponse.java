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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListReceiverDetailsResponse extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 数据记录
    */
    @SerializedName("Data")
    @Expose
    private ReceiverDetail [] Data;

    /**
    * 有效邮件地址数
    */
    @SerializedName("ValidCount")
    @Expose
    private Long ValidCount;

    /**
    * 无效邮件地址数
    */
    @SerializedName("InvalidCount")
    @Expose
    private Long InvalidCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 数据记录 
     * @return Data 数据记录
     */
    public ReceiverDetail [] getData() {
        return this.Data;
    }

    /**
     * Set 数据记录
     * @param Data 数据记录
     */
    public void setData(ReceiverDetail [] Data) {
        this.Data = Data;
    }

    /**
     * Get 有效邮件地址数 
     * @return ValidCount 有效邮件地址数
     */
    public Long getValidCount() {
        return this.ValidCount;
    }

    /**
     * Set 有效邮件地址数
     * @param ValidCount 有效邮件地址数
     */
    public void setValidCount(Long ValidCount) {
        this.ValidCount = ValidCount;
    }

    /**
     * Get 无效邮件地址数 
     * @return InvalidCount 无效邮件地址数
     */
    public Long getInvalidCount() {
        return this.InvalidCount;
    }

    /**
     * Set 无效邮件地址数
     * @param InvalidCount 无效邮件地址数
     */
    public void setInvalidCount(Long InvalidCount) {
        this.InvalidCount = InvalidCount;
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

    public ListReceiverDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListReceiverDetailsResponse(ListReceiverDetailsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new ReceiverDetail[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ReceiverDetail(source.Data[i]);
            }
        }
        if (source.ValidCount != null) {
            this.ValidCount = new Long(source.ValidCount);
        }
        if (source.InvalidCount != null) {
            this.InvalidCount = new Long(source.InvalidCount);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "ValidCount", this.ValidCount);
        this.setParamSimple(map, prefix + "InvalidCount", this.InvalidCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

