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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRollOutSequenceRequest extends AbstractModel {

    /**
    * 发布序列名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 发布序列步骤
    */
    @SerializedName("SequenceFlows")
    @Expose
    private SequenceFlow [] SequenceFlows;

    /**
    * 是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get 发布序列名称 
     * @return Name 发布序列名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 发布序列名称
     * @param Name 发布序列名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 发布序列步骤 
     * @return SequenceFlows 发布序列步骤
     */
    public SequenceFlow [] getSequenceFlows() {
        return this.SequenceFlows;
    }

    /**
     * Set 发布序列步骤
     * @param SequenceFlows 发布序列步骤
     */
    public void setSequenceFlows(SequenceFlow [] SequenceFlows) {
        this.SequenceFlows = SequenceFlows;
    }

    /**
     * Get 是否启用 
     * @return Enabled 是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public CreateRollOutSequenceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRollOutSequenceRequest(CreateRollOutSequenceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SequenceFlows != null) {
            this.SequenceFlows = new SequenceFlow[source.SequenceFlows.length];
            for (int i = 0; i < source.SequenceFlows.length; i++) {
                this.SequenceFlows[i] = new SequenceFlow(source.SequenceFlows[i]);
            }
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SequenceFlows.", this.SequenceFlows);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

