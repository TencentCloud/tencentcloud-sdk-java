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

public class DescribeMemoryPlusSpaceResponse extends AbstractModel {

    /**
    * <p>Memory 实例 ID。</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Memory 实例的自定义名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Memory 实例的简要描述，包括使用场景、用途或背景信息，便于日常运维识别。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>腾讯云账号的 APPID。</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Memroy 实例所属地域。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Memory 实例的标签信息。</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>Memory 实例当前运行状态。</p><ul><li>1：运行中。</li><li>2：创建中。</li><li>3：销毁中。</li><li>4：已销毁。</li><li>5：隔离中。</li><li>6：已隔离。</li><li>7：恢复中。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Memory 实例计费模式。</p><ul><li>-1：免费体验。</li><li>0：包年包月。</li><li>1：按量计费。</li></ul>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Memory 版本信息：v1。</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>Memory 当前已写入的记忆条数。</p>
    */
    @SerializedName("MemoryUsage")
    @Expose
    private Long MemoryUsage;

    /**
    * <p>Memory 实例记忆条数配额上限。</p>
    */
    @SerializedName("MemoryLimit")
    @Expose
    private Long MemoryLimit;

    /**
    * <p>Memory 实例当前 Credit 的使用数量。</p>
    */
    @SerializedName("CreditUsage")
    @Expose
    private Float CreditUsage;

    /**
    * <p>Memory 实例 Credit 的最大使用数量。</p>
    */
    @SerializedName("CreditLimit")
    @Expose
    private Float CreditLimit;

    /**
    * <p>Memory 实例的内网访问地址。</p>
    */
    @SerializedName("AccessUrl")
    @Expose
    private String AccessUrl;

    /**
    * <p>Memory 实例的外网访问地址。</p>
    */
    @SerializedName("WanAccessUrl")
    @Expose
    private String WanAccessUrl;

    /**
    * <p>Memory 实例的创建时间。</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>Memory 实例的到期时间。</p>
    */
    @SerializedName("ExpiredAt")
    @Expose
    private String ExpiredAt;

    /**
    * <p>Memory 实例的隔离时间。</p>
    */
    @SerializedName("IsolatedAt")
    @Expose
    private String IsolatedAt;

    /**
    * <p>到期销毁时间</p>
    */
    @SerializedName("DestroyAt")
    @Expose
    private String DestroyAt;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Memory 实例 ID。</p> 
     * @return SpaceId <p>Memory 实例 ID。</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Memory 实例 ID。</p>
     * @param SpaceId <p>Memory 实例 ID。</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Memory 实例的自定义名称。</p> 
     * @return Name <p>Memory 实例的自定义名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Memory 实例的自定义名称。</p>
     * @param Name <p>Memory 实例的自定义名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Memory 实例的简要描述，包括使用场景、用途或背景信息，便于日常运维识别。</p> 
     * @return Description <p>Memory 实例的简要描述，包括使用场景、用途或背景信息，便于日常运维识别。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Memory 实例的简要描述，包括使用场景、用途或背景信息，便于日常运维识别。</p>
     * @param Description <p>Memory 实例的简要描述，包括使用场景、用途或背景信息，便于日常运维识别。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>腾讯云账号的 APPID。</p> 
     * @return AppId <p>腾讯云账号的 APPID。</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>腾讯云账号的 APPID。</p>
     * @param AppId <p>腾讯云账号的 APPID。</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Memroy 实例所属地域。</p> 
     * @return Region <p>Memroy 实例所属地域。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Memroy 实例所属地域。</p>
     * @param Region <p>Memroy 实例所属地域。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Memory 实例的标签信息。</p> 
     * @return ResourceTags <p>Memory 实例的标签信息。</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>Memory 实例的标签信息。</p>
     * @param ResourceTags <p>Memory 实例的标签信息。</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Memory 实例当前运行状态。</p><ul><li>1：运行中。</li><li>2：创建中。</li><li>3：销毁中。</li><li>4：已销毁。</li><li>5：隔离中。</li><li>6：已隔离。</li><li>7：恢复中。</li></ul> 
     * @return Status <p>Memory 实例当前运行状态。</p><ul><li>1：运行中。</li><li>2：创建中。</li><li>3：销毁中。</li><li>4：已销毁。</li><li>5：隔离中。</li><li>6：已隔离。</li><li>7：恢复中。</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Memory 实例当前运行状态。</p><ul><li>1：运行中。</li><li>2：创建中。</li><li>3：销毁中。</li><li>4：已销毁。</li><li>5：隔离中。</li><li>6：已隔离。</li><li>7：恢复中。</li></ul>
     * @param Status <p>Memory 实例当前运行状态。</p><ul><li>1：运行中。</li><li>2：创建中。</li><li>3：销毁中。</li><li>4：已销毁。</li><li>5：隔离中。</li><li>6：已隔离。</li><li>7：恢复中。</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Memory 实例计费模式。</p><ul><li>-1：免费体验。</li><li>0：包年包月。</li><li>1：按量计费。</li></ul> 
     * @return PayMode <p>Memory 实例计费模式。</p><ul><li>-1：免费体验。</li><li>0：包年包月。</li><li>1：按量计费。</li></ul>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Memory 实例计费模式。</p><ul><li>-1：免费体验。</li><li>0：包年包月。</li><li>1：按量计费。</li></ul>
     * @param PayMode <p>Memory 实例计费模式。</p><ul><li>-1：免费体验。</li><li>0：包年包月。</li><li>1：按量计费。</li></ul>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Memory 版本信息：v1。</p> 
     * @return Version <p>Memory 版本信息：v1。</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>Memory 版本信息：v1。</p>
     * @param Version <p>Memory 版本信息：v1。</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>Memory 当前已写入的记忆条数。</p> 
     * @return MemoryUsage <p>Memory 当前已写入的记忆条数。</p>
     */
    public Long getMemoryUsage() {
        return this.MemoryUsage;
    }

    /**
     * Set <p>Memory 当前已写入的记忆条数。</p>
     * @param MemoryUsage <p>Memory 当前已写入的记忆条数。</p>
     */
    public void setMemoryUsage(Long MemoryUsage) {
        this.MemoryUsage = MemoryUsage;
    }

    /**
     * Get <p>Memory 实例记忆条数配额上限。</p> 
     * @return MemoryLimit <p>Memory 实例记忆条数配额上限。</p>
     */
    public Long getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set <p>Memory 实例记忆条数配额上限。</p>
     * @param MemoryLimit <p>Memory 实例记忆条数配额上限。</p>
     */
    public void setMemoryLimit(Long MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get <p>Memory 实例当前 Credit 的使用数量。</p> 
     * @return CreditUsage <p>Memory 实例当前 Credit 的使用数量。</p>
     */
    public Float getCreditUsage() {
        return this.CreditUsage;
    }

    /**
     * Set <p>Memory 实例当前 Credit 的使用数量。</p>
     * @param CreditUsage <p>Memory 实例当前 Credit 的使用数量。</p>
     */
    public void setCreditUsage(Float CreditUsage) {
        this.CreditUsage = CreditUsage;
    }

    /**
     * Get <p>Memory 实例 Credit 的最大使用数量。</p> 
     * @return CreditLimit <p>Memory 实例 Credit 的最大使用数量。</p>
     */
    public Float getCreditLimit() {
        return this.CreditLimit;
    }

    /**
     * Set <p>Memory 实例 Credit 的最大使用数量。</p>
     * @param CreditLimit <p>Memory 实例 Credit 的最大使用数量。</p>
     */
    public void setCreditLimit(Float CreditLimit) {
        this.CreditLimit = CreditLimit;
    }

    /**
     * Get <p>Memory 实例的内网访问地址。</p> 
     * @return AccessUrl <p>Memory 实例的内网访问地址。</p>
     */
    public String getAccessUrl() {
        return this.AccessUrl;
    }

    /**
     * Set <p>Memory 实例的内网访问地址。</p>
     * @param AccessUrl <p>Memory 实例的内网访问地址。</p>
     */
    public void setAccessUrl(String AccessUrl) {
        this.AccessUrl = AccessUrl;
    }

    /**
     * Get <p>Memory 实例的外网访问地址。</p> 
     * @return WanAccessUrl <p>Memory 实例的外网访问地址。</p>
     */
    public String getWanAccessUrl() {
        return this.WanAccessUrl;
    }

    /**
     * Set <p>Memory 实例的外网访问地址。</p>
     * @param WanAccessUrl <p>Memory 实例的外网访问地址。</p>
     */
    public void setWanAccessUrl(String WanAccessUrl) {
        this.WanAccessUrl = WanAccessUrl;
    }

    /**
     * Get <p>Memory 实例的创建时间。</p> 
     * @return CreatedAt <p>Memory 实例的创建时间。</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>Memory 实例的创建时间。</p>
     * @param CreatedAt <p>Memory 实例的创建时间。</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>Memory 实例的到期时间。</p> 
     * @return ExpiredAt <p>Memory 实例的到期时间。</p>
     */
    public String getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set <p>Memory 实例的到期时间。</p>
     * @param ExpiredAt <p>Memory 实例的到期时间。</p>
     */
    public void setExpiredAt(String ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    /**
     * Get <p>Memory 实例的隔离时间。</p> 
     * @return IsolatedAt <p>Memory 实例的隔离时间。</p>
     */
    public String getIsolatedAt() {
        return this.IsolatedAt;
    }

    /**
     * Set <p>Memory 实例的隔离时间。</p>
     * @param IsolatedAt <p>Memory 实例的隔离时间。</p>
     */
    public void setIsolatedAt(String IsolatedAt) {
        this.IsolatedAt = IsolatedAt;
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

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMemoryPlusSpaceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMemoryPlusSpaceResponse(DescribeMemoryPlusSpaceResponse source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.MemoryUsage != null) {
            this.MemoryUsage = new Long(source.MemoryUsage);
        }
        if (source.MemoryLimit != null) {
            this.MemoryLimit = new Long(source.MemoryLimit);
        }
        if (source.CreditUsage != null) {
            this.CreditUsage = new Float(source.CreditUsage);
        }
        if (source.CreditLimit != null) {
            this.CreditLimit = new Float(source.CreditLimit);
        }
        if (source.AccessUrl != null) {
            this.AccessUrl = new String(source.AccessUrl);
        }
        if (source.WanAccessUrl != null) {
            this.WanAccessUrl = new String(source.WanAccessUrl);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new String(source.ExpiredAt);
        }
        if (source.IsolatedAt != null) {
            this.IsolatedAt = new String(source.IsolatedAt);
        }
        if (source.DestroyAt != null) {
            this.DestroyAt = new String(source.DestroyAt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "MemoryUsage", this.MemoryUsage);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "CreditUsage", this.CreditUsage);
        this.setParamSimple(map, prefix + "CreditLimit", this.CreditLimit);
        this.setParamSimple(map, prefix + "AccessUrl", this.AccessUrl);
        this.setParamSimple(map, prefix + "WanAccessUrl", this.WanAccessUrl);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "IsolatedAt", this.IsolatedAt);
        this.setParamSimple(map, prefix + "DestroyAt", this.DestroyAt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

