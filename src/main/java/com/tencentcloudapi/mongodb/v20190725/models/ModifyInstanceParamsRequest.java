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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceParamsRequest extends AbstractModel {

    /**
    * 指定实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 指定需修改的参数名及值。当前所支持的参数名及对应取值范围，请通过 [DescribeInstanceParams ](https://cloud.tencent.com/document/product/240/65903)获取。
    */
    @SerializedName("InstanceParams")
    @Expose
    private ModifyMongoDBParamType [] InstanceParams;

    /**
    * 操作类型，包括：
- IMMEDIATELY：立即调整。
- DELAY：延迟调整。可选字段，不配置该参数则默认为立即调整。
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
     * Get 指定实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
 
     * @return InstanceId 指定实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

     * @param InstanceId 指定实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 指定需修改的参数名及值。当前所支持的参数名及对应取值范围，请通过 [DescribeInstanceParams ](https://cloud.tencent.com/document/product/240/65903)获取。 
     * @return InstanceParams 指定需修改的参数名及值。当前所支持的参数名及对应取值范围，请通过 [DescribeInstanceParams ](https://cloud.tencent.com/document/product/240/65903)获取。
     */
    public ModifyMongoDBParamType [] getInstanceParams() {
        return this.InstanceParams;
    }

    /**
     * Set 指定需修改的参数名及值。当前所支持的参数名及对应取值范围，请通过 [DescribeInstanceParams ](https://cloud.tencent.com/document/product/240/65903)获取。
     * @param InstanceParams 指定需修改的参数名及值。当前所支持的参数名及对应取值范围，请通过 [DescribeInstanceParams ](https://cloud.tencent.com/document/product/240/65903)获取。
     */
    public void setInstanceParams(ModifyMongoDBParamType [] InstanceParams) {
        this.InstanceParams = InstanceParams;
    }

    /**
     * Get 操作类型，包括：
- IMMEDIATELY：立即调整。
- DELAY：延迟调整。可选字段，不配置该参数则默认为立即调整。 
     * @return ModifyType 操作类型，包括：
- IMMEDIATELY：立即调整。
- DELAY：延迟调整。可选字段，不配置该参数则默认为立即调整。
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set 操作类型，包括：
- IMMEDIATELY：立即调整。
- DELAY：延迟调整。可选字段，不配置该参数则默认为立即调整。
     * @param ModifyType 操作类型，包括：
- IMMEDIATELY：立即调整。
- DELAY：延迟调整。可选字段，不配置该参数则默认为立即调整。
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    public ModifyInstanceParamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceParamsRequest(ModifyInstanceParamsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceParams != null) {
            this.InstanceParams = new ModifyMongoDBParamType[source.InstanceParams.length];
            for (int i = 0; i < source.InstanceParams.length; i++) {
                this.InstanceParams[i] = new ModifyMongoDBParamType(source.InstanceParams[i]);
            }
        }
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "InstanceParams.", this.InstanceParams);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);

    }
}

