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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNativeGatewayServerGroupRequest extends AbstractModel{

    /**
    * 云原生API网关实例ID。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关分组 id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 云原生API网关名字, 最多支持60个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 云原生API网关描述信息, 最多支持120个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 云原生API网关实例ID。 
     * @return GatewayId 云原生API网关实例ID。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 云原生API网关实例ID。
     * @param GatewayId 云原生API网关实例ID。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关分组 id 
     * @return GroupId 网关分组 id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 网关分组 id
     * @param GroupId 网关分组 id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 云原生API网关名字, 最多支持60个字符。 
     * @return Name 云原生API网关名字, 最多支持60个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 云原生API网关名字, 最多支持60个字符。
     * @param Name 云原生API网关名字, 最多支持60个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 云原生API网关描述信息, 最多支持120个字符。 
     * @return Description 云原生API网关描述信息, 最多支持120个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 云原生API网关描述信息, 最多支持120个字符。
     * @param Description 云原生API网关描述信息, 最多支持120个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyNativeGatewayServerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNativeGatewayServerGroupRequest(ModifyNativeGatewayServerGroupRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

