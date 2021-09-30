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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateJdkRequest extends AbstractModel{

    /**
    * ES实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Jdk类型，支持kona和oracle
    */
    @SerializedName("Jdk")
    @Expose
    private String Jdk;

    /**
    * Gc类型，支持g1和cms
    */
    @SerializedName("Gc")
    @Expose
    private String Gc;

    /**
    * 是否强制重启
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
     * Get ES实例ID 
     * @return InstanceId ES实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES实例ID
     * @param InstanceId ES实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Jdk类型，支持kona和oracle 
     * @return Jdk Jdk类型，支持kona和oracle
     */
    public String getJdk() {
        return this.Jdk;
    }

    /**
     * Set Jdk类型，支持kona和oracle
     * @param Jdk Jdk类型，支持kona和oracle
     */
    public void setJdk(String Jdk) {
        this.Jdk = Jdk;
    }

    /**
     * Get Gc类型，支持g1和cms 
     * @return Gc Gc类型，支持g1和cms
     */
    public String getGc() {
        return this.Gc;
    }

    /**
     * Set Gc类型，支持g1和cms
     * @param Gc Gc类型，支持g1和cms
     */
    public void setGc(String Gc) {
        this.Gc = Gc;
    }

    /**
     * Get 是否强制重启 
     * @return ForceRestart 是否强制重启
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set 是否强制重启
     * @param ForceRestart 是否强制重启
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    public UpdateJdkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateJdkRequest(UpdateJdkRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Jdk != null) {
            this.Jdk = new String(source.Jdk);
        }
        if (source.Gc != null) {
            this.Gc = new String(source.Gc);
        }
        if (source.ForceRestart != null) {
            this.ForceRestart = new Boolean(source.ForceRestart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Jdk", this.Jdk);
        this.setParamSimple(map, prefix + "Gc", this.Gc);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);

    }
}

