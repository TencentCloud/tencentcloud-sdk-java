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

public class UpdateServiceRequest extends AbstractModel{

    /**
    * 待切换服务的唯一 Id。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 待切换的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 切换的版本号。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 本次的切换描述。
    */
    @SerializedName("UpdateDesc")
    @Expose
    private String UpdateDesc;

    /**
     * Get 待切换服务的唯一 Id。 
     * @return ServiceId 待切换服务的唯一 Id。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 待切换服务的唯一 Id。
     * @param ServiceId 待切换服务的唯一 Id。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 待切换的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。 
     * @return EnvironmentName 待切换的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 待切换的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。
     * @param EnvironmentName 待切换的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 切换的版本号。 
     * @return VersionName 切换的版本号。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 切换的版本号。
     * @param VersionName 切换的版本号。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 本次的切换描述。 
     * @return UpdateDesc 本次的切换描述。
     */
    public String getUpdateDesc() {
        return this.UpdateDesc;
    }

    /**
     * Set 本次的切换描述。
     * @param UpdateDesc 本次的切换描述。
     */
    public void setUpdateDesc(String UpdateDesc) {
        this.UpdateDesc = UpdateDesc;
    }

    public UpdateServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateServiceRequest(UpdateServiceRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.UpdateDesc != null) {
            this.UpdateDesc = new String(source.UpdateDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "UpdateDesc", this.UpdateDesc);

    }
}

