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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudStorageAIServiceCallbackRequest extends AbstractModel {

    /**
    * 产品 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 推送类型。可选值：
- `http`：HTTP 回调
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * HTTP 回调 URL
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * HTTP 回调鉴权 Token
    */
    @SerializedName("CallbackToken")
    @Expose
    private String CallbackToken;

    /**
     * Get 产品 ID 
     * @return ProductId 产品 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID
     * @param ProductId 产品 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 推送类型。可选值：
- `http`：HTTP 回调 
     * @return Type 推送类型。可选值：
- `http`：HTTP 回调
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 推送类型。可选值：
- `http`：HTTP 回调
     * @param Type 推送类型。可选值：
- `http`：HTTP 回调
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get HTTP 回调 URL 
     * @return CallbackUrl HTTP 回调 URL
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set HTTP 回调 URL
     * @param CallbackUrl HTTP 回调 URL
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get HTTP 回调鉴权 Token 
     * @return CallbackToken HTTP 回调鉴权 Token
     */
    public String getCallbackToken() {
        return this.CallbackToken;
    }

    /**
     * Set HTTP 回调鉴权 Token
     * @param CallbackToken HTTP 回调鉴权 Token
     */
    public void setCallbackToken(String CallbackToken) {
        this.CallbackToken = CallbackToken;
    }

    public ModifyCloudStorageAIServiceCallbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudStorageAIServiceCallbackRequest(ModifyCloudStorageAIServiceCallbackRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.CallbackToken != null) {
            this.CallbackToken = new String(source.CallbackToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "CallbackToken", this.CallbackToken);

    }
}

