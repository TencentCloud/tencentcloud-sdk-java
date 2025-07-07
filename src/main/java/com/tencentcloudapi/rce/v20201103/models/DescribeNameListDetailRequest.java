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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNameListDetailRequest extends AbstractModel {

    /**
    * 业务入参	
    */
    @SerializedName("BusinessSecurityData")
    @Expose
    private InputDescribeNameListDetail BusinessSecurityData;

    /**
     * Get 业务入参	 
     * @return BusinessSecurityData 业务入参	
     */
    public InputDescribeNameListDetail getBusinessSecurityData() {
        return this.BusinessSecurityData;
    }

    /**
     * Set 业务入参	
     * @param BusinessSecurityData 业务入参	
     */
    public void setBusinessSecurityData(InputDescribeNameListDetail BusinessSecurityData) {
        this.BusinessSecurityData = BusinessSecurityData;
    }

    public DescribeNameListDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNameListDetailRequest(DescribeNameListDetailRequest source) {
        if (source.BusinessSecurityData != null) {
            this.BusinessSecurityData = new InputDescribeNameListDetail(source.BusinessSecurityData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BusinessSecurityData.", this.BusinessSecurityData);

    }
}

