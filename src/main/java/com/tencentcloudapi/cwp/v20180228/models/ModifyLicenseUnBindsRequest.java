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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLicenseUnBindsRequest extends AbstractModel {

    /**
    * <p>资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>授权类型</p><p>枚举值：</p><ul><li>1： 专业版-包年包月</li><li>2： 旗舰版-包年包月</li></ul>
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * <p>是否全部机器(当全部机器数大于当前订单可用授权数时,多余机器会被跳过)</p>
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
    * <p>需要绑定的机器quuid列表, 当IsAll = false 时必填,反之忽略该参数.<br>最大长度=100</p>
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
     * Get <p>资源ID</p> 
     * @return ResourceId <p>资源ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID</p>
     * @param ResourceId <p>资源ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>授权类型</p><p>枚举值：</p><ul><li>1： 专业版-包年包月</li><li>2： 旗舰版-包年包月</li></ul> 
     * @return LicenseType <p>授权类型</p><p>枚举值：</p><ul><li>1： 专业版-包年包月</li><li>2： 旗舰版-包年包月</li></ul>
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>授权类型</p><p>枚举值：</p><ul><li>1： 专业版-包年包月</li><li>2： 旗舰版-包年包月</li></ul>
     * @param LicenseType <p>授权类型</p><p>枚举值：</p><ul><li>1： 专业版-包年包月</li><li>2： 旗舰版-包年包月</li></ul>
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <p>是否全部机器(当全部机器数大于当前订单可用授权数时,多余机器会被跳过)</p> 
     * @return IsAll <p>是否全部机器(当全部机器数大于当前订单可用授权数时,多余机器会被跳过)</p>
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set <p>是否全部机器(当全部机器数大于当前订单可用授权数时,多余机器会被跳过)</p>
     * @param IsAll <p>是否全部机器(当全部机器数大于当前订单可用授权数时,多余机器会被跳过)</p>
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get <p>需要绑定的机器quuid列表, 当IsAll = false 时必填,反之忽略该参数.<br>最大长度=100</p> 
     * @return QuuidList <p>需要绑定的机器quuid列表, 当IsAll = false 时必填,反之忽略该参数.<br>最大长度=100</p>
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set <p>需要绑定的机器quuid列表, 当IsAll = false 时必填,反之忽略该参数.<br>最大长度=100</p>
     * @param QuuidList <p>需要绑定的机器quuid列表, 当IsAll = false 时必填,反之忽略该参数.<br>最大长度=100</p>
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

