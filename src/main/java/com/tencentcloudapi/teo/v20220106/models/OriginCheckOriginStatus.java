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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginCheckOriginStatus extends AbstractModel{

    /**
    * healthy: 健康，unhealthy: 不健康，process: 探测中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * host列表，源站组不健康时存在值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String [] Host;

    /**
     * Get healthy: 健康，unhealthy: 不健康，process: 探测中 
     * @return Status healthy: 健康，unhealthy: 不健康，process: 探测中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set healthy: 健康，unhealthy: 不健康，process: 探测中
     * @param Status healthy: 健康，unhealthy: 不健康，process: 探测中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get host列表，源站组不健康时存在值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host host列表，源站组不健康时存在值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHost() {
        return this.Host;
    }

    /**
     * Set host列表，源站组不健康时存在值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host host列表，源站组不健康时存在值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String [] Host) {
        this.Host = Host;
    }

    public OriginCheckOriginStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginCheckOriginStatus(OriginCheckOriginStatus source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Host != null) {
            this.Host = new String[source.Host.length];
            for (int i = 0; i < source.Host.length; i++) {
                this.Host[i] = new String(source.Host[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Host.", this.Host);

    }
}

