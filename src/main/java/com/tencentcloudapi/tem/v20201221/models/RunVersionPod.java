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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunVersionPod extends AbstractModel{

    /**
    * shell地址
    */
    @SerializedName("Webshell")
    @Expose
    private String Webshell;

    /**
    * pod的id
    */
    @SerializedName("PodId")
    @Expose
    private String PodId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * pod的ip
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
     * Get shell地址 
     * @return Webshell shell地址
     */
    public String getWebshell() {
        return this.Webshell;
    }

    /**
     * Set shell地址
     * @param Webshell shell地址
     */
    public void setWebshell(String Webshell) {
        this.Webshell = Webshell;
    }

    /**
     * Get pod的id 
     * @return PodId pod的id
     */
    public String getPodId() {
        return this.PodId;
    }

    /**
     * Set pod的id
     * @param PodId pod的id
     */
    public void setPodId(String PodId) {
        this.PodId = PodId;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get pod的ip 
     * @return PodIp pod的ip
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set pod的ip
     * @param PodIp pod的ip
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Webshell", this.Webshell);
        this.setParamSimple(map, prefix + "PodId", this.PodId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);

    }
}

