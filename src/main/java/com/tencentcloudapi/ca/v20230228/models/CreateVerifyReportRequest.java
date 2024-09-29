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
package com.tencentcloudapi.ca.v20230228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVerifyReportRequest extends AbstractModel {

    /**
    * 申请者类型 1:个人，2:企业
    */
    @SerializedName("ApplyCustomerType")
    @Expose
    private String ApplyCustomerType;

    /**
    * 申请企业 or 自然人名称
    */
    @SerializedName("ApplyCustomerName")
    @Expose
    private String ApplyCustomerName;

    /**
    * 验签申请经办人姓名
    */
    @SerializedName("ApplyName")
    @Expose
    private String ApplyName;

    /**
    * 验签申请经办人电话
    */
    @SerializedName("ApplyMobile")
    @Expose
    private String ApplyMobile;

    /**
    * 验签文件id
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 验签申请经办人邮箱
    */
    @SerializedName("ApplyEmail")
    @Expose
    private String ApplyEmail;

    /**
     * Get 申请者类型 1:个人，2:企业 
     * @return ApplyCustomerType 申请者类型 1:个人，2:企业
     */
    public String getApplyCustomerType() {
        return this.ApplyCustomerType;
    }

    /**
     * Set 申请者类型 1:个人，2:企业
     * @param ApplyCustomerType 申请者类型 1:个人，2:企业
     */
    public void setApplyCustomerType(String ApplyCustomerType) {
        this.ApplyCustomerType = ApplyCustomerType;
    }

    /**
     * Get 申请企业 or 自然人名称 
     * @return ApplyCustomerName 申请企业 or 自然人名称
     */
    public String getApplyCustomerName() {
        return this.ApplyCustomerName;
    }

    /**
     * Set 申请企业 or 自然人名称
     * @param ApplyCustomerName 申请企业 or 自然人名称
     */
    public void setApplyCustomerName(String ApplyCustomerName) {
        this.ApplyCustomerName = ApplyCustomerName;
    }

    /**
     * Get 验签申请经办人姓名 
     * @return ApplyName 验签申请经办人姓名
     */
    public String getApplyName() {
        return this.ApplyName;
    }

    /**
     * Set 验签申请经办人姓名
     * @param ApplyName 验签申请经办人姓名
     */
    public void setApplyName(String ApplyName) {
        this.ApplyName = ApplyName;
    }

    /**
     * Get 验签申请经办人电话 
     * @return ApplyMobile 验签申请经办人电话
     */
    public String getApplyMobile() {
        return this.ApplyMobile;
    }

    /**
     * Set 验签申请经办人电话
     * @param ApplyMobile 验签申请经办人电话
     */
    public void setApplyMobile(String ApplyMobile) {
        this.ApplyMobile = ApplyMobile;
    }

    /**
     * Get 验签文件id 
     * @return FileId 验签文件id
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 验签文件id
     * @param FileId 验签文件id
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 验签申请经办人邮箱 
     * @return ApplyEmail 验签申请经办人邮箱
     */
    public String getApplyEmail() {
        return this.ApplyEmail;
    }

    /**
     * Set 验签申请经办人邮箱
     * @param ApplyEmail 验签申请经办人邮箱
     */
    public void setApplyEmail(String ApplyEmail) {
        this.ApplyEmail = ApplyEmail;
    }

    public CreateVerifyReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVerifyReportRequest(CreateVerifyReportRequest source) {
        if (source.ApplyCustomerType != null) {
            this.ApplyCustomerType = new String(source.ApplyCustomerType);
        }
        if (source.ApplyCustomerName != null) {
            this.ApplyCustomerName = new String(source.ApplyCustomerName);
        }
        if (source.ApplyName != null) {
            this.ApplyName = new String(source.ApplyName);
        }
        if (source.ApplyMobile != null) {
            this.ApplyMobile = new String(source.ApplyMobile);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.ApplyEmail != null) {
            this.ApplyEmail = new String(source.ApplyEmail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplyCustomerType", this.ApplyCustomerType);
        this.setParamSimple(map, prefix + "ApplyCustomerName", this.ApplyCustomerName);
        this.setParamSimple(map, prefix + "ApplyName", this.ApplyName);
        this.setParamSimple(map, prefix + "ApplyMobile", this.ApplyMobile);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "ApplyEmail", this.ApplyEmail);

    }
}

