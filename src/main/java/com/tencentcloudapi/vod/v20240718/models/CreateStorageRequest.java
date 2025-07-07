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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStorageRequest extends AbstractModel {

    /**
    * <b>点播专业版[应用](/document/product/266/14574) ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 存储地域，必须是系统支持地域。
通过 [DescribeStorageRegions](https://cloud.tencent.com/document/product/266/72480) 接口可以查询到所有存储地域及已经开通存储桶的地域。
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 存储名称。
<li>仅支持小写英文字母、数字、中划线 “-” 及其组合；</li>
<li>存储命名不能以 “-” 开头或结尾；</li>
<li>存储命名最大长度为 64 字符。</li>
    */
    @SerializedName("StorageName")
    @Expose
    private String StorageName;

    /**
     * Get <b>点播专业版[应用](/document/product/266/14574) ID。</b> 
     * @return SubAppId <b>点播专业版[应用](/document/product/266/14574) ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播专业版[应用](/document/product/266/14574) ID。</b>
     * @param SubAppId <b>点播专业版[应用](/document/product/266/14574) ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 存储地域，必须是系统支持地域。
通过 [DescribeStorageRegions](https://cloud.tencent.com/document/product/266/72480) 接口可以查询到所有存储地域及已经开通存储桶的地域。 
     * @return StorageRegion 存储地域，必须是系统支持地域。
通过 [DescribeStorageRegions](https://cloud.tencent.com/document/product/266/72480) 接口可以查询到所有存储地域及已经开通存储桶的地域。
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 存储地域，必须是系统支持地域。
通过 [DescribeStorageRegions](https://cloud.tencent.com/document/product/266/72480) 接口可以查询到所有存储地域及已经开通存储桶的地域。
     * @param StorageRegion 存储地域，必须是系统支持地域。
通过 [DescribeStorageRegions](https://cloud.tencent.com/document/product/266/72480) 接口可以查询到所有存储地域及已经开通存储桶的地域。
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get 存储名称。
<li>仅支持小写英文字母、数字、中划线 “-” 及其组合；</li>
<li>存储命名不能以 “-” 开头或结尾；</li>
<li>存储命名最大长度为 64 字符。</li> 
     * @return StorageName 存储名称。
<li>仅支持小写英文字母、数字、中划线 “-” 及其组合；</li>
<li>存储命名不能以 “-” 开头或结尾；</li>
<li>存储命名最大长度为 64 字符。</li>
     */
    public String getStorageName() {
        return this.StorageName;
    }

    /**
     * Set 存储名称。
<li>仅支持小写英文字母、数字、中划线 “-” 及其组合；</li>
<li>存储命名不能以 “-” 开头或结尾；</li>
<li>存储命名最大长度为 64 字符。</li>
     * @param StorageName 存储名称。
<li>仅支持小写英文字母、数字、中划线 “-” 及其组合；</li>
<li>存储命名不能以 “-” 开头或结尾；</li>
<li>存储命名最大长度为 64 字符。</li>
     */
    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    public CreateStorageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStorageRequest(CreateStorageRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.StorageName != null) {
            this.StorageName = new String(source.StorageName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "StorageName", this.StorageName);

    }
}

