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

public class SQLServerModifyConnectParam extends AbstractModel{

    /**
    * SQLServer连接源的实例资源【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * SQLServer的连接port【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * SQLServer连接源的实例vip【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceVip")
    @Expose
    private String ServiceVip;

    /**
    * SQLServer连接源的vpcId【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * SQLServer连接源的用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * SQLServer连接源的密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 是否更新到关联的Dip任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
     * Get SQLServer连接源的实例资源【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource SQLServer连接源的实例资源【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set SQLServer连接源的实例资源【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource SQLServer连接源的实例资源【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get SQLServer的连接port【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port SQLServer的连接port【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set SQLServer的连接port【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port SQLServer的连接port【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get SQLServer连接源的实例vip【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceVip SQLServer连接源的实例vip【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceVip() {
        return this.ServiceVip;
    }

    /**
     * Set SQLServer连接源的实例vip【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceVip SQLServer连接源的实例vip【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceVip(String ServiceVip) {
        this.ServiceVip = ServiceVip;
    }

    /**
     * Get SQLServer连接源的vpcId【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqVpcId SQLServer连接源的vpcId【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set SQLServer连接源的vpcId【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqVpcId SQLServer连接源的vpcId【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get SQLServer连接源的用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName SQLServer连接源的用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set SQLServer连接源的用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName SQLServer连接源的用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get SQLServer连接源的密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password SQLServer连接源的密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set SQLServer连接源的密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password SQLServer连接源的密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 是否更新到关联的Dip任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUpdate 是否更新到关联的Dip任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsUpdate() {
        return this.IsUpdate;
    }

    /**
     * Set 是否更新到关联的Dip任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUpdate 是否更新到关联的Dip任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUpdate(Boolean IsUpdate) {
        this.IsUpdate = IsUpdate;
    }

    public SQLServerModifyConnectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SQLServerModifyConnectParam(SQLServerModifyConnectParam source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
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
        if (source.IsUpdate != null) {
            this.IsUpdate = new Boolean(source.IsUpdate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ServiceVip", this.ServiceVip);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "IsUpdate", this.IsUpdate);

    }
}

