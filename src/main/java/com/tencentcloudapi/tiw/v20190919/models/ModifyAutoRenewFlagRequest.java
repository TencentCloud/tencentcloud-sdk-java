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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoRenewFlagRequest extends AbstractModel{

    /**
    * 资源Id，从DescribeUserResources接口中获取Level=1的正式月功能费的SubProduct，一般为sp_tiw_package
    */
    @SerializedName("SubProduct")
    @Expose
    private String SubProduct;

    /**
    * 资源Id，从DescribeUserResources接口中获取Level=1的正式月功能费资源Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续 费，需要设置为0
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
     * Get 资源Id，从DescribeUserResources接口中获取Level=1的正式月功能费的SubProduct，一般为sp_tiw_package 
     * @return SubProduct 资源Id，从DescribeUserResources接口中获取Level=1的正式月功能费的SubProduct，一般为sp_tiw_package
     */
    public String getSubProduct() {
        return this.SubProduct;
    }

    /**
     * Set 资源Id，从DescribeUserResources接口中获取Level=1的正式月功能费的SubProduct，一般为sp_tiw_package
     * @param SubProduct 资源Id，从DescribeUserResources接口中获取Level=1的正式月功能费的SubProduct，一般为sp_tiw_package
     */
    public void setSubProduct(String SubProduct) {
        this.SubProduct = SubProduct;
    }

    /**
     * Get 资源Id，从DescribeUserResources接口中获取Level=1的正式月功能费资源Id 
     * @return ResourceId 资源Id，从DescribeUserResources接口中获取Level=1的正式月功能费资源Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id，从DescribeUserResources接口中获取Level=1的正式月功能费资源Id
     * @param ResourceId 资源Id，从DescribeUserResources接口中获取Level=1的正式月功能费资源Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续 费，需要设置为0 
     * @return AutoRenewFlag 自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续 费，需要设置为0
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续 费，需要设置为0
     * @param AutoRenewFlag 自动续费标记，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续 费，需要设置为0
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public ModifyAutoRenewFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoRenewFlagRequest(ModifyAutoRenewFlagRequest source) {
        if (source.SubProduct != null) {
            this.SubProduct = new String(source.SubProduct);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubProduct", this.SubProduct);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

