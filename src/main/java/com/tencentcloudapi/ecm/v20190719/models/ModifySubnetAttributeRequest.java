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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubnetAttributeRequest extends AbstractModel {

    /**
    * 子网实例ID。形如：subnet-pxir56ns。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * ECM 地域
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 子网名称，最大长度不能超过60个字节。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网是否开启广播。
    */
    @SerializedName("EnableBroadcast")
    @Expose
    private String EnableBroadcast;

    /**
    * 子网的标签键值
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 子网实例ID。形如：subnet-pxir56ns。 
     * @return SubnetId 子网实例ID。形如：subnet-pxir56ns。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网实例ID。形如：subnet-pxir56ns。
     * @param SubnetId 子网实例ID。形如：subnet-pxir56ns。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get ECM 地域 
     * @return EcmRegion ECM 地域
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM 地域
     * @param EcmRegion ECM 地域
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get 子网名称，最大长度不能超过60个字节。 
     * @return SubnetName 子网名称，最大长度不能超过60个字节。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称，最大长度不能超过60个字节。
     * @param SubnetName 子网名称，最大长度不能超过60个字节。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 子网是否开启广播。 
     * @return EnableBroadcast 子网是否开启广播。
     */
    public String getEnableBroadcast() {
        return this.EnableBroadcast;
    }

    /**
     * Set 子网是否开启广播。
     * @param EnableBroadcast 子网是否开启广播。
     */
    public void setEnableBroadcast(String EnableBroadcast) {
        this.EnableBroadcast = EnableBroadcast;
    }

    /**
     * Get 子网的标签键值 
     * @return Tags 子网的标签键值
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 子网的标签键值
     * @param Tags 子网的标签键值
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public ModifySubnetAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubnetAttributeRequest(ModifySubnetAttributeRequest source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.EnableBroadcast != null) {
            this.EnableBroadcast = new String(source.EnableBroadcast);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "EnableBroadcast", this.EnableBroadcast);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

