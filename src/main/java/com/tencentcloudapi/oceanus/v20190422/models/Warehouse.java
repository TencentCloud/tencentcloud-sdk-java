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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Warehouse extends AbstractModel {

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * location
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * catalogtype
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogType")
    @Expose
    private String CatalogType;

    /**
    * uri
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * warehouse url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarehouseUrl")
    @Expose
    private String WarehouseUrl;

    /**
    * 认证方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Authentication")
    @Expose
    private String Authentication;

    /**
    * 资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRefs")
    @Expose
    private ResourceRefLatest [] ResourceRefs;

    /**
    * hive warehouse uri
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HiveUri")
    @Expose
    private String HiveUri;

    /**
    * 高级参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get location
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location location
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set location
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location location
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get catalogtype
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogType catalogtype
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogType() {
        return this.CatalogType;
    }

    /**
     * Set catalogtype
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogType catalogtype
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogType(String CatalogType) {
        this.CatalogType = CatalogType;
    }

    /**
     * Get uri
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uri uri
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set uri
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uri uri
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get warehouse url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarehouseUrl warehouse url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarehouseUrl() {
        return this.WarehouseUrl;
    }

    /**
     * Set warehouse url
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarehouseUrl warehouse url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarehouseUrl(String WarehouseUrl) {
        this.WarehouseUrl = WarehouseUrl;
    }

    /**
     * Get 认证方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Authentication 认证方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set 认证方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Authentication 认证方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthentication(String Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * Get 资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRefs 资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceRefLatest [] getResourceRefs() {
        return this.ResourceRefs;
    }

    /**
     * Set 资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRefs 资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRefs(ResourceRefLatest [] ResourceRefs) {
        this.ResourceRefs = ResourceRefs;
    }

    /**
     * Get hive warehouse uri
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HiveUri hive warehouse uri
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHiveUri() {
        return this.HiveUri;
    }

    /**
     * Set hive warehouse uri
注意：此字段可能返回 null，表示取不到有效值。
     * @param HiveUri hive warehouse uri
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHiveUri(String HiveUri) {
        this.HiveUri = HiveUri;
    }

    /**
     * Get 高级参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 高级参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 高级参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 高级参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    public Warehouse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Warehouse(Warehouse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.CatalogType != null) {
            this.CatalogType = new String(source.CatalogType);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
        if (source.WarehouseUrl != null) {
            this.WarehouseUrl = new String(source.WarehouseUrl);
        }
        if (source.Authentication != null) {
            this.Authentication = new String(source.Authentication);
        }
        if (source.ResourceRefs != null) {
            this.ResourceRefs = new ResourceRefLatest[source.ResourceRefs.length];
            for (int i = 0; i < source.ResourceRefs.length; i++) {
                this.ResourceRefs[i] = new ResourceRefLatest(source.ResourceRefs[i]);
            }
        }
        if (source.HiveUri != null) {
            this.HiveUri = new String(source.HiveUri);
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "CatalogType", this.CatalogType);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "WarehouseUrl", this.WarehouseUrl);
        this.setParamSimple(map, prefix + "Authentication", this.Authentication);
        this.setParamArrayObj(map, prefix + "ResourceRefs.", this.ResourceRefs);
        this.setParamSimple(map, prefix + "HiveUri", this.HiveUri);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);

    }
}

