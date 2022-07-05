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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCuttingOutForm extends AbstractModel{

    /**
    * 输出类型，可选值：
Static：静态图；
Dynamic：动态图；
Sprite：雪碧图；
Video：视频。

注1：不同类型时，对应的 TargetInfo.Format 格式支持如下：
Static：jpg、png；
Dynamic：gif；
Sprite：jpg、png；
Video：mp4。

注2：当 Type=Sprite时，TargetInfo指定的尺寸表示小图的大小，最终结果尺寸以输出为准。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 背景填充方式，可选值：
White：白色填充；
Black：黑色填充；
Stretch：拉伸；
Gaussian：高斯模糊；
默认White。
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * 【废弃】参考SpriteInfo
    */
    @SerializedName("SpriteRowCount")
    @Expose
    private Long SpriteRowCount;

    /**
    * 【废弃】参考SpriteInfo
    */
    @SerializedName("SpriteColumnCount")
    @Expose
    private Long SpriteColumnCount;

    /**
    * Type=Sprite时有效，表示雪碧图参数信息。
    */
    @SerializedName("SpriteInfo")
    @Expose
    private SpriteImageInfo SpriteInfo;

    /**
    * Type=Dynamic时有效，表示动图参数信息。
    */
    @SerializedName("DynamicInfo")
    @Expose
    private DynamicImageInfo DynamicInfo;

    /**
     * Get 输出类型，可选值：
Static：静态图；
Dynamic：动态图；
Sprite：雪碧图；
Video：视频。

注1：不同类型时，对应的 TargetInfo.Format 格式支持如下：
Static：jpg、png；
Dynamic：gif；
Sprite：jpg、png；
Video：mp4。

注2：当 Type=Sprite时，TargetInfo指定的尺寸表示小图的大小，最终结果尺寸以输出为准。 
     * @return Type 输出类型，可选值：
Static：静态图；
Dynamic：动态图；
Sprite：雪碧图；
Video：视频。

注1：不同类型时，对应的 TargetInfo.Format 格式支持如下：
Static：jpg、png；
Dynamic：gif；
Sprite：jpg、png；
Video：mp4。

注2：当 Type=Sprite时，TargetInfo指定的尺寸表示小图的大小，最终结果尺寸以输出为准。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 输出类型，可选值：
Static：静态图；
Dynamic：动态图；
Sprite：雪碧图；
Video：视频。

注1：不同类型时，对应的 TargetInfo.Format 格式支持如下：
Static：jpg、png；
Dynamic：gif；
Sprite：jpg、png；
Video：mp4。

注2：当 Type=Sprite时，TargetInfo指定的尺寸表示小图的大小，最终结果尺寸以输出为准。
     * @param Type 输出类型，可选值：
Static：静态图；
Dynamic：动态图；
Sprite：雪碧图；
Video：视频。

注1：不同类型时，对应的 TargetInfo.Format 格式支持如下：
Static：jpg、png；
Dynamic：gif；
Sprite：jpg、png；
Video：mp4。

注2：当 Type=Sprite时，TargetInfo指定的尺寸表示小图的大小，最终结果尺寸以输出为准。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 背景填充方式，可选值：
White：白色填充；
Black：黑色填充；
Stretch：拉伸；
Gaussian：高斯模糊；
默认White。 
     * @return FillType 背景填充方式，可选值：
White：白色填充；
Black：黑色填充；
Stretch：拉伸；
Gaussian：高斯模糊；
默认White。
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set 背景填充方式，可选值：
White：白色填充；
Black：黑色填充；
Stretch：拉伸；
Gaussian：高斯模糊；
默认White。
     * @param FillType 背景填充方式，可选值：
White：白色填充；
Black：黑色填充；
Stretch：拉伸；
Gaussian：高斯模糊；
默认White。
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get 【废弃】参考SpriteInfo 
     * @return SpriteRowCount 【废弃】参考SpriteInfo
     */
    public Long getSpriteRowCount() {
        return this.SpriteRowCount;
    }

    /**
     * Set 【废弃】参考SpriteInfo
     * @param SpriteRowCount 【废弃】参考SpriteInfo
     */
    public void setSpriteRowCount(Long SpriteRowCount) {
        this.SpriteRowCount = SpriteRowCount;
    }

    /**
     * Get 【废弃】参考SpriteInfo 
     * @return SpriteColumnCount 【废弃】参考SpriteInfo
     */
    public Long getSpriteColumnCount() {
        return this.SpriteColumnCount;
    }

    /**
     * Set 【废弃】参考SpriteInfo
     * @param SpriteColumnCount 【废弃】参考SpriteInfo
     */
    public void setSpriteColumnCount(Long SpriteColumnCount) {
        this.SpriteColumnCount = SpriteColumnCount;
    }

    /**
     * Get Type=Sprite时有效，表示雪碧图参数信息。 
     * @return SpriteInfo Type=Sprite时有效，表示雪碧图参数信息。
     */
    public SpriteImageInfo getSpriteInfo() {
        return this.SpriteInfo;
    }

    /**
     * Set Type=Sprite时有效，表示雪碧图参数信息。
     * @param SpriteInfo Type=Sprite时有效，表示雪碧图参数信息。
     */
    public void setSpriteInfo(SpriteImageInfo SpriteInfo) {
        this.SpriteInfo = SpriteInfo;
    }

    /**
     * Get Type=Dynamic时有效，表示动图参数信息。 
     * @return DynamicInfo Type=Dynamic时有效，表示动图参数信息。
     */
    public DynamicImageInfo getDynamicInfo() {
        return this.DynamicInfo;
    }

    /**
     * Set Type=Dynamic时有效，表示动图参数信息。
     * @param DynamicInfo Type=Dynamic时有效，表示动图参数信息。
     */
    public void setDynamicInfo(DynamicImageInfo DynamicInfo) {
        this.DynamicInfo = DynamicInfo;
    }

    public MediaCuttingOutForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCuttingOutForm(MediaCuttingOutForm source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
        if (source.SpriteRowCount != null) {
            this.SpriteRowCount = new Long(source.SpriteRowCount);
        }
        if (source.SpriteColumnCount != null) {
            this.SpriteColumnCount = new Long(source.SpriteColumnCount);
        }
        if (source.SpriteInfo != null) {
            this.SpriteInfo = new SpriteImageInfo(source.SpriteInfo);
        }
        if (source.DynamicInfo != null) {
            this.DynamicInfo = new DynamicImageInfo(source.DynamicInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "SpriteRowCount", this.SpriteRowCount);
        this.setParamSimple(map, prefix + "SpriteColumnCount", this.SpriteColumnCount);
        this.setParamObj(map, prefix + "SpriteInfo.", this.SpriteInfo);
        this.setParamObj(map, prefix + "DynamicInfo.", this.DynamicInfo);

    }
}

