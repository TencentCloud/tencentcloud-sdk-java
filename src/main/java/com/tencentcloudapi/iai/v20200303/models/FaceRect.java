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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceRect extends AbstractModel {

    /**
    * 人脸框左上角横坐标。 
- 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。 
- 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 人脸框左上角纵坐标。 
- 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。 
- 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 人脸宽度。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 人脸高度。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 人脸框左上角横坐标。 
- 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。 
- 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。 
     * @return X 人脸框左上角横坐标。 
- 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。 
- 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 人脸框左上角横坐标。 
- 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。 
- 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     * @param X 人脸框左上角横坐标。 
- 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。 
- 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 人脸框左上角纵坐标。 
- 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。 
- 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。 
     * @return Y 人脸框左上角纵坐标。 
- 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。 
- 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 人脸框左上角纵坐标。 
- 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。 
- 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     * @param Y 人脸框左上角纵坐标。 
- 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。 
- 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 人脸宽度。 
     * @return Width 人脸宽度。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 人脸宽度。
     * @param Width 人脸宽度。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 人脸高度。 
     * @return Height 人脸高度。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 人脸高度。
     * @param Height 人脸高度。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public FaceRect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceRect(FaceRect source) {
        if (source.X != null) {
            this.X = new Long(source.X);
        }
        if (source.Y != null) {
            this.Y = new Long(source.Y);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

