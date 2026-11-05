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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchFacesRequest extends AbstractModel {

    /**
    * <p>希望搜索的人员库列表，上限100个。</p><ul><li>数组元素取值为创建人员库接口中的GroupId。</li><li>不可同时搜索不同算法模型版本（FaceModelVersion）的人员库。</li></ul>
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>所有格式的图片短边像素不小于64。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>所有格式的图片短边像素不小于64。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。  </li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 </li><li>非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>最多识别的人脸数目。</p><ul><li>默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。 </li><li>MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。 </li><li>例如：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。</li></ul>
    */
    @SerializedName("MaxFaceNum")
    @Expose
    private Long MaxFaceNum;

    /**
    * <p>人脸长和宽的最小尺寸，单位为像素。</p><ul><li>默认为34。</li><li>低于34的人脸图片无法被识别。</li><li>建议设置为80。</li></ul>
    */
    @SerializedName("MinFaceSize")
    @Expose
    private Long MinFaceSize;

    /**
    * <p>单张被识别的人脸返回的最相似人员数量。</p><ul><li>默认值为5，最大值为100。 </li><li>例如，设MaxFaceNum为1，MaxPersonNum为8，则返回Top8相似的人员信息。</li><li>值越大，需要处理的时间越长。</li><li>建议不要超过10。</li></ul>
    */
    @SerializedName("MaxPersonNum")
    @Expose
    private Long MaxPersonNum;

    /**
    * <p>是否返回人员具体信息。</p><ul><li>取值范围：0 为关闭，1 为开启。</li><li>默认为 0。</li><li>其他非0非1值默认为0。</li></ul>
    */
    @SerializedName("NeedPersonInfo")
    @Expose
    private Long NeedPersonInfo;

    /**
    * <p>图片质量控制。 </p><ul><li>取值范围：<br>0: 不进行控制。<br>1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况。<br>2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况。<br>3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况。<br>4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题。</li><li>默认 0。 </li><li>若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。</li></ul>
    */
    @SerializedName("QualityControl")
    @Expose
    private Long QualityControl;

    /**
    * <p>出参Score中，只有超过FaceMatchThreshold值的结果才会返回。默认为0。</p>
    */
    @SerializedName("FaceMatchThreshold")
    @Expose
    private Float FaceMatchThreshold;

    /**
    * <p>是否开启图片旋转识别支持。</p><ul><li>取值范围：0为不开启，1为开启。</li><li>默认为0。</li><li>本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。</li><li>若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。</li></ul>
    */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
    * <p>是否需要对请求信息进行全包体加密。支持的加密算法:AES-256-CBC。有加密需求的用户可使用此参数。</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>加密后的密文。加密前的数据格式如下:{&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}。</p>
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
     * Get <p>希望搜索的人员库列表，上限100个。</p><ul><li>数组元素取值为创建人员库接口中的GroupId。</li><li>不可同时搜索不同算法模型版本（FaceModelVersion）的人员库。</li></ul> 
     * @return GroupIds <p>希望搜索的人员库列表，上限100个。</p><ul><li>数组元素取值为创建人员库接口中的GroupId。</li><li>不可同时搜索不同算法模型版本（FaceModelVersion）的人员库。</li></ul>
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>希望搜索的人员库列表，上限100个。</p><ul><li>数组元素取值为创建人员库接口中的GroupId。</li><li>不可同时搜索不同算法模型版本（FaceModelVersion）的人员库。</li></ul>
     * @param GroupIds <p>希望搜索的人员库列表，上限100个。</p><ul><li>数组元素取值为创建人员库接口中的GroupId。</li><li>不可同时搜索不同算法模型版本（FaceModelVersion）的人员库。</li></ul>
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>所有格式的图片短边像素不小于64。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul> 
     * @return Image <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>所有格式的图片短边像素不小于64。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>所有格式的图片短边像素不小于64。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     * @param Image <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>所有格式的图片短边像素不小于64。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>所有格式的图片短边像素不小于64。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。  </li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 </li><li>非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul> 
     * @return Url <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>所有格式的图片短边像素不小于64。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。  </li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 </li><li>非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>所有格式的图片短边像素不小于64。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。  </li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 </li><li>非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     * @param Url <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>所有格式的图片短边像素不小于64。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。  </li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 </li><li>非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>最多识别的人脸数目。</p><ul><li>默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。 </li><li>MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。 </li><li>例如：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。</li></ul> 
     * @return MaxFaceNum <p>最多识别的人脸数目。</p><ul><li>默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。 </li><li>MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。 </li><li>例如：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。</li></ul>
     */
    public Long getMaxFaceNum() {
        return this.MaxFaceNum;
    }

    /**
     * Set <p>最多识别的人脸数目。</p><ul><li>默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。 </li><li>MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。 </li><li>例如：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。</li></ul>
     * @param MaxFaceNum <p>最多识别的人脸数目。</p><ul><li>默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。 </li><li>MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。 </li><li>例如：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。</li></ul>
     */
    public void setMaxFaceNum(Long MaxFaceNum) {
        this.MaxFaceNum = MaxFaceNum;
    }

    /**
     * Get <p>人脸长和宽的最小尺寸，单位为像素。</p><ul><li>默认为34。</li><li>低于34的人脸图片无法被识别。</li><li>建议设置为80。</li></ul> 
     * @return MinFaceSize <p>人脸长和宽的最小尺寸，单位为像素。</p><ul><li>默认为34。</li><li>低于34的人脸图片无法被识别。</li><li>建议设置为80。</li></ul>
     */
    public Long getMinFaceSize() {
        return this.MinFaceSize;
    }

    /**
     * Set <p>人脸长和宽的最小尺寸，单位为像素。</p><ul><li>默认为34。</li><li>低于34的人脸图片无法被识别。</li><li>建议设置为80。</li></ul>
     * @param MinFaceSize <p>人脸长和宽的最小尺寸，单位为像素。</p><ul><li>默认为34。</li><li>低于34的人脸图片无法被识别。</li><li>建议设置为80。</li></ul>
     */
    public void setMinFaceSize(Long MinFaceSize) {
        this.MinFaceSize = MinFaceSize;
    }

    /**
     * Get <p>单张被识别的人脸返回的最相似人员数量。</p><ul><li>默认值为5，最大值为100。 </li><li>例如，设MaxFaceNum为1，MaxPersonNum为8，则返回Top8相似的人员信息。</li><li>值越大，需要处理的时间越长。</li><li>建议不要超过10。</li></ul> 
     * @return MaxPersonNum <p>单张被识别的人脸返回的最相似人员数量。</p><ul><li>默认值为5，最大值为100。 </li><li>例如，设MaxFaceNum为1，MaxPersonNum为8，则返回Top8相似的人员信息。</li><li>值越大，需要处理的时间越长。</li><li>建议不要超过10。</li></ul>
     */
    public Long getMaxPersonNum() {
        return this.MaxPersonNum;
    }

    /**
     * Set <p>单张被识别的人脸返回的最相似人员数量。</p><ul><li>默认值为5，最大值为100。 </li><li>例如，设MaxFaceNum为1，MaxPersonNum为8，则返回Top8相似的人员信息。</li><li>值越大，需要处理的时间越长。</li><li>建议不要超过10。</li></ul>
     * @param MaxPersonNum <p>单张被识别的人脸返回的最相似人员数量。</p><ul><li>默认值为5，最大值为100。 </li><li>例如，设MaxFaceNum为1，MaxPersonNum为8，则返回Top8相似的人员信息。</li><li>值越大，需要处理的时间越长。</li><li>建议不要超过10。</li></ul>
     */
    public void setMaxPersonNum(Long MaxPersonNum) {
        this.MaxPersonNum = MaxPersonNum;
    }

    /**
     * Get <p>是否返回人员具体信息。</p><ul><li>取值范围：0 为关闭，1 为开启。</li><li>默认为 0。</li><li>其他非0非1值默认为0。</li></ul> 
     * @return NeedPersonInfo <p>是否返回人员具体信息。</p><ul><li>取值范围：0 为关闭，1 为开启。</li><li>默认为 0。</li><li>其他非0非1值默认为0。</li></ul>
     */
    public Long getNeedPersonInfo() {
        return this.NeedPersonInfo;
    }

    /**
     * Set <p>是否返回人员具体信息。</p><ul><li>取值范围：0 为关闭，1 为开启。</li><li>默认为 0。</li><li>其他非0非1值默认为0。</li></ul>
     * @param NeedPersonInfo <p>是否返回人员具体信息。</p><ul><li>取值范围：0 为关闭，1 为开启。</li><li>默认为 0。</li><li>其他非0非1值默认为0。</li></ul>
     */
    public void setNeedPersonInfo(Long NeedPersonInfo) {
        this.NeedPersonInfo = NeedPersonInfo;
    }

    /**
     * Get <p>图片质量控制。 </p><ul><li>取值范围：<br>0: 不进行控制。<br>1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况。<br>2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况。<br>3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况。<br>4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题。</li><li>默认 0。 </li><li>若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。</li></ul> 
     * @return QualityControl <p>图片质量控制。 </p><ul><li>取值范围：<br>0: 不进行控制。<br>1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况。<br>2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况。<br>3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况。<br>4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题。</li><li>默认 0。 </li><li>若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。</li></ul>
     */
    public Long getQualityControl() {
        return this.QualityControl;
    }

    /**
     * Set <p>图片质量控制。 </p><ul><li>取值范围：<br>0: 不进行控制。<br>1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况。<br>2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况。<br>3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况。<br>4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题。</li><li>默认 0。 </li><li>若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。</li></ul>
     * @param QualityControl <p>图片质量控制。 </p><ul><li>取值范围：<br>0: 不进行控制。<br>1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况。<br>2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况。<br>3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况。<br>4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题。</li><li>默认 0。 </li><li>若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。</li></ul>
     */
    public void setQualityControl(Long QualityControl) {
        this.QualityControl = QualityControl;
    }

    /**
     * Get <p>出参Score中，只有超过FaceMatchThreshold值的结果才会返回。默认为0。</p> 
     * @return FaceMatchThreshold <p>出参Score中，只有超过FaceMatchThreshold值的结果才会返回。默认为0。</p>
     */
    public Float getFaceMatchThreshold() {
        return this.FaceMatchThreshold;
    }

    /**
     * Set <p>出参Score中，只有超过FaceMatchThreshold值的结果才会返回。默认为0。</p>
     * @param FaceMatchThreshold <p>出参Score中，只有超过FaceMatchThreshold值的结果才会返回。默认为0。</p>
     */
    public void setFaceMatchThreshold(Float FaceMatchThreshold) {
        this.FaceMatchThreshold = FaceMatchThreshold;
    }

    /**
     * Get <p>是否开启图片旋转识别支持。</p><ul><li>取值范围：0为不开启，1为开启。</li><li>默认为0。</li><li>本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。</li><li>若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。</li></ul> 
     * @return NeedRotateDetection <p>是否开启图片旋转识别支持。</p><ul><li>取值范围：0为不开启，1为开启。</li><li>默认为0。</li><li>本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。</li><li>若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。</li></ul>
     */
    public Long getNeedRotateDetection() {
        return this.NeedRotateDetection;
    }

    /**
     * Set <p>是否开启图片旋转识别支持。</p><ul><li>取值范围：0为不开启，1为开启。</li><li>默认为0。</li><li>本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。</li><li>若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。</li></ul>
     * @param NeedRotateDetection <p>是否开启图片旋转识别支持。</p><ul><li>取值范围：0为不开启，1为开启。</li><li>默认为0。</li><li>本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。</li><li>若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。</li></ul>
     */
    public void setNeedRotateDetection(Long NeedRotateDetection) {
        this.NeedRotateDetection = NeedRotateDetection;
    }

    /**
     * Get <p>是否需要对请求信息进行全包体加密。支持的加密算法:AES-256-CBC。有加密需求的用户可使用此参数。</p> 
     * @return Encryption <p>是否需要对请求信息进行全包体加密。支持的加密算法:AES-256-CBC。有加密需求的用户可使用此参数。</p>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>是否需要对请求信息进行全包体加密。支持的加密算法:AES-256-CBC。有加密需求的用户可使用此参数。</p>
     * @param Encryption <p>是否需要对请求信息进行全包体加密。支持的加密算法:AES-256-CBC。有加密需求的用户可使用此参数。</p>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>加密后的密文。加密前的数据格式如下:{&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}。</p> 
     * @return EncryptedBody <p>加密后的密文。加密前的数据格式如下:{&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}。</p>
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set <p>加密后的密文。加密前的数据格式如下:{&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}。</p>
     * @param EncryptedBody <p>加密后的密文。加密前的数据格式如下:{&quot;Url&quot;:&quot;<strong>&quot;,&quot;Image&quot;:&quot;</strong>&quot;}。</p>
     */
    public void setEncryptedBody(String EncryptedBody) {
        this.EncryptedBody = EncryptedBody;
    }

    public SearchFacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFacesRequest(SearchFacesRequest source) {
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
        if (source.MaxPersonNum != null) {
            this.MaxPersonNum = new Long(source.MaxPersonNum);
        }
        if (source.NeedPersonInfo != null) {
            this.NeedPersonInfo = new Long(source.NeedPersonInfo);
        }
        if (source.QualityControl != null) {
            this.QualityControl = new Long(source.QualityControl);
        }
        if (source.FaceMatchThreshold != null) {
            this.FaceMatchThreshold = new Float(source.FaceMatchThreshold);
        }
        if (source.NeedRotateDetection != null) {
            this.NeedRotateDetection = new Long(source.NeedRotateDetection);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.EncryptedBody != null) {
            this.EncryptedBody = new String(source.EncryptedBody);
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
        this.setParamSimple(map, prefix + "MaxPersonNum", this.MaxPersonNum);
        this.setParamSimple(map, prefix + "NeedPersonInfo", this.NeedPersonInfo);
        this.setParamSimple(map, prefix + "QualityControl", this.QualityControl);
        this.setParamSimple(map, prefix + "FaceMatchThreshold", this.FaceMatchThreshold);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);

    }
}

