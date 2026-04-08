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

public class CropEnhanceImageOCRResponse extends AbstractModel {

    /**
    * <p>处理后图的宽</p>
    */
    @SerializedName("CroppedWidth")
    @Expose
    private Long CroppedWidth;

    /**
    * <p>处理后图的高</p>
    */
    @SerializedName("CroppedHeight")
    @Expose
    private Long CroppedHeight;

    /**
    * <p>图像处理后的jpg图片，base64格式</p>
    */
    @SerializedName("CroppedImage")
    @Expose
    private String CroppedImage;

    /**
    * <p>切图区域的4个角点坐标, 是个长度为8的数组<br>[0,1,2,3,4,5,6,7]</p><p>(0,1) 左上角坐标<br>(2,3) 右上角坐标<br>(4,5) 右下角坐标<br>(6,7) 左下角坐标</p>
    */
    @SerializedName("Position")
    @Expose
    private Long [] Position;

    /**
    * <p>图像角度，AdjustOrientation =1时生效, 返回值如下  -1: 失败  0、90、180、270</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Angle")
    @Expose
    private Long Angle;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>处理后图的宽</p> 
     * @return CroppedWidth <p>处理后图的宽</p>
     */
    public Long getCroppedWidth() {
        return this.CroppedWidth;
    }

    /**
     * Set <p>处理后图的宽</p>
     * @param CroppedWidth <p>处理后图的宽</p>
     */
    public void setCroppedWidth(Long CroppedWidth) {
        this.CroppedWidth = CroppedWidth;
    }

    /**
     * Get <p>处理后图的高</p> 
     * @return CroppedHeight <p>处理后图的高</p>
     */
    public Long getCroppedHeight() {
        return this.CroppedHeight;
    }

    /**
     * Set <p>处理后图的高</p>
     * @param CroppedHeight <p>处理后图的高</p>
     */
    public void setCroppedHeight(Long CroppedHeight) {
        this.CroppedHeight = CroppedHeight;
    }

    /**
     * Get <p>图像处理后的jpg图片，base64格式</p> 
     * @return CroppedImage <p>图像处理后的jpg图片，base64格式</p>
     */
    public String getCroppedImage() {
        return this.CroppedImage;
    }

    /**
     * Set <p>图像处理后的jpg图片，base64格式</p>
     * @param CroppedImage <p>图像处理后的jpg图片，base64格式</p>
     */
    public void setCroppedImage(String CroppedImage) {
        this.CroppedImage = CroppedImage;
    }

    /**
     * Get <p>切图区域的4个角点坐标, 是个长度为8的数组<br>[0,1,2,3,4,5,6,7]</p><p>(0,1) 左上角坐标<br>(2,3) 右上角坐标<br>(4,5) 右下角坐标<br>(6,7) 左下角坐标</p> 
     * @return Position <p>切图区域的4个角点坐标, 是个长度为8的数组<br>[0,1,2,3,4,5,6,7]</p><p>(0,1) 左上角坐标<br>(2,3) 右上角坐标<br>(4,5) 右下角坐标<br>(6,7) 左下角坐标</p>
     */
    public Long [] getPosition() {
        return this.Position;
    }

    /**
     * Set <p>切图区域的4个角点坐标, 是个长度为8的数组<br>[0,1,2,3,4,5,6,7]</p><p>(0,1) 左上角坐标<br>(2,3) 右上角坐标<br>(4,5) 右下角坐标<br>(6,7) 左下角坐标</p>
     * @param Position <p>切图区域的4个角点坐标, 是个长度为8的数组<br>[0,1,2,3,4,5,6,7]</p><p>(0,1) 左上角坐标<br>(2,3) 右上角坐标<br>(4,5) 右下角坐标<br>(6,7) 左下角坐标</p>
     */
    public void setPosition(Long [] Position) {
        this.Position = Position;
    }

    /**
     * Get <p>图像角度，AdjustOrientation =1时生效, 返回值如下  -1: 失败  0、90、180、270</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Angle <p>图像角度，AdjustOrientation =1时生效, 返回值如下  -1: 失败  0、90、180、270</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAngle() {
        return this.Angle;
    }

    /**
     * Set <p>图像角度，AdjustOrientation =1时生效, 返回值如下  -1: 失败  0、90、180、270</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Angle <p>图像角度，AdjustOrientation =1时生效, 返回值如下  -1: 失败  0、90、180、270</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAngle(Long Angle) {
        this.Angle = Angle;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CropEnhanceImageOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CropEnhanceImageOCRResponse(CropEnhanceImageOCRResponse source) {
        if (source.CroppedWidth != null) {
            this.CroppedWidth = new Long(source.CroppedWidth);
        }
        if (source.CroppedHeight != null) {
            this.CroppedHeight = new Long(source.CroppedHeight);
        }
        if (source.CroppedImage != null) {
            this.CroppedImage = new String(source.CroppedImage);
        }
        if (source.Position != null) {
            this.Position = new Long[source.Position.length];
            for (int i = 0; i < source.Position.length; i++) {
                this.Position[i] = new Long(source.Position[i]);
            }
        }
        if (source.Angle != null) {
            this.Angle = new Long(source.Angle);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CroppedWidth", this.CroppedWidth);
        this.setParamSimple(map, prefix + "CroppedHeight", this.CroppedHeight);
        this.setParamSimple(map, prefix + "CroppedImage", this.CroppedImage);
        this.setParamArraySimple(map, prefix + "Position.", this.Position);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

