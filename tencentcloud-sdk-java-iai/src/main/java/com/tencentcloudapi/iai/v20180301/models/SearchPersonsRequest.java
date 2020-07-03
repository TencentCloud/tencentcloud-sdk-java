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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchPersonsRequest extends AbstractModel{

    /**
    * 希望搜索的人员库列表，上限100个。
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * 图片 base64 数据，base64 编码后大小不可超过5M。
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
Url、Image必须提供一个，如果都提供，只使用 Url。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的Url速度和稳定性可能受一定影响。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 最多识别的人脸数目。默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。
MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。
例：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。
    */
    @SerializedName("MaxFaceNum")
    @Expose
    private Long MaxFaceNum;

    /**
    * 人脸长和宽的最小尺寸，单位为像素。默认为34。低于34将影响搜索精度。建议设置为80。
    */
    @SerializedName("MinFaceSize")
    @Expose
    private Long MinFaceSize;

    /**
    * 单张被识别的人脸返回的最相似人员数量。默认值为5，最大值为100。
例，设MaxFaceNum为1，MaxPersonNum为8，则返回Top8相似的人员信息。
值越大，需要处理的时间越长。建议不要超过10。
    */
    @SerializedName("MaxPersonNum")
    @Expose
    private Long MaxPersonNum;

    /**
    * 图片质量控制。 
0: 不进行控制； 
1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况； 
2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况； 
3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况； 
4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题； 
默认 0。 
若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
    */
    @SerializedName("QualityControl")
    @Expose
    private Long QualityControl;

    /**
    * 出参Score中，只有大于等于FaceMatchThreshold值的结果才会返回。默认为0。取值范围[0.0,100.0) 。
    */
    @SerializedName("FaceMatchThreshold")
    @Expose
    private Float FaceMatchThreshold;

    /**
    * 是否返回人员具体信息。0 为关闭，1 为开启。默认为 0。其他非0非1值默认为0
    */
    @SerializedName("NeedPersonInfo")
    @Expose
    private Long NeedPersonInfo;

    /**
    * 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
    */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
     * Get 希望搜索的人员库列表，上限100个。 
     * @return GroupIds 希望搜索的人员库列表，上限100个。
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 希望搜索的人员库列表，上限100个。
     * @param GroupIds 希望搜索的人员库列表，上限100个。
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 图片 base64 数据，base64 编码后大小不可超过5M。
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Image 图片 base64 数据，base64 编码后大小不可超过5M。
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片 base64 数据，base64 编码后大小不可超过5M。
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Image 图片 base64 数据，base64 编码后大小不可超过5M。
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
Url、Image必须提供一个，如果都提供，只使用 Url。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的Url速度和稳定性可能受一定影响。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Url 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
Url、Image必须提供一个，如果都提供，只使用 Url。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的Url速度和稳定性可能受一定影响。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
Url、Image必须提供一个，如果都提供，只使用 Url。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的Url速度和稳定性可能受一定影响。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Url 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
Url、Image必须提供一个，如果都提供，只使用 Url。
图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的Url速度和稳定性可能受一定影响。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 最多识别的人脸数目。默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。
MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。
例：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。 
     * @return MaxFaceNum 最多识别的人脸数目。默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。
MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。
例：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。
     */
    public Long getMaxFaceNum() {
        return this.MaxFaceNum;
    }

    /**
     * Set 最多识别的人脸数目。默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。
MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。
例：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。
     * @param MaxFaceNum 最多识别的人脸数目。默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。
MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。
例：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。
     */
    public void setMaxFaceNum(Long MaxFaceNum) {
        this.MaxFaceNum = MaxFaceNum;
    }

    /**
     * Get 人脸长和宽的最小尺寸，单位为像素。默认为34。低于34将影响搜索精度。建议设置为80。 
     * @return MinFaceSize 人脸长和宽的最小尺寸，单位为像素。默认为34。低于34将影响搜索精度。建议设置为80。
     */
    public Long getMinFaceSize() {
        return this.MinFaceSize;
    }

    /**
     * Set 人脸长和宽的最小尺寸，单位为像素。默认为34。低于34将影响搜索精度。建议设置为80。
     * @param MinFaceSize 人脸长和宽的最小尺寸，单位为像素。默认为34。低于34将影响搜索精度。建议设置为80。
     */
    public void setMinFaceSize(Long MinFaceSize) {
        this.MinFaceSize = MinFaceSize;
    }

    /**
     * Get 单张被识别的人脸返回的最相似人员数量。默认值为5，最大值为100。
例，设MaxFaceNum为1，MaxPersonNum为8，则返回Top8相似的人员信息。
值越大，需要处理的时间越长。建议不要超过10。 
     * @return MaxPersonNum 单张被识别的人脸返回的最相似人员数量。默认值为5，最大值为100。
例，设MaxFaceNum为1，MaxPersonNum为8，则返回Top8相似的人员信息。
值越大，需要处理的时间越长。建议不要超过10。
     */
    public Long getMaxPersonNum() {
        return this.MaxPersonNum;
    }

    /**
     * Set 单张被识别的人脸返回的最相似人员数量。默认值为5，最大值为100。
例，设MaxFaceNum为1，MaxPersonNum为8，则返回Top8相似的人员信息。
值越大，需要处理的时间越长。建议不要超过10。
     * @param MaxPersonNum 单张被识别的人脸返回的最相似人员数量。默认值为5，最大值为100。
例，设MaxFaceNum为1，MaxPersonNum为8，则返回Top8相似的人员信息。
值越大，需要处理的时间越长。建议不要超过10。
     */
    public void setMaxPersonNum(Long MaxPersonNum) {
        this.MaxPersonNum = MaxPersonNum;
    }

    /**
     * Get 图片质量控制。 
0: 不进行控制； 
1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况； 
2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况； 
3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况； 
4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题； 
默认 0。 
若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。 
     * @return QualityControl 图片质量控制。 
0: 不进行控制； 
1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况； 
2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况； 
3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况； 
4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题； 
默认 0。 
若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
     */
    public Long getQualityControl() {
        return this.QualityControl;
    }

    /**
     * Set 图片质量控制。 
0: 不进行控制； 
1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况； 
2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况； 
3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况； 
4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题； 
默认 0。 
若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
     * @param QualityControl 图片质量控制。 
0: 不进行控制； 
1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况； 
2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况； 
3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况； 
4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题； 
默认 0。 
若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
     */
    public void setQualityControl(Long QualityControl) {
        this.QualityControl = QualityControl;
    }

    /**
     * Get 出参Score中，只有大于等于FaceMatchThreshold值的结果才会返回。默认为0。取值范围[0.0,100.0) 。 
     * @return FaceMatchThreshold 出参Score中，只有大于等于FaceMatchThreshold值的结果才会返回。默认为0。取值范围[0.0,100.0) 。
     */
    public Float getFaceMatchThreshold() {
        return this.FaceMatchThreshold;
    }

    /**
     * Set 出参Score中，只有大于等于FaceMatchThreshold值的结果才会返回。默认为0。取值范围[0.0,100.0) 。
     * @param FaceMatchThreshold 出参Score中，只有大于等于FaceMatchThreshold值的结果才会返回。默认为0。取值范围[0.0,100.0) 。
     */
    public void setFaceMatchThreshold(Float FaceMatchThreshold) {
        this.FaceMatchThreshold = FaceMatchThreshold;
    }

    /**
     * Get 是否返回人员具体信息。0 为关闭，1 为开启。默认为 0。其他非0非1值默认为0 
     * @return NeedPersonInfo 是否返回人员具体信息。0 为关闭，1 为开启。默认为 0。其他非0非1值默认为0
     */
    public Long getNeedPersonInfo() {
        return this.NeedPersonInfo;
    }

    /**
     * Set 是否返回人员具体信息。0 为关闭，1 为开启。默认为 0。其他非0非1值默认为0
     * @param NeedPersonInfo 是否返回人员具体信息。0 为关闭，1 为开启。默认为 0。其他非0非1值默认为0
     */
    public void setNeedPersonInfo(Long NeedPersonInfo) {
        this.NeedPersonInfo = NeedPersonInfo;
    }

    /**
     * Get 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。 
     * @return NeedRotateDetection 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     */
    public Long getNeedRotateDetection() {
        return this.NeedRotateDetection;
    }

    /**
     * Set 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     * @param NeedRotateDetection 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     */
    public void setNeedRotateDetection(Long NeedRotateDetection) {
        this.NeedRotateDetection = NeedRotateDetection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "MaxFaceNum", this.MaxFaceNum);
        this.setParamSimple(map, prefix + "MinFaceSize", this.MinFaceSize);
        this.setParamSimple(map, prefix + "MaxPersonNum", this.MaxPersonNum);
        this.setParamSimple(map, prefix + "QualityControl", this.QualityControl);
        this.setParamSimple(map, prefix + "FaceMatchThreshold", this.FaceMatchThreshold);
        this.setParamSimple(map, prefix + "NeedPersonInfo", this.NeedPersonInfo);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);

    }
}

