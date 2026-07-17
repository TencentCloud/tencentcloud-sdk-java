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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApmServiceRequest extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * <p>应用描述</p>
    */
    @SerializedName("ServiceDescription")
    @Expose
    private String ServiceDescription;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
     * Get <p>应用ID</p> 
     * @return ServiceID <p>应用ID</p>
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set <p>应用ID</p>
     * @param ServiceID <p>应用ID</p>
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get <p>应用描述</p> 
     * @return ServiceDescription <p>应用描述</p>
     */
    public String getServiceDescription() {
        return this.ServiceDescription;
    }

    /**
     * Set <p>应用描述</p>
     * @param ServiceDescription <p>应用描述</p>
     */
    public void setServiceDescription(String ServiceDescription) {
        this.ServiceDescription = ServiceDescription;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    public ModifyApmServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApmServiceRequest(ModifyApmServiceRequest source) {
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.ServiceDescription != null) {
            this.ServiceDescription = new String(source.ServiceDescription);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "ServiceDescription", this.ServiceDescription);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

