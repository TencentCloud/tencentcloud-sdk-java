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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Area extends AbstractModel{

    /**
    * 区域ID
    */
    @SerializedName("AreaId")
    @Expose
    private String AreaId;

    /**
    * 区域名称
    */
    @SerializedName("AreaName")
    @Expose
    private String AreaName;

    /**
     * Get 区域ID 
     * @return AreaId 区域ID
     */
    public String getAreaId() {
        return this.AreaId;
    }

    /**
     * Set 区域ID
     * @param AreaId 区域ID
     */
    public void setAreaId(String AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get 区域名称 
     * @return AreaName 区域名称
     */
    public String getAreaName() {
        return this.AreaName;
    }

    /**
     * Set 区域名称
     * @param AreaName 区域名称
     */
    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "AreaName", this.AreaName);

    }
}

