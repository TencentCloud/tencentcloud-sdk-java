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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SqlGatewayEndpoint extends AbstractModel {

    /**
    * <p>类型</p><p>枚举值：</p><ul><li>rest： rest</li><li>hiveserver2： hiveserver2</li><li>pg： pg</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>地址</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>是否开启</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>其他信息</p>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get <p>类型</p><p>枚举值：</p><ul><li>rest： rest</li><li>hiveserver2： hiveserver2</li><li>pg： pg</li></ul> 
     * @return Type <p>类型</p><p>枚举值：</p><ul><li>rest： rest</li><li>hiveserver2： hiveserver2</li><li>pg： pg</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p><p>枚举值：</p><ul><li>rest： rest</li><li>hiveserver2： hiveserver2</li><li>pg： pg</li></ul>
     * @param Type <p>类型</p><p>枚举值：</p><ul><li>rest： rest</li><li>hiveserver2： hiveserver2</li><li>pg： pg</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>地址</p> 
     * @return Address <p>地址</p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>地址</p>
     * @param Address <p>地址</p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>是否开启</p> 
     * @return Enabled <p>是否开启</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否开启</p>
     * @param Enabled <p>是否开启</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>其他信息</p> 
     * @return Extra <p>其他信息</p>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>其他信息</p>
     * @param Extra <p>其他信息</p>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public SqlGatewayEndpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SqlGatewayEndpoint(SqlGatewayEndpoint source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Extra", this.Extra);

    }
}

