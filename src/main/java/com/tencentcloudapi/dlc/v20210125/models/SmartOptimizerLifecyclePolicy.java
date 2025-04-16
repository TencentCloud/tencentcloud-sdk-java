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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartOptimizerLifecyclePolicy extends AbstractModel {

    /**
    * 生命周期启用
    */
    @SerializedName("LifecycleEnable")
    @Expose
    private String LifecycleEnable;

    /**
    * 过期时间
    */
    @SerializedName("Expiration")
    @Expose
    private Long Expiration;

    /**
    * 是否删表
    */
    @SerializedName("DropTable")
    @Expose
    private Boolean DropTable;

    /**
    * 过期字段
    */
    @SerializedName("ExpiredField")
    @Expose
    private String ExpiredField;

    /**
    * 过期字段格式
    */
    @SerializedName("ExpiredFieldFormat")
    @Expose
    private String ExpiredFieldFormat;

    /**
     * Get 生命周期启用 
     * @return LifecycleEnable 生命周期启用
     */
    public String getLifecycleEnable() {
        return this.LifecycleEnable;
    }

    /**
     * Set 生命周期启用
     * @param LifecycleEnable 生命周期启用
     */
    public void setLifecycleEnable(String LifecycleEnable) {
        this.LifecycleEnable = LifecycleEnable;
    }

    /**
     * Get 过期时间 
     * @return Expiration 过期时间
     */
    public Long getExpiration() {
        return this.Expiration;
    }

    /**
     * Set 过期时间
     * @param Expiration 过期时间
     */
    public void setExpiration(Long Expiration) {
        this.Expiration = Expiration;
    }

    /**
     * Get 是否删表 
     * @return DropTable 是否删表
     */
    public Boolean getDropTable() {
        return this.DropTable;
    }

    /**
     * Set 是否删表
     * @param DropTable 是否删表
     */
    public void setDropTable(Boolean DropTable) {
        this.DropTable = DropTable;
    }

    /**
     * Get 过期字段 
     * @return ExpiredField 过期字段
     */
    public String getExpiredField() {
        return this.ExpiredField;
    }

    /**
     * Set 过期字段
     * @param ExpiredField 过期字段
     */
    public void setExpiredField(String ExpiredField) {
        this.ExpiredField = ExpiredField;
    }

    /**
     * Get 过期字段格式 
     * @return ExpiredFieldFormat 过期字段格式
     */
    public String getExpiredFieldFormat() {
        return this.ExpiredFieldFormat;
    }

    /**
     * Set 过期字段格式
     * @param ExpiredFieldFormat 过期字段格式
     */
    public void setExpiredFieldFormat(String ExpiredFieldFormat) {
        this.ExpiredFieldFormat = ExpiredFieldFormat;
    }

    public SmartOptimizerLifecyclePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartOptimizerLifecyclePolicy(SmartOptimizerLifecyclePolicy source) {
        if (source.LifecycleEnable != null) {
            this.LifecycleEnable = new String(source.LifecycleEnable);
        }
        if (source.Expiration != null) {
            this.Expiration = new Long(source.Expiration);
        }
        if (source.DropTable != null) {
            this.DropTable = new Boolean(source.DropTable);
        }
        if (source.ExpiredField != null) {
            this.ExpiredField = new String(source.ExpiredField);
        }
        if (source.ExpiredFieldFormat != null) {
            this.ExpiredFieldFormat = new String(source.ExpiredFieldFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleEnable", this.LifecycleEnable);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamSimple(map, prefix + "DropTable", this.DropTable);
        this.setParamSimple(map, prefix + "ExpiredField", this.ExpiredField);
        this.setParamSimple(map, prefix + "ExpiredFieldFormat", this.ExpiredFieldFormat);

    }
}

