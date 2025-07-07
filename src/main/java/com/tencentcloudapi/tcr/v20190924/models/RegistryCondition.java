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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegistryCondition extends AbstractModel {

    /**
    * 实例创建过程类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 实例创建过程状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 转换到该过程的简明原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 实例创建过程类型 
     * @return Type 实例创建过程类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 实例创建过程类型
     * @param Type 实例创建过程类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 实例创建过程状态 
     * @return Status 实例创建过程状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例创建过程状态
     * @param Status 实例创建过程状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 转换到该过程的简明原因 
     * @return Reason 转换到该过程的简明原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 转换到该过程的简明原因
     * @param Reason 转换到该过程的简明原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public RegistryCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegistryCondition(RegistryCondition source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

