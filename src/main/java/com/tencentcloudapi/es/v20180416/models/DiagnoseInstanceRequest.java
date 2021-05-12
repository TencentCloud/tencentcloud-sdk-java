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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagnoseInstanceRequest extends AbstractModel{

    /**
    * ES实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要触发的诊断项
    */
    @SerializedName("DiagnoseJobs")
    @Expose
    private String [] DiagnoseJobs;

    /**
    * 需要诊断的索引，支持通配符
    */
    @SerializedName("DiagnoseIndices")
    @Expose
    private String DiagnoseIndices;

    /**
     * Get ES实例ID 
     * @return InstanceId ES实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES实例ID
     * @param InstanceId ES实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要触发的诊断项 
     * @return DiagnoseJobs 需要触发的诊断项
     */
    public String [] getDiagnoseJobs() {
        return this.DiagnoseJobs;
    }

    /**
     * Set 需要触发的诊断项
     * @param DiagnoseJobs 需要触发的诊断项
     */
    public void setDiagnoseJobs(String [] DiagnoseJobs) {
        this.DiagnoseJobs = DiagnoseJobs;
    }

    /**
     * Get 需要诊断的索引，支持通配符 
     * @return DiagnoseIndices 需要诊断的索引，支持通配符
     */
    public String getDiagnoseIndices() {
        return this.DiagnoseIndices;
    }

    /**
     * Set 需要诊断的索引，支持通配符
     * @param DiagnoseIndices 需要诊断的索引，支持通配符
     */
    public void setDiagnoseIndices(String DiagnoseIndices) {
        this.DiagnoseIndices = DiagnoseIndices;
    }

    public DiagnoseInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnoseInstanceRequest(DiagnoseInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DiagnoseJobs != null) {
            this.DiagnoseJobs = new String[source.DiagnoseJobs.length];
            for (int i = 0; i < source.DiagnoseJobs.length; i++) {
                this.DiagnoseJobs[i] = new String(source.DiagnoseJobs[i]);
            }
        }
        if (source.DiagnoseIndices != null) {
            this.DiagnoseIndices = new String(source.DiagnoseIndices);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "DiagnoseJobs.", this.DiagnoseJobs);
        this.setParamSimple(map, prefix + "DiagnoseIndices", this.DiagnoseIndices);

    }
}

