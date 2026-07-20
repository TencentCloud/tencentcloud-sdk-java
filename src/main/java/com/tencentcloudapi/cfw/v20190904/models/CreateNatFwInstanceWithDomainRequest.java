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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNatFwInstanceWithDomainRequest extends AbstractModel {

    /**
    * <p>防火墙实例名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>带宽</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>模式 1：接入模式；0：新增模式</p>
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * <p>新增模式传递参数，其中NewModeItems和NatgwList至少传递一种。</p>
    */
    @SerializedName("NewModeItems")
    @Expose
    private NewModeItems NewModeItems;

    /**
    * <p>接入模式接入的nat网关列表，其中NewModeItems和NatgwList至少传递一种。</p>
    */
    @SerializedName("NatGwList")
    @Expose
    private String [] NatGwList;

    /**
    * <p>主可用区，为空则选择默认可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>备可用区，为空则选择默认可用区</p>
    */
    @SerializedName("ZoneBak")
    @Expose
    private String ZoneBak;

    /**
    * <p>异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备</p>
    */
    @SerializedName("CrossAZone")
    @Expose
    private Long CrossAZone;

    /**
    * <p>0不创建域名,1创建域名</p>
    */
    @SerializedName("IsCreateDomain")
    @Expose
    private Long IsCreateDomain;

    /**
    * <p>如果要创建域名则必填</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>指定防火墙使用网段信息</p>
    */
    @SerializedName("FwCidrInfo")
    @Expose
    private FwCidrInfo FwCidrInfo;

    /**
     * Get <p>防火墙实例名称</p> 
     * @return Name <p>防火墙实例名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>防火墙实例名称</p>
     * @param Name <p>防火墙实例名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>带宽</p> 
     * @return Width <p>带宽</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>带宽</p>
     * @param Width <p>带宽</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>模式 1：接入模式；0：新增模式</p> 
     * @return Mode <p>模式 1：接入模式；0：新增模式</p>
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set <p>模式 1：接入模式；0：新增模式</p>
     * @param Mode <p>模式 1：接入模式；0：新增模式</p>
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>新增模式传递参数，其中NewModeItems和NatgwList至少传递一种。</p> 
     * @return NewModeItems <p>新增模式传递参数，其中NewModeItems和NatgwList至少传递一种。</p>
     */
    public NewModeItems getNewModeItems() {
        return this.NewModeItems;
    }

    /**
     * Set <p>新增模式传递参数，其中NewModeItems和NatgwList至少传递一种。</p>
     * @param NewModeItems <p>新增模式传递参数，其中NewModeItems和NatgwList至少传递一种。</p>
     */
    public void setNewModeItems(NewModeItems NewModeItems) {
        this.NewModeItems = NewModeItems;
    }

    /**
     * Get <p>接入模式接入的nat网关列表，其中NewModeItems和NatgwList至少传递一种。</p> 
     * @return NatGwList <p>接入模式接入的nat网关列表，其中NewModeItems和NatgwList至少传递一种。</p>
     */
    public String [] getNatGwList() {
        return this.NatGwList;
    }

    /**
     * Set <p>接入模式接入的nat网关列表，其中NewModeItems和NatgwList至少传递一种。</p>
     * @param NatGwList <p>接入模式接入的nat网关列表，其中NewModeItems和NatgwList至少传递一种。</p>
     */
    public void setNatGwList(String [] NatGwList) {
        this.NatGwList = NatGwList;
    }

    /**
     * Get <p>主可用区，为空则选择默认可用区</p> 
     * @return Zone <p>主可用区，为空则选择默认可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>主可用区，为空则选择默认可用区</p>
     * @param Zone <p>主可用区，为空则选择默认可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>备可用区，为空则选择默认可用区</p> 
     * @return ZoneBak <p>备可用区，为空则选择默认可用区</p>
     */
    public String getZoneBak() {
        return this.ZoneBak;
    }

    /**
     * Set <p>备可用区，为空则选择默认可用区</p>
     * @param ZoneBak <p>备可用区，为空则选择默认可用区</p>
     */
    public void setZoneBak(String ZoneBak) {
        this.ZoneBak = ZoneBak;
    }

    /**
     * Get <p>异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备</p> 
     * @return CrossAZone <p>异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备</p>
     */
    public Long getCrossAZone() {
        return this.CrossAZone;
    }

    /**
     * Set <p>异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备</p>
     * @param CrossAZone <p>异地灾备 1：使用异地灾备；0：不使用异地灾备；为空则默认不使用异地灾备</p>
     */
    public void setCrossAZone(Long CrossAZone) {
        this.CrossAZone = CrossAZone;
    }

    /**
     * Get <p>0不创建域名,1创建域名</p> 
     * @return IsCreateDomain <p>0不创建域名,1创建域名</p>
     */
    public Long getIsCreateDomain() {
        return this.IsCreateDomain;
    }

    /**
     * Set <p>0不创建域名,1创建域名</p>
     * @param IsCreateDomain <p>0不创建域名,1创建域名</p>
     */
    public void setIsCreateDomain(Long IsCreateDomain) {
        this.IsCreateDomain = IsCreateDomain;
    }

    /**
     * Get <p>如果要创建域名则必填</p> 
     * @return Domain <p>如果要创建域名则必填</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>如果要创建域名则必填</p>
     * @param Domain <p>如果要创建域名则必填</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>指定防火墙使用网段信息</p> 
     * @return FwCidrInfo <p>指定防火墙使用网段信息</p>
     */
    public FwCidrInfo getFwCidrInfo() {
        return this.FwCidrInfo;
    }

    /**
     * Set <p>指定防火墙使用网段信息</p>
     * @param FwCidrInfo <p>指定防火墙使用网段信息</p>
     */
    public void setFwCidrInfo(FwCidrInfo FwCidrInfo) {
        this.FwCidrInfo = FwCidrInfo;
    }

    public CreateNatFwInstanceWithDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNatFwInstanceWithDomainRequest(CreateNatFwInstanceWithDomainRequest source) {
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
        if (source.IsCreateDomain != null) {
            this.IsCreateDomain = new Long(source.IsCreateDomain);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.FwCidrInfo != null) {
            this.FwCidrInfo = new FwCidrInfo(source.FwCidrInfo);
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
        this.setParamSimple(map, prefix + "IsCreateDomain", this.IsCreateDomain);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "FwCidrInfo.", this.FwCidrInfo);

    }
}

