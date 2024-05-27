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

public class AssignTWeCallLicenseRequest extends AbstractModel {

    /**
    * voip类型
    */
    @SerializedName("PkgType")
    @Expose
    private Long PkgType;

    /**
    * appId
    */
    @SerializedName("MiniProgramAppId")
    @Expose
    private String MiniProgramAppId;

    /**
    * License数
    */
    @SerializedName("DeductNum")
    @Expose
    private Long DeductNum;

    /**
     * Get voip类型 
     * @return PkgType voip类型
     */
    public Long getPkgType() {
        return this.PkgType;
    }

    /**
     * Set voip类型
     * @param PkgType voip类型
     */
    public void setPkgType(Long PkgType) {
        this.PkgType = PkgType;
    }

    /**
     * Get appId 
     * @return MiniProgramAppId appId
     */
    public String getMiniProgramAppId() {
        return this.MiniProgramAppId;
    }

    /**
     * Set appId
     * @param MiniProgramAppId appId
     */
    public void setMiniProgramAppId(String MiniProgramAppId) {
        this.MiniProgramAppId = MiniProgramAppId;
    }

    /**
     * Get License数 
     * @return DeductNum License数
     */
    public Long getDeductNum() {
        return this.DeductNum;
    }

    /**
     * Set License数
     * @param DeductNum License数
     */
    public void setDeductNum(Long DeductNum) {
        this.DeductNum = DeductNum;
    }

    public AssignTWeCallLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignTWeCallLicenseRequest(AssignTWeCallLicenseRequest source) {
        if (source.PkgType != null) {
            this.PkgType = new Long(source.PkgType);
        }
        if (source.MiniProgramAppId != null) {
            this.MiniProgramAppId = new String(source.MiniProgramAppId);
        }
        if (source.DeductNum != null) {
            this.DeductNum = new Long(source.DeductNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgType", this.PkgType);
        this.setParamSimple(map, prefix + "MiniProgramAppId", this.MiniProgramAppId);
        this.setParamSimple(map, prefix + "DeductNum", this.DeductNum);

    }
}

