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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceBasicInfo extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例内网IP。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 实例内网Port。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 实例产品。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 实例引擎版本。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例内网IP。 
     * @return Vip 实例内网IP。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例内网IP。
     * @param Vip 实例内网IP。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 实例内网Port。 
     * @return Vport 实例内网Port。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例内网Port。
     * @param Vport 实例内网Port。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 实例产品。 
     * @return Product 实例产品。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 实例产品。
     * @param Product 实例产品。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 实例引擎版本。 
     * @return EngineVersion 实例引擎版本。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 实例引擎版本。
     * @param EngineVersion 实例引擎版本。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    public InstanceBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceBasicInfo(InstanceBasicInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);

    }
}

