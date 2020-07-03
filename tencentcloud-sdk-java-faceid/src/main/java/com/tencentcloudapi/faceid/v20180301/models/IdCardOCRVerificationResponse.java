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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdCardOCRVerificationResponse extends AbstractModel{

    /**
    * 认证结果码，收费情况如下。
收费结果码：
0: 姓名和身份证号一致
-1: 姓名和身份证号不一致
不收费结果码：
-2: 非法身份证号（长度、校验位等不正确）
-3: 非法姓名（长度、格式等不正确）
-4: 证件库服务异常
-5: 证件库中无此身份证记录
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 业务结果描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用于验证的姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用于验证的身份证号
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * OCR得到的性别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * OCR得到的民族
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * OCR得到的生日
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * OCR得到的地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 认证结果码，收费情况如下。
收费结果码：
0: 姓名和身份证号一致
-1: 姓名和身份证号不一致
不收费结果码：
-2: 非法身份证号（长度、校验位等不正确）
-3: 非法姓名（长度、格式等不正确）
-4: 证件库服务异常
-5: 证件库中无此身份证记录 
     * @return Result 认证结果码，收费情况如下。
收费结果码：
0: 姓名和身份证号一致
-1: 姓名和身份证号不一致
不收费结果码：
-2: 非法身份证号（长度、校验位等不正确）
-3: 非法姓名（长度、格式等不正确）
-4: 证件库服务异常
-5: 证件库中无此身份证记录
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 认证结果码，收费情况如下。
收费结果码：
0: 姓名和身份证号一致
-1: 姓名和身份证号不一致
不收费结果码：
-2: 非法身份证号（长度、校验位等不正确）
-3: 非法姓名（长度、格式等不正确）
-4: 证件库服务异常
-5: 证件库中无此身份证记录
     * @param Result 认证结果码，收费情况如下。
收费结果码：
0: 姓名和身份证号一致
-1: 姓名和身份证号不一致
不收费结果码：
-2: 非法身份证号（长度、校验位等不正确）
-3: 非法姓名（长度、格式等不正确）
-4: 证件库服务异常
-5: 证件库中无此身份证记录
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 业务结果描述。 
     * @return Description 业务结果描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 业务结果描述。
     * @param Description 业务结果描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用于验证的姓名 
     * @return Name 用于验证的姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用于验证的姓名
     * @param Name 用于验证的姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用于验证的身份证号 
     * @return IdCard 用于验证的身份证号
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 用于验证的身份证号
     * @param IdCard 用于验证的身份证号
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get OCR得到的性别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sex OCR得到的性别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set OCR得到的性别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sex OCR得到的性别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get OCR得到的民族
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nation OCR得到的民族
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set OCR得到的民族
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nation OCR得到的民族
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get OCR得到的生日
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Birth OCR得到的生日
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set OCR得到的生日
注意：此字段可能返回 null，表示取不到有效值。
     * @param Birth OCR得到的生日
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    /**
     * Get OCR得到的地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address OCR得到的地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set OCR得到的地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address OCR得到的地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Birth", this.Birth);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

