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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBCustomDisasterRecoverGroupAttributeRequest extends AbstractModel {

    /**
    * <p>置放群组ID</p>
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * <p>置放群组名称</p><p>入参限制：长度1-60个字符，支持中、英文</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>置放群组的亲和度，在置放群组的节点会按该亲和度分布</p><p>取值范围：[1, 10]</p>
    */
    @SerializedName("Affinity")
    @Expose
    private Long Affinity;

    /**
     * Get <p>置放群组ID</p> 
     * @return DisasterRecoverGroupId <p>置放群组ID</p>
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set <p>置放群组ID</p>
     * @param DisasterRecoverGroupId <p>置放群组ID</p>
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get <p>置放群组名称</p><p>入参限制：长度1-60个字符，支持中、英文</p> 
     * @return Name <p>置放群组名称</p><p>入参限制：长度1-60个字符，支持中、英文</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>置放群组名称</p><p>入参限制：长度1-60个字符，支持中、英文</p>
     * @param Name <p>置放群组名称</p><p>入参限制：长度1-60个字符，支持中、英文</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>置放群组的亲和度，在置放群组的节点会按该亲和度分布</p><p>取值范围：[1, 10]</p> 
     * @return Affinity <p>置放群组的亲和度，在置放群组的节点会按该亲和度分布</p><p>取值范围：[1, 10]</p>
     */
    public Long getAffinity() {
        return this.Affinity;
    }

    /**
     * Set <p>置放群组的亲和度，在置放群组的节点会按该亲和度分布</p><p>取值范围：[1, 10]</p>
     * @param Affinity <p>置放群组的亲和度，在置放群组的节点会按该亲和度分布</p><p>取值范围：[1, 10]</p>
     */
    public void setAffinity(Long Affinity) {
        this.Affinity = Affinity;
    }

    public ModifyDBCustomDisasterRecoverGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBCustomDisasterRecoverGroupAttributeRequest(ModifyDBCustomDisasterRecoverGroupAttributeRequest source) {
        if (source.DisasterRecoverGroupId != null) {
            this.DisasterRecoverGroupId = new String(source.DisasterRecoverGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Affinity != null) {
            this.Affinity = new Long(source.Affinity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Affinity", this.Affinity);

    }
}

