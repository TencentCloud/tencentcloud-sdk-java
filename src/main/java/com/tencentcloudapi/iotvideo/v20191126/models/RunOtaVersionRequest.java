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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunOtaVersionRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 固件版本号，格式为x.y.z， x，y 范围0-63，z范围1~524288
    */
    @SerializedName("OtaVersion")
    @Expose
    private String OtaVersion;

    /**
    * 灰度值,取值范围0-100，为0时相当于暂停发布
    */
    @SerializedName("GrayValue")
    @Expose
    private Long GrayValue;

    /**
    * 指定的旧版本
    */
    @SerializedName("OldVersions")
    @Expose
    private String [] OldVersions;

    /**
    * 操作人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 版本发布的描述信息，需要国际化，可以为空
    */
    @SerializedName("Contents")
    @Expose
    private Contents Contents;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 固件版本号，格式为x.y.z， x，y 范围0-63，z范围1~524288 
     * @return OtaVersion 固件版本号，格式为x.y.z， x，y 范围0-63，z范围1~524288
     */
    public String getOtaVersion() {
        return this.OtaVersion;
    }

    /**
     * Set 固件版本号，格式为x.y.z， x，y 范围0-63，z范围1~524288
     * @param OtaVersion 固件版本号，格式为x.y.z， x，y 范围0-63，z范围1~524288
     */
    public void setOtaVersion(String OtaVersion) {
        this.OtaVersion = OtaVersion;
    }

    /**
     * Get 灰度值,取值范围0-100，为0时相当于暂停发布 
     * @return GrayValue 灰度值,取值范围0-100，为0时相当于暂停发布
     */
    public Long getGrayValue() {
        return this.GrayValue;
    }

    /**
     * Set 灰度值,取值范围0-100，为0时相当于暂停发布
     * @param GrayValue 灰度值,取值范围0-100，为0时相当于暂停发布
     */
    public void setGrayValue(Long GrayValue) {
        this.GrayValue = GrayValue;
    }

    /**
     * Get 指定的旧版本 
     * @return OldVersions 指定的旧版本
     */
    public String [] getOldVersions() {
        return this.OldVersions;
    }

    /**
     * Set 指定的旧版本
     * @param OldVersions 指定的旧版本
     */
    public void setOldVersions(String [] OldVersions) {
        this.OldVersions = OldVersions;
    }

    /**
     * Get 操作人 
     * @return Operator 操作人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人
     * @param Operator 操作人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 版本发布的描述信息，需要国际化，可以为空 
     * @return Contents 版本发布的描述信息，需要国际化，可以为空
     */
    public Contents getContents() {
        return this.Contents;
    }

    /**
     * Set 版本发布的描述信息，需要国际化，可以为空
     * @param Contents 版本发布的描述信息，需要国际化，可以为空
     */
    public void setContents(Contents Contents) {
        this.Contents = Contents;
    }

    public RunOtaVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunOtaVersionRequest(RunOtaVersionRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.OtaVersion != null) {
            this.OtaVersion = new String(source.OtaVersion);
        }
        if (source.GrayValue != null) {
            this.GrayValue = new Long(source.GrayValue);
        }
        if (source.OldVersions != null) {
            this.OldVersions = new String[source.OldVersions.length];
            for (int i = 0; i < source.OldVersions.length; i++) {
                this.OldVersions[i] = new String(source.OldVersions[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Contents != null) {
            this.Contents = new Contents(source.Contents);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "OtaVersion", this.OtaVersion);
        this.setParamSimple(map, prefix + "GrayValue", this.GrayValue);
        this.setParamArraySimple(map, prefix + "OldVersions.", this.OldVersions);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamObj(map, prefix + "Contents.", this.Contents);

    }
}

