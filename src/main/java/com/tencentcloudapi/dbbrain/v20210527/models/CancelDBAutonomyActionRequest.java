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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CancelDBAutonomyActionRequest extends AbstractModel {

    /**
    * 自治任务ID。
    */
    @SerializedName("ActionId")
    @Expose
    private Long ActionId;

    /**
    * 实列ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 自治任务ID。 
     * @return ActionId 自治任务ID。
     */
    public Long getActionId() {
        return this.ActionId;
    }

    /**
     * Set 自治任务ID。
     * @param ActionId 自治任务ID。
     */
    public void setActionId(Long ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get 实列ID。 
     * @return InstanceId 实列ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实列ID。
     * @param InstanceId 实列ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务产品类型，支持值包括： "redis" - 云数据库 Redis。 
     * @return Product 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
     * @param Product 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public CancelDBAutonomyActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelDBAutonomyActionRequest(CancelDBAutonomyActionRequest source) {
        if (source.ActionId != null) {
            this.ActionId = new Long(source.ActionId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

