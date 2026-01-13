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
    * 镜像地址
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 镜像 Digest
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * 镜像仓库类型：`enterprise`、`personal`。
    */
    @SerializedName("ImageRegistryType")
    @Expose
    private String ImageRegistryType;

    /**
    * 镜像预热状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 镜像预热状态描述
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像地址 
     * @return Image 镜像地址
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 镜像地址
     * @param Image 镜像地址
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 镜像 Digest 
     * @return ImageDigest 镜像 Digest
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set 镜像 Digest
     * @param ImageDigest 镜像 Digest
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
    }

    /**
     * Get 镜像仓库类型：`enterprise`、`personal`。 
     * @return ImageRegistryType 镜像仓库类型：`enterprise`、`personal`。
     */
    public String getImageRegistryType() {
        return this.ImageRegistryType;
    }

    /**
     * Set 镜像仓库类型：`enterprise`、`personal`。
     * @param ImageRegistryType 镜像仓库类型：`enterprise`、`personal`。
     */
    public void setImageRegistryType(String ImageRegistryType) {
        this.ImageRegistryType = ImageRegistryType;
    }

    /**
     * Get 镜像预热状态 
     * @return Status 镜像预热状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 镜像预热状态
     * @param Status 镜像预热状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 镜像预热状态描述 
     * @return Message 镜像预热状态描述
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 镜像预热状态描述
     * @param Message 镜像预热状态描述
     */
    public void setMessage(String Message) {
        this.Message = Message;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

