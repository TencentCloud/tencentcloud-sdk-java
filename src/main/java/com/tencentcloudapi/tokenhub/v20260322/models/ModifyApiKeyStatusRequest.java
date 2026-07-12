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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApiKeyStatusRequest extends AbstractModel {

    /**
    * <p>API 密钥 ID。</p>
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * <p>平台类型。取值：maas。</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>状态。取值：enable（启用）、disable（禁用）。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>API 密钥 ID。</p> 
     * @return ApiKeyId <p>API 密钥 ID。</p>
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set <p>API 密钥 ID。</p>
     * @param ApiKeyId <p>API 密钥 ID。</p>
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get <p>平台类型。取值：maas。</p> 
     * @return Platform <p>平台类型。取值：maas。</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>平台类型。取值：maas。</p>
     * @param Platform <p>平台类型。取值：maas。</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>状态。取值：enable（启用）、disable（禁用）。</p> 
     * @return Status <p>状态。取值：enable（启用）、disable（禁用）。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态。取值：enable（启用）、disable（禁用）。</p>
     * @param Status <p>状态。取值：enable（启用）、disable（禁用）。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyApiKeyStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApiKeyStatusRequest(ModifyApiKeyStatusRequest source) {
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

