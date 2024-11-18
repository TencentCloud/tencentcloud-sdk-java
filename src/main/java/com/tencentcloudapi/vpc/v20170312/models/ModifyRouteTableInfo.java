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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRouteTableInfo extends AbstractModel {

    /**
    * 云联网路由表id。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 云联网路由表名称。Name和Description 两者必传一个。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 云联网路由表描述。Name和Description 两者必传一个。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 云联网路由表id。 
     * @return RouteTableId 云联网路由表id。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 云联网路由表id。
     * @param RouteTableId 云联网路由表id。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get 云联网路由表名称。Name和Description 两者必传一个。 
     * @return Name 云联网路由表名称。Name和Description 两者必传一个。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 云联网路由表名称。Name和Description 两者必传一个。
     * @param Name 云联网路由表名称。Name和Description 两者必传一个。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 云联网路由表描述。Name和Description 两者必传一个。 
     * @return Description 云联网路由表描述。Name和Description 两者必传一个。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 云联网路由表描述。Name和Description 两者必传一个。
     * @param Description 云联网路由表描述。Name和Description 两者必传一个。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyRouteTableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRouteTableInfo(ModifyRouteTableInfo source) {
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

