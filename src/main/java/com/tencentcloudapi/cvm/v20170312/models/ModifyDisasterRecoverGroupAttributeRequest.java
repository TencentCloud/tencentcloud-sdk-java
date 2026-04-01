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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDisasterRecoverGroupAttributeRequest extends AbstractModel {

    /**
    * <p>分散置放群组ID，可使用<a href="https://cloud.tencent.com/document/api/213/17810">DescribeDisasterRecoverGroups</a>接口获取。</p>
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>分散置放群组的亲和度，在置放群组的实例会按该亲和度分布，亲和度的取值范围是：1-10。</p><p>取值范围：[1, 10]</p><p>调整只能从小调到大，不能从大调到小</p>
    */
    @SerializedName("Affinity")
    @Expose
    private Long Affinity;

    /**
     * Get <p>分散置放群组ID，可使用<a href="https://cloud.tencent.com/document/api/213/17810">DescribeDisasterRecoverGroups</a>接口获取。</p> 
     * @return DisasterRecoverGroupId <p>分散置放群组ID，可使用<a href="https://cloud.tencent.com/document/api/213/17810">DescribeDisasterRecoverGroups</a>接口获取。</p>
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set <p>分散置放群组ID，可使用<a href="https://cloud.tencent.com/document/api/213/17810">DescribeDisasterRecoverGroups</a>接口获取。</p>
     * @param DisasterRecoverGroupId <p>分散置放群组ID，可使用<a href="https://cloud.tencent.com/document/api/213/17810">DescribeDisasterRecoverGroups</a>接口获取。</p>
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p> 
     * @return Name <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p>
     * @param Name <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>分散置放群组的亲和度，在置放群组的实例会按该亲和度分布，亲和度的取值范围是：1-10。</p><p>取值范围：[1, 10]</p><p>调整只能从小调到大，不能从大调到小</p> 
     * @return Affinity <p>分散置放群组的亲和度，在置放群组的实例会按该亲和度分布，亲和度的取值范围是：1-10。</p><p>取值范围：[1, 10]</p><p>调整只能从小调到大，不能从大调到小</p>
     */
    public Long getAffinity() {
        return this.Affinity;
    }

    /**
     * Set <p>分散置放群组的亲和度，在置放群组的实例会按该亲和度分布，亲和度的取值范围是：1-10。</p><p>取值范围：[1, 10]</p><p>调整只能从小调到大，不能从大调到小</p>
     * @param Affinity <p>分散置放群组的亲和度，在置放群组的实例会按该亲和度分布，亲和度的取值范围是：1-10。</p><p>取值范围：[1, 10]</p><p>调整只能从小调到大，不能从大调到小</p>
     */
    public void setAffinity(Long Affinity) {
        this.Affinity = Affinity;
    }

    public ModifyDisasterRecoverGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDisasterRecoverGroupAttributeRequest(ModifyDisasterRecoverGroupAttributeRequest source) {
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

