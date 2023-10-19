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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindDSPAResourceDatabasesRequest extends AbstractModel {

    /**
    * DSPA实例ID。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 数据库实例ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 数据库实例类型。
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * 绑定DB列表。
    */
    @SerializedName("BindDbItems")
    @Expose
    private DbResourceItem [] BindDbItems;

    /**
    * 解绑DB列表。
    */
    @SerializedName("UnbindDbItems")
    @Expose
    private DbResourceItem [] UnbindDbItems;

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
     * Get 数据库实例ID。 
     * @return ResourceId 数据库实例ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 数据库实例ID。
     * @param ResourceId 数据库实例ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 数据库实例类型。 
     * @return MetaType 数据库实例类型。
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set 数据库实例类型。
     * @param MetaType 数据库实例类型。
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get 绑定DB列表。 
     * @return BindDbItems 绑定DB列表。
     */
    public DbResourceItem [] getBindDbItems() {
        return this.BindDbItems;
    }

    /**
     * Set 绑定DB列表。
     * @param BindDbItems 绑定DB列表。
     */
    public void setBindDbItems(DbResourceItem [] BindDbItems) {
        this.BindDbItems = BindDbItems;
    }

    /**
     * Get 解绑DB列表。 
     * @return UnbindDbItems 解绑DB列表。
     */
    public DbResourceItem [] getUnbindDbItems() {
        return this.UnbindDbItems;
    }

    /**
     * Set 解绑DB列表。
     * @param UnbindDbItems 解绑DB列表。
     */
    public void setUnbindDbItems(DbResourceItem [] UnbindDbItems) {
        this.UnbindDbItems = UnbindDbItems;
    }

    public BindDSPAResourceDatabasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindDSPAResourceDatabasesRequest(BindDSPAResourceDatabasesRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.BindDbItems != null) {
            this.BindDbItems = new DbResourceItem[source.BindDbItems.length];
            for (int i = 0; i < source.BindDbItems.length; i++) {
                this.BindDbItems[i] = new DbResourceItem(source.BindDbItems[i]);
            }
        }
        if (source.UnbindDbItems != null) {
            this.UnbindDbItems = new DbResourceItem[source.UnbindDbItems.length];
            for (int i = 0; i < source.UnbindDbItems.length; i++) {
                this.UnbindDbItems[i] = new DbResourceItem(source.UnbindDbItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamArrayObj(map, prefix + "BindDbItems.", this.BindDbItems);
        this.setParamArrayObj(map, prefix + "UnbindDbItems.", this.UnbindDbItems);

    }
}

