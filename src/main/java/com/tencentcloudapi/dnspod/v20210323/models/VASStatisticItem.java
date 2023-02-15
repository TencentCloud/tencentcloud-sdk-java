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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VASStatisticItem extends AbstractModel{

    /**
    * 增值服务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 增值服务标识
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 增值服务最大用量
    */
    @SerializedName("LimitCount")
    @Expose
    private Long LimitCount;

    /**
    * 增值服务已使用的用量
    */
    @SerializedName("UseCount")
    @Expose
    private Long UseCount;

    /**
     * Get 增值服务名称 
     * @return Name 增值服务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 增值服务名称
     * @param Name 增值服务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 增值服务标识 
     * @return Key 增值服务标识
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 增值服务标识
     * @param Key 增值服务标识
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 增值服务最大用量 
     * @return LimitCount 增值服务最大用量
     */
    public Long getLimitCount() {
        return this.LimitCount;
    }

    /**
     * Set 增值服务最大用量
     * @param LimitCount 增值服务最大用量
     */
    public void setLimitCount(Long LimitCount) {
        this.LimitCount = LimitCount;
    }

    /**
     * Get 增值服务已使用的用量 
     * @return UseCount 增值服务已使用的用量
     */
    public Long getUseCount() {
        return this.UseCount;
    }

    /**
     * Set 增值服务已使用的用量
     * @param UseCount 增值服务已使用的用量
     */
    public void setUseCount(Long UseCount) {
        this.UseCount = UseCount;
    }

    public VASStatisticItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VASStatisticItem(VASStatisticItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.LimitCount != null) {
            this.LimitCount = new Long(source.LimitCount);
        }
        if (source.UseCount != null) {
            this.UseCount = new Long(source.UseCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "LimitCount", this.LimitCount);
        this.setParamSimple(map, prefix + "UseCount", this.UseCount);

    }
}

