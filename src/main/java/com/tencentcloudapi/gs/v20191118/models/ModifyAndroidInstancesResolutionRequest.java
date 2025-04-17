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

public class ModifyAndroidInstancesResolutionRequest extends AbstractModel {

    /**
    * 安卓实例 ID 列表
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
    * 分辨率宽度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 1080
实例类型为双开（A2） 及以上：建议设置为 720
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 分辨率高度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 1920
实例类型为双开（A2） 及以上：建议设置为 1280
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 每英寸像素点。
分辨率为 720x1280：建议配置为 320
分辨率为  1080x1920：建议配置为 480
    */
    @SerializedName("DPI")
    @Expose
    private Long DPI;

    /**
    * 帧率。ResolutionType 为 PHYSICAL 时才会修改帧率。另外建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 60
实例类型为双开（A2） 及以上：建议设置为 30
    */
    @SerializedName("FPS")
    @Expose
    private Long FPS;

    /**
    * 修改分辨率类型。修改物理分辨率，需要重启才能生效。
OVERRIDE：默认值，修改覆盖（显示）分辨率
PHYSICAL：修改物理分辨率
    */
    @SerializedName("ResolutionType")
    @Expose
    private String ResolutionType;

    /**
     * Get 安卓实例 ID 列表 
     * @return AndroidInstanceIds 安卓实例 ID 列表
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set 安卓实例 ID 列表
     * @param AndroidInstanceIds 安卓实例 ID 列表
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
    }

    /**
     * Get 分辨率宽度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 1080
实例类型为双开（A2） 及以上：建议设置为 720 
     * @return Width 分辨率宽度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 1080
实例类型为双开（A2） 及以上：建议设置为 720
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 分辨率宽度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 1080
实例类型为双开（A2） 及以上：建议设置为 720
     * @param Width 分辨率宽度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 1080
实例类型为双开（A2） 及以上：建议设置为 720
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 分辨率高度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 1920
实例类型为双开（A2） 及以上：建议设置为 1280 
     * @return Height 分辨率高度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 1920
实例类型为双开（A2） 及以上：建议设置为 1280
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 分辨率高度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 1920
实例类型为双开（A2） 及以上：建议设置为 1280
     * @param Height 分辨率高度。建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 1920
实例类型为双开（A2） 及以上：建议设置为 1280
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 每英寸像素点。
分辨率为 720x1280：建议配置为 320
分辨率为  1080x1920：建议配置为 480 
     * @return DPI 每英寸像素点。
分辨率为 720x1280：建议配置为 320
分辨率为  1080x1920：建议配置为 480
     */
    public Long getDPI() {
        return this.DPI;
    }

    /**
     * Set 每英寸像素点。
分辨率为 720x1280：建议配置为 320
分辨率为  1080x1920：建议配置为 480
     * @param DPI 每英寸像素点。
分辨率为 720x1280：建议配置为 320
分辨率为  1080x1920：建议配置为 480
     */
    public void setDPI(Long DPI) {
        this.DPI = DPI;
    }

    /**
     * Get 帧率。ResolutionType 为 PHYSICAL 时才会修改帧率。另外建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 60
实例类型为双开（A2） 及以上：建议设置为 30 
     * @return FPS 帧率。ResolutionType 为 PHYSICAL 时才会修改帧率。另外建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 60
实例类型为双开（A2） 及以上：建议设置为 30
     */
    public Long getFPS() {
        return this.FPS;
    }

    /**
     * Set 帧率。ResolutionType 为 PHYSICAL 时才会修改帧率。另外建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 60
实例类型为双开（A2） 及以上：建议设置为 30
     * @param FPS 帧率。ResolutionType 为 PHYSICAL 时才会修改帧率。另外建议按照以下数值设置，避免出现性能不足问题：
实例类型为单开（A1）：建议设置为 60
实例类型为双开（A2） 及以上：建议设置为 30
     */
    public void setFPS(Long FPS) {
        this.FPS = FPS;
    }

    /**
     * Get 修改分辨率类型。修改物理分辨率，需要重启才能生效。
OVERRIDE：默认值，修改覆盖（显示）分辨率
PHYSICAL：修改物理分辨率 
     * @return ResolutionType 修改分辨率类型。修改物理分辨率，需要重启才能生效。
OVERRIDE：默认值，修改覆盖（显示）分辨率
PHYSICAL：修改物理分辨率
     */
    public String getResolutionType() {
        return this.ResolutionType;
    }

    /**
     * Set 修改分辨率类型。修改物理分辨率，需要重启才能生效。
OVERRIDE：默认值，修改覆盖（显示）分辨率
PHYSICAL：修改物理分辨率
     * @param ResolutionType 修改分辨率类型。修改物理分辨率，需要重启才能生效。
OVERRIDE：默认值，修改覆盖（显示）分辨率
PHYSICAL：修改物理分辨率
     */
    public void setResolutionType(String ResolutionType) {
        this.ResolutionType = ResolutionType;
    }

    public ModifyAndroidInstancesResolutionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAndroidInstancesResolutionRequest(ModifyAndroidInstancesResolutionRequest source) {
        if (source.AndroidInstanceIds != null) {
            this.AndroidInstanceIds = new String[source.AndroidInstanceIds.length];
            for (int i = 0; i < source.AndroidInstanceIds.length; i++) {
                this.AndroidInstanceIds[i] = new String(source.AndroidInstanceIds[i]);
            }
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
        if (source.FPS != null) {
            this.FPS = new Long(source.FPS);
        }
        if (source.ResolutionType != null) {
            this.ResolutionType = new String(source.ResolutionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AndroidInstanceIds.", this.AndroidInstanceIds);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "DPI", this.DPI);
        this.setParamSimple(map, prefix + "FPS", this.FPS);
        this.setParamSimple(map, prefix + "ResolutionType", this.ResolutionType);

    }
}

