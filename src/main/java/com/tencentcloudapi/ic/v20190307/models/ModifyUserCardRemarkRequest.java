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
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserCardRemarkRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("Sdkappid")
    @Expose
    private Long Sdkappid;

    /**
    * 物联卡ICCID
    */
    @SerializedName("Iccid")
    @Expose
    private String Iccid;

    /**
    * 备注信息，限50字
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 应用ID 
     * @return Sdkappid 应用ID
     */
    public Long getSdkappid() {
        return this.Sdkappid;
    }

    /**
     * Set 应用ID
     * @param Sdkappid 应用ID
     */
    public void setSdkappid(Long Sdkappid) {
        this.Sdkappid = Sdkappid;
    }

    /**
     * Get 物联卡ICCID 
     * @return Iccid 物联卡ICCID
     */
    public String getIccid() {
        return this.Iccid;
    }

    /**
     * Set 物联卡ICCID
     * @param Iccid 物联卡ICCID
     */
    public void setIccid(String Iccid) {
        this.Iccid = Iccid;
    }

    /**
     * Get 备注信息，限50字 
     * @return Remark 备注信息，限50字
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息，限50字
     * @param Remark 备注信息，限50字
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyUserCardRemarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserCardRemarkRequest(ModifyUserCardRemarkRequest source) {
        if (source.Sdkappid != null) {
            this.Sdkappid = new Long(source.Sdkappid);
        }
        if (source.Iccid != null) {
            this.Iccid = new String(source.Iccid);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sdkappid", this.Sdkappid);
        this.setParamSimple(map, prefix + "Iccid", this.Iccid);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

