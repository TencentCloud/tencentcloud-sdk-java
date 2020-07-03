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

public class ZoneInstanceInfo extends AbstractModel{

    /**
    * Zone名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 实例数量
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
     * Get Zone名称 
     * @return ZoneName Zone名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Zone名称
     * @param ZoneName Zone名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 实例数量 
     * @return InstanceNum 实例数量
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 实例数量
     * @param InstanceNum 实例数量
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);

    }
}

