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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductMetadata extends AbstractModel{

    /**
    * 产品创建时间
    */
    @SerializedName("CreationDate")
    @Expose
    private Long CreationDate;

    /**
    * 创建者 Uin
    */
    @SerializedName("CreateUserId")
    @Expose
    private Long CreateUserId;

    /**
    * 账号 Uin
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
     * Get 产品创建时间 
     * @return CreationDate 产品创建时间
     */
    public Long getCreationDate() {
        return this.CreationDate;
    }

    /**
     * Set 产品创建时间
     * @param CreationDate 产品创建时间
     */
    public void setCreationDate(Long CreationDate) {
        this.CreationDate = CreationDate;
    }

    /**
     * Get 创建者 Uin 
     * @return CreateUserId 创建者 Uin
     */
    public Long getCreateUserId() {
        return this.CreateUserId;
    }

    /**
     * Set 创建者 Uin
     * @param CreateUserId 创建者 Uin
     */
    public void setCreateUserId(Long CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    /**
     * Get 账号 Uin 
     * @return UserId 账号 Uin
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set 账号 Uin
     * @param UserId 账号 Uin
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    public ProductMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductMetadata(ProductMetadata source) {
        if (source.CreationDate != null) {
            this.CreationDate = new Long(source.CreationDate);
        }
        if (source.CreateUserId != null) {
            this.CreateUserId = new Long(source.CreateUserId);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationDate", this.CreationDate);
        this.setParamSimple(map, prefix + "CreateUserId", this.CreateUserId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

