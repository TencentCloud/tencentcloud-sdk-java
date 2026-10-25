/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NameIdentifier extends AbstractModel {

    /**
    * <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String [] Namespace;

    /**
    * <p>元数据来源，取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。响应体始终返回具体来源值，不会返回CATALOG_SOURCE_ALL。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogSource")
    @Expose
    private String CatalogSource;

    /**
    * <p>TCLAKE Catalog取值：（注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5）<br>SETATS Catalog取值：（Creating=30, Available=31, Deleted=32, Scaling=33, Isolated=34, Failed=35，未知=0）</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String [] Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>元数据来源，取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。响应体始终返回具体来源值，不会返回CATALOG_SOURCE_ALL。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogSource <p>元数据来源，取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。响应体始终返回具体来源值，不会返回CATALOG_SOURCE_ALL。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogSource() {
        return this.CatalogSource;
    }

    /**
     * Set <p>元数据来源，取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。响应体始终返回具体来源值，不会返回CATALOG_SOURCE_ALL。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogSource <p>元数据来源，取值：METALAKE（专业版tclake）/ CONNECTION（分析版Linked Catalog）/ SETATS（Setats元数据）。响应体始终返回具体来源值，不会返回CATALOG_SOURCE_ALL。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogSource(String CatalogSource) {
        this.CatalogSource = CatalogSource;
    }

    /**
     * Get <p>TCLAKE Catalog取值：（注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5）<br>SETATS Catalog取值：（Creating=30, Available=31, Deleted=32, Scaling=33, Isolated=34, Failed=35，未知=0）</p> 
     * @return Status <p>TCLAKE Catalog取值：（注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5）<br>SETATS Catalog取值：（Creating=30, Available=31, Deleted=32, Scaling=33, Isolated=34, Failed=35，未知=0）</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>TCLAKE Catalog取值：（注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5）<br>SETATS Catalog取值：（Creating=30, Available=31, Deleted=32, Scaling=33, Isolated=34, Failed=35，未知=0）</p>
     * @param Status <p>TCLAKE Catalog取值：（注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5）<br>SETATS Catalog取值：（Creating=30, Available=31, Deleted=32, Scaling=33, Isolated=34, Failed=35，未知=0）</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public NameIdentifier() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NameIdentifier(NameIdentifier source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String[source.Namespace.length];
            for (int i = 0; i < source.Namespace.length; i++) {
                this.Namespace[i] = new String(source.Namespace[i]);
            }
        }
        if (source.CatalogSource != null) {
            this.CatalogSource = new String(source.CatalogSource);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Namespace.", this.Namespace);
        this.setParamSimple(map, prefix + "CatalogSource", this.CatalogSource);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

