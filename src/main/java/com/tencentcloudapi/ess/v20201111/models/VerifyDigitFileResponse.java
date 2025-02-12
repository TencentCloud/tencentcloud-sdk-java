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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyDigitFileResponse extends AbstractModel {

    /**
    * 加签文件MD5哈希值
    */
    @SerializedName("PdfResourceMd5")
    @Expose
    private String PdfResourceMd5;

    /**
    * 验签结果代码，代码的含义如下：<ul><li>**1**：文件验证成功。</li><li>**2**：文件验证失败。</li></ul>
    */
    @SerializedName("VerifyResult")
    @Expose
    private Long VerifyResult;

    /**
    * 验签序列号, 为11为数组组成的字符串
    */
    @SerializedName("VerifySerialNo")
    @Expose
    private String VerifySerialNo;

    /**
    * 验签结果详情，每个签名域对应的验签结果。
    */
    @SerializedName("VerifyDigitFileResults")
    @Expose
    private VerifyDigitFileResult [] VerifyDigitFileResults;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 加签文件MD5哈希值 
     * @return PdfResourceMd5 加签文件MD5哈希值
     */
    public String getPdfResourceMd5() {
        return this.PdfResourceMd5;
    }

    /**
     * Set 加签文件MD5哈希值
     * @param PdfResourceMd5 加签文件MD5哈希值
     */
    public void setPdfResourceMd5(String PdfResourceMd5) {
        this.PdfResourceMd5 = PdfResourceMd5;
    }

    /**
     * Get 验签结果代码，代码的含义如下：<ul><li>**1**：文件验证成功。</li><li>**2**：文件验证失败。</li></ul> 
     * @return VerifyResult 验签结果代码，代码的含义如下：<ul><li>**1**：文件验证成功。</li><li>**2**：文件验证失败。</li></ul>
     */
    public Long getVerifyResult() {
        return this.VerifyResult;
    }

    /**
     * Set 验签结果代码，代码的含义如下：<ul><li>**1**：文件验证成功。</li><li>**2**：文件验证失败。</li></ul>
     * @param VerifyResult 验签结果代码，代码的含义如下：<ul><li>**1**：文件验证成功。</li><li>**2**：文件验证失败。</li></ul>
     */
    public void setVerifyResult(Long VerifyResult) {
        this.VerifyResult = VerifyResult;
    }

    /**
     * Get 验签序列号, 为11为数组组成的字符串 
     * @return VerifySerialNo 验签序列号, 为11为数组组成的字符串
     */
    public String getVerifySerialNo() {
        return this.VerifySerialNo;
    }

    /**
     * Set 验签序列号, 为11为数组组成的字符串
     * @param VerifySerialNo 验签序列号, 为11为数组组成的字符串
     */
    public void setVerifySerialNo(String VerifySerialNo) {
        this.VerifySerialNo = VerifySerialNo;
    }

    /**
     * Get 验签结果详情，每个签名域对应的验签结果。 
     * @return VerifyDigitFileResults 验签结果详情，每个签名域对应的验签结果。
     */
    public VerifyDigitFileResult [] getVerifyDigitFileResults() {
        return this.VerifyDigitFileResults;
    }

    /**
     * Set 验签结果详情，每个签名域对应的验签结果。
     * @param VerifyDigitFileResults 验签结果详情，每个签名域对应的验签结果。
     */
    public void setVerifyDigitFileResults(VerifyDigitFileResult [] VerifyDigitFileResults) {
        this.VerifyDigitFileResults = VerifyDigitFileResults;
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

    public VerifyDigitFileResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyDigitFileResponse(VerifyDigitFileResponse source) {
        if (source.PdfResourceMd5 != null) {
            this.PdfResourceMd5 = new String(source.PdfResourceMd5);
        }
        if (source.VerifyResult != null) {
            this.VerifyResult = new Long(source.VerifyResult);
        }
        if (source.VerifySerialNo != null) {
            this.VerifySerialNo = new String(source.VerifySerialNo);
        }
        if (source.VerifyDigitFileResults != null) {
            this.VerifyDigitFileResults = new VerifyDigitFileResult[source.VerifyDigitFileResults.length];
            for (int i = 0; i < source.VerifyDigitFileResults.length; i++) {
                this.VerifyDigitFileResults[i] = new VerifyDigitFileResult(source.VerifyDigitFileResults[i]);
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
        this.setParamSimple(map, prefix + "PdfResourceMd5", this.PdfResourceMd5);
        this.setParamSimple(map, prefix + "VerifyResult", this.VerifyResult);
        this.setParamSimple(map, prefix + "VerifySerialNo", this.VerifySerialNo);
        this.setParamArrayObj(map, prefix + "VerifyDigitFileResults.", this.VerifyDigitFileResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

