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

public class CreatePersonRequest extends AbstractModel{

    /**
    * 待加入的人员库ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 人员名称。[1，60]个字符，可修改，可重复。
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * 人员ID，单个腾讯云账号下不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 0代表未填写，1代表男性，2代表女性。
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * 人员描述字段内容，key-value。[0，60]个字符，可修改，可重复。
    */
    @SerializedName("PersonExDescriptionInfos")
    @Expose
    private PersonExDescriptionInfo [] PersonExDescriptionInfos;

    /**
    * 图片 base64 数据，base64 编码后大小不可超过5M。
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
    * 此参数用于控制判断 Image 或 Url 中图片包含的人脸，是否在人员库中已有疑似的同一人。 
如果判断为已有相同人在人员库中，则不会创建新的人员，返回疑似同一人的人员信息。 
如果判断没有，则完成创建人员。 
0: 不进行判断，无论是否有疑似同一人在库中均完成入库； 
1:较低的同一人判断要求（百一误识别率）； 
2: 一般的同一人判断要求（千一误识别率）； 
3: 较高的同一人判断要求（万一误识别率）； 
4: 很高的同一人判断要求（十万一误识别率）。 
默认 0。  
注： 要求越高，则疑似同一人的概率越小。不同要求对应的误识别率仅为参考值，您可以根据实际情况调整。
    */
    @SerializedName("UniquePersonControl")
    @Expose
    private Long UniquePersonControl;

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
    * 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
    */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
     * Get 待加入的人员库ID。 
     * @return GroupId 待加入的人员库ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 待加入的人员库ID。
     * @param GroupId 待加入的人员库ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 人员名称。[1，60]个字符，可修改，可重复。 
     * @return PersonName 人员名称。[1，60]个字符，可修改，可重复。
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 人员名称。[1，60]个字符，可修改，可重复。
     * @param PersonName 人员名称。[1，60]个字符，可修改，可重复。
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 人员ID，单个腾讯云账号下不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。 
     * @return PersonId 人员ID，单个腾讯云账号下不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID，单个腾讯云账号下不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
     * @param PersonId 人员ID，单个腾讯云账号下不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 0代表未填写，1代表男性，2代表女性。 
     * @return Gender 0代表未填写，1代表男性，2代表女性。
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 0代表未填写，1代表男性，2代表女性。
     * @param Gender 0代表未填写，1代表男性，2代表女性。
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 人员描述字段内容，key-value。[0，60]个字符，可修改，可重复。 
     * @return PersonExDescriptionInfos 人员描述字段内容，key-value。[0，60]个字符，可修改，可重复。
     */
    public PersonExDescriptionInfo [] getPersonExDescriptionInfos() {
        return this.PersonExDescriptionInfos;
    }

    /**
     * Set 人员描述字段内容，key-value。[0，60]个字符，可修改，可重复。
     * @param PersonExDescriptionInfos 人员描述字段内容，key-value。[0，60]个字符，可修改，可重复。
     */
    public void setPersonExDescriptionInfos(PersonExDescriptionInfo [] PersonExDescriptionInfos) {
        this.PersonExDescriptionInfos = PersonExDescriptionInfos;
    }

    /**
     * Get 图片 base64 数据，base64 编码后大小不可超过5M。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Image 图片 base64 数据，base64 编码后大小不可超过5M。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片 base64 数据，base64 编码后大小不可超过5M。
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Image 图片 base64 数据，base64 编码后大小不可超过5M。
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
     * Get 此参数用于控制判断 Image 或 Url 中图片包含的人脸，是否在人员库中已有疑似的同一人。 
如果判断为已有相同人在人员库中，则不会创建新的人员，返回疑似同一人的人员信息。 
如果判断没有，则完成创建人员。 
0: 不进行判断，无论是否有疑似同一人在库中均完成入库； 
1:较低的同一人判断要求（百一误识别率）； 
2: 一般的同一人判断要求（千一误识别率）； 
3: 较高的同一人判断要求（万一误识别率）； 
4: 很高的同一人判断要求（十万一误识别率）。 
默认 0。  
注： 要求越高，则疑似同一人的概率越小。不同要求对应的误识别率仅为参考值，您可以根据实际情况调整。 
     * @return UniquePersonControl 此参数用于控制判断 Image 或 Url 中图片包含的人脸，是否在人员库中已有疑似的同一人。 
如果判断为已有相同人在人员库中，则不会创建新的人员，返回疑似同一人的人员信息。 
如果判断没有，则完成创建人员。 
0: 不进行判断，无论是否有疑似同一人在库中均完成入库； 
1:较低的同一人判断要求（百一误识别率）； 
2: 一般的同一人判断要求（千一误识别率）； 
3: 较高的同一人判断要求（万一误识别率）； 
4: 很高的同一人判断要求（十万一误识别率）。 
默认 0。  
注： 要求越高，则疑似同一人的概率越小。不同要求对应的误识别率仅为参考值，您可以根据实际情况调整。
     */
    public Long getUniquePersonControl() {
        return this.UniquePersonControl;
    }

    /**
     * Set 此参数用于控制判断 Image 或 Url 中图片包含的人脸，是否在人员库中已有疑似的同一人。 
如果判断为已有相同人在人员库中，则不会创建新的人员，返回疑似同一人的人员信息。 
如果判断没有，则完成创建人员。 
0: 不进行判断，无论是否有疑似同一人在库中均完成入库； 
1:较低的同一人判断要求（百一误识别率）； 
2: 一般的同一人判断要求（千一误识别率）； 
3: 较高的同一人判断要求（万一误识别率）； 
4: 很高的同一人判断要求（十万一误识别率）。 
默认 0。  
注： 要求越高，则疑似同一人的概率越小。不同要求对应的误识别率仅为参考值，您可以根据实际情况调整。
     * @param UniquePersonControl 此参数用于控制判断 Image 或 Url 中图片包含的人脸，是否在人员库中已有疑似的同一人。 
如果判断为已有相同人在人员库中，则不会创建新的人员，返回疑似同一人的人员信息。 
如果判断没有，则完成创建人员。 
0: 不进行判断，无论是否有疑似同一人在库中均完成入库； 
1:较低的同一人判断要求（百一误识别率）； 
2: 一般的同一人判断要求（千一误识别率）； 
3: 较高的同一人判断要求（万一误识别率）； 
4: 很高的同一人判断要求（十万一误识别率）。 
默认 0。  
注： 要求越高，则疑似同一人的概率越小。不同要求对应的误识别率仅为参考值，您可以根据实际情况调整。
     */
    public void setUniquePersonControl(Long UniquePersonControl) {
        this.UniquePersonControl = UniquePersonControl;
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamArrayObj(map, prefix + "PersonExDescriptionInfos.", this.PersonExDescriptionInfos);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "UniquePersonControl", this.UniquePersonControl);
        this.setParamSimple(map, prefix + "QualityControl", this.QualityControl);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);

    }
}

