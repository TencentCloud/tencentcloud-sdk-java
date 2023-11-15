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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddDeviceInfo extends AbstractModel {

    /**
    * 产品id
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 设备sn序列号
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * 父设备wid，不为空表示导入子设备
    */
    @SerializedName("ParentWID")
    @Expose
    private String ParentWID;

    /**
    * 密钥来源：0-使用产品密钥 1-使用设备特有的密钥
    */
    @SerializedName("KeySource")
    @Expose
    private Long KeySource;

    /**
     * Get 产品id 
     * @return ProductId 产品id
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品id
     * @param ProductId 产品id
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备sn序列号 
     * @return SN 设备sn序列号
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set 设备sn序列号
     * @param SN 设备sn序列号
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * Get 父设备wid，不为空表示导入子设备 
     * @return ParentWID 父设备wid，不为空表示导入子设备
     */
    public String getParentWID() {
        return this.ParentWID;
    }

    /**
     * Set 父设备wid，不为空表示导入子设备
     * @param ParentWID 父设备wid，不为空表示导入子设备
     */
    public void setParentWID(String ParentWID) {
        this.ParentWID = ParentWID;
    }

    /**
     * Get 密钥来源：0-使用产品密钥 1-使用设备特有的密钥 
     * @return KeySource 密钥来源：0-使用产品密钥 1-使用设备特有的密钥
     */
    public Long getKeySource() {
        return this.KeySource;
    }

    /**
     * Set 密钥来源：0-使用产品密钥 1-使用设备特有的密钥
     * @param KeySource 密钥来源：0-使用产品密钥 1-使用设备特有的密钥
     */
    public void setKeySource(Long KeySource) {
        this.KeySource = KeySource;
    }

    public AddDeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddDeviceInfo(AddDeviceInfo source) {
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.ParentWID != null) {
            this.ParentWID = new String(source.ParentWID);
        }
        if (source.KeySource != null) {
            this.KeySource = new Long(source.KeySource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "ParentWID", this.ParentWID);
        this.setParamSimple(map, prefix + "KeySource", this.KeySource);

    }
}

