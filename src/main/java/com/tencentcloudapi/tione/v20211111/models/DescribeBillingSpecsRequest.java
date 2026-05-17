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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingSpecsRequest extends AbstractModel {

    /**
    * <p>付费模式：POSTPAID_BY_HOUR按量计费、PREPAID包年包月</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>枚举值：空、TRAIN、NOTEBOOK、INFERENCE或EMS</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>资源类型：[&quot;&quot;, &quot;CALC&quot;, &quot;CPU&quot;, &quot;GPU&quot;, &quot;GPU-SW&quot;]</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get <p>付费模式：POSTPAID_BY_HOUR按量计费、PREPAID包年包月</p> 
     * @return ChargeType <p>付费模式：POSTPAID_BY_HOUR按量计费、PREPAID包年包月</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>付费模式：POSTPAID_BY_HOUR按量计费、PREPAID包年包月</p>
     * @param ChargeType <p>付费模式：POSTPAID_BY_HOUR按量计费、PREPAID包年包月</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>枚举值：空、TRAIN、NOTEBOOK、INFERENCE或EMS</p> 
     * @return TaskType <p>枚举值：空、TRAIN、NOTEBOOK、INFERENCE或EMS</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>枚举值：空、TRAIN、NOTEBOOK、INFERENCE或EMS</p>
     * @param TaskType <p>枚举值：空、TRAIN、NOTEBOOK、INFERENCE或EMS</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>资源类型：[&quot;&quot;, &quot;CALC&quot;, &quot;CPU&quot;, &quot;GPU&quot;, &quot;GPU-SW&quot;]</p> 
     * @return ResourceType <p>资源类型：[&quot;&quot;, &quot;CALC&quot;, &quot;CPU&quot;, &quot;GPU&quot;, &quot;GPU-SW&quot;]</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型：[&quot;&quot;, &quot;CALC&quot;, &quot;CPU&quot;, &quot;GPU&quot;, &quot;GPU-SW&quot;]</p>
     * @param ResourceType <p>资源类型：[&quot;&quot;, &quot;CALC&quot;, &quot;CPU&quot;, &quot;GPU&quot;, &quot;GPU-SW&quot;]</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public DescribeBillingSpecsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingSpecsRequest(DescribeBillingSpecsRequest source) {
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

