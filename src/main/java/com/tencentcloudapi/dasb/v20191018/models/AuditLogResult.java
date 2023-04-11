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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogResult extends AbstractModel{

    /**
    * 被审计会话的Sid
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * 审计者的编号
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 审计动作发生的时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 审计者的Ip
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 审计动作类型，1--回放、2--中断、3--监控
    */
    @SerializedName("Operation")
    @Expose
    private Long Operation;

    /**
    * 被审计主机的Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 被审计主机的主机名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 被审计会话所属的类型，如字符会话
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 被审计主机的内部Ip
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 被审计主机的外部Ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 审计者的子账号
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
     * Get 被审计会话的Sid 
     * @return Sid 被审计会话的Sid
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 被审计会话的Sid
     * @param Sid 被审计会话的Sid
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get 审计者的编号 
     * @return Uin 审计者的编号
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 审计者的编号
     * @param Uin 审计者的编号
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 审计动作发生的时间 
     * @return Time 审计动作发生的时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 审计动作发生的时间
     * @param Time 审计动作发生的时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 审计者的Ip 
     * @return ClientIp 审计者的Ip
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 审计者的Ip
     * @param ClientIp 审计者的Ip
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 审计动作类型，1--回放、2--中断、3--监控 
     * @return Operation 审计动作类型，1--回放、2--中断、3--监控
     */
    public Long getOperation() {
        return this.Operation;
    }

    /**
     * Set 审计动作类型，1--回放、2--中断、3--监控
     * @param Operation 审计动作类型，1--回放、2--中断、3--监控
     */
    public void setOperation(Long Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 被审计主机的Id 
     * @return InstanceId 被审计主机的Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 被审计主机的Id
     * @param InstanceId 被审计主机的Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 被审计主机的主机名 
     * @return DeviceName 被审计主机的主机名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 被审计主机的主机名
     * @param DeviceName 被审计主机的主机名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 被审计会话所属的类型，如字符会话 
     * @return Protocol 被审计会话所属的类型，如字符会话
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 被审计会话所属的类型，如字符会话
     * @param Protocol 被审计会话所属的类型，如字符会话
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 被审计主机的内部Ip 
     * @return PrivateIp 被审计主机的内部Ip
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 被审计主机的内部Ip
     * @param PrivateIp 被审计主机的内部Ip
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 被审计主机的外部Ip 
     * @return PublicIp 被审计主机的外部Ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 被审计主机的外部Ip
     * @param PublicIp 被审计主机的外部Ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 审计者的子账号 
     * @return SubAccountUin 审计者的子账号
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 审计者的子账号
     * @param SubAccountUin 审计者的子账号
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    public AuditLogResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogResult(AuditLogResult source) {
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.Operation != null) {
            this.Operation = new Long(source.Operation);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);

    }
}

