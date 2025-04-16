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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FirewallTemplateApplyRecordDetail extends AbstractModel {

    /**
    * 实例标识信息。
    */
    @SerializedName("Instance")
    @Expose
    private InstanceIdentifier Instance;

    /**
    * 防火墙模板应用状态。

- SUCCESS：成功
- FAILED：失败
- RUNNING：运行中
    */
    @SerializedName("ApplyState")
    @Expose
    private String ApplyState;

    /**
    * 防火墙模板应用错误信息。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get 实例标识信息。 
     * @return Instance 实例标识信息。
     */
    public InstanceIdentifier getInstance() {
        return this.Instance;
    }

    /**
     * Set 实例标识信息。
     * @param Instance 实例标识信息。
     */
    public void setInstance(InstanceIdentifier Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 防火墙模板应用状态。

- SUCCESS：成功
- FAILED：失败
- RUNNING：运行中 
     * @return ApplyState 防火墙模板应用状态。

- SUCCESS：成功
- FAILED：失败
- RUNNING：运行中
     */
    public String getApplyState() {
        return this.ApplyState;
    }

    /**
     * Set 防火墙模板应用状态。

- SUCCESS：成功
- FAILED：失败
- RUNNING：运行中
     * @param ApplyState 防火墙模板应用状态。

- SUCCESS：成功
- FAILED：失败
- RUNNING：运行中
     */
    public void setApplyState(String ApplyState) {
        this.ApplyState = ApplyState;
    }

    /**
     * Get 防火墙模板应用错误信息。 
     * @return ErrorMessage 防火墙模板应用错误信息。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 防火墙模板应用错误信息。
     * @param ErrorMessage 防火墙模板应用错误信息。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public FirewallTemplateApplyRecordDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FirewallTemplateApplyRecordDetail(FirewallTemplateApplyRecordDetail source) {
        if (source.Instance != null) {
            this.Instance = new InstanceIdentifier(source.Instance);
        }
        if (source.ApplyState != null) {
            this.ApplyState = new String(source.ApplyState);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Instance.", this.Instance);
        this.setParamSimple(map, prefix + "ApplyState", this.ApplyState);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

