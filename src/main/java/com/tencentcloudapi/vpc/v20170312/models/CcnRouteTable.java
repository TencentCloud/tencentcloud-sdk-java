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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnRouteTable extends AbstractModel {

    /**
    * 云联网ID。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 云联网路由表ID。
    */
    @SerializedName("CcnRouteTableId")
    @Expose
    private String CcnRouteTableId;

    /**
    * 云联网路由表名称。
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * 云联网路由表描述。
    */
    @SerializedName("RouteTableDescription")
    @Expose
    private String RouteTableDescription;

    /**
    * True：是默认路由表 False：非默认路由表。
    */
    @SerializedName("IsDefaultTable")
    @Expose
    private Boolean IsDefaultTable;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 云联网ID。 
     * @return CcnId 云联网ID。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网ID。
     * @param CcnId 云联网ID。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 云联网路由表ID。 
     * @return CcnRouteTableId 云联网路由表ID。
     */
    public String getCcnRouteTableId() {
        return this.CcnRouteTableId;
    }

    /**
     * Set 云联网路由表ID。
     * @param CcnRouteTableId 云联网路由表ID。
     */
    public void setCcnRouteTableId(String CcnRouteTableId) {
        this.CcnRouteTableId = CcnRouteTableId;
    }

    /**
     * Get 云联网路由表名称。 
     * @return RouteTableName 云联网路由表名称。
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set 云联网路由表名称。
     * @param RouteTableName 云联网路由表名称。
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * Get 云联网路由表描述。 
     * @return RouteTableDescription 云联网路由表描述。
     */
    public String getRouteTableDescription() {
        return this.RouteTableDescription;
    }

    /**
     * Set 云联网路由表描述。
     * @param RouteTableDescription 云联网路由表描述。
     */
    public void setRouteTableDescription(String RouteTableDescription) {
        this.RouteTableDescription = RouteTableDescription;
    }

    /**
     * Get True：是默认路由表 False：非默认路由表。 
     * @return IsDefaultTable True：是默认路由表 False：非默认路由表。
     */
    public Boolean getIsDefaultTable() {
        return this.IsDefaultTable;
    }

    /**
     * Set True：是默认路由表 False：非默认路由表。
     * @param IsDefaultTable True：是默认路由表 False：非默认路由表。
     */
    public void setIsDefaultTable(Boolean IsDefaultTable) {
        this.IsDefaultTable = IsDefaultTable;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public CcnRouteTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnRouteTable(CcnRouteTable source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CcnRouteTableId != null) {
            this.CcnRouteTableId = new String(source.CcnRouteTableId);
        }
        if (source.RouteTableName != null) {
            this.RouteTableName = new String(source.RouteTableName);
        }
        if (source.RouteTableDescription != null) {
            this.RouteTableDescription = new String(source.RouteTableDescription);
        }
        if (source.IsDefaultTable != null) {
            this.IsDefaultTable = new Boolean(source.IsDefaultTable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CcnRouteTableId", this.CcnRouteTableId);
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);
        this.setParamSimple(map, prefix + "RouteTableDescription", this.RouteTableDescription);
        this.setParamSimple(map, prefix + "IsDefaultTable", this.IsDefaultTable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

