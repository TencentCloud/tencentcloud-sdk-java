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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateDBItem extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例Vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 实例Vport
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 是否可以作为迁移对象，1-可以，0-不可以
    */
    @SerializedName("Usable")
    @Expose
    private Long Usable;

    /**
    * 不可以作为迁移对象的原因
    */
    @SerializedName("Hint")
    @Expose
    private String Hint;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例Vip 
     * @return Vip 实例Vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例Vip
     * @param Vip 实例Vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 实例Vport 
     * @return Vport 实例Vport
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例Vport
     * @param Vport 实例Vport
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 是否可以作为迁移对象，1-可以，0-不可以 
     * @return Usable 是否可以作为迁移对象，1-可以，0-不可以
     */
    public Long getUsable() {
        return this.Usable;
    }

    /**
     * Set 是否可以作为迁移对象，1-可以，0-不可以
     * @param Usable 是否可以作为迁移对象，1-可以，0-不可以
     */
    public void setUsable(Long Usable) {
        this.Usable = Usable;
    }

    /**
     * Get 不可以作为迁移对象的原因 
     * @return Hint 不可以作为迁移对象的原因
     */
    public String getHint() {
        return this.Hint;
    }

    /**
     * Set 不可以作为迁移对象的原因
     * @param Hint 不可以作为迁移对象的原因
     */
    public void setHint(String Hint) {
        this.Hint = Hint;
    }

    public MigrateDBItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateDBItem(MigrateDBItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Usable != null) {
            this.Usable = new Long(source.Usable);
        }
        if (source.Hint != null) {
            this.Hint = new String(source.Hint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Usable", this.Usable);
        this.setParamSimple(map, prefix + "Hint", this.Hint);

    }
}

