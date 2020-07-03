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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneAccountRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 源用户账户名
    */
    @SerializedName("SrcUser")
    @Expose
    private String SrcUser;

    /**
    * 源用户HOST
    */
    @SerializedName("SrcHost")
    @Expose
    private String SrcHost;

    /**
    * 目的用户账户名
    */
    @SerializedName("DstUser")
    @Expose
    private String DstUser;

    /**
    * 目的用户HOST
    */
    @SerializedName("DstHost")
    @Expose
    private String DstHost;

    /**
    * 目的用户账户描述
    */
    @SerializedName("DstDesc")
    @Expose
    private String DstDesc;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 源用户账户名 
     * @return SrcUser 源用户账户名
     */
    public String getSrcUser() {
        return this.SrcUser;
    }

    /**
     * Set 源用户账户名
     * @param SrcUser 源用户账户名
     */
    public void setSrcUser(String SrcUser) {
        this.SrcUser = SrcUser;
    }

    /**
     * Get 源用户HOST 
     * @return SrcHost 源用户HOST
     */
    public String getSrcHost() {
        return this.SrcHost;
    }

    /**
     * Set 源用户HOST
     * @param SrcHost 源用户HOST
     */
    public void setSrcHost(String SrcHost) {
        this.SrcHost = SrcHost;
    }

    /**
     * Get 目的用户账户名 
     * @return DstUser 目的用户账户名
     */
    public String getDstUser() {
        return this.DstUser;
    }

    /**
     * Set 目的用户账户名
     * @param DstUser 目的用户账户名
     */
    public void setDstUser(String DstUser) {
        this.DstUser = DstUser;
    }

    /**
     * Get 目的用户HOST 
     * @return DstHost 目的用户HOST
     */
    public String getDstHost() {
        return this.DstHost;
    }

    /**
     * Set 目的用户HOST
     * @param DstHost 目的用户HOST
     */
    public void setDstHost(String DstHost) {
        this.DstHost = DstHost;
    }

    /**
     * Get 目的用户账户描述 
     * @return DstDesc 目的用户账户描述
     */
    public String getDstDesc() {
        return this.DstDesc;
    }

    /**
     * Set 目的用户账户描述
     * @param DstDesc 目的用户账户描述
     */
    public void setDstDesc(String DstDesc) {
        this.DstDesc = DstDesc;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SrcUser", this.SrcUser);
        this.setParamSimple(map, prefix + "SrcHost", this.SrcHost);
        this.setParamSimple(map, prefix + "DstUser", this.DstUser);
        this.setParamSimple(map, prefix + "DstHost", this.DstHost);
        this.setParamSimple(map, prefix + "DstDesc", this.DstDesc);

    }
}

