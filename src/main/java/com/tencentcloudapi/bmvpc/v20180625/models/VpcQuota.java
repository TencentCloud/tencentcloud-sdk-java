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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcQuota extends AbstractModel{

    /**
    * 配额类型ID
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 配额
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
     * Get 配额类型ID 
     * @return TypeId 配额类型ID
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 配额类型ID
     * @param TypeId 配额类型ID
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 配额 
     * @return Quota 配额
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set 配额
     * @param Quota 配额
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "Quota", this.Quota);

    }
}

