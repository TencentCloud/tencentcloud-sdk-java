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

public class TestModelInputModalitiesResponse extends AbstractModel {

    /**
    * <p>探测的模型</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>该模型确认支持的输入模态列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>收到上游大模型对于输入模态的响应即为“确认支持”</p>
    */
    @SerializedName("SupportedModalities")
    @Expose
    private String [] SupportedModalities;

    /**
    * <p>每个待探测模态的详细请求结果</p>
    */
    @SerializedName("ProbeDetails")
    @Expose
    private ModalityProbeDetail [] ProbeDetails;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>探测的模型</p> 
     * @return Model <p>探测的模型</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>探测的模型</p>
     * @param Model <p>探测的模型</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>该模型确认支持的输入模态列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>收到上游大模型对于输入模态的响应即为“确认支持”</p> 
     * @return SupportedModalities <p>该模型确认支持的输入模态列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>收到上游大模型对于输入模态的响应即为“确认支持”</p>
     */
    public String [] getSupportedModalities() {
        return this.SupportedModalities;
    }

    /**
     * Set <p>该模型确认支持的输入模态列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>收到上游大模型对于输入模态的响应即为“确认支持”</p>
     * @param SupportedModalities <p>该模型确认支持的输入模态列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>收到上游大模型对于输入模态的响应即为“确认支持”</p>
     */
    public void setSupportedModalities(String [] SupportedModalities) {
        this.SupportedModalities = SupportedModalities;
    }

    /**
     * Get <p>每个待探测模态的详细请求结果</p> 
     * @return ProbeDetails <p>每个待探测模态的详细请求结果</p>
     */
    public ModalityProbeDetail [] getProbeDetails() {
        return this.ProbeDetails;
    }

    /**
     * Set <p>每个待探测模态的详细请求结果</p>
     * @param ProbeDetails <p>每个待探测模态的详细请求结果</p>
     */
    public void setProbeDetails(ModalityProbeDetail [] ProbeDetails) {
        this.ProbeDetails = ProbeDetails;
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

    public TestModelInputModalitiesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TestModelInputModalitiesResponse(TestModelInputModalitiesResponse source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.SupportedModalities != null) {
            this.SupportedModalities = new String[source.SupportedModalities.length];
            for (int i = 0; i < source.SupportedModalities.length; i++) {
                this.SupportedModalities[i] = new String(source.SupportedModalities[i]);
            }
        }
        if (source.ProbeDetails != null) {
            this.ProbeDetails = new ModalityProbeDetail[source.ProbeDetails.length];
            for (int i = 0; i < source.ProbeDetails.length; i++) {
                this.ProbeDetails[i] = new ModalityProbeDetail(source.ProbeDetails[i]);
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
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArraySimple(map, prefix + "SupportedModalities.", this.SupportedModalities);
        this.setParamArrayObj(map, prefix + "ProbeDetails.", this.ProbeDetails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

