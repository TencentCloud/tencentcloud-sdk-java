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

public class DescribeCfwEipsRequest extends AbstractModel {

    /**
    * <p>1：cfw接入模式，目前仅支持接入模式实例</p>
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * <p>ALL：查询所有弹性公网ip; nat-xxxxx：接入模式场景指定网关的弹性公网ip</p>
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * <p>防火墙实例id，当前仅支持接入模式的实例，该字段必填</p>
    */
    @SerializedName("CfwInstance")
    @Expose
    private String CfwInstance;

    /**
     * Get <p>1：cfw接入模式，目前仅支持接入模式实例</p> 
     * @return Mode <p>1：cfw接入模式，目前仅支持接入模式实例</p>
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set <p>1：cfw接入模式，目前仅支持接入模式实例</p>
     * @param Mode <p>1：cfw接入模式，目前仅支持接入模式实例</p>
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>ALL：查询所有弹性公网ip; nat-xxxxx：接入模式场景指定网关的弹性公网ip</p> 
     * @return NatGatewayId <p>ALL：查询所有弹性公网ip; nat-xxxxx：接入模式场景指定网关的弹性公网ip</p>
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set <p>ALL：查询所有弹性公网ip; nat-xxxxx：接入模式场景指定网关的弹性公网ip</p>
     * @param NatGatewayId <p>ALL：查询所有弹性公网ip; nat-xxxxx：接入模式场景指定网关的弹性公网ip</p>
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get <p>防火墙实例id，当前仅支持接入模式的实例，该字段必填</p> 
     * @return CfwInstance <p>防火墙实例id，当前仅支持接入模式的实例，该字段必填</p>
     */
    public String getCfwInstance() {
        return this.CfwInstance;
    }

    /**
     * Set <p>防火墙实例id，当前仅支持接入模式的实例，该字段必填</p>
     * @param CfwInstance <p>防火墙实例id，当前仅支持接入模式的实例，该字段必填</p>
     */
    public void setCfwInstance(String CfwInstance) {
        this.CfwInstance = CfwInstance;
    }

    public DescribeCfwEipsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwEipsRequest(DescribeCfwEipsRequest source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.CfwInstance != null) {
            this.CfwInstance = new String(source.CfwInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "CfwInstance", this.CfwInstance);

    }
}

