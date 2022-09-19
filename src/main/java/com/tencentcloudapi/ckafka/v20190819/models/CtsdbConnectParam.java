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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CtsdbConnectParam extends AbstractModel{

    /**
    * Ctsdb的连接port
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Ctsdb连接源的实例vip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * Ctsdb连接源的vpcId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Ctsdb连接源的用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Ctsdb连接源的密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Ctsdb连接源的实例资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
     * Get Ctsdb的连接port
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port Ctsdb的连接port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Ctsdb的连接port
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port Ctsdb的连接port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Ctsdb连接源的实例vip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceVip Ctsdb连接源的实例vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set Ctsdb连接源的实例vip
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceVip Ctsdb连接源的实例vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get Ctsdb连接源的vpcId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqVpcId Ctsdb连接源的vpcId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Ctsdb连接源的vpcId
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqVpcId Ctsdb连接源的vpcId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Ctsdb连接源的用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName Ctsdb连接源的用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Ctsdb连接源的用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName Ctsdb连接源的用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Ctsdb连接源的密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password Ctsdb连接源的密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Ctsdb连接源的密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password Ctsdb连接源的密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Ctsdb连接源的实例资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource Ctsdb连接源的实例资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Ctsdb连接源的实例资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource Ctsdb连接源的实例资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    public CtsdbConnectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CtsdbConnectParam(CtsdbConnectParam source) {
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ServiceVip != null) {
            this.ServiceVip = new String(source.ServiceVip);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Resource", this.Resource);

    }
}

