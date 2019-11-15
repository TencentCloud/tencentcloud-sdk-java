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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficPackage  extends AbstractModel{

    /**
    * 流量包 Id
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 流量包类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 流量包大小（单位为 Byte）
    */
    @SerializedName("Bytes")
    @Expose
    private Integer Bytes;

    /**
    * 已消耗流量（单位为 Byte）
    */
    @SerializedName("BytesUsed")
    @Expose
    private Integer BytesUsed;

    /**
    * 流量包状态
enabled：已启用
expired：已过期
disabled：未启用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 流量包发放时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 流量包生效时间
    */
    @SerializedName("EnableTime")
    @Expose
    private String EnableTime;

    /**
    * 流量包过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 流量包是否续订
    */
    @SerializedName("ContractExtension")
    @Expose
    private Boolean ContractExtension;

    /**
    * 流量包是否自动续订
    */
    @SerializedName("AutoExtension")
    @Expose
    private Boolean AutoExtension;

    /**
    * 流量包来源
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
     * 获取流量包 Id
     * @return Id 流量包 Id
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置流量包 Id
     * @param Id 流量包 Id
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取流量包类型
     * @return Type 流量包类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置流量包类型
     * @param Type 流量包类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取流量包大小（单位为 Byte）
     * @return Bytes 流量包大小（单位为 Byte）
     */
    public Integer getBytes() {
        return this.Bytes;
    }

    /**
     * 设置流量包大小（单位为 Byte）
     * @param Bytes 流量包大小（单位为 Byte）
     */
    public void setBytes(Integer Bytes) {
        this.Bytes = Bytes;
    }

    /**
     * 获取已消耗流量（单位为 Byte）
     * @return BytesUsed 已消耗流量（单位为 Byte）
     */
    public Integer getBytesUsed() {
        return this.BytesUsed;
    }

    /**
     * 设置已消耗流量（单位为 Byte）
     * @param BytesUsed 已消耗流量（单位为 Byte）
     */
    public void setBytesUsed(Integer BytesUsed) {
        this.BytesUsed = BytesUsed;
    }

    /**
     * 获取流量包状态
enabled：已启用
expired：已过期
disabled：未启用
     * @return Status 流量包状态
enabled：已启用
expired：已过期
disabled：未启用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置流量包状态
enabled：已启用
expired：已过期
disabled：未启用
     * @param Status 流量包状态
enabled：已启用
expired：已过期
disabled：未启用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取流量包发放时间
     * @return CreateTime 流量包发放时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置流量包发放时间
     * @param CreateTime 流量包发放时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取流量包生效时间
     * @return EnableTime 流量包生效时间
     */
    public String getEnableTime() {
        return this.EnableTime;
    }

    /**
     * 设置流量包生效时间
     * @param EnableTime 流量包生效时间
     */
    public void setEnableTime(String EnableTime) {
        this.EnableTime = EnableTime;
    }

    /**
     * 获取流量包过期时间
     * @return ExpireTime 流量包过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * 设置流量包过期时间
     * @param ExpireTime 流量包过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * 获取流量包是否续订
     * @return ContractExtension 流量包是否续订
     */
    public Boolean getContractExtension() {
        return this.ContractExtension;
    }

    /**
     * 设置流量包是否续订
     * @param ContractExtension 流量包是否续订
     */
    public void setContractExtension(Boolean ContractExtension) {
        this.ContractExtension = ContractExtension;
    }

    /**
     * 获取流量包是否自动续订
     * @return AutoExtension 流量包是否自动续订
     */
    public Boolean getAutoExtension() {
        return this.AutoExtension;
    }

    /**
     * 设置流量包是否自动续订
     * @param AutoExtension 流量包是否自动续订
     */
    public void setAutoExtension(Boolean AutoExtension) {
        this.AutoExtension = AutoExtension;
    }

    /**
     * 获取流量包来源
     * @return Channel 流量包来源
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * 设置流量包来源
     * @param Channel 流量包来源
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Bytes", this.Bytes);
        this.setParamSimple(map, prefix + "BytesUsed", this.BytesUsed);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EnableTime", this.EnableTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ContractExtension", this.ContractExtension);
        this.setParamSimple(map, prefix + "AutoExtension", this.AutoExtension);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

