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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMfaCodeStatusRequest extends AbstractModel{

    /**
    * mfaKey
    */
    @SerializedName("Tmpcode")
    @Expose
    private String Tmpcode;

    /**
    * 登录态skey
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
    * 用户浏览器UA
    */
    @SerializedName("ClientUA")
    @Expose
    private String ClientUA;

    /**
    * 接口名
    */
    @SerializedName("Interface")
    @Expose
    private String Interface;

    /**
    * 用户IP
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * 主账号
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
     * Get mfaKey 
     * @return Tmpcode mfaKey
     */
    public String getTmpcode() {
        return this.Tmpcode;
    }

    /**
     * Set mfaKey
     * @param Tmpcode mfaKey
     */
    public void setTmpcode(String Tmpcode) {
        this.Tmpcode = Tmpcode;
    }

    /**
     * Get 登录态skey 
     * @return Skey 登录态skey
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set 登录态skey
     * @param Skey 登录态skey
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    /**
     * Get 用户浏览器UA 
     * @return ClientUA 用户浏览器UA
     */
    public String getClientUA() {
        return this.ClientUA;
    }

    /**
     * Set 用户浏览器UA
     * @param ClientUA 用户浏览器UA
     */
    public void setClientUA(String ClientUA) {
        this.ClientUA = ClientUA;
    }

    /**
     * Get 接口名 
     * @return Interface 接口名
     */
    public String getInterface() {
        return this.Interface;
    }

    /**
     * Set 接口名
     * @param Interface 接口名
     */
    public void setInterface(String Interface) {
        this.Interface = Interface;
    }

    /**
     * Get 用户IP 
     * @return ClientIP 用户IP
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set 用户IP
     * @param ClientIP 用户IP
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get 主账号 
     * @return OwnerUin 主账号
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号
     * @param OwnerUin 主账号
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tmpcode", this.Tmpcode);
        this.setParamSimple(map, prefix + "Skey", this.Skey);
        this.setParamSimple(map, prefix + "ClientUA", this.ClientUA);
        this.setParamSimple(map, prefix + "Interface", this.Interface);
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

