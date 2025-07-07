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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServicesInfo extends AbstractModel {

    /**
    * 协议端口。
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 备注。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 更新时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get 协议端口。 
     * @return Service 协议端口。
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 协议端口。
     * @param Service 协议端口。
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 备注。 
     * @return Description 备注。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注。
     * @param Description 备注。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 更新时间。 
     * @return UpdatedTime 更新时间。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间。
     * @param UpdatedTime 更新时间。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public ServicesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServicesInfo(ServicesInfo source) {
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

