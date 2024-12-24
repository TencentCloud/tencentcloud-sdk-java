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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Abnormals extends AbstractModel {

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 异常原因 PatientInfo 病人信息缺失；OrderInfo 医嘱信息缺失； PrescriptionError 处方异常提醒
    */
    @SerializedName("AbnormalReason")
    @Expose
    private String AbnormalReason;

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 标题 
     * @return Title 标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
     * @param Title 标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 异常原因 PatientInfo 病人信息缺失；OrderInfo 医嘱信息缺失； PrescriptionError 处方异常提醒 
     * @return AbnormalReason 异常原因 PatientInfo 病人信息缺失；OrderInfo 医嘱信息缺失； PrescriptionError 处方异常提醒
     */
    public String getAbnormalReason() {
        return this.AbnormalReason;
    }

    /**
     * Set 异常原因 PatientInfo 病人信息缺失；OrderInfo 医嘱信息缺失； PrescriptionError 处方异常提醒
     * @param AbnormalReason 异常原因 PatientInfo 病人信息缺失；OrderInfo 医嘱信息缺失； PrescriptionError 处方异常提醒
     */
    public void setAbnormalReason(String AbnormalReason) {
        this.AbnormalReason = AbnormalReason;
    }

    public Abnormals() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Abnormals(Abnormals source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.AbnormalReason != null) {
            this.AbnormalReason = new String(source.AbnormalReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "AbnormalReason", this.AbnormalReason);

    }
}

