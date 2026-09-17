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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourcePackageInfo extends AbstractModel {

    /**
    * <p>套餐类型</p><p>枚举值：</p><ul><li>1： 免费版</li><li>2： 专业版</li><li>3： 企业版</li></ul>
    */
    @SerializedName("PackageType")
    @Expose
    private Long PackageType;

    /**
    * <p>资源包总量</p>
    */
    @SerializedName("ResourceTotal")
    @Expose
    private Long ResourceTotal;

    /**
    * <p>资源包用量</p>
    */
    @SerializedName("ResourceUsage")
    @Expose
    private Float ResourceUsage;

    /**
    * <p>知识库容量</p>
    */
    @SerializedName("KnowledgeCapacity")
    @Expose
    private Float KnowledgeCapacity;

    /**
    * <p>知识库用量</p>
    */
    @SerializedName("KnowledgeUsage")
    @Expose
    private Float KnowledgeUsage;

    /**
    * <p>资源包状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>3： 已到期</li><li>4： 即将到期</li></ul>
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
     * Get <p>套餐类型</p><p>枚举值：</p><ul><li>1： 免费版</li><li>2： 专业版</li><li>3： 企业版</li></ul> 
     * @return PackageType <p>套餐类型</p><p>枚举值：</p><ul><li>1： 免费版</li><li>2： 专业版</li><li>3： 企业版</li></ul>
     */
    public Long getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>套餐类型</p><p>枚举值：</p><ul><li>1： 免费版</li><li>2： 专业版</li><li>3： 企业版</li></ul>
     * @param PackageType <p>套餐类型</p><p>枚举值：</p><ul><li>1： 免费版</li><li>2： 专业版</li><li>3： 企业版</li></ul>
     */
    public void setPackageType(Long PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get <p>资源包总量</p> 
     * @return ResourceTotal <p>资源包总量</p>
     */
    public Long getResourceTotal() {
        return this.ResourceTotal;
    }

    /**
     * Set <p>资源包总量</p>
     * @param ResourceTotal <p>资源包总量</p>
     */
    public void setResourceTotal(Long ResourceTotal) {
        this.ResourceTotal = ResourceTotal;
    }

    /**
     * Get <p>资源包用量</p> 
     * @return ResourceUsage <p>资源包用量</p>
     */
    public Float getResourceUsage() {
        return this.ResourceUsage;
    }

    /**
     * Set <p>资源包用量</p>
     * @param ResourceUsage <p>资源包用量</p>
     */
    public void setResourceUsage(Float ResourceUsage) {
        this.ResourceUsage = ResourceUsage;
    }

    /**
     * Get <p>知识库容量</p> 
     * @return KnowledgeCapacity <p>知识库容量</p>
     */
    public Float getKnowledgeCapacity() {
        return this.KnowledgeCapacity;
    }

    /**
     * Set <p>知识库容量</p>
     * @param KnowledgeCapacity <p>知识库容量</p>
     */
    public void setKnowledgeCapacity(Float KnowledgeCapacity) {
        this.KnowledgeCapacity = KnowledgeCapacity;
    }

    /**
     * Get <p>知识库用量</p> 
     * @return KnowledgeUsage <p>知识库用量</p>
     */
    public Float getKnowledgeUsage() {
        return this.KnowledgeUsage;
    }

    /**
     * Set <p>知识库用量</p>
     * @param KnowledgeUsage <p>知识库用量</p>
     */
    public void setKnowledgeUsage(Float KnowledgeUsage) {
        this.KnowledgeUsage = KnowledgeUsage;
    }

    /**
     * Get <p>资源包状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>3： 已到期</li><li>4： 即将到期</li></ul> 
     * @return ResourceStatus <p>资源包状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>3： 已到期</li><li>4： 即将到期</li></ul>
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set <p>资源包状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>3： 已到期</li><li>4： 即将到期</li></ul>
     * @param ResourceStatus <p>资源包状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>3： 已到期</li><li>4： 即将到期</li></ul>
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    public ResourcePackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourcePackageInfo(ResourcePackageInfo source) {
        if (source.PackageType != null) {
            this.PackageType = new Long(source.PackageType);
        }
        if (source.ResourceTotal != null) {
            this.ResourceTotal = new Long(source.ResourceTotal);
        }
        if (source.ResourceUsage != null) {
            this.ResourceUsage = new Float(source.ResourceUsage);
        }
        if (source.KnowledgeCapacity != null) {
            this.KnowledgeCapacity = new Float(source.KnowledgeCapacity);
        }
        if (source.KnowledgeUsage != null) {
            this.KnowledgeUsage = new Float(source.KnowledgeUsage);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "ResourceTotal", this.ResourceTotal);
        this.setParamSimple(map, prefix + "ResourceUsage", this.ResourceUsage);
        this.setParamSimple(map, prefix + "KnowledgeCapacity", this.KnowledgeCapacity);
        this.setParamSimple(map, prefix + "KnowledgeUsage", this.KnowledgeUsage);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);

    }
}

