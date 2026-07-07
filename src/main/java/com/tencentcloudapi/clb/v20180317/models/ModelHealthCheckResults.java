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

public class ModelHealthCheckResults extends AbstractModel {

    /**
    * <p>BYOK的KeyID</p>
    */
    @SerializedName("ProviderKeyId")
    @Expose
    private String ProviderKeyId;

    /**
    * <p>模型</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>健康检查状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>BYOK的KeyID</p> 
     * @return ProviderKeyId <p>BYOK的KeyID</p>
     */
    public String getProviderKeyId() {
        return this.ProviderKeyId;
    }

    /**
     * Set <p>BYOK的KeyID</p>
     * @param ProviderKeyId <p>BYOK的KeyID</p>
     */
    public void setProviderKeyId(String ProviderKeyId) {
        this.ProviderKeyId = ProviderKeyId;
    }

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
     * Get <p>健康检查状态</p> 
     * @return Status <p>健康检查状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>健康检查状态</p>
     * @param Status <p>健康检查状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModelHealthCheckResults() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelHealthCheckResults(ModelHealthCheckResults source) {
        if (source.ProviderKeyId != null) {
            this.ProviderKeyId = new String(source.ProviderKeyId);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProviderKeyId", this.ProviderKeyId);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

