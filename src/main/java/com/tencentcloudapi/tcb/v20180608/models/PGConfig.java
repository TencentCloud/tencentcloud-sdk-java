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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PGConfig extends AbstractModel {

    /**
    * <p>规格</p>
    */
    @SerializedName("PGSpec")
    @Expose
    private String PGSpec;

    /**
    * <p>磁盘大小</p><p>单位：GB</p>
    */
    @SerializedName("PGStorage")
    @Expose
    private Long PGStorage;

    /**
    * <p>实例类型（独享/共享）</p><p>参数格式：SHARED：共享，DEDICATED：独享； 仅满足要求的套餐支持独享；仅有独享pg支持指定pg参数（如规格、磁盘）</p>
    */
    @SerializedName("TenantType")
    @Expose
    private String TenantType;

    /**
     * Get <p>规格</p> 
     * @return PGSpec <p>规格</p>
     */
    public String getPGSpec() {
        return this.PGSpec;
    }

    /**
     * Set <p>规格</p>
     * @param PGSpec <p>规格</p>
     */
    public void setPGSpec(String PGSpec) {
        this.PGSpec = PGSpec;
    }

    /**
     * Get <p>磁盘大小</p><p>单位：GB</p> 
     * @return PGStorage <p>磁盘大小</p><p>单位：GB</p>
     */
    public Long getPGStorage() {
        return this.PGStorage;
    }

    /**
     * Set <p>磁盘大小</p><p>单位：GB</p>
     * @param PGStorage <p>磁盘大小</p><p>单位：GB</p>
     */
    public void setPGStorage(Long PGStorage) {
        this.PGStorage = PGStorage;
    }

    /**
     * Get <p>实例类型（独享/共享）</p><p>参数格式：SHARED：共享，DEDICATED：独享； 仅满足要求的套餐支持独享；仅有独享pg支持指定pg参数（如规格、磁盘）</p> 
     * @return TenantType <p>实例类型（独享/共享）</p><p>参数格式：SHARED：共享，DEDICATED：独享； 仅满足要求的套餐支持独享；仅有独享pg支持指定pg参数（如规格、磁盘）</p>
     */
    public String getTenantType() {
        return this.TenantType;
    }

    /**
     * Set <p>实例类型（独享/共享）</p><p>参数格式：SHARED：共享，DEDICATED：独享； 仅满足要求的套餐支持独享；仅有独享pg支持指定pg参数（如规格、磁盘）</p>
     * @param TenantType <p>实例类型（独享/共享）</p><p>参数格式：SHARED：共享，DEDICATED：独享； 仅满足要求的套餐支持独享；仅有独享pg支持指定pg参数（如规格、磁盘）</p>
     */
    public void setTenantType(String TenantType) {
        this.TenantType = TenantType;
    }

    public PGConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PGConfig(PGConfig source) {
        if (source.PGSpec != null) {
            this.PGSpec = new String(source.PGSpec);
        }
        if (source.PGStorage != null) {
            this.PGStorage = new Long(source.PGStorage);
        }
        if (source.TenantType != null) {
            this.TenantType = new String(source.TenantType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PGSpec", this.PGSpec);
        this.setParamSimple(map, prefix + "PGStorage", this.PGStorage);
        this.setParamSimple(map, prefix + "TenantType", this.TenantType);

    }
}

