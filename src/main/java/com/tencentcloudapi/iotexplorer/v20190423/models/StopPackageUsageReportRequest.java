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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopPackageUsageReportRequest extends AbstractModel {

    /**
    * <p>产品 ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>区分停用的云存类别，必填</p><p>枚举值：</p><ul><li>image： 图片云存</li><li>video： 视频云存</li></ul>
    */
    @SerializedName("MediaType")
    @Expose
    private String MediaType;

    /**
    * <p>通道 ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * <p>操作者</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>备注（可选）</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>产品 ID</p> 
     * @return ProductId <p>产品 ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品 ID</p>
     * @param ProductId <p>产品 ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名</p> 
     * @return DeviceName <p>设备名</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名</p>
     * @param DeviceName <p>设备名</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>区分停用的云存类别，必填</p><p>枚举值：</p><ul><li>image： 图片云存</li><li>video： 视频云存</li></ul> 
     * @return MediaType <p>区分停用的云存类别，必填</p><p>枚举值：</p><ul><li>image： 图片云存</li><li>video： 视频云存</li></ul>
     */
    public String getMediaType() {
        return this.MediaType;
    }

    /**
     * Set <p>区分停用的云存类别，必填</p><p>枚举值：</p><ul><li>image： 图片云存</li><li>video： 视频云存</li></ul>
     * @param MediaType <p>区分停用的云存类别，必填</p><p>枚举值：</p><ul><li>image： 图片云存</li><li>video： 视频云存</li></ul>
     */
    public void setMediaType(String MediaType) {
        this.MediaType = MediaType;
    }

    /**
     * Get <p>通道 ID</p> 
     * @return ChannelId <p>通道 ID</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道 ID</p>
     * @param ChannelId <p>通道 ID</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>操作者</p> 
     * @return Operator <p>操作者</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者</p>
     * @param Operator <p>操作者</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>备注（可选）</p> 
     * @return Remark <p>备注（可选）</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注（可选）</p>
     * @param Remark <p>备注（可选）</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public StopPackageUsageReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopPackageUsageReportRequest(StopPackageUsageReportRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.MediaType != null) {
            this.MediaType = new String(source.MediaType);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

