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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDestRegionsRequest extends AbstractModel {

    /**
    * 通道质量:0表示金牌，1表示银牌。默认不传该参数，表示金牌。本参数确定查询指定通道质量的源站区域
    */
    @SerializedName("QualityType")
    @Expose
    private Long QualityType;

    /**
     * Get 通道质量:0表示金牌，1表示银牌。默认不传该参数，表示金牌。本参数确定查询指定通道质量的源站区域 
     * @return QualityType 通道质量:0表示金牌，1表示银牌。默认不传该参数，表示金牌。本参数确定查询指定通道质量的源站区域
     */
    public Long getQualityType() {
        return this.QualityType;
    }

    /**
     * Set 通道质量:0表示金牌，1表示银牌。默认不传该参数，表示金牌。本参数确定查询指定通道质量的源站区域
     * @param QualityType 通道质量:0表示金牌，1表示银牌。默认不传该参数，表示金牌。本参数确定查询指定通道质量的源站区域
     */
    public void setQualityType(Long QualityType) {
        this.QualityType = QualityType;
    }

    public DescribeDestRegionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDestRegionsRequest(DescribeDestRegionsRequest source) {
        if (source.QualityType != null) {
            this.QualityType = new Long(source.QualityType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QualityType", this.QualityType);

    }
}

