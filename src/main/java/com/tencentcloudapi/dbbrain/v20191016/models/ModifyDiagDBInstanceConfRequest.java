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

public class ModifyDiagDBInstanceConfRequest extends AbstractModel{

    /**
    * 巡检开关。
    */
    @SerializedName("InstanceConfs")
    @Expose
    private InstanceConfs InstanceConfs;

    /**
    * 生效实例地域，取值为"All"，代表全地域。
    */
    @SerializedName("Regions")
    @Expose
    private String Regions;

    /**
    * 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 指定更改巡检状态的实例ID。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get 巡检开关。 
     * @return InstanceConfs 巡检开关。
     */
    public InstanceConfs getInstanceConfs() {
        return this.InstanceConfs;
    }

    /**
     * Set 巡检开关。
     * @param InstanceConfs 巡检开关。
     */
    public void setInstanceConfs(InstanceConfs InstanceConfs) {
        this.InstanceConfs = InstanceConfs;
    }

    /**
     * Get 生效实例地域，取值为"All"，代表全地域。 
     * @return Regions 生效实例地域，取值为"All"，代表全地域。
     */
    public String getRegions() {
        return this.Regions;
    }

    /**
     * Set 生效实例地域，取值为"All"，代表全地域。
     * @param Regions 生效实例地域，取值为"All"，代表全地域。
     */
    public void setRegions(String Regions) {
        this.Regions = Regions;
    }

    /**
     * Get 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL。 
     * @return Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL。
     * @param Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 指定更改巡检状态的实例ID。 
     * @return InstanceIds 指定更改巡检状态的实例ID。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 指定更改巡检状态的实例ID。
     * @param InstanceIds 指定更改巡检状态的实例ID。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public ModifyDiagDBInstanceConfRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDiagDBInstanceConfRequest(ModifyDiagDBInstanceConfRequest source) {
        if (source.InstanceConfs != null) {
            this.InstanceConfs = new InstanceConfs(source.InstanceConfs);
        }
        if (source.Regions != null) {
            this.Regions = new String(source.Regions);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceConfs.", this.InstanceConfs);
        this.setParamSimple(map, prefix + "Regions", this.Regions);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

