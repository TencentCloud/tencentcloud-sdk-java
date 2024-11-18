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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdcCluster extends AbstractModel {

    /**
    * cdc的集群id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * cdc的集群名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get cdc的集群id 
     * @return Id cdc的集群id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set cdc的集群id
     * @param Id cdc的集群id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get cdc的集群名称 
     * @return Name cdc的集群名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set cdc的集群名称
     * @param Name cdc的集群名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CdcCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdcCluster(CdcCluster source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

