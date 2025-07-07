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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QrcodeResultsInfo extends AbstractModel {

    /**
    * 类型包括
二维码：QR_CODE
一维码：EAN-13、EAN-8、EAN-2、UPC-A、UPC-E、CODE-39、CODE-93、CODE-128 
PDF：PDF_417
DataMatrix：DATA_MATRIX
小程序码：WX_CODE
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 二维码/条形码包含的地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 二维码/条形码坐标
    */
    @SerializedName("Position")
    @Expose
    private QrcodePositionObj Position;

    /**
     * Get 类型包括
二维码：QR_CODE
一维码：EAN-13、EAN-8、EAN-2、UPC-A、UPC-E、CODE-39、CODE-93、CODE-128 
PDF：PDF_417
DataMatrix：DATA_MATRIX
小程序码：WX_CODE 
     * @return TypeName 类型包括
二维码：QR_CODE
一维码：EAN-13、EAN-8、EAN-2、UPC-A、UPC-E、CODE-39、CODE-93、CODE-128 
PDF：PDF_417
DataMatrix：DATA_MATRIX
小程序码：WX_CODE
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 类型包括
二维码：QR_CODE
一维码：EAN-13、EAN-8、EAN-2、UPC-A、UPC-E、CODE-39、CODE-93、CODE-128 
PDF：PDF_417
DataMatrix：DATA_MATRIX
小程序码：WX_CODE
     * @param TypeName 类型包括
二维码：QR_CODE
一维码：EAN-13、EAN-8、EAN-2、UPC-A、UPC-E、CODE-39、CODE-93、CODE-128 
PDF：PDF_417
DataMatrix：DATA_MATRIX
小程序码：WX_CODE
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 二维码/条形码包含的地址 
     * @return Url 二维码/条形码包含的地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 二维码/条形码包含的地址
     * @param Url 二维码/条形码包含的地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 二维码/条形码坐标 
     * @return Position 二维码/条形码坐标
     */
    public QrcodePositionObj getPosition() {
        return this.Position;
    }

    /**
     * Set 二维码/条形码坐标
     * @param Position 二维码/条形码坐标
     */
    public void setPosition(QrcodePositionObj Position) {
        this.Position = Position;
    }

    public QrcodeResultsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QrcodeResultsInfo(QrcodeResultsInfo source) {
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Position != null) {
            this.Position = new QrcodePositionObj(source.Position);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "Position.", this.Position);

    }
}

