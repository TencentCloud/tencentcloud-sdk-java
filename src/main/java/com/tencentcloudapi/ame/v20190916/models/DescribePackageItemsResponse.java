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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePackageItemsResponse extends AbstractModel{

    /**
    * 已核销歌曲信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageItems")
    @Expose
    private PackageItem [] PackageItems;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 已核销歌曲信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageItems 已核销歌曲信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PackageItem [] getPackageItems() {
        return this.PackageItems;
    }

    /**
     * Set 已核销歌曲信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageItems 已核销歌曲信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageItems(PackageItem [] PackageItems) {
        this.PackageItems = PackageItems;
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

    public DescribePackageItemsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePackageItemsResponse(DescribePackageItemsResponse source) {
        if (source.PackageItems != null) {
            this.PackageItems = new PackageItem[source.PackageItems.length];
            for (int i = 0; i < source.PackageItems.length; i++) {
                this.PackageItems[i] = new PackageItem(source.PackageItems[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PackageItems.", this.PackageItems);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

