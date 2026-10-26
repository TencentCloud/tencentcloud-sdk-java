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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescModifyType extends AbstractModel {

    /**
    * <p>变配类型</p>
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * <p>是否迁移标志</p>
    */
    @SerializedName("MigrateFlag")
    @Expose
    private Boolean MigrateFlag;

    /**
     * Get <p>变配类型</p> 
     * @return ModifyType <p>变配类型</p>
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set <p>变配类型</p>
     * @param ModifyType <p>变配类型</p>
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get <p>是否迁移标志</p> 
     * @return MigrateFlag <p>是否迁移标志</p>
     */
    public Boolean getMigrateFlag() {
        return this.MigrateFlag;
    }

    /**
     * Set <p>是否迁移标志</p>
     * @param MigrateFlag <p>是否迁移标志</p>
     */
    public void setMigrateFlag(Boolean MigrateFlag) {
        this.MigrateFlag = MigrateFlag;
    }

    public DescModifyType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescModifyType(DescModifyType source) {
        if (source.ModifyType != null) {
            this.ModifyType = new Long(source.ModifyType);
        }
        if (source.MigrateFlag != null) {
            this.MigrateFlag = new Boolean(source.MigrateFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "MigrateFlag", this.MigrateFlag);

    }
}

