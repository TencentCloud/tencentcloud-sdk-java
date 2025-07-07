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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApplicationRequest extends AbstractModel {

    /**
    * 需要制作自定义应用的HAI实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 自定义应用的应用名称
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 自定义应用的描述
    */
    @SerializedName("ApplicationDescription")
    @Expose
    private String ApplicationDescription;

    /**
     * Get 需要制作自定义应用的HAI实例ID 
     * @return InstanceId 需要制作自定义应用的HAI实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要制作自定义应用的HAI实例ID
     * @param InstanceId 需要制作自定义应用的HAI实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 自定义应用的应用名称 
     * @return ApplicationName 自定义应用的应用名称
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 自定义应用的应用名称
     * @param ApplicationName 自定义应用的应用名称
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 自定义应用的描述 
     * @return ApplicationDescription 自定义应用的描述
     */
    public String getApplicationDescription() {
        return this.ApplicationDescription;
    }

    /**
     * Set 自定义应用的描述
     * @param ApplicationDescription 自定义应用的描述
     */
    public void setApplicationDescription(String ApplicationDescription) {
        this.ApplicationDescription = ApplicationDescription;
    }

    public CreateApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationRequest(CreateApplicationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationDescription != null) {
            this.ApplicationDescription = new String(source.ApplicationDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationDescription", this.ApplicationDescription);

    }
}

