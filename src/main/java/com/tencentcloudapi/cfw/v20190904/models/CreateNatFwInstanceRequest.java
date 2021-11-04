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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNatFwInstanceRequest extends AbstractModel{

    /**
    * 防火墙实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 带宽
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 模式 1：接入模式；0：新增模式
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 新增模式传递参数，其中NewModeItems和NatgwList至少传递一种。
    */
    @SerializedName("NewModeItems")
    @Expose
    private NewModeItems NewModeItems;

    /**
    * 接入模式接入的nat网关列表，其中NewModeItems和NatgwList至少传递一种。
    */
    @SerializedName("NatGwList")
    @Expose
    private String [] NatGwList;

    /**
    * 主可用区，为空则选择默认可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 备可用区，为空则选择默认可用区
    */
    @SerializedName("ZoneBak")
    @Expose
    private String ZoneBak;

    /**
    * 异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备
    */
    @SerializedName("CrossAZone")
    @Expose
    private Long CrossAZone;

    /**
     * Get 防火墙实例名称 
     * @return Name 防火墙实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 防火墙实例名称
     * @param Name 防火墙实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 带宽 
     * @return Width 带宽
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 带宽
     * @param Width 带宽
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 模式 1：接入模式；0：新增模式 
     * @return Mode 模式 1：接入模式；0：新增模式
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 模式 1：接入模式；0：新增模式
     * @param Mode 模式 1：接入模式；0：新增模式
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 新增模式传递参数，其中NewModeItems和NatgwList至少传递一种。 
     * @return NewModeItems 新增模式传递参数，其中NewModeItems和NatgwList至少传递一种。
     */
    public NewModeItems getNewModeItems() {
        return this.NewModeItems;
    }

    /**
     * Set 新增模式传递参数，其中NewModeItems和NatgwList至少传递一种。
     * @param NewModeItems 新增模式传递参数，其中NewModeItems和NatgwList至少传递一种。
     */
    public void setNewModeItems(NewModeItems NewModeItems) {
        this.NewModeItems = NewModeItems;
    }

    /**
     * Get 接入模式接入的nat网关列表，其中NewModeItems和NatgwList至少传递一种。 
     * @return NatGwList 接入模式接入的nat网关列表，其中NewModeItems和NatgwList至少传递一种。
     */
    public String [] getNatGwList() {
        return this.NatGwList;
    }

    /**
     * Set 接入模式接入的nat网关列表，其中NewModeItems和NatgwList至少传递一种。
     * @param NatGwList 接入模式接入的nat网关列表，其中NewModeItems和NatgwList至少传递一种。
     */
    public void setNatGwList(String [] NatGwList) {
        this.NatGwList = NatGwList;
    }

    /**
     * Get 主可用区，为空则选择默认可用区 
     * @return Zone 主可用区，为空则选择默认可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 主可用区，为空则选择默认可用区
     * @param Zone 主可用区，为空则选择默认可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 备可用区，为空则选择默认可用区 
     * @return ZoneBak 备可用区，为空则选择默认可用区
     */
    public String getZoneBak() {
        return this.ZoneBak;
    }

    /**
     * Set 备可用区，为空则选择默认可用区
     * @param ZoneBak 备可用区，为空则选择默认可用区
     */
    public void setZoneBak(String ZoneBak) {
        this.ZoneBak = ZoneBak;
    }

    /**
     * Get 异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备 
     * @return CrossAZone 异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备
     */
    public Long getCrossAZone() {
        return this.CrossAZone;
    }

    /**
     * Set 异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备
     * @param CrossAZone 异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备
     */
    public void setCrossAZone(Long CrossAZone) {
        this.CrossAZone = CrossAZone;
    }

    public CreateNatFwInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNatFwInstanceRequest(CreateNatFwInstanceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.NewModeItems != null) {
            this.NewModeItems = new NewModeItems(source.NewModeItems);
        }
        if (source.NatGwList != null) {
            this.NatGwList = new String[source.NatGwList.length];
            for (int i = 0; i < source.NatGwList.length; i++) {
                this.NatGwList[i] = new String(source.NatGwList[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneBak != null) {
            this.ZoneBak = new String(source.ZoneBak);
        }
        if (source.CrossAZone != null) {
            this.CrossAZone = new Long(source.CrossAZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "NewModeItems.", this.NewModeItems);
        this.setParamArraySimple(map, prefix + "NatGwList.", this.NatGwList);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneBak", this.ZoneBak);
        this.setParamSimple(map, prefix + "CrossAZone", this.CrossAZone);

    }
}

