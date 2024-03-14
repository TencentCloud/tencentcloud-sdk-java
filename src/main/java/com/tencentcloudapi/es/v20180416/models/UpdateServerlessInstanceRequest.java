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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateServerlessInstanceRequest extends AbstractModel {

    /**
    * Serveless实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 更新的索引元数据JSON，如mappings、settings
    */
    @SerializedName("UpdateMetaJson")
    @Expose
    private String UpdateMetaJson;

    /**
    * 实例访问密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 开启kibana内网访问，如OPEN、CLOSE
    */
    @SerializedName("KibanaPrivateAccess")
    @Expose
    private String KibanaPrivateAccess;

    /**
    * 开启kibana外网访问，如OPEN、CLOSE
    */
    @SerializedName("KibanaPublicAccess")
    @Expose
    private String KibanaPublicAccess;

    /**
    * 访问控制列表
    */
    @SerializedName("KibanaPublicAcl")
    @Expose
    private KibanaPublicAcl KibanaPublicAcl;

    /**
     * Get Serveless实例ID 
     * @return InstanceId Serveless实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Serveless实例ID
     * @param InstanceId Serveless实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 更新的索引元数据JSON，如mappings、settings 
     * @return UpdateMetaJson 更新的索引元数据JSON，如mappings、settings
     */
    public String getUpdateMetaJson() {
        return this.UpdateMetaJson;
    }

    /**
     * Set 更新的索引元数据JSON，如mappings、settings
     * @param UpdateMetaJson 更新的索引元数据JSON，如mappings、settings
     */
    public void setUpdateMetaJson(String UpdateMetaJson) {
        this.UpdateMetaJson = UpdateMetaJson;
    }

    /**
     * Get 实例访问密码 
     * @return Password 实例访问密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 实例访问密码
     * @param Password 实例访问密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 开启kibana内网访问，如OPEN、CLOSE 
     * @return KibanaPrivateAccess 开启kibana内网访问，如OPEN、CLOSE
     */
    public String getKibanaPrivateAccess() {
        return this.KibanaPrivateAccess;
    }

    /**
     * Set 开启kibana内网访问，如OPEN、CLOSE
     * @param KibanaPrivateAccess 开启kibana内网访问，如OPEN、CLOSE
     */
    public void setKibanaPrivateAccess(String KibanaPrivateAccess) {
        this.KibanaPrivateAccess = KibanaPrivateAccess;
    }

    /**
     * Get 开启kibana外网访问，如OPEN、CLOSE 
     * @return KibanaPublicAccess 开启kibana外网访问，如OPEN、CLOSE
     */
    public String getKibanaPublicAccess() {
        return this.KibanaPublicAccess;
    }

    /**
     * Set 开启kibana外网访问，如OPEN、CLOSE
     * @param KibanaPublicAccess 开启kibana外网访问，如OPEN、CLOSE
     */
    public void setKibanaPublicAccess(String KibanaPublicAccess) {
        this.KibanaPublicAccess = KibanaPublicAccess;
    }

    /**
     * Get 访问控制列表 
     * @return KibanaPublicAcl 访问控制列表
     */
    public KibanaPublicAcl getKibanaPublicAcl() {
        return this.KibanaPublicAcl;
    }

    /**
     * Set 访问控制列表
     * @param KibanaPublicAcl 访问控制列表
     */
    public void setKibanaPublicAcl(KibanaPublicAcl KibanaPublicAcl) {
        this.KibanaPublicAcl = KibanaPublicAcl;
    }

    public UpdateServerlessInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateServerlessInstanceRequest(UpdateServerlessInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UpdateMetaJson != null) {
            this.UpdateMetaJson = new String(source.UpdateMetaJson);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.KibanaPrivateAccess != null) {
            this.KibanaPrivateAccess = new String(source.KibanaPrivateAccess);
        }
        if (source.KibanaPublicAccess != null) {
            this.KibanaPublicAccess = new String(source.KibanaPublicAccess);
        }
        if (source.KibanaPublicAcl != null) {
            this.KibanaPublicAcl = new KibanaPublicAcl(source.KibanaPublicAcl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UpdateMetaJson", this.UpdateMetaJson);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "KibanaPrivateAccess", this.KibanaPrivateAccess);
        this.setParamSimple(map, prefix + "KibanaPublicAccess", this.KibanaPublicAccess);
        this.setParamObj(map, prefix + "KibanaPublicAcl.", this.KibanaPublicAcl);

    }
}

