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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAliasRequest extends AbstractModel{

    /**
    * 要更新的别名的唯一标识符
    */
    @SerializedName("AliasId")
    @Expose
    private String AliasId;

    /**
    * 名字，长度不小于1字符不超过1024字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 别名的可读说明，长度不小于1字符不超过1024字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 别名的路由配置
    */
    @SerializedName("RoutingStrategy")
    @Expose
    private RoutingStrategy RoutingStrategy;

    /**
     * Get 要更新的别名的唯一标识符 
     * @return AliasId 要更新的别名的唯一标识符
     */
    public String getAliasId() {
        return this.AliasId;
    }

    /**
     * Set 要更新的别名的唯一标识符
     * @param AliasId 要更新的别名的唯一标识符
     */
    public void setAliasId(String AliasId) {
        this.AliasId = AliasId;
    }

    /**
     * Get 名字，长度不小于1字符不超过1024字符 
     * @return Name 名字，长度不小于1字符不超过1024字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字，长度不小于1字符不超过1024字符
     * @param Name 名字，长度不小于1字符不超过1024字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 别名的可读说明，长度不小于1字符不超过1024字符 
     * @return Description 别名的可读说明，长度不小于1字符不超过1024字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 别名的可读说明，长度不小于1字符不超过1024字符
     * @param Description 别名的可读说明，长度不小于1字符不超过1024字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 别名的路由配置 
     * @return RoutingStrategy 别名的路由配置
     */
    public RoutingStrategy getRoutingStrategy() {
        return this.RoutingStrategy;
    }

    /**
     * Set 别名的路由配置
     * @param RoutingStrategy 别名的路由配置
     */
    public void setRoutingStrategy(RoutingStrategy RoutingStrategy) {
        this.RoutingStrategy = RoutingStrategy;
    }

    public UpdateAliasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAliasRequest(UpdateAliasRequest source) {
        if (source.AliasId != null) {
            this.AliasId = new String(source.AliasId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RoutingStrategy != null) {
            this.RoutingStrategy = new RoutingStrategy(source.RoutingStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AliasId", this.AliasId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "RoutingStrategy.", this.RoutingStrategy);

    }
}

