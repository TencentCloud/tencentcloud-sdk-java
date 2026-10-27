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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKmsInstanceRequest extends AbstractModel {

    /**
    * <p>实例付费类型(PREPAID)</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>版本类型</p><p>枚举值：</p><ul><li>professional： 专业版</li></ul>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * <p>预付费实例信息</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>可重入客户端ID</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>实例标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>实例付费类型(PREPAID)</p> 
     * @return InstanceChargeType <p>实例付费类型(PREPAID)</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例付费类型(PREPAID)</p>
     * @param InstanceChargeType <p>实例付费类型(PREPAID)</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>版本类型</p><p>枚举值：</p><ul><li>professional： 专业版</li></ul> 
     * @return ProductVersion <p>版本类型</p><p>枚举值：</p><ul><li>professional： 专业版</li></ul>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>版本类型</p><p>枚举值：</p><ul><li>professional： 专业版</li></ul>
     * @param ProductVersion <p>版本类型</p><p>枚举值：</p><ul><li>professional： 专业版</li></ul>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get <p>预付费实例信息</p> 
     * @return InstanceChargePrepaid <p>预付费实例信息</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>预付费实例信息</p>
     * @param InstanceChargePrepaid <p>预付费实例信息</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>可重入客户端ID</p> 
     * @return ClientToken <p>可重入客户端ID</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>可重入客户端ID</p>
     * @param ClientToken <p>可重入客户端ID</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>实例标签</p> 
     * @return Tags <p>实例标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>实例标签</p>
     * @param Tags <p>实例标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateKmsInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKmsInstanceRequest(CreateKmsInstanceRequest source) {
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

