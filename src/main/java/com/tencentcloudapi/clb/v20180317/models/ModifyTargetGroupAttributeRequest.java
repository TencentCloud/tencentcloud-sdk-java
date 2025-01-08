/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class ModifyTargetGroupAttributeRequest extends AbstractModel {

    /**
    * 目标组的ID。
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 目标组的新名称。
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * 目标组的新默认端口。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 后端服务默认权重。
<ul>
    <li>取值范围[0, 100]</li>
    <li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li> 
</ul>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 目标组的ID。 
     * @return TargetGroupId 目标组的ID。
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组的ID。
     * @param TargetGroupId 目标组的ID。
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 目标组的新名称。 
     * @return TargetGroupName 目标组的新名称。
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set 目标组的新名称。
     * @param TargetGroupName 目标组的新名称。
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get 目标组的新默认端口。 
     * @return Port 目标组的新默认端口。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 目标组的新默认端口。
     * @param Port 目标组的新默认端口。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 后端服务默认权重。
<ul>
    <li>取值范围[0, 100]</li>
    <li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li> 
</ul> 
     * @return Weight 后端服务默认权重。
<ul>
    <li>取值范围[0, 100]</li>
    <li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li> 
</ul>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 后端服务默认权重。
<ul>
    <li>取值范围[0, 100]</li>
    <li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li> 
</ul>
     * @param Weight 后端服务默认权重。
<ul>
    <li>取值范围[0, 100]</li>
    <li>设置该值后，添加后端服务到目标组时， 若后端服务不单独设置权重， 则使用这里的默认权重。 </li> 
</ul>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public ModifyTargetGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTargetGroupAttributeRequest(ModifyTargetGroupAttributeRequest source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

