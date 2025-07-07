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

public class Tag extends AbstractModel {

    /**
    * 标签ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 标签名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 服务器数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 标签ID 
     * @return Id 标签ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 标签ID
     * @param Id 标签ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 标签名 
     * @return Name 标签名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标签名
     * @param Name 标签名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 服务器数 
     * @return Count 服务器数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 服务器数
     * @param Count 服务器数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public Tag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tag(Tag source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

