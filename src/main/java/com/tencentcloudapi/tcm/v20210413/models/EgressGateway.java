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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EgressGateway extends AbstractModel{

    /**
    * Egress名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 所在的Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 工作负载配置
    */
    @SerializedName("Workload")
    @Expose
    private WorkloadConfig Workload;

    /**
     * Get Egress名称 
     * @return Name Egress名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Egress名称
     * @param Name Egress名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 所在的Namespace 
     * @return Namespace 所在的Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 所在的Namespace
     * @param Namespace 所在的Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 工作负载配置 
     * @return Workload 工作负载配置
     */
    public WorkloadConfig getWorkload() {
        return this.Workload;
    }

    /**
     * Set 工作负载配置
     * @param Workload 工作负载配置
     */
    public void setWorkload(WorkloadConfig Workload) {
        this.Workload = Workload;
    }

    public EgressGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EgressGateway(EgressGateway source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Workload != null) {
            this.Workload = new WorkloadConfig(source.Workload);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamObj(map, prefix + "Workload.", this.Workload);

    }
}

