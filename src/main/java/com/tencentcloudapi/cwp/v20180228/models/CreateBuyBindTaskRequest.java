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

public class CreateBuyBindTaskRequest extends AbstractModel {

    /**
    * 订单号
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 可选参数: 1专业版-包年包月 , 2 旗舰版-包年包月
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * 机器列表
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * 是否全选机器
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
     * Get 订单号 
     * @return DealName 订单号
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 订单号
     * @param DealName 订单号
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 可选参数: 1专业版-包年包月 , 2 旗舰版-包年包月 
     * @return LicenseType 可选参数: 1专业版-包年包月 , 2 旗舰版-包年包月
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 可选参数: 1专业版-包年包月 , 2 旗舰版-包年包月
     * @param LicenseType 可选参数: 1专业版-包年包月 , 2 旗舰版-包年包月
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 机器列表 
     * @return QuuidList 机器列表
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set 机器列表
     * @param QuuidList 机器列表
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    /**
     * Get 是否全选机器 
     * @return IsAll 是否全选机器
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set 是否全选机器
     * @param IsAll 是否全选机器
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    public CreateBuyBindTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBuyBindTaskRequest(CreateBuyBindTaskRequest source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);

    }
}

