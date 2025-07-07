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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeviceFailed extends AbstractModel {

    /**
    * 产品id
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 父设备wid，不为空表示导入自设备
    */
    @SerializedName("ParentWID")
    @Expose
    private String ParentWID;

    /**
    * 失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 设备sn序列号
    */
    @SerializedName("SN")
    @Expose
    private String SN;

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
     * Get 父设备wid，不为空表示导入自设备 
     * @return ParentWID 父设备wid，不为空表示导入自设备
     */
    public String getParentWID() {
        return this.ParentWID;
    }

    /**
     * Set 父设备wid，不为空表示导入自设备
     * @param ParentWID 父设备wid，不为空表示导入自设备
     */
    public void setParentWID(String ParentWID) {
        this.ParentWID = ParentWID;
    }

    /**
     * Get 失败原因 
     * @return Reason 失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 失败原因
     * @param Reason 失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
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

    public CreateDeviceFailed() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeviceFailed(CreateDeviceFailed source) {
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.ParentWID != null) {
            this.ParentWID = new String(source.ParentWID);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ParentWID", this.ParentWID);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "SN", this.SN);

    }
}

