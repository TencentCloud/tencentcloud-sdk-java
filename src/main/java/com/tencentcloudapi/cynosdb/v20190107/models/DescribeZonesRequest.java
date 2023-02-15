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

public class DescribeZonesRequest extends AbstractModel{

    /**
    * 是否包含虚拟区
    */
    @SerializedName("IncludeVirtualZones")
    @Expose
    private Boolean IncludeVirtualZones;

    /**
    * 是否展示地域下所有可用区，并显示用户每个可用区权限
    */
    @SerializedName("ShowPermission")
    @Expose
    private Boolean ShowPermission;

    /**
     * Get 是否包含虚拟区 
     * @return IncludeVirtualZones 是否包含虚拟区
     */
    public Boolean getIncludeVirtualZones() {
        return this.IncludeVirtualZones;
    }

    /**
     * Set 是否包含虚拟区
     * @param IncludeVirtualZones 是否包含虚拟区
     */
    public void setIncludeVirtualZones(Boolean IncludeVirtualZones) {
        this.IncludeVirtualZones = IncludeVirtualZones;
    }

    /**
     * Get 是否展示地域下所有可用区，并显示用户每个可用区权限 
     * @return ShowPermission 是否展示地域下所有可用区，并显示用户每个可用区权限
     */
    public Boolean getShowPermission() {
        return this.ShowPermission;
    }

    /**
     * Set 是否展示地域下所有可用区，并显示用户每个可用区权限
     * @param ShowPermission 是否展示地域下所有可用区，并显示用户每个可用区权限
     */
    public void setShowPermission(Boolean ShowPermission) {
        this.ShowPermission = ShowPermission;
    }

    public DescribeZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZonesRequest(DescribeZonesRequest source) {
        if (source.IncludeVirtualZones != null) {
            this.IncludeVirtualZones = new Boolean(source.IncludeVirtualZones);
        }
        if (source.ShowPermission != null) {
            this.ShowPermission = new Boolean(source.ShowPermission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IncludeVirtualZones", this.IncludeVirtualZones);
        this.setParamSimple(map, prefix + "ShowPermission", this.ShowPermission);

    }
}

