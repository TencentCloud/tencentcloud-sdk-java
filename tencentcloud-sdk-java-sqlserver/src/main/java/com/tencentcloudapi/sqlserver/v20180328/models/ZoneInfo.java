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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel{

    /**
    * 可用区英文ID，形如ap-guangzhou-1，表示广州一区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区中文名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 可用区数字ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 该可用区目前可售卖的规格ID，利用SpecId，结合接口DescribeProductConfig返回的数据，可获悉该可用区目前可售卖的规格大小
    */
    @SerializedName("SpecId")
    @Expose
    private Long SpecId;

    /**
    * 当前可用区与规格下，可售卖的数据库版本，形如2008R2（表示SQL Server 2008 R2）。其可选值有2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 可用区英文ID，形如ap-guangzhou-1，表示广州一区 
     * @return Zone 可用区英文ID，形如ap-guangzhou-1，表示广州一区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区英文ID，形如ap-guangzhou-1，表示广州一区
     * @param Zone 可用区英文ID，形如ap-guangzhou-1，表示广州一区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区中文名称 
     * @return ZoneName 可用区中文名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区中文名称
     * @param ZoneName 可用区中文名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
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
     * Get 该可用区目前可售卖的规格ID，利用SpecId，结合接口DescribeProductConfig返回的数据，可获悉该可用区目前可售卖的规格大小 
     * @return SpecId 该可用区目前可售卖的规格ID，利用SpecId，结合接口DescribeProductConfig返回的数据，可获悉该可用区目前可售卖的规格大小
     */
    public Long getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 该可用区目前可售卖的规格ID，利用SpecId，结合接口DescribeProductConfig返回的数据，可获悉该可用区目前可售卖的规格大小
     * @param SpecId 该可用区目前可售卖的规格ID，利用SpecId，结合接口DescribeProductConfig返回的数据，可获悉该可用区目前可售卖的规格大小
     */
    public void setSpecId(Long SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get 当前可用区与规格下，可售卖的数据库版本，形如2008R2（表示SQL Server 2008 R2）。其可选值有2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1） 
     * @return Version 当前可用区与规格下，可售卖的数据库版本，形如2008R2（表示SQL Server 2008 R2）。其可选值有2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 当前可用区与规格下，可售卖的数据库版本，形如2008R2（表示SQL Server 2008 R2）。其可选值有2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
     * @param Version 当前可用区与规格下，可售卖的数据库版本，形如2008R2（表示SQL Server 2008 R2）。其可选值有2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

