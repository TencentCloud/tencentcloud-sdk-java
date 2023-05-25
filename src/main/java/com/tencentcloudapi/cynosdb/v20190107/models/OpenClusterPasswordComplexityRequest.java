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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenClusterPasswordComplexityRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 密码长度
    */
    @SerializedName("ValidatePasswordLength")
    @Expose
    private Long ValidatePasswordLength;

    /**
    * 大小写字符个数
    */
    @SerializedName("ValidatePasswordMixedCaseCount")
    @Expose
    private Long ValidatePasswordMixedCaseCount;

    /**
    * 特殊字符个数
    */
    @SerializedName("ValidatePasswordSpecialCharCount")
    @Expose
    private Long ValidatePasswordSpecialCharCount;

    /**
    * 数字个数
    */
    @SerializedName("ValidatePasswordNumberCount")
    @Expose
    private Long ValidatePasswordNumberCount;

    /**
    * 密码强度（"MEDIUM", "STRONG"）
    */
    @SerializedName("ValidatePasswordPolicy")
    @Expose
    private String ValidatePasswordPolicy;

    /**
    * 数据字典
    */
    @SerializedName("ValidatePasswordDictionary")
    @Expose
    private String [] ValidatePasswordDictionary;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 密码长度 
     * @return ValidatePasswordLength 密码长度
     */
    public Long getValidatePasswordLength() {
        return this.ValidatePasswordLength;
    }

    /**
     * Set 密码长度
     * @param ValidatePasswordLength 密码长度
     */
    public void setValidatePasswordLength(Long ValidatePasswordLength) {
        this.ValidatePasswordLength = ValidatePasswordLength;
    }

    /**
     * Get 大小写字符个数 
     * @return ValidatePasswordMixedCaseCount 大小写字符个数
     */
    public Long getValidatePasswordMixedCaseCount() {
        return this.ValidatePasswordMixedCaseCount;
    }

    /**
     * Set 大小写字符个数
     * @param ValidatePasswordMixedCaseCount 大小写字符个数
     */
    public void setValidatePasswordMixedCaseCount(Long ValidatePasswordMixedCaseCount) {
        this.ValidatePasswordMixedCaseCount = ValidatePasswordMixedCaseCount;
    }

    /**
     * Get 特殊字符个数 
     * @return ValidatePasswordSpecialCharCount 特殊字符个数
     */
    public Long getValidatePasswordSpecialCharCount() {
        return this.ValidatePasswordSpecialCharCount;
    }

    /**
     * Set 特殊字符个数
     * @param ValidatePasswordSpecialCharCount 特殊字符个数
     */
    public void setValidatePasswordSpecialCharCount(Long ValidatePasswordSpecialCharCount) {
        this.ValidatePasswordSpecialCharCount = ValidatePasswordSpecialCharCount;
    }

    /**
     * Get 数字个数 
     * @return ValidatePasswordNumberCount 数字个数
     */
    public Long getValidatePasswordNumberCount() {
        return this.ValidatePasswordNumberCount;
    }

    /**
     * Set 数字个数
     * @param ValidatePasswordNumberCount 数字个数
     */
    public void setValidatePasswordNumberCount(Long ValidatePasswordNumberCount) {
        this.ValidatePasswordNumberCount = ValidatePasswordNumberCount;
    }

    /**
     * Get 密码强度（"MEDIUM", "STRONG"） 
     * @return ValidatePasswordPolicy 密码强度（"MEDIUM", "STRONG"）
     */
    public String getValidatePasswordPolicy() {
        return this.ValidatePasswordPolicy;
    }

    /**
     * Set 密码强度（"MEDIUM", "STRONG"）
     * @param ValidatePasswordPolicy 密码强度（"MEDIUM", "STRONG"）
     */
    public void setValidatePasswordPolicy(String ValidatePasswordPolicy) {
        this.ValidatePasswordPolicy = ValidatePasswordPolicy;
    }

    /**
     * Get 数据字典 
     * @return ValidatePasswordDictionary 数据字典
     */
    public String [] getValidatePasswordDictionary() {
        return this.ValidatePasswordDictionary;
    }

    /**
     * Set 数据字典
     * @param ValidatePasswordDictionary 数据字典
     */
    public void setValidatePasswordDictionary(String [] ValidatePasswordDictionary) {
        this.ValidatePasswordDictionary = ValidatePasswordDictionary;
    }

    public OpenClusterPasswordComplexityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenClusterPasswordComplexityRequest(OpenClusterPasswordComplexityRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ValidatePasswordLength != null) {
            this.ValidatePasswordLength = new Long(source.ValidatePasswordLength);
        }
        if (source.ValidatePasswordMixedCaseCount != null) {
            this.ValidatePasswordMixedCaseCount = new Long(source.ValidatePasswordMixedCaseCount);
        }
        if (source.ValidatePasswordSpecialCharCount != null) {
            this.ValidatePasswordSpecialCharCount = new Long(source.ValidatePasswordSpecialCharCount);
        }
        if (source.ValidatePasswordNumberCount != null) {
            this.ValidatePasswordNumberCount = new Long(source.ValidatePasswordNumberCount);
        }
        if (source.ValidatePasswordPolicy != null) {
            this.ValidatePasswordPolicy = new String(source.ValidatePasswordPolicy);
        }
        if (source.ValidatePasswordDictionary != null) {
            this.ValidatePasswordDictionary = new String[source.ValidatePasswordDictionary.length];
            for (int i = 0; i < source.ValidatePasswordDictionary.length; i++) {
                this.ValidatePasswordDictionary[i] = new String(source.ValidatePasswordDictionary[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ValidatePasswordLength", this.ValidatePasswordLength);
        this.setParamSimple(map, prefix + "ValidatePasswordMixedCaseCount", this.ValidatePasswordMixedCaseCount);
        this.setParamSimple(map, prefix + "ValidatePasswordSpecialCharCount", this.ValidatePasswordSpecialCharCount);
        this.setParamSimple(map, prefix + "ValidatePasswordNumberCount", this.ValidatePasswordNumberCount);
        this.setParamSimple(map, prefix + "ValidatePasswordPolicy", this.ValidatePasswordPolicy);
        this.setParamArraySimple(map, prefix + "ValidatePasswordDictionary.", this.ValidatePasswordDictionary);

    }
}

