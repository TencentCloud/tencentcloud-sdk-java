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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePreCacheImageTaskResponse extends AbstractModel {

    /**
    * <p>镜像地址</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>镜像 Digest</p>
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * <p>镜像仓库类型：<code>enterprise</code>、<code>personal</code>。</p>
    */
    @SerializedName("ImageRegistryType")
    @Expose
    private String ImageRegistryType;

    /**
    * <p>镜像预热状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>镜像预热状态描述</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>镜像预热创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>镜像预热ID</p>
    */
    @SerializedName("PreCacheImageId")
    @Expose
    private String PreCacheImageId;

    /**
    * <p>镜像预热资源的来源类型，取值为 EXPLICIT、AUTO</p><p>枚举值：</p><ul><li>EXPLICIT： 手动创建</li><li>AUTO： 自动创建</li><li>TCR_AUTO： TCR自动预热</li></ul>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>镜像预热存储大小</p><p>单位：Byte</p>
    */
    @SerializedName("CachedImageSizeBytes")
    @Expose
    private Long CachedImageSizeBytes;

    /**
    * <p>该预热镜像最近一次被沙箱实例使用时间</p>
    */
    @SerializedName("LastUsedTime")
    @Expose
    private String LastUsedTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>镜像地址</p> 
     * @return Image <p>镜像地址</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>镜像地址</p>
     * @param Image <p>镜像地址</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>镜像 Digest</p> 
     * @return ImageDigest <p>镜像 Digest</p>
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set <p>镜像 Digest</p>
     * @param ImageDigest <p>镜像 Digest</p>
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
    }

    /**
     * Get <p>镜像仓库类型：<code>enterprise</code>、<code>personal</code>。</p> 
     * @return ImageRegistryType <p>镜像仓库类型：<code>enterprise</code>、<code>personal</code>。</p>
     */
    public String getImageRegistryType() {
        return this.ImageRegistryType;
    }

    /**
     * Set <p>镜像仓库类型：<code>enterprise</code>、<code>personal</code>。</p>
     * @param ImageRegistryType <p>镜像仓库类型：<code>enterprise</code>、<code>personal</code>。</p>
     */
    public void setImageRegistryType(String ImageRegistryType) {
        this.ImageRegistryType = ImageRegistryType;
    }

    /**
     * Get <p>镜像预热状态</p> 
     * @return Status <p>镜像预热状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>镜像预热状态</p>
     * @param Status <p>镜像预热状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>镜像预热状态描述</p> 
     * @return Message <p>镜像预热状态描述</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>镜像预热状态描述</p>
     * @param Message <p>镜像预热状态描述</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>镜像预热创建时间</p> 
     * @return CreateTime <p>镜像预热创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>镜像预热创建时间</p>
     * @param CreateTime <p>镜像预热创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>镜像预热ID</p> 
     * @return PreCacheImageId <p>镜像预热ID</p>
     */
    public String getPreCacheImageId() {
        return this.PreCacheImageId;
    }

    /**
     * Set <p>镜像预热ID</p>
     * @param PreCacheImageId <p>镜像预热ID</p>
     */
    public void setPreCacheImageId(String PreCacheImageId) {
        this.PreCacheImageId = PreCacheImageId;
    }

    /**
     * Get <p>镜像预热资源的来源类型，取值为 EXPLICIT、AUTO</p><p>枚举值：</p><ul><li>EXPLICIT： 手动创建</li><li>AUTO： 自动创建</li><li>TCR_AUTO： TCR自动预热</li></ul> 
     * @return SourceType <p>镜像预热资源的来源类型，取值为 EXPLICIT、AUTO</p><p>枚举值：</p><ul><li>EXPLICIT： 手动创建</li><li>AUTO： 自动创建</li><li>TCR_AUTO： TCR自动预热</li></ul>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>镜像预热资源的来源类型，取值为 EXPLICIT、AUTO</p><p>枚举值：</p><ul><li>EXPLICIT： 手动创建</li><li>AUTO： 自动创建</li><li>TCR_AUTO： TCR自动预热</li></ul>
     * @param SourceType <p>镜像预热资源的来源类型，取值为 EXPLICIT、AUTO</p><p>枚举值：</p><ul><li>EXPLICIT： 手动创建</li><li>AUTO： 自动创建</li><li>TCR_AUTO： TCR自动预热</li></ul>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>镜像预热存储大小</p><p>单位：Byte</p> 
     * @return CachedImageSizeBytes <p>镜像预热存储大小</p><p>单位：Byte</p>
     */
    public Long getCachedImageSizeBytes() {
        return this.CachedImageSizeBytes;
    }

    /**
     * Set <p>镜像预热存储大小</p><p>单位：Byte</p>
     * @param CachedImageSizeBytes <p>镜像预热存储大小</p><p>单位：Byte</p>
     */
    public void setCachedImageSizeBytes(Long CachedImageSizeBytes) {
        this.CachedImageSizeBytes = CachedImageSizeBytes;
    }

    /**
     * Get <p>该预热镜像最近一次被沙箱实例使用时间</p> 
     * @return LastUsedTime <p>该预热镜像最近一次被沙箱实例使用时间</p>
     */
    public String getLastUsedTime() {
        return this.LastUsedTime;
    }

    /**
     * Set <p>该预热镜像最近一次被沙箱实例使用时间</p>
     * @param LastUsedTime <p>该预热镜像最近一次被沙箱实例使用时间</p>
     */
    public void setLastUsedTime(String LastUsedTime) {
        this.LastUsedTime = LastUsedTime;
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

    public DescribePreCacheImageTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePreCacheImageTaskResponse(DescribePreCacheImageTaskResponse source) {
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ImageDigest != null) {
            this.ImageDigest = new String(source.ImageDigest);
        }
        if (source.ImageRegistryType != null) {
            this.ImageRegistryType = new String(source.ImageRegistryType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PreCacheImageId != null) {
            this.PreCacheImageId = new String(source.PreCacheImageId);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.CachedImageSizeBytes != null) {
            this.CachedImageSizeBytes = new Long(source.CachedImageSizeBytes);
        }
        if (source.LastUsedTime != null) {
            this.LastUsedTime = new String(source.LastUsedTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ImageDigest", this.ImageDigest);
        this.setParamSimple(map, prefix + "ImageRegistryType", this.ImageRegistryType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PreCacheImageId", this.PreCacheImageId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "CachedImageSizeBytes", this.CachedImageSizeBytes);
        this.setParamSimple(map, prefix + "LastUsedTime", this.LastUsedTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

