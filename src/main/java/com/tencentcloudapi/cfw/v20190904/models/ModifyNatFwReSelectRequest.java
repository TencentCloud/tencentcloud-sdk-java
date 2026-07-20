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

public class ModifyNatFwReSelectRequest extends AbstractModel {

    /**
    * <p>模式 1：接入模式；0：新增模式</p>
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * <p>防火墙实例id</p>
    */
    @SerializedName("CfwInstance")
    @Expose
    private String CfwInstance;

    /**
    * <p>接入模式重新接入的nat网关列表，其中NatGwList和VpcList只能传递一个。</p>
    */
    @SerializedName("NatGwList")
    @Expose
    private String [] NatGwList;

    /**
    * <p>新增模式重新接入的vpc列表，其中NatGwList和NatgwList只能传递一个。</p>
    */
    @SerializedName("VpcList")
    @Expose
    private String [] VpcList;

    /**
    * <p>指定防火墙使用网段信息</p>
    */
    @SerializedName("FwCidrInfo")
    @Expose
    private FwCidrInfo FwCidrInfo;

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
     * Get <p>防火墙实例id</p> 
     * @return CfwInstance <p>防火墙实例id</p>
     */
    public String getCfwInstance() {
        return this.CfwInstance;
    }

    /**
     * Set <p>防火墙实例id</p>
     * @param CfwInstance <p>防火墙实例id</p>
     */
    public void setCfwInstance(String CfwInstance) {
        this.CfwInstance = CfwInstance;
    }

    /**
     * Get <p>接入模式重新接入的nat网关列表，其中NatGwList和VpcList只能传递一个。</p> 
     * @return NatGwList <p>接入模式重新接入的nat网关列表，其中NatGwList和VpcList只能传递一个。</p>
     */
    public String [] getNatGwList() {
        return this.NatGwList;
    }

    /**
     * Set <p>接入模式重新接入的nat网关列表，其中NatGwList和VpcList只能传递一个。</p>
     * @param NatGwList <p>接入模式重新接入的nat网关列表，其中NatGwList和VpcList只能传递一个。</p>
     */
    public void setNatGwList(String [] NatGwList) {
        this.NatGwList = NatGwList;
    }

    /**
     * Get <p>新增模式重新接入的vpc列表，其中NatGwList和NatgwList只能传递一个。</p> 
     * @return VpcList <p>新增模式重新接入的vpc列表，其中NatGwList和NatgwList只能传递一个。</p>
     */
    public String [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set <p>新增模式重新接入的vpc列表，其中NatGwList和NatgwList只能传递一个。</p>
     * @param VpcList <p>新增模式重新接入的vpc列表，其中NatGwList和NatgwList只能传递一个。</p>
     */
    public void setVpcList(String [] VpcList) {
        this.VpcList = VpcList;
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

    public ModifyNatFwReSelectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatFwReSelectRequest(ModifyNatFwReSelectRequest source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.CfwInstance != null) {
            this.CfwInstance = new String(source.CfwInstance);
        }
        if (source.NatGwList != null) {
            this.NatGwList = new String[source.NatGwList.length];
            for (int i = 0; i < source.NatGwList.length; i++) {
                this.NatGwList[i] = new String(source.NatGwList[i]);
            }
        }
        if (source.VpcList != null) {
            this.VpcList = new String[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new String(source.VpcList[i]);
            }
        }
        if (source.FwCidrInfo != null) {
            this.FwCidrInfo = new FwCidrInfo(source.FwCidrInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "CfwInstance", this.CfwInstance);
        this.setParamArraySimple(map, prefix + "NatGwList.", this.NatGwList);
        this.setParamArraySimple(map, prefix + "VpcList.", this.VpcList);
        this.setParamObj(map, prefix + "FwCidrInfo.", this.FwCidrInfo);

    }
}

