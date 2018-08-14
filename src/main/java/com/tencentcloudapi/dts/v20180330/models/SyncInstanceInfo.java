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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncInstanceInfo  extends AbstractModel{

    /**
    * 地域英文名，如：ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例短Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * 获取地域英文名，如：ap-guangzhou
     * @return Region 地域英文名，如：ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域英文名，如：ap-guangzhou
     * @param Region 地域英文名，如：ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取实例短Id
     * @return InstanceId 实例短Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例短Id
     * @param InstanceId 实例短Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

