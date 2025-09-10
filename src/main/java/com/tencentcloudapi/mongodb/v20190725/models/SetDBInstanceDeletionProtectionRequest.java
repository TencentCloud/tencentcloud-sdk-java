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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetDBInstanceDeletionProtectionRequest extends AbstractModel {

    /**
    * 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例销毁保护选项，取值范围：0-关闭销毁保护，1-开启销毁保护
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Long EnableDeletionProtection;

    /**
     * Get 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同 
     * @return InstanceIds 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     * @param InstanceIds 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 实例销毁保护选项，取值范围：0-关闭销毁保护，1-开启销毁保护 
     * @return EnableDeletionProtection 实例销毁保护选项，取值范围：0-关闭销毁保护，1-开启销毁保护
     */
    public Long getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set 实例销毁保护选项，取值范围：0-关闭销毁保护，1-开启销毁保护
     * @param EnableDeletionProtection 实例销毁保护选项，取值范围：0-关闭销毁保护，1-开启销毁保护
     */
    public void setEnableDeletionProtection(Long EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    public SetDBInstanceDeletionProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetDBInstanceDeletionProtectionRequest(SetDBInstanceDeletionProtectionRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Long(source.EnableDeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);

    }
}

