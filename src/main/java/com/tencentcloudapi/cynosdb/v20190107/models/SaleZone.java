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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaleZone extends AbstractModel{

    /**
    * 可用区英文名
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区数字ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 可用区中文名
    */
    @SerializedName("ZoneZh")
    @Expose
    private String ZoneZh;

    /**
    * 是否支持serverless集群<br>
0:不支持<br>
1:支持
    */
    @SerializedName("IsSupportServerless")
    @Expose
    private Long IsSupportServerless;

    /**
    * 是否支持普通集群<br>
0:不支持<br>
1:支持
    */
    @SerializedName("IsSupportNormal")
    @Expose
    private Long IsSupportNormal;

    /**
    * 物理区
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * 用户是否有可用区权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasPermission")
    @Expose
    private Boolean HasPermission;

    /**
    * 是否为全链路RDMA可用区
    */
    @SerializedName("IsWholeRdmaZone")
    @Expose
    private String IsWholeRdmaZone;

    /**
     * Get 可用区英文名 
     * @return Zone 可用区英文名
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区英文名
     * @param Zone 可用区英文名
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区数字ID 
     * @return ZoneId 可用区数字ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区数字ID
     * @param ZoneId 可用区数字ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区中文名 
     * @return ZoneZh 可用区中文名
     */
    public String getZoneZh() {
        return this.ZoneZh;
    }

    /**
     * Set 可用区中文名
     * @param ZoneZh 可用区中文名
     */
    public void setZoneZh(String ZoneZh) {
        this.ZoneZh = ZoneZh;
    }

    /**
     * Get 是否支持serverless集群<br>
0:不支持<br>
1:支持 
     * @return IsSupportServerless 是否支持serverless集群<br>
0:不支持<br>
1:支持
     */
    public Long getIsSupportServerless() {
        return this.IsSupportServerless;
    }

    /**
     * Set 是否支持serverless集群<br>
0:不支持<br>
1:支持
     * @param IsSupportServerless 是否支持serverless集群<br>
0:不支持<br>
1:支持
     */
    public void setIsSupportServerless(Long IsSupportServerless) {
        this.IsSupportServerless = IsSupportServerless;
    }

    /**
     * Get 是否支持普通集群<br>
0:不支持<br>
1:支持 
     * @return IsSupportNormal 是否支持普通集群<br>
0:不支持<br>
1:支持
     */
    public Long getIsSupportNormal() {
        return this.IsSupportNormal;
    }

    /**
     * Set 是否支持普通集群<br>
0:不支持<br>
1:支持
     * @param IsSupportNormal 是否支持普通集群<br>
0:不支持<br>
1:支持
     */
    public void setIsSupportNormal(Long IsSupportNormal) {
        this.IsSupportNormal = IsSupportNormal;
    }

    /**
     * Get 物理区 
     * @return PhysicalZone 物理区
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set 物理区
     * @param PhysicalZone 物理区
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get 用户是否有可用区权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasPermission 用户是否有可用区权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasPermission() {
        return this.HasPermission;
    }

    /**
     * Set 用户是否有可用区权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasPermission 用户是否有可用区权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasPermission(Boolean HasPermission) {
        this.HasPermission = HasPermission;
    }

    /**
     * Get 是否为全链路RDMA可用区 
     * @return IsWholeRdmaZone 是否为全链路RDMA可用区
     */
    public String getIsWholeRdmaZone() {
        return this.IsWholeRdmaZone;
    }

    /**
     * Set 是否为全链路RDMA可用区
     * @param IsWholeRdmaZone 是否为全链路RDMA可用区
     */
    public void setIsWholeRdmaZone(String IsWholeRdmaZone) {
        this.IsWholeRdmaZone = IsWholeRdmaZone;
    }

    public SaleZone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaleZone(SaleZone source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneZh != null) {
            this.ZoneZh = new String(source.ZoneZh);
        }
        if (source.IsSupportServerless != null) {
            this.IsSupportServerless = new Long(source.IsSupportServerless);
        }
        if (source.IsSupportNormal != null) {
            this.IsSupportNormal = new Long(source.IsSupportNormal);
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.HasPermission != null) {
            this.HasPermission = new Boolean(source.HasPermission);
        }
        if (source.IsWholeRdmaZone != null) {
            this.IsWholeRdmaZone = new String(source.IsWholeRdmaZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneZh", this.ZoneZh);
        this.setParamSimple(map, prefix + "IsSupportServerless", this.IsSupportServerless);
        this.setParamSimple(map, prefix + "IsSupportNormal", this.IsSupportNormal);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "HasPermission", this.HasPermission);
        this.setParamSimple(map, prefix + "IsWholeRdmaZone", this.IsWholeRdmaZone);

    }
}

