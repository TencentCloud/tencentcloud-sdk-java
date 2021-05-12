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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PhonePool extends AbstractModel{

    /**
    * 号码组ID
    */
    @SerializedName("PoolId")
    @Expose
    private String PoolId;

    /**
    * 号码组名称
    */
    @SerializedName("PoolName")
    @Expose
    private String PoolName;

    /**
     * Get 号码组ID 
     * @return PoolId 号码组ID
     */
    public String getPoolId() {
        return this.PoolId;
    }

    /**
     * Set 号码组ID
     * @param PoolId 号码组ID
     */
    public void setPoolId(String PoolId) {
        this.PoolId = PoolId;
    }

    /**
     * Get 号码组名称 
     * @return PoolName 号码组名称
     */
    public String getPoolName() {
        return this.PoolName;
    }

    /**
     * Set 号码组名称
     * @param PoolName 号码组名称
     */
    public void setPoolName(String PoolName) {
        this.PoolName = PoolName;
    }

    public PhonePool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhonePool(PhonePool source) {
        if (source.PoolId != null) {
            this.PoolId = new String(source.PoolId);
        }
        if (source.PoolName != null) {
            this.PoolName = new String(source.PoolName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PoolId", this.PoolId);
        this.setParamSimple(map, prefix + "PoolName", this.PoolName);

    }
}

