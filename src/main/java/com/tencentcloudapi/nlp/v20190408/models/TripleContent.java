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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TripleContent extends AbstractModel{

    /**
    * 实体id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 实体名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实体order
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 实体流行度
    */
    @SerializedName("Popular")
    @Expose
    private Long Popular;

    /**
     * Get 实体id 
     * @return Id 实体id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 实体id
     * @param Id 实体id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 实体名称 
     * @return Name 实体名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实体名称
     * @param Name 实体名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实体order 
     * @return Order 实体order
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 实体order
     * @param Order 实体order
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 实体流行度 
     * @return Popular 实体流行度
     */
    public Long getPopular() {
        return this.Popular;
    }

    /**
     * Set 实体流行度
     * @param Popular 实体流行度
     */
    public void setPopular(Long Popular) {
        this.Popular = Popular;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Popular", this.Popular);

    }
}

