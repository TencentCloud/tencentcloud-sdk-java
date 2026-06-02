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

public class DeleteAgentAppServicesRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>应用ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>服务IDs</p>
    */
    @SerializedName("ServiceIDs")
    @Expose
    private String [] ServiceIDs;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceID <p>实例ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceID <p>实例ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>应用ID</p> 
     * @return ID <p>应用ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>应用ID</p>
     * @param ID <p>应用ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>服务IDs</p> 
     * @return ServiceIDs <p>服务IDs</p>
     */
    public String [] getServiceIDs() {
        return this.ServiceIDs;
    }

    /**
     * Set <p>服务IDs</p>
     * @param ServiceIDs <p>服务IDs</p>
     */
    public void setServiceIDs(String [] ServiceIDs) {
        this.ServiceIDs = ServiceIDs;
    }

    public DeleteAgentAppServicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAgentAppServicesRequest(DeleteAgentAppServicesRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.ServiceIDs != null) {
            this.ServiceIDs = new String[source.ServiceIDs.length];
            for (int i = 0; i < source.ServiceIDs.length; i++) {
                this.ServiceIDs[i] = new String(source.ServiceIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArraySimple(map, prefix + "ServiceIDs.", this.ServiceIDs);

    }
}

