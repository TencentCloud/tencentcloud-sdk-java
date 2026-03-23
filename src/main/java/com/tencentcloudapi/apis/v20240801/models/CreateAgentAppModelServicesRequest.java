/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAgentAppModelServicesRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 应用ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 关联的model service
    */
    @SerializedName("ModelServices")
    @Expose
    private AgentAppModelServiceDTO [] ModelServices;

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 应用ID 
     * @return ID 应用ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 应用ID
     * @param ID 应用ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 关联的model service 
     * @return ModelServices 关联的model service
     */
    public AgentAppModelServiceDTO [] getModelServices() {
        return this.ModelServices;
    }

    /**
     * Set 关联的model service
     * @param ModelServices 关联的model service
     */
    public void setModelServices(AgentAppModelServiceDTO [] ModelServices) {
        this.ModelServices = ModelServices;
    }

    public CreateAgentAppModelServicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentAppModelServicesRequest(CreateAgentAppModelServicesRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.ModelServices != null) {
            this.ModelServices = new AgentAppModelServiceDTO[source.ModelServices.length];
            for (int i = 0; i < source.ModelServices.length; i++) {
                this.ModelServices[i] = new AgentAppModelServiceDTO(source.ModelServices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArrayObj(map, prefix + "ModelServices.", this.ModelServices);

    }
}

