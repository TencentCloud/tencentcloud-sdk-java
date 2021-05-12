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

public class UseRange extends AbstractModel{

    /**
    * 用途id
    */
    @SerializedName("UseRangeId")
    @Expose
    private Long UseRangeId;

    /**
    * 用途范围名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 用途id 
     * @return UseRangeId 用途id
     */
    public Long getUseRangeId() {
        return this.UseRangeId;
    }

    /**
     * Set 用途id
     * @param UseRangeId 用途id
     */
    public void setUseRangeId(Long UseRangeId) {
        this.UseRangeId = UseRangeId;
    }

    /**
     * Get 用途范围名称 
     * @return Name 用途范围名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用途范围名称
     * @param Name 用途范围名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public UseRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UseRange(UseRange source) {
        if (source.UseRangeId != null) {
            this.UseRangeId = new Long(source.UseRangeId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UseRangeId", this.UseRangeId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

