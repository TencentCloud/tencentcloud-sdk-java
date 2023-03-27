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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyPdfResponse extends AbstractModel{

    /**
    * 验签结果，1-文件未被篡改，全部签名在腾讯电子签完成； 2-文件未被篡改，部分签名在腾讯电子签完成；3-文件被篡改；4-异常：文件内没有签名域；5-异常：文件签名格式错误
    */
    @SerializedName("VerifyResult")
    @Expose
    private Long VerifyResult;

    /**
    * 验签结果详情,内部状态1-验签成功，在电子签签署；2-验签成功，在其他平台签署；3-验签失败；4-pdf文件没有签名域；5-文件签名格式错误
    */
    @SerializedName("PdfVerifyResults")
    @Expose
    private PdfVerifyResult [] PdfVerifyResults;

    /**
    * 验签序列号
    */
    @SerializedName("VerifySerialNo")
    @Expose
    private String VerifySerialNo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 验签结果，1-文件未被篡改，全部签名在腾讯电子签完成； 2-文件未被篡改，部分签名在腾讯电子签完成；3-文件被篡改；4-异常：文件内没有签名域；5-异常：文件签名格式错误 
     * @return VerifyResult 验签结果，1-文件未被篡改，全部签名在腾讯电子签完成； 2-文件未被篡改，部分签名在腾讯电子签完成；3-文件被篡改；4-异常：文件内没有签名域；5-异常：文件签名格式错误
     */
    public Long getVerifyResult() {
        return this.VerifyResult;
    }

    /**
     * Set 验签结果，1-文件未被篡改，全部签名在腾讯电子签完成； 2-文件未被篡改，部分签名在腾讯电子签完成；3-文件被篡改；4-异常：文件内没有签名域；5-异常：文件签名格式错误
     * @param VerifyResult 验签结果，1-文件未被篡改，全部签名在腾讯电子签完成； 2-文件未被篡改，部分签名在腾讯电子签完成；3-文件被篡改；4-异常：文件内没有签名域；5-异常：文件签名格式错误
     */
    public void setVerifyResult(Long VerifyResult) {
        this.VerifyResult = VerifyResult;
    }

    /**
     * Get 验签结果详情,内部状态1-验签成功，在电子签签署；2-验签成功，在其他平台签署；3-验签失败；4-pdf文件没有签名域；5-文件签名格式错误 
     * @return PdfVerifyResults 验签结果详情,内部状态1-验签成功，在电子签签署；2-验签成功，在其他平台签署；3-验签失败；4-pdf文件没有签名域；5-文件签名格式错误
     */
    public PdfVerifyResult [] getPdfVerifyResults() {
        return this.PdfVerifyResults;
    }

    /**
     * Set 验签结果详情,内部状态1-验签成功，在电子签签署；2-验签成功，在其他平台签署；3-验签失败；4-pdf文件没有签名域；5-文件签名格式错误
     * @param PdfVerifyResults 验签结果详情,内部状态1-验签成功，在电子签签署；2-验签成功，在其他平台签署；3-验签失败；4-pdf文件没有签名域；5-文件签名格式错误
     */
    public void setPdfVerifyResults(PdfVerifyResult [] PdfVerifyResults) {
        this.PdfVerifyResults = PdfVerifyResults;
    }

    /**
     * Get 验签序列号 
     * @return VerifySerialNo 验签序列号
     */
    public String getVerifySerialNo() {
        return this.VerifySerialNo;
    }

    /**
     * Set 验签序列号
     * @param VerifySerialNo 验签序列号
     */
    public void setVerifySerialNo(String VerifySerialNo) {
        this.VerifySerialNo = VerifySerialNo;
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

    public VerifyPdfResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyPdfResponse(VerifyPdfResponse source) {
        if (source.VerifyResult != null) {
            this.VerifyResult = new Long(source.VerifyResult);
        }
        if (source.PdfVerifyResults != null) {
            this.PdfVerifyResults = new PdfVerifyResult[source.PdfVerifyResults.length];
            for (int i = 0; i < source.PdfVerifyResults.length; i++) {
                this.PdfVerifyResults[i] = new PdfVerifyResult(source.PdfVerifyResults[i]);
            }
        }
        if (source.VerifySerialNo != null) {
            this.VerifySerialNo = new String(source.VerifySerialNo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerifyResult", this.VerifyResult);
        this.setParamArrayObj(map, prefix + "PdfVerifyResults.", this.PdfVerifyResults);
        this.setParamSimple(map, prefix + "VerifySerialNo", this.VerifySerialNo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

