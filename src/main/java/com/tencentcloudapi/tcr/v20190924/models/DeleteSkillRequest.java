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

public class DeleteSkillRequest extends AbstractModel {

    /**
    * <p>TCR实例ID</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>删除技能列表</p>
    */
    @SerializedName("Items")
    @Expose
    private SkillType [] Items;

    /**
     * Get <p>TCR实例ID</p> 
     * @return RegistryId <p>TCR实例ID</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>TCR实例ID</p>
     * @param RegistryId <p>TCR实例ID</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>删除技能列表</p> 
     * @return Items <p>删除技能列表</p>
     */
    public SkillType [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>删除技能列表</p>
     * @param Items <p>删除技能列表</p>
     */
    public void setItems(SkillType [] Items) {
        this.Items = Items;
    }

    public DeleteSkillRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSkillRequest(DeleteSkillRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Items != null) {
            this.Items = new SkillType[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new SkillType(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

