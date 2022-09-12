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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOrderAttributeRequest extends AbstractModel{

    /**
    * 授权类型 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 可编辑的属性名称 ,当前支持的有: alias 资源别名
    */
    @SerializedName("AttrName")
    @Expose
    private String AttrName;

    /**
    * 属性值
    */
    @SerializedName("AttrValue")
    @Expose
    private String AttrValue;

    /**
     * Get 授权类型 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月 
     * @return LicenseType 授权类型 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 授权类型 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
     * @param LicenseType 授权类型 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 可编辑的属性名称 ,当前支持的有: alias 资源别名 
     * @return AttrName 可编辑的属性名称 ,当前支持的有: alias 资源别名
     */
    public String getAttrName() {
        return this.AttrName;
    }

    /**
     * Set 可编辑的属性名称 ,当前支持的有: alias 资源别名
     * @param AttrName 可编辑的属性名称 ,当前支持的有: alias 资源别名
     */
    public void setAttrName(String AttrName) {
        this.AttrName = AttrName;
    }

    /**
     * Get 属性值 
     * @return AttrValue 属性值
     */
    public String getAttrValue() {
        return this.AttrValue;
    }

    /**
     * Set 属性值
     * @param AttrValue 属性值
     */
    public void setAttrValue(String AttrValue) {
        this.AttrValue = AttrValue;
    }

    public ModifyOrderAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOrderAttributeRequest(ModifyOrderAttributeRequest source) {
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AttrName != null) {
            this.AttrName = new String(source.AttrName);
        }
        if (source.AttrValue != null) {
            this.AttrValue = new String(source.AttrValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AttrName", this.AttrName);
        this.setParamSimple(map, prefix + "AttrValue", this.AttrValue);

    }
}

