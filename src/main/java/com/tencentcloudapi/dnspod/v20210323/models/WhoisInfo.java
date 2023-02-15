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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhoisInfo extends AbstractModel{

    /**
    * 联系信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Contacts")
    @Expose
    private WhoisContact Contacts;

    /**
    * 域名注册时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationDate")
    @Expose
    private String CreationDate;

    /**
    * 域名到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * 是否是在腾讯云注册的域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsQcloud")
    @Expose
    private Boolean IsQcloud;

    /**
    * 是否当前操作帐号注册的域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsQcloudOwner")
    @Expose
    private Boolean IsQcloudOwner;

    /**
    * 域名配置的NS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * Whois原始信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Raw")
    @Expose
    private String [] Raw;

    /**
    * 域名注册商
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Registrar")
    @Expose
    private String [] Registrar;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 更新日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedDate")
    @Expose
    private String UpdatedDate;

    /**
     * Get 联系信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Contacts 联系信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WhoisContact getContacts() {
        return this.Contacts;
    }

    /**
     * Set 联系信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Contacts 联系信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContacts(WhoisContact Contacts) {
        this.Contacts = Contacts;
    }

    /**
     * Get 域名注册时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationDate 域名注册时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationDate() {
        return this.CreationDate;
    }

    /**
     * Set 域名注册时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationDate 域名注册时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    /**
     * Get 域名到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpirationDate 域名到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set 域名到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpirationDate 域名到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get 是否是在腾讯云注册的域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsQcloud 是否是在腾讯云注册的域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsQcloud() {
        return this.IsQcloud;
    }

    /**
     * Set 是否是在腾讯云注册的域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsQcloud 是否是在腾讯云注册的域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsQcloud(Boolean IsQcloud) {
        this.IsQcloud = IsQcloud;
    }

    /**
     * Get 是否当前操作帐号注册的域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsQcloudOwner 是否当前操作帐号注册的域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsQcloudOwner() {
        return this.IsQcloudOwner;
    }

    /**
     * Set 是否当前操作帐号注册的域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsQcloudOwner 是否当前操作帐号注册的域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsQcloudOwner(Boolean IsQcloudOwner) {
        this.IsQcloudOwner = IsQcloudOwner;
    }

    /**
     * Get 域名配置的NS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameServers 域名配置的NS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set 域名配置的NS
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameServers 域名配置的NS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get Whois原始信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Raw Whois原始信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRaw() {
        return this.Raw;
    }

    /**
     * Set Whois原始信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Raw Whois原始信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRaw(String [] Raw) {
        this.Raw = Raw;
    }

    /**
     * Get 域名注册商
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Registrar 域名注册商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRegistrar() {
        return this.Registrar;
    }

    /**
     * Set 域名注册商
注意：此字段可能返回 null，表示取不到有效值。
     * @param Registrar 域名注册商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistrar(String [] Registrar) {
        this.Registrar = Registrar;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 更新日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedDate 更新日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedDate() {
        return this.UpdatedDate;
    }

    /**
     * Set 更新日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedDate 更新日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedDate(String UpdatedDate) {
        this.UpdatedDate = UpdatedDate;
    }

    public WhoisInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhoisInfo(WhoisInfo source) {
        if (source.Contacts != null) {
            this.Contacts = new WhoisContact(source.Contacts);
        }
        if (source.CreationDate != null) {
            this.CreationDate = new String(source.CreationDate);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.IsQcloud != null) {
            this.IsQcloud = new Boolean(source.IsQcloud);
        }
        if (source.IsQcloudOwner != null) {
            this.IsQcloudOwner = new Boolean(source.IsQcloudOwner);
        }
        if (source.NameServers != null) {
            this.NameServers = new String[source.NameServers.length];
            for (int i = 0; i < source.NameServers.length; i++) {
                this.NameServers[i] = new String(source.NameServers[i]);
            }
        }
        if (source.Raw != null) {
            this.Raw = new String[source.Raw.length];
            for (int i = 0; i < source.Raw.length; i++) {
                this.Raw[i] = new String(source.Raw[i]);
            }
        }
        if (source.Registrar != null) {
            this.Registrar = new String[source.Registrar.length];
            for (int i = 0; i < source.Registrar.length; i++) {
                this.Registrar[i] = new String(source.Registrar[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.UpdatedDate != null) {
            this.UpdatedDate = new String(source.UpdatedDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Contacts.", this.Contacts);
        this.setParamSimple(map, prefix + "CreationDate", this.CreationDate);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "IsQcloud", this.IsQcloud);
        this.setParamSimple(map, prefix + "IsQcloudOwner", this.IsQcloudOwner);
        this.setParamArraySimple(map, prefix + "NameServers.", this.NameServers);
        this.setParamArraySimple(map, prefix + "Raw.", this.Raw);
        this.setParamArraySimple(map, prefix + "Registrar.", this.Registrar);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "UpdatedDate", this.UpdatedDate);

    }
}

