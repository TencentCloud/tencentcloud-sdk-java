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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceParamsRequest extends AbstractModel {

    /**
    * <p>指定实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>指定需修改的参数名及值。当前所支持的参数名及对应取值范围，请通过 <a href="https://cloud.tencent.com/document/product/240/65903">DescribeInstanceParams </a>获取。</p>
    */
    @SerializedName("InstanceParams")
    @Expose
    private ModifyMongoDBParamType [] InstanceParams;

    /**
    * <p>操作类型，包括：</p><ul><li>IMMEDIATELY：立即调整。</li><li>DELAY：延迟调整。可选字段，不配置该参数则默认为立即调整。</li></ul>
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
     * Get <p>指定实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定实例 ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>指定需修改的参数名及值。当前所支持的参数名及对应取值范围，请通过 <a href="https://cloud.tencent.com/document/product/240/65903">DescribeInstanceParams </a>获取。</p> 
     * @return InstanceParams <p>指定需修改的参数名及值。当前所支持的参数名及对应取值范围，请通过 <a href="https://cloud.tencent.com/document/product/240/65903">DescribeInstanceParams </a>获取。</p>
     */
    public ModifyMongoDBParamType [] getInstanceParams() {
        return this.InstanceParams;
    }

    /**
     * Set <p>指定需修改的参数名及值。当前所支持的参数名及对应取值范围，请通过 <a href="https://cloud.tencent.com/document/product/240/65903">DescribeInstanceParams </a>获取。</p>
     * @param InstanceParams <p>指定需修改的参数名及值。当前所支持的参数名及对应取值范围，请通过 <a href="https://cloud.tencent.com/document/product/240/65903">DescribeInstanceParams </a>获取。</p>
     */
    public void setInstanceParams(ModifyMongoDBParamType [] InstanceParams) {
        this.InstanceParams = InstanceParams;
    }

    /**
     * Get <p>操作类型，包括：</p><ul><li>IMMEDIATELY：立即调整。</li><li>DELAY：延迟调整。可选字段，不配置该参数则默认为立即调整。</li></ul> 
     * @return ModifyType <p>操作类型，包括：</p><ul><li>IMMEDIATELY：立即调整。</li><li>DELAY：延迟调整。可选字段，不配置该参数则默认为立即调整。</li></ul>
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set <p>操作类型，包括：</p><ul><li>IMMEDIATELY：立即调整。</li><li>DELAY：延迟调整。可选字段，不配置该参数则默认为立即调整。</li></ul>
     * @param ModifyType <p>操作类型，包括：</p><ul><li>IMMEDIATELY：立即调整。</li><li>DELAY：延迟调整。可选字段，不配置该参数则默认为立即调整。</li></ul>
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

