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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMountInstanceRequest extends AbstractModel {

    /**
    * 数据源类型英文名
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 存储实例ID
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
     * Get 数据源类型英文名 
     * @return Type 数据源类型英文名
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据源类型英文名
     * @param Type 数据源类型英文名
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 存储实例ID 
     * @return StorageId 存储实例ID
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set 存储实例ID
     * @param StorageId 存储实例ID
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    public DescribeMountInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMountInstanceRequest(DescribeMountInstanceRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);

    }
}

