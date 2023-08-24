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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserDomainInfo extends AbstractModel{

    /**
    * 用户id
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名id
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * waf类型
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 指定域名访问日志字段的开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WriteConfig")
    @Expose
    private String WriteConfig;

    /**
    * 指定域名是否写cls的开关 1:写 0:不写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cls")
    @Expose
    private Long Cls;

    /**
     * Get 用户id 
     * @return Appid 用户id
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 用户id
     * @param Appid 用户id
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名id 
     * @return DomainId 域名id
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名id
     * @param DomainId 域名id
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get waf类型 
     * @return Edition waf类型
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set waf类型
     * @param Edition waf类型
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 指定域名访问日志字段的开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WriteConfig 指定域名访问日志字段的开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWriteConfig() {
        return this.WriteConfig;
    }

    /**
     * Set 指定域名访问日志字段的开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param WriteConfig 指定域名访问日志字段的开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWriteConfig(String WriteConfig) {
        this.WriteConfig = WriteConfig;
    }

    /**
     * Get 指定域名是否写cls的开关 1:写 0:不写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cls 指定域名是否写cls的开关 1:写 0:不写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCls() {
        return this.Cls;
    }

    /**
     * Set 指定域名是否写cls的开关 1:写 0:不写
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cls 指定域名是否写cls的开关 1:写 0:不写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCls(Long Cls) {
        this.Cls = Cls;
    }

    public UserDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDomainInfo(UserDomainInfo source) {
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.WriteConfig != null) {
            this.WriteConfig = new String(source.WriteConfig);
        }
        if (source.Cls != null) {
            this.Cls = new Long(source.Cls);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "WriteConfig", this.WriteConfig);
        this.setParamSimple(map, prefix + "Cls", this.Cls);

    }
}

