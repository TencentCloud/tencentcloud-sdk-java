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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemoryPlusInfo extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>记忆条数</p>
    */
    @SerializedName("MemoryUsage")
    @Expose
    private Long MemoryUsage;

    /**
    * <p>当月积分数</p>
    */
    @SerializedName("CreditUsage")
    @Expose
    private Float CreditUsage;

    /**
    * <p>资源标签</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>隔离时间</p>
    */
    @SerializedName("IsolatedAt")
    @Expose
    private String IsolatedAt;

    /**
    * <p>到期时间</p>
    */
    @SerializedName("ExpiredAt")
    @Expose
    private String ExpiredAt;

    /**
    * <p>到期销毁时间</p>
    */
    @SerializedName("DestroyAt")
    @Expose
    private String DestroyAt;

    /**
     * Get <p>实例id</p> 
     * @return SpaceId <p>实例id</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>实例id</p>
     * @param SpaceId <p>实例id</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return Name <p>实例名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>实例名称</p>
     * @param Name <p>实例名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>实例状态</p> 
     * @return Status <p>实例状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态</p>
     * @param Status <p>实例状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>记忆条数</p> 
     * @return MemoryUsage <p>记忆条数</p>
     */
    public Long getMemoryUsage() {
        return this.MemoryUsage;
    }

    /**
     * Set <p>记忆条数</p>
     * @param MemoryUsage <p>记忆条数</p>
     */
    public void setMemoryUsage(Long MemoryUsage) {
        this.MemoryUsage = MemoryUsage;
    }

    /**
     * Get <p>当月积分数</p> 
     * @return CreditUsage <p>当月积分数</p>
     */
    public Float getCreditUsage() {
        return this.CreditUsage;
    }

    /**
     * Set <p>当月积分数</p>
     * @param CreditUsage <p>当月积分数</p>
     */
    public void setCreditUsage(Float CreditUsage) {
        this.CreditUsage = CreditUsage;
    }

    /**
     * Get <p>资源标签</p> 
     * @return ResourceTags <p>资源标签</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>资源标签</p>
     * @param ResourceTags <p>资源标签</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedAt <p>创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedAt <p>创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>隔离时间</p> 
     * @return IsolatedAt <p>隔离时间</p>
     */
    public String getIsolatedAt() {
        return this.IsolatedAt;
    }

    /**
     * Set <p>隔离时间</p>
     * @param IsolatedAt <p>隔离时间</p>
     */
    public void setIsolatedAt(String IsolatedAt) {
        this.IsolatedAt = IsolatedAt;
    }

    /**
     * Get <p>到期时间</p> 
     * @return ExpiredAt <p>到期时间</p>
     */
    public String getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set <p>到期时间</p>
     * @param ExpiredAt <p>到期时间</p>
     */
    public void setExpiredAt(String ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    /**
     * Get <p>到期销毁时间</p> 
     * @return DestroyAt <p>到期销毁时间</p>
     */
    public String getDestroyAt() {
        return this.DestroyAt;
    }

    /**
     * Set <p>到期销毁时间</p>
     * @param DestroyAt <p>到期销毁时间</p>
     */
    public void setDestroyAt(String DestroyAt) {
        this.DestroyAt = DestroyAt;
    }

    public MemoryPlusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemoryPlusInfo(MemoryPlusInfo source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.MemoryUsage != null) {
            this.MemoryUsage = new Long(source.MemoryUsage);
        }
        if (source.CreditUsage != null) {
            this.CreditUsage = new Float(source.CreditUsage);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.IsolatedAt != null) {
            this.IsolatedAt = new String(source.IsolatedAt);
        }
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new String(source.ExpiredAt);
        }
        if (source.DestroyAt != null) {
            this.DestroyAt = new String(source.DestroyAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "MemoryUsage", this.MemoryUsage);
        this.setParamSimple(map, prefix + "CreditUsage", this.CreditUsage);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "IsolatedAt", this.IsolatedAt);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "DestroyAt", this.DestroyAt);

    }
}

