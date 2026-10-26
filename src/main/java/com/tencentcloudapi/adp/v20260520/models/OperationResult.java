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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationResult extends AbstractModel {

    /**
    * 资源 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 失败原因（succeeded=false 时填充）
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 是否成功
    */
    @SerializedName("Succeeded")
    @Expose
    private Boolean Succeeded;

    /**
     * Get 资源 ID 
     * @return Id 资源 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源 ID
     * @param Id 资源 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 失败原因（succeeded=false 时填充） 
     * @return Reason 失败原因（succeeded=false 时填充）
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 失败原因（succeeded=false 时填充）
     * @param Reason 失败原因（succeeded=false 时填充）
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 是否成功 
     * @return Succeeded 是否成功
     */
    public Boolean getSucceeded() {
        return this.Succeeded;
    }

    /**
     * Set 是否成功
     * @param Succeeded 是否成功
     */
    public void setSucceeded(Boolean Succeeded) {
        this.Succeeded = Succeeded;
    }

    public OperationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationResult(OperationResult source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Succeeded != null) {
            this.Succeeded = new Boolean(source.Succeeded);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Succeeded", this.Succeeded);

    }
}

