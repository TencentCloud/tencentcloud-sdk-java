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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListStoragesRequest extends AbstractModel {

    /**
    * <p>存储类型筛选：CFS / CFSTurbo / COS / GooseFS；不填表示查询所有类型</p><p>枚举值：</p><ul><li>CFS： CFS 文件.</li><li>CFSTurbo： CFS Turbo 文件.</li><li>COS ： COS Bucket.</li><li>GooseFS： GooseFS .</li></ul>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get <p>存储类型筛选：CFS / CFSTurbo / COS / GooseFS；不填表示查询所有类型</p><p>枚举值：</p><ul><li>CFS： CFS 文件.</li><li>CFSTurbo： CFS Turbo 文件.</li><li>COS ： COS Bucket.</li><li>GooseFS： GooseFS .</li></ul> 
     * @return StorageType <p>存储类型筛选：CFS / CFSTurbo / COS / GooseFS；不填表示查询所有类型</p><p>枚举值：</p><ul><li>CFS： CFS 文件.</li><li>CFSTurbo： CFS Turbo 文件.</li><li>COS ： COS Bucket.</li><li>GooseFS： GooseFS .</li></ul>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储类型筛选：CFS / CFSTurbo / COS / GooseFS；不填表示查询所有类型</p><p>枚举值：</p><ul><li>CFS： CFS 文件.</li><li>CFSTurbo： CFS Turbo 文件.</li><li>COS ： COS Bucket.</li><li>GooseFS： GooseFS .</li></ul>
     * @param StorageType <p>存储类型筛选：CFS / CFSTurbo / COS / GooseFS；不填表示查询所有类型</p><p>枚举值：</p><ul><li>CFS： CFS 文件.</li><li>CFSTurbo： CFS Turbo 文件.</li><li>COS ： COS Bucket.</li><li>GooseFS： GooseFS .</li></ul>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public ListStoragesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListStoragesRequest(ListStoragesRequest source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

