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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MainlandPermitOCRResponse extends AbstractModel {

    /**
    * <p>中文姓名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>英文姓名</p>
    */
    @SerializedName("EnglishName")
    @Expose
    private String EnglishName;

    /**
    * <p>性别</p>
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>出生日期</p>
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * <p>签发机关</p>
    */
    @SerializedName("IssueAuthority")
    @Expose
    private String IssueAuthority;

    /**
    * <p>有效期限</p>
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * <p>证件号</p>
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * <p>签发地点</p>
    */
    @SerializedName("IssueAddress")
    @Expose
    private String IssueAddress;

    /**
    * <p>签发次数</p>
    */
    @SerializedName("IssueNumber")
    @Expose
    private String IssueNumber;

    /**
    * <p>证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证、往来港澳通行证。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>RetProfile为True时返回头像字段， Base64编码</p>
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * <p>国籍</p>
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * <p>背面字段信息</p>
    */
    @SerializedName("MainlandTravelPermitBackInfos")
    @Expose
    private MainlandTravelPermitBackInfos MainlandTravelPermitBackInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>中文姓名</p> 
     * @return Name <p>中文姓名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>中文姓名</p>
     * @param Name <p>中文姓名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>英文姓名</p> 
     * @return EnglishName <p>英文姓名</p>
     */
    public String getEnglishName() {
        return this.EnglishName;
    }

    /**
     * Set <p>英文姓名</p>
     * @param EnglishName <p>英文姓名</p>
     */
    public void setEnglishName(String EnglishName) {
        this.EnglishName = EnglishName;
    }

    /**
     * Get <p>性别</p> 
     * @return Sex <p>性别</p>
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>性别</p>
     * @param Sex <p>性别</p>
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>出生日期</p> 
     * @return Birthday <p>出生日期</p>
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set <p>出生日期</p>
     * @param Birthday <p>出生日期</p>
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get <p>签发机关</p> 
     * @return IssueAuthority <p>签发机关</p>
     */
    public String getIssueAuthority() {
        return this.IssueAuthority;
    }

    /**
     * Set <p>签发机关</p>
     * @param IssueAuthority <p>签发机关</p>
     */
    public void setIssueAuthority(String IssueAuthority) {
        this.IssueAuthority = IssueAuthority;
    }

    /**
     * Get <p>有效期限</p> 
     * @return ValidDate <p>有效期限</p>
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set <p>有效期限</p>
     * @param ValidDate <p>有效期限</p>
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get <p>证件号</p> 
     * @return Number <p>证件号</p>
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set <p>证件号</p>
     * @param Number <p>证件号</p>
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get <p>签发地点</p> 
     * @return IssueAddress <p>签发地点</p>
     */
    public String getIssueAddress() {
        return this.IssueAddress;
    }

    /**
     * Set <p>签发地点</p>
     * @param IssueAddress <p>签发地点</p>
     */
    public void setIssueAddress(String IssueAddress) {
        this.IssueAddress = IssueAddress;
    }

    /**
     * Get <p>签发次数</p> 
     * @return IssueNumber <p>签发次数</p>
     */
    public String getIssueNumber() {
        return this.IssueNumber;
    }

    /**
     * Set <p>签发次数</p>
     * @param IssueNumber <p>签发次数</p>
     */
    public void setIssueNumber(String IssueNumber) {
        this.IssueNumber = IssueNumber;
    }

    /**
     * Get <p>证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证、往来港澳通行证。</p> 
     * @return Type <p>证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证、往来港澳通行证。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证、往来港澳通行证。</p>
     * @param Type <p>证件类别， 如：台湾居民来往大陆通行证、港澳居民来往内地通行证、往来港澳通行证。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>RetProfile为True时返回头像字段， Base64编码</p> 
     * @return Profile <p>RetProfile为True时返回头像字段， Base64编码</p>
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set <p>RetProfile为True时返回头像字段， Base64编码</p>
     * @param Profile <p>RetProfile为True时返回头像字段， Base64编码</p>
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get <p>国籍</p> 
     * @return Nationality <p>国籍</p>
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set <p>国籍</p>
     * @param Nationality <p>国籍</p>
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get <p>背面字段信息</p> 
     * @return MainlandTravelPermitBackInfos <p>背面字段信息</p>
     */
    public MainlandTravelPermitBackInfos getMainlandTravelPermitBackInfos() {
        return this.MainlandTravelPermitBackInfos;
    }

    /**
     * Set <p>背面字段信息</p>
     * @param MainlandTravelPermitBackInfos <p>背面字段信息</p>
     */
    public void setMainlandTravelPermitBackInfos(MainlandTravelPermitBackInfos MainlandTravelPermitBackInfos) {
        this.MainlandTravelPermitBackInfos = MainlandTravelPermitBackInfos;
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

    public MainlandPermitOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MainlandPermitOCRResponse(MainlandPermitOCRResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EnglishName != null) {
            this.EnglishName = new String(source.EnglishName);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.IssueAuthority != null) {
            this.IssueAuthority = new String(source.IssueAuthority);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new String(source.ValidDate);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.IssueAddress != null) {
            this.IssueAddress = new String(source.IssueAddress);
        }
        if (source.IssueNumber != null) {
            this.IssueNumber = new String(source.IssueNumber);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.MainlandTravelPermitBackInfos != null) {
            this.MainlandTravelPermitBackInfos = new MainlandTravelPermitBackInfos(source.MainlandTravelPermitBackInfos);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnglishName", this.EnglishName);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "IssueAuthority", this.IssueAuthority);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "IssueAddress", this.IssueAddress);
        this.setParamSimple(map, prefix + "IssueNumber", this.IssueNumber);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamObj(map, prefix + "MainlandTravelPermitBackInfos.", this.MainlandTravelPermitBackInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

