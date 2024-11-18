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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MLIDCardOCRResponse extends AbstractModel {

    /**
    * 身份证号
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
-9106       证件遮挡告警
-9107       模糊图片告警
    */
    @SerializedName("Warn")
    @Expose
    private Long [] Warn;

    /**
    * 证件图片
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 此字段为扩展字段。
返回字段识别结果的置信度，格式如下
{
  字段名:{
    Confidence:0.9999
  }
}
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * 证件类型
MyKad  身份证
MyPR    永居证
MyTentera   军官证
MyKAS    临时身份证
POLIS  警察证
IKAD   劳工证
MyKid 儿童卡
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 出生日期（目前该字段仅支持IKAD劳工证、MyKad 身份证）
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9104 证件PS告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
    */
    @SerializedName("WarnCardInfos")
    @Expose
    private Long [] WarnCardInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 身份证号 
     * @return ID 身份证号
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 身份证号
     * @param ID 身份证号
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 地址 
     * @return Address 地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
     * @param Address 地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 性别 
     * @return Sex 性别
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别
     * @param Sex 性别
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
-9106       证件遮挡告警
-9107       模糊图片告警 
     * @return Warn 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
-9106       证件遮挡告警
-9107       模糊图片告警
     * @deprecated
     */
    @Deprecated
    public Long [] getWarn() {
        return this.Warn;
    }

    /**
     * Set 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
-9106       证件遮挡告警
-9107       模糊图片告警
     * @param Warn 告警码
-9103	证照翻拍告警
-9102	证照复印件告警
-9106       证件遮挡告警
-9107       模糊图片告警
     * @deprecated
     */
    @Deprecated
    public void setWarn(Long [] Warn) {
        this.Warn = Warn;
    }

    /**
     * Get 证件图片 
     * @return Image 证件图片
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 证件图片
     * @param Image 证件图片
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 此字段为扩展字段。
返回字段识别结果的置信度，格式如下
{
  字段名:{
    Confidence:0.9999
  }
} 
     * @return AdvancedInfo 此字段为扩展字段。
返回字段识别结果的置信度，格式如下
{
  字段名:{
    Confidence:0.9999
  }
}
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 此字段为扩展字段。
返回字段识别结果的置信度，格式如下
{
  字段名:{
    Confidence:0.9999
  }
}
     * @param AdvancedInfo 此字段为扩展字段。
返回字段识别结果的置信度，格式如下
{
  字段名:{
    Confidence:0.9999
  }
}
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get 证件类型
MyKad  身份证
MyPR    永居证
MyTentera   军官证
MyKAS    临时身份证
POLIS  警察证
IKAD   劳工证
MyKid 儿童卡 
     * @return Type 证件类型
MyKad  身份证
MyPR    永居证
MyTentera   军官证
MyKAS    临时身份证
POLIS  警察证
IKAD   劳工证
MyKid 儿童卡
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 证件类型
MyKad  身份证
MyPR    永居证
MyTentera   军官证
MyKAS    临时身份证
POLIS  警察证
IKAD   劳工证
MyKid 儿童卡
     * @param Type 证件类型
MyKad  身份证
MyPR    永居证
MyTentera   军官证
MyKAS    临时身份证
POLIS  警察证
IKAD   劳工证
MyKid 儿童卡
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 出生日期（目前该字段仅支持IKAD劳工证、MyKad 身份证） 
     * @return Birthday 出生日期（目前该字段仅支持IKAD劳工证、MyKad 身份证）
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 出生日期（目前该字段仅支持IKAD劳工证、MyKad 身份证）
     * @param Birthday 出生日期（目前该字段仅支持IKAD劳工证、MyKad 身份证）
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9104 证件PS告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通 
     * @return WarnCardInfos 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9104 证件PS告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
     */
    public Long [] getWarnCardInfos() {
        return this.WarnCardInfos;
    }

    /**
     * Set 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9104 证件PS告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
     * @param WarnCardInfos 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9104 证件PS告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
     */
    public void setWarnCardInfos(Long [] WarnCardInfos) {
        this.WarnCardInfos = WarnCardInfos;
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

    public MLIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MLIDCardOCRResponse(MLIDCardOCRResponse source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Warn != null) {
            this.Warn = new Long[source.Warn.length];
            for (int i = 0; i < source.Warn.length; i++) {
                this.Warn[i] = new Long(source.Warn[i]);
            }
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.AdvancedInfo != null) {
            this.AdvancedInfo = new String(source.AdvancedInfo);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.WarnCardInfos != null) {
            this.WarnCardInfos = new Long[source.WarnCardInfos.length];
            for (int i = 0; i < source.WarnCardInfos.length; i++) {
                this.WarnCardInfos[i] = new Long(source.WarnCardInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamArraySimple(map, prefix + "Warn.", this.Warn);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamArraySimple(map, prefix + "WarnCardInfos.", this.WarnCardInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

