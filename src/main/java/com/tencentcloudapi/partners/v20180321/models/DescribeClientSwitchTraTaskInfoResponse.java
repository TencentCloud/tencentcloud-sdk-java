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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClientSwitchTraTaskInfoResponse extends AbstractModel {

    /**
    * 客户UIN
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;

    /**
    * 切换类型：代理,代采
    */
    @SerializedName("SwitchType")
    @Expose
    private String SwitchType;

    /**
    * ok，符合，fail，不符合
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 切换链接
    */
    @SerializedName("SwitchUrl")
    @Expose
    private String SwitchUrl;

    /**
    * 不符合的原因
    */
    @SerializedName("ResultMsg")
    @Expose
    private String ResultMsg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 客户UIN 
     * @return ClientUin 客户UIN
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 客户UIN
     * @param ClientUin 客户UIN
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 切换类型：代理,代采 
     * @return SwitchType 切换类型：代理,代采
     */
    public String getSwitchType() {
        return this.SwitchType;
    }

    /**
     * Set 切换类型：代理,代采
     * @param SwitchType 切换类型：代理,代采
     */
    public void setSwitchType(String SwitchType) {
        this.SwitchType = SwitchType;
    }

    /**
     * Get ok，符合，fail，不符合 
     * @return Result ok，符合，fail，不符合
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set ok，符合，fail，不符合
     * @param Result ok，符合，fail，不符合
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 切换链接 
     * @return SwitchUrl 切换链接
     */
    public String getSwitchUrl() {
        return this.SwitchUrl;
    }

    /**
     * Set 切换链接
     * @param SwitchUrl 切换链接
     */
    public void setSwitchUrl(String SwitchUrl) {
        this.SwitchUrl = SwitchUrl;
    }

    /**
     * Get 不符合的原因 
     * @return ResultMsg 不符合的原因
     */
    public String getResultMsg() {
        return this.ResultMsg;
    }

    /**
     * Set 不符合的原因
     * @param ResultMsg 不符合的原因
     */
    public void setResultMsg(String ResultMsg) {
        this.ResultMsg = ResultMsg;
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

    public DescribeClientSwitchTraTaskInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClientSwitchTraTaskInfoResponse(DescribeClientSwitchTraTaskInfoResponse source) {
        if (source.ClientUin != null) {
            this.ClientUin = new String(source.ClientUin);
        }
        if (source.SwitchType != null) {
            this.SwitchType = new String(source.SwitchType);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.SwitchUrl != null) {
            this.SwitchUrl = new String(source.SwitchUrl);
        }
        if (source.ResultMsg != null) {
            this.ResultMsg = new String(source.ResultMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "SwitchType", this.SwitchType);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "SwitchUrl", this.SwitchUrl);
        this.setParamSimple(map, prefix + "ResultMsg", this.ResultMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

