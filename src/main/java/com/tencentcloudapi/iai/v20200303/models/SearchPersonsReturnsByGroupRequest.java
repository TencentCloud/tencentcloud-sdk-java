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

public class SearchPersonsReturnsByGroupRequest extends AbstractModel {

    /**
    * 希望搜索的人员库列表，上限60个。数组元素取值为创建人员库接口中的GroupId。
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * 图片 base64 数据。
- base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- 所有格式的图片短边像素不小于64。
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 图片的 Url 。
- 对应图片 base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- 所有格式的图片短边像素不小于64。
- Url、Image必须提供一个，如果都提供，只使用 Url。
- 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
- 非腾讯云存储的Url速度和稳定性可能受一定影响。
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 最多识别的人脸数目。
- 默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。
- MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。
- 例：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。
    */
    @SerializedName("MaxFaceNum")
    @Expose
    private Long MaxFaceNum;

    /**
    * 人脸长和宽的最小尺寸，单位为像素。
- 默认为34。
- 低于34将影响搜索精度。
- 建议设置为80。
    */
    @SerializedName("MinFaceSize")
    @Expose
    private Long MinFaceSize;

    /**
    * 被检测到的人脸，对应最多返回的最相似人员数目。
- 默认值为5，最大值为10。  
- 例，设MaxFaceNum为3，MaxPersonNumPerGroup为5，GroupIds长度为3，则最多可能返回3*5*3=45个人员。
    */
    @SerializedName("MaxPersonNumPerGroup")
    @Expose
    private Long MaxPersonNumPerGroup;

    /**
    * 图片质量控制。 
- 取值范围：
0: 不进行控制。
1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况。
2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况。
3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况。
4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题。
- 默认 0。 
- 若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
    */
    @SerializedName("QualityControl")
    @Expose
    private Long QualityControl;

    /**
    * 出参Score中，只有超过FaceMatchThreshold值的结果才会返回。默认为0。
    */
    @SerializedName("FaceMatchThreshold")
    @Expose
    private Float FaceMatchThreshold;

    /**
    * 是否返回人员具体信息。
- 取值范围：0 为关闭，1 为开启。
- 默认为 0。
- 其他非0非1值默认为0。
    */
    @SerializedName("NeedPersonInfo")
    @Expose
    private Long NeedPersonInfo;

    /**
    * 是否开启图片旋转识别支持。
- 取值范围：0为不开启，1为开启。
- 默认为0。
- 本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。
- 若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
    */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
     * Get 希望搜索的人员库列表，上限60个。数组元素取值为创建人员库接口中的GroupId。 
     * @return GroupIds 希望搜索的人员库列表，上限60个。数组元素取值为创建人员库接口中的GroupId。
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 希望搜索的人员库列表，上限60个。数组元素取值为创建人员库接口中的GroupId。
     * @param GroupIds 希望搜索的人员库列表，上限60个。数组元素取值为创建人员库接口中的GroupId。
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 图片 base64 数据。
- base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- 所有格式的图片短边像素不小于64。
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Image 图片 base64 数据。
- base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- 所有格式的图片短边像素不小于64。
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片 base64 数据。
- base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- 所有格式的图片短边像素不小于64。
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Image 图片 base64 数据。
- base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- 所有格式的图片短边像素不小于64。
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 图片的 Url 。
- 对应图片 base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- 所有格式的图片短边像素不小于64。
- Url、Image必须提供一个，如果都提供，只使用 Url。
- 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
- 非腾讯云存储的Url速度和稳定性可能受一定影响。
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Url 图片的 Url 。
- 对应图片 base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- 所有格式的图片短边像素不小于64。
- Url、Image必须提供一个，如果都提供，只使用 Url。
- 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
- 非腾讯云存储的Url速度和稳定性可能受一定影响。
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片的 Url 。
- 对应图片 base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- 所有格式的图片短边像素不小于64。
- Url、Image必须提供一个，如果都提供，只使用 Url。
- 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
- 非腾讯云存储的Url速度和稳定性可能受一定影响。
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Url 图片的 Url 。
- 对应图片 base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- 所有格式的图片短边像素不小于64。
- Url、Image必须提供一个，如果都提供，只使用 Url。
- 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
- 非腾讯云存储的Url速度和稳定性可能受一定影响。
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 最多识别的人脸数目。
- 默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。
- MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。
- 例：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。 
     * @return MaxFaceNum 最多识别的人脸数目。
- 默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。
- MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。
- 例：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。
     */
    public Long getMaxFaceNum() {
        return this.MaxFaceNum;
    }

    /**
     * Set 最多识别的人脸数目。
- 默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。
- MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。
- 例：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。
     * @param MaxFaceNum 最多识别的人脸数目。
- 默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。
- MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。
- 例：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。
     */
    public void setMaxFaceNum(Long MaxFaceNum) {
        this.MaxFaceNum = MaxFaceNum;
    }

    /**
     * Get 人脸长和宽的最小尺寸，单位为像素。
- 默认为34。
- 低于34将影响搜索精度。
- 建议设置为80。 
     * @return MinFaceSize 人脸长和宽的最小尺寸，单位为像素。
- 默认为34。
- 低于34将影响搜索精度。
- 建议设置为80。
     */
    public Long getMinFaceSize() {
        return this.MinFaceSize;
    }

    /**
     * Set 人脸长和宽的最小尺寸，单位为像素。
- 默认为34。
- 低于34将影响搜索精度。
- 建议设置为80。
     * @param MinFaceSize 人脸长和宽的最小尺寸，单位为像素。
- 默认为34。
- 低于34将影响搜索精度。
- 建议设置为80。
     */
    public void setMinFaceSize(Long MinFaceSize) {
        this.MinFaceSize = MinFaceSize;
    }

    /**
     * Get 被检测到的人脸，对应最多返回的最相似人员数目。
- 默认值为5，最大值为10。  
- 例，设MaxFaceNum为3，MaxPersonNumPerGroup为5，GroupIds长度为3，则最多可能返回3*5*3=45个人员。 
     * @return MaxPersonNumPerGroup 被检测到的人脸，对应最多返回的最相似人员数目。
- 默认值为5，最大值为10。  
- 例，设MaxFaceNum为3，MaxPersonNumPerGroup为5，GroupIds长度为3，则最多可能返回3*5*3=45个人员。
     */
    public Long getMaxPersonNumPerGroup() {
        return this.MaxPersonNumPerGroup;
    }

    /**
     * Set 被检测到的人脸，对应最多返回的最相似人员数目。
- 默认值为5，最大值为10。  
- 例，设MaxFaceNum为3，MaxPersonNumPerGroup为5，GroupIds长度为3，则最多可能返回3*5*3=45个人员。
     * @param MaxPersonNumPerGroup 被检测到的人脸，对应最多返回的最相似人员数目。
- 默认值为5，最大值为10。  
- 例，设MaxFaceNum为3，MaxPersonNumPerGroup为5，GroupIds长度为3，则最多可能返回3*5*3=45个人员。
     */
    public void setMaxPersonNumPerGroup(Long MaxPersonNumPerGroup) {
        this.MaxPersonNumPerGroup = MaxPersonNumPerGroup;
    }

    /**
     * Get 图片质量控制。 
- 取值范围：
0: 不进行控制。
1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况。
2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况。
3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况。
4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题。
- 默认 0。 
- 若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。 
     * @return QualityControl 图片质量控制。 
- 取值范围：
0: 不进行控制。
1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况。
2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况。
3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况。
4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题。
- 默认 0。 
- 若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
     */
    public Long getQualityControl() {
        return this.QualityControl;
    }

    /**
     * Set 图片质量控制。 
- 取值范围：
0: 不进行控制。
1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况。
2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况。
3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况。
4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题。
- 默认 0。 
- 若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
     * @param QualityControl 图片质量控制。 
- 取值范围：
0: 不进行控制。
1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况。
2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况。
3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况。
4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题。
- 默认 0。 
- 若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
     */
    public void setQualityControl(Long QualityControl) {
        this.QualityControl = QualityControl;
    }

    /**
     * Get 出参Score中，只有超过FaceMatchThreshold值的结果才会返回。默认为0。 
     * @return FaceMatchThreshold 出参Score中，只有超过FaceMatchThreshold值的结果才会返回。默认为0。
     */
    public Float getFaceMatchThreshold() {
        return this.FaceMatchThreshold;
    }

    /**
     * Set 出参Score中，只有超过FaceMatchThreshold值的结果才会返回。默认为0。
     * @param FaceMatchThreshold 出参Score中，只有超过FaceMatchThreshold值的结果才会返回。默认为0。
     */
    public void setFaceMatchThreshold(Float FaceMatchThreshold) {
        this.FaceMatchThreshold = FaceMatchThreshold;
    }

    /**
     * Get 是否返回人员具体信息。
- 取值范围：0 为关闭，1 为开启。
- 默认为 0。
- 其他非0非1值默认为0。 
     * @return NeedPersonInfo 是否返回人员具体信息。
- 取值范围：0 为关闭，1 为开启。
- 默认为 0。
- 其他非0非1值默认为0。
     */
    public Long getNeedPersonInfo() {
        return this.NeedPersonInfo;
    }

    /**
     * Set 是否返回人员具体信息。
- 取值范围：0 为关闭，1 为开启。
- 默认为 0。
- 其他非0非1值默认为0。
     * @param NeedPersonInfo 是否返回人员具体信息。
- 取值范围：0 为关闭，1 为开启。
- 默认为 0。
- 其他非0非1值默认为0。
     */
    public void setNeedPersonInfo(Long NeedPersonInfo) {
        this.NeedPersonInfo = NeedPersonInfo;
    }

    /**
     * Get 是否开启图片旋转识别支持。
- 取值范围：0为不开启，1为开启。
- 默认为0。
- 本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。
- 若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。 
     * @return NeedRotateDetection 是否开启图片旋转识别支持。
- 取值范围：0为不开启，1为开启。
- 默认为0。
- 本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。
- 若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     */
    public Long getNeedRotateDetection() {
        return this.NeedRotateDetection;
    }

    /**
     * Set 是否开启图片旋转识别支持。
- 取值范围：0为不开启，1为开启。
- 默认为0。
- 本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。
- 若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     * @param NeedRotateDetection 是否开启图片旋转识别支持。
- 取值范围：0为不开启，1为开启。
- 默认为0。
- 本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。
- 若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     */
    public void setNeedRotateDetection(Long NeedRotateDetection) {
        this.NeedRotateDetection = NeedRotateDetection;
    }

    public SearchPersonsReturnsByGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchPersonsReturnsByGroupRequest(SearchPersonsReturnsByGroupRequest source) {
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.MaxFaceNum != null) {
            this.MaxFaceNum = new Long(source.MaxFaceNum);
        }
        if (source.MinFaceSize != null) {
            this.MinFaceSize = new Long(source.MinFaceSize);
        }
        if (source.MaxPersonNumPerGroup != null) {
            this.MaxPersonNumPerGroup = new Long(source.MaxPersonNumPerGroup);
        }
        if (source.QualityControl != null) {
            this.QualityControl = new Long(source.QualityControl);
        }
        if (source.FaceMatchThreshold != null) {
            this.FaceMatchThreshold = new Float(source.FaceMatchThreshold);
        }
        if (source.NeedPersonInfo != null) {
            this.NeedPersonInfo = new Long(source.NeedPersonInfo);
        }
        if (source.NeedRotateDetection != null) {
            this.NeedRotateDetection = new Long(source.NeedRotateDetection);
        }
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
        this.setParamSimple(map, prefix + "MaxPersonNumPerGroup", this.MaxPersonNumPerGroup);
        this.setParamSimple(map, prefix + "QualityControl", this.QualityControl);
        this.setParamSimple(map, prefix + "FaceMatchThreshold", this.FaceMatchThreshold);
        this.setParamSimple(map, prefix + "NeedPersonInfo", this.NeedPersonInfo);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);

    }
}

