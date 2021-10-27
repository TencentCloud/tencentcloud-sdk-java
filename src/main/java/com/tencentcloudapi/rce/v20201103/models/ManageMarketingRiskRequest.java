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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageMarketingRiskRequest extends AbstractModel{

    /**
    * 业务入参
    */
    @SerializedName("BusinessSecurityData")
    @Expose
    private InputManageMarketingRisk BusinessSecurityData;

    /**
    * 业务入参
    */
    @SerializedName("BusinessCryptoData")
    @Expose
    private InputCryptoManageMarketingRisk BusinessCryptoData;

    /**
     * Get 业务入参 
     * @return BusinessSecurityData 业务入参
     */
    public InputManageMarketingRisk getBusinessSecurityData() {
        return this.BusinessSecurityData;
    }

    /**
     * Set 业务入参
     * @param BusinessSecurityData 业务入参
     */
    public void setBusinessSecurityData(InputManageMarketingRisk BusinessSecurityData) {
        this.BusinessSecurityData = BusinessSecurityData;
    }

    /**
     * Get 业务入参 
     * @return BusinessCryptoData 业务入参
     */
    public InputCryptoManageMarketingRisk getBusinessCryptoData() {
        return this.BusinessCryptoData;
    }

    /**
     * Set 业务入参
     * @param BusinessCryptoData 业务入参
     */
    public void setBusinessCryptoData(InputCryptoManageMarketingRisk BusinessCryptoData) {
        this.BusinessCryptoData = BusinessCryptoData;
    }

    public ManageMarketingRiskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManageMarketingRiskRequest(ManageMarketingRiskRequest source) {
        if (source.BusinessSecurityData != null) {
            this.BusinessSecurityData = new InputManageMarketingRisk(source.BusinessSecurityData);
        }
        if (source.BusinessCryptoData != null) {
            this.BusinessCryptoData = new InputCryptoManageMarketingRisk(source.BusinessCryptoData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BusinessSecurityData.", this.BusinessSecurityData);
        this.setParamObj(map, prefix + "BusinessCryptoData.", this.BusinessCryptoData);

    }
}

