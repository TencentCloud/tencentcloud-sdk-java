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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeTableOCRResponse extends AbstractModel{

    /**
    * 检测到的文本信息，具体内容请点击左侧链接。
    */
    @SerializedName("TableDetections")
    @Expose
    private TableDetectInfo [] TableDetections;

    /**
    * Base64 编码后的 Excel 数据。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 图片为PDF时，返回PDF的总页数，默认为0
    */
    @SerializedName("PdfPageSize")
    @Expose
    private Long PdfPageSize;

    /**
    * 图片旋转角度（角度制），文本的水平方向为0°，统一以逆时针方向旋转，逆时针为负，角度范围为-360°至0°。
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检测到的文本信息，具体内容请点击左侧链接。 
     * @return TableDetections 检测到的文本信息，具体内容请点击左侧链接。
     */
    public TableDetectInfo [] getTableDetections() {
        return this.TableDetections;
    }

    /**
     * Set 检测到的文本信息，具体内容请点击左侧链接。
     * @param TableDetections 检测到的文本信息，具体内容请点击左侧链接。
     */
    public void setTableDetections(TableDetectInfo [] TableDetections) {
        this.TableDetections = TableDetections;
    }

    /**
     * Get Base64 编码后的 Excel 数据。 
     * @return Data Base64 编码后的 Excel 数据。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set Base64 编码后的 Excel 数据。
     * @param Data Base64 编码后的 Excel 数据。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 图片为PDF时，返回PDF的总页数，默认为0 
     * @return PdfPageSize 图片为PDF时，返回PDF的总页数，默认为0
     */
    public Long getPdfPageSize() {
        return this.PdfPageSize;
    }

    /**
     * Set 图片为PDF时，返回PDF的总页数，默认为0
     * @param PdfPageSize 图片为PDF时，返回PDF的总页数，默认为0
     */
    public void setPdfPageSize(Long PdfPageSize) {
        this.PdfPageSize = PdfPageSize;
    }

    /**
     * Get 图片旋转角度（角度制），文本的水平方向为0°，统一以逆时针方向旋转，逆时针为负，角度范围为-360°至0°。 
     * @return Angle 图片旋转角度（角度制），文本的水平方向为0°，统一以逆时针方向旋转，逆时针为负，角度范围为-360°至0°。
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set 图片旋转角度（角度制），文本的水平方向为0°，统一以逆时针方向旋转，逆时针为负，角度范围为-360°至0°。
     * @param Angle 图片旋转角度（角度制），文本的水平方向为0°，统一以逆时针方向旋转，逆时针为负，角度范围为-360°至0°。
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RecognizeTableOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeTableOCRResponse(RecognizeTableOCRResponse source) {
        if (source.TableDetections != null) {
            this.TableDetections = new TableDetectInfo[source.TableDetections.length];
            for (int i = 0; i < source.TableDetections.length; i++) {
                this.TableDetections[i] = new TableDetectInfo(source.TableDetections[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.PdfPageSize != null) {
            this.PdfPageSize = new Long(source.PdfPageSize);
        }
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TableDetections.", this.TableDetections);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "PdfPageSize", this.PdfPageSize);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

