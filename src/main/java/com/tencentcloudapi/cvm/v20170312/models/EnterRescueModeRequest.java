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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnterRescueModeRequest extends AbstractModel {

    /**
    * 需要进入救援模式的实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 救援模式下系统密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 救援模式下系统用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 是否强制关机
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
     * Get 需要进入救援模式的实例id 
     * @return InstanceId 需要进入救援模式的实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要进入救援模式的实例id
     * @param InstanceId 需要进入救援模式的实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 救援模式下系统密码 
     * @return Password 救援模式下系统密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 救援模式下系统密码
     * @param Password 救援模式下系统密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 救援模式下系统用户名 
     * @return Username 救援模式下系统用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 救援模式下系统用户名
     * @param Username 救援模式下系统用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 是否强制关机 
     * @return ForceStop 是否强制关机
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set 是否强制关机
     * @param ForceStop 是否强制关机
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    public EnterRescueModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnterRescueModeRequest(EnterRescueModeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.ForceStop != null) {
            this.ForceStop = new Boolean(source.ForceStop);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);

    }
}

