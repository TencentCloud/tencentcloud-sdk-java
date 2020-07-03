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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSecurityGroupsRequest extends AbstractModel{

    /**
    * 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb 等。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 要修改的安全组ID列表，一个或者多个安全组Id组成的数组。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 实例ID，格式如：cdb-c1nl9rpv或者cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb 等。 
     * @return Product 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb 等。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb 等。
     * @param Product 数据库引擎名称：mariadb,cdb,cynosdb,dcdb,redis,mongodb 等。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 要修改的安全组ID列表，一个或者多个安全组Id组成的数组。 
     * @return SecurityGroupIds 要修改的安全组ID列表，一个或者多个安全组Id组成的数组。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 要修改的安全组ID列表，一个或者多个安全组Id组成的数组。
     * @param SecurityGroupIds 要修改的安全组ID列表，一个或者多个安全组Id组成的数组。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 实例ID，格式如：cdb-c1nl9rpv或者cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同 
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv或者cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cdb-c1nl9rpv或者cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv或者cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

