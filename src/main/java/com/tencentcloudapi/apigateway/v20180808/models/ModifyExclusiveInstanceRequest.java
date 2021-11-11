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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyExclusiveInstanceRequest extends AbstractModel{

    /**
    * 独享实例唯一id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 独享实例name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 独享实例描述
    */
    @SerializedName("InstanceDescription")
    @Expose
    private String InstanceDescription;

    /**
    * 独享实例参数配置
    */
    @SerializedName("Parameters")
    @Expose
    private InstanceParameterInput [] Parameters;

    /**
     * Get 独享实例唯一id 
     * @return InstanceId 独享实例唯一id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 独享实例唯一id
     * @param InstanceId 独享实例唯一id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 独享实例name 
     * @return InstanceName 独享实例name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 独享实例name
     * @param InstanceName 独享实例name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 独享实例描述 
     * @return InstanceDescription 独享实例描述
     */
    public String getInstanceDescription() {
        return this.InstanceDescription;
    }

    /**
     * Set 独享实例描述
     * @param InstanceDescription 独享实例描述
     */
    public void setInstanceDescription(String InstanceDescription) {
        this.InstanceDescription = InstanceDescription;
    }

    /**
     * Get 独享实例参数配置 
     * @return Parameters 独享实例参数配置
     */
    public InstanceParameterInput [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set 独享实例参数配置
     * @param Parameters 独享实例参数配置
     */
    public void setParameters(InstanceParameterInput [] Parameters) {
        this.Parameters = Parameters;
    }

    public ModifyExclusiveInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyExclusiveInstanceRequest(ModifyExclusiveInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceDescription != null) {
            this.InstanceDescription = new String(source.InstanceDescription);
        }
        if (source.Parameters != null) {
            this.Parameters = new InstanceParameterInput[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new InstanceParameterInput(source.Parameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceDescription", this.InstanceDescription);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);

    }
}

