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

public class ModifyNatFwReSelectRequest extends AbstractModel{

    /**
    * 模式 1：接入模式；0：新增模式
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 防火墙实例id
    */
    @SerializedName("CfwInstance")
    @Expose
    private String CfwInstance;

    /**
    * 接入模式重新接入的nat网关列表，其中NatGwList和VpcList只能传递一个。
    */
    @SerializedName("NatGwList")
    @Expose
    private String [] NatGwList;

    /**
    * 新增模式重新接入的vpc列表，其中NatGwList和NatgwList只能传递一个。
    */
    @SerializedName("VpcList")
    @Expose
    private String [] VpcList;

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
     * Get 防火墙实例id 
     * @return CfwInstance 防火墙实例id
     */
    public String getCfwInstance() {
        return this.CfwInstance;
    }

    /**
     * Set 防火墙实例id
     * @param CfwInstance 防火墙实例id
     */
    public void setCfwInstance(String CfwInstance) {
        this.CfwInstance = CfwInstance;
    }

    /**
     * Get 接入模式重新接入的nat网关列表，其中NatGwList和VpcList只能传递一个。 
     * @return NatGwList 接入模式重新接入的nat网关列表，其中NatGwList和VpcList只能传递一个。
     */
    public String [] getNatGwList() {
        return this.NatGwList;
    }

    /**
     * Set 接入模式重新接入的nat网关列表，其中NatGwList和VpcList只能传递一个。
     * @param NatGwList 接入模式重新接入的nat网关列表，其中NatGwList和VpcList只能传递一个。
     */
    public void setNatGwList(String [] NatGwList) {
        this.NatGwList = NatGwList;
    }

    /**
     * Get 新增模式重新接入的vpc列表，其中NatGwList和NatgwList只能传递一个。 
     * @return VpcList 新增模式重新接入的vpc列表，其中NatGwList和NatgwList只能传递一个。
     */
    public String [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set 新增模式重新接入的vpc列表，其中NatGwList和NatgwList只能传递一个。
     * @param VpcList 新增模式重新接入的vpc列表，其中NatGwList和NatgwList只能传递一个。
     */
    public void setVpcList(String [] VpcList) {
        this.VpcList = VpcList;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "CfwInstance", this.CfwInstance);
        this.setParamArraySimple(map, prefix + "NatGwList.", this.NatGwList);
        this.setParamArraySimple(map, prefix + "VpcList.", this.VpcList);

    }
}

