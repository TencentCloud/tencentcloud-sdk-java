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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel{

    /**
    * 企业版实例名称
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * 企业版实例类型
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * 云标签描述
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
     * Get 企业版实例名称 
     * @return RegistryName 企业版实例名称
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set 企业版实例名称
     * @param RegistryName 企业版实例名称
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get 企业版实例类型 
     * @return RegistryType 企业版实例类型
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 企业版实例类型
     * @param RegistryType 企业版实例类型
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get 云标签描述 
     * @return TagSpecification 云标签描述
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 云标签描述
     * @param TagSpecification 云标签描述
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

