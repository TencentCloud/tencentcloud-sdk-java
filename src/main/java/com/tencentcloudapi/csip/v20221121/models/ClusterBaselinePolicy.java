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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterBaselinePolicy extends AbstractModel {

    /**
    * <p>基线策略 ID。</p>
    */
    @SerializedName("PolicyID")
    @Expose
    private Long PolicyID;

    /**
    * <p>基线策略名称。</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>检测资产类型。<br>枚举值：<br>HOST：主机<br>CLUSTER：容器集群</p>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
    * <p>基线系统父分类 ID。</p>
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * <p>是否为系统基线策略。true 表示系统策略，false 表示自定义策略。</p>
    */
    @SerializedName("IsSystem")
    @Expose
    private Boolean IsSystem;

    /**
     * Get <p>基线策略 ID。</p> 
     * @return PolicyID <p>基线策略 ID。</p>
     */
    public Long getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>基线策略 ID。</p>
     * @param PolicyID <p>基线策略 ID。</p>
     */
    public void setPolicyID(Long PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get <p>基线策略名称。</p> 
     * @return PolicyName <p>基线策略名称。</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>基线策略名称。</p>
     * @param PolicyName <p>基线策略名称。</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>检测资产类型。<br>枚举值：<br>HOST：主机<br>CLUSTER：容器集群</p> 
     * @return CheckAssetType <p>检测资产类型。<br>枚举值：<br>HOST：主机<br>CLUSTER：容器集群</p>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>检测资产类型。<br>枚举值：<br>HOST：主机<br>CLUSTER：容器集群</p>
     * @param CheckAssetType <p>检测资产类型。<br>枚举值：<br>HOST：主机<br>CLUSTER：容器集群</p>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    /**
     * Get <p>基线系统父分类 ID。</p> 
     * @return ParentCategoryID <p>基线系统父分类 ID。</p>
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set <p>基线系统父分类 ID。</p>
     * @param ParentCategoryID <p>基线系统父分类 ID。</p>
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get <p>是否为系统基线策略。true 表示系统策略，false 表示自定义策略。</p> 
     * @return IsSystem <p>是否为系统基线策略。true 表示系统策略，false 表示自定义策略。</p>
     */
    public Boolean getIsSystem() {
        return this.IsSystem;
    }

    /**
     * Set <p>是否为系统基线策略。true 表示系统策略，false 表示自定义策略。</p>
     * @param IsSystem <p>是否为系统基线策略。true 表示系统策略，false 表示自定义策略。</p>
     */
    public void setIsSystem(Boolean IsSystem) {
        this.IsSystem = IsSystem;
    }

    public ClusterBaselinePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterBaselinePolicy(ClusterBaselinePolicy source) {
        if (source.PolicyID != null) {
            this.PolicyID = new Long(source.PolicyID);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.IsSystem != null) {
            this.IsSystem = new Boolean(source.IsSystem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyID", this.PolicyID);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamSimple(map, prefix + "IsSystem", this.IsSystem);

    }
}

