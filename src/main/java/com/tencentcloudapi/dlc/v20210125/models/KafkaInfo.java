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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaInfo extends AbstractModel{

    /**
    * kakfa实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * kakfa数据源的网络信息
    */
    @SerializedName("Location")
    @Expose
    private DatasourceConnectionLocation Location;

    /**
     * Get kakfa实例Id 
     * @return InstanceId kakfa实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set kakfa实例Id
     * @param InstanceId kakfa实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get kakfa数据源的网络信息 
     * @return Location kakfa数据源的网络信息
     */
    public DatasourceConnectionLocation getLocation() {
        return this.Location;
    }

    /**
     * Set kakfa数据源的网络信息
     * @param Location kakfa数据源的网络信息
     */
    public void setLocation(DatasourceConnectionLocation Location) {
        this.Location = Location;
    }

    public KafkaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaInfo(KafkaInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Location != null) {
            this.Location = new DatasourceConnectionLocation(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

