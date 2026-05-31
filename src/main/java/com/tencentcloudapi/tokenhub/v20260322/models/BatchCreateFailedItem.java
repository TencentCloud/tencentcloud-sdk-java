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

public class BatchCreateFailedItem extends AbstractModel {

    /**
    * 失败项的序号（从 1 开始，对应后缀编号）。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 失败项的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 失败原因。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 失败项的序号（从 1 开始，对应后缀编号）。 
     * @return Index 失败项的序号（从 1 开始，对应后缀编号）。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 失败项的序号（从 1 开始，对应后缀编号）。
     * @param Index 失败项的序号（从 1 开始，对应后缀编号）。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 失败项的名称。 
     * @return Name 失败项的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 失败项的名称。
     * @param Name 失败项的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 失败原因。 
     * @return Reason 失败原因。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 失败原因。
     * @param Reason 失败原因。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public BatchCreateFailedItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateFailedItem(BatchCreateFailedItem source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

