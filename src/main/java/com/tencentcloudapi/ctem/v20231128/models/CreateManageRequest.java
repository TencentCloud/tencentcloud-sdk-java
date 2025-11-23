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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateManageRequest extends AbstractModel {

    /**
    * 企业Id
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * Url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Screenshot
    */
    @SerializedName("Screenshot")
    @Expose
    private String Screenshot;

    /**
    * 状态码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 子公司
    */
    @SerializedName("EnterpriseUid")
    @Expose
    private String EnterpriseUid;

    /**
     * Get 企业Id 
     * @return CustomerId 企业Id
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业Id
     * @param CustomerId 企业Id
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get Url 
     * @return Url Url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Url
     * @param Url Url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 标题 
     * @return Title 标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
     * @param Title 标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Screenshot 
     * @return Screenshot Screenshot
     */
    public String getScreenshot() {
        return this.Screenshot;
    }

    /**
     * Set Screenshot
     * @param Screenshot Screenshot
     */
    public void setScreenshot(String Screenshot) {
        this.Screenshot = Screenshot;
    }

    /**
     * Get 状态码 
     * @return Code 状态码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 状态码
     * @param Code 状态码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 子公司 
     * @return EnterpriseUid 子公司
     */
    public String getEnterpriseUid() {
        return this.EnterpriseUid;
    }

    /**
     * Set 子公司
     * @param EnterpriseUid 子公司
     */
    public void setEnterpriseUid(String EnterpriseUid) {
        this.EnterpriseUid = EnterpriseUid;
    }

    public CreateManageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateManageRequest(CreateManageRequest source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Screenshot != null) {
            this.Screenshot = new String(source.Screenshot);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.EnterpriseUid != null) {
            this.EnterpriseUid = new String(source.EnterpriseUid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Screenshot", this.Screenshot);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "EnterpriseUid", this.EnterpriseUid);

    }
}

