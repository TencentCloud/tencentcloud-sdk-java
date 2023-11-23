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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteWafStatus extends AbstractModel {

    /**
    * 路由的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 路由的 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    *  路由是否开启 WAF 防护
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * 路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * 路由对应服务的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 路由对应服务的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
     * Get 路由的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 路由的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 路由的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 路由的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 路由的 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 路由的 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 路由的 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 路由的 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get  路由是否开启 WAF 防护
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status  路由是否开启 WAF 防护
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set  路由是否开启 WAF 防护
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status  路由是否开启 WAF 防护
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Methods 方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set 方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param Methods 方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get 路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Paths 路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set 路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Paths 路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hosts 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hosts 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get 路由对应服务的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName 路由对应服务的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 路由对应服务的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName 路由对应服务的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 路由对应服务的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId 路由对应服务的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 路由对应服务的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId 路由对应服务的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public RouteWafStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteWafStatus(RouteWafStatus source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}

