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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DstInfo  extends AbstractModel{

    /**
    * 目标实例Id，如cdb-jd92ijd8
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 目标实例地域，如ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 目标实例vip。已废弃，无需填写
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 目标实例vport。已废弃，无需填写
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 目前只对MySQL有效。当为整实例迁移时，1-只读，0-可读写。
    */
    @SerializedName("ReadOnly")
    @Expose
    private Integer ReadOnly;

    /**
     * 获取目标实例Id，如cdb-jd92ijd8
     * @return InstanceId 目标实例Id，如cdb-jd92ijd8
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置目标实例Id，如cdb-jd92ijd8
     * @param InstanceId 目标实例Id，如cdb-jd92ijd8
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取目标实例地域，如ap-guangzhou
     * @return Region 目标实例地域，如ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置目标实例地域，如ap-guangzhou
     * @param Region 目标实例地域，如ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取目标实例vip。已废弃，无需填写
     * @return Ip 目标实例vip。已废弃，无需填写
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * 设置目标实例vip。已废弃，无需填写
     * @param Ip 目标实例vip。已废弃，无需填写
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * 获取目标实例vport。已废弃，无需填写
     * @return Port 目标实例vport。已废弃，无需填写
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置目标实例vport。已废弃，无需填写
     * @param Port 目标实例vport。已废弃，无需填写
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取目前只对MySQL有效。当为整实例迁移时，1-只读，0-可读写。
     * @return ReadOnly 目前只对MySQL有效。当为整实例迁移时，1-只读，0-可读写。
     */
    public Integer getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * 设置目前只对MySQL有效。当为整实例迁移时，1-只读，0-可读写。
     * @param ReadOnly 目前只对MySQL有效。当为整实例迁移时，1-只读，0-可读写。
     */
    public void setReadOnly(Integer ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);

    }
}

