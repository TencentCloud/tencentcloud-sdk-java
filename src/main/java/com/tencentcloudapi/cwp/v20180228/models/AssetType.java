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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetType extends AbstractModel {

    /**
    * 类型ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 类型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 类型ID 
     * @return Id 类型ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 类型ID
     * @param Id 类型ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 类型名称 
     * @return Name 类型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 类型名称
     * @param Name 类型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public AssetType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetType(AssetType source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

