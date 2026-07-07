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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModalityProbeDetail extends AbstractModel {

    /**
    * <p>探测的模态</p>
    */
    @SerializedName("Modality")
    @Expose
    private String Modality;

    /**
    * <p>探测结果</p><p>枚举值：</p><ul><li>Supported： 模型支持该输入模态</li><li>Unsupported： 模型不支持该输入模态</li><li>Inconclusive： 模型未明确是否支持该模态，待重新探测</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>探测该模态请求的报错详情</p>
    */
    @SerializedName("ErrorInfo")
    @Expose
    private ProviderTestConnectionErrorInfo ErrorInfo;

    /**
     * Get <p>探测的模态</p> 
     * @return Modality <p>探测的模态</p>
     */
    public String getModality() {
        return this.Modality;
    }

    /**
     * Set <p>探测的模态</p>
     * @param Modality <p>探测的模态</p>
     */
    public void setModality(String Modality) {
        this.Modality = Modality;
    }

    /**
     * Get <p>探测结果</p><p>枚举值：</p><ul><li>Supported： 模型支持该输入模态</li><li>Unsupported： 模型不支持该输入模态</li><li>Inconclusive： 模型未明确是否支持该模态，待重新探测</li></ul> 
     * @return Status <p>探测结果</p><p>枚举值：</p><ul><li>Supported： 模型支持该输入模态</li><li>Unsupported： 模型不支持该输入模态</li><li>Inconclusive： 模型未明确是否支持该模态，待重新探测</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>探测结果</p><p>枚举值：</p><ul><li>Supported： 模型支持该输入模态</li><li>Unsupported： 模型不支持该输入模态</li><li>Inconclusive： 模型未明确是否支持该模态，待重新探测</li></ul>
     * @param Status <p>探测结果</p><p>枚举值：</p><ul><li>Supported： 模型支持该输入模态</li><li>Unsupported： 模型不支持该输入模态</li><li>Inconclusive： 模型未明确是否支持该模态，待重新探测</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>探测该模态请求的报错详情</p> 
     * @return ErrorInfo <p>探测该模态请求的报错详情</p>
     */
    public ProviderTestConnectionErrorInfo getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set <p>探测该模态请求的报错详情</p>
     * @param ErrorInfo <p>探测该模态请求的报错详情</p>
     */
    public void setErrorInfo(ProviderTestConnectionErrorInfo ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    public ModalityProbeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModalityProbeDetail(ModalityProbeDetail source) {
        if (source.Modality != null) {
            this.Modality = new String(source.Modality);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new ProviderTestConnectionErrorInfo(source.ErrorInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Modality", this.Modality);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "ErrorInfo.", this.ErrorInfo);

    }
}

