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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSaleInfoRequest extends AbstractModel {

    /**
    * <p>灾备主实例地域</p>
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * <p>实例id</p><p>传入此参数表示返回这个实例所在的地域可用区的售卖信息</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>指定支持某种类型实例的 sale 信息</p><p>枚举值：</p><ul><li>serverless： 返回支持 serverless 型实例的所有 region</li></ul><p>默认值：无</p><p>当前仅支持指定 serverless，传入其他信息或者不传则默认返回所有售卖地域信息</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get <p>灾备主实例地域</p> 
     * @return SrcRegion <p>灾备主实例地域</p>
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set <p>灾备主实例地域</p>
     * @param SrcRegion <p>灾备主实例地域</p>
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get <p>实例id</p><p>传入此参数表示返回这个实例所在的地域可用区的售卖信息</p> 
     * @return InstanceId <p>实例id</p><p>传入此参数表示返回这个实例所在的地域可用区的售卖信息</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p><p>传入此参数表示返回这个实例所在的地域可用区的售卖信息</p>
     * @param InstanceId <p>实例id</p><p>传入此参数表示返回这个实例所在的地域可用区的售卖信息</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>指定支持某种类型实例的 sale 信息</p><p>枚举值：</p><ul><li>serverless： 返回支持 serverless 型实例的所有 region</li></ul><p>默认值：无</p><p>当前仅支持指定 serverless，传入其他信息或者不传则默认返回所有售卖地域信息</p> 
     * @return InstanceType <p>指定支持某种类型实例的 sale 信息</p><p>枚举值：</p><ul><li>serverless： 返回支持 serverless 型实例的所有 region</li></ul><p>默认值：无</p><p>当前仅支持指定 serverless，传入其他信息或者不传则默认返回所有售卖地域信息</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>指定支持某种类型实例的 sale 信息</p><p>枚举值：</p><ul><li>serverless： 返回支持 serverless 型实例的所有 region</li></ul><p>默认值：无</p><p>当前仅支持指定 serverless，传入其他信息或者不传则默认返回所有售卖地域信息</p>
     * @param InstanceType <p>指定支持某种类型实例的 sale 信息</p><p>枚举值：</p><ul><li>serverless： 返回支持 serverless 型实例的所有 region</li></ul><p>默认值：无</p><p>当前仅支持指定 serverless，传入其他信息或者不传则默认返回所有售卖地域信息</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public DescribeSaleInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSaleInfoRequest(DescribeSaleInfoRequest source) {
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

