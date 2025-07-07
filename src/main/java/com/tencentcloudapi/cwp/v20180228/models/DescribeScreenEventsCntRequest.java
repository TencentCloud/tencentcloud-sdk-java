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

public class DescribeScreenEventsCntRequest extends AbstractModel {

    /**
    * 数据类型：0:待处理风险总数 1:影响资产总数，默认为0
    */
    @SerializedName("BusinessType")
    @Expose
    private Long BusinessType;

    /**
     * Get 数据类型：0:待处理风险总数 1:影响资产总数，默认为0 
     * @return BusinessType 数据类型：0:待处理风险总数 1:影响资产总数，默认为0
     */
    public Long getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 数据类型：0:待处理风险总数 1:影响资产总数，默认为0
     * @param BusinessType 数据类型：0:待处理风险总数 1:影响资产总数，默认为0
     */
    public void setBusinessType(Long BusinessType) {
        this.BusinessType = BusinessType;
    }

    public DescribeScreenEventsCntRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScreenEventsCntRequest(DescribeScreenEventsCntRequest source) {
        if (source.BusinessType != null) {
            this.BusinessType = new Long(source.BusinessType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);

    }
}

