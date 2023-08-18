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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowGroupOptions extends AbstractModel{

    /**
    * 发起方企业经办人（即签署人为发起方企业员工）是否需要对子合同进行独立的意愿确认：
fasle：发起方企业经办人签署时对所有子合同进行统一的意愿确认
true：发起方企业经办人签署时需要对子合同进行独立的意愿确认
默认为fasle。
    */
    @SerializedName("SelfOrganizationApproverSignEach")
    @Expose
    private Boolean SelfOrganizationApproverSignEach;

    /**
    * 非发起方企业经办人（即：签署人为个人或者不为发起方企业的员工）是否需要对子合同进行独立的意愿确认：
fasle：非发起方企业经办人签署时对所有子合同进行统一的意愿确认
true：非发起方企业经办人签署时需要对子合同进行独立的意愿确认
默认为false。
    */
    @SerializedName("OtherApproverSignEach")
    @Expose
    private Boolean OtherApproverSignEach;

    /**
     * Get 发起方企业经办人（即签署人为发起方企业员工）是否需要对子合同进行独立的意愿确认：
fasle：发起方企业经办人签署时对所有子合同进行统一的意愿确认
true：发起方企业经办人签署时需要对子合同进行独立的意愿确认
默认为fasle。 
     * @return SelfOrganizationApproverSignEach 发起方企业经办人（即签署人为发起方企业员工）是否需要对子合同进行独立的意愿确认：
fasle：发起方企业经办人签署时对所有子合同进行统一的意愿确认
true：发起方企业经办人签署时需要对子合同进行独立的意愿确认
默认为fasle。
     */
    public Boolean getSelfOrganizationApproverSignEach() {
        return this.SelfOrganizationApproverSignEach;
    }

    /**
     * Set 发起方企业经办人（即签署人为发起方企业员工）是否需要对子合同进行独立的意愿确认：
fasle：发起方企业经办人签署时对所有子合同进行统一的意愿确认
true：发起方企业经办人签署时需要对子合同进行独立的意愿确认
默认为fasle。
     * @param SelfOrganizationApproverSignEach 发起方企业经办人（即签署人为发起方企业员工）是否需要对子合同进行独立的意愿确认：
fasle：发起方企业经办人签署时对所有子合同进行统一的意愿确认
true：发起方企业经办人签署时需要对子合同进行独立的意愿确认
默认为fasle。
     */
    public void setSelfOrganizationApproverSignEach(Boolean SelfOrganizationApproverSignEach) {
        this.SelfOrganizationApproverSignEach = SelfOrganizationApproverSignEach;
    }

    /**
     * Get 非发起方企业经办人（即：签署人为个人或者不为发起方企业的员工）是否需要对子合同进行独立的意愿确认：
fasle：非发起方企业经办人签署时对所有子合同进行统一的意愿确认
true：非发起方企业经办人签署时需要对子合同进行独立的意愿确认
默认为false。 
     * @return OtherApproverSignEach 非发起方企业经办人（即：签署人为个人或者不为发起方企业的员工）是否需要对子合同进行独立的意愿确认：
fasle：非发起方企业经办人签署时对所有子合同进行统一的意愿确认
true：非发起方企业经办人签署时需要对子合同进行独立的意愿确认
默认为false。
     */
    public Boolean getOtherApproverSignEach() {
        return this.OtherApproverSignEach;
    }

    /**
     * Set 非发起方企业经办人（即：签署人为个人或者不为发起方企业的员工）是否需要对子合同进行独立的意愿确认：
fasle：非发起方企业经办人签署时对所有子合同进行统一的意愿确认
true：非发起方企业经办人签署时需要对子合同进行独立的意愿确认
默认为false。
     * @param OtherApproverSignEach 非发起方企业经办人（即：签署人为个人或者不为发起方企业的员工）是否需要对子合同进行独立的意愿确认：
fasle：非发起方企业经办人签署时对所有子合同进行统一的意愿确认
true：非发起方企业经办人签署时需要对子合同进行独立的意愿确认
默认为false。
     */
    public void setOtherApproverSignEach(Boolean OtherApproverSignEach) {
        this.OtherApproverSignEach = OtherApproverSignEach;
    }

    public FlowGroupOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowGroupOptions(FlowGroupOptions source) {
        if (source.SelfOrganizationApproverSignEach != null) {
            this.SelfOrganizationApproverSignEach = new Boolean(source.SelfOrganizationApproverSignEach);
        }
        if (source.OtherApproverSignEach != null) {
            this.OtherApproverSignEach = new Boolean(source.OtherApproverSignEach);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SelfOrganizationApproverSignEach", this.SelfOrganizationApproverSignEach);
        this.setParamSimple(map, prefix + "OtherApproverSignEach", this.OtherApproverSignEach);

    }
}

