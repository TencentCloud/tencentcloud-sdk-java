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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadFirmwareRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 固件版本号
    */
    @SerializedName("FirmwareVersion")
    @Expose
    private String FirmwareVersion;

    /**
    * 固件的MD5值
    */
    @SerializedName("Md5sum")
    @Expose
    private String Md5sum;

    /**
    * 固件的大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 固件名称
    */
    @SerializedName("FirmwareName")
    @Expose
    private String FirmwareName;

    /**
    * 固件描述
    */
    @SerializedName("FirmwareDescription")
    @Expose
    private String FirmwareDescription;

    /**
    * 固件类型：选填 mcu、moudule。默认：mcu
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 固件版本号 
     * @return FirmwareVersion 固件版本号
     */
    public String getFirmwareVersion() {
        return this.FirmwareVersion;
    }

    /**
     * Set 固件版本号
     * @param FirmwareVersion 固件版本号
     */
    public void setFirmwareVersion(String FirmwareVersion) {
        this.FirmwareVersion = FirmwareVersion;
    }

    /**
     * Get 固件的MD5值 
     * @return Md5sum 固件的MD5值
     */
    public String getMd5sum() {
        return this.Md5sum;
    }

    /**
     * Set 固件的MD5值
     * @param Md5sum 固件的MD5值
     */
    public void setMd5sum(String Md5sum) {
        this.Md5sum = Md5sum;
    }

    /**
     * Get 固件的大小 
     * @return FileSize 固件的大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 固件的大小
     * @param FileSize 固件的大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 固件名称 
     * @return FirmwareName 固件名称
     */
    public String getFirmwareName() {
        return this.FirmwareName;
    }

    /**
     * Set 固件名称
     * @param FirmwareName 固件名称
     */
    public void setFirmwareName(String FirmwareName) {
        this.FirmwareName = FirmwareName;
    }

    /**
     * Get 固件描述 
     * @return FirmwareDescription 固件描述
     */
    public String getFirmwareDescription() {
        return this.FirmwareDescription;
    }

    /**
     * Set 固件描述
     * @param FirmwareDescription 固件描述
     */
    public void setFirmwareDescription(String FirmwareDescription) {
        this.FirmwareDescription = FirmwareDescription;
    }

    /**
     * Get 固件类型：选填 mcu、moudule。默认：mcu 
     * @return FwType 固件类型：选填 mcu、moudule。默认：mcu
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set 固件类型：选填 mcu、moudule。默认：mcu
     * @param FwType 固件类型：选填 mcu、moudule。默认：mcu
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    public UploadFirmwareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFirmwareRequest(UploadFirmwareRequest source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.FirmwareVersion != null) {
            this.FirmwareVersion = new String(source.FirmwareVersion);
        }
        if (source.Md5sum != null) {
            this.Md5sum = new String(source.Md5sum);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FirmwareName != null) {
            this.FirmwareName = new String(source.FirmwareName);
        }
        if (source.FirmwareDescription != null) {
            this.FirmwareDescription = new String(source.FirmwareDescription);
        }
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "FirmwareVersion", this.FirmwareVersion);
        this.setParamSimple(map, prefix + "Md5sum", this.Md5sum);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FirmwareName", this.FirmwareName);
        this.setParamSimple(map, prefix + "FirmwareDescription", this.FirmwareDescription);
        this.setParamSimple(map, prefix + "FwType", this.FwType);

    }
}

