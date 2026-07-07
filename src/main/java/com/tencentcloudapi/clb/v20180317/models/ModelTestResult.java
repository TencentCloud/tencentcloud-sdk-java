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

public class ModelTestResult extends AbstractModel {

    /**
    * <p>模型</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>健康状况</p><p>枚举值：</p><ul><li>Success： 健康</li><li>Error： 不健康</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("ErrorInfo")
    @Expose
    private ProviderTestConnectionErrorInfo ErrorInfo;

    /**
    * <p>探测请求</p>
    */
    @SerializedName("TestConnectionRequest")
    @Expose
    private TestConnectionRequestInfo TestConnectionRequest;

    /**
     * Get <p>模型</p> 
     * @return Model <p>模型</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型</p>
     * @param Model <p>模型</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>健康状况</p><p>枚举值：</p><ul><li>Success： 健康</li><li>Error： 不健康</li></ul> 
     * @return Status <p>健康状况</p><p>枚举值：</p><ul><li>Success： 健康</li><li>Error： 不健康</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>健康状况</p><p>枚举值：</p><ul><li>Success： 健康</li><li>Error： 不健康</li></ul>
     * @param Status <p>健康状况</p><p>枚举值：</p><ul><li>Success： 健康</li><li>Error： 不健康</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误信息</p> 
     * @return ErrorInfo <p>错误信息</p>
     */
    public ProviderTestConnectionErrorInfo getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set <p>错误信息</p>
     * @param ErrorInfo <p>错误信息</p>
     */
    public void setErrorInfo(ProviderTestConnectionErrorInfo ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get <p>探测请求</p> 
     * @return TestConnectionRequest <p>探测请求</p>
     */
    public TestConnectionRequestInfo getTestConnectionRequest() {
        return this.TestConnectionRequest;
    }

    /**
     * Set <p>探测请求</p>
     * @param TestConnectionRequest <p>探测请求</p>
     */
    public void setTestConnectionRequest(TestConnectionRequestInfo TestConnectionRequest) {
        this.TestConnectionRequest = TestConnectionRequest;
    }

    public ModelTestResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelTestResult(ModelTestResult source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new ProviderTestConnectionErrorInfo(source.ErrorInfo);
        }
        if (source.TestConnectionRequest != null) {
            this.TestConnectionRequest = new TestConnectionRequestInfo(source.TestConnectionRequest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "ErrorInfo.", this.ErrorInfo);
        this.setParamObj(map, prefix + "TestConnectionRequest.", this.TestConnectionRequest);

    }
}

