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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetMostSuitableImageCacheResponse extends AbstractModel{

    /**
    * 是否有匹配的镜像缓存
    */
    @SerializedName("Found")
    @Expose
    private Boolean Found;

    /**
    * 匹配的镜像缓存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageCache")
    @Expose
    private ImageCache ImageCache;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否有匹配的镜像缓存 
     * @return Found 是否有匹配的镜像缓存
     */
    public Boolean getFound() {
        return this.Found;
    }

    /**
     * Set 是否有匹配的镜像缓存
     * @param Found 是否有匹配的镜像缓存
     */
    public void setFound(Boolean Found) {
        this.Found = Found;
    }

    /**
     * Get 匹配的镜像缓存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageCache 匹配的镜像缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageCache getImageCache() {
        return this.ImageCache;
    }

    /**
     * Set 匹配的镜像缓存
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageCache 匹配的镜像缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageCache(ImageCache ImageCache) {
        this.ImageCache = ImageCache;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetMostSuitableImageCacheResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetMostSuitableImageCacheResponse(GetMostSuitableImageCacheResponse source) {
        if (source.Found != null) {
            this.Found = new Boolean(source.Found);
        }
        if (source.ImageCache != null) {
            this.ImageCache = new ImageCache(source.ImageCache);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Found", this.Found);
        this.setParamObj(map, prefix + "ImageCache.", this.ImageCache);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

