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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseServiceNumInfo extends AbstractModel {

    /**
    * 服务类型
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * 授权总数
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 已使用授权数
    */
    @SerializedName("UsedNum")
    @Expose
    private Long UsedNum;

    /**
    * TWeCall激活码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TWeCallLicense")
    @Expose
    private TWeCallLicenseInfo [] TWeCallLicense;

    /**
     * Get 服务类型 
     * @return LicenseType 服务类型
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 服务类型
     * @param LicenseType 服务类型
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 授权总数 
     * @return TotalNum 授权总数
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 授权总数
     * @param TotalNum 授权总数
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 已使用授权数 
     * @return UsedNum 已使用授权数
     */
    public Long getUsedNum() {
        return this.UsedNum;
    }

    /**
     * Set 已使用授权数
     * @param UsedNum 已使用授权数
     */
    public void setUsedNum(Long UsedNum) {
        this.UsedNum = UsedNum;
    }

    /**
     * Get TWeCall激活码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TWeCallLicense TWeCall激活码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TWeCallLicenseInfo [] getTWeCallLicense() {
        return this.TWeCallLicense;
    }

    /**
     * Set TWeCall激活码
注意：此字段可能返回 null，表示取不到有效值。
     * @param TWeCallLicense TWeCall激活码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTWeCallLicense(TWeCallLicenseInfo [] TWeCallLicense) {
        this.TWeCallLicense = TWeCallLicense;
    }

    public LicenseServiceNumInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseServiceNumInfo(LicenseServiceNumInfo source) {
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.UsedNum != null) {
            this.UsedNum = new Long(source.UsedNum);
        }
        if (source.TWeCallLicense != null) {
            this.TWeCallLicense = new TWeCallLicenseInfo[source.TWeCallLicense.length];
            for (int i = 0; i < source.TWeCallLicense.length; i++) {
                this.TWeCallLicense[i] = new TWeCallLicenseInfo(source.TWeCallLicense[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "UsedNum", this.UsedNum);
        this.setParamArrayObj(map, prefix + "TWeCallLicense.", this.TWeCallLicense);

    }
}

