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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StepDetail extends AbstractModel{

    /**
    * 具体步骤返回信息
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 当前步骤状态，0成功，-2未开始
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 步骤名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 具体步骤返回信息 
     * @return Msg 具体步骤返回信息
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 具体步骤返回信息
     * @param Msg 具体步骤返回信息
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 当前步骤状态，0成功，-2未开始 
     * @return Status 当前步骤状态，0成功，-2未开始
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 当前步骤状态，0成功，-2未开始
     * @param Status 当前步骤状态，0成功，-2未开始
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 步骤名称 
     * @return Name 步骤名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 步骤名称
     * @param Name 步骤名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

