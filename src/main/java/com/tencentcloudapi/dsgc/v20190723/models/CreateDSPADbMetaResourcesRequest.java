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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDSPADbMetaResourcesRequest extends AbstractModel{

    /**
    * DSPA实例ID。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 资源类型，支持：cdb（云数据库 MySQL）、dcdb（TDSQL MySQL版）、mariadb（云数据库 MariaDB）、postgres（云数据库 PostgreSQL）、cynosdbpg（TDSQL-C PostgreSQL版）、cynosdbmysql（TDSQL-C MySQL版）
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * 资源所处地域。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 用来标记本次更新是否已经是最后一次，可选值：continue（后续还需要更新）、finished（本次是最后一次更新）。
    */
    @SerializedName("UpdateStatus")
    @Expose
    private String UpdateStatus;

    /**
    * 本次更新的ID号，用来标记一次完整的更新过程。
    */
    @SerializedName("UpdateId")
    @Expose
    private String UpdateId;

    /**
    * 云上资源列表。
    */
    @SerializedName("Items")
    @Expose
    private DspaCloudResourceMeta [] Items;

    /**
     * Get DSPA实例ID。 
     * @return DspaId DSPA实例ID。
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID。
     * @param DspaId DSPA实例ID。
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 资源类型，支持：cdb（云数据库 MySQL）、dcdb（TDSQL MySQL版）、mariadb（云数据库 MariaDB）、postgres（云数据库 PostgreSQL）、cynosdbpg（TDSQL-C PostgreSQL版）、cynosdbmysql（TDSQL-C MySQL版） 
     * @return MetaType 资源类型，支持：cdb（云数据库 MySQL）、dcdb（TDSQL MySQL版）、mariadb（云数据库 MariaDB）、postgres（云数据库 PostgreSQL）、cynosdbpg（TDSQL-C PostgreSQL版）、cynosdbmysql（TDSQL-C MySQL版）
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set 资源类型，支持：cdb（云数据库 MySQL）、dcdb（TDSQL MySQL版）、mariadb（云数据库 MariaDB）、postgres（云数据库 PostgreSQL）、cynosdbpg（TDSQL-C PostgreSQL版）、cynosdbmysql（TDSQL-C MySQL版）
     * @param MetaType 资源类型，支持：cdb（云数据库 MySQL）、dcdb（TDSQL MySQL版）、mariadb（云数据库 MariaDB）、postgres（云数据库 PostgreSQL）、cynosdbpg（TDSQL-C PostgreSQL版）、cynosdbmysql（TDSQL-C MySQL版）
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get 资源所处地域。 
     * @return ResourceRegion 资源所处地域。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所处地域。
     * @param ResourceRegion 资源所处地域。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 用来标记本次更新是否已经是最后一次，可选值：continue（后续还需要更新）、finished（本次是最后一次更新）。 
     * @return UpdateStatus 用来标记本次更新是否已经是最后一次，可选值：continue（后续还需要更新）、finished（本次是最后一次更新）。
     */
    public String getUpdateStatus() {
        return this.UpdateStatus;
    }

    /**
     * Set 用来标记本次更新是否已经是最后一次，可选值：continue（后续还需要更新）、finished（本次是最后一次更新）。
     * @param UpdateStatus 用来标记本次更新是否已经是最后一次，可选值：continue（后续还需要更新）、finished（本次是最后一次更新）。
     */
    public void setUpdateStatus(String UpdateStatus) {
        this.UpdateStatus = UpdateStatus;
    }

    /**
     * Get 本次更新的ID号，用来标记一次完整的更新过程。 
     * @return UpdateId 本次更新的ID号，用来标记一次完整的更新过程。
     */
    public String getUpdateId() {
        return this.UpdateId;
    }

    /**
     * Set 本次更新的ID号，用来标记一次完整的更新过程。
     * @param UpdateId 本次更新的ID号，用来标记一次完整的更新过程。
     */
    public void setUpdateId(String UpdateId) {
        this.UpdateId = UpdateId;
    }

    /**
     * Get 云上资源列表。 
     * @return Items 云上资源列表。
     */
    public DspaCloudResourceMeta [] getItems() {
        return this.Items;
    }

    /**
     * Set 云上资源列表。
     * @param Items 云上资源列表。
     */
    public void setItems(DspaCloudResourceMeta [] Items) {
        this.Items = Items;
    }

    public CreateDSPADbMetaResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDSPADbMetaResourcesRequest(CreateDSPADbMetaResourcesRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.UpdateStatus != null) {
            this.UpdateStatus = new String(source.UpdateStatus);
        }
        if (source.UpdateId != null) {
            this.UpdateId = new String(source.UpdateId);
        }
        if (source.Items != null) {
            this.Items = new DspaCloudResourceMeta[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DspaCloudResourceMeta(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "UpdateStatus", this.UpdateStatus);
        this.setParamSimple(map, prefix + "UpdateId", this.UpdateId);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

