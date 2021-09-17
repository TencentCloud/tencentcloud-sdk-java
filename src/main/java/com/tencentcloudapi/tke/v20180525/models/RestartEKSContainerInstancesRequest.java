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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartEKSContainerInstancesRequest extends AbstractModel{

    /**
    * EKS instance ids
    */
    @SerializedName("EksCiIds")
    @Expose
    private String [] EksCiIds;

    /**
     * Get EKS instance ids 
     * @return EksCiIds EKS instance ids
     */
    public String [] getEksCiIds() {
        return this.EksCiIds;
    }

    /**
     * Set EKS instance ids
     * @param EksCiIds EKS instance ids
     */
    public void setEksCiIds(String [] EksCiIds) {
        this.EksCiIds = EksCiIds;
    }

    public RestartEKSContainerInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartEKSContainerInstancesRequest(RestartEKSContainerInstancesRequest source) {
        if (source.EksCiIds != null) {
            this.EksCiIds = new String[source.EksCiIds.length];
            for (int i = 0; i < source.EksCiIds.length; i++) {
                this.EksCiIds[i] = new String(source.EksCiIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EksCiIds.", this.EksCiIds);

    }
}

