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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAndroidInstanceResolutionRequest extends AbstractModel {

    /**
    * 安卓实例 ID
    */
    @SerializedName("AndroidInstanceId")
    @Expose
    private String AndroidInstanceId;

    /**
    * 分辨率宽度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）、双开（A2）、三开（ A3）：建议设置为 1080
实例类型为 四开（A4） 及以上：建议设置为 720
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 分辨率高度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）、双开（A2）、三开（ A3）：建议设置为 1920
实例类型为 四开（A4） 及以上：建议设置为 1280
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 每英寸像素点。如果不填，系统将会计算一个合理的数值。修改 DPI 可能会导致 App 异常退出，请谨慎使用！
分辨率为 720x1280：建议配置为 320
分辨率为  1080x1920：建议配置为 480
    */
    @SerializedName("DPI")
    @Expose
    private Long DPI;

    /**
     * Get 安卓实例 ID 
     * @return AndroidInstanceId 安卓实例 ID
     */
    public String getAndroidInstanceId() {
        return this.AndroidInstanceId;
    }

    /**
     * Set 安卓实例 ID
     * @param AndroidInstanceId 安卓实例 ID
     */
    public void setAndroidInstanceId(String AndroidInstanceId) {
        this.AndroidInstanceId = AndroidInstanceId;
    }

    /**
     * Get 分辨率宽度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）、双开（A2）、三开（ A3）：建议设置为 1080
实例类型为 四开（A4） 及以上：建议设置为 720 
     * @return Width 分辨率宽度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）、双开（A2）、三开（ A3）：建议设置为 1080
实例类型为 四开（A4） 及以上：建议设置为 720
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 分辨率宽度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）、双开（A2）、三开（ A3）：建议设置为 1080
实例类型为 四开（A4） 及以上：建议设置为 720
     * @param Width 分辨率宽度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）、双开（A2）、三开（ A3）：建议设置为 1080
实例类型为 四开（A4） 及以上：建议设置为 720
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 分辨率高度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）、双开（A2）、三开（ A3）：建议设置为 1920
实例类型为 四开（A4） 及以上：建议设置为 1280 
     * @return Height 分辨率高度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）、双开（A2）、三开（ A3）：建议设置为 1920
实例类型为 四开（A4） 及以上：建议设置为 1280
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 分辨率高度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）、双开（A2）、三开（ A3）：建议设置为 1920
实例类型为 四开（A4） 及以上：建议设置为 1280
     * @param Height 分辨率高度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）、双开（A2）、三开（ A3）：建议设置为 1920
实例类型为 四开（A4） 及以上：建议设置为 1280
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 每英寸像素点。如果不填，系统将会计算一个合理的数值。修改 DPI 可能会导致 App 异常退出，请谨慎使用！
分辨率为 720x1280：建议配置为 320
分辨率为  1080x1920：建议配置为 480 
     * @return DPI 每英寸像素点。如果不填，系统将会计算一个合理的数值。修改 DPI 可能会导致 App 异常退出，请谨慎使用！
分辨率为 720x1280：建议配置为 320
分辨率为  1080x1920：建议配置为 480
     */
    public Long getDPI() {
        return this.DPI;
    }

    /**
     * Set 每英寸像素点。如果不填，系统将会计算一个合理的数值。修改 DPI 可能会导致 App 异常退出，请谨慎使用！
分辨率为 720x1280：建议配置为 320
分辨率为  1080x1920：建议配置为 480
     * @param DPI 每英寸像素点。如果不填，系统将会计算一个合理的数值。修改 DPI 可能会导致 App 异常退出，请谨慎使用！
分辨率为 720x1280：建议配置为 320
分辨率为  1080x1920：建议配置为 480
     */
    public void setDPI(Long DPI) {
        this.DPI = DPI;
    }

    public ModifyAndroidInstanceResolutionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAndroidInstanceResolutionRequest(ModifyAndroidInstanceResolutionRequest source) {
        if (source.AndroidInstanceId != null) {
            this.AndroidInstanceId = new String(source.AndroidInstanceId);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.DPI != null) {
            this.DPI = new Long(source.DPI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidInstanceId", this.AndroidInstanceId);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "DPI", this.DPI);

    }
}

