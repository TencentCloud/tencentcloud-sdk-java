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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAlgorithmsResponse extends AbstractModel {

    /**
    * 本地区支持的对称加密算法
    */
    @SerializedName("SymmetricAlgorithms")
    @Expose
    private AlgorithmInfo [] SymmetricAlgorithms;

    /**
    * 本地区支持的非对称加密算法
    */
    @SerializedName("AsymmetricAlgorithms")
    @Expose
    private AlgorithmInfo [] AsymmetricAlgorithms;

    /**
    * 本地区支持的非对称签名验签算法
    */
    @SerializedName("AsymmetricSignVerifyAlgorithms")
    @Expose
    private AlgorithmInfo [] AsymmetricSignVerifyAlgorithms;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本地区支持的对称加密算法 
     * @return SymmetricAlgorithms 本地区支持的对称加密算法
     */
    public AlgorithmInfo [] getSymmetricAlgorithms() {
        return this.SymmetricAlgorithms;
    }

    /**
     * Set 本地区支持的对称加密算法
     * @param SymmetricAlgorithms 本地区支持的对称加密算法
     */
    public void setSymmetricAlgorithms(AlgorithmInfo [] SymmetricAlgorithms) {
        this.SymmetricAlgorithms = SymmetricAlgorithms;
    }

    /**
     * Get 本地区支持的非对称加密算法 
     * @return AsymmetricAlgorithms 本地区支持的非对称加密算法
     */
    public AlgorithmInfo [] getAsymmetricAlgorithms() {
        return this.AsymmetricAlgorithms;
    }

    /**
     * Set 本地区支持的非对称加密算法
     * @param AsymmetricAlgorithms 本地区支持的非对称加密算法
     */
    public void setAsymmetricAlgorithms(AlgorithmInfo [] AsymmetricAlgorithms) {
        this.AsymmetricAlgorithms = AsymmetricAlgorithms;
    }

    /**
     * Get 本地区支持的非对称签名验签算法 
     * @return AsymmetricSignVerifyAlgorithms 本地区支持的非对称签名验签算法
     */
    public AlgorithmInfo [] getAsymmetricSignVerifyAlgorithms() {
        return this.AsymmetricSignVerifyAlgorithms;
    }

    /**
     * Set 本地区支持的非对称签名验签算法
     * @param AsymmetricSignVerifyAlgorithms 本地区支持的非对称签名验签算法
     */
    public void setAsymmetricSignVerifyAlgorithms(AlgorithmInfo [] AsymmetricSignVerifyAlgorithms) {
        this.AsymmetricSignVerifyAlgorithms = AsymmetricSignVerifyAlgorithms;
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

    public ListAlgorithmsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAlgorithmsResponse(ListAlgorithmsResponse source) {
        if (source.SymmetricAlgorithms != null) {
            this.SymmetricAlgorithms = new AlgorithmInfo[source.SymmetricAlgorithms.length];
            for (int i = 0; i < source.SymmetricAlgorithms.length; i++) {
                this.SymmetricAlgorithms[i] = new AlgorithmInfo(source.SymmetricAlgorithms[i]);
            }
        }
        if (source.AsymmetricAlgorithms != null) {
            this.AsymmetricAlgorithms = new AlgorithmInfo[source.AsymmetricAlgorithms.length];
            for (int i = 0; i < source.AsymmetricAlgorithms.length; i++) {
                this.AsymmetricAlgorithms[i] = new AlgorithmInfo(source.AsymmetricAlgorithms[i]);
            }
        }
        if (source.AsymmetricSignVerifyAlgorithms != null) {
            this.AsymmetricSignVerifyAlgorithms = new AlgorithmInfo[source.AsymmetricSignVerifyAlgorithms.length];
            for (int i = 0; i < source.AsymmetricSignVerifyAlgorithms.length; i++) {
                this.AsymmetricSignVerifyAlgorithms[i] = new AlgorithmInfo(source.AsymmetricSignVerifyAlgorithms[i]);
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
        this.setParamArrayObj(map, prefix + "SymmetricAlgorithms.", this.SymmetricAlgorithms);
        this.setParamArrayObj(map, prefix + "AsymmetricAlgorithms.", this.AsymmetricAlgorithms);
        this.setParamArrayObj(map, prefix + "AsymmetricSignVerifyAlgorithms.", this.AsymmetricSignVerifyAlgorithms);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

