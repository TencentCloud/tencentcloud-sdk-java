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

public class DetectMaskAuthRequest extends AbstractModel{

    /**
    * 登录态Skey
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
    * IP
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * 浏览器UA
    */
    @SerializedName("ClientUA")
    @Expose
    private String ClientUA;

    /**
    * 人脸类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 用户名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户Idcard
    */
    @SerializedName("Idcard")
    @Expose
    private String Idcard;

    /**
    * 主账号
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
     * Get 登录态Skey 
     * @return Skey 登录态Skey
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set 登录态Skey
     * @param Skey 登录态Skey
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    /**
     * Get IP 
     * @return ClientIP IP
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set IP
     * @param ClientIP IP
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get 浏览器UA 
     * @return ClientUA 浏览器UA
     */
    public String getClientUA() {
        return this.ClientUA;
    }

    /**
     * Set 浏览器UA
     * @param ClientUA 浏览器UA
     */
    public void setClientUA(String ClientUA) {
        this.ClientUA = ClientUA;
    }

    /**
     * Get 人脸类型 
     * @return Type 人脸类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 人脸类型
     * @param Type 人脸类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 用户名称 
     * @return Name 用户名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户名称
     * @param Name 用户名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户Idcard 
     * @return Idcard 用户Idcard
     */
    public String getIdcard() {
        return this.Idcard;
    }

    /**
     * Set 用户Idcard
     * @param Idcard 用户Idcard
     */
    public void setIdcard(String Idcard) {
        this.Idcard = Idcard;
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
        this.setParamSimple(map, prefix + "Skey", this.Skey);
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "ClientUA", this.ClientUA);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Idcard", this.Idcard);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

