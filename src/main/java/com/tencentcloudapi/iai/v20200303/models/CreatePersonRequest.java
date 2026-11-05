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

public class CreatePersonRequest extends AbstractModel {

    /**
    * <p>待加入的人员库ID，取值为创建人员库接口中的GroupId。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>人员名称。[1，60]个字符，可修改，可重复。</p>
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * <p>人员ID。</p><ul><li>单个腾讯云账号下不可修改，不可重复。</li><li>支持英文、数字、-%@#&amp;_，长度限制64B。</li></ul>
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * <p>性别。</p><ul><li>取值范围：0代表未填写，1代表男性，2代表女性。</li></ul>
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * <p>人员描述字段内容，key-value。[0，60]个字符，可修改，可重复。</p>
    */
    @SerializedName("PersonExDescriptionInfos")
    @Expose
    private PersonExDescriptionInfo [] PersonExDescriptionInfos;

    /**
    * <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。所有格式的图片短边像素不小于64。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。所有格式的图片短边像素不小于64。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。  </li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 </li><li>非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>此参数用于控制判断 Image 或 Url 中图片包含的人脸，是否在人员库中已有疑似的同一人。 </p><ul><li>如果判断为已有相同人在人员库中，则不会创建新的人员，返回疑似同一人的人员信息。 </li><li>如果判断没有，则完成创建人员。 </li><li>取值范围：<br>0: 不进行判断，无论是否有疑似同一人在库中均完成入库；<br>1:较低的同一人判断要求（百一误识别率）；<br>2: 一般的同一人判断要求（千一误识别率）；<br>3: 较高的同一人判断要求（万一误识别率）；<br>4: 很高的同一人判断要求（十万一误识别率）。 </li><li>默认 0。  </li><li>注： 要求越高，则疑似同一人的概率越小。不同要求对应的误识别率仅为参考值，您可以根据实际情况调整。</li></ul>
    */
    @SerializedName("UniquePersonControl")
    @Expose
    private Long UniquePersonControl;

    /**
    * <p>图片质量控制。 </p><ul><li>取值范围：<br>0: 不进行控制；<br>1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况；<br>2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况；<br>3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况；<br>4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题； </li><li>默认 0。 </li><li>若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。</li></ul>
    */
    @SerializedName("QualityControl")
    @Expose
    private Long QualityControl;

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
     * Get <p>待加入的人员库ID，取值为创建人员库接口中的GroupId。</p> 
     * @return GroupId <p>待加入的人员库ID，取值为创建人员库接口中的GroupId。</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>待加入的人员库ID，取值为创建人员库接口中的GroupId。</p>
     * @param GroupId <p>待加入的人员库ID，取值为创建人员库接口中的GroupId。</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>人员名称。[1，60]个字符，可修改，可重复。</p> 
     * @return PersonName <p>人员名称。[1，60]个字符，可修改，可重复。</p>
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set <p>人员名称。[1，60]个字符，可修改，可重复。</p>
     * @param PersonName <p>人员名称。[1，60]个字符，可修改，可重复。</p>
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get <p>人员ID。</p><ul><li>单个腾讯云账号下不可修改，不可重复。</li><li>支持英文、数字、-%@#&amp;_，长度限制64B。</li></ul> 
     * @return PersonId <p>人员ID。</p><ul><li>单个腾讯云账号下不可修改，不可重复。</li><li>支持英文、数字、-%@#&amp;_，长度限制64B。</li></ul>
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set <p>人员ID。</p><ul><li>单个腾讯云账号下不可修改，不可重复。</li><li>支持英文、数字、-%@#&amp;_，长度限制64B。</li></ul>
     * @param PersonId <p>人员ID。</p><ul><li>单个腾讯云账号下不可修改，不可重复。</li><li>支持英文、数字、-%@#&amp;_，长度限制64B。</li></ul>
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get <p>性别。</p><ul><li>取值范围：0代表未填写，1代表男性，2代表女性。</li></ul> 
     * @return Gender <p>性别。</p><ul><li>取值范围：0代表未填写，1代表男性，2代表女性。</li></ul>
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set <p>性别。</p><ul><li>取值范围：0代表未填写，1代表男性，2代表女性。</li></ul>
     * @param Gender <p>性别。</p><ul><li>取值范围：0代表未填写，1代表男性，2代表女性。</li></ul>
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>人员描述字段内容，key-value。[0，60]个字符，可修改，可重复。</p> 
     * @return PersonExDescriptionInfos <p>人员描述字段内容，key-value。[0，60]个字符，可修改，可重复。</p>
     */
    public PersonExDescriptionInfo [] getPersonExDescriptionInfos() {
        return this.PersonExDescriptionInfos;
    }

    /**
     * Set <p>人员描述字段内容，key-value。[0，60]个字符，可修改，可重复。</p>
     * @param PersonExDescriptionInfos <p>人员描述字段内容，key-value。[0，60]个字符，可修改，可重复。</p>
     */
    public void setPersonExDescriptionInfos(PersonExDescriptionInfo [] PersonExDescriptionInfos) {
        this.PersonExDescriptionInfos = PersonExDescriptionInfos;
    }

    /**
     * Get <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。所有格式的图片短边像素不小于64。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul> 
     * @return Image <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。所有格式的图片短边像素不小于64。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。所有格式的图片短边像素不小于64。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     * @param Image <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。所有格式的图片短边像素不小于64。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。所有格式的图片短边像素不小于64。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。  </li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 </li><li>非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul> 
     * @return Url <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。所有格式的图片短边像素不小于64。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。  </li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 </li><li>非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。所有格式的图片短边像素不小于64。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。  </li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 </li><li>非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     * @param Url <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。所有格式的图片短边像素不小于64。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。  </li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 </li><li>非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>此参数用于控制判断 Image 或 Url 中图片包含的人脸，是否在人员库中已有疑似的同一人。 </p><ul><li>如果判断为已有相同人在人员库中，则不会创建新的人员，返回疑似同一人的人员信息。 </li><li>如果判断没有，则完成创建人员。 </li><li>取值范围：<br>0: 不进行判断，无论是否有疑似同一人在库中均完成入库；<br>1:较低的同一人判断要求（百一误识别率）；<br>2: 一般的同一人判断要求（千一误识别率）；<br>3: 较高的同一人判断要求（万一误识别率）；<br>4: 很高的同一人判断要求（十万一误识别率）。 </li><li>默认 0。  </li><li>注： 要求越高，则疑似同一人的概率越小。不同要求对应的误识别率仅为参考值，您可以根据实际情况调整。</li></ul> 
     * @return UniquePersonControl <p>此参数用于控制判断 Image 或 Url 中图片包含的人脸，是否在人员库中已有疑似的同一人。 </p><ul><li>如果判断为已有相同人在人员库中，则不会创建新的人员，返回疑似同一人的人员信息。 </li><li>如果判断没有，则完成创建人员。 </li><li>取值范围：<br>0: 不进行判断，无论是否有疑似同一人在库中均完成入库；<br>1:较低的同一人判断要求（百一误识别率）；<br>2: 一般的同一人判断要求（千一误识别率）；<br>3: 较高的同一人判断要求（万一误识别率）；<br>4: 很高的同一人判断要求（十万一误识别率）。 </li><li>默认 0。  </li><li>注： 要求越高，则疑似同一人的概率越小。不同要求对应的误识别率仅为参考值，您可以根据实际情况调整。</li></ul>
     */
    public Long getUniquePersonControl() {
        return this.UniquePersonControl;
    }

    /**
     * Set <p>此参数用于控制判断 Image 或 Url 中图片包含的人脸，是否在人员库中已有疑似的同一人。 </p><ul><li>如果判断为已有相同人在人员库中，则不会创建新的人员，返回疑似同一人的人员信息。 </li><li>如果判断没有，则完成创建人员。 </li><li>取值范围：<br>0: 不进行判断，无论是否有疑似同一人在库中均完成入库；<br>1:较低的同一人判断要求（百一误识别率）；<br>2: 一般的同一人判断要求（千一误识别率）；<br>3: 较高的同一人判断要求（万一误识别率）；<br>4: 很高的同一人判断要求（十万一误识别率）。 </li><li>默认 0。  </li><li>注： 要求越高，则疑似同一人的概率越小。不同要求对应的误识别率仅为参考值，您可以根据实际情况调整。</li></ul>
     * @param UniquePersonControl <p>此参数用于控制判断 Image 或 Url 中图片包含的人脸，是否在人员库中已有疑似的同一人。 </p><ul><li>如果判断为已有相同人在人员库中，则不会创建新的人员，返回疑似同一人的人员信息。 </li><li>如果判断没有，则完成创建人员。 </li><li>取值范围：<br>0: 不进行判断，无论是否有疑似同一人在库中均完成入库；<br>1:较低的同一人判断要求（百一误识别率）；<br>2: 一般的同一人判断要求（千一误识别率）；<br>3: 较高的同一人判断要求（万一误识别率）；<br>4: 很高的同一人判断要求（十万一误识别率）。 </li><li>默认 0。  </li><li>注： 要求越高，则疑似同一人的概率越小。不同要求对应的误识别率仅为参考值，您可以根据实际情况调整。</li></ul>
     */
    public void setUniquePersonControl(Long UniquePersonControl) {
        this.UniquePersonControl = UniquePersonControl;
    }

    /**
     * Get <p>图片质量控制。 </p><ul><li>取值范围：<br>0: 不进行控制；<br>1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况；<br>2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况；<br>3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况；<br>4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题； </li><li>默认 0。 </li><li>若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。</li></ul> 
     * @return QualityControl <p>图片质量控制。 </p><ul><li>取值范围：<br>0: 不进行控制；<br>1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况；<br>2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况；<br>3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况；<br>4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题； </li><li>默认 0。 </li><li>若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。</li></ul>
     */
    public Long getQualityControl() {
        return this.QualityControl;
    }

    /**
     * Set <p>图片质量控制。 </p><ul><li>取值范围：<br>0: 不进行控制；<br>1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况；<br>2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况；<br>3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况；<br>4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题； </li><li>默认 0。 </li><li>若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。</li></ul>
     * @param QualityControl <p>图片质量控制。 </p><ul><li>取值范围：<br>0: 不进行控制；<br>1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况；<br>2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况；<br>3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况；<br>4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题； </li><li>默认 0。 </li><li>若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。</li></ul>
     */
    public void setQualityControl(Long QualityControl) {
        this.QualityControl = QualityControl;
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

    public CreatePersonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePersonRequest(CreatePersonRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.PersonExDescriptionInfos != null) {
            this.PersonExDescriptionInfos = new PersonExDescriptionInfo[source.PersonExDescriptionInfos.length];
            for (int i = 0; i < source.PersonExDescriptionInfos.length; i++) {
                this.PersonExDescriptionInfos[i] = new PersonExDescriptionInfo(source.PersonExDescriptionInfos[i]);
            }
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.UniquePersonControl != null) {
            this.UniquePersonControl = new Long(source.UniquePersonControl);
        }
        if (source.QualityControl != null) {
            this.QualityControl = new Long(source.QualityControl);
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
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);

    }
}

