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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRumLogDetailsV2Response extends AbstractModel {

    /**
    * <p>日志明细JSON字符串，内部Result数组结构不变。CLS路径row_id为0，ts为毫秒精度但单位仍为纳秒，字符串字段完整。</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>CLS续读令牌；ListOver为true时为空。仅CLS路径返回，可缺省。</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>当前条件的日志是否全部返回；预算短页不表示结束。仅CLS路径返回，可缺省。</p>
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>日志明细JSON字符串，内部Result数组结构不变。CLS路径row_id为0，ts为毫秒精度但单位仍为纳秒，字符串字段完整。</p> 
     * @return Result <p>日志明细JSON字符串，内部Result数组结构不变。CLS路径row_id为0，ts为毫秒精度但单位仍为纳秒，字符串字段完整。</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>日志明细JSON字符串，内部Result数组结构不变。CLS路径row_id为0，ts为毫秒精度但单位仍为纳秒，字符串字段完整。</p>
     * @param Result <p>日志明细JSON字符串，内部Result数组结构不变。CLS路径row_id为0，ts为毫秒精度但单位仍为纳秒，字符串字段完整。</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>CLS续读令牌；ListOver为true时为空。仅CLS路径返回，可缺省。</p> 
     * @return Context <p>CLS续读令牌；ListOver为true时为空。仅CLS路径返回，可缺省。</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>CLS续读令牌；ListOver为true时为空。仅CLS路径返回，可缺省。</p>
     * @param Context <p>CLS续读令牌；ListOver为true时为空。仅CLS路径返回，可缺省。</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>当前条件的日志是否全部返回；预算短页不表示结束。仅CLS路径返回，可缺省。</p> 
     * @return ListOver <p>当前条件的日志是否全部返回；预算短页不表示结束。仅CLS路径返回，可缺省。</p>
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set <p>当前条件的日志是否全部返回；预算短页不表示结束。仅CLS路径返回，可缺省。</p>
     * @param ListOver <p>当前条件的日志是否全部返回；预算短页不表示结束。仅CLS路径返回，可缺省。</p>
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
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

    public DescribeRumLogDetailsV2Response() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRumLogDetailsV2Response(DescribeRumLogDetailsV2Response source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

