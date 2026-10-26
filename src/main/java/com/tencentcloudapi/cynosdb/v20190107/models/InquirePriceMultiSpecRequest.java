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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceMultiSpecRequest extends AbstractModel {

    /**
    * <p>可用区,每个地域提供最佳实践</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS</p>
    */
    @SerializedName("InstancePayMode")
    @Expose
    private String InstancePayMode;

    /**
    * <p>存储购买类型，可选值为：PREPAID, POSTPAID</p>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private String StoragePayMode;

    /**
    * <p>商品规格</p>
    */
    @SerializedName("GoodsSpecs")
    @Expose
    private GoodsSpec [] GoodsSpecs;

    /**
     * Get <p>可用区,每个地域提供最佳实践</p> 
     * @return Zone <p>可用区,每个地域提供最佳实践</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区,每个地域提供最佳实践</p>
     * @param Zone <p>可用区,每个地域提供最佳实践</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS</p> 
     * @return InstancePayMode <p>实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS</p>
     */
    public String getInstancePayMode() {
        return this.InstancePayMode;
    }

    /**
     * Set <p>实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS</p>
     * @param InstancePayMode <p>实例购买类型，可选值为：PREPAID, POSTPAID, SERVERLESS</p>
     */
    public void setInstancePayMode(String InstancePayMode) {
        this.InstancePayMode = InstancePayMode;
    }

    /**
     * Get <p>存储购买类型，可选值为：PREPAID, POSTPAID</p> 
     * @return StoragePayMode <p>存储购买类型，可选值为：PREPAID, POSTPAID</p>
     */
    public String getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>存储购买类型，可选值为：PREPAID, POSTPAID</p>
     * @param StoragePayMode <p>存储购买类型，可选值为：PREPAID, POSTPAID</p>
     */
    public void setStoragePayMode(String StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get <p>商品规格</p> 
     * @return GoodsSpecs <p>商品规格</p>
     */
    public GoodsSpec [] getGoodsSpecs() {
        return this.GoodsSpecs;
    }

    /**
     * Set <p>商品规格</p>
     * @param GoodsSpecs <p>商品规格</p>
     */
    public void setGoodsSpecs(GoodsSpec [] GoodsSpecs) {
        this.GoodsSpecs = GoodsSpecs;
    }

    public InquirePriceMultiSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceMultiSpecRequest(InquirePriceMultiSpecRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstancePayMode != null) {
            this.InstancePayMode = new String(source.InstancePayMode);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new String(source.StoragePayMode);
        }
        if (source.GoodsSpecs != null) {
            this.GoodsSpecs = new GoodsSpec[source.GoodsSpecs.length];
            for (int i = 0; i < source.GoodsSpecs.length; i++) {
                this.GoodsSpecs[i] = new GoodsSpec(source.GoodsSpecs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstancePayMode", this.InstancePayMode);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamArrayObj(map, prefix + "GoodsSpecs.", this.GoodsSpecs);

    }
}

