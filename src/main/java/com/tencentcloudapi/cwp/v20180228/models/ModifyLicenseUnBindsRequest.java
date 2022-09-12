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

public class ModifyLicenseUnBindsRequest extends AbstractModel{

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 授权类型
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * 是否全部机器(当全部机器数大于当前订单可用授权数时,多余机器会被跳过)
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
    * 需要绑定的机器quuid列表, 当IsAll = false 时必填,反之忽略该参数.
最大长度=100
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

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
     * Get 授权类型 
     * @return LicenseType 授权类型
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 授权类型
     * @param LicenseType 授权类型
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 是否全部机器(当全部机器数大于当前订单可用授权数时,多余机器会被跳过) 
     * @return IsAll 是否全部机器(当全部机器数大于当前订单可用授权数时,多余机器会被跳过)
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set 是否全部机器(当全部机器数大于当前订单可用授权数时,多余机器会被跳过)
     * @param IsAll 是否全部机器(当全部机器数大于当前订单可用授权数时,多余机器会被跳过)
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get 需要绑定的机器quuid列表, 当IsAll = false 时必填,反之忽略该参数.
最大长度=100 
     * @return QuuidList 需要绑定的机器quuid列表, 当IsAll = false 时必填,反之忽略该参数.
最大长度=100
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set 需要绑定的机器quuid列表, 当IsAll = false 时必填,反之忽略该参数.
最大长度=100
     * @param QuuidList 需要绑定的机器quuid列表, 当IsAll = false 时必填,反之忽略该参数.
最大长度=100
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    public ModifyLicenseUnBindsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLicenseUnBindsRequest(ModifyLicenseUnBindsRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);

    }
}

